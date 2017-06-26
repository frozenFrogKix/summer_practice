import java.util.Vector;

/**
 * Created by root on 26.06.17.
 */
public class HandlerPrevStepButt  extends SortTree {

    public void standartHandle(){
        Vector<Integer> result = new Vector<>();
        int[] safeArr = new int[Graphic.maxElem];
        if(Graphic.step>0){
            --Graphic.step;
            for (int i = 0;i<Graphic.maxElem;++i){
                safeArr[i] = Graphic.firstSafedArray[i];
            }
            stepByStepSort(Graphic.step,result,safeArr);}
        else if(Graphic.step==0){
            stepByStepSort(0,result,safeArr);
        }
    }
}
