/*118. Pascal's Triangle
Solved
Easy
Topics
premium lock icon
Companies
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
*/




class Solution {
    public List<List<Integer>> generate(int numRows) {

        // Final answer list which stores all rows
        List<List<Integer>> ans = new ArrayList<>();

        // Outer loop for creating each row
        for(int i = 0; i < numRows; i++){

            // Create a new row
            List<Integer> row = new ArrayList<>();

            // Inner loop for filling elements in current row
            for(int j = 0; j <= i; j++){

                // First and last elements are always 1
                if(j == 0 || j == i){
                    row.add(1);
                }

                // Middle elements are sum of two elements
                // from previous row
                else{

                    // Get previous row from answer list
                    List<Integer> prev = ans.get(i - 1);

                    // Calculate current value
                    int value = prev.get(j - 1) + prev.get(j);

                    // Add value to current row
                    row.add(value);
                }
            }

            // Add completed row into final answer
            ans.add(row);
        }

        // Return all rows
        return ans;
    }
}
