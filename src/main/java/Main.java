import H2ChainUtil.HexUtil.HexUtil;
import H2ChainUtil.SHA.HashJAR;
import contractAPI.Entity.ContractInfo;
import contractAPI.H2ChainAPI;
import contractAPI.H2ChainDevAPI;
import io.aelf.sdk.AElfClient;

import java.io.File;

/**
 * @Author zyh
 * @Date 2022/6/18 9:00 下午
 * @Version 1.0
 */
public class Main {
    private static AElfClient multiLClient = new AElfClient("http://127.0.0.1:1235");
    private static String privateKey = "b465f9d58248a49fd708fd1147b96e7e7be6f017e2c3beb6f529b1a6b0788b70";
    private static String dataStoreContractAddress = "2LUmicHyH4RXrMjG4beDwuDsiWJESyLkgkwPdGTR8kahRzq5XS";

    public static void main(String[] args) {
        try {

            //System.out.println(HexUtil.HexStringToString(H2ChainAPI.getInfo("person")));

            //H2ChainAPI.setInfo("person" , "fy");

            //System.out.println(HexUtil.HexStringToString(H2ChainAPI.getInfo("person")));

            ContractInfo contractInfo = new ContractInfo();
            File JARFile = new File("/Users/zyh/Desktop/JAR_demo.jar");

            //codeAddress，即OSS返回的URL，需要通过调用OSS API实现
            contractInfo.setCodeAddress("https://helloContract.jar.com");
            //通过字节读入jar包，对字节流进行Hash
            String hashJAR = HashJAR.hashJAR(JARFile);
            contractInfo.setCodeHash(hashJAR);

            contractInfo.setCodeName(JARFile.getName().substring(0 , JARFile.getName().length()-4));
            contractInfo.setCodeType("java");
            String hash = H2ChainDevAPI.setContract(contractInfo);
            System.out.println("hash存储值：" + hash);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
