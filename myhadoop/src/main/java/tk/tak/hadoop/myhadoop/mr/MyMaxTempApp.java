 /*
  * Package tk.tak.hadoop.myhadoop.mr
  * FileName: MyMaxTempApp
  * Author:   Tak
  * Date:     2018/9/2 10:23
  */
 package tk.tak.hadoop.myhadoop.mr;

 import org.apache.hadoop.conf.Configuration;
 import org.apache.hadoop.fs.FileSystem;
 import org.apache.hadoop.fs.Path;
 import org.apache.hadoop.io.IntWritable;
 import org.apache.hadoop.io.Text;
 import org.apache.hadoop.mapreduce.Job;
 import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
 import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

 import java.io.IOException;

 /**
  * FileName:    MyMaxTempApp
  * Author:      Tak
  * Date:        2018/9/2
  * Description: MapperReducer App类
  */
 public class MyMaxTempApp {
	 public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		 if (args.length != 2) {
			 System.err.println("Usage: MaxTemperature <input path> <output path>");
		 }
		 Job job = Job.getInstance();
		 Configuration conf = job.getConfiguration();
		 FileSystem fs = FileSystem.get(conf);
		 fs.delete(new Path(args[1]), true);
		 System.out.println(conf.get("fs.defaultFS"));
		 job.setJarByClass(MyMaxTempApp.class);
		 // 设置作业名称
		 job.setJobName("Max Temperature");
		 // 输入路径
		 FileInputFormat.addInputPath(job, new Path(args[0]));
		 // 输出路径
		 FileOutputFormat.setOutputPath(job, new Path(args[1]));
		 // 设置Mapper类型
		 job.setMapperClass(MyMaxTempMapper.class);
		 // 设置Reducer类型
		 job.setReducerClass(MyMaxTempReducer.class);
		 // 设置输出key类型
		 job.setOutputKeyClass(Text.class);
		 // 设置输出value类型
		 job.setOutputValueClass(IntWritable.class);

		 // 设置Mapper端合成类，减少map到reduce传输量
		 job.setCombinerClass(MyMaxTempReducer.class);

		 // 开始执行任务
		 System.exit(job.waitForCompletion(true) ? 0 : 1);
	 }
 }

