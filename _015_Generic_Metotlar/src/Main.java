public class Main {
    public static void main(String[] args) {
        String[] a={"Java","102","Patika","Dev"};
        Integer[] b={1,2,3,4};
        Character[] c={'J','A','V','A'};
        /// 'Generic Olmayan' Gösterim
        System.out.println("##################'Generic Olmayan' Gösterim #######################");
        for(String i:a){
            System.out.println(i);
        }
        System.out.println("#########################################");
        for(Integer i:b){
            System.out.println(i);
        }
        System.out.println("#########################################");
        for(Character i:c){
            System.out.println(i);
        }
        System.out.println("#########################################");
        /// 'Generic' Gösterim. Metot çağırılır. 'Print' classını incele.
        System.out.println("###################'Generic' Gösterim ######################");
        Print.printArray(a);
        System.out.println("#########################################");
        Print.printArray(b);
        System.out.println("#########################################");
        Print.printArray(c);
        System.out.println("#########################################");
    }
}