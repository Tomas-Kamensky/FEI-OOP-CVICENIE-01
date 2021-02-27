package sk.stuba.fei.uim.oop;

public class App {
    public static void main(String[] args) {
        //CVICENIE 01 - ULOHA 1.1
        System.out.println("Hello World");

        //CVICENIE 01 - ULOHA 1.2
        int a = 7;
        int b = 3;
        System.out.println("Prve cislo = "+a+", druhe cislo = "+b+", metoda vratila hodnotu = " + porovnajCisla(a,b));

        a = 8;
        b = 9;
        System.out.println("Prve cislo = "+a+", druhe cislo = "+b+", metoda vratila hodnotu = " + porovnajCisla(a,b));

        a = 2;
        b = 2;
        System.out.println("Prve cislo = "+a+", druhe cislo = "+b+", metoda vratila hodnotu = " + porovnajCisla(a,b));
    }

    public static int porovnajCisla(int a, int b){
        if(a>b){
            return 1;
        } else if(a<b) {
            return -1;
        } else {
            return 0;
        }
    }
}
