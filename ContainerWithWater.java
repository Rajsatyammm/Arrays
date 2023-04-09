import java.util.ArrayList;
public class ContainerWithWater {
    public static int calculateMax(ArrayList<Integer> list) {

        int maxWater = 0;
        int Lp = 0, Rp = list.size()-1;
        while (Lp < Rp) {
            int ht = Math.min(list.get(Lp), list.get(Rp));
            int wt = Rp - Lp;
            int waterCapacity = ht * wt;

            maxWater = Math.max(maxWater, waterCapacity);
            if (list.get(Lp) < list.get(Rp)) {
                Lp++;
            } else {
                Rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println(calculateMax(list));
    }
}