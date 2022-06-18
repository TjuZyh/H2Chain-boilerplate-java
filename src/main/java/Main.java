import H2ChainUtil.HexUtil.HexUtil;
import contractAPI.H2ChainAPI;
import io.aelf.sdk.AElfClient;

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
            //long blockHeight = multiLClient.getBlockHeight();
            //System.out.println(blockHeight);

            //String ownerAddress = multiLClient.getAddressFromPrivateKey(privateKey);

            System.out.println(HexUtil.HexStringToString(H2ChainAPI.getInfo("person")));

            H2ChainAPI.setInfo("person" , "zyh");

            System.out.println(HexUtil.HexStringToString(H2ChainAPI.getInfo("person")));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
