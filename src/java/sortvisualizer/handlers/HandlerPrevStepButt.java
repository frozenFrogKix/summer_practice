package java.sortvisualizer.handlers;

import java.sortvisualizer.graphic.Graphic;
import java.sortvisualizer.handlers.visualize.SortTree;
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
            for (int i = 0; i< Graphic.maxElem; ++i){
                safeArr[i] = Graphic.firstSafedArray[i];
            }
            SortTree.stepByStepSort(Graphic.step,result,safeArr);}
        else if(Graphic.step==0){
            SortTree.stepByStepSort(0,result,safeArr);
        }
    }
}