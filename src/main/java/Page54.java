   public class Page54 {
    public static void main(String[] args) {
        int x = 0;
        while (x<1) {
            x=x-1;   //x=-1
            if (x < 1)
            {
                System.out.print("a ");
                System.out.print("noize");
                x=x+2;
                x=x+1;//x=2
            }
            if (x>1)
            {System.out.println("");
                System.out.println("annoys");
                x=x-1;   //x=1
            }
            if (x==1)
            {
                System.out.print("an");
                System.out.print("oyster");
                x=x-2; //x=-1
            }
            if (x<1)
            {
                System.out.println("");
//                x=x+1;    ///x=0
            }
        }
    }
}