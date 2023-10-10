// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        //  Punkt obj1;
        //   obj1=new Punkt(-1,1);
        //   System.out.println("punkt: "+obj1);

        //   Prostokat obj2;
        //   obj2=new Prostokat(3,4,obj1);
        //   System.out.println("prostokat: "+obj2);

        //   double p=obj2.pole();
        //   System.out.println("pole: "+p);

        //   Punkt obj;
        //     obj = new Punkt(0,0);
        //     System.out.println(obj);

        //     obj.przesun(-1,3);
        //     System.out.println(obj);

//        Punkt obj;
//        obj = new Punkt(0,0);
//
//        Prostokat obj2;
//        obj2=new Prostokat(3,4,obj);
//        System.out.println(obj2);
//
//        obj2.przesun(7,-3);
//        System.out.println(obj2);

        Punkt obj1;
        obj1=new Punkt(2,2);
        Okrag obj2;
        obj2 = new Okrag(2,obj1);
        Punkt obj3;
        obj3=new Punkt(2,4);
        System.out.println(obj2);
        System.out.println(obj3);
//        System.out.println("Obwod: "+obj2.obwod());
//        System.out.println("Pole: "+obj2.pole());
        if(obj2.zawiera(obj3))
        System.out.println("Zawiera się");
        else
            System.out.println("Nie zawiera się");

        Prostokat objPros;
        objPros = new Prostokat(2,2,obj1);
        System.out.println(objPros.zawiera(obj1));

    }
}