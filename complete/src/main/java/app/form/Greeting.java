package app.form;

import app.validation.DateValid;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.*;
import java.util.Date;

@Data
public class Greeting {

    // TODO nullチェック
    @NotNull
    @Min(10)
    @Max(100)
    private double id;


    private String content;

//    @DateValid
//    private Date fromdate;

    @DateValid
    private String fromdate;



    public void setId(double id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

//    public void setFromdate(Date fromdate) {
//        this.fromdate = fromdate;
//    }

    public void setFromdate(String fromdate) {
        this.fromdate = fromdate;
    }

    public double getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

//    public Date getFromdate() {
//        return fromdate;
//    }

    public String getFromdate() {
        return fromdate;
    }

}
