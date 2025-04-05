package leetcode

func twoSum(nums []int, target int) [2]int {
	hash := make(map[int]int, len(nums))

	for i, v := range nums {
		hashItem, ok := hash[target-v]
		if ok {
			return [2]int{hashItem, i}
		}

		hash[nums[i]] = i
	}

	return [2]int{}
}
