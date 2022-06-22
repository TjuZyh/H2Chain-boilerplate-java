import H2ChainUtil.HexUtil.HexUtil;
import H2ChainUtil.OSS.UploadOSS;
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

    //select: JSONString
    //update: boolean R
    //delete: boolean R
    //insert: boolean R

    public static void main(String[] args) {
        try {

            //get
            //System.out.println(HexUtil.HexStringToString(H2ChainAPI.getInfo("person")));

            //set
            //H2ChainAPI.setInfo("person" , "zyh");

            //get
            //System.out.println(HexUtil.HexStringToString(H2ChainAPI.getInfo("person")));

            //合约部署
            File JARFile = new File("/Users/zyh/Desktop/JAR_demo.jar");
            String contractAddress = H2ChainDevAPI.deployContract(JARFile);
            System.out.println("合约地址：" + contractAddress);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
