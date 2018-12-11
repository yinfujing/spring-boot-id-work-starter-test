package rui.coder.springbootidworkstartertest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rui.coder.idWork.IdWorker;

import java.util.HashSet;
import java.util.Set;


@Component
public class CLD implements CommandLineRunner {

    @Autowired
    private IdWorker idWorker;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("开始校验");
        int size = 100000;
        Set<Long> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(idWorker.nextId());
        }
        assert size==set.size();
        System.out.println("校验成功！");
    }
}
