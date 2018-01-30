/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
/**
 *
 * @author Chris
 */
public class test {
    
    
    public static void main(String[] args){
       DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
       String date1="2018-01-14";
       String date2="2018-01-16";
       try{
           Date d1=df.parse(date1);
           Date d2=df.parse(date2);
           d1=convertUtilToSql(d1);
           d2=convertUtilToSql(d2);
           System.out.println(d1+" "+d2);
           long diff=d2.getTime()-d1.getTime();
           long hours=diff/(60*60*1000);
           long days=hours/24;
           System.out.println(days);
       }catch(Exception e){
           e.printStackTrace();
       }
       
       DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//       dataset.setValue(100,"MARKS","S11");
       for(int i=0;i<10;i++){
           int j=i;
           dataset.setValue(i,""," "+j);
       }
//       JFreeChart chart = ChartFactory.createBarChart("PERFORMANCE", "ST. NAME","MARKS",dataset,PlotOrientation.VERTICAL, false, true,false);
        JFreeChart chart = ChartFactory.createBarChart("PERFORMANCE", "ST. NAME","MARKS",dataset,PlotOrientation.VERTICAL, false, true,false);
       CategoryPlot p =chart.getCategoryPlot();
//       p.setRangeGridlinePaint(Color.black);
        ChartFrame frame = new ChartFrame("TEST CHART",chart);
        frame.setVisible(true);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
    }
    static java.sql.Date convertUtilToSql(java.util.Date uDate){
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }
     
}