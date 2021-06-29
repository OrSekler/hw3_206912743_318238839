public class Monkey implements Animal{
    public void eat(){
        System.out.println("The monkey is eating a banana...");
    }

    public void participateInShow(){
        System.out.println("The monkey is hanging on trees...");
    }

    public String toString(){
        return "Monkey";
    }
}