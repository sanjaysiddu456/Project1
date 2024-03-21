class Bank

{
   var balance=500
fun deposit(amt:Int)
   {
       if(amt>25000)
       {
           println("Deposit limit is exceeded")
       }else {
           println("Amount deposited successfully ")
           balance = balance + amt+Amount
       }
   }
   fun withdraw(amt:Int)
   {
       if(amt<balance)
       {
           println("Insufficient funds")
       }else {
           println("Amountm withdrawn successfully ")
           balance = balance + amt
       }
   }

   fun checkBalance()
   {
       println("The Current balance is $balance")
   }
}hai welcome