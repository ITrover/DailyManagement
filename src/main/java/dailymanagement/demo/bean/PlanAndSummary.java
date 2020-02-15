package dailymanagement.demo.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Date;

@ApiModel(description = "计划与总结")
public class PlanAndSummary {

    private Integer id;
    @ApiModelProperty("用户名")
    private String unam;

    @ApiModelProperty(value = "写入时间",required = false)
    private Date writeTime;

    @ApiModelProperty(value = "更新",required = false)
    private Date updateTime;

    @ApiModelProperty(value = "总结",required = false)
    private String summary;

    @ApiModelProperty(value = "计划",required = false)
    private String plan;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUnam() {
        return unam;
    }

    public void setUnam(String unam) {
        this.unam = unam == null ? null : unam.trim();
    }

    public Date getWriteTime() {
        return writeTime;
    }

    public void setWriteTime(Date writeTime) {
        this.writeTime = writeTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan == null ? null : plan.trim();
    }
}