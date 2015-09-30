package com.abhi.mywork.epichap09;

/**
 * Created by apurohit on 9/19/15.
 */
public class BinaryTreeLock {

    static class Node {
        private boolean locked ;
        private int numDecLocked ;

        private Node parent, left, right ;


        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public boolean isLocked() {
            return locked;
        }

        public boolean lock() {
            if (this.numDecLocked > 0  || this.locked) {
                return false ;
            }

            while (this.parent != null ) {
                if (this.parent.isLocked()) {
                    return false ;
                }
            }

            while (this.parent != null) {
                this.parent.numDecLocked++ ;
            }

            this.locked = true ;
            return true ;
        }

        public int getNumDecLocked() {
            return numDecLocked;
        }

        public void setNumDecLocked(int numDecLocked) {
            this.numDecLocked = numDecLocked;
        }

        public Node getParent() {
            return parent;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }



    }



}
