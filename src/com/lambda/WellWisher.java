package com.lambda;

public class WellWisher {

    public static void sayHello(Language language){
        language.wish();
    }

    public static int someFunx(){
        int a=10;
        int b=11;
        // where above two stored.

        return 10;// where it will be store.
    }

    public static void main(String[] args) {

        // For single line Code (Anonymous Function)
        sayHello(() -> System.out.println("Namaste"));
        sayHello(() -> System.out.println("Hello, How are you?"));
        sayHello(() -> System.out.println("Namashkar"));


        //sayBye(() -> System.out.println("Namashkar"));
        //  Erro => function not define for OverRide

        //Class Objects Oriented class
/*        Language enlish = new English();
        Language hindi = new Hindi();
        Language marati = new Marati();

        sayHello(enlish);
        sayHello(hindi);
        sayHello(marati);

 */
/*
        // Anonymous Class Object
        sayHello(new Language() {
            @Override
            public void wish() {
                System.out.println("Namashkar");
            }
        });

        sayHello(new Language() {
            @Override
            public void wish() {
                System.out.println("Hello how are you?");
            }
        });

        sayHello(new Language() {
            @Override
            public void wish() {
                System.out.println("Namaste");
            }
        });

 */




    }

}
