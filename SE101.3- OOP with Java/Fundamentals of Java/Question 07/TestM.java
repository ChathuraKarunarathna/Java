public class TestM {
    public static void main(String[] args) {
        Monster m1 = new Monster(15262, " Come and be charmed by Copenhagen, Northern Europe’s cosiest capital, packed with cafes, shops and the best restaurants in Scandinavia.");
        m1.display();
        System.out.println();
        m1.setLocation(85468);
        m1.display();
        System.out.println();
        m1.setDescription(" Copenhagen is the perfect blend of old world and new. Hop on a bike or stroll the city on foot and take in its laid-back atmosphere and effortless sense of style.");
        System.out.println("Description: " + m1.getDescription());

    }
}
