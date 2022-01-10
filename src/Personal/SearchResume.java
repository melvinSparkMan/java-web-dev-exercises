package Personal;

import java.io.*;
import java.util.*;

import java.util.Locale;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class SearchResume {
    public static void main(String[] args) {
        Scanner input;
        String theApplicant;
        String anotherApplicant;
        String applicantNumber3;
        String melvinSparkManResume;

        String theResume;
        String toolSet;
        int theResumeLength = 0;
        int foundAtIndexOf = 0;

        melvinSparkManResume = "PROFESSIONAL SUMMARY\n" +
                "United States Marine Corps veteran who has been shaped by discipline, dependability and teamwork. Hailing from a\n" +
                "long engineering career requiring technical agility, creative thinking, and complex problem solving. Now desiring\n" +
                "emphasis on invigorating that next challenge in and around data collection, data mining, and data modeling\n" +
                "RELEVANT SKILLS\n" +
                "Competence in Microsoft Office and Adobe Illustrator. Highly motivated, adaptable, and a driven self-starter with\n" +
                "strong organizational skills with an excellent track record in confidentiality and integrity.\n" +
                "WORK EXPERIENCE\n" +
                "Walmart - #1161 Saint Charles, Missouri July 2016-August 2019\n" +
                "Warehousing/Inventory\n" +
                "• Maintain accurate flow of inventory from the backroom to the sales floor\n" +
                "• Conduct physical count of on-hand inventory and document results in company database\n" +
                "• Retrieve and reconcile store inventory counts and resolve discrepancies utilizing best practices\n" +
                "Ivy League Homes, LLC Florissant, Missouri December 2015-December 2016\n" +
                "Office Administrator\n" +
                "• Conducted and provided day to day office management and leveraged previously acquired computer skills\n" +
                "• Performed monthly accounting, bookkeeping and other general clerical duties\n" +
                "• Generated leases, conducted property walk-throughs, accurately posted tenant payments and\n" +
                "communicated tenant responsibilities and expectations\n" +
                "• Collected and deposited monthly rents; performed accounts receivables in accounting spreadsheets\n" +
                "• Handled day-to-day tenant communication, including the preparation and serving of all notices\n" +
                "• Mitigated and reconciled complaints and situations in a timely manner\n" +
                "• Generated custom spreadsheets as a form of records management and reports creation\n" +
                "• Demonstrated strong organizational skills, telephone etiquette and communication skills\n" +
                "Intel Corporation Folsom, California November 2001-October 2014\n" +
                "Analog Engineer\n" +
                "• Created schematics and physical layouts of integrated DDR4/GDDR5 interfaces consistent with process,\n" +
                "functional, or performance constraints\n" +
                "• Investigated characteristics such as performance, or process capability of potential device designs, using\n" +
                "simulation, verification software or test bench\n" +
                "• Created or maintained formal engineering documents, such as schematics, components or library\n" +
                "specifications, or data sheet requirements\n" +
                "• Conducted analyses addressing issues such as failure, reliability, or yield improvement\n" +
                "• Possessed knowledge and prediction of physical principles, their interrelationships, and applications to\n" +
                "understanding device dynamics, including but not limited to, at the electron level and process\n" +
                "• Planned or scheduled engineering research or development projects involving submicron technologies\n" +
                "• Served as a technical lead and individual contributor, ensuring the consistent meeting of individual and\n" +
                "team goals\n" +
                "EDUCATION\n" +
                "Northwestern Electronics Institute, Minneapolis, MN\n" +
                "Associate of Science, Electronic Technology\n" +
                "American InterContinental University, Schaumburg, IL\n" +
                "Bachelor of Arts, Communication";
        applicantNumber3 = "Web developer. Graphic Design. Product development\n" +
                "Seattle, Washington\n" +
                "Full Stack Web Developer with a strong eye for design. React, Meteor, Angular, Rails, JavaScript, HTML, CSS, UX, Animation. Previous experience as a product manager and designer.\n" +
                "C\n" +
                "S\n" +
                "WORK EXPERIENCE\n" +
                "FREELANCE WEB DEVELOPER AND GRAPHIC DESIGNER\n" +
                "Jan 2017 - Current\n" +
                "Web apps and websites creation. Graphic design. Product development.\n" +
                "\n" +
                "React, Meteor, Angular\n" +
                "Javascript, HTML, CSS\n" +
                "Ruby on Rails API\n" +
                "JS and CSS Animations\n" +
                "CROWDCUBE LIMITED\n" +
                "Front-end Engineer | Apr 2016 - Jan 2017\n" +
                "Crowdcube is the world's leading equity crowdfunding platform. It enables everyday investors to invest alongside Europe’s leading venture capitalists in start-up, early stage and growth businesses.\n" +
                "\n" +
                "Technology: Javascript, HTML, CSS, React, Es6, PHP, Webpack\n" +
                "In charge of creating and integrating new design frameworks and components for the web app.\n" +
                "Features developed: New pitch page, secondary markets, funded company, full redesign of the homepage/ information pages.\n" +
                "EMOOV.CO.UK\n" +
                "Full Stack Developer | May 2015 - Apr 2016\n" +
                "eMoov is UK’s No.1 Hybrid Estate Agent.\n" +
                "\n" +
                "As part of a team of five full-stack developers I designed and built aspects of the eMoov customer web site and property-listing management site using Angular & Django. Responsible for peer code reviews, involved in sprint planning and both technical and UX design reviews.\n" +
                "\n" +
                "Technology - Javascript, Angular, Python, Django, API integration, HTML, SCSS, Git\n" +
                "Features developed - Book viewings, checkout, signup flow, Ratesetter API integration, CRM API integration\n" +
                "BLUEQUEST\n" +
                "Web Developer | Sep 2014 - May 2015\n" +
                "Small digital creative agency. Responsible for the development of immersive, full-page, responsive ads for blue-chip clients. Worked as part of a team of developers and designers creating micro-sites for national advertising campaigns. Building of front & back ends for games and competitions.\n" +
                "\n" +
                "Technology - HTML5, SCSS, Javascript, PHP, Wordpress, Action Script 3, CSS Animations, Greensock\n" +
                "Clients - Microsoft, Cadbury, Reebok, Twinings, British Airways, Vodafone, American Express, GoCompare, Shell\n" +
                "GENERAL ASSEMB.LY\n" +
                "Web Development Immersive Program | Apr 2014 - Aug 2014\n" +
                "Student @General Assemb.ly WDI program. Front-end and Back-end Web Development.\n" +
                "\n" +
                "Ruby, JavaScript, HTML, SQL, Git, Rails, Backbone, jQuery, AJAX, CoffeeScript, Underscore, AWS, Heroku.\n" +
                "\n" +
                "Muzup - Social app built with Ruby on Rails. Postgres. File upload with CarrierWave + Amazon S3.\n" +
                "Readr - Social RSS Feed Reader app. Ruby on Rails. Rake task using Nokogiri.\n" +
                "Hackathon - World Cup Pub Finder app. Used gov data. CSV parsing. Yelp API. Maps.\n" +
                "Citynsider - Map generator based on interests. Yelp API. Google Maps and Directions API.\n" +
                "Washit - CRM app. Booking system, Admin dashboard.\n" +
                "YIELDIFY\n" +
                "Senior Digital Project Manager | Sep 2013 - May 2014\n" +
                "On-site retargeting campaigns and technology\n";
        String jobPosting2 = "JavaScript Jedi, Mark Up Master… VedaPointe seeks a passionate Full Stack developer with a strong knowledge of user interface development practices and a proven ability to integrate with complex back-end systems. You must possess a passion for the web and for creating exceptional user experiences in various digital media – such as web and mobile, as well as deliver front-end components for complex web development efforts.\n" +
                "\n" +
                "You create error-free code from content in various digital formats, deliver real-time posting requests, bring architect and designer vision for our products to life, love raw code and can work independently or with a team.\n" +
                "Responsibilities\n" +
                "• Create and maintain web applications that scale infinitely in the cloud.\n" +
                "• Implement efficient code that consumes massive data sets and presents our end customers with elegant ways of understanding information.\n" +
                "• Identify, design, and implement internal process improvements: automating manual processes, optimizing data delivery, re-designing infrastructure for greater scalability, etc.\n" +
                "• Be the bridge between our data and and analytics teams, and our end customers, that truly tells a visually compelling story about the information we provide.\n" +
                "• Work with stakeholders including the Executive, Development, and Advanced Analytics teams to assist with data-related technical issues and support their data infrastructure needs.\n" +
                "• Work with data and analytics experts to strive for greater functionality in our applications.\n" +
                "Qualifications\n" +
                "• Always be hungry to learn and innovate with new technologies and techniques to build the very best of commercial software in the world.\n" +
                "• Advanced technical aptitude with modern web application frameworks and experience working against relational databases and big data/NoSQL structures are required.\n" +
                "• Experience in consuming streaming/real-time data and visualizing in a web application framework.\n" +
                "• Experience in creating API/abstraction layers for both public/private consumption.\n" +
                "• Experience performing root cause analysis on applications and processes to answer diagnose and remediate issues.\n" +
                "• Commercial web application development is a plus.\n" +
                "• Working knowledge of message queuing, stream processing, and highly scalable ‘big data’ data stores.\n" +
                "• Experience supporting and working with cross-functional teams in a dynamic environment.\n" +
                "• 2+ years of experience in a UX Developer role, who has attained a degree in Computer Science, Statistics, Informatics, Information Systems or another quantitative field. They should also have experience using the following software/tools:\n" +
                "• Vue and node.js are preferred, but other modern web application frameworks are appreciated.\n" +
                "• Big data tools: Hadoop, Spark, Kafka, etc.\n" +
                "• Relational SQL and NoSQL databases, including Postgres and Cassandra.\n" +
                "• AWS/Azure/GCP cloud services to deploy large scale web applications.\n" +
                "• Stream-processing systems: Storm, Spark-Streaming, etc.\n" +
                "• Object-oriented/object function scripting languages: Python, Java, C++, Scala, etc. is a plus.";
        String jobPosting1 = "As a software developer, you’re an artist. You’re able to bring thoughts and ideas to life and deliver software solutions. You deserve an outlet for your creativity and the freedom to let that happen. That’s what businesses in Ohio can offer you. If you have 4+ years of experience in programming in a variety of coding languages, have been exposed to front or backend technologies, and want the opportunity to join a development team at any number of companies in Ohio – we want you!";
        anotherApplicant = "We are looking for a software developer with 5+ years of experience to create and execute functional, practical programs. Throughout the job, you will have to collaborate with other programmers and software developers. Your main objective will be to develop powerful, high-quality, user-focused programs and systems. Job Requirements: Bachelor's degree (BSc/BA) in computer engineering, computer science or similar degree. Must understand in-depth the implications of software engineering. Previous, proven experience on a number of projects for software development. Experience with software designing in a test-driven environment. Deep knowledge of the frameworks/systems(AngularJS, Git) and coding language (e.g: C++, Javascript). The willingness to work in a constantly changing world. Ability to adapt to new technologies and software languages. Creativity is a bonus. Great communication and teamwork skills. Attentive to detail. Job Responsibilities: Work with programmers to build algorithms and flowcharts. Produce clean, usable, datatype-based software. Incorporate software components and programs from third parties. Validate and implement programs and systems. Fix, debug and improve existing software. Collect and analyze feedback from the client. Suggest and enact improvements. Create technical paperwork for reference and reporting purposes.";
        theResume = "FINDAWAY Senior Web Developer | Jun 2013 - Current CHEEZBURGER, INC. Front End Developer | Jul 2011 - Jun 2013 Build and maintain Front-end code for all Cheezburger sites using HTML, CSS, JavaScript, ASP.NET MVC, C#, Photoshop, and Illustrator. I built the mobile responsive site, something that was not planned or existed before. Users were grateful and feedback was positive. Created style guide to standardize visual elements and widgets for development and design. A tool that streamlined both design and development and became invaluable to both teams. Decreased friction and increased efficiency by creating a design to development process. Helped create and implement front end coding standards and practices Lead Agile stand-ups and retrospectives OFFICECOLOROFTHEDAY.COM Founder, Designer, and Developer | Mar 2011 - Apr 2013 Ruby on Rails, HTML, CSS, and JavaScript development. Strategy, planning and brand creation. ROSETTA Senior Interactive Developer | Feb 2008 - Jul 2011 Develop high quality front end code with focus on web standards and scalability. Created and maintained a framework for rapid construction and deployment of e-commerce websites. Utilized web standards including but not limited to XHTML, HTML5, CSS2, and CSS3. Created reusable javascript tools for accessible tabs and navigation menus using jQuery and Dojo. Created Adobe AIR applications using HTML, CSS, Javascript, and Actionscript 3. Learned and demoed the use of YUI CSS framework and HTML5 as part of the team’s standards. Clients Include: Brown Brothers Harriman (http://www.bbh.com/) MSC Industrial Supply (http://www.mscdirect.com/) Lincoln Electric (lincolnelectric.com) HHGregg (hhgregg.com) CROOKEDRIVERGROOVE.COM Freelance Web Developer | May 2007 - Apr 2008 Designed and developed Crookedrivergroove.com. Put together web based applications using PHP, CSS, XHTML, and MySQL CLEVELAND INDIANS BASEBALL CO. IS Desktop Support | Jun 2005 - Feb 2008 Helped to manage a Microsoft Windows network, supported Avaya phone systems, Apple OSX, and created intranet sites for special projects. OLI INTERACTIVE Freelance Web Developer | Sep 2007 - Dec 2007 Create websites using XHTML, CSS, ASP.NET and JavaScript.";
        theApplicant = "Full Stack Developer with 6+ years of hands-on experience designing, developing, and implementing applications and solutions using a range of technologies and programming languages. Seeking to leverage broad development experience and hands-on technical expertise in a challenging role as a Full-stack Developer. Professional Experience AGGREGATE SINGULARITY, INC., Atlanta, GA Full Stack Developer, September 2015 – Present Develop 10+ full-stack web applications to analyze and process data for different clients Ensure applications security and ability to interact with multiple APIs and databases Design and create a knowledge management platform on a knowledge graph, utilizing a range of technologies, including Node.js, Typescript, Dgraph, React, and Mobx Develop and implement a standalone data extraction “agent” and main-application features for a financial product Work closely with app development team including project and product manager, developers, and QA to determine problems, testing methods, and best practices Optimize company’s complaint handling process by creating and delivering highly efficient app-based solutions POWERPLAN, INC., Atlanta, GA Full Stack Developer, June 2011 – August 2015 Developed full-stack applications across various platforms using latest industry-adopted technologies and frameworks Played a key role in the development, improvement, and operation of web-based software Gained hands-on expertise in Bootstrap, Foundation, Express and similar back-end Node.js as well as front-end presentation frameworks web application frameworks Conducted unit and load testing for high profile customer facing applications, which reduced system failure rate by 70% Education GEORGIA INSTITUTE OF TECHNOLOGY, Atlanta, GA Bachelor of Science in Software Development, May 2011 Skills Programming Languages: HTML5, CSS3, Bootstrap, JavaScript, jQuery, AngularJS, ReactJS, JSON, Node, PHP, Ruby on Rails, and Normalize.css Databases: MongoDB, SQL, and PostgreSQL SpringBoot";
        String[] actionVerbs = {"lead", "design", "designed", "designing", "developed", "developing", "projects", "research", "implementing", "solutions", "manager", "managed", "planned", "maximized", "Stack", "applications", "technologies", "technology", "programming", "leverage", "experience", "expertise", "challenging", "challenge", "algorithm", "technical", "coding", "collaborate", "validate", "implement", "debug", "analyze", "analysis", "architect", "process", "clients", "High-quality", "Produce", "Incorporate", "Validate", "Implement", "Debug", "Improve", "Collect", "Analyze", "Suggest", "Adapt", "Test-driven", "Reporting" };
        String[] partsOfSpeech = {"let", "best", "join", "been", "with", "has", "all", "been", "as", "at", "an", "all", "by", "a", "but", "such", "and", "of", "the", "now", "if", "will", "be", "your", "from", "do", "not", "are", "you", "and", "on", "for", "about", "across", "after", "a", "as", "to", "by"};
        toolSet = "LinkedIn Node Typescript Dgraph React PHP MVC Photoshop Illustrator HTML CSS Ruby Rails Angular SpringBoot Framework GitHub Java JavaScript FrontEnd BackEnd RAM processor graphics C# ASP NET Python SQL mySQL";
//        theResume = melvinSparkManResume.toLowerCase();
//        theResume = jobPosting2.toLowerCase();
        theResume = anotherApplicant.toLowerCase();
        theResume = theApplicant.toLowerCase();
        theResume = theResume.toLowerCase();
        int numberOfActionVerbs = 0;
        int numberOfPartsOfSpeech = 0;
        int numberOfTools = 0;

//        String partsOfSpeech = Collections.sort(thePrepositions); ;

        toolSet = toolSet.toLowerCase();
        String[] theTools = toolSet.split(" ");

        for (int i = 0; i < theResume.length(); i++) {
            for (int j = 0; j < partsOfSpeech.length; j++) {
                if (theResume.contains(partsOfSpeech[j]) == (true)) {
                    foundAtIndexOf = theResume.indexOf(partsOfSpeech[j]);
                    theResumeLength = theResume.length();
}
            }
        }

        String[] resumeArray = theResume.split(" ");

        for (int i = 0; i < resumeArray.length; i++) {
            for (int j = 0; j < actionVerbs.length; j++) {
                if (resumeArray[i].contains(actionVerbs[j]) == (true)) {
                    numberOfActionVerbs += 1;
                }
            }
        }
        Set<String> newResume = new HashSet<String>();

        for (int i = 0; i < resumeArray.length; i++) {
            for (int j = 0; j < partsOfSpeech.length; j++) {
                if (resumeArray[i].contains(partsOfSpeech[j]) == (true)) {
                    resumeArray[i] = resumeArray[i].replace(resumeArray[i], "");
                    newResume.add(resumeArray[i]);
                    numberOfPartsOfSpeech += 1;
                } else {
                    resumeArray[i] = resumeArray[i].replace(",", " ");
                    resumeArray[i] = resumeArray[i].replace("•,", " ");
                    resumeArray[i] = resumeArray[i].replace(".,", " ");
                    resumeArray[i] = resumeArray[i].replace("teamwork", " ");
                    newResume.add(resumeArray[i]);
                }
            }
        }
        for (int i = 0; i < resumeArray.length; i++) {
            for (int j = 0; j < theTools.length; j++) {
                if (resumeArray[i].contains(theTools[j]) == (true)) {
                    numberOfTools += 1;
                }
            }
        }
        System.out.println(numberOfTools + " Tools Found.");
        System.out.println(numberOfActionVerbs + " Action Verbs Found.");
        System.out.println(numberOfPartsOfSpeech + " Parts of Speech Found. (" + (numberOfTools+numberOfActionVerbs+numberOfPartsOfSpeech) +")");
        System.out.println(resumeArray.length + " Words Found in this Resume.");
        System.out.println("\nThe Tools: " + theTools.length);
        System.out.println("\n" + newResume);
    }
}
