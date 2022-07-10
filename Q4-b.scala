def attendees(price:Int):Int=120+(15-price)/5*20; // calculating the attendees with the ticket price
def revenue(price:Int):Int = attendees(price)*price; // calculating the revenue earned by tickets
def cost(price:Int):Int=500+attendees(price); // calculating the total cost for show and the cost for attendees
def profit(price:Int):Int =revenue(price)- cost(price); // calculating the total profit after decreasing the cost

val input = 15;
println("Total profit gained by selling tickets at price: Rs. "+ input+ " is " + profit(input) );
