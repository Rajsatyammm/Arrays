// package Arrays;

import java.util.ArrayList;

public class PairSumsec {
    public static ArrayList<Integer> sum(ArrayList<Integer> list, int target) {
        ArrayList<Integer> neww = new ArrayList<>();
        int BP = -1;
        int n = list.size();
        for(int i=0; i<n; i++) {
            if(list.get(i) > list.get(i+1)) {
                BP = i;
                break;
            }
        }

        int Lp = BP+1, Rp = BP;
        while(Lp != Rp) {
            if(list.get(Lp) + list.get(Rp) == target) {
                neww.add(Lp);
                neww.add(Rp);
                return neww;
                // return true;
            }

            if(list.get(Lp) + list.get(Rp) < target) {
                Lp = (Lp+1)%n;
            }else {
                Rp = (Rp+n-1)%n;
            }
            
        }
        neww.add(-1);
        return neww;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 206;
        System.out.println(sum(list, target));
    }
}
