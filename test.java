/*
 * This class provides the scaffolding to test the class
 * Code using assertions. 
 */
class Test {

	// Main function to run all of your unit tests
	public static void main(String args[]) {
	   Code c = new Code();
	   test_func(c);
	}

	// Sample unit test that always passes
	public static void test_func(Code c) {
          assert(c.func() == 3);
	}

	// Sample unit test that always fails
	// (comment out the assert to get the failure)
	public static void test_broken() {
          //assert(1 == 2);
	}
}
