class MotorCycle extends BiCycle{
    String define_me(){
        return "a cycle with an engine.";
    }

    MotorCycle(){
        System.out.println("Hello I am a motorcycle, I am "+ define_me());

        String temp=super.define_me(); //Fix this line
        //super ile üst classtaki methodun döndürdüğü değeri getiriyoruz.

        System.out.println("My ancestor is a cycle who is "+ temp );
    }

}