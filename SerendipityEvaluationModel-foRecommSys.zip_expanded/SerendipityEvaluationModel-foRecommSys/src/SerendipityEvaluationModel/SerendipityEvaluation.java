package SerendipityEvaluationModel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import SerendipityEvaluationModel.SerendipityEvaluation.recommendList;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class SerendipityEvaluation
{
	static List<Vertex> Graph=new ArrayList<>();
	static List<Vertex> GraphN;
	static List<Vertex> Graph2=new ArrayList<>();
	static Map<Integer,Vertex> Graph2M;
	static Map<Integer,Vertex> Graph2N;
	static List<Vertex> Graph3=new ArrayList<>();
	static List<Integer> Vps=new ArrayList<>();
	static Map<String,Integer> nameToIndex=new HashMap<>();
	static Sheet sheetiv;
	static List<RecommendData> pairs = new ArrayList<>();
	static List<populInfo> popInf = new ArrayList<>();
	static List<recommendList> recommListForRecommSys = new ArrayList<>();
	static int pathIdx;
	static int N;
	static double recommendSer;
	static double diversity; // how diverse the recommender system?
	static List<Vertex> RecSub = new ArrayList<>(); //store subjects that recommender system recommends only
	
    static int countIndex=0;
    static String initial="";
    
    
	
	static class recommendList{
		String subjectName;
		String recommendingSubjects;
		
		public recommendList(String subjectName, String recommendingSubjects) {
			this.subjectName = subjectName;
			this.setRecommendingSubjects(recommendingSubjects);
		}
		
		public String getSubjectName() {
			return subjectName;
		}
		
		public String getRecommendingList() {
			return recommendingSubjects;
		}
		
		public void setSubjectName(String subjectName) {
			this.subjectName = subjectName;
		}
		
		public void setRecommendingSubjects(String recommendingSubjects) {
			this.recommendingSubjects = recommendingSubjects;
		}

		public String getRecommendingSubjects() {
			return recommendingSubjects;
		}
		
		
		
	}
	
	static class populInfo {
		private Vertex v;
		private double pop;
		
		public populInfo(Vertex v, double pop) {
			this.v = v;
			this.pop = pop;
		}
		
		public Vertex getV() {
			return v;
		}
		
		public double getPop() {
			return pop;
		}
		
		
		public void setPop(double newPop) {
			this.pop = newPop;
		}
	}

	static class RecommendData {
	    public Vertex x;
	    public Vertex y;
	    private double unexp;
	    private double interest;

	    public RecommendData(Vertex x, Vertex y, double unexp, double interest) {
	        this.x = x;
	        this.y = y;
	        this.unexp = unexp;
	        this.interest = interest;
	    }
	    
	    public double getInterest() {
	    	return interest;
	    }
	    
	    public double getUnexp() {
	    	return unexp;
	    }

	    public Vertex getX(){
	        return x;
	    }

	    public Vertex getY(){
	        return y;
	    }
	}
	static class Vertex
	{
		int index,domain,level;
		String name;
		Set<Integer> link;

		public Vertex(int index,String name)
		{
			this.index=index;
			this.name=name;
			this.link=new HashSet<>();
		}

		public int getIndex()
		{
			return index;
		}
	}

	static class Context
	{
		int v;
		Iterator<Integer> it;

		public Context(Map<Integer,Vertex> graph,int v)
		{
			this.v=v;
			this.it=graph.get(v).link.iterator();
		}
	}

	/**
	 * The main function of the realization, which initializes graph model and prepares to evaluate serendipity value.
	 * @param args Command-line parameter
	 * @throws IOException 
	 * @throws NumberFormatException 
	 * @throws NoPathException 
	 */
	public static void main(String[] args) throws NumberFormatException,IOException
	{
		Workbook workbook=new SXSSFWorkbook();
		sheetiv=workbook.createSheet("InterestVal");
		createHeader(sheetiv,"Node","InterestVal", "Normalized");
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(args[0]),"UTF-8"));
		String line=null;
		List<String> triple=new ArrayList<>();
		int lv=0,root=getIndex(":ROOT");
		Graph.get(root).level=0;
		while((line=br.readLine())!=null)
		{
			Matcher match=Pattern.compile("#+ *(\\d)-Level *#+").matcher(line.trim());
			if(match.find())
			{
				lv=Integer.parseInt(match.group(1));
				if(lv>N)N=lv;
			}
		}
		br.close();
		br=new BufferedReader(new InputStreamReader(new FileInputStream(args[0]),"UTF-8"));
		while((line=br.readLine())!=null)
		{
			line=line.trim();
			if(line.startsWith("@prefix"))continue;
			Matcher match=Pattern.compile("#+ *(\\d)-Level *#+").matcher(line);
			if(match.find())
			{
				lv=Integer.parseInt(match.group(1));
				continue;
			}
			line=line.replaceAll("#.*$","").trim();
			if(line.length()==0)continue;
			String[] tokens=line.split("( |\t)+");
			for(String token : tokens)
			{
				switch(token)
				{
				case ";":
					triple.remove(triple.size()-1);
					triple.remove(triple.size()-1);
					break;
				case ".":
					triple.clear();
					break;
				default:
					triple.add(token);
					break;
				}
				if(triple.size()==3)
				{
					int s=getIndex(triple.get(0)),e=getIndex(triple.get(2));
					Graph.get(s).link.add(e);
					Graph.get(e).link.add(s);
					if(lv==1)
					{
						Graph.get(root).link.add(s);
						Graph.get(s).link.add(root);
					}
					if(lv<N)
					{
						Graph.get(s).level=lv;
						Graph.get(e).level=lv+1;
					}
					if(lv==N-1)Graph.get(e).domain=s;//DOMAIN(S,v)
					if(lv==N) {
						//20220204 here store all the recommending pairs into pairs list
						
						RecommendData p = new RecommendData(Graph.get(s), Graph.get(e),0.0,0.0);
						pairs.add(p);
						
					}
				}
			}
		}
		br.close();
		
		//220206 store popularity info into popInf
		for(Vertex v: Graph) {
			if(v.level==N)
				popInf.add(new populInfo(v, 0.0));
		}
	
		
		int count=0;
		Scanner scan = new Scanner(new File("ExampleData\\popularity.txt"));
	    while(scan.hasNextLine()){
	        String line2 = scan.nextLine();
	        
	        popInf.get(count).setPop(normalizeNC(Double.valueOf(line2), 0, 177, 1.0, 0.1) );
	        count++;

	    }
	    /*
		popInf.forEach((i)->{
			System.out.println(i.getV().name+" "+i.getPop());
		});
		*/
		//20220204 check if all the recommending pairs stored into pairs list

	    
	    pairs.forEach((p)->{
	    	if(!RecSub.contains(p.getY()))
	    		RecSub.add(p.getY());
	    });
	    
	
	    
	    
		   initial = SerendipityEvaluation.pairs.get(0).x.name;
		   recommendList l = new recommendList(initial, " ");
		   SerendipityEvaluation.recommListForRecommSys.add(l);

		  

		   SerendipityEvaluation.pairs.forEach((p)->{
		    	if(p.x.name == initial) {
		    		String updateList = SerendipityEvaluation.recommListForRecommSys.get(countIndex).getRecommendingList() + " "+p.y.name;
		    		SerendipityEvaluation.recommListForRecommSys.get(countIndex).setRecommendingSubjects(updateList);
		    	}else {
		    	    countIndex++;
		    	    initial = p.x.name;
		    	    recommendList ll = new recommendList(initial, p.y.name);
		    	    SerendipityEvaluation.recommListForRecommSys.add(ll);
		    	}
		    	

		    });
		  // checking if all recommending list stored properly.
		 
		    
	    
	    

	    new GeneralChatbot();      
	    
	    diversity = normalizeNC(RecSub.size(), 0, 61, 1.0, 0.1);

	
		GraphN=Graph.stream().filter(v->v.level==N).collect(Collectors.toList());

		//S'=(S.V,S.E_n)
		for(Vertex v : Graph)
		{
			Vertex v2=new Vertex(v.index,v.name);
			v2.domain=v.domain;
			v2.level=v.level;
			Graph2.add(v2);
			
		}
		for(Vertex v : Graph)
		{

			for(int d : v.link)
			{
				
				if(v.level!=N||Graph.get(d).level!=N)continue;
				Graph2.get(v.index).link.add(d);

			}
		}
		Graph2M=Graph2.stream().collect(Collectors.toMap(Vertex::getIndex,Function.identity()));
		Graph2N=Graph2.stream().filter(v->v.level==N).collect(Collectors.toMap(Vertex::getIndex,Function.identity()));

		

		
		//S''=(S.V,S.E-S.E_n), convert S' to undirected graph
		for(Vertex v : Graph)
		{
			Vertex v2=new Vertex(v.index,v.name);
			v2.domain=v.domain;
			v2.level=v.level;
			Graph3.add(v2);
		}
		for(Vertex v : Graph)
		{
			for(int d : v.link)
			{
				if(v.level==N&&Graph.get(d).level==N)continue;
				Graph3.get(v.index).link.add(d);
			}
		}
		pairs.forEach((p)->{
			popInf.forEach((pop)->{
				if(pop.v == p.x || pop.v == p.y) {
					p.interest += pop.pop ;
				}
			});

		});
		/*
		pairs.forEach((p)->{
			System.out.println(p.x.name+" "+p.y.name+" "+p.unexp+" "+p.interest);

		});
		*/

		

		for (RecommendData p1 : pairs) {
			
			if(p1.x.domain != p1.y.domain) {
				p1.unexp = 4;
	
			}else {
				p1.unexp =0;
			}

		}
	    

		for(int i=0; i<GraphN.size(); i++) {

			System.out.println("Item "+ GraphN.get(i).name + " Evaluation completed");
			
		}
		

		recommendSer =0;
		pairs.forEach((p)->{
				recommendSer += p.unexp * p.interest * diversity;
			});
		
	
		System.out.println();
		System.out.println(recommendSer);
	
		workbook.write(new FileOutputStream(new File(args[0]).getAbsolutePath().replaceAll(".[^.]*$",".xlsx")));
		workbook.close();
	}


	static void createHeader(Sheet sheet,String... headers)
	{
		Row row=sheet.createRow(0);
		int i=0;
		for(String header : headers)row.createCell(i++).setCellValue(header);
	}

	static int getIndex(String name)
	{
		if(nameToIndex.containsKey(name))return nameToIndex.get(name);
		int index=Graph.size();
		Vertex vertex=new Vertex(index,name);
		Graph.add(vertex);
		nameToIndex.put(name,index);
		return index;
	}

	static void showGraph(List<Vertex> graph)
	{
		for(Vertex v : graph)
		{
			System.out.print("["+v.level+"] "+v.index+"("+v.name+"): ");
			for(int d : v.link)System.out.print(d+"("+graph.get(d).name+") ");
			System.out.println();
		}
		System.out.println("-------------------------");
	}

	
	static double normalizeNC(double x, double min, double max, double normalizedHigh, double normalizedLow) {
	    return ((x - min) 
	            / (max - min))
	            * (normalizedHigh - normalizedLow) + normalizedLow;
	}
	
}







class GeneralChatbot extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea ca= new JTextArea();
	private JTextField cf=new JTextField();                                  
	private JButton b=new JButton();
	private JLabel l=new JLabel();
	
	
	int countlines=0;
	
	GeneralChatbot(){                                                // Layout and Properties defined in Constructer                                         
		
		JFrame f=new JFrame();                                     
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);                      
		f.setVisible(true);
		f.setResizable(false);
		f.setLayout(null);
		f.setSize(800,800);
		f.getContentPane().setBackground(Color.DARK_GRAY);
		f.setTitle("Recommender");
		f.add(ca);
		f.add(cf);
		ca.setSize(750,710);
		ca.setLocation(15, 1);
		ca.setBackground(Color.WHITE);
		cf.setSize(700,20);
		cf.setLocation(8,720);
		f.add(b);
		l.setText("SEND");
		b.add(l);
		b.setSize(70,20);
		b.setLocation(708,720);

		
		cf.addKeyListener
	      (new KeyAdapter() {
	         public void keyPressed(KeyEvent e) {
	           int key = e.getKeyCode();
	           if (key == KeyEvent.VK_ENTER || e.getSource()==b) {
	              String text=cf.getText();
					ca.setForeground(Color.black);
					
					 if (countlines == 21){
							ca.setText("");
							countlines=0;
						}
					
					ca.append("You-->"+text+"\n");
					cf.setText("");
				
					 for (recommendList r : SerendipityEvaluation.recommListForRecommSys) {

						 if(text.contains(r.subjectName.replaceAll(":", ""))) {
							 if (countlines == 21){
									ca.setText("");
									countlines=0;
								}
					    		replyMeth("You are interested in "+r.subjectName.replaceAll(":", "")+" !");
					    		replyMeth("I recommend you "+r.recommendingSubjects.replaceAll(":",""));
					    		countlines +=2;
					    	}
						 else if(SerendipityEvaluation.recommListForRecommSys.indexOf(r) == SerendipityEvaluation.recommListForRecommSys.size()-1 && !text.contains(r.subjectName.replaceAll(":", ""))) {
			
							 
							 replyMeth("Pls enter valid name of the item");
							 countlines +=1;
						 }

					  }

					
				}
				
	              }
	           }
	         
	      );
		
		
		b.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    
				if(e.getSource()==b) {                           // Message sents on Click button
					
					String text=cf.getText();
					ca.setForeground(Color.BLACK);
					
					 if (countlines == 21){
							ca.setText("");
							countlines=0;
						}
					
					
					ca.append("You-->"+text+"\n");
					cf.setText("");

					for (recommendList r : SerendipityEvaluation.recommListForRecommSys) {
						 
						 if(text.contains(r.subjectName.replaceAll(":", ""))) {
					    		replyMeth("You are interested in "+r.subjectName.replaceAll(":", "")+" !");
					    		replyMeth("I recommend you "+r.recommendingSubjects.replaceAll(":",""));
					    	}
						 else if(SerendipityEvaluation.recommListForRecommSys.indexOf(r) == SerendipityEvaluation.recommListForRecommSys.size()-1 && !text.contains(r.subjectName.replaceAll(":", ""))) {
							 replyMeth("Pls enter valid name of the item");
						 }

					 }

				}
				
			}

		});
		
	}
	

	
	
	
	public void replyMeth(String s) {                          // Reply Method
		 if(s.length() > 244) {
				ca.append("ChatBot-->"+s.substring(0, 114)+"\n"); 
				ca.append(s.substring(114, 244)+"\n"); 
				ca.append(s.substring(244, s.length())+"\n"); 
				
			}else if(s.length() > 114) {
			ca.append("ChatBot-->"+s.substring(0, 114)+"\n"); 
			ca.append(s.substring(114, s.length())+"\n"); 
			
		}else {
			ca.append("GRS-->"+s+"\n"); 
		}
		
		
			
		
	}
			

}

