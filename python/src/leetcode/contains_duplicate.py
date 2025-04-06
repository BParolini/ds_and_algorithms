def contains_duplicate(nums: list[int]) -> bool:
    item: set[int] = set()

    for num in nums:
        if num in item:
            return True

        item.add(num)

    return False
