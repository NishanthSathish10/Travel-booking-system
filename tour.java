import java.io.*;
class tour
{

    public static void book()throws IOException
    { InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter"+"\n"+"1 for national tours"+"\n"+"2 for international tours");
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
    {System.out.println("Here are the national tour destinations"+"\n"+"enter your choice");
        System.out.println("1 ANDHRA PRADESH SPECIAL 10 DAYS "+"\n"+"2 GOA SPECIAL 5 DAYS "+"\n"+"3 HILL STATION SPECIAL 7 DAYS ");
        System.out.println("4 KERALA SPECIAL 7 DAYS"+"\n"+"5 ANDAMAN SPECIAL 6 DAYS"+"\n"+"6 NORTH INDIA 16 DAYS ");
        System.out.println("7 GOLDEN TRIANGLE 11 DAYS"+"\n"+"8 NORTH INDIA 32 DAYS"+"\n"+"9 SHIMLA KULU MANALI 17 DAYS"+"\n"+"10 GUJARATH RAJASTHAN 21 DAYS");
        System.out.println("11 NORTH EAST 16 DAYS "+"\n"+"12 MANALI LEH PANGONG LAKE NUBRA VALLEY 15 DAYS"+"\n"+"13 SOUTH INDIA 10 DAYS"+"\n"+"14 COASTAL KARNATAKA 5 DAYS");
        System.out.println("15 OOTY KODAIKANAL 5 DAYS "+"\n"+"16 KOLHAPUR SHIRDI NASIK 8 DAYS"+"\n"+"17 NAVAGRAHA DARSHAN 4 DAYS"+"\n"+"18 RAMESHWARAM CHENNAI 10 DAYS");
        System.out.println("19 MANTRALAYA HYDERABAD TIRUPATHI 7 DAYS"+"\n"+"20 COORG SPECIAL 3 DAYS"+"\n"+"21 EXIT");
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
        { case 1 : andhra();
            break;
            case 2 : goa();
            break;
            case 3 : hill();
            break;
            case 4 : kerala();
            break;
            case 5 : andaman();
            break;
            case 6 : north16();
            break;
            case 7 : triangle();
            break;
            case 8 : north32();
            break;
            case 9 : shimla();
            break;
            case 10 : gujRaj();
            break;
            case 11 : northEast();
            break;
            case 12 : manali();
            break;
            case 13 : south();
            break;
            case 14 : coastal();
            break;
            case 15 : ooty();
            break;
            case 16 : shirdi();
            break;
            case 17: navagraha();
            break;
            case 18 : rameshwaram();
            break;
            case 19 : manthralaya();
            break;
            case 20 : coorg();
            break;
            case 21 : book();
            break;
            default : System.out.println("Please enter the correct choice!!");
            national();
        }
    }

    public static void andhra()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                 ANDHRA PRADESH SPECIAL 10 DAYS                                     ");
        System.out.println("TRANSPORT: By BUS"+"\n"+"STARTS FROM: BENGALURU"+"\n"+"DISTANCE: 4200 Km"+"\n"+"DURATION: 10 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println("Bengaluru, Mantralaya (H), Srishailam (H), Mangala Giri,Kanaka Durga,Vijayawada (H),Dwaraka Tirumala");             
        System.out.println("Simhachalam, Vishakapattanam (H),Borra Caves, Kailasagiri, R.K. Beach,Vishakapattanam (H), Annavaram,");
        System.out.println("Vasavi Penukonda, Rajahmundry (H),Bhadrachalam, Khammam (H),Yadagiri Gutta, Kurnool (H), Yaganti,    ");
        System.out.println("Mahanandi, Nandyal (H), Lepakshi.");
        System.out.println("Enter 1 to continue else any other number to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of ANDHRA PRADESH SPECIAL 10 DAYS is ");
            System.out.println("Adult:Rs 21000 "+"\n"+"Children:Rs 20000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to confirm else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 21000 ; int Children=20000 ; String tour="ANDHRA PRADESH SPECIAL 10 DAYS"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : andhra();
                }
                break;
                default : national();
            }
            break;
            default:national();
        }
    }

    public static void calcCost(int a,int b,int c,int d,String x)throws IOException
    {InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        int subTotal=(a*c)+(b*d);
        System.out.println("The subtotal for your tour: " + x +" is "+ subTotal+" /-");
        System.out.println("ENTER 1 to CONFIRM THE BOOKING else anything else to CANCEL");int ch=0;
        do
        {try
            {ch=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(ch)
        { case 1: billing.tour(a,b,c,d,x);
            break;
            default:book();
        }
    }

    public static void goa()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                  GOA SPECIAL 5 DAYS                                     ");
        System.out.println("TRANSPORT: By BUS"+"\n"+"STARTS FROM: BENGALURU"+"\n"+"DISTANCE: 2000 Km"+"\n"+"DURATION: 5 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println("Bengaluru, Jog Falls, Sirsi (H), Ponda Temples, Vasco, Donapaul,Meeramar, Callangute, Vegator Beaches,");
        System.out.println("Panjim (2H), Hubballi (H)");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of GOA SPECIAL 5 DAYS is ");
            System.out.println("Adult:Rs 12000 "+"\n"+"Children:Rs 11000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 12000 ; int Children=11000 ; String tour="GOA SPECIAL 5 DAYS"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : goa();
                }
                break;
                default : national();
            }
            break;
            default:national();
        }
    }

    public static void hill()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                 HILL STATION SPECIAL 7 DAYS                                     ");
        System.out.println("TRANSPORT: By BUS"+"\n"+"STARTS FROM: BENGALURU"+"\n"+"DISTANCE: 2200 Km"+"\n"+"DURATION: 7 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println("Bengaluru, Ooty (H), Dharapuram (H),Kodaikanal (H), Munnar (H), Cochin,Angamaly (H), Mallampuzha (H)");             
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of HILL STATION SPECIAL 7 DAYS is ");
            System.out.println("Adult:Rs 16000 "+"\n"+"Children:Rs 15000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 16000 ; int Children=15000 ; String tour="HILL STATION SPECIAL 7 DAYS"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : hill();
                }
                break;
                default : national();
            }
            break;
            default:national();
        }
    }

    public static void kerala()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                 KERALA SPECIAL 7 DAYS                                     ");
        System.out.println("TRANSPORT: By BUS"+"\n"+"STARTS FROM: BENGALURU"+"\n"+"DISTANCE: 1800 Km"+"\n"+"DURATION: 7 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println("Bengaluru,Guruvayur (H), Munnar (H),Thekkady (H), Alleppey (H), Wonder La,Angamaly (H), Kalady, Mallampuzha (H)");    
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of KERALA SPECIAL 7 DAYS is ");
            System.out.println("Adult:Rs 14000 "+"\n"+"Children:Rs 13000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 14000 ; int Children=13000 ; String tour="KERALA SPECIAL 7 DAYS"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : kerala();
                }
                break;
                default : national();
            }
            break;
            default:national();
        }
    }

    public static void andaman()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                 ANDAMAN SPECIAL 6 DAYS                                   ");
        System.out.println("TRANSPORT: By FLIGHT"+"\n"+"STARTS FROM: BENGALURU"+"\n"+"DURATION: 5 NIGHTS , 6 DAYS ");
        System.out.println("                                            TOUR ROUTE                                      ");
        System.out.println("Bengaluru,Port Blair, Cellular Jail, Beaches & Museums, Chattam Saw Mill, Havelock Islands,");             
        System.out.println("North Bay Coral Island, Ross Island, Viper Island, Baratang, Mud Volcano, Lime stone caves, etc.");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of ANDAMAN SPECIAL 6 DAYS is ");
            System.out.println("Adult:Rs 23000 "+"\n"+"Children:Rs 22000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 23000 ; int Children=22000 ; String tour="ANDAMAN SPECIAL 6 DAYS"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : andaman();
                }
                break;
                default : national();
            }
            break;
            default:national();
        }
    }

    public static void north16()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                 NORTH INDIA 16 DAYS                                     ");
        System.out.println("TRANSPORT: By TRAIN/BUS"+"\n"+"STARTS FROM: BENGALURU"+"\n"+"DISTANCE: 7000 Km"+"\n"+"DURATION: 16 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println("Agra, Mathura, Brindavan, Fatehpur Sikri,Jaipur, New Delhi, Kurukshetra,Haridwar, Hrishikesh, Laxman Jhula,");             
        System.out.println("Sahasradhara, Mussoorie");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of NORTH INDIA 16 DAYS is ");
            System.out.println("Adult:Rs 29000 "+"\n"+"Children:Rs 28000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 29000 ; int Children=28000 ; String tour="NORTH INDIA 16 DAYS"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : north16();
                }
                break;
                default : national();
            }
            break;
            default:national();
        }
    }

    public static void triangle()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                 GOLDEN TRIANGLE 11 DAYS                                     ");
        System.out.println("TRANSPORT: By TRAIN/BUS"+"\n"+"STARTS FROM: BENGALURU"+"\n"+"DISTANCE: 6100 Km"+"\n"+"DURATION: 11 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println("Bengaluru,Agra, Mathura, Brindavan, Fatehpur Sikri,Jaipur, New Delhi ");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of GOLDEN TRIANGLE 11 DAYS is ");
            System.out.println("Adult:Rs 21000 "+"\n"+"Children:Rs 20000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 21000 ; int Children=20000 ; String tour="GOLDEN TRIANGLE 11 DAYS"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : triangle();
                }
                break;
                default : national();
            }
            break;
            default:national();
        }
    }

    public static void north32()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                 NORTH INDIA 32 DAYS                                     ");
        System.out.println("TRANSPORT: By TRAIN/FLIGHT/BUS"+"\n"+"STARTS FROM: BENGALURU"+"\n"+"DISTANCE: 10500 Km"+"\n"+"DURATION: 32 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println("Agra, Mathura, Brindavan, Fatehpur Sikri,Jaipur, New Delhi, Kathmandu(Nepal), Haridwar, Hrishikesh, Laxman Jhoola,");             
        System.out.println(" Gowrikund, Kedarnath,Badrinath, Mana, Srinagar (Uttarakhand),Allahabad, Varanasi, Bodhgaya, Gaya,");
        System.out.println("Kolkatta, Puri, Konark, Bhubaneshwar. ");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of NORTH INDIA 32 DAYS is ");
            System.out.println("Adult:Rs 63000 "+"\n"+"Children:Rs 61000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 63000 ; int Children=61000 ; String tour="NORTH INDIA 32 DAYS"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : north32();
                }
                break;
                default : national();
            }
            break;
            default:national();
        }
    }

    public static void shimla()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                 SHIMLA KULU MANALI 17 DAYS                                     ");
        System.out.println("TRANSPORT: By TRAIN/BUS"+"\n"+"STARTS FROM: BENGALURU"+"\n"+"DISTANCE: 7800 Km"+"\n"+"DURATION: 17 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println("Bengaluru,New Delhi, Pinjora, Simla, Kufri, Manali,Rohtang Pass, Manikaran,Amritsar, Wagah Border, Chandigarh.");    
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of SHIMLA KULU MANALI 17 DAYS is ");
            System.out.println("Adult:Rs 31000 "+"\n"+"Children:Rs 30000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 31000 ; int Children=30000 ; String tour="SHIMLA KULU MANALI 17 DAYS"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : shimla();
                }
                break;
                default : national();
            }
            break;
            default:national();
        }
    }

    public static void gujRaj()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                 GUJARATH RAJASTHAN 21 DAYS                                     ");
        System.out.println("TRANSPORT: By TRAIN/BUS"+"\n"+"STARTS FROM: BENGALURU"+"\n"+"DISTANCE: 7900 Km"+"\n"+"DURATION: 21 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println("Dwaraka, Bhet Dwaraka, Nageshwar,Porbandar,Somnath, Ahmedabad,Udaipur, Chittorgarh, Pushkar, Jaipur,");             
        System.out.println("Bikaner, Jaisalmer, Jodhpur, Mount Abu");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("GUJARATH RAJASTHAN 21 DAYS is ");
            System.out.println("Adult:Rs 37000 "+"\n"+"Children:Rs 36000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 37000 ; int Children=36000 ; String tour="GUJARATH RAJASTHAN 21 DAYS"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : gujRaj();
                }
                break;
                default : national();
            }
            break;
            default:national();
        }
    }

    public static void northEast()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                  NORTH EAST 16 DAYS                                      ");
        System.out.println("TRANSPORT: By TRAIN/BUS"+"\n"+"STARTS FROM: BENGALURU"+"\n"+"DISTANCE: 7500 Km"+"\n"+"DURATION: 16 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println("Bengaluru,New Delhi, Allahabad, Ayodhya, Varanasi,Bodhgaya, Gaya, Kolkatta,Puri, Konark, Bhubaneshwar.");             
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of NORTH EAST 16 DAYS is ");
            System.out.println("Adult:Rs 26000 "+"\n"+"Children:Rs 25000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 26000 ; int Children=25000 ; String tour="NORTH EAST 16 DAYS"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : northEast();
                }
                break;
                default : national();
            }
            break;
            default:national();
        }
    }

    public static void manali()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                 MANALI LEH PANGONG LAKE NUBRA VALLEY 15 DAYS                                     ");
        System.out.println("TRANSPORT: By TRAIN & BUS"+"\n"+"STARTS FROM: BENGALURU"+"\n"+"DISTANCE: 8200 Km"+"\n"+"DURATION: 15 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println("Bengaluru,New Delhi, Manali, Rohtang Pass, Jispa,Leh, Hemis, Thikshey Monastery,Khardungla Pass, (World’s Highest Motorable Road),");             
        System.out.println("Nubra Valley, Pangong Lake");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of MANALI LEH PANGONG LAKE NUBRA VALLEY 15 DAYS is ");
            System.out.println("Adult:Rs 21000 "+"\n"+"Children:Rs 20000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 21000 ; int Children=20000 ; String tour="MANALI LEH PANGONG LAKE NUBRA VALLEY 15 DAYS"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : manali();
                }
                break;
                default : national();
            }
            break;
            default:national();
        }
    }

    public static void south()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                 SOUTH INDIA 10 DAYS                                     ");
        System.out.println("TRANSPORT: By BUS"+"\n"+"STARTS FROM: BENGALURU"+"\n"+"DISTANCE: 4000 Km"+"\n"+"DURATION: 10 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println("Bengaluru, Vellore Golden Temple,Tiruvannamalai(H), Srirangam,Trichy, Thanjavur(H), Rameshwaram (H), ");             
        System.out.println("Madurai, Palani (H), Kodaikanal (H),Suchindrum, Kanyakumari (H), Kovalam,Trivendrum, Kollam (H),");
        System.out.println(" Cochin,Angamaly (H), Kalady, Guruvayur (H).");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of SOUTH INDIA 10 DAYS is ");
            System.out.println("Adult:Rs 21000 "+"\n"+"Children:Rs 20000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 21000 ; int Children=20000 ; String tour="SOUTH INDIA 10 DAYS"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : south();
                }
                break;
                default : national();
            }
            break;
            default:national();
        }
    }

    public static void coastal()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                 COASTAL KARNATAKA 5 DAYS                                    ");
        System.out.println("TRANSPORT: By BUS"+"\n"+"STARTS FROM: BENGALURU"+"\n"+"DISTANCE: 2200 Km"+"\n"+"DURATION: 5 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println("Bengaluru,Dharmasthala, Kateel (H),Sringeri, Horanadu, Udupi (H),Murudeshwara, Kumbhashi, Kollur,");             
        System.out.println("Mangaluru (H), Subramanya.");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of COASTAL KARNATAKA 5 DAYS is ");
            System.out.println("Adult:Rs 9000 "+"\n"+"Children:Rs 8500");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 9000 ; int Children=8500 ; String tour="COASTAL KARNATAKA 5 DAYS"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : coastal();
                }
                break;
                default : national();
            }
            break;
            default:national();
        }
    }

    public static void ooty()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                 OOTY KODAIKANAL 5 DAYS                                     ");
        System.out.println("TRANSPORT: By BUS"+"\n"+"STARTS FROM: BENGALURU"+"\n"+"DISTANCE: 1400 Km"+"\n"+"DURATION: 5 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println("Bengaluru,Ranganathittu, Ooty (H), Dharapuram (H), Kodaikanal (H)");             
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of OOTY KODAIKANAL 5 DAYS is ");
            System.out.println("Adult:Rs 10000 "+"\n"+"Children:Rs 9000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 10000 ; int Children=9000 ; String tour="OOTY KODAIKANAL 5 DAYS"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : ooty();
                }
                break;
                default : national();
            }
            break;
            default:national();
        }
    }

    public static void shirdi()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                 KOLHAPUR SHIRDI NASIK 8 DAYS                                     ");
        System.out.println("TRANSPORT: By BUS"+"\n"+"STARTS FROM: BENGALURU"+"\n"+"DISTANCE: 3600 Km"+"\n"+"DURATION: 7 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println("Bengaluru, Kudalasangama, Vijayapur (H),Pandarapur, Ahmednagar(H),Shanishingnapur, Grishneshwar, Ellora caves, ");             
        System.out.println("Aurangabad (H), Ajanta Caves, Shirdi (H), Nasik, Tryambakeshwara, Pune (H),Narayanpura, Kolhapur, Belagavi (H), ");
        System.out.println("Muruga Vana ");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of KOLHAPUR SHIRDI NASIK 8 DAYS is ");
            System.out.println("Adult:Rs 21000 "+"\n"+"Children:Rs 20000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 21000 ; int Children=20000 ; String tour="KOLHAPUR SHIRDI NASIK 8 DAYS"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : shirdi();
                }
                break;
                default : national();
            }
            break;
            default:national();
        }
    }

    public static void navagraha()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                 NAVAGRAHA DARSHAN 4 DAYS                                    ");
        System.out.println("TRANSPORT: By BUS"+"\n"+"STARTS FROM: BENGALURU"+"\n"+"DISTANCE: 2000 Km"+"\n"+"DURATION: 4 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println("Bengaluru,  Vellore, Thanjavur (H), Thingalur, Alangudi, Thirunageshwara,Suriyanur, Kanchanur, Kumbakonam (H), ");             
        System.out.println("Tirunallar, Keezhaperumpallam,Thiruvenkadu, Vaitheshwar, Chidambaram(H). ");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of NAVAGRAHA DARSHAN 4 DAYS is ");
            System.out.println("Adult:Rs 9000 "+"\n"+"Children:Rs 8500");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 9000 ; int Children=8500 ; String tour="NAVAGRAHA DARSHAN 4 DAYS"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : navagraha();
                }
                break;
                default : national();
            }
            break;
            default:national();
        }
    }

    public static void rameshwaram()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                 RAMESHWARAM CHENNAI 10 DAYS                                     ");
        System.out.println("TRANSPORT: By BUS"+"\n"+"STARTS FROM: BENGALURU"+"\n"+"DISTANCE: 4000 Km"+"\n"+"DURATION: 10 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println("Bengaluru, Vellore Golden Temple, Kanchipuram (H), Chennai (H),Mahabalipuram, Pondicherry (H), ");             
        System.out.println("Chidambaram, Srirangam, Trichy, Thanjavur (H), Madurai, Rameshwaram(H),Suchindrum, Kanyakumari (H), ");
        System.out.println("Trivendrum, Kollam (H), Cochin, Kalady, Guruvayur (H), Wayanad (H), Nanjangud");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of RAMESHWARAM CHENNAI 10 DAYS is ");
            System.out.println("Adult:Rs 21000 "+"\n"+"Children:Rs 20000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 21000 ; int Children=20000 ; String tour="RAMESHWARAM CHENNAI 10 DAYS"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : rameshwaram();
                }
                break;
                default : national();
            }
            break;
            default:national();
        }
    }

    public static void manthralaya()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                 MANTRALAYA HYDERABAD TIRUPATHI 7 DAYS                                     ");
        System.out.println("TRANSPORT: By BUS"+"\n"+"STARTS FROM: BENGALURU"+"\n"+"DISTANCE: 2600 Km"+"\n"+"DURATION: 7 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println("Bengaluru, Mantralaya, Raichur (H), Ramoji Film City, Hyderabad (2H),Srishailam, Mahanandi, Nandyal (H), ");             
        System.out.println("Ahobilam, Tirupathi (2H).");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of MANTRALAYA HYDERABAD TIRUPATHI 7 DAYS is ");
            System.out.println("Adult:Rs 16000 "+"\n"+"Children:Rs 15000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 16000 ; int Children=15000 ; String tour="MANTRALAYA HYDERABAD TIRUPATHI 7 DAYS"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : manthralaya();
                }
                break;
                default : national();
            }
            break;
            default:national();
        }
    }

    public static void coorg()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                 COORG SPECIAL 3 DAYS                                     ");
        System.out.println("TRANSPORT: By BUS"+"\n"+"STARTS FROM: BENGALURU"+"\n"+"DISTANCE: 1200 Km"+"\n"+"DURATION: 3 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println("Bengaluru, Ranganathittu, Cauvery Nisargadhama, Madikeri (2H),Talacauvery, Bhagamandala, Abbey Falls, ");             
        System.out.println("Bylukuppe, Chamundi Hills");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of COORG SPECIAL 3 DAYS is ");
            System.out.println("Adult:Rs 7000 "+"\n"+"Children:Rs 6500");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 7000 ; int Children=6500 ; String tour="COORG SPECIAL 3 DAYS"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : coorg();
                }
                break;
                default : national();
            }
            break;
            default:national();
        }
    }

    public static void international()throws IOException 
    {System.out.println("Here are the international tour destinations"+"\n"+"enter your choice");
        System.out.println("1 MALAYSIA - SINGAPORE WITH STAR CRUISE 8 Nights & 9 Days "+"\n"+"2 SINGAPORE - MALAYSIA - THAILAND 10 Nights & 11 Days "+"\n"+"3 THAILAND 5 Days");
        System.out.println("4 HONGKONG MACAU CHINA 10 Days"+"\n"+"5 MAURITIUS 7 Days"+"\n"+"6 SRILANKA 5 Days"+"\n"+"7 DUBAI 4 Nights & 5 Days");
        System.out.println("8 KAILASH MANSAROVAR YATRA 13 Days"+"\n"+"9 EXOTIC EUROPE 21 Nights / 22 Days"+"\n"+"10 EXOTIC SWITZERLAND 6 Nights / 7 Days");
        System.out.println("11 EXOTIC AMERICA WITH CANADA & BAHAMAS 21 Nights / 22 Days "+"\n"+"12 NEPAL 6 Days"+"\n"+"13 RUSSIA 6 NIGHTS 7 DAYS"+"\n"+"14 BHUTAN Special 7 Days");
        System.out.println("15 BALI & LOMBOK (INDONESIA) 8 DAYS "+"\n"+"16 LEISURE IN MALDIVES 4 Days"+"\n"+"17 MALAYSIA - SINGAPORE 6 Nights 7 Days");
        System.out.println("18 AMERICAN MEMORIES 09 Nights / 10 Days"+"\n"+"19 LANKA RAMAYANA SPECIAL 6 Days"+"\n"+"20 CLASSIC EUROPE 12 Nights / 13 Days"+"\n"+"21 EXIT");
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
        { case 1 : cruise();
            break;
            case 2 : singapore();
            break;
            case 3 : thailand();
            break;
            case 4 : hongkong();
            break;
            case 5 : mauritius();
            break;
            case 6 : lanka();
            break;
            case 7 : dubai();
            break;
            case 8 : kailash();
            break;
            case 9 : europe22();
            break;
            case 10 : swiss();
            break;
            case 11 : america();
            break;
            case 12 : nepal();
            break;
            case 13 : russia();
            break;
            case 14 : bhutan();
            break;
            case 15 : indonesia();
            break;
            case 16 : maldives();
            break;
            case 17 : malaysia();
            break;
            case 18 : america10();
            break;
            case 19 : ramayana();
            break;
            case 20 : europe();
            break;
            case 21 : book();
            break;
            default : System.out.println("Please enter the correct choice!!");
            international();
        }
    }

    public static void cruise()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                  MALAYSIA - SINGAPORE WITH STAR CRUISE 8 Nights & 9 Days                                    ");
        System.out.println("DURATION: 9 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println("Malaysia - 2 day Kuala Lumpur City Tour, Genting Highland with SnowWorld, Batu Caves,Singapore - Sentosa Island with Under Water World, ");
        System.out.println("Jurong Bird Park & 2 day City Tour & 2 nights Super Star Cruise High Sea");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of MALAYSIA - SINGAPORE WITH STAR CRUISE 8 Nights & 9 Days is ");
            System.out.println("Adult:Rs 110000 "+"\n"+"Children:Rs 109000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 110000 ; int Children=109000 ; String tour="MALAYSIA - SINGAPORE WITH STAR CRUISE 8 Nights & 9 Days"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : cruise();
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
        System.out.println("                                  SINGAPORE - MALAYSIA - THAILAND 10 Nights & 11 Days                                    ");
        System.out.println("DURATION: 11 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println("Singapore - Sentosa Island with Under Water World, Jurong Bird Park & 2 day City Tour, Malaysia - 2 day Kuala Lumpur City Tour,");
        System.out.println("Genting Highland with Snow World, Batu Caves, Pattaya - Coral Island, Alcazara Show, Noong Nooch Village,");
        System.out.println("Bangkok - Safari World Marine Park, 2 day Bangkok City Tour & Temple Tour");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of SINGAPORE - MALAYSIA - THAILAND 10 Nights & 11 Days ");
            System.out.println("Adult:Rs 112000 "+"\n"+"Children:Rs 111000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 112000 ; int Children=111000 ; String tour="SINGAPORE - MALAYSIA - THAILAND 10 Nights & 11 Days"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
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

    public static void thailand()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                  THAILAND 5 Days                                    ");
        System.out.println("DURATION: 5 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println("Pattaya - Coral Island, Alcazara Show, Noong Nooch Village,Bangkok - Safari World Marine Park, 2 day Bangkok City & Temple Tour,");
        System.out.println("Chao Phraya River Cruise");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of THAILAND 5 Days is ");
            System.out.println("Adult:Rs 55000 "+"\n"+"Children:Rs 54000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 55000 ; int Children=54000 ; String tour="THAILAND 5 Days"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : thailand();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void hongkong()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                  HONGKONG MACAU CHINA 10 Days                                    ");
        System.out.println("DURATION: 10 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println("Hongkong Island Tour, Macau, Window of the world, Jade Buddha Temple,Yu Garden, Shanghai Museum, The Bund,");
        System.out.println("Temple of Heaven, Forbidden City, Great Wall of China, Ming Tombs");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of HONGKONG MACAU CHINA 10 Days is ");
            System.out.println("Adult:Rs 136000 "+"\n"+"Children:Rs 135000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 136000 ; int Children=135000 ; String tour="HONGKONG MACAU CHINA 10 Days"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : hongkong();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void mauritius()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                  MAURITIUS 7 Days                                   ");
        System.out.println("DURATION: 7 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println("Ile Aux Cerfs, Curepipe Town, Grand-Bassin, Black River, Gorges & Chamarel");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of MAURITIUS 7 Days is ");
            System.out.println("Adult:Rs 70000 "+"\n"+"Children:Rs 69000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 70000 ; int Children=69000 ; String tour="MAURITIUS 7 Days"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : mauritius();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void lanka()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                     SRILANKA 5 Days                                    ");
        System.out.println("DURATION: 5 DAYS ");
        System.out.println("                      TOUR ROUTE                                              ");
        System.out.println("Negombo, Colombo, Kandy, Nuwara Eliya, Pinnawela");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of SRILANKA 5 Days is ");
            System.out.println("Adult:Rs 47000 "+"\n"+"Children:Rs 45000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 47000 ; int Children=45000 ; String tour="SRILANKA 5 Days"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : lanka();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void dubai()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                  DUBAI 4 Nights & 5 Days                                    ");
        System.out.println("DURATION: 5 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println("Dubai City Tour, Desert Safari, Dhow Cruise, Burj Khalifa, Dubai Mall");
        System.out.println("and Musical Fountain, Abu Dhabi City tour");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of DUBAI 4 Nights & 5 Days is ");
            System.out.println("Adult:Rs 62000 "+"\n"+"Children:Rs 60000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 62000 ; int Children=60000 ; String tour="DUBAI 4 Nights & 5 Days"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
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

    public static void kailash()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                  KAILASH MANSAROVAR YATRA 13 Days                                    ");
        System.out.println("DURATION: 13 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println("Kathmandu, Nyalam, Saga, Mansarovar, Darchen, Dirapuk, Zuthulphuk,");
        System.out.println("Paryang, Kathmandu");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of KAILASH MANSAROVAR YATRA 13 Days is ");
            System.out.println("Adult:Rs 115000 "+"\n"+"Children:Rs 110000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 115000 ; int Children=110000 ; String tour="KAILASH MANSAROVAR YATRA 13 Days"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : kailash();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void europe22()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                  EXOTIC EUROPE 21 Nights / 22 Days                                    ");
        System.out.println("DURATION: 22 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println("Italy, The Vatican, Austria, Leichtenstein, Switzerland, Germany,The Netherlands, Belgium, France,");
        System.out.println("England & Scotland, Northern Ireland & Ireland");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of EXOTIC EUROPE 21 Nights / 22 Days is ");
            System.out.println("Adult:Rs 480000 "+"\n"+"Children:Rs 470000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 480000 ; int Children=470000 ; String tour="EXOTIC EUROPE 21 Nights / 22 Days"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : europe22();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void swiss()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                  EXOTIC SWITZERLAND 6 Nights / 7 Days                                    ");
        System.out.println("DURATION: 7 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println(" Geneva, Zermatt, Bern, Interlaken, Lucerne, Engelberg,");
        System.out.println("Zurich & Schaffhausen");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of EXOTIC SWITZERLAND 6 Nights / 7 Days is ");
            System.out.println("Adult:Rs 225000 "+"\n"+"Children:Rs 220000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 225000 ; int Children=220000 ; String tour="EXOTIC SWITZERLAND 6 Nights / 7 Days"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : swiss();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void america()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                  EXOTIC AMERICA WITH CANADA & BAHAMAS 21 Nights / 22 Days                                    ");
        System.out.println("DURATION: 22 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println(" Toronto, Ottawa, Montreal, Quebec city, Miami, Bahamas, Orlando, New York, Washington D.C., Luray Caverns, Harrisburg,");
        System.out.println("Niagara Falls-Canada,Las Vegas, Los Angeles, Santa Monica, Solvang, San Francisco");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of EXOTIC AMERICA WITH CANADA & BAHAMAS 21 Nights / 22 Days is ");
            System.out.println("Adult:Rs 520000 "+"\n"+"Children:Rs 500000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 520000 ; int Children=500000 ; String tour="EXOTIC AMERICA WITH CANADA & BAHAMAS 21 Nights / 22 Days"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : america();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void nepal()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                  NEPAL 6 Days                                    ");
        System.out.println("DURATION: 6 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println(" Kathmandu, Pashupathinath, Bodhnath, Darbar Square, Manokamana");
        System.out.println("Temple, Pokhara, Gupteshwar, Devis Falls, Feva Lake");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of NEPAL 6 Days is ");
            System.out.println("Adult:Rs 30000 "+"\n"+"Children:Rs 29000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 30000 ; int Children=29000 ; String tour="NEPAL 6 Days"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : nepal();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void russia()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                  RUSSIA 6 NIGHTS 7 DAYS                                    ");
        System.out.println("DURATION: 7 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println(" Moscow, St. Petersburg");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of RUSSIA 6 NIGHTS 7 DAYS is ");
            System.out.println("Adult:Rs 67000 "+"\n"+"Children:Rs 65000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 67000 ; int Children=65000 ; String tour="RUSSIA 6 NIGHTS 7 DAYS"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : russia();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void bhutan()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                  BHUTAN Special 7 Days                                    ");
        System.out.println("DURATION: 7 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println(" Paro, Tashichho dzhong, Thimphu, Changangkha Lhakhang, Punakha,");
        System.out.println("Rimpung Dzhong, Tiger's Nest, Druk Choeding");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of BHUTAN Special 7 Days is");
            System.out.println("Adult:Rs 65000 "+"\n"+"Children:Rs 63000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 65000 ; int Children=63000 ; String tour="BHUTAN Special 7 Days"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : bhutan();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void indonesia()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                  BALI & LOMBOK (INDONESIA) 8 DAYS                                   ");
        System.out.println("DURATION: 7 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println(" Barong Kintamani, Bedugal, Tanah Lot Sunset Tour, Tj. Benoa,");
        System.out.println("Uluwatu Temple, Bali Hai Sunset Cruise, Lombok, Gili Sudak");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of BALI & LOMBOK (INDONESIA) 8 DAYS is");
            System.out.println("Adult:Rs 80000 "+"\n"+"Children:Rs 79000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 80000 ; int Children=79000 ; String tour="BALI & LOMBOK (INDONESIA) 8 DAYS"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : indonesia();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void maldives()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                  LEISURE IN MALDIVES 4 Days                                  ");
        System.out.println("DURATION: 4 DAYS ");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of LEISURE IN MALDIVES 4 Days is");
            System.out.println("Adult:Rs 52000 "+"\n"+"Children:Rs 50000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 52000 ; int Children=50000 ; String tour="LEISURE IN MALDIVES 4 Days"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : maldives();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void malaysia()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                  MALAYSIA - SINGAPORE 6 Nights 7 Days                                   ");
        System.out.println("DURATION: 7 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println(" Malaysia - Kuala Lumpur 2 day City Tour, Genting Highland with Snow World, Batu Caves, ");
        System.out.println("Singapore - Sentosa Island with Under Water World,Jurong Bird Park & 2 day City Tour");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of MALAYSIA - SINGAPORE 6 Nights 7 Days is");
            System.out.println("Adult:Rs 90000 "+"\n"+"Children:Rs 89000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 90000 ; int Children=89000 ; String tour="MALAYSIA - SINGAPORE 6 Nights 7 Days"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : malaysia();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void america10()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                  AMERICAN MEMORIES 09 Nights / 10 Days                                   ");
        System.out.println("DURATION: 10 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println(" New York, Philadelpia, Washington D.C., Niagara Falls, Las Vegas,Los Angeles and San Francisco ");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("AMERICAN MEMORIES 09 Nights / 10 Days");
            System.out.println("Adult:Rs 260000 "+"\n"+"Children:Rs 250000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 260000 ; int Children=250000 ; String tour="AMERICAN MEMORIES 09 Nights / 10 Days"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : america10();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void ramayana()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                  LANKA RAMAYANA SPECIAL 6 Days                                  ");
        System.out.println("DURATION: 6 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println(" Negambo, Kataragama (Skanda Temple), Tevani Amman Temple, Valli Amman Temple, Ravana Ella Falls, Ravana Ella Caves,  ");
        System.out.println("Sita Amman Temple, Gayathri Peedam, Kandy, Ramboda Sri Bhakta Hanuman Temple, Nuwara Eliya Etc.");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of LANKA RAMAYANA SPECIAL 6 Days is");
            System.out.println("Adult:Rs 50000 "+"\n"+"Children:Rs 49000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 50000 ; int Children=49000 ; String tour="LANKA RAMAYANA SPECIAL 6 Days"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : ramayana();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }

    public static void europe()throws IOException
    {InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("                                   CLASSIC EUROPE 12 Nights / 13 Days                                  ");
        System.out.println("DURATION: 13 DAYS ");
        System.out.println("                                            TOUR ROUTE                                              ");
        System.out.println(" United Kingdom, The Netherlands, Belgium, France, Switzerland, Italy, The Vatican, Austria and Germany  ");
        System.out.println("Enter 1 to continue else anything else to exit");int c=0;
        do
        {try
            {c=Integer.parseInt(br.readLine());}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(c)
        {case 1 :System.out.println("The cost of  CLASSIC EUROPE 12 Nights / 13 Days is");
            System.out.println("Adult:Rs 270000 "+"\n"+"Children:Rs 260000");
            System.out.println("Enter 1 to continue else anything else to exit");int b=0;
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
                System.out.println("Enter 1 to continue else anything else to exit");int con=0;
                do
                {try
                    {con =Integer.parseInt(br.readLine());}
                    catch(NumberFormatException e)
                    {}
                } while(false);
                switch(con)
                { case 1 :int Adult= 270000 ; int Children=260000 ; String tour=" CLASSIC EUROPE 12 Nights / 13 Days"; 
                    calcCost(Adult,Children,NoAdult,NoChildren,tour);
                    break;
                    default : europe();
                }
                break;
                default : international();
            }
            break;
            default:international();
        }
    }
}