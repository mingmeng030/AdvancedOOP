public class linearSearch implements SearchAlgorithm{
    public boolean search(int[] objs, int num) {
        for (int n : objs) {
            if (num == n) return true;
        }
        return false;
    }
}
