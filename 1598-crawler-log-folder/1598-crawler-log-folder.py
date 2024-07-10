class Solution:
    def minOperations(self, logs: list[str]) -> int:
        path = []
        for log in logs:
            if log == "../":
                if path:
                    path.pop()
            elif log != "./":
                path.append(log)
        
        return len(path)
