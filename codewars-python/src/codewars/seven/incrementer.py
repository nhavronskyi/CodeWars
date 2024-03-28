def incrementer(nums: []) -> []:
    for i in range(len(nums)):
        val = nums[i] + i + 1
        if val > 9:
            val %= 10
        nums[i] = val

    return nums
