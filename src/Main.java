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
        connectedGraph.printGraph("ConnectedGraph");

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
        connectedDenseGraph.printGraph("ConnectedDenseGraph");

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
        unConnectedGraph.printGraph("UnconnectedGraph");

        nodes = 5;
        Edge[] edgesConnectedGraphWithClicles = {
                new Edge(1,2,1),
                new Edge(1,1,4),
                new Edge(1,3,4),
                new Edge(1,4,6),
                new Edge(1,5,2),
                new Edge(2,3,1),
                new Edge(2,4,4),
                new Edge(2,5,6),
                new Edge(2,2,1),
                new Edge(3,4,1),
                new Edge(3,3,4),
                new Edge(3,5,4),
                new Edge(4,5,2),
                new Edge(4,4,1)
        };
        Graph connectedGraphWithCicles = new Graph(nodes,edgesConnectedGraphWithClicles);
        connectedGraphWithCicles.printGraph("ConnectedGraphWithCicles");

        nodes = 1;
        Edge[] edgesOneNodeGraph = {
                new Edge(1,1,1),
        };
        Graph oneEdgeGraph=new Graph(nodes,edgesOneNodeGraph);
        oneEdgeGraph.printGraph("OneEdgeGraph");

        nodes = 1;
        Graph noEdgesGraph=new Graph(nodes,null);
        noEdgesGraph.printGraph("NoEdgesGraph");
    }
}
