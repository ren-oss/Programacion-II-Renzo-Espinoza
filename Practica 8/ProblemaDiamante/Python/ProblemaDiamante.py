class A:
    def __init__(self,x):
        self.x = x
    
    def metodo1(self):
        self.x += 1

class B:
    def __init__(self,y):
        self.y = y
    
    def metodo2(self):
        self.y += 1

class C(A,B):
    def __init__(self,x,y):
        A.__init__(self,x)
        B.__init__(self,y)
    
    def metodo(self):
        self.x += 1
        self.y += 1
    
    def __str__(self):
        return f"x = {self.x}, y =  {self.y}"

class main():
    c = C(5,10)
    print(f"Original: {c}")
    print("Usando el metodo1 y metodo2")
    c.metodo1()
    print(f"metodo1: {c}")
    c.metodo2()
    print(f"metodo2: {c}")