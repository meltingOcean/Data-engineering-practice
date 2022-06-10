import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MaxTemperatureMapper {
    extends Mapper<LongWritable, Text, Text,  IntWritable>{
        private static final int MISSING = 9999;

    }



}
