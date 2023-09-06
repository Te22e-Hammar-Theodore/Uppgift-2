public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Uppgift A");
        int tal1 = 23;
        int tal2 = 45;
        int summa;
        int produkt;
        summa=tal1+tal2;
        System.out.println(tal1+"+"+tal2+"="+summa);
        
        summa=tal1-tal2;
        System.out.println(tal1+"-"+tal2+"="+summa);

        System.out.println("Uppgift B");

        int tal3=234232;
        int tal4=3424;
        produkt=tal3*tal4;
        System.out.println(tal3+"*"+tal4+"="+produkt);
        produkt=(tal2)*(tal3)*(tal4);
        System.out.println(tal2+"*"+tal3+"*"+tal4+"="+produkt+"ej korrekt");

        System.out.println("Uppgift C");

        double tal5 = 10;
        double tal6 = 3;
        double kvot;
        kvot=tal6/tal5;
        System.out.println(tal6+"/"+tal5+"="+kvot);



    }
}
