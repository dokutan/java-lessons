/* 2020-11-13
 *
 */

public class MultiplyMatrices {
	
	public static class Matrix {
		
		public double[][] data;
		
		public Matrix(){
			data = new double[3][3];
			
			data[0][0] = 0;
			data[0][1] = 0;
			data[0][2] = 0;
			data[1][0] = 0;
			data[1][1] = 0;
			data[1][2] = 0;
			data[2][0] = 0;
			data[2][1] = 0;
			data[2][2] = 0;

		}

	}

	public static Matrix multiply(Matrix A, Matrix B){
		
		Matrix R = new Matrix();
		
		// iterate over rows
		for( int i = 0; i < 3; i++ ){
			// iterate over columns
			for( int j = 0; j < 3; j++ ){

				int r = 0;
				for( int k = 0; k < 3; k++ )
					r += A.data[i][k]*B.data[j][k];

				R.data[i][j] = r;
			}
		}
		
		return R;
	}

	public static void main(String[] args){
		
		Matrix A = new Matrix();
		Matrix B = new Matrix();

		A.data[0][0] = 1;
		A.data[1][1] = 1;
		A.data[2][2] = 1;
		B.data[0][0] = 1;
		B.data[1][1] = 1;
		B.data[2][2] = 1;

		Matrix C = multiply(A, B);

		// iterate over rows
		for( int i = 0; i < 3; i++ ){
			// iterate over columns
			for( int j = 0; j < 3; j++ ){
				System.out.print(C.data[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
