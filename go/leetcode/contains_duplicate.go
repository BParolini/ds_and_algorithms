package leetcode

import "slices"

func containsDuplicate(nums []int) bool {
	item := make([]int, len(nums))

	for _, num := range nums {
		if slices.Contains(item, num) {
			return true
		}

		item = append(item, num)
	}

	return false
}
