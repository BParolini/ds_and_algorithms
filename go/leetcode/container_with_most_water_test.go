package leetcode

import "testing"

func TestMaxArea1(t *testing.T) {
	result := maxArea([]int{1, 8, 6, 2, 5, 4, 8, 3, 7})
	if result != 49 {
		t.Errorf("expected %v, got %v", 49, result)
	}
}

func TestMaxArea2(t *testing.T) {
	result := maxArea([]int{1, 1})
	if result != 1 {
		t.Errorf("expected %v, got %v", 1, result)
	}
}
