class Solution:
    def bstToGst(self, root: TreeNode) -> TreeNode:
        stack = []
        u = root
        while u:
            stack.append(u)
            u = u.right
        greater = 0
        while stack:
            node = stack.pop()
            greater += node.val
            node.val = greater
            node = node.left
            while node:
                stack.append(node)
                node = node.right
        return root 