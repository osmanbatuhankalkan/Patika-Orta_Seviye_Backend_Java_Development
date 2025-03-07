public class Bird extends Animal {//bizden uçmak metodu harici
    // ses çıkarmak ötmekle ilgili bir method daha eklememiz istenmiş
    void fly() {
        System.out.println("I'm flying");
    }
    void sing(){//ötmekle iligli methodumuzu tanımladık şimdi ana mainde çağıralım.
        System.out.println("I'm singing");
    }
}
