package com.ktdsuniversty.edu.generics;

public class ScoreList<T, SUM_RESULT> {
	
	//ScoreList 에서 사용할 멤버변수
	//점수들의 배열
	private Object[] scoreArray;

	
	//배열에 몇개의 데이터가 있는지 확인
	private int size;
	
	
	
	
	public ScoreList(){
		this.scoreArray=new Object[2];
	}
	
	public void add(T score) {
		if(this.size >= this.scoreArray.length) {
			//배열의 길이를 늘린다
			//1. 가존 배열의 길이보다 2개더 많은 인덱스를 가진 배열을 새롭게 만든다.
			Object[] newArray = new Object[this.scoreArray.length+2];
			//2. 기존 배열의 데이터를 새로운 배열에 복사한다.
			System.arraycopy(this.scoreArray,0,newArray,0,this.scoreArray.length);
			//원본배열,복사를 시작할 원본배열의 인덱스번호, 
//			복사를받을 새로운배열,
//			새로운배열의복사를받을 시작인덱스번호,
//			복사할갯수
			
			//3.새로운 배열의 기존 배열을 할당한다.
			this.scoreArray=newArray;
		
		}
		this.scoreArray[size++] = score;
		
	}
	public T get(int index) {
		if(this.size<=index) {
			// throw new IndexOutOfBoundsException(this.size+"보다 크거나 같은 인덱스는 없습니다");
			System.out.println("??");
		}
		T value = (T) this.scoreArray[index];
		return value;
	}
	
	public SUM_RESULT sum(Reducer<T, SUM_RESULT>reducer,SUM_RESULT defaultValue) {
		SUM_RESULT result = defaultValue;
		
		T t = null;
		for(int i=0; i<this.size; i++) {
			t = (T)this.scoreArray[i];
			result = reducer.reduce(t, result);
			
			
		}
		
		return result;
		
	}
	
}
