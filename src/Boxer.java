public class Boxer {
    //    2. Implement the method fight() depending on weight, strength and age of the boxer:
//    You should write dependency by yourself. The method should return true or false if our boxer won or lost.
//    Requirements:
//    a) if ourBoxer.fight(anotherBoxer) returns true, then anotherBoxer.fight(outBoxer) should return false;

        public int age;
        public int weight;
        public int strength;

        public Boxer(int age, int weight)
        {
            this.age = age;
            this.weight = weight;
            this.strength = (age + weight) / 2;
        }

        public boolean fight(Boxer anotherBoxer) {
            if (this.age < anotherBoxer.age && this.weight > anotherBoxer.weight && this.strength > anotherBoxer.strength) {
                return true;
            } else {
                return false;
            }
        }

        public static void main(String[] args) {
            Boxer one = new Boxer(20, 100);
            Boxer two = new Boxer(19, 110);

            System.out.println("ONE vs TWO: " + one.fight(two));
            System.out.println("TWO vs ONE: " + two.fight(one));
        }
}
