// basically abstract classs is a half finished plan 
// for example when we write notes or assignments in our school days we feel overloaded and we assign the remaining task to our siblings in favour of chocolates or gifts 

// that basically abstract  is which has half finished task need to be finished by other  child class 


// another example if we consider amazon amazon has many delivery partners and they dont want to know who delivers the product at the end the order should be delivered .

// combining it with anonymous class we say abstract+ anonymous 


// we will deliver the product but we dont use the same guy to deliver the same persons product we assign randomly 
 


abstract class  Abstract_anonymous {
    abstract void deliver();
}

 class Delivery {

    public static void main(String[] args) {
        Abstract_anonymous d = new Abstract_anonymous() {
            @Override
            void deliver() {
                System.out.println("Your order will be delivered by bike ");
            }
        };

d.deliver();

    }

}



