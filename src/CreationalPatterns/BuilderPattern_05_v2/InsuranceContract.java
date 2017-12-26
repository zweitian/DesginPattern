package CreationalPatterns.BuilderPattern_05_v2;

/**
 * @Author:ztian
 * @Description:保险合同对象，属性具有各种约束，
 * 使用builder构建对象时属性不符合约束的返回IllegalArgumentException
 * @CreateTime: 2017/12/26  16:45
 */
public class InsuranceContract {
    private String contractId;
    private String personName;
    private String companyName;
    private String otherData;

    /**
     * 使用builder创建对象的构造方法，访问级别是私有的
     */
    private InsuranceContract(ConcreteBuilder builder){
        this.contractId = builder.contractId;
        this.personName = builder.personName;
        this.companyName = builder.companyName;
        this.otherData = builder.otherData;
    }

    /**
     * 构造保险合同对象的构建器，合同id，personName,companyName，otherData必填
     */
    public static class ConcreteBuilder {
        private String contractId;
        private String personName;
        private String companyName;
        private String otherData;

        public ConcreteBuilder setContractId(String contractId) {
            this.contractId = contractId;
            return this;
        }
        public ConcreteBuilder setPersonName(String personName){
            this.personName = personName;
            return this;
        }
        public ConcreteBuilder setCompanyName(String companyName){
            this.companyName = companyName;
            return this;
        }
        public ConcreteBuilder setOtherData(String otherData){
            this.otherData = otherData;
            return this;
        }
        public InsuranceContract build(){
            if(contractId==null || contractId.trim().length()==0){
                throw new IllegalArgumentException("合同编号不能为空");
            }
            boolean signPerson = personName!=null && personName.trim().length()>0;
            boolean signCompany = companyName!=null && companyName.trim().length()>0;
            if(signPerson && signCompany){
                throw new IllegalArgumentException("一份保险合同不能同时与人和公司签订");
            }
            if(signPerson==false && signCompany==false){
                throw new IllegalArgumentException("一份保险合同不能没有签订对象");
            }
            //返回构建后的对象
            return new InsuranceContract(this);
        }
    }
    /**
     * 示意：保险合同的某些操作
     */
    public void someOperation(){
        System.out.printf("%s operation\n",this.companyName!=null?this.companyName:this.personName);
    }
}
