public class Hottub {
	boolean on;
	int temperature;

	public Hottub() {
	}

	public void on() {
		on = true;
	}

	public void off() {
		on = false;
	}

	public void bubblesOn() {
		if (on) {
			System.out.println("Hottub is bubbling!");
		}
	}

	public void bubblesOff() {
		if (on) {
			System.out.println("Hottub is not bubbling");
		}
	}

	public void jetsOn() {
		if (on) {
			System.out.println("Hottub jets are on");
		}
	}

	public void jetsOff() {
		if (on) {
			System.out.println("Hottub jets are off");
		}
	}

	public void setTemperature(int temperature) {
		if(temperature >= 80 && temperature <= 110)
        {
            this.temperature = temperature;
	    }
        System.out.println("Current Temperature: " + temperature);
    }

    public int getTemperature()
    {
        return temperature;
    }

    public void Increment()
    {
        System.out.println("Incrementing the temperature by 1.");
        setTemperature(temperature+1);
    }

    public void Decrement()
    {
        System.out.println("Decrementing the temperature by 1.");
        setTemperature(temperature-1);
    }

	public void heat() {
		setTemperature(105);
	}

	public void cool() {
        setTemperature(98);	
   	}

}
