public class First {

    public static void main(String[] arg){
        int a;
        System.out.println("через цикл for:");
        for (a=500; a<=650; a+=10) {
            System.out.print(a+" ");
        }



        System.out.println("через цикл while:");
         a=500;
        while (a<=650){
            System.out.println(a+"");
            a+=10;

        }


        System.out.println(" через цикл do-while:");
        a=500;
        do{
            System.out.print(a+" ");
            a+=10;
        }
        while (a<=650);
    }
}
