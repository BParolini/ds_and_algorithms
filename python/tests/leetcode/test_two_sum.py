from src.leetcode.two_sum import two_sum


def test_two_sum_1() -> None:
    result = two_sum([2, 7, 11, 15], 9)
    expected = (0, 1)

    assert result == expected


def test_two_sum_2() -> None:
    result = two_sum([3, 2, 4], 6)
    expected = (1, 2)

    assert result == expected


def test_two_sum_3() -> None:
    result = two_sum([3, 3], 6)
    expected = (0, 1)

    assert result == expected
