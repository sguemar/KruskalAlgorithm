public class Main {

    public static void main(String[] args) {

        int nodes = 7;
        Edge[] edgesConnectedGraph = {
            new Edge(1,2,1),
            new Edge(1,4,4),
            new Edge(1,5,6),
            new Edge(2,3,2),
            new Edge(2,5,4),
            new Edge(3,5,4),
            new Edge(3,6,6),
            new Edge(3,7,4),
            new Edge(4,5,3),
            new Edge(4,7,4),
            new Edge(5,6,8),
            new Edge(5,7,7),
            new Edge(6,7,3)
        };
        Graph connectedGraph = new Graph(nodes,edgesConnectedGraph);

        nodes = 5;
        Edge[] edgesDenseGraph = {
            new Edge(1,2,1),
            new Edge(1,3,4),
            new Edge(1,4,6),
            new Edge(1,5,2),
            new Edge(2,3,1),
            new Edge(2,4,4),
            new Edge(2,5,6),
            new Edge(3,4,1),
            new Edge(3,5,4),
            new Edge(4,5,2),
        };
        Graph connectedDenseGraph = new Graph(nodes,edgesDenseGraph);

        nodes = 5;
        Edge[] edgesUnconnectedGraph = {
                new Edge(1,2,1),
                new Edge(1,3,4),
                new Edge(1,5,2),
                new Edge(2,3,1),
                new Edge(2,5,6),
                new Edge(3,5,4),
        };
        Graph unConnectedGraph = new Graph(nodes,edgesUnconnectedGraph);

//        Edge[] minimumExpansionTree = KruskalAlgorithm.Kruskal(g,g.getEdgeList());
//        if (minimumExpansionTree == null){
//            System.out.println("Invalid Graph: Unconnected");
//
//        }else{
//            for (Edge e :
//                    minimumExpansionTree) {
//                System.out.println(e);
//            }
//        }

    }
}
