class Solution(object):
    def thirdMax(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums = set(nums)
        nums = list(nums)
        nums = sorted(nums)

        if len(nums)<3:
            return nums[-1]
        return nums[-3]