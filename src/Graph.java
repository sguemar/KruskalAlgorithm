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

    public boolean containCicles(Edge[] minimumExpansionTree, int numberOfNodes) {
        return minimumExpansionTree.length > numberOfNodes - 1 || !isConnected(minimumExpansionTree, numberOfNodes);
    }

    private boolean isConnected(Edge[] minimumExpansionTree, int numberOfNodes) {
        int[] nodes = new int[numberOfNodes];
        int edgePos = 0;
        while (edgePos < numberOfNodes - 1) {
            int node1 = minimumExpansionTree[edgePos].getNode1();
            int node2 = minimumExpansionTree[edgePos].getNode2();
            if (nodes[node1 - 1] == 0) nodes[node1 - 1] = node1;
            if (nodes[node2 - 1] == 0) nodes[node2 - 1] = node2;
            edgePos++;
        }
        for (int i = 0; i < nodes.length; i++) {
            if (nodes[i] != i + 1) return false;
        }
        return true;
    }

    public void printGraph(String graphType){
        if (this.edgeList == null) System.out.println("\nInvalid Graph (" + graphType + "): No Edges");
        else {
            Edge[] edgesConnectedGraphMinimumExpansionTree = KruskalAlgorithm.Kruskal(this, this.getEdgeList());
            if (edgesConnectedGraphMinimumExpansionTree == null) {
                if (this.numberOfNodes == 1) System.out.println("\nInvalid Graph (" + graphType + "): One node only");
                else System.out.println("\nInvalid Graph (" + graphType + "): Unconnected");
            } else {
                if (this.containCicles(edgesConnectedGraphMinimumExpansionTree, this.getNumberOfNodes()))
                    System.out.println("\nInvalid tree of Graph (" + graphType + "): Contains cicles");
                else {
                    System.out.println("\n" + graphType + ":");
                    for (Edge e :
                            edgesConnectedGraphMinimumExpansionTree) {
                        System.out.println(e);
                    }
                }
            }
        }
    }

}

