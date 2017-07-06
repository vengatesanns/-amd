package csv;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import java.io.*;
import java.util.*;
class Reading_csv
{

public static void main(String args[])
{
    try{
     CSVReader cr=new CSVReader(new FileReader("D://data.csv"),',');
    ColumnPositionMappingStrategy<Pojo> cm=new ColumnPositionMappingStrategy<Pojo>();
    cm.setType(Pojo.class);
    String fields[]=new String[]{"id","name"};
    cm.setColumnMapping(fields);
    CsvToBean<Pojo> cb=new CsvToBean<Pojo>();
    List<Pojo> data=cb.parse(cm,cr);
    System.out.println(data);
    cr.close();
}
catch(Exception ex)
{
    ex.printStackTrace();
}

}




}