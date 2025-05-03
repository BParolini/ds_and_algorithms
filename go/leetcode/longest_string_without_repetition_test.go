package leetcode

import "testing"

func TestLengthOfString1(t *testing.T) {
	result := lengthOfString("abcabcbb")
	if result != 3 {
		t.Errorf("expected %v, got %v", 3, result)
	}
}

func TestLengthOfString2(t *testing.T) {
	result := lengthOfString("bbbbb")
	if result != 1 {
		t.Errorf("expected %v, got %v", 1, result)
	}
}
func TestLengthOfString3(t *testing.T) {
	result := lengthOfString("pwwkew")
	if result != 3 {
		t.Errorf("expected %v, got %v", 3, result)
	}
}
