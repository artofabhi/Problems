package com.abhi.mywork.util;

public class MyUtil {

	
	public static class Pair<X,Y> {
		
		public X x ; 
		public Y y ; 
		
		
		public Pair(X x, Y y) {
			this.x = x ; 
			this.y = y ; 
		}


		/**
		 * @return the x
		 */
		public X getX() {
			return x;
		}


		/**
		 * @param x the x to set
		 */
		public void setX(X x) {
			this.x = x;
		}


		/**
		 * @return the y
		 */
		public Y getY() {
			return y;
		}


		/**
		 * @param y the y to set
		 */
		public void setY(Y y) {
			this.y = y;
		}
		
		
	}
}
