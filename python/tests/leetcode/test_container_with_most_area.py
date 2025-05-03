from src.leetcode.container_with_most_area import max_area


def test_max_area_1() -> None:
    assert 49 == max_area([1, 8, 6, 2, 5, 4, 8, 3, 7])


def test_max_area_2() -> None:
    assert 1 == max_area([1, 1])
