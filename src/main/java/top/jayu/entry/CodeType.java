package top.jayu.entry;

public class CodeType {
    private Integer id;

    private Integer codeType;

    private String codeTypeName;

    private Byte enableFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodeType() {
        return codeType;
    }

    public void setCodeType(Integer codeType) {
        this.codeType = codeType;
    }

    public String getCodeTypeName() {
        return codeTypeName;
    }

    public void setCodeTypeName(String codeTypeName) {
        this.codeTypeName = codeTypeName == null ? null : codeTypeName.trim();
    }

    public Byte getEnableFlag() {
        return enableFlag;
    }

    public void setEnableFlag(Byte enableFlag) {
        this.enableFlag = enableFlag;
    }
}