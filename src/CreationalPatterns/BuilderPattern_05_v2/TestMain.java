package CreationalPatterns.BuilderPattern_05_v2;

/**
 * @Author:ztian
 * @Description:保险合同对象，属性具有各种约束，
 * 使用builder构建对象时属性不符合约束的返回IllegalArgumentException
 * @CreateTime: 2017/12/26  16:52
 */
public class TestMain {
    public static void main(String[] args) {
        InsuranceContract.ConcreteBuilder insuranceBuilder = new InsuranceContract.ConcreteBuilder();
        //优衣库的保险
        InsuranceContract uniqoInsuance = insuranceBuilder.setCompanyName("优衣库").setContractId("1").build();
        uniqoInsuance.someOperation();
        //ztian
        InsuranceContract.ConcreteBuilder insuranceBuilder2 = new InsuranceContract.ConcreteBuilder();
        InsuranceContract ztian = insuranceBuilder2.setContractId("2").setPersonName("ztian").build();
        ztian.someOperation();
        //没有contractId，构建对象是抛出IllegalArgumentException
        InsuranceContract.ConcreteBuilder insuranceBuilder3 = new InsuranceContract.ConcreteBuilder();
        insuranceBuilder3.setCompanyName("test company").build();
    }
}
