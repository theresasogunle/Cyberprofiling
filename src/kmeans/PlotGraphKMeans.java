/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kmeans;

import java.awt.Dimension;
import java.awt.Shape;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.util.ShapeUtilities;

/**
 *
 * @author Tess
 */
public class PlotGraphKMeans extends ApplicationFrame {

    public PlotGraphKMeans(String title, float[][] data, int[][] groups) {
        super(title);
        JPanel jpanel = createDemoPanel(title, data, groups);
        jpanel.setPreferredSize(new Dimension(640, 480));
        add(jpanel);
    }

    public static JPanel createDemoPanel(String title, float[][] data, int[][] groups) {
        JFreeChart jfreechart = ChartFactory.createScatterPlot(
            title, "TIME", "DESTINATION", createDataSet(data, groups),
            PlotOrientation.VERTICAL, true, true, false);
        
        
        XYPlot xyPlot = (XYPlot) jfreechart.getPlot();
        xyPlot.setDomainCrosshairVisible(true);
        xyPlot.setRangeCrosshairVisible(true);       
        return new ChartPanel(jfreechart);
    }

    
    
    private static XYDataset createDataSet(float[][] data, int[][] groups) {
        XYSeriesCollection xySeriesCollection = new XYSeriesCollection();
        XYSeries[] series = new XYSeries[groups[0].length];
        for(int i=0; i<groups[0].length; i++){
        	series[i] = new XYSeries("Cluster "+(i+1));
        }
        
        
        for(int i=0; i<groups.length; i++){
			for(int j=0; j<groups[i].length; j++)
			{
				if(groups[i][j] == 1){
					series[j].add(data[i][0], data[i][1]); 					
				}
			}
		}		
       
        for(XYSeries ser : series){
        xySeriesCollection.addSeries(ser);
        }
        return xySeriesCollection;
    }   
}

