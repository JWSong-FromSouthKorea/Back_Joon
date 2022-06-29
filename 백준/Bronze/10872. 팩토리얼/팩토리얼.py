import sys
param = int(sys.stdin.readline())
def factorial(param) :
    if param > 1:
        return param*factorial(param-1)
    else: return 1

print(factorial(param))