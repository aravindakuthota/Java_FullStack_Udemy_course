package Advanced_java;

//  its a special type of class that can have a fixed set of constants values you decide in advance .



enum TrafficLight {
    RED, YELLOW, GREEN
}


public class MyEnum {
	public static void main(String[] args) {
    
    TrafficLight signal = TrafficLight.RED;
    System.out.println("Current signal: " + signal);
    

    if(signal  == TrafficLight.RED) {
        System.out.println("Stop");
    } else if(signal == TrafficLight.YELLOW) {
        System.out.println("Get Ready");
    } else if(signal == TrafficLight.GREEN) {
        System.out.println("Go");

        
    }
}
}