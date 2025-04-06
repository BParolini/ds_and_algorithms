package leetcode

import "testing"

func TestContainsDuplicate1(t *testing.T) {
	if !containsDuplicate([]int{1, 2, 3, 1}) {
		t.Errorf("expected true, got false")
	}
}

func TestContainsDuplicate2(t *testing.T) {
	if containsDuplicate([]int{1, 2, 3, 4}) {
		t.Errorf("expected false, got true")
	}
}

func TestContainsDuplicate3(t *testing.T) {
	if !containsDuplicate([]int{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}) {
		t.Errorf("expected true, got false")
	}
}
