package java.sortvisualizer.handlers;

import java.awt.*;
import java.sortvisualizer.graphic.Graphic;
import java.sortvisualizer.handlers.visualize.Move;
import java.sortvisualizer.handlers.visualize.SortTree;
import java.util.Vector;

/**
 * Created by root on 26.06.17.
 */
public class HandlerAnotherSortButt extends SortTree {
    private Vector<Integer> result = new Vector<>();
    private int[] safeArr = new int[Graphic.maxElem];

    public void standartHandle(){
        for (int i = 0; i< Graphic.maxElem; ++i)
            safeArr[i] = Graphic.sortedArray[i];

        switch ((String) Graphic.typeOfSort.getSelectedItem()){
            case "Automatic":
                for (int i = 0; i< Graphic.maxElem; ++i)
                    Graphic.sortedEl[i].setForeground(Color.LIGHT_GRAY);

                SortTree.automaticSort(safeArr,result);
                break;
            case "Step-by-Step":
                Move.lock();
                Graphic.anotherSortButt.setEnabled(true);
                Graphic.step = 1;
                for (int i = 0; i< Graphic.maxElem; ++i){
                    Graphic.firstSafedArray[i] = safeArr[i];
                }
                SortTree.stepByStepSort(Graphic.step,result,safeArr);
                break;
            case "Result":
                Graphic.step = -1;
                for (int i = 0; i< Graphic.maxElem; ++i){
                    Graphic.firstSafedArray[i] = safeArr[i];
                }
                SortTree.stepByStepSort(Graphic.step,result,safeArr);
                for (int i = 0; i < Graphic.maxElem; ++i)
                    Graphic.sortedEl[i].setForeground(Color.lightGray);
                Graphic.nextStepSortButt.setEnabled(false);
                Graphic.prevStepSortButt.setEnabled(false);
                Move.unlock();
                break;
        }

    }
}