/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class cengxubianli {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        qu.offer(root);
        while(!qu.isEmpty()){
            List<Integer> itemList = new ArrayList<>();
            //统计每一层的节点个数
            int len = qu.size();
            while(len > 0){
                TreeNode cur = qu.poll();
                if(cur != null){
                itemList.add(cur.val);
                if(cur.left!=null) qu.offer(cur.left);
                if(cur.right!=null) qu.offer(cur.right);
                }
                
                len--;
            }
            ans.add(itemList);
        }
        return ans;
        }
    }
