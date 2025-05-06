package cor;

abstract public class Calculator {
    //private Calculator nextCalculator;
    private Calculator preCalculator;

    public void setNextCalculator(Calculator nextCalculator) {
        //this.nextCalculator = nextCalculator;
        this.preCalculator = nextCalculator;
    }

    public boolean process(Request request){
//        if(operator(request)){
//            return true;
//        }else{
//            if(nextCalculator != null){
//                return nextCalculator.process(request);
//            }
//            return false;
//        }
        if(preCalculator != null)
            if(preCalculator.process(request))
                return true;

        return operator(request);
    }

    abstract protected boolean operator(Request request);
}
