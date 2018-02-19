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

    public void printGraph(String graphType){
        if (this.edgeList == null) System.out.println("\nInvalid Graph (" + graphType + "): No Edges");
        else {
            Edge[] edgesConnectedGraphMinimumExpansionTree = KruskalAlgorithm.Kruskal(this, this.getEdgeList());
            if (edgesConnectedGraphMinimumExpansionTree == null) {
                if (this.numberOfNodes == 1) System.out.println("\nInvalid Graph (" + graphType + "): One node only");
                else System.out.println("\nInvalid Graph (" + graphType + "): Unconnected");
            } else {
                System.out.println("\n" + graphType + ":");
                for (Edge e :
                        edgesConnectedGraphMinimumExpansionTree) {
                    System.out.println(e);
                }
            }
        }
    }

}