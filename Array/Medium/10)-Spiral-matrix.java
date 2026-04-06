class Solution 
{
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer> res = new ArrayList<>();

        int rb = 0, re = matrix.length - 1;
        int cb = 0, ce = matrix[0].length - 1;

        while (rb <= re && cb <= ce)
        {
            // 1. Top row
            for (int j = cb; j <= ce; j++)
                res.add(matrix[rb][j]);
            rb++;

            // 2. Right column
            for (int i = rb; i <= re; i++)
                res.add(matrix[i][ce]);
            ce--;

            // 3. Bottom row
            if (rb <= re)
            {
                for (int j = ce; j >= cb; j--)
                    res.add(matrix[re][j]);
                re--;
            }

            // 4. Left column
            if (cb <= ce)
            {
                for (int i = re; i >= rb; i--)
                    res.add(matrix[i][cb]);
                cb++;
            }
        }

        return res;
    }
}

//https://leetcode.com/problems/spiral-matrix/description/?utm=codolio
