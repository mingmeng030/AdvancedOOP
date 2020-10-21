public class Search {
    SearchAlgorithm SA;
    Search(){

    }

    public Search(SearchAlgorithm s) {
        this.SA = s;
    }

    public void setSearchAlg(SearchAlgorithm s) {
        this.SA = s;
    }

    public boolean search(int[] objs, int num) {
        return SA.search(objs, num);
    }
}
