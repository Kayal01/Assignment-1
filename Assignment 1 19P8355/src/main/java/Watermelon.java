
public class Watermelon {

    public boolean weight(int w){
        if(w<=0 || w>100)
            return false;
        if (w %2==0)
            return true;
        else
            return false;

    }
}
