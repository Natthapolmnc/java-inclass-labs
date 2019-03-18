package car;
 class Truck extends Car{
        private double maxWeight;
        private double weight;
        public Truck(double gas, int effective,double weight,double maxWeight) {
            super(gas, effective);
            if (weight>maxWeight){
                this.weight=maxWeight;
            }else{
                this.weight=weight;
            }
            this.maxWeight=maxWeight;
        }
        public void drive(double distance){
            double usedGas=distance/super.getEfficiency();
            if (weight<1){
                if (usedGas>=super.getGas()){
                    System.out.println("You cannot drive too far,please add gas");
                }else{
                    super.setGas(super.getGas()-usedGas);
            }}else if(weight<11){
                if (usedGas>=super.getGas()){
                    System.out.println("You cannot drive too far,please add gas");
                }else{
                    super.setGas(super.getGas()-usedGas*1.1);}
            }else if (weight<21){
                    if (usedGas>=super.getGas()){
                    System.out.println("You cannot drive too far,please add gas");
                }else{
                    super.setGas(super.getGas()-usedGas*1.2);}
            }else if (weight>20){
                if (usedGas>=super.getGas()){
                    System.out.println("You cannot drive too far,please add gas");
                }else{
                    super.setGas(super.getGas()-usedGas*1.3);}
    }
}}