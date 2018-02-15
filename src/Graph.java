public class Graph {

    private Edge[] edgeList;
    private int numberOfNodes;

    public Graph(int nodes, Edge[] edgeList) {
        this.edgeList = edgeList;
        this.numberOfNodes = nodes;
    }

    public int getNumberOfNodes() {
        return numberOfNodes;
    }

    public Edge[] getEdgeList() {
        return edgeList;
    }

}