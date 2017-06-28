package java.sortvisualizer.handlers.visualize;

import java.sortvisualizer.graphic.Graphic;
import java.sortvisualizer.sorts.*;
import java.util.Vector;
import java.sortvisualizer.sorts.MergeSort;

/**
 * Created by root on 26.06.17.
 */
public class SortTree extends Move {

    public static void automaticSort(int[] safeArr, Vector<Integer> result){
        Graphic.nextStepSortButt.setEnabled(false);
        Graphic.prevStepSortButt.setEnabled(false);

        String choiceSort = (String) Graphic.sortBox.getSelectedItem();

        switch (choiceSort) {
            case "java.sortvisualizer.sorts.MergeSort":
                MergeSort merge = new MergeSort(Graphic.numberOfSortedEl, safeArr);
                result = merge.sort(-1);
                Move.moveNotChoiceSort(result);
                break;
            case "java.sortvisualizer.sorts.ShellSort":
                ShellSort shell = new ShellSort(Graphic.numberOfSortedEl,safeArr);
                result = shell.sort(-1);
                Move.moveNotChoiceSort(result);
                break;
            case  "java.sortvisualizer.sorts.SelectionSort":
                SelectionSort sel = new SelectionSort(Graphic.numberOfSortedEl,safeArr);
                result = sel.sort(-1);
                Move.move(result);
                break;
            case "java.sortvisualizer.sorts.InsertionSort":
                InsertionSort ins = new InsertionSort(Graphic.numberOfSortedEl,safeArr);
                result = ins.sort(-1);
                Move.move(result);
                break;
            case "BubbleSort":
                BubbleSort bubSort = new BubbleSort(Graphic.numberOfSortedEl, safeArr);
                result = bubSort.sort(-1);
                Move.move(result);
                break;
            case "java.sortvisualizer.sorts.QuickSort":
                QuickSort quickSortt = new QuickSort(Graphic.numberOfSortedEl,safeArr);
                result = quickSortt.sort(-1);
                Move.move(result);
                break;
            case "java.sortvisualizer.sorts.ShakerSort":
                ShakerSort shakeSort = new ShakerSort(Graphic.numberOfSortedEl,safeArr);
                result = shakeSort.sort(-1);
                Move.move(result);
                break;
            case "java.sortvisualizer.sorts.StupidSort":
                StupidSort stupSort = new StupidSort(Graphic.numberOfSortedEl,safeArr);
                result = stupSort.sort(-1);
                Move.move(result);
                break;
        }

    }

    protected static void stepByStepSort(int step, Vector<Integer> result, int[] safeArr){
        Graphic.nextStepSortButt.setEnabled(true);
        Graphic.prevStepSortButt.setEnabled(true);


        String choiceSort = (String) Graphic.sortBox.getSelectedItem();
        for (int i = 0; i< Graphic.maxElem; ++i){
            safeArr[i] = Graphic.firstSafedArray[i];
        }

        switch (choiceSort) {
            case "java.sortvisualizer.sorts.MergeSort":
                MergeSort merge = new MergeSort(Graphic.numberOfSortedEl, safeArr);
                result = merge.sort(step);
                Move.moveNotChoiceSortStepByStep(result, Graphic.firstSafedArray);
                break;
            case "java.sortvisualizer.sorts.ShellSort":
                ShellSort shell = new ShellSort(Graphic.numberOfSortedEl,safeArr);
                result = shell.sort(step);
                Move.moveNotChoiceSortStepByStep(result, Graphic.firstSafedArray);
                break;
            case  "java.sortvisualizer.sorts.SelectionSort":
                SelectionSort sel = new SelectionSort(Graphic.numberOfSortedEl,safeArr);
                result = sel.sort(step);
                Move.moveNextStep(result, Graphic.firstSafedArray);
                break;
            case "java.sortvisualizer.sorts.InsertionSort":
                InsertionSort ins = new InsertionSort(Graphic.numberOfSortedEl,safeArr);
                result = ins.sort(step);
                Move.moveNextStep(result, Graphic.firstSafedArray);
                break;
            case "BubbleSort":
                BubbleSort bubSort = new BubbleSort(Graphic.numberOfSortedEl, safeArr);
                result = bubSort.sort(step);
                Move.moveNextStep(result, Graphic.firstSafedArray);
                break;
            case "java.sortvisualizer.sorts.QuickSort":
                QuickSort quickSortt = new QuickSort(Graphic.numberOfSortedEl,safeArr);
                result = quickSortt.sort(step);
                Move.moveNextStep(result, Graphic.firstSafedArray);
                break;
            case "java.sortvisualizer.sorts.ShakerSort":
                ShakerSort shakeSort = new ShakerSort(Graphic.numberOfSortedEl,safeArr);
                result = shakeSort.sort(step);
                Move.moveNextStep(result, Graphic.firstSafedArray);
                break;
            case "java.sortvisualizer.sorts.StupidSort":
                StupidSort stupSort = new StupidSort(Graphic.numberOfSortedEl,safeArr);
                result = stupSort.sort(step);
                Move.moveNextStep(result, Graphic.firstSafedArray);
                break;
        }

    }
}
