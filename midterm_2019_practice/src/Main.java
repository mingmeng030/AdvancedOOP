import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final int MIN = 11;
        final int MAX = 110;
        final int NUMS = 50;
        IntArrays intArrays = new IntArrays(MIN, MAX, NUMS);

        int[] randints = intArrays.getNumbers();
        Search search = new Search(new linearSearch());

        System.out.println(search.search(randints, randints[NUMS - 10])); //배열 index 40번에 있는 숫자 -> 무조건 true
        System.out.println(search.search(randints, randints[NUMS - 20])); //배열 index 30번에 있는 숫자 -> 무조건 true
        System.out.println(search.search(randints, MAX + 10));  //120을 배열에서 찾기 -> 무조건 false
        System.out.println(search.search(randints, MIN - 10));  //120을 배열에서 찾기 -> 무조건 false
        search.setSearchAlg(new binarySearch());
        System.out.println(search.search(randints, randints[NUMS - 10])); //배열 index 40번에 있는 숫자 -> 무조건 true
        System.out.println(search.search(randints, randints[NUMS - 20])); //배열 index 30번에 있는 숫자 -> 무조건 true
        System.out.println(search.search(randints, MAX + 10)); //120을 배열에서 찾기 -> 무조건 false
        System.out.println(search.search(randints, MIN - 10)); //120을 배열에서 찾기 -> 무조건 false
    }
}
