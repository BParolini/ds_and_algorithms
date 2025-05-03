package leetcode

func maxArea(height []int) int {
	left := 0
	right := len(height) - 1

	maxArea := min(height[left], height[right]) * (right - left)

	for left < right {
		if height[left] < height[right] {
			left++
		} else {
			right--
		}

		maxArea = max(maxArea, min(height[left], height[right])*(right-left))
	}

	return maxArea
}
