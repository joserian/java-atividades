public class Atividades {
    void atividade1() {
        System.out.println("hello world");
    }

    void atividade2(int a, int b) {
        System.out.println(a+b);
    }

    void atividade3() {
        for(var i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    void atividade4(float c) {
        System.out.println(c * 9/5 + 32);
    }

    void atividade5(float f) {
        System.out.println((f-32)/1.8);
    }

    void atividade6() {
        int a = 5;
        int b = 3;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        if((Object) a instanceof Integer && (Object) b instanceof Integer) {
            System.out.println("sao do mesmo tipo");
        }else {
            System.out.println("são de tipos diferente");
        }
    }

    void atividade7() {
        int a = 10;
        String b = "20";

        System.out.println(a + b);
    }

    void atividade8() {
        Test d = new Test("joão");
        d.getName();
    }

    void atividade9() {
        String name1 = "jose";
        String name2 = "rian";

        System.out.println(name1);
        System.out.println(name2);

        if(name1 == name2) {
            System.out.println("os nomes são iguais");
        }else {
            System.out.println("os nomes são diferentes");
        }
    }

    void atividade10() {
        int a = 10;
        String b = "20";
        boolean c = true;
        float d = 5.5f;

        System.out.println(a + b + c + d);
    }
}
