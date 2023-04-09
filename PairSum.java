// package Arrays;
import java.util.*;

public class PairSum {
    public static boolean Sum(ArrayList<Integer> list, int target) {
        int Lp = 0, Rp = list.size() - 1;
        while(Lp != Rp) {
            if(list.get(Lp) + list.get(Rp) == target) {
                return true;
            }

            if(list.get(Lp) + list.get(Rp) < target) {
                Lp++;
            } else {
                Rp--;
            }

            // if(list.get(Lp) + list.get(Rp) > target) {
            //     Rp--;
            // }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);

        int target = 50;
        System.out.println(Sum(al, target));
    }
}
