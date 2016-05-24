package storytime;

public class Character 
{
    public double alegence, strength, charisma, intelagence;
    public String name;
    
    public Character(boolean protaganist, String name)
    {
        alegence = protaganist?1:0;
        strength = Math.random();
        charisma = Math.random();
        intelagence = Math.random();
        this.name = name;
    }
    
    @Override
    public String toString(){
        return name;
    }
}


