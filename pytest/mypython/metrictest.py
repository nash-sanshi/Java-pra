'''
Created on 2020-9-8

@author: zhangsanshi
'''
import time, functools
def metric(fn):
    # @functools.wraps(fn)
    def wrapper(*args,**kargs):
        t=time.time()
        fnvalue=fn(*args, **kargs)
        print('%s executed in %s ms' % (fn.__name__, time.time()-t))
        return fnvalue
    return wrapper

@metric
def fast(x, y):
    time.sleep(0.0012)
    return x + y;

@metric
def slow(x, y, z):
    time.sleep(0.1234)
    return x * y * z;

f = fast(11, 22)
s = slow(11, 22, 33)
if f != 33:
    print('测试失败!')
elif s != 7986:
    print('测试失败!')