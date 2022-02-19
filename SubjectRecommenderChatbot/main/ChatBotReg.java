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







class Chatbot2 extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea ca= new JTextArea();
	private JTextField cf=new JTextField();                                  
	private JButton b=new JButton();
	private JLabel l=new JLabel();
	
	
	Chatbot2(){                                                // Layout and Properties defined in Constructer                                         
		
		JFrame f=new JFrame();                                     
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);                      
		f.setVisible(true);
		f.setResizable(false);
		f.setLayout(null);
		f.setSize(800,800);
		f.getContentPane().setBackground(Color.DARK_GRAY);
		f.setTitle("GeneralSubjectRecommender");
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
					
					ca.append("You-->"+text+"\n");
					cf.setText("");
					
					
					if((text.contains("SoapUI") && text.contains("what"))||(text.contains("SoapUI") && text.contains("What"))) {                        
						replyMeth("SoapUI is an open-source web service testing application for Simple Object Access Protocol (SOAP) and representational state transfers (REST).");
					}
					
					else if((text.contains("GPS")&& text.contains("what"))||(text.contains("GPS") && text.contains("What"))) {    
						replyMeth("Global Positioning System (GPS) is a satellite based navigation system, which is used in guiding & mapping applications and also used in location services.");

					}
					else if((text.contains("Crypto Currency")&&text.contains("what"))||(text.contains("Crypto Currency") && text.contains("What"))) {    
						replyMeth("A cryptocurrency is a digital or virtual currency that is secured by cryptography, which makes it nearly impossible to counterfeit or double-spend.");

					}
					else if((text.contains("QGIS") && text.contains("what"))||(text.contains("QGIS") && text.contains("What"))) {                        
						replyMeth("Quantum GIS (or QGIS, or Quantum Geographic Information System) is a free, open source geographic information system.");

					}
					else if((text.contains("Computer Networks") && text.contains("what"))||(text.contains("Computer Networks") && text.contains("What"))){                        
						replyMeth("A computer networking is a process of connecting two more than two computers with the purpose to share data, provide technical support, and to communicate, especially for the business purpose.");

					}
					else if((text.contains("UML") && text.contains("what"))||(text.contains("UML") && text.contains("What"))) {                        
						replyMeth("The Unified Modeling Language (UML) is a general-purpose, developmental, modeling language in the field of software engineering, that is intended to provide a standard way to visualize the design of a system.");

					}
					else if((text.contains("Software Architecture") && text.contains("what"))||(text.contains("Software Architecture") && text.contains("What"))) {                        
						replyMeth("Software architecture refers to the fundamental structures of a software system and the discipline of creating such structures and systems.");

					}
					else if((text.contains("Docker") && text.contains("what"))||(text.contains("Docker") && text.contains("What"))) {                        
						replyMeth("Docker is a set of platform as a service (PaaS) products that use OS-level virtualization to deliver software in packages called containers.");

					}
					else if((text.contains("Raspberry Pi") && text.contains("what"))||(text.contains("Raspberry Pi") && text.contains("What"))){                        
						replyMeth("The Raspberry Pi is a low cost, credit-card sized computer that plugs into a computer monitor or TV, and uses a standard keyboard and mouse.");

					}
					else if((text.contains("GeoServer") && text.contains("what"))||(text.contains("GeoServer") && text.contains("What")))  {                        
						replyMeth("GeoServer is an open source server-side software written in Java that allows users to share and edit geospatial data.");

					}
					else if((text.contains("Operating System") && text.contains("what"))||(text.contains("Operating System") && text.contains("What"))) {                        
						replyMeth("An operating system (OS) is system software that manages computer hardware, software resources, and provides common services for computer programs.");

					}
					else if((text.contains("Computer Graphics") && text.contains("what"))||(text.contains("Computer Graphics") && text.contains("What"))) {                        
						replyMeth("Computer graphics is a sub-field of computer science which studies methods for digitally synthesizing and manipulating visual content.");

					}
					else if((text.contains("System Analysis") && text.contains("what"))||(text.contains("System Analysis") && text.contains("What"))) {                        
						replyMeth("Systems analysis the process of observing systems for troubleshooting or development purposes.");

					}
					else if((text.contains("XMPP") && text.contains("what"))||(text.contains("XMPP") && text.contains("What"))) {                        
						replyMeth("Extensible Messaging and Presence Protocol (XMPP, originally named Jabber) is an open communication protocol designed for instant messaging (IM), presence information, and contact list maintenance.");

					}
					else if((text.contains("Linux") && text.contains("what"))||(text.contains("Linux") && text.contains("What"))) {                        
						replyMeth("Linux is software that sits underneath all of the other software on a computer, receiving requests from those programs and relaying these requests to the computer¡¯s hardware.");

					}
					else if((text.contains("Blockchain Security") && text.contains("what"))||(text.contains("Blockchain Security") && text.contains("What"))) {                        
						replyMeth(" A comprehensive security strategy for a blockchain solution using traditional security controls and technology-unique controls.");
					}
					else if((text.contains("SSH") && text.contains("what"))||(text.contains("SSH") && text.contains("What"))) {                        
						replyMeth("SSH or Secure Shell is a network communication protocol that enables two computers to communicate and share data.");
					}
					else if((text.contains("Ransomware") && text.contains("what"))||(text.contains("Ransomware") && text.contains("What"))) {                        
						replyMeth("Ransomware is a type of malicious software (malware) that threatens to publish or blocks access to data or a computer system, usually by encrypting it, until the victim pays a ransom fee to the attacker.");
					}
					else if((text.contains("Digital Forensics") && text.contains("what"))||(text.contains("Digital Forensics") && text.contains("What"))) {                        
						replyMeth("Digital forensics is a branch of forensic science that includes gathering and analyzing evidence to solve crimes.");
					}
					else if((text.contains("Ethical Hacking") && text.contains("what"))||(text.contains("Ethical Hacking") && text.contains("What"))) {                        
						replyMeth("Ethical hacking involves an authorized attempt to gain unauthorized access to a computer system, application, or data.");
					}
					else if((text.contains("Cyber Security Analysis") && text.contains("what"))||(text.contains("Cyber Security Analysis") && text.contains("What"))) {                        
						replyMeth("Cyber security analysis is about planning and carrying out out security measures to protect computer networks and systems.");
					} 
					else if((text.contains("WireShark") && text.contains("what"))||(text.contains("WireShark") && text.contains("What"))) {                        
						replyMeth("Wireshark is a data capturing program that understands the structure (encapsulation) of different networking protocols.");
					} 
					else if((text.contains("Cyber Warfare") && text.contains("what"))||(text.contains("Cyber Warfare") && text.contains("What"))) {                        
						replyMeth("Cyberwarfare is the use of digital attacks against an enemy state, causing comparable harm to actual warfare and/or disrupting the vital computer systems.");
					} 
					else if((text.contains("ECommerce Fraud") && text.contains("what"))||(text.contains("ECommerce Fraud") && text.contains("What"))) {                        
						replyMeth("Ecommerce fraud includes any kind of malicious action designed to exploit online stores.");
					} 
					else if((text.contains("Nmap") && text.contains("what"))||(text.contains("Nmap") && text.contains("What"))) {                        
						replyMeth("Nmap is a network scanner that is used to discover hosts and services on a computer network by sending packets and analyzing the responses.");
					} 
					else if((text.contains("OpenVas") && text.contains("what"))||(text.contains("OpenVas") && text.contains("What"))) {                        
						replyMeth("OpenVAS (Open Vulnerability Assessment System, originally known as GNessUs) is the scanner component of Greenbone Vulnerability Manager (GVM), a software framework of several services and tools offering vulnerability scanning and vulnerability management.");
					} 
					else if((text.contains("Neural Network") && text.contains("what"))||(text.contains("Neural Network") && text.contains("What"))) {                        
						replyMeth("A neural network is a network or circuit of biological neurons, or in a modern sense, an artificial neural network, composed of artificial neurons or nodes.");
					} 
					else if((text.contains("Outlier Detection Algorithms") && text.contains("what"))||(text.contains("Outlier Detection Algorithms") && text.contains("What"))) {                        
						replyMeth("Outlier Detection is identification of rare items, events or observations which deviate significantly from the majority of the data. ");
					} 
					else if((text.contains("ReasonML") && text.contains("what"))||(text.contains("ReasonML") && text.contains("What"))) {                        
						replyMeth("ReasonML, is a syntax extension and toolchain for OCaml.");
					} 
					else if((text.contains("Big Data") && text.contains("what"))||(text.contains("Big Data") && text.contains("What"))) {                        
						replyMeth("Big data is data that contains greater variety, arriving in increasing volumes and with more velocity.");
					} 
					
					else if((text.contains("Time Series Analysis") && text.contains("what"))||(text.contains("Time Series Analysis") && text.contains("What"))) {                        
						replyMeth("Time series analysis is a specific way of analyzing a sequence of data points collected over an interval of time.");
					} 
					else if((text.contains("Deep Learning") && text.contains("what"))||(text.contains("Deep Learning") && text.contains("What"))) {                        
						replyMeth("Deep learning is a machine learning technique that teaches computers to do what comes naturally to humans.");

					}
					else if((text.contains("AI") && text.contains("what"))||(text.contains("AI") && text.contains("What"))) {                        
						replyMeth("Artificial intelligence (AI) is a wide-ranging branch of computer science concerned with building smart machines capable of performing tasks that typically require human intelligence.");

					}
					else if((text.contains("Support Vector Machines") && text.contains("what"))||(text.contains("Support Vector Machines") && text.contains("What"))) {                        
						replyMeth("Support-vector machines (SVMs, also support-vector networks) are supervised learning models with associated learning algorithms that analyze data for classification and regression analysis.");

					}
					else if((text.contains("Data Visualization") && text.contains("what"))||(text.contains("Data Visualization") && text.contains("What"))) {                        
						replyMeth("Data visualization is an interdisciplinary field that deals with the graphic representation of data.");
					}
					else if((text.contains("Data Analytics") && text.contains("what"))||(text.contains("Data Analytics") && text.contains("What"))) {                        
						replyMeth("Data analytics is the science of analyzing raw data to make conclusions about that information.");
					}
					else if((text.contains("Seaborn") && text.contains("what"))||(text.contains("Seaborn") && text.contains("What"))) {                        
						replyMeth("Seaborn is a Python data visualization library based on matplotlib.");
					}
					else if((text.contains("Automation") && text.contains("what"))||(text.contains("Automation") && text.contains("What"))) {                        
						replyMeth("Automation is the use of electronics and computer-controlled devices to assume control of processes.");
					}
					else if((text.contains("Applied Statistics") && text.contains("what"))||(text.contains("Applied Statistics") && text.contains("What"))) {                        
						replyMeth("Applied statistics is the practice of data analysis: using advanced statistical inferences, models, and theories to find the meaning in large sets of real data.");
					}
					else if((text.contains("Image Processing") && text.contains("what"))||(text.contains("Image Processing") && text.contains("What"))) {                        
						replyMeth("Image processing is a method to perform some operations on an image, in order to get an enhanced image or to extract some useful information from it.");
					} 
					else if((text.contains("Chatbot") && text.contains("what"))||(text.contains("Chatbot") && text.contains("What"))) {                        
						replyMeth("A chatbot or chatterbot is a software application used to conduct an on-line chat conversation via text or text-to-speech, in lieu of providing direct contact with a live human agent.");
					} 
					else if((text.contains("Genetic Algorithms") && text.contains("what"))||(text.contains("Genetic Algorithms") && text.contains("What"))) {                        
						replyMeth("A genetic algorithm (GA) is a method for solving both constrained and unconstrained optimization problems based on a natural selection process that mimics biological evolution.");
					} 
					else if((text.contains("Tensorflow") && text.contains("what"))||(text.contains("Tensorflow") && text.contains("What"))) {                        
						replyMeth("TensorFlow is an end-to-end open source platform for machine learning.");
					} 
					else if((text.contains(".Net Framework") && text.contains("what"))||(text.contains(".Net Framework") && text.contains("What"))) {                        
						replyMeth("The .NET Framework is a proprietary software framework developed by Microsoft that runs primarily on Microsoft Windows.");
					} 
					else if((text.contains("MATLAB") && text.contains("what"))||(text.contains("MATLAB") && text.contains("What"))) {                        
						replyMeth("MATLAB is a proprietary multi-paradigm programming language and numeric computing environment.");
					} 
					else if((text.contains("Python") && text.contains("what"))||(text.contains("Python") && text.contains("What"))) {                        
						replyMeth("Python is an interpreted high-level general-purpose programming language.");
					} 
					else if((text.contains("Rust") && text.contains("what"))||(text.contains("Rust") && text.contains("What"))) {                        
						replyMeth("Rust is a multi-paradigm, general-purpose programming language designed for performance and safety, especially safe concurrency.");
					} 
					else if((text.contains("Julia") && text.contains("what"))||(text.contains("Julia") && text.contains("What"))) {                        
						replyMeth("Julia is a high-level, high-performance, dynamic programming language.");
					} 
					else if((text.contains("JavaScript") && text.contains("what"))||(text.contains("JavaScript") && text.contains("What"))) {                        
						replyMeth("JavaScript is a programming language that is one of the core technologies of the World Wide Web, alongside HTML and CSS.");
					} 
					else if((text.contains("COBOL") && text.contains("what"))||(text.contains("COBOL") && text.contains("What"))) {                        
						replyMeth("COBOL is a compiled English-like computer programming language designed for business use.");
					} 
					else if((text.contains("C++") && text.contains("what"))||(text.contains("C++") && text.contains("What"))) {                        
						replyMeth("C++ is a general-purpose programming language created as an extension of the C programming language.");

					}
					else if((text.contains("Clojure") && text.contains("what"))||(text.contains("Clojure") && text.contains("What"))) {                        
						replyMeth("Clojure is a dialect of Lisp, and shares with Lisp the code-as-data philosophy and a powerful macro system.");

					}
					
					else if((text.contains("C") && text.contains("what"))||(text.contains("C") && text.contains("What"))) {                        
						replyMeth("C is a general-purpose, procedural computer programming language supporting structured programming, lexical variable scope, and recursion, with a static type system.");
					} 
					
					else if((text.contains("Ruby") && text.contains("what"))||(text.contains("Ruby") && text.contains("What"))) {                        
						replyMeth("Ruby is an interpreted, high-level, general-purpose programming language which supports multiple programming paradigms.");
					} 
			
					
					else if((text.contains("Java") && text.contains("what"))||(text.contains("Java") && text.contains("What"))) {                        
						replyMeth("Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.");

					}
					else if((text.contains("PHP") && text.contains("what"))||(text.contains("PHP") && text.contains("What"))) {                        
						replyMeth("PHP is a popular general-purpose scripting language that is especially suited to web development.");
					}
					else if((text.contains("Perl") && text.contains("what"))||(text.contains("Perl") && text.contains("What"))) {                        
						replyMeth("Perl is a family of two high-level, general-purpose, interpreted, dynamic programming languages.");
					}
					else if((text.contains("SQL") && text.contains("what"))||(text.contains("SQL") && text.contains("What"))) {                        
						replyMeth("Structured Query Language (SQL) is a standardized programming language that is used to manage relational databases and perform various operations on the data in them.");
					}
					else if((text.contains("Prolog") && text.contains("what"))||(text.contains("Prolog") && text.contains("What"))) {                        
						replyMeth("Prolog is a logic programming language associated with artificial intelligence and computational linguistics.");
					}
					else if((text.contains("TypeScript") && text.contains("what"))||(text.contains("TypeScript") && text.contains("What"))) {                        
						replyMeth("TypeScript is a programming language that is a strict syntactical superset of JavaScript and adds optional static typing to the language.");
					}
					else if((text.contains("Groovy") && text.contains("what"))||(text.contains("Groovy") && text.contains("What"))) {                        
						replyMeth("Groovy is a Java-syntax-compatible object-oriented programming language for the Java platform.");
					} 

					
					
					
					else if(text.contains("SoapUI")) {                        			
						replyMeth("For SoapUI, I recommend: Python, Docker, Linux.");
					}
					
					else if(text.contains("GPS")) {    
						replyMeth("For GPS, I recommend: AI, Docker, Linux");
					}
					else if(text.contains("Crypto Currency")) {    
						
						replyMeth("For Crypto Currency, I recommend: AI, Docker, Linux");
						
					}
					else if(text.contains("QGIS")) {                        
						replyMeth("For QGIS, I recommend: AI, Docker, Linux");

					}
					else if(text.contains("Computer Networks")) {                        
						replyMeth("For Computer Networks, I recommend: AI, Docker, Linux");

					}
					else if(text.contains("UML")) {                        
						replyMeth("For UML, I recommend: Python, Raspberry Pi, Operating System");

					}
					else if(text.contains("Software Architecture")) {                        
						replyMeth("For Software Architecture, I recommend: AI, Docker, Linux");

					}
					else if(text.contains("Docker")) {                        
						replyMeth("For Docker, I recommend: Python, Linux, GPS");

					}
					else if(text.contains("Raspberry Pi")) {                        
						replyMeth("For Raspberry Pi, I recommend: AI, Docker, Linux");

					}
					else if(text.contains("GeoServer")) {                        
						replyMeth("For GeoServer, I recommend: Python, Docker, Linux");

					}
					else if(text.contains("Operating System")) {                        
						replyMeth("For Operating System, I recommend: Docker, Linux, AI");

					}
					else if(text.contains("Computer Graphics")) {                        
						replyMeth("For Computer Graphics, I recommend: AI, QGIS, Operating System");

					}
					else if(text.contains("System Analysis")) {                        
						replyMeth("For System Analysis, I recommend: AI, Docker, Linux");

					}
					else if(text.contains("XMPP")) {                        
						replyMeth("For XMPP, I recommend: AI, Crypto Currency, Docker");

					}
					else if(text.contains("Linux")) {                        
						replyMeth("For Linux, I recommend: AI, GPS, Docker");

					}
					else if(text.contains("Blockchain Security")) {                        
						replyMeth("For Blockchain Security, I recommend: AI, SSH, WireShark");
					}
					else if(text.contains("SSH")) {                        
						replyMeth("For SSH, I recommend: Python, WireShark, Ransomware");
					}
					else if(text.contains("Ransomware")) {                        
						replyMeth("For Ransomware, I recommend: AI, SSH, WireShark");
					}
					else if(text.contains("Digital Forensics")) {                        
						replyMeth("For Digital Forensics, I recommend: AI, SSH, Ransomware");
					}
					else if(text.contains("Ethical Hacking")) {                        
						replyMeth("For Ethical Hacking, I recommend: AI, SSH, Ransomware");
					}
					else if(text.contains("Cyber Security Analysis")) {                        
						replyMeth("For Cyber Security Analysis, I recommend: AI, SSH, WireShark");
					} 
					else if(text.contains("WireShark")) {                        
						replyMeth("For WireShark, I recommend: C++, SSH, Ransomware");
					} 
					else if(text.contains("Cyber Warfare")) {                        
						replyMeth("For Cyber Warfare, I recommend: AI, SSH, WireShark");
					} 
					else if(text.contains("ECommerce Frauds")) {                        
						replyMeth("For ECommerce Frauds, I recommend: AI, WireShark, Ransomware");
					} 
					else if(text.contains("Nmap")) {                        
						replyMeth("For Nmap, I recommend: Python, WireShark, Blockchain Security");
					} 
					else if(text.contains("OpenVas")) {                        
						replyMeth("For OpenVas, I recommend: Python, WireShark, SSH");
					} 
					else if(text.contains("Neural Network")) {                        
						replyMeth("For Neural Network, I recommend: AI, Java, Tensorflow");
					} 
					else if(text.contains("Outlier Detection Algorithms")) {                        
						replyMeth("For Outlier Detection Algorithms, I recommend: AI, Java, Tensorflow");
					} 
					else if(text.contains("ReasonML")) {                        
						replyMeth("For ReasonML, I recommend: Python, Neural Network, Chatbot");
					} 
					else if(text.contains("Big Data")) {                        
						replyMeth("For Big Data, I recommend: AI, Java, Tensorflow");
					} 
					
					else if(text.contains("Time Series Analysis")) {                        
						replyMeth("For Time Series Analysis, I recommend: AI, Java, Tensorflow");
					} 
					else if(text.contains("Deep Learning")) {                        
						replyMeth("For Deep Learning, I recommend: AI, Python, Tensorflow");

					}
					else if(text.contains("AI")) {                        
						replyMeth("For AI, I recommend: Python, Tensorflow, Deep Learning");

					}
					else if(text.contains("Support Vector Machines")) {                        
						replyMeth("For Support Vector Machines, I recommend: Python, Tensorflow, Deep Learning");

					}
					else if(text.contains("Data Visualization")) {                        
						replyMeth("For Data Visualization, I recommend: AI, Java, Tensorflow");
					}
					else if(text.contains("Data Analytics")) {                        
						replyMeth("For Data Analytics, I recommend: AI, Java, Tensorflow");
					}
					else if(text.contains("Seaborn")) {                        
						replyMeth("For Seaborn, I recommend: Docker, AI, Deep Learning");
					}
					else if(text.contains("Automation")) {                        
						replyMeth("For Automation, I recommend: AI, Java, Tensorflow");
					}
					else if(text.contains("Applied Statistics")) {                        
						replyMeth("For Applied Statistics, I recommend: AI, Python, Deep Learning");
					}
					else if(text.contains("Image Processing")) {                        
						replyMeth("For Image Processing, I recommend: AI, Java, Tensorflow");
					} 
					else if(text.contains("Chatbot")) {                        
						replyMeth("For Chatbot, I recommend: AI, Java, Tensorflow");
					} 
					else if(text.contains("Genetic Algorithms")) {                        
						replyMeth("For Genetic Algorithms, I recommend: AI, Java, Tensorflow");
					} 
					else if(text.contains("Tensorflow")) {                        
						replyMeth("For Tensorflow, I recommend: AI, Java, Deep Learning");
					} 
					else if(text.contains("Net Framework")) {                        
						replyMeth("For Net Framework, I recommend: AI, Java, PHP");
					} 
					else if(text.contains("MATLAB")) {                        
						replyMeth("For MATLAB, I recommend: AI, Java, PHP");
					} 
					else if(text.contains("Python")) {                        
						replyMeth("For Python, I recommend: AI, Java, PHP");
					} 
					else if(text.contains("Rust")) {                        
						replyMeth("For Rust, I recommend: AI, Java, PHP");
					} 
					else if(text.contains("Julia")) {                        
						replyMeth("For Julia, I recommend: AI, Python, Java");
					} 
					else if(text.contains("JavaScript")) {                        
						replyMeth("For JavaScript, I recommend: AI, Java, PHP");
					} 
					else if(text.contains("COBOL")) {                        
						replyMeth("For COBOL, I recommend: AI, Java, PHP");
					} 
					else if(text.contains("Clojure")) {                        
						replyMeth("For Clojure, I recommend: AI, Java, PHP");

					}
					else if(text.contains("C++")) {                        
						replyMeth("For C++, I recommend: AI, Java, PHP");

					}
					else if(text.contentEquals("C")) {                        
						replyMeth("For C, I recommend: AI, Java, PHP");
					} 
					
					else if(text.contains("Ruby")) {                        
						replyMeth("For Ruby, I recommend: AI, Java, PHP");
					} 
					
					
					else if(text.contains("Java")) {                        
						replyMeth("For Java, I recommend: AI, Python, PHP");

					}
					else if(text.contains("PHP")) {                        
						replyMeth("For PHP, I recommend: AI, Python, Java");
					}
					else if(text.contains("Perl")) {                        
						replyMeth("For Perl, I recommend: AI, Java, PHP");
					}
					else if(text.contains("SQL")) {                        
						replyMeth("For SQL, I recommend: AI, Java, PHP");
					}
					else if(text.contains("Prolog")) {                        
						replyMeth("For Prolog, I recommend: AI, Java, PHP");
					}
					else if(text.contains("TypeScript")) {                        
						replyMeth("For TypeScript, I recommend: AI, Java, PHP");
					}
					else if(text.contains("Groovy")) {                        
						replyMeth("For Groovy, I recommend: AI, Java, PHP");
					} 
								
					else 
						replyMeth("Pls enter valid subject name!");
					
				}
				
	              }
	           }
	         
	      );
		
		
		b.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    
				if(e.getSource()==b) {                           // Message sents on Click button
					
					String text=cf.getText();
					ca.setForeground(Color.BLACK);
					ca.append("You-->"+text+"\n");
					cf.setText("");
					
						if((text.contains("SoapUI") && text.contains("what"))||(text.contains("SoapUI") && text.contains("What"))) {                        
						replyMeth("SoapUI is an open-source web service testing application for Simple Object Access Protocol (SOAP) and representational state transfers (REST).");
					}
					
					else if((text.contains("GPS")&& text.contains("what"))||(text.contains("GPS") && text.contains("What"))) {    
						replyMeth("Global Positioning System (GPS) is a satellite based navigation system, which is used in guiding & mapping applications and also used in location services.");

					}
					else if((text.contains("Crypto Currency")&&text.contains("what"))||(text.contains("Crypto Currency") && text.contains("What"))) {    
						replyMeth("A cryptocurrency is a digital or virtual currency that is secured by cryptography, which makes it nearly impossible to counterfeit or double-spend.");

					}
					else if((text.contains("QGIS") && text.contains("what"))||(text.contains("QGIS") && text.contains("What"))) {                        
						replyMeth("Quantum GIS (or QGIS, or Quantum Geographic Information System) is a free, open source geographic information system.");

					}
					else if((text.contains("Computer Networks") && text.contains("what"))||(text.contains("Computer Networks") && text.contains("What"))){                        
						replyMeth("A computer networking is a process of connecting two more than two computers with the purpose to share data, provide technical support, and to communicate, especially for the business purpose.");

					}
					else if((text.contains("UML") && text.contains("what"))||(text.contains("UML") && text.contains("What"))) {                        
						replyMeth("The Unified Modeling Language (UML) is a general-purpose, developmental, modeling language in the field of software engineering, that is intended to provide a standard way to visualize the design of a system.");

					}
					else if((text.contains("Software Architecture") && text.contains("what"))||(text.contains("Software Architecture") && text.contains("What"))) {                        
						replyMeth("Software architecture refers to the fundamental structures of a software system and the discipline of creating such structures and systems.");

					}
					else if((text.contains("Docker") && text.contains("what"))||(text.contains("Docker") && text.contains("What"))) {                        
						replyMeth("Docker is a set of platform as a service (PaaS) products that use OS-level virtualization to deliver software in packages called containers.");

					}
					else if((text.contains("Raspberry Pi") && text.contains("what"))||(text.contains("Raspberry Pi") && text.contains("What"))){                        
						replyMeth("The Raspberry Pi is a low cost, credit-card sized computer that plugs into a computer monitor or TV, and uses a standard keyboard and mouse.");

					}
					else if((text.contains("GeoServer") && text.contains("what"))||(text.contains("GeoServer") && text.contains("What")))  {                        
						replyMeth("GeoServer is an open source server-side software written in Java that allows users to share and edit geospatial data.");

					}
					else if((text.contains("Operating System") && text.contains("what"))||(text.contains("Operating System") && text.contains("What"))) {                        
						replyMeth("An operating system (OS) is system software that manages computer hardware, software resources, and provides common services for computer programs.");

					}
					else if((text.contains("Computer Graphics") && text.contains("what"))||(text.contains("Computer Graphics") && text.contains("What"))) {                        
						replyMeth("Computer graphics is a sub-field of computer science which studies methods for digitally synthesizing and manipulating visual content.");

					}
					else if((text.contains("System Analysis") && text.contains("what"))||(text.contains("System Analysis") && text.contains("What"))) {                        
						replyMeth("Systems analysis the process of observing systems for troubleshooting or development purposes.");

					}
					else if((text.contains("XMPP") && text.contains("what"))||(text.contains("XMPP") && text.contains("What"))) {                        
						replyMeth("Extensible Messaging and Presence Protocol (XMPP, originally named Jabber) is an open communication protocol designed for instant messaging (IM), presence information, and contact list maintenance.");

					}
					else if((text.contains("Linux") && text.contains("what"))||(text.contains("Linux") && text.contains("What"))) {                        
						replyMeth("Linux is software that sits underneath all of the other software on a computer, receiving requests from those programs and relaying these requests to the computer¡¯s hardware.");

					}
					else if((text.contains("Blockchain Security") && text.contains("what"))||(text.contains("Blockchain Security") && text.contains("What"))) {                        
						replyMeth(" A comprehensive security strategy for a blockchain solution using traditional security controls and technology-unique controls.");
					}
					else if((text.contains("SSH") && text.contains("what"))||(text.contains("SSH") && text.contains("What"))) {                        
						replyMeth("SSH or Secure Shell is a network communication protocol that enables two computers to communicate and share data.");
					}
					else if((text.contains("Ransomware") && text.contains("what"))||(text.contains("Ransomware") && text.contains("What"))) {                        
						replyMeth("Ransomware is a type of malicious software (malware) that threatens to publish or blocks access to data or a computer system, usually by encrypting it, until the victim pays a ransom fee to the attacker.");
					}
					else if((text.contains("Digital Forensics") && text.contains("what"))||(text.contains("Digital Forensics") && text.contains("What"))) {                        
						replyMeth("Digital forensics is a branch of forensic science that includes gathering and analyzing evidence to solve crimes.");
					}
					else if((text.contains("Ethical Hacking") && text.contains("what"))||(text.contains("Ethical Hacking") && text.contains("What"))) {                        
						replyMeth("Ethical hacking involves an authorized attempt to gain unauthorized access to a computer system, application, or data.");
					}
					else if((text.contains("Cyber Security Analysis") && text.contains("what"))||(text.contains("Cyber Security Analysis") && text.contains("What"))) {                        
						replyMeth("Cyber security analysis is about planning and carrying out out security measures to protect computer networks and systems.");
					} 
					else if((text.contains("WireShark") && text.contains("what"))||(text.contains("WireShark") && text.contains("What"))) {                        
						replyMeth("Wireshark is a data capturing program that understands the structure (encapsulation) of different networking protocols.");
					} 
					else if((text.contains("Cyber Warfare") && text.contains("what"))||(text.contains("Cyber Warfare") && text.contains("What"))) {                        
						replyMeth("Cyberwarfare is the use of digital attacks against an enemy state, causing comparable harm to actual warfare and/or disrupting the vital computer systems.");
					} 
					else if((text.contains("ECommerce Fraud") && text.contains("what"))||(text.contains("ECommerce Fraud") && text.contains("What"))) {                        
						replyMeth("Ecommerce fraud includes any kind of malicious action designed to exploit online stores.");
					} 
					else if((text.contains("Nmap") && text.contains("what"))||(text.contains("Nmap") && text.contains("What"))) {                        
						replyMeth("Nmap is a network scanner that is used to discover hosts and services on a computer network by sending packets and analyzing the responses.");
					} 
					else if((text.contains("OpenVas") && text.contains("what"))||(text.contains("OpenVas") && text.contains("What"))) {                        
						replyMeth("OpenVAS (Open Vulnerability Assessment System, originally known as GNessUs) is the scanner component of Greenbone Vulnerability Manager (GVM), a software framework of several services and tools offering vulnerability scanning and vulnerability management.");
					} 
					else if((text.contains("Neural Network") && text.contains("what"))||(text.contains("Neural Network") && text.contains("What"))) {                        
						replyMeth("A neural network is a network or circuit of biological neurons, or in a modern sense, an artificial neural network, composed of artificial neurons or nodes.");
					} 
					else if((text.contains("Outlier Detection Algorithms") && text.contains("what"))||(text.contains("Outlier Detection Algorithms") && text.contains("What"))) {                        
						replyMeth("Outlier Detection is identification of rare items, events or observations which deviate significantly from the majority of the data. ");
					} 
					else if((text.contains("ReasonML") && text.contains("what"))||(text.contains("ReasonML") && text.contains("What"))) {                        
						replyMeth("ReasonML, is a syntax extension and toolchain for OCaml.");
					} 
					else if((text.contains("Big Data") && text.contains("what"))||(text.contains("Big Data") && text.contains("What"))) {                        
						replyMeth("Big data is data that contains greater variety, arriving in increasing volumes and with more velocity.");
					} 
					
					else if((text.contains("Time Series Analysis") && text.contains("what"))||(text.contains("Time Series Analysis") && text.contains("What"))) {                        
						replyMeth("Time series analysis is a specific way of analyzing a sequence of data points collected over an interval of time.");
					} 
					else if((text.contains("Deep Learning") && text.contains("what"))||(text.contains("Deep Learning") && text.contains("What"))) {                        
						replyMeth("Deep learning is a machine learning technique that teaches computers to do what comes naturally to humans.");

					}
					else if((text.contains("AI") && text.contains("what"))||(text.contains("AI") && text.contains("What"))) {                        
						replyMeth("Artificial intelligence (AI) is a wide-ranging branch of computer science concerned with building smart machines capable of performing tasks that typically require human intelligence.");

					}
					else if((text.contains("Support Vector Machines") && text.contains("what"))||(text.contains("Support Vector Machines") && text.contains("What"))) {                        
						replyMeth("Support-vector machines (SVMs, also support-vector networks) are supervised learning models with associated learning algorithms that analyze data for classification and regression analysis.");

					}
					else if((text.contains("Data Visualization") && text.contains("what"))||(text.contains("Data Visualization") && text.contains("What"))) {                        
						replyMeth("Data visualization is an interdisciplinary field that deals with the graphic representation of data.");
					}
					else if((text.contains("Data Analytics") && text.contains("what"))||(text.contains("Data Analytics") && text.contains("What"))) {                        
						replyMeth("Data analytics is the science of analyzing raw data to make conclusions about that information.");
					}
					else if((text.contains("Seaborn") && text.contains("what"))||(text.contains("Seaborn") && text.contains("What"))) {                        
						replyMeth("Seaborn is a Python data visualization library based on matplotlib.");
					}
					else if((text.contains("Automation") && text.contains("what"))||(text.contains("Automation") && text.contains("What"))) {                        
						replyMeth("Automation is the use of electronics and computer-controlled devices to assume control of processes.");
					}
					else if((text.contains("Applied Statistics") && text.contains("what"))||(text.contains("Applied Statistics") && text.contains("What"))) {                        
						replyMeth("Applied statistics is the practice of data analysis: using advanced statistical inferences, models, and theories to find the meaning in large sets of real data.");
					}
					else if((text.contains("Image Processing") && text.contains("what"))||(text.contains("Image Processing") && text.contains("What"))) {                        
						replyMeth("Image processing is a method to perform some operations on an image, in order to get an enhanced image or to extract some useful information from it.");
					} 
					else if((text.contains("Chatbot") && text.contains("what"))||(text.contains("Chatbot") && text.contains("What"))) {                        
						replyMeth("A chatbot or chatterbot is a software application used to conduct an on-line chat conversation via text or text-to-speech, in lieu of providing direct contact with a live human agent.");
					} 
					else if((text.contains("Genetic Algorithms") && text.contains("what"))||(text.contains("Genetic Algorithms") && text.contains("What"))) {                        
						replyMeth("A genetic algorithm (GA) is a method for solving both constrained and unconstrained optimization problems based on a natural selection process that mimics biological evolution.");
					} 
					else if((text.contains("Tensorflow") && text.contains("what"))||(text.contains("Tensorflow") && text.contains("What"))) {                        
						replyMeth("TensorFlow is an end-to-end open source platform for machine learning.");
					} 
					else if((text.contains(".Net Framework") && text.contains("what"))||(text.contains(".Net Framework") && text.contains("What"))) {                        
						replyMeth("The .NET Framework is a proprietary software framework developed by Microsoft that runs primarily on Microsoft Windows.");
					} 
					else if((text.contains("MATLAB") && text.contains("what"))||(text.contains("MATLAB") && text.contains("What"))) {                        
						replyMeth("MATLAB is a proprietary multi-paradigm programming language and numeric computing environment.");
					} 
					else if((text.contains("Python") && text.contains("what"))||(text.contains("Python") && text.contains("What"))) {                        
						replyMeth("Python is an interpreted high-level general-purpose programming language.");
					} 
					else if((text.contains("Rust") && text.contains("what"))||(text.contains("Rust") && text.contains("What"))) {                        
						replyMeth("Rust is a multi-paradigm, general-purpose programming language designed for performance and safety, especially safe concurrency.");
					} 
					else if((text.contains("Julia") && text.contains("what"))||(text.contains("Julia") && text.contains("What"))) {                        
						replyMeth("Julia is a high-level, high-performance, dynamic programming language.");
					} 
					else if((text.contains("JavaScript") && text.contains("what"))||(text.contains("JavaScript") && text.contains("What"))) {                        
						replyMeth("JavaScript is a programming language that is one of the core technologies of the World Wide Web, alongside HTML and CSS.");
					} 
					else if((text.contains("C++") && text.contains("what"))||(text.contains("C++") && text.contains("What"))) {                        
						replyMeth("C++ is a general-purpose programming language created as an extension of the C programming language.");

					}
					else if((text.contains("Clojure") && text.contains("what"))||(text.contains("Clojure") && text.contains("What"))) {                        
						replyMeth("Clojure is a dialect of Lisp, and shares with Lisp the code-as-data philosophy and a powerful macro system.");

					}
					else if((text.contains("COBOL") && text.contains("what"))||(text.contains("COBOL") && text.contains("What"))) {                        
						replyMeth("COBOL is a compiled English-like computer programming language designed for business use.");
					} 
					else if((text.contains("C") && text.contains("what"))||(text.contains("C") && text.contains("What"))) {                        
						replyMeth("C is a general-purpose, procedural computer programming language supporting structured programming, lexical variable scope, and recursion, with a static type system.");
					} 
					
					else if((text.contains("Ruby") && text.contains("what"))||(text.contains("Ruby") && text.contains("What"))) {                        
						replyMeth("Ruby is an interpreted, high-level, general-purpose programming language which supports multiple programming paradigms.");
					} 
					
					else if((text.contains("Java") && text.contains("what"))||(text.contains("Java") && text.contains("What"))) {                        
						replyMeth("Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.");

					}
					else if((text.contains("PHP") && text.contains("what"))||(text.contains("PHP") && text.contains("What"))) {                        
						replyMeth("PHP is a popular general-purpose scripting language that is especially suited to web development.");
					}
					else if((text.contains("Perl") && text.contains("what"))||(text.contains("Perl") && text.contains("What"))) {                        
						replyMeth("Perl is a family of two high-level, general-purpose, interpreted, dynamic programming languages.");
					}
					else if((text.contains("SQL") && text.contains("what"))||(text.contains("SQL") && text.contains("What"))) {                        
						replyMeth("Structured Query Language (SQL) is a standardized programming language that is used to manage relational databases and perform various operations on the data in them.");
					}
					else if((text.contains("Prolog") && text.contains("what"))||(text.contains("Prolog") && text.contains("What"))) {                        
						replyMeth("Prolog is a logic programming language associated with artificial intelligence and computational linguistics.");
					}
					else if((text.contains("TypeScript") && text.contains("what"))||(text.contains("TypeScript") && text.contains("What"))) {                        
						replyMeth("TypeScript is a programming language that is a strict syntactical superset of JavaScript and adds optional static typing to the language.");
					}
					else if((text.contains("Groovy") && text.contains("what"))||(text.contains("Groovy") && text.contains("What"))) {                        
						replyMeth("Groovy is a Java-syntax-compatible object-oriented programming language for the Java platform.");
					} 
					
					
					else if(text.contains("SoapUI")) {                        			
						replyMeth("For SoapUI, I recommend: Python, Docker, Linux.");
					}
					
					else if(text.contains("GPS")) {    
						replyMeth("For GPS, I recommend: AI, Docker, Linux");
					}
					else if(text.contains("Crypto Currency")) {    
						
						replyMeth("For Crypto Currency, I recommend: AI, Docker, Linux");
						
					}
					else if(text.contains("QGIS")) {                        
						replyMeth("For QGIS, I recommend: AI, Docker, Linux");

					}
					else if(text.contains("Computer Networks")) {                        
						replyMeth("For Computer Networks, I recommend: AI, Docker, Linux");

					}
					else if(text.contains("UML")) {                        
						replyMeth("For UML, I recommend: Python, Raspberry Pi, Operating System");

					}
					else if(text.contains("Software Architecture")) {                        
						replyMeth("For Software Architecture, I recommend: AI, Docker, Linux");

					}
					else if(text.contains("Docker")) {                        
						replyMeth("For Docker, I recommend: Python, Linux, GPS");

					}
					else if(text.contains("Raspberry Pi")) {                        
						replyMeth("For Raspberry Pi, I recommend: AI, Docker, Linux");

					}
					else if(text.contains("GeoServer")) {                        
						replyMeth("For GeoServer, I recommend: Python, Docker, Linux");

					}
					else if(text.contains("Operating System")) {                        
						replyMeth("For Operating System, I recommend: Docker, Linux, AI");

					}
					else if(text.contains("Computer Graphics")) {                        
						replyMeth("For Computer Graphics, I recommend: AI, QGIS, Operating System");

					}
					else if(text.contains("System Analysis")) {                        
						replyMeth("For System Analysis, I recommend: AI, Docker, Linux");

					}
					else if(text.contains("XMPP")) {                        
						replyMeth("For XMPP, I recommend: AI, Crypto Currency, Docker");

					}
					else if(text.contains("Linux")) {                        
						replyMeth("For Linux, I recommend: AI, GPS, Docker");

					}
					else if(text.contains("Blockchain Security")) {                        
						replyMeth("For Blockchain Security, I recommend: AI, SSH, WireShark");
					}
					else if(text.contains("SSH")) {                        
						replyMeth("For SSH, I recommend: Python, WireShark, Ransomware");
					}
					else if(text.contains("Ransomware")) {                        
						replyMeth("For Ransomware, I recommend: AI, SSH, WireShark");
					}
					else if(text.contains("Digital Forensics")) {                        
						replyMeth("For Digital Forensics, I recommend: AI, SSH, Ransomware");
					}
					else if(text.contains("Ethical Hacking")) {                        
						replyMeth("For Ethical Hacking, I recommend: AI, SSH, Ransomware");
					}
					else if(text.contains("Cyber Security Analysis")) {                        
						replyMeth("For Cyber Security Analysis, I recommend: AI, SSH, WireShark");
					} 
					else if(text.contains("WireShark")) {                        
						replyMeth("For WireShark, I recommend: C++, SSH, Ransomware");
					} 
					else if(text.contains("Cyber Warfare")) {                        
						replyMeth("For Cyber Warfare, I recommend: AI, SSH, WireShark");
					} 
					else if(text.contains("ECommerce Frauds")) {                        
						replyMeth("For ECommerce Frauds, I recommend: AI, WireShark, Ransomware");
					} 
					else if(text.contains("Nmap")) {                        
						replyMeth("For Nmap, I recommend: Python, WireShark, Blockchain Security");
					} 
					else if(text.contains("OpenVas")) {                        
						replyMeth("For OpenVas, I recommend: Python, WireShark, SSH");
					} 
					else if(text.contains("Neural Network")) {                        
						replyMeth("For Neural Network, I recommend: AI, Java, Tensorflow");
					} 
					else if(text.contains("Outlier Detection Algorithms")) {                        
						replyMeth("For Outlier Detection Algorithms, I recommend: AI, Java, Tensorflow");
					} 
					else if(text.contains("ReasonML")) {                        
						replyMeth("For ReasonML, I recommend: Python, Neural Network, Chatbot");
					} 
					else if(text.contains("Big Data")) {                        
						replyMeth("For Big Data, I recommend: AI, Java, Tensorflow");
					} 
					
					else if(text.contains("Time Series Analysis")) {                        
						replyMeth("For Time Series Analysis, I recommend: AI, Java, Tensorflow");
					} 
					else if(text.contains("Deep Learning")) {                        
						replyMeth("For Deep Learning, I recommend: AI, Python, Tensorflow");

					}
					else if(text.contains("AI")) {                        
						replyMeth("For AI, I recommend: Python, Tensorflow, Deep Learning");

					}
					else if(text.contains("Support Vector Machines")) {                        
						replyMeth("For Support Vector Machines, I recommend: Python, Tensorflow, Deep Learning");

					}
					else if(text.contains("Data Visualization")) {                        
						replyMeth("For Data Visualization, I recommend: AI, Java, Tensorflow");
					}
					else if(text.contains("Data Analytics")) {                        
						replyMeth("For Data Analytics, I recommend: AI, Java, Tensorflow");
					}
					else if(text.contains("Seaborn")) {                        
						replyMeth("For Seaborn, I recommend: Docker, AI, Deep Learning");
					}
					else if(text.contains("Automation")) {                        
						replyMeth("For Automation, I recommend: AI, Java, Tensorflow");
					}
					else if(text.contains("Applied Statistics")) {                        
						replyMeth("For Applied Statistics, I recommend: AI, Python, Deep Learning");
					}
					else if(text.contains("Image Processing")) {                        
						replyMeth("For Image Processing, I recommend: AI, Java, Tensorflow");
					} 
					else if(text.contains("Chatbot")) {                        
						replyMeth("For Chatbot, I recommend: AI, Java, Tensorflow");
					} 
					else if(text.contains("Genetic Algorithms")) {                        
						replyMeth("For Genetic Algorithms, I recommend: AI, Java, Tensorflow");
					} 
					else if(text.contains("Tensorflow")) {                        
						replyMeth("For Tensorflow, I recommend: AI, Java, Deep Learning");
					} 
					else if(text.contains("Net Framework")) {                        
						replyMeth("For Net Framework, I recommend: AI, Java, PHP");
					} 
					else if(text.contains("MATLAB")) {                        
						replyMeth("For MATLAB, I recommend: AI, Java, PHP");
					} 
					else if(text.contains("Python")) {                        
						replyMeth("For Python, I recommend: AI, Java, PHP");
					} 
					else if(text.contains("Rust")) {                        
						replyMeth("For Rust, I recommend: AI, Java, PHP");
					} 
					else if(text.contains("Julia")) {                        
						replyMeth("For Julia, I recommend: AI, Python, Java");
					} 
					else if(text.contains("JavaScript")) {                        
						replyMeth("For JavaScript, I recommend: AI, Java, PHP");
					} 
					else if(text.contains("COBOL")) {                        
						replyMeth("For COBOL, I recommend: AI, Java, PHP");
					} 
					else if(text.contains("Clojure")) {                        
						replyMeth("For Clojure, I recommend: AI, Java, PHP");

					}
					else if(text.contains("C++")) {                        
						replyMeth("For C++, I recommend: AI, Java, PHP");

					}
					
					else if(text.contentEquals("C")) {                        
						replyMeth("For C, I recommend: AI, Java, PHP");
					} 
					
					else if(text.contains("Ruby")) {                        
						replyMeth("For Ruby, I recommend: AI, Java, PHP");
					} 
					
					else if(text.contains("Java")) {                        
						replyMeth("For Java, I recommend: AI, Python, PHP");

					}
					else if(text.contains("PHP")) {                        
						replyMeth("For PHP, I recommend: AI, Python, Java");
					}
					else if(text.contains("Perl")) {                        
						replyMeth("For Perl, I recommend: AI, Java, PHP");
					}
					else if(text.contains("SQL")) {                        
						replyMeth("For SQL, I recommend: AI, Java, PHP");
					}
					else if(text.contains("Prolog")) {                        
						replyMeth("For Prolog, I recommend: AI, Java, PHP");
					}
					else if(text.contains("TypeScript")) {                        
						replyMeth("For TypeScript, I recommend: AI, Java, PHP");
					}
					else if(text.contains("Groovy")) {                        
						replyMeth("For Groovy, I recommend: AI, Java, PHP");
					} 
								
					else 
						replyMeth("Pls enter valid subject name!");
					
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



public class ChatBotReg {                                     //Driver Class

	public static void main(String[] args) {             //main class
		
          new Chatbot2();                                  // instantiation 
	}

}
