from src.leetcode.contains_duplicate import contains_duplicate


def test_contains_duplicate_1() -> None:
    assert contains_duplicate([1, 2, 3, 1])


def test_contains_duplicate_2() -> None:
    assert not contains_duplicate([1, 2, 3, 4])


def test_contains_duplicate_3() -> None:
    assert contains_duplicate([1, 1, 1, 3, 3, 4, 3, 2, 4, 2])
