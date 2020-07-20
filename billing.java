import java.io.*;
import java.util.*;
class billing
{ public static void ticket(int adult,int children,int NoAdult,int NoChildren,String city,String mode)throws IOException
    { Calendar c=Calendar.getInstance();boolean test=false;String year="";String month="";int M=0;
        String date="";
        int Z=c.get(Calendar.MONTH);M=Z+1;
        int Y=c.get(Calendar.YEAR);
        int D=c.get(Calendar.DATE);        

        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("Please enter your name");String name="";
        do{test=false;
            name=br.readLine();
            int ln=name.length();
            outer:
            for(int i=0;i<ln;i++)
            {char ch=name.charAt(i);
                if(Character.isDigit(ch)==true)
                {System.out.println("Please enter your name in alphabets");
                    test=true;
                    break outer;}
            }
        }while(test);
        System.out.println("Please enter your address");String address="";
        address=br.readLine();
        System.out.println("Please enter your mobile number"); String mobile="";
        do{test=false;
            do{test=false;
                mobile=br.readLine();
                try
                {long mob=Long.parseLong(mobile);}
                catch(NumberFormatException e)
                {System.out.println("Please enter in number");
                    test=true;}
            }while(test);
            if(mobile.length()!=10)
            {System.out.println("PLEASE ENTER 10 DIGITS");
                test=true;}
        }while(test);
        int y=0;
        do{test=false;
            System.out.println("Please enter the year of travel:");
            year=br.readLine();
            try
            { y=Integer.parseInt(year);}
            catch(NumberFormatException e)
            {System.out.println("Please enter in number");
                test=true;}
            if(y<Y)
            {System.out.println("The Year has passed.");
                test=true;}
            if(y>(Y+1))
            {System.out.println("Bookings are not opened for the year "+y);
                test=true;}
        }while(test);
        int m=0;
        do{test=false;
            System.out.println("Please enter the month of travel:");
            month=br.readLine();
            try
            { m=Integer.parseInt(month);}
            catch(NumberFormatException e)
            {System.out.println("Please enter in number");
                test=true;}
            if(Y==y)
            { if(m<M)
                {System.out.println("The Month has passed.");
                    test=true;}}          
            if(m>12)
            {System.out.println("Invalid month");
                test=true;}
        }while(test);
        int d=0;
        do{test=false;
            System.out.println("Please enter the date of travel:");
            date=br.readLine();
            try
            {d=Integer.parseInt(date);}
            catch(NumberFormatException e)
            {System.out.println("Please enter in number");
                test=true;}
            if((m==M)&&(y==Y))
            {
                if(d<=D)
                {System.out.println("The Day has passed.");
                    test=true;}}
            if((y%4!=0)&&(m==2)&&(d==29))
            {System.out.println("February has 28 days");
                test=true;}
            if(((m==1)||(m==3)||(m==5)||(m==7)||(m==8)||(m==10)||(m==12))&&(d>31))
            {System.out.println("The month has 31 days");
                test=true;}
            if(((m==4)||(m==6)||(m==9)||(m==11))&&(d>30))
            {System.out.println("The month has 30 days");
                test=true;}
            if((y%4==0)&&(m==2)&&(d>29))
            {System.out.println("February has 29 days");
                test=true;}
        }while(test);

        System.out.println("");System.out.println("");System.out.println("");
        System.out.println("                                            INVOICE                                                           ");
        System.out.println(" HEAVENLY TOURS AND TRAVELS,                                    DATE: "+new Date());
        System.out.println(" BENGALURU.");
        System.out.println(" CONTACT NUMBER:080-23328794");
        System.out.println(" MAIL US@:msnishanth.cricket@gmail.com");System.out.println("");
        System.out.println("                                            PARTICULARS                                                        ");
        System.out.println("                                     "+mode+" ticket to "+city                                                  );
        System.out.println("TRAVEL DATE: "+date+"/"+month+"/"+year);
        System.out.println("Number of adults: "+NoAdult);
        System.out.println("Number of children: "+NoChildren);
        System.out.println("Cost for one adult: Rs."+adult);
        System.out.println("Cost for one child: Rs."+children);
        int subtotal=(adult*NoAdult)+(children*NoChildren);
        System.out.println("SUBTOTAL: Rs."+subtotal);
        double discount=0.15*subtotal;
        System.out.println("DISCOUNT: Rs."+discount);
        double serviceCharge=0.07*subtotal;
        System.out.println("SERVICE CHARGE: Rs."+serviceCharge);
        double cost= subtotal+serviceCharge-discount;
        System.out.println("TOTAL COST: Rs."+cost);System.out.println("");
        System.out.println("NAME OF THE CUSTOMER: "+name);
        System.out.println("ADDRESS OF THE CUSTOMER:"+address);
        System.out.println("MOBILE NUMBER:"+mobile);System.out.println("");System.out.println("");
        System.out.println("                                       THANK YOU........VISIT AGAIN!!!");
        System.out.println("                                                                       - N!$h@nTh M.$. ");
    }

    public static void tour(int adult,int children,int NoAdult,int NoChildren,String tour)throws IOException
    { Calendar c=Calendar.getInstance();boolean test=false;String year="";String month="";int M=0;
        String date="";
        int Z=c.get(Calendar.MONTH);M=Z+1;

        int Y=c.get(Calendar.YEAR);
        int D=c.get(Calendar.DATE);        

        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("Please enter your name");String name="";
        do{test=false;
            name=br.readLine();
            int ln=name.length();
            outer:
            for(int i=0;i<ln;i++)
            {char ch=name.charAt(i);
                if(Character.isDigit(ch)==true)
                {System.out.println("Please enter your name in alphabets");
                    test=true;
                    break outer;}
            }
        }while(test);
        System.out.println("Please enter your address");String address="";
        address=br.readLine();
        System.out.println("Please enter your mobile number"); String mobile="";
        do{test=false;
            do{test=false;
                mobile=br.readLine();
                try
                {long mob=Long.parseLong(mobile);}
                catch(NumberFormatException e)
                {System.out.println("Please enter in number");
                    test=true;}
            }while(test);
            if(mobile.length()!=10)
            {System.out.println("PLEASE ENTER 10 DIGITS");
                test=true;}
        }while(test);
        int y=0;
        do{test=false;
            System.out.println("Please enter the year of travel:");
            year=br.readLine();
            try
            { y=Integer.parseInt(year);}
            catch(NumberFormatException e)
            {System.out.println("Please enter in number");
                test=true;}
            if(y<Y)
            {System.out.println("The Year has passed.");
                test=true;}
            if(y>(Y+1))
            {System.out.println("Bookings are not opened for the year "+y);
                test=true;}
        }while(test);
        int m=0;
        do{test=false;
            System.out.println("Please enter the month of travel:");
            month=br.readLine();
            try
            { m=Integer.parseInt(month);}
            catch(NumberFormatException e)
            {System.out.println("Please enter in number");
                test=true;}
            if(Y==y)
            { if(m<M)
                {System.out.println("The Month has passed.");
                    test=true;}}          
            if(m>12)
            {System.out.println("Invalid month");
                test=true;}
        }while(test);
        int d=0;
        do{test=false;
            System.out.println("Please enter the date of travel:");
            date=br.readLine();
            try
            {d=Integer.parseInt(date);}
            catch(NumberFormatException e)
            {System.out.println("Please enter in number");
                test=true;}
            if((m==M)&&(y==Y))
            {
                if(d<=D)
                {System.out.println("The Day has passed.");
                    test=true;}}
            if((y%4!=0)&&(m==2)&&(d==29))
            {System.out.println("February has 28 days");
                test=true;}
            if(((m==1)||(m==3)||(m==5)||(m==7)||(m==8)||(m==10)||(m==12))&&(d>31))
            {System.out.println("The month has 31 days");
                test=true;}
            if(((m==4)||(m==6)||(m==9)||(m==11))&&(d>30))
            {System.out.println("The month has 30 days");
                test=true;}
            if((y%4==0)&&(m==2)&&(d>29))
            {System.out.println("February has 29 days");
                test=true;}
        }while(test);

        System.out.println("");System.out.println("");System.out.println("");
        System.out.println("                                            INVOICE                                                           ");
        System.out.println(" HEAVENLY TOURS AND TRAVELS,                                      DATE: "+new Date());
        System.out.println(" BENGALURU.");
        System.out.println(" CONTACT NUMBER:080-23328794");
        System.out.println(" MAIL US@:msnishanth.cricket@gmail.com");System.out.println("");
        System.out.println("                                            PARTICULARS                                                        ");
        System.out.println("                                  "+tour                                                  );
        System.out.println("TRAVEL DATE: "+date+"/"+month+"/"+year);
        System.out.println("Number of adults: "+NoAdult);
        System.out.println("Number of children: "+NoChildren);
        System.out.println("Cost for one adult: Rs."+adult);
        System.out.println("Cost for one child: Rs."+children);
        int subtotal=(adult*NoAdult)+(children*NoChildren);
        System.out.println("SUBTOTAL: Rs."+subtotal);
        double discount=0.15*subtotal;
        System.out.println("DISCOUNT: Rs."+discount);
        double serviceCharge=0.07*subtotal;
        System.out.println("SERVICE CHARGE: Rs."+serviceCharge);
        double cost= subtotal+serviceCharge-discount;
        System.out.println("TOTAL COST: Rs."+cost);System.out.println("");
        System.out.println("NAME OF THE CUSTOMER: "+name);
        System.out.println("ADDRESS OF THE CUSTOMER:"+address);
        System.out.println("MOBILE NUMBER:"+mobile);System.out.println("");System.out.println("");
        System.out.println("                                       THANK YOU........VISIT AGAIN!!!");
        System.out.println("                                                                       - N!$h@nTh M.$. ");
    }
}