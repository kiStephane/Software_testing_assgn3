package src;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class NewStutterTest {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testInput1() throws IOException {
		String[] args = {"input1.txt"};	
		Stutter.main(args);
	}
	
	@Test
	public void testInput2() throws IOException{
		String[] args = {"input2.txt"};	
		Stutter.main(args);
	}
	
	@Test
	public void testInput3() throws IOException {
		String[] args = {"input3.txt"};	
		Stutter.main(args);
	}
	
	@Test
	public void testInput4() throws IOException {
		String[] args = {"input4.txt"};	
		Stutter.main(args);
	}

}
