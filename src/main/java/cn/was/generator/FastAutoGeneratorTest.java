package cn.was.generator;


import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import java.sql.SQLException;

/**
 * @program: mybatisplus
 * @author: WangAnShun
 * @create: 2022-08-10 17:57
 **/
public class FastAutoGeneratorTest  {



    public static void main(String[] args) throws SQLException {

        FastAutoGenerator.create("jdbc:mysql://localhost:3306/school?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai","root","root")
                // 全局配置
                .globalConfig((scanner, builder) -> builder.author(scanner.apply("请输入作者名:")))
                .globalConfig((scanner, builder) -> builder.outputDir(scanner.apply("请输入保存dir:")))
                // 包配置
                .packageConfig((scanner, builder) -> builder.parent(scanner.apply("请输入包名:")))
                // 策略配置
                .strategyConfig((scanner, builder) -> builder.addInclude(scanner.apply("请输入表名，多个英文逗号分隔？所有输入 all")))
                /*
                    模板引擎配置，默认 Velocity 可选模板引擎 Beetl 或 Freemarker
                   .templateEngine(new BeetlTemplateEngine())
                   .templateEngine(new FreemarkerTemplateEngine())
                 */
                .execute();
    }




}
