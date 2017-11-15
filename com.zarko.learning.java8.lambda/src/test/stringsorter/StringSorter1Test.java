package test.stringsorter;

import java8.stringsorter.StringSorter1;
import java8.stringsorter.StringSorter2;
import java8.stringsorter.StringSorter3;
import java8.stringsorter.StringSorter4;

class StringSorter1Test {
    public static void main(String[] args){
        StringSorter1.doTests();
        StringSorter2 stringSorter2 = new StringSorter2();
        stringSorter2.doTests();
        StringSorter3 stringSorter3 = new StringSorter3();
        stringSorter3.doTests();
        StringSorter4 stringSorter4 = new StringSorter4();
        stringSorter4.doTests();
    }
}