public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.println(this.getName() + " takes off in the sky");
        }
    }

    public int ascend(int meters) {
        if (this.flying) {
            this.altitude = Math.min(this.altitude + meters, 1000);
            System.out.println(this.getName() + " is flying upward, altitude: " + this.altitude);
        }
        return this.altitude;
    }

    public int descend(int meters) {
        if (this.flying) {
            this.altitude = Math.min(this.altitude - meters, 10);
            System.out.println(this.getName() + " is flying down, altitude " + this.altitude);
        }
        return this.altitude;

    }

    @Override
    public void glide() {
        if (this.altitude == 150) {
            System.out.println(this.getName() + " is gliding");
        }
    }

    @Override
    public void land() {
        if (this.altitude > 1 && this.flying) {
            System.out.println(this.getName() + " is too high, can not land");
        } else if (this.altitude == 1 && this.flying) {
            this.flying = false;
            System.out.println(this.getName()+ " lands on the ground");
        }
    }
}
