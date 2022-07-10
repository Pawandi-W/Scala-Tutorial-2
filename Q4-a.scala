def wage(hours:Int):Int=hours * 250; // calculate normal amount
def ot(hours:Int):Int=hours* 85; // calculate ot amount
def income(h1:Int,h2:Int):Int= wage(h1) + ot(h2); // calculate income amount
def tax(income:Int):Double=income* 0.12f; // calculate tax payment fo income
def takeHome(h1:Int,h2:Int):Double=income(h1,h2)-tax(income(h1,h2)); // calculate final takeHome amount
