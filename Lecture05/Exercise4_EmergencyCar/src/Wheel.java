class Wheel {
    private boolean isInflated;

    public Wheel() {
        isInflated = true;
    }

    public void inflate() {
        if (!isInflated) {
           isInflated = true;
            System.out.println("Wheel inflated");
        } else {
            System.out.println("Wheel is already inflated");
        }
    }

    public void deflate() {
        if (isInflated) {
            isInflated = false;
            System.out.println("Wheel deflated");
        } else {
            System.out.println("Wheel is already deflated");
        }
    }

    public void checkPressure() {
        if(!isInflated) {
            System.out.println("Warning: Wheel is deflated");
        } else {
            System.out.println("Wheel pressure is normal");
        }
    }


    //    private boolean isInflated;
//
//    public Wheel() {
//        this.isInflated = true;
//    }
//
//    public void inflate() {
//        if (!isInflated) {
//            isInflated = true;
//            System.out.println("Wheel inflated.");
//        } else {
//            System.out.println("Wheel is already inflated.");
//        }
//    }
//
//    public void deflate() {
//        if (isInflated) {
//            isInflated = false;
//            System.out.println("Wheel deflated.");
//        } else {
//            System.out.println("Wheel is already deflated.");
//        }
//    }
//
//    public boolean isInflated() {
//        return isInflated;
//    }
//
//    // Method to check air pressure and trigger warning
//    public void checkPressure() {
//        if (!isInflated) {
//            System.out.println("Warning: Wheel is deflated!");
//        } else {
//            System.out.println("Wheel pressure is normal.");
//        }
//    }
}