class Engine {

    private boolean isRunning;

    public Engine() {
        this.isRunning = false;
    }

    public void start(){
        if (!isRunning) {
            isRunning = true;
            System.out.println("Engine started");
        } else {
            System.out.println("Engine is already running");
        }
    }

    public void stop() {
        if(isRunning) {
            isRunning = false;
            System.out.println("Engine stopped");
        } else {
            System.out.println("Engine is already turned off");
        }
    }

    //    private boolean isRunning;
//
//    public Engine() {
//        this.isRunning = false;
//    }
//
//    public void start() {
//        if (!isRunning) {
//            isRunning = true;
//            System.out.println("Engine started.");
//        } else {
//            System.out.println("Engine is already running.");
//        }
//    }
//
//    public void stop() {
//        if (isRunning) {
//            isRunning = false;
//            System.out.println("Engine stopped.");
//        } else {
//            System.out.println("Engine is already off.");
//        }
//    }
//
//    public boolean isRunning() {
//        return isRunning;
//    }
}

// class Engine {
//        private boolean isRunning;
//
//        public Engine() {
//            this.isRunning = false;
//        }
//
//        public void start() {
//            if (!isRunning) {
//                isRunning = true;
//                System.out.println("Engine started.");
//            } else {
//                System.out.println("Engine is already running.");
//            }
//        }
//
//        public void stop() {
//            if (isRunning) {
//                isRunning = false;
//                System.out.println("Engine stopped.");
//            } else {
//                System.out.println("Engine is already off.");
//            }
//        }
//
//        public boolean isRunning() {
//            return isRunning;
//        }
//    }
