package dailymanagement.demo.bean;

import java.util.Date;

public class DocumentFile {

    private Integer fid;

    private String fname;

    private Date time;

    private String fpath;

    private Integer pid;

    private String doctype;

    private String dUnam;
    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getFpath() {
        return fpath;
    }

    public void setFpath(String fpath) {
        this.fpath = fpath == null ? null : fpath.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getDoctype() {
        return doctype;
    }

    public void setDoctype(String doctype) {
        this.doctype = doctype;
    }

    public String getdUnam() {
        return dUnam;
    }

    public void setdUnam(String dUnam) {
        this.dUnam = dUnam;
    }
}