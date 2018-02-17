public class ConnectedGraph {
    int nodes = 7;
    Edge[] edges = {
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
    Graph g = new Graph(nodes,edges);
}
