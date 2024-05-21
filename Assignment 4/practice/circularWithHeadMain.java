package com.assignment.a4;

public class circularWithHeadMain {


        public static void main(String[] args) {
            // TODO Auto-generated method stub

            CircularListwithHead l1 = new CircularListwithHead();

            l1.addFirst('n');
            l1.addFirst('u');
            l1.addFirst('s');
            l1.addLast('b');
            l1.addLast('e');
            l1.addLast('a');
            l1.addLast('m');

//            l1.deleteFirst();
//            l1.deleteLast();
            l1.addPosition('o',4);
            l1.deletePosition(4);

            l1.display();




    }

}
