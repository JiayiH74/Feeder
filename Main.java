public class Main 
{
    public static void main(String[] args) 
    {
        Feeder f = new Feeder();
        System.out.println(f.getCurrentFood());
        // System.out.println(f.currentFood)
      
       Feeder g = new Feeder(500);
        System.out.println(g.getCurrentFood());

        g.simulateOneDay(12);
        System.out.println(g.getCurrentFood());

        //amount of food eaten by each bird
        int random = (int) (Math.random() * 41 + 10); 
        System.out.println(random);

        //5% chance of bear attack
        System.out.println(Math.random() < 0.05);

        Feeder h = new Feeder(1000);
        h.simulateOneDay(22);
        System.out.println(h.getCurrentFood());

        Feeder i = new Feeder(100);
        i.simulateOneDay(5);
        System.out.println(i);
    }
   
}
