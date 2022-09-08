package com.lambda;

public class WellWisher {

    public static void sayHello(Language language){
        language.wish();
    }

    public static void main(String[] args) {
/*        Language enlish = new English();
        Language hindi = new Hindi();
        Language marati = new Marati();

        sayHello(enlish);
        sayHello(hindi);
        sayHello(marati);

 */
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
    }

}
