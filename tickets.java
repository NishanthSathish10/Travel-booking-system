import java.io.*;
class tickets
{

    public static void book()throws IOException
    { InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter"+"\n"+"1 for national ticket destinations"+"\n"+"2 for international ticket destinations");
        System.out.println("3 to exit");
        int num=0;
        do
        {String n = br.readLine();
            try
            {num = Integer.parseInt(n);}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(num)
        { case 1 : national();
            break;
            case 2 : international();
            break;
            case 3 : main.main();
            default : System.out.println("Please enter the right choice");
            book();
        }
    }

    public static void national()throws IOException 
    {System.out.println("Here are the national destinations"+"\n"+"choose your choice");
        System.out.println("1 DELHI "+"\n"+"2 MUMBAI "+"\n"+"3 KOLKATA ");
        System.out.println("4 CHENNAI"+"\n"+"5 HYDERABAD"+"\n"+"6 PORT BLAIR ");
        System.out.println("7 PUNE"+"\n"+"8 AHMEDABAD"+"\n"+"9 LUCKNOW"+"\n"+"10 JAIPUR");
        System.out.println("11 SHIMLA"+"\n"+"12 MYSORE"+"\n"+"13 MANGALORE"+"\n"+"14 PANAJI");
        System.out.println("15 RANCHI"+"\n"+"16 PATNA"+"\n"+"17 DEHRADUN"+"\n"+"18 KOCHI");
        System.out.println("19 BHOPAL"+"\n"+"20 CHANDIGARH"+"\n"+"21 EXIT");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int num=0;
        do{
            try   
            {num = Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);

        switch(num)
        { case 1 : delhi();
            break;
            case 2 : mumbai();
            break;
            case 3 : kolkata();
            break;
            case 4 : chennai();
            break;
            case 5 : hyderabad();
            break;
            case 6 : portBlair();
            break;
            case 7 : pune();
            break;
            case 8 : ahmedabad();
            break;
            case 9 : lucknow();
            break;
            case 10 : jaipur();
            break;
            case 11 : shimla();
            break;
            case 12 : mysore();
            break;
            case 13 : mangalore();
            break;
            case 14 : panaji();
            break;
            case 15 : ranchi();
            break;
            case 16 : patna();
            break;
            case 17: dehradun();
            break;
            case 18 : kochi();
            break;
            case 19 : bhopal();
            break;
            case 20 : chandigarh();
            break;
            case 21 : book();
            break;
            default : System.out.println("Please enter the correct choice!!");
            national();
        }
    }

    public static void delhi()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Delhi, India’s capital territory, is a massive metropolitan area in the country’s north.");
        System.out.println("In Old Delhi, a neighborhood dating to the 1600s, stands the imposing Mughal-era Red Fort, a symbol of India.");
        System.out.println("Enter the mode of transport");
        System.out.println("1:Airways"+"\n"+ "2:Railways"+"\n"+"3:Exit");
        int a=0;
        do{
            try
            {a =Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(a)
        { case 1 :System.out.println("The cost of Air ticket to Delhi is ");
            System.out.println("Adult:Rs 6700 "+"\n"+"Children:Rs 6400");
            System.out.println("Enter 1 to continue else anything else to exit");
            int b=0;
            do{
                try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults"); int NoAdult=0;
                do{
                    try 
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do{
                    try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do{
                    try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 : int Adult=6700 ; int Children=6400 ;String city="DELHI";String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : delhi();
                }
                break;
                default : delhi();
            }

            break;
            case 2 :System.out.println("The cost of railway ticket to Delhi is ");
            System.out.println(" Adult: Rs 6800"+"\n"+"Children: Rs 6400");
            System.out.println("Enter 1 to continue else any other number to exit");int q=0;
            do{
                try
                {q=Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(q)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do{
                    try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do{
                    try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The no of adults:"+NoAdult+"\n"+"The number of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else any other number to exit");int qu=0;
                do{
                    try
                    {qu=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(qu)
                {case 1 : int Adult=6800 ; int Children=6400 ;String city="DELHI";String mode="RAILWAY";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : delhi();
                }
                break;
                default : delhi();
            }
            break;
            case 3 : national();
            break;
            default : System.out.println("Please enter the correct choice");
            delhi();
        }
    }

    public static void mumbai()throws IOException
    {InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("Mumbai (formerly called Bombay) is a densely populated city on India’s west coast. A financial center, it's India's largest city.");
        System.out.println("Enter the mode of transport");
        System.out.println("1 : Airways"+"\n"+ "2:Railways"+"\n"+"3:Roadways"+"\n"+"4.Exit");int a=0;
        do
        {
            try
            {a =Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(a)
        { case 1 : System.out.println("The cost of Air ticket to Mumbai is ");
            System.out.println(" Adult:Rs 4100 "+"\n"+"Children:Rs 3800");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            {case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                { try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                { try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 : int Adult=4100 ; int Children=3800 ;String city="MUMBAI";String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : mumbai();
                }
                break;
                default : mumbai();
            }

            break;
            case 2:System.out.println("The cost of railway ticket to Mumbai is ");
            System.out.println(" Adult: Rs 3355"+"\n"+"Children: Rs 3035");
            System.out.println("Enter 1 to continue else any other number to exit");int q=0;
            do
            { try
                {q=Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(q)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                { try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The no of adults:"+NoAdult+"\n"+"The number of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else any other number to exit");int qu=0;
                do
                { try
                    {qu=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(qu)
                {case 1 : int Adult=3355 ; int Children=3035 ;String city="MUMBAI";String mode="RAILWAY";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : mumbai();
                }
                break;
                default : mumbai();
            }
            break; 
            case 3 : System.out.println("The cost of bus ticket to Mumbai is ");
            System.out.println(" Adult: Rs 1400"+"\n"+"Children: Rs 1200");
            System.out.println("Enter 1 to continue else any other number to exit");int r =0;
            do
            {try
                {r=Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(r)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The no of adults:"+NoAdult+"\n"+"The number of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else any other number to exit");int qu=0;
                do
                {try
                    {qu=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(qu)
                {case 1 : int Adult=1400 ; int Children=1200 ;String city="MUMBAI";String mode="BUS";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : mumbai();
                }
                break;
                default : mumbai();
            }
            break; 
            case 4 : national();
            break;
            default:System.out.println("Please enter the right choice!!");
            mumbai();
        }
    }

    public static void kolkata()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Kolkata (formerly Calcutta) is the capital of India's West Bengal state.");
        System.out.println("Today it’s known for its grand colonial architecture, art galleries and cultural festivals.");
        System.out.println("Enter the mode of transport");
        System.out.println("1 : Airways"+"\n"+ "2:Railways"+"\n"+"3:Exit");int a=0; 
        do
        {try
            {a =Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(a)
        { case 1 :System.out.println("The cost of Air ticket to Kolkata is ");
            System.out.println(" Adult:Rs 4100 "+"\n"+"Children:Rs 3900");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    { NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 4100 ; int Children=3900 ; String city="KOLKATA";String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : kolkata();
                }
                break;
                default : kolkata();
            }
            break;
            case 2 :System.out.println("The cost of railway ticket to kolkata is ");
            System.out.println(" Adult: Rs 2840"+"\n"+"Children: Rs 2440");
            System.out.println("Enter 1 to continue else any other number to exit");int q=0;
            do
            {try
                {q=Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(q)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The no of adults:"+NoAdult+"\n"+"The number of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else any other number to exit");int qu=0;
                do
                {try
                    {qu=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(qu)
                {case 1 : int Adult=2840 ; int Children=2440 ;String city="KOLKATA";String mode="RAILWAY";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : kolkata();
                }
                break;
                default : kolkata();
            }
            break;
            case 3 : national();
            break;
            default : System.out.println("Please enter the correct choice");
            kolkata();
        }
    }

    public static void chennai()throws IOException
    {InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("Chennai, on the Bay of Bengal in eastern India, is the capital of the state of Tamil Nadu.");
        System.out.println("Enter the mode of transport");
        System.out.println("1 : Airways"+"\n"+ "2:Railways"+"\n"+"3:Roadways"+"\n"+"4.Exit");int a=0;  
        do
        {try
            {a =Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(a)
        { case 1 : System.out.println("The cost of Air ticket to Chennai is ");
            System.out.println(" Adult:Rs 3900 "+"\n"+"Children:Rs 3700");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            {case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 : int Adult=3900 ; int Children=3700 ;String city="CHENNAI";String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : chennai();
                }
                break;
                default : chennai();
            }

            break;
            case 2:System.out.println("The cost of railway ticket to Chennai is ");
            System.out.println(" Adult: Rs 1440"+"\n"+"Children: Rs 1240");
            System.out.println("Enter 1 to continue else any other number to exit");int q=0;
            do
            {try
                {q=Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(q)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The no of adults:"+NoAdult+"\n"+"The number of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else any other number to exit");int qu=0;
                do
                {try
                    {qu=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(qu)
                {case 1 : int Adult=1440 ; int Children=1240 ;String city="CHENNAI";String mode="RAILWAY";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : chennai();
                }
                break;
                default : chennai();
            }
            break; 
            case 3 : System.out.println("The cost of bus ticket to Chennai is ");
            System.out.println(" Adult: Rs 900"+"\n"+"Children: Rs 800");
            System.out.println("Enter 1 to continue else any other number to exit");int r=0;
            do
            {try
                {r=Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(r)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The no of adults:"+NoAdult+"\n"+"The number of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else any other number to exit");int qu=0;
                do
                {try
                    {qu=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(qu)
                {case 1 : int Adult=900 ; int Children=800 ;String city="CHENNAI";String mode="BUS";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : chennai();
                }
                break;
                default : chennai();
            }
            break; 
            case 4 : national();
            break;
            default:System.out.println("Please enter the right choice!!");
            chennai();
        }
    }

    public static void hyderabad()throws IOException
    {InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("Hyderabad is the capital of southern India's Telangana state.");
        System.out.println("The Charminar, a 16th-century mosque whose 4 arches support towering minarets, is an old city landmark near the long-standing Laad Bazaar.");
        System.out.println("Enter the mode of transport");
        System.out.println("1 : Airways"+"\n"+ "2:Railways"+"\n"+"3:Roadways"+"\n"+"4.Exit");int a=0;  
        do
        {try
            {a =Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(a)
        { case 1 : System.out.println("The cost of Air ticket to Hyderabad is ");
            System.out.println(" Adult:Rs 3000 "+"\n"+"Children:Rs 2900");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            {case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 : int Adult=3000 ; int Children=2900 ;String city="HYDERABAD";String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : hyderabad();
                }
                break;
                default : hyderabad();
            }

            break;
            case 2:System.out.println("The cost of railway ticket to Hyderabad is ");
            System.out.println(" Adult: Rs 2840"+"\n"+"Children: Rs 2540");
            System.out.println("Enter 1 to continue else any other number to exit");int q=0;
            do
            {try
                {q=Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(q)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The no of adults:"+NoAdult+"\n"+"The number of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else any other number to exit");int qu=0;
                do
                {try
                    {qu=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(qu)
                {case 1 : int Adult=2840 ; int Children=2540 ;String city="HYDERABAD";String mode="RAILWAY";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : hyderabad();
                }
                break;
                default : hyderabad();
            }
            break; 
            case 3 : System.out.println("The cost of bus ticket to Hyderabad is ");
            System.out.println(" Adult: Rs 1700"+"\n"+"Children: Rs 1650");
            System.out.println("Enter 1 to continue else any other number to exit");int r=0;
            do
            {try
                {r=Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(r)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The no of adults:"+NoAdult+"\n"+"The number of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else any other number to exit");int qu=0;
                do
                {try
                    {qu=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(qu)
                {case 1 : int Adult=1700 ; int Children=1650 ;String city="HYDERABAD";String mode="BUS";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : hyderabad();
                }
                break;
                default : hyderabad();
            }
            break; 
            case 4 : national();
            break;
            default:System.out.println("Please enter the right choice!!");
            hyderabad();
        }
    }

    public static void portBlair()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Port Blair on South Andaman Island is the capital city of the Andaman and Nicobar Islands, an Indian territory in the Bay of Bengal.");
        System.out.println("The Anthropological Museum focuses on the islands’ indigenous tribes.");
        System.out.println("Enter the mode of transport");
        System.out.println("1 : Airways"+"\n"+ "2:Exit");int a=0;  
        do
        {try
            {a =Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);

        switch(a)
        { case 1 :System.out.println("The cost of Air ticket to PORT BLAIR is ");
            System.out.println(" Adult:Rs 9000 "+"\n"+"Children:Rs 8700");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);

            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);

                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 9000; int Children=8700 ; String city="PORT BLAIR"; String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : portBlair();
                }
                break;
                default : portBlair();
            }
            break;
            case 2 : national();
            break;
            default :System.out.println("Please enter the right choice!!");
            portBlair(); 
        }
    }

    public static void calcCost(int a,int b,int c,int d,String x,String y)throws IOException
    {InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        int subTotal=(a*c)+(b*d);
        System.out.println("The subtotal for your "+ y + " ticket to " + x +" is "+ subTotal+" /-");
        System.out.println("ENTER 1 to CONFIRM THE BOOKING else anything else to CANCEL");int ch=0;
        do
        {try
            {ch=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(ch)
        { case 1:billing.ticket(a,b,c,d,x,y);
            break;
            default:book();
        }
    }

    public static void international()throws IOException
    {InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Here are the international destinations"+"\n"+"choose your choice");
        System.out.println("1 DUBAI "+"\n"+"2 LAS VEGAS "+"\n"+"3 PARIS ");
        System.out.println("4 SINGAPORE "+"\n"+"5 BARCELONA"+"\n"+"6 SYDNEY "+"\n"+"7 LONDON"  );
        System.out.println("8 MOSCOW"+"\n"+"9 NEW YORK"+"\n"+"10 LOS ANGELES"+"\n"+"11 BANGKOK");
        System.out.println("12 SHANGHAI"+"\n"+"13 KAULA LUMPUR"+"\n"+"14 TOKYO"+"\n"+"15 VENICE");
        System.out.println("16 ROME"+"\n"+"17 AMSTERDAM"+"\n"+"18 RIO DE JANEIRO");
        System.out.println("19 JOHANNESBURG"+"\n"+"20 BEIJING"+"\n"+"21 EXIT");int num=0;
        do
        {try
            {num = Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(num)
        {   case 1 : dubai();
            break;
            case 2 : lasVegas();
            break;
            case 3 : paris();
            break;
            case 4 : singapore();
            break;
            case 5 : barcelona();
            break;
            case 6 : sydney();
            break;
            case 7 : london();
            break;
            case 8 : moscow();
            break;
            case 9 : newYork();
            break;
            case 10 : losAngeles();
            break;
            case 11 : bangkok();
            break;
            case 12 : shanghai();
            break;
            case 13 : kualaLumpur();
            break;
            case 14 : tokyo();
            break;
            case 15 : venice();
            break;
            case 16 : rome();
            break;
            case 17 : amsterdam();
            break;
            case 18 : rioDeJaneiro();
            break;
            case 19 : johannesburg();
            break;
            case 20 : beijing();
            break;
            case 21 : book();
            break;
            default : System.out.println("Please enter the correct choice!!");
            international();
        }
    }

    public static void dubai()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Dubai is a city and emirate in the United Arab Emirates known for luxury shopping, ultramodern architecture and a lively nightlife scene.");
        System.out.println("Burj Khalifa, an 830m-tall tower, dominates the skyscraper-filled skyline. At its foot lies Dubai Fountain, with jets and lights choreographed to music.");
        System.out.println("On artificial islands just offshore is Atlantis, The Palm, a resort with water and marine-animal parks.");
        System.out.println("Enter 1 to continue else any other number to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of Air ticket to DUBAI is ");
            System.out.println(" Adult:Rs 15000 "+"\n"+"Children:Rs 14700");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 15000 ; int Children=14700 ; String city="DUBAI"; String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : dubai();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void lasVegas()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Las Vegas, in Nevada’s Mojave Desert, is a resort city famed for its vibrant nightlife,centered around 24-hour casinos and other entertainment options.");
        System.out.println("This boulevard is home to themed hotels with elaborate displays such as fountains synchronized to music as well as replicas of an Egyptian pyramid, the Venetian Grand Canal, and the Eiffel Tower.");
        System.out.println("Enter 1 to continue else any other number to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of Air ticket to LAS VEGAS is ");
            System.out.println(" Adult:Rs 50000 "+"\n"+"Children:Rs 47000");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 50000 ; int Children=47000 ; String city="LAS VEGAS"; String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : lasVegas();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void singapore()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Singapore, an island city-state off southern Malaysia, is a global financial center with a tropical climate and multicultural population.");
        System.out.println(" In Singapore's circa-1820 Chinatown stands the red-and-gold Buddha Tooth Relic Temple, said to house one of Buddha's teeth.");
        System.out.println("Enter 1 to continue else any other number to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of Air ticket to SINGAPORE is ");
            System.out.println(" Adult:Rs 22000 "+"\n"+"Children:Rs 21000");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 22000 ; int Children=21000 ; String city="SINGAPORE"; String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : singapore();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void barcelona()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Barcelona, the cosmopolitan capital of Spain’s Catalonia region, is known for its art and architecture.");
        System.out.println("The fantastical Sagrada Família church and other modernist landmarks designed by Antoni Gaudí dot the city.");
        System.out.println("Museu Picasso and Fundació Joan Miró feature modern art by their namesakes. City history museum MUHBA, includes several Roman archaeological sites.");
        System.out.println("Enter 1 to continue else any other number to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of Air ticket to BARCELONA is ");
            System.out.println(" Adult:Rs 31000 "+"\n"+"Children:Rs 30000");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 4999 ; int Children=4599 ; String city="BARCELONA"; String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : barcelona();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void sydney()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Sydney, capital of New South Wales and one of Australia's largest cities, is best known for its harbourfront Sydney Opera House, with a distinctive sail-like design.");
        System.out.println("Sydney Tower’s outdoor platform, the Skywalk, offers 360-degree views of the city and suburbs.");
        System.out.println("Enter 1 to continue else any other number to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of Air ticket to SYDNEY is ");
            System.out.println(" Adult:Rs 70000 "+"\n"+"Children:Rs 69000");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 70000 ; int Children=69000; String city="SYDNEY"; String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : sydney();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void paris()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Paris, France's capital, is a major European city and a global center for art, fashion, gastronomy and culture.");
        System.out.println("Its 19th-century cityscape is crisscrossed by wide boulevards and the River Seine.");
        System.out.println("Beyond such landmarks as the Eiffel Tower,the city is known for its cafe culture and designer boutiques");
        System.out.println("Enter 1 to continue else any other number to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of Air ticket to PARIS is ");
            System.out.println(" Adult:Rs 24000 "+"\n"+"Children:Rs 23000");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 24000 ; int Children=23000 ; String city="PARIS"; String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : paris();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void pune()throws IOException
    {InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("Pune is a sprawling city in the western Indian state of Maharashtra.");
        System.out.println("It's known for the grand Aga Khan Palace, built in 1892 and now a memorial to Mahatma Gandhi, whose ashes are preserved in the garden.");
        System.out.println("Enter the mode of transport");
        System.out.println("1 : Airways"+"\n"+ "2:Railways"+"\n"+"3:Roadways"+"\n"+"4.Exit");int a=0; 
        do
        {try
            {a =Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(a)
        { case 1 : System.out.println("The cost of Air ticket to PUNE is ");
            System.out.println(" Adult:Rs 3200 "+"\n"+"Children:Rs 3000");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            {case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 : int Adult=3200 ; int Children=3000 ;String city="PUNE";String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : pune();
                }
                break;
                default : pune();
            }

            break;
            case 2:System.out.println("The cost of railway ticket to PUNE is ");
            System.out.println(" Adult: Rs 3025"+"\n"+"Children: Rs 2825");
            System.out.println("Enter 1 to continue else any other number to exit");int q=0;
            do
            {try
                {q=Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(q)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The no of adults:"+NoAdult+"\n"+"The number of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else any other number to exit");int qu=0;
                do
                {try
                    {qu=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(qu)
                {case 1 : int Adult=3052 ; int Children=2825 ;String city="PUNE";String mode="RAILWAY";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : pune();
                }
                break;
                default : pune();
            }
            break; 
            case 3 : System.out.println("The cost of bus ticket to PUNE is ");
            System.out.println(" Adult: Rs 1200"+"\n"+"Children: Rs 1000");
            System.out.println("Enter 1 to continue else any other number to exit");int r=0;
            do
            {try
                {r=Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(r)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The no of adults:"+NoAdult+"\n"+"The number of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else any other number to exit");int qu=0;
                do
                {try
                    {qu=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(qu)
                {case 1 : int Adult=1200 ; int Children=1000 ;String city="PUNE";String mode="BUS";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : pune();
                }
                break;
                default : pune();
            }
            break; 
            case 4 : national();
            break;
            default:System.out.println("Please enter the right choice!!");
            pune();
        }
    }

    public static void ahmedabad()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Ahmedabad, in western India, is the largest city in the state of Gujarat. The Sabarmati River runs through its center.");
        System.out.println("On the western bank is the Gandhi Ashram at Sabarmati, which displays the spiritual leader’s living quarters and artifacts.");
        System.out.println("Enter the mode of transport");
        System.out.println("1 : Airways"+"\n"+ "2:Railways"+"\n"+"3:Exit");int a=0; 
        do
        {try
            {a =Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(a)
        { case 1 :System.out.println("The cost of Air ticket to AHMEDABAD is ");
            System.out.println(" Adult:Rs 6500 "+"\n"+"Children:Rs 6300");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 : int Adult=6500 ; int Children=6300 ;String city="AHMEDABAD";String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : ahmedabad();
                }
                break;
                default : ahmedabad();
            }

            break;
            case 2 :System.out.println("The cost of railway ticket to AHMEDABAD is ");
            System.out.println(" Adult: Rs 2495"+"\n"+"Children: Rs 2295");
            System.out.println("Enter 1 to continue else any other number to exit");int q=0;
            do
            {try
                {q=Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(q)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The no of adults:"+NoAdult+"\n"+"The number of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else any other number to exit");int qu=0;
                do
                {try
                    {qu=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(qu)
                {case 1 : int Adult=2495 ; int Children=2295 ;String city="AHMEDABAD";String mode="RAILWAY";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : ahmedabad();
                }
                break;
                default : ahmedabad();
            }
            break;
            case 3 : national();
            break;
            default : System.out.println("Please enter the correct choice");
            ahmedabad();
        }
    } 

    public static void lucknow()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Lucknow, a large city in northern India, is the capital of the state of Uttar Pradesh.");
        System.out.println("Enter the mode of transport");
        System.out.println("1 : Airways"+"\n"+ "2:Railways"+"\n"+"3:Exit");int a=0; 
        do
        {try
            {a =Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(a)
        { case 1 :System.out.println("The cost of Air ticket to LUCKNOW is ");
            System.out.println(" Adult:Rs 4000 "+"\n"+"Children:Rs 3900");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 : int Adult=4000 ; int Children=3900 ;String city="LUCKNOW";String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : lucknow();
                }
                break;
                default : lucknow();
            }

            break;
            case 2 :System.out.println("The cost of railway ticket to LUCKNOW is ");
            System.out.println(" Adult: Rs 2945"+"\n"+"Children: Rs 2645");
            System.out.println("Enter 1 to continue else any other number to exit");int q =0;
            do
            {try
                {q=Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(q)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The no of adults:"+NoAdult+"\n"+"The number of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else any other number to exit");int qu=0;
                do
                {try
                    {qu=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(qu)
                {case 1 : int Adult=2945 ; int Children=2645 ;String city="LUCKNOW";String mode="RAILWAY";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : lucknow();
                }
                break;
                default : lucknow();
            }
            break;
            case 3 : national();
            break;
            default : System.out.println("Please enter the correct choice");
            lucknow();
        }
    }

    public static void jaipur()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Jaipur is the capital of India’s Rajasthan state.");
        System.out.println("It evokes the royal family that once ruled the region and that, in 1727, founded what is now called the Old City, or “Pink City” for its trademark building color.");
        System.out.println("Enter the mode of transport");
        System.out.println("1 : Airways"+"\n"+ "2:Railways"+"\n"+"3:Exit");int a=0;  
        do
        {try
            {a =Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(a)
        { case 1 :System.out.println("The cost of Air ticket to JAIPUR is ");
            System.out.println(" Adult:Rs 7000 "+"\n"+"Children:Rs 6800");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 : int Adult=7000 ; int Children=6800 ;String city="JAIPUR";String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : jaipur();
                }
                break;
                default : jaipur();
            }

            break;
            case 2 :System.out.println("The cost of railway ticket to JAIPUR is ");
            System.out.println(" Adult: Rs 5335"+"\n"+"Children: Rs 5035");
            System.out.println("Enter 1 to continue else any other number to exit");int q=0;
            do
            {try
                {q=Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(q)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The no of adults:"+NoAdult+"\n"+"The number of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else any other number to exit");int qu=0;
                do
                {try
                    {qu=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(qu)
                {case 1 : int Adult=5335 ; int Children=5035 ;String city="JAIPUR";String mode="RAILWAY";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : jaipur();
                }
                break;
                default : jaipur();
            }
            break;
            case 3 : national();
            break;
            default : System.out.println("Please enter the correct choice");
            jaipur();
        }
    }

    public static void shimla()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Shimla is the capital of the northern Indian state of Himachal Pradesh, in the Himalayan foothills.");
        System.out.println("Enter the mode of transport");
        System.out.println("1 : Airways"+"\n"+ "2:Exit"); int a=0; 
        do
        {try
            {a =Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(a)
        { case 1 :System.out.println("The cost of Air ticket to SHIMLA is ");
            System.out.println(" Adult:Rs 4000 "+"\n"+"Children:Rs 3700");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 4999 ; int Children=4599 ; String city="SHIMLA"; String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : shimla();
                }
                break;
                default : shimla();
            }
            break;
            case 2 : national();
            break;
            default :System.out.println("Please enter the right choice!!");
            shimla(); 
        }
    }

    public static void mysore()throws IOException
    {InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("Mysore (or Mysuru), a city in India's southwestern Karnataka state, was the capital of the Kingdom of Mysore.");
        System.out.println("In its center is opulent Mysore Palace, seat of the former ruling Wodeyar dynasty.");
        System.out.println("Mysore is also home to the centuries-old Devaraja Market, filled with spices, silk and sandalwood.");
        System.out.println("Enter the mode of transport");
        System.out.println("1 : Airways"+"\n"+ "2:Railways"+"\n"+"3:Roadways"+"\n"+"4.Exit");int a=0;  
        do
        {try
            {a =Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(a)
        { case 1 : System.out.println("The cost of Air ticket to MYSORE is ");
            System.out.println(" Adult:Rs 2000 "+"\n"+"Children:Rs 1900");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            {case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 : int Adult=2000 ; int Children=1900 ;String city="MYSORE";String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : mysore();
                }
                break;
                default : mysore();
            }

            break;
            case 2:System.out.println("The cost of railway ticket to MYSORE is ");
            System.out.println(" Adult: Rs 1200"+"\n"+"Children: Rs 1000");
            System.out.println("Enter 1 to continue else any other number to exit");int q=0;
            do
            {try
                {q=Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(q)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The no of adults:"+NoAdult+"\n"+"The number of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else any other number to exit");int qu=0;
                do
                {try
                    {qu=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(qu)
                {case 1 : int Adult=1200 ; int Children=1000 ;String city="MYSORE";String mode="RAILWAY";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : mysore();
                }
                break;
                default : mysore();
            }
            break; 
            case 3 : System.out.println("The cost of bus ticket to MYSORE is ");
            System.out.println(" Adult: Rs 400"+"\n"+"Children: Rs 350");
            System.out.println("Enter 1 to continue else any other number to exit");int r=0;
            do
            {try
                {r=Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(r)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The no of adults:"+NoAdult+"\n"+"The number of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else any other number to exit");int qu=0;
                do
                {try
                    {qu=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(qu)
                {case 1 : int Adult=400 ; int Children=350 ;String city="MYSORE";String mode="BUS";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : mysore();
                }
                break;
                default : mysore();
            }
            break; 
            case 4 : national();
            break;
            default:System.out.println("Please enter the right choice!!");
            mysore();
        }
    }

    public static void mangalore()throws IOException
    {InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("Mangalore (or Mangaluru) is an Arabian Sea port and a major commercial center in the Indian state of Karnataka.");
        System.out.println("Tannirbhavi Beach is popular for its sunset views.");
        System.out.println("Enter the mode of transport");
        System.out.println("1 : Airways"+"\n"+ "2:Railways"+"\n"+"3:Roadways"+"\n"+"4.Exit");int a=0;  
        do
        {try
            {a =Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(a)
        { case 1 : System.out.println("The cost of Air ticket to MANGALORE is ");
            System.out.println(" Adult:Rs 2300 "+"\n"+"Children:Rs 2000");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            {case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 : int Adult=2300 ; int Children=2000 ;String city="MANGALORE";String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : mangalore();
                }
                break;
                default : mangalore();
            }

            break;
            case 2:System.out.println("The cost of railway ticket to MANGALORE is ");
            System.out.println(" Adult: Rs 1095"+"\n"+"Children: Rs 999");
            System.out.println("Enter 1 to continue else any other number to exit");int q=0;
            do
            {try
                {q=Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(q)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The no of adults:"+NoAdult+"\n"+"The number of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else any other number to exit");int qu=0;
                do
                {try
                    {qu=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(qu)
                {case 1 : int Adult=1095 ; int Children=999 ;String city="MANGALORE";String mode="RAILWAY";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : mangalore();
                }
                break;
                default : mangalore();
            }
            break; 
            case 3 : System.out.println("The cost of bus ticket to MANGALORE is ");
            System.out.println(" Adult: Rs 700"+"\n"+"Children: Rs 650");
            System.out.println("Enter 1 to continue else any other number to exit");int r=0;
            do
            {try
                {r=Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(r)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The no of adults:"+NoAdult+"\n"+"The number of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else any other number to exit");int qu=0;
                do
                {try
                    {qu=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(qu)
                {case 1 : int Adult=700 ; int Children=650 ;String city="MANGALORE";String mode="BUS";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : mangalore();
                }
                break;
                default : mangalore();
            }
            break; 
            case 4 : national();
            break;
            default:System.out.println("Please enter the right choice!!");
            mangalore();
        }
    } 

    public static void panaji()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Panaji is the capital of the Indian state of Goa and the headquarters of North Goa district.");
        System.out.println("It lies on the banks of the Mandovi River estuary in the Tiswadi taluka.");
        System.out.println("Enter the mode of transport");
        System.out.println("1 : Airways"+"\n"+ "2:Roadways"+"\n"+"3:Exit");int a=0; 
        do
        {try
            {a =Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(a)
        { case 1 :System.out.println("The cost of Air ticket to PANAJI is ");
            System.out.println(" Adult:Rs 3900 "+"\n"+"Children:Rs 3700");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 : int Adult=3900 ; int Children=3700 ;String city="PANAJI";String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : panaji();
                }
                break;
                default : panaji();
            }

            break;
            case 2 :System.out.println("The cost of bus ticket to PANAJI is ");
            System.out.println(" Adult: Rs 1400"+"\n"+"Children: Rs 1300");
            System.out.println("Enter 1 to continue else any other number to exit");int q=0;
            do
            {try
                {q=Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(q)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The no of adults:"+NoAdult+"\n"+"The number of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else any other number to exit");int qu=0;
                do
                {try
                    {qu=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(qu)
                {case 1 : int Adult=1400 ; int Children=1300 ;String city="PANAJI";String mode="BUS";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : panaji();
                }
                break;
                default : panaji();
            }
            break;
            case 3 : national();
            break;
            default : System.out.println("Please enter the correct choice");
            panaji();
        }
    }

    public static void ranchi()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Ranchi is the capital of the Indian state of Jharkhand, and its third most populous city of the state.");
        System.out.println("Enter the mode of transport");
        System.out.println("1 : Airways"+"\n"+ "2:Railways"+"\n"+"3:Exit");int a=0;  
        do
        {try
            {a =Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(a)
        { case 1 :System.out.println("The cost of Air ticket to RANCHI is ");
            System.out.println(" Adult:Rs 5000 "+"\n"+"Children:Rs 4900");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 : int Adult=5000 ; int Children=4900 ;String city="RANCHI";String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : ranchi();
                }
                break;
                default : ranchi();
            }

            break;
            case 2 :System.out.println("The cost of railway ticket to RANCHI is ");
            System.out.println(" Adult: Rs 4000"+"\n"+"Children: Rs 3800");
            System.out.println("Enter 1 to continue else any other number to exit");int q=0;
            do
            {try
                {q=Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(q)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The no of adults:"+NoAdult+"\n"+"The number of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else any other number to exit");int qu=0;
                do
                {try
                    {qu=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(qu)
                {case 1 : int Adult=4000 ; int Children=3800 ;String city="RANCHI";String mode="RAILWAY";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : ranchi();
                }
                break;
                default : ranchi();
            }
            break;
            case 3 : national();
            break;
            default : System.out.println("Please enter the correct choice");
            ranchi();
        }
    }

    public static void patna()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Patna is the capital and largest city of the state of Bihar in India.");
        System.out.println("Enter the mode of transport");
        System.out.println("1 : Airways"+"\n"+ "2:Railways"+"\n"+"3:Exit");int a=0;  
        do
        {try
            {a =Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(a)
        { case 1 :System.out.println("The cost of Air ticket to PATNA is ");
            System.out.println(" Adult:Rs 5700 "+"\n"+"Children:Rs 5400");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 : int Adult=5700 ; int Children=5400 ;String city="PATNA";String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : patna();
                }
                break;
                default : patna();
            }

            break;
            case 2 :System.out.println("The cost of railway ticket to PATNA is ");
            System.out.println(" Adult: Rs 3335"+"\n"+"Children: Rs 3135");
            System.out.println("Enter 1 to continue else any other number to exit");int q=0;
            do
            {try
                {q=Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(q)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The no of adults:"+NoAdult+"\n"+"The number of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else any other number to exit");int qu=0;
                do
                {try
                    {qu=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(qu)
                {case 1 : int Adult=3335 ; int Children=3135 ;String city="PATNA";String mode="RAILWAY";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : patna();
                }
                break;
                default : patna();
            }
            break;
            case 3 : national();
            break;
            default : System.out.println("Please enter the correct choice");
            patna();
        }
    }

    public static void dehradun()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Dehradun is the capital of the Indian state of Uttarakhand, near the Himalayan foothills.");
        System.out.println("Enter the mode of transport");
        System.out.println("1 : Airways"+"\n"+ "2:Railways"+"\n"+"3:Exit");int a=0;  
        do
        {try
            {a =Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(a)
        { case 1 :System.out.println("The cost of Air ticket to DEHRADUN is ");
            System.out.println(" Adult:Rs 5100 "+"\n"+"Children:Rs 4900");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=1;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 : int Adult=5100 ; int Children=4900 ;String city="DEHRADUN";String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : dehradun();
                }
                break;
                default : dehradun();
            }

            break;
            case 2 :System.out.println("The cost of railway ticket to DEHRADUN is ");
            System.out.println(" Adult: Rs 8000"+"\n"+"Children: Rs 7900");
            System.out.println("Enter 1 to continue else any other number to exit");int q=0;
            do
            {try
                {q=Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(q)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The no of adults:"+NoAdult+"\n"+"The number of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else any other number to exit");int qu=0;
                do
                {try
                    {qu=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(qu)
                {case 1 : int Adult=8000 ; int Children=7900 ;String city="DEHRADUN";String mode="RAILWAY";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : dehradun();
                }
                break;
                default : dehradun();
            }
            break;
            case 3 : national();
            break;
            default : System.out.println("Please enter the correct choice");
            dehradun();
        }
    }

    public static void kochi()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Kochi (also known as Cochin) is a city in southwest India's coastal Kerala state.");
        System.out.println("Enter the mode of transport");
        System.out.println("1 : Airways"+"\n"+ "2:Roadways"+"\n"+"3:Exit");int a=0;  
        do
        {try
            {a =Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(a)
        { case 1 :System.out.println("The cost of Air ticket to KOCHI is ");
            System.out.println(" Adult:Rs 1700 "+"\n"+"Children:Rs 1500");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 : int Adult=1700 ; int Children=1500 ;String city="KOCHI";String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : kochi();
                }
                break;
                default : kochi();
            }

            break;
            case 2 :System.out.println("The cost of bus ticket to KOCHI is ");
            System.out.println(" Adult: Rs 1400"+"\n"+"Children: Rs 1300");
            System.out.println("Enter 1 to continue else any other number to exit");int q=0;
            do
            {try
                {q=Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(q)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The no of adults:"+NoAdult+"\n"+"The number of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else any other number to exit");int qu=0;
                do
                {try
                    {qu=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(qu)
                {case 1 : int Adult=1400 ; int Children=1300 ;String city="KOCHI";String mode="BUS";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : kochi();
                }
                break;
                default : kochi();
            }
            break;
            case 3 : national();
            break;
            default : System.out.println("Please enter the correct choice");
            kochi();
        }
    }

    public static void bhopal()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Bhopal is a city in the central Indian state of Madhya Pradesh. It's one of India’s greenest cities.");
        System.out.println("On the banks of the Upper Lake is Van Vihar National Park, home to tigers, lions and leopards.");
        System.out.println("Enter the mode of transport");
        System.out.println("1 : Airways"+"\n"+ "2:Railways"+"\n"+"3:Exit");int a=0;  
        do
        {try
            {a =Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(a)
        { case 1 :System.out.println("The cost of Air ticket to BHOPAL is ");
            System.out.println(" Adult:Rs 5500 "+"\n"+"Children:Rs 5300");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 : int Adult=5500 ; int Children=5300 ;String city="BHOPAL";String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : bhopal();
                }
                break;
                default : bhopal();
            }

            break;
            case 2 :System.out.println("The cost of railway ticket to BHOPAL is ");
            System.out.println(" Adult: Rs 5500"+"\n"+"Children: Rs 5300");
            System.out.println("Enter 1 to continue else any other number to exit");int q=0;
            do
            {try
                {q=Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(q)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The no of adults:"+NoAdult+"\n"+"The number of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else any other number to exit");int qu=0;
                do
                {try
                    {qu=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(qu)
                {case 1 : int Adult=5500 ; int Children=5300 ;String city="BHOPAL";String mode="RAILWAY";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : bhopal();
                }
                break;
                default : bhopal();
            }
            break;
            case 3 : national();
            break;
            default : System.out.println("Please enter the correct choice");
            bhopal();
        }
    }

    public static void chandigarh()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Chandigarh, the capital of the northern Indian states of Punjab and Haryana, was designed by modernist architect Le Corbusier.");
        System.out.println("The nearby Rock Garden is a park featuring sculptures made of stones, recycled ceramics and industrial relics.");
        System.out.println("Enter the mode of transport");
        System.out.println("1 : Airways"+"\n"+ "2:Railways"+"\n"+"3:Exit");int a=0;  
        do
        {try
            {a =Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(a)
        { case 1 :System.out.println("The cost of Air ticket to CHANDIGARH is ");
            System.out.println(" Adult:Rs 6100 "+"\n"+"Children:Rs 5900");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 : int Adult=6100; int Children=5900 ;String city="CHANDIGARH";String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : chandigarh();
                }
                break;
                default : chandigarh();
            }

            break;
            case 2 :System.out.println("The cost of railway ticket to CHANDIGARH is ");
            System.out.println(" Adult: Rs 7800"+"\n"+"Children: Rs 7600");
            System.out.println("Enter 1 to continue else any other number to exit");int q=0;
            do
            {try
                {q=Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(q)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The no of adults:"+NoAdult+"\n"+"The number of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else any other number to exit");int qu=0;
                do
                {try
                    {qu=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(qu)
                {case 1 : int Adult=7800 ; int Children=7600 ;String city="CHANDIGARH";String mode="RAILWAY";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : chandigarh();
                }
                break;
                default : chandigarh();
            }
            break;
            case 3 : national();
            break;
            default : System.out.println("Please enter the correct choice");
            chandigarh();
        }
    }

    public static void london()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("London, the capital of England and the United Kingdom, is a 21st-century city with history stretching back to Roman times.");
        System.out.println("At its centre stand the imposing Houses of Parliament, the iconic ‘Big Ben’ clock tower and Westminster Abbey, site of British monarch coronations.");
        System.out.println("Across the Thames River, the London Eye observation wheel provides panoramic views of the South Bank cultural complex, and the entire city.");
        System.out.println("Enter 1 to continue else any other number to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of Air ticket to LONDON is ");
            System.out.println(" Adult:Rs 18000 "+"\n"+"Children:Rs 17500");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 18000 ; int Children=17500 ; String city="LONDON"; String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : london();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void moscow()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Moscow, on the Moskva River in western Russia, is the nation’s cosmopolitan capital.");
        System.out.println("In its historic core is the Kremlin, a complex that’s home to the president and tsarist treasures in the Armoury.");
        System.out.println("Outside its walls is Red Square, Russia's symbolic center.");
        System.out.println("Enter 1 to continue else any other number to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of Air ticket to MOSCOW is ");
            System.out.println(" Adult:Rs 24500 "+"\n"+"Children:Rs 24000");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 24500 ; int Children=24000; String city="MOSCOW"; String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : moscow();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void newYork()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("New York City comprises 5 boroughs sitting where the Hudson River meets the Atlantic Ocean.");
        System.out.println("At its core is Manhattan, a densely populated borough that’s among the world’s major commercial, financial and cultural centers.");
        System.out.println("its iconic sites include skyscrapers such as the Empire State Building and sprawling Central Park.");
        System.out.println("Enter 1 to continue else any other number to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of Air ticket to NEW YORK is ");
            System.out.println(" Adult:Rs 33000 "+"\n"+"Children:Rs 32700");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult=33000 ; int Children=32700 ; String city="NEW YORK"; String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : newYork();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void losAngeles()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Los Angeles is a sprawling Southern California city and the center of the nation’s film and television industry.");
        System.out.println("Near its iconic Hollywood sign, studios such as Paramount Pictures, Universal and Warner Brothers offer behind-the-scenes tours.");
        System.out.println("Enter 1 to continue else any other number to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of Air ticket to LOS ANGELES is ");
            System.out.println(" Adult:Rs 45000 "+"\n"+"Children:Rs 44700");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 45000 ; int Children=44700; String city="LOS ANGELES"; String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : losAngeles();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void bangkok()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Bangkok, Thailand’s capital, is a large city known for ornate shrines and vibrant street life.");
        System.out.println("Enter 1 to continue else any other number to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of Air ticket to BANGKOK is ");
            System.out.println(" Adult:Rs 15000 "+"\n"+"Children:Rs 14500");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 15000 ; int Children=14500 ; String city="BANGKOK"; String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : bangkok();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void shanghai()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Shanghai, on China’s central coast, is the country's biggest city and a global financial hub.");
        System.out.println("Enter 1 to continue else any other number to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of Air ticket to SHANGHAI is ");
            System.out.println(" Adult:Rs 27000 "+"\n"+"Children:Rs 26700");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 27000 ; int Children=26700 ; String city="SHANGHAI"; String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : shanghai();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void kualaLumpur()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Kuala Lumpur is the capital of Malaysia.");
        System.out.println("Its modern skyline is dominated by the 451m-tall Petronas Twin Towers, a pair of glass-and-steel-clad skyscrapers with Islamic motifs");
        System.out.println("Enter 1 to continue else any other number to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of Air ticket to KUALA LUMPUR is ");
            System.out.println(" Adult:Rs 19400 "+"\n"+"Children:Rs 19100");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 19400 ; int Children=19100 ; String city="KUALA LUMPUR"; String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : kualaLumpur();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void tokyo()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Tokyo, Japan’s busy capital, mixes the ultramodern and the traditional, from neon-lit skyscrapers to historic temples.");
        System.out.println("The city's many museums offer exhibits ranging from classical art (in the Tokyo National Museum) to a reconstructed kabuki theater (in the Edo-Tokyo Museum).");
        System.out.println("Enter 1 to continue else any other number to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of Air ticket to TOKYO is ");
            System.out.println(" Adult:Rs 32500 "+"\n"+"Children:Rs 32100");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 32500 ; int Children=32100 ; String city="TOKYO"; String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : tokyo();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void venice()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Venice, the capital of northern Italy’s Veneto region, is built on more than 100 small islands in a lagoon in the Adriatic Sea. ");
        System.out.println("it has no roads, just canals – including the Grand Canal thoroughfare – lined with Renaissance and Gothic palaces.");
        System.out.println("The central square, Piazza San Marco, contains St. Mark’s Basilica, which is tiled with Byzantine mosaics, and the Campanile bell tower offering views of the city’s red roofs.");
        System.out.println("Enter 1 to continue else any other number to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of Air ticket to VENICE is ");
            System.out.println(" Adult:Rs 37500 "+"\n"+"Children:Rs 37000");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 37500 ; int Children=37000 ; String city="VENICE"; String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : venice();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void rome()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Rome, Italy’s capital, is a sprawling, cosmopolitan city with nearly 3,000 years of globally influential art, architecture and culture on display.");
        System.out.println("Ancient ruins such as the Forum and the Colosseum evoke the power of the former Roman Empire.");
        System.out.println("Vatican City, headquarters of the Roman Catholic Church, has St. Peter’s Basilica and the Vatican Museums, which house masterpieces such as Michelangelo’s Sistine Chapel frescoes.");
        System.out.println("Enter 1 to continue else any other number to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of Air ticket to ROME is ");
            System.out.println(" Adult:Rs 23000 "+"\n"+"Children:Rs 22700");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 23000 ; int Children=22700 ; String city="ROME"; String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : rome();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void amsterdam()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Amsterdam is the Netherlands’ capital, known for its artistic heritage, elaborate canal system and narrow houses with gabled facades, legacies of the city’s 17th-century Golden Age.");
        System.out.println("Cycling is key to the city’s character, and there are numerous bike paths.");
        System.out.println("Enter 1 to continue else any other number to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of Air ticket to AMSTERDAM is ");
            System.out.println(" Adult:Rs 24500 "+"\n"+"Children:Rs 24100");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 24500 ; int Children=24100 ; String city="AMSTERDAM"; String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : amsterdam();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void rioDeJaneiro()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Rio de Janeiro is a huge seaside city in Brazil, famed for its Copacabana and Ipanema beaches,");
        System.out.println("38m Christ the Redeemer statue atop Mount Corcovado and for Sugarloaf Mountain, a granite peak with cable cars to its summit.");
        System.out.println("Enter 1 to continue else any other number to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of Air ticket to RIO DE JANEIRO is ");
            System.out.println(" Adult:Rs 64500 "+"\n"+"Children:Rs 64000");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 64500 ; int Children=64000 ; String city="RIO DE JANEIRO"; String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : rioDeJaneiro();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void johannesburg()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Johannesburg, South Africa's biggest city and capital of Gauteng province, began as a 19th-century gold-mining settlement");
        System.out.println("Its sprawling Soweto township was once home to Nelson Mandela and Desmond Tutu. ");
        System.out.println("Enter 1 to continue else any other number to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of Air ticket to JOHANNESBURG is ");
            System.out.println(" Adult:Rs 37900 "+"\n"+"Children:Rs 37600");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 37900 ; int Children=37600 ; String city="JOHANNESBURG"; String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : johannesburg();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void beijing()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Beijing, China’s massive capital, has history stretching back 3 millennia.");
        System.out.println("Yet it’s known as much for its modern architecture as its ancient sites such as the grand Forbidden City complex, the imperial palace during the Ming and Qing dynasties.");
        System.out.println("Enter 1 to continue else any other number to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of Air ticket to BEIJING is ");
            System.out.println(" Adult:Rs 41000 "+"\n"+"Children:Rs 40900");
            System.out.println("Enter 1 to continue else any other number to exit");int b=0;
            do
            {try
                {b =Integer.parseInt(br.readLine());}
                catch(NumberFormatException e)
                {}
            } while(false);
            switch(b)
            { case 1 :System.out.println("Please enter the number of adults");int NoAdult=0;
                do
                {try
                    {NoAdult=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("Please enter the number of children");int NoChildren=0;
                do
                {try
                    {NoChildren=Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                System.out.println("The No of adults:"+NoAdult+"\n"+"The No of children:"+NoChildren);
                System.out.println("Enter 1 to confirm else Any other number to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 41000 ; int Children=40900 ; String city="BEIJING"; String mode="AIR";
                    calcCost(Adult,Children,NoAdult,NoChildren,city,mode);
                    break;
                    default : beijing();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }
}