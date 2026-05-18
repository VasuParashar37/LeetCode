class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Create graph
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        // Build graph: prereq -> course
        for (int i = 0; i < prerequisites.length; i++) {

            int course = prerequisites[i][0];
            int prereq = prerequisites[i][1];

            adj.get(prereq).add(course);
        }

        // Indegree array
        int[] indegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            for (int it : adj.get(i)) {
                indegree[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();

        // Add all nodes with indegree 0
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        int[] topo = new int[numCourses];
        int index = 0;

        // Kahn's BFS
        while (!q.isEmpty()) {

            int node = q.poll();

            topo[index++] = node;

            for (int it : adj.get(node)) {

                indegree[it]--;

                if (indegree[it] == 0) {
                    q.add(it);
                }
            }
        }

        // If cycle exists
        if (index != numCourses) {
            return new int[0];
        }

        return topo;
    }
}