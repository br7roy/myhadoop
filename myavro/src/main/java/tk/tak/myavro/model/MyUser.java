 /*
  * Package tk.tak.myavro.model
  * FileName: MyUser
  * Author:   Tak
  * Date:     2018/11/11 20:15
  */
 package tk.tak.myavro.model;

 import org.apache.hadoop.io.Writable;

 import java.io.DataInput;
 import java.io.DataOutput;
 import java.io.IOException;
 import java.io.Serializable;

 /**
  * @author Tak
  */
 public class MyUser implements Writable, Serializable {
  private static final long serialVersionUID = 2404536384232470408L;

  private String name;
  private Integer favorite_number;
  private String favorite_color;

  public MyUser() {
  }

  public MyUser(String name, Integer favorite_number, String favorite_color) {
   this.name = name;
   this.favorite_number = favorite_number;
   this.favorite_color = favorite_color;
  }

  public String getName() {
   return name;
  }

  public void setName(String name) {
   this.name = name;
  }

  public Integer getFavorite_number() {
   return favorite_number;
  }

  public void setFavorite_number(Integer favorite_number) {
   this.favorite_number = favorite_number;
  }

  public String getFavorite_color() {
   return favorite_color;
  }

  public void setFavorite_color(String favorite_color) {
   this.favorite_color = favorite_color;
  }

  @Override
  public void write(DataOutput out) throws IOException {
   out.writeUTF(this.name);
   out.writeInt(this.favorite_number);
   out.writeUTF(this.favorite_color);
  }

  @Override
  public void readFields(DataInput in) throws IOException {
   this.name = in.readUTF();
   this.favorite_number = in.readInt();
   this.favorite_color = in.readUTF();
  }
 }
