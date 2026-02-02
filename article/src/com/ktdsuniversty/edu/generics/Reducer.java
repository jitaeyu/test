package com.ktdsuniversty.edu.generics;

public interface Reducer<INPUT,OUTPUT> {

	OUTPUT reduce(INPUT input,OUTPUT output); 
}
