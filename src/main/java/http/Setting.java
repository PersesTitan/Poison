package http;

import com.sun.tools.javac.Main;
import http.controller.StartServer;
import http.controller.WebPageVariable;
import http.items.HttpRepository;
import http.model.HttpWork;

public class Setting implements Repository {
    public final static StringBuffer total = new StringBuffer();
    public void start(String line) {
        if (line.isBlank()) return;
        //http
        if (portVariable.check(line)) {portVariable.start(line);return;}
        for (HttpWork work : httpWorks) {if (work.check(line)) {work.start(line); return;}}
    }

    //시작할때 변수 이름 및 매소드 새팅 생성
    public void firstStart() {
        Setting.total.setLength(0);
        HttpRepository.pathMap.clear();
        HttpRepository.POST.clear();
        HttpRepository.GET.clear();
        HttpRepository.partMap.clear();
        httpWorks.clear();

        httpWorks.add(new WebPageVariable());
        httpWorks.add(new StartServer());

    }
}
