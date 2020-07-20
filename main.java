import java.io.*;
class main
{

    public static void main()throws IOException 
    {
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("                                      *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("                                      WELCOME TO HEAVENLY TOURS AND TRAVELS");
        System.out.println("                                      *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Here you can book tickets or join our fantasticly organised tours in India or Abroad.");
        System.out.println("Please choose if you are here to book a ticket or a tour");
        System.out.println("1.Ticket " + " \n" + "2.tour " + "\n" + "3.Exit");
        int num=0;
        do
        {String n= br.readLine();
            try
            { num = Integer.parseInt(n);}
            catch(NumberFormatException e)
            {}
        } while(false);
        switch(num)
        {case 1 : tickets.book();
            break;
            case 2 : tour.book();
            break;
            case 3 : System.out.println("THANK YOU.....PLEASE VISIT AGAIN");
            System.out.println("                                         - N!$h@nTh M.$. ");
            System.exit(0);
            break;
            default : System.out.println("Please enter a correct choice");
            main();
        }
    }
}
