public class TriangleChecker {

    boolean isRightTriangle (Triangle trojkat){

        if( (trojkat.getBokA()*trojkat.getBokA() + trojkat.getBokB()*trojkat.getBokB() == trojkat.getBokC()*trojkat.getBokC()) ||
            (trojkat.getBokB()*trojkat.getBokB() + trojkat.getBokC()*trojkat.getBokC() == trojkat.getBokA()*trojkat.getBokA()) || 
            (trojkat.getBokC()*trojkat.getBokC() + trojkat.getBokA()*trojkat.getBokA() == trojkat.getBokB()*trojkat.getBokB()) ){
           return true;
        } else {
           return false;
        }
    }
}
