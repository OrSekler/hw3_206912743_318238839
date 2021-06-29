// creates a new monkey. implements AnimalFactory.
public class MonkeyFactory extends AnimalFactory{
    public Animal createAnimal(){
        return new Monkey();
    }
}