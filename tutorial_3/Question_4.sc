val price = 24.95
val shipping1 = 3
val shipping2 = 0.75
val noOfCopies = 60
val dis = 40

def cost(copies:Int)=price*copies
def discount(copies:Int)= cost(copies)*40/100
def netCost(copies:Int)=cost(copies) - discount(copies)
def shippingCost(x:Int):Double= x match{
  case x if x<= 50 => x*shipping1
  case x if x>50 => (x-50)*shipping2 + 50*shipping1
}
def wholeSale(copies:Int)=netCost(copies)+shippingCost(copies)

println("Total wholesale cost of 60 copies is = "+wholeSale(noOfCopies))
