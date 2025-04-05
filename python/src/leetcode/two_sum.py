from types import NoneType


def two_sum(nums: list[int], target: int) -> tuple[int, int]:
    hash: dict[int, int] = {}

    for i, v in enumerate(nums):
        item = hash[target - v] if target - v in hash else None
        if type(item) != NoneType:
            return item, i

        hash[v] = i

    return tuple()
