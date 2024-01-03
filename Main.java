import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int n = sc.nextInt();
        while (n != 0) {
            arr.add(n);
            n = sc.nextInt();
        }
        Collections.sort(arr);
        System.out.println(arr);
        int answ = arr.get(0) + arr.get(1) + arr.get(arr.size() - 2) + arr.get(arr.size() - 1);
        System.out.println(answ);
    }
}
