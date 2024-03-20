import java.util.Scanner
import kotlin.system.exitProcess

fun main()
{
    var amt=0
    var b=Bank()
    var count=3
    var pin=0
    var cpin=1234

    println("Welcome to Bank")

    println("Enter your pin")

    var x=Scanner(System.`in`)
    pin=x.nextInt()

    while (count>1 && pin!=cpin)
    {
        println("Enter the valid pin")
        pin=x.nextInt()
        count--
        if(count<=1)
        {
            println("Please contact your bank")
            println("Thank You")
        }
    }
    var choice=0

    if(pin==cpin)
    {
        while (choice<=4)
        {
            println("Select the choice")
            println(" 1-deposit 2-withdraw 3-balance 4-exit")
            choice=x.nextInt()
            when(choice)
            {
                1-> {
                    println("enter the amount to be deposited")
                    var amt = x.nextInt()
                    b.deposit(amt)
                }
                2->{
                    println("enter the amount to be withdrawn")
                    var amt = x.nextInt()
                    b.withDraw(amt)
                }
                3->{

                    b.checkBalance()
                }
                4-> {
                    println("Thank You")
                    exitProcess(0)
                }
                else->{
                    println("Invalid choice selection")
                }


            }
        }
    }

}