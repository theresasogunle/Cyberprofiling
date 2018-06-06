/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.util.List;
import kmeans.LogData;

/**
 *
 * @author Tess
 */


public class DataUtil {
	
	
	public static boolean isEmpty(String value){
		
		if(null == value || value.length() == 0){
			return true;
		}
		else return false;
	}
	
        public static float [][] getTimeDestinationMatrix(List<LogData> dataList, int scalingfactor){
        
		float[][] timeDestinationMatrix = new float[dataList.size()][2];
		LogData  data= null;
		for(int index=0; index<dataList.size(); index++){
			data = dataList.get(index);
			timeDestinationMatrix[index][0] = data.getTime();
			timeDestinationMatrix[index][1] = data.getDestination()/scalingfactor;
		}
		
		return timeDestinationMatrix;
        }
	
	
          public static float [][] getTimeDestinationMatrix(List<LogData> dataList){
        
		float[][] timeDestinationMatrix = new float[dataList.size()][2];
		LogData  data= null;
		for(int index=0; index<dataList.size(); index++){
			data = dataList.get(index);
			timeDestinationMatrix[index][0] = data.getTime();
			timeDestinationMatrix[index][1] = data.getDestination();
		}
		
		return timeDestinationMatrix;
        }
	
	
	public static void printMatrix(float[][] matrix){
		
		if(matrix == null)
			return ;
		
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[i].length; j++){
				System.out.print(matrix[i][j]+"\t");
				
			}
			System.out.println();
		}
	}
	
	public static void printMatrix(int[][] matrix){
			
			if(matrix == null)
				return ;
			
			for(int i=0; i<matrix.length; i++){
				for(int j=0; j<matrix[i].length; j++){
					System.out.print(matrix[i][j]+"\t");
					
				}
				System.out.println();
			}
		}
	
	
	public static void printMatrix(float[] matrix){			
			if(matrix == null)
				return ;
			
			for(int i=0; i<matrix.length; i++){				
					System.out.print(matrix[i]+"\t");				
			}
		}
	
	public static void printMatrix(int[] matrix){			
		if(matrix == null)
			return ;
		
		for(int i=0; i<matrix.length; i++){				
				System.out.print(matrix[i]+"\t");				
		}
	}
		
	

	public static boolean equalsMatrix(int[][] matrix1, int[][] matrix2){
		
		if(matrix1==null || matrix2==null 
				|| matrix1.length != matrix2.length 
				|| matrix1[0].length != matrix2[0].length)
			return false;
		
		for(int i=0; i<matrix1.length; i++)
			for(int j=0; j<matrix1[i].length; j++)
			{
				//System.out.println("Comparing "+matrix1[i][j]+"<>"+matrix2[i][j]);
				if(matrix1[i][j] != matrix2[i][j]){
					return false;
				}
			}		
		
		return true;		
	}
	
	public static boolean equalsMatrix(float[][] matrix1, float[][] matrix2){
		
		if(matrix1==null || matrix2==null 
				|| matrix1.length != matrix2.length 
				|| matrix1[0].length != matrix2[0].length)
			return false;
		
		for(int i=0; i<matrix1.length; i++)
			for(int j=0; j<matrix1[i].length; j++)
			{
				//System.out.println("Comparing "+matrix1[i][j]+"<>"+matrix2[i][j]);
				if(matrix1[i][j] != matrix2[i][j]){
					return false;
				}
			}		
		
		return true;		
	}
	

}




