class Solution:
  def patchingArray(self, nums: list[int], n: int) -> int:
    missValue  = 1
    result = 0
    i = 0

    while missValue  <= n:
      if i < len(nums) and nums[i] <= missValue :
        missValue  += nums[i]
        i += 1
      else:
        missValue += missValue 
        result += 1

    return result                                              
                  