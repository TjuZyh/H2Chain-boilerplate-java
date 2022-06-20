import H2ChainUtil.SHA.HashJAR;

import java.io.File;
import java.io.IOException;

/**
 * @Author zyh
 * @Date 2022/6/20 2:30 下午
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        try {
            /*String hashJAR = HashJAR.hashJAR(new File("/Users/zyh/Desktop/JAR_demo.jar"));
            System.out.println(hashJAR);*/
            File JARFile = new File("/Users/zyh/Desktop/JAR_demo.jar");
            System.out.println(JARFile.getName().substring(0 , JARFile.getName().length()-4));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
