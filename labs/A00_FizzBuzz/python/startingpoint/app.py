def toText(n):
    return str(n)


def proveWorth():
    for i in [n + 1 for n in range(99)]:
        print(toText(i))


if __name__ == "__main__":
    proveWorth()
