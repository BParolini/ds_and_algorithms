def length_of_longest_substring(s: str) -> int:
    if not s:
        return 0

    if len(s) < 2:
        return len(s)

    right: int = 0
    left: int = 0
    longest: int = 0

    hash: set[str] = set()

    while right < len(s):
        c = s[right]

        while c in hash:
            hash.remove(s[left])
            left += 1

        hash.add(c)
        longest = max(longest, right - left + 1)
        right += 1

    return longest
