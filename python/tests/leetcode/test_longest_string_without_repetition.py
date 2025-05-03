from src.leetcode.longest_string_without_repetition import \
    length_of_longest_substring


def test_longest_string_1() -> None:
    assert 3 == length_of_longest_substring("abcabcbb")


def test_longest_string_2() -> None:
    assert 1 == length_of_longest_substring("bbbbb")


def test_longest_string_3() -> None:
    assert 3 == length_of_longest_substring("pwwkew")
