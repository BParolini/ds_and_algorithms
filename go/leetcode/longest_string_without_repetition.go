package leetcode

import "slices"

func lengthOfString(s string) int {
	if len(s) < 2 {
		return len(s)
	}

	var (
		right   = 0
		left    = 0
		longest = 0
	)

	hash := make([]byte, len(s))

	for right < len(s) {
		c := s[right]

		for slices.Contains(hash[left:right], c) {
			hash[left] = 0
			left++
		}

		hash[right] = c
		longest = max(longest, right-left+1)
		right++
	}

	return longest
}
