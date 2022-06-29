import sys
param = int(sys.stdin.readline())
def factorial(param) :return param*factorial(param-1) if param > 1 else 1

print(factorial(param))