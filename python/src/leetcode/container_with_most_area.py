def max_area(height: list[int]) -> int:
    left = 0
    right = len(height) - 1

    max_area = min(height[left], height[right]) * (right - left)

    while left < right:
        if height[left] < height[right]:
            left += 1
        else:
            right -= 1

        max_area = max(max_area, min(
            height[left], height[right]) * (right - left))

    return max_area
