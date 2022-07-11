package http;

import http.controller.PortVariable;
import http.model.HttpWork;

import java.util.*;

public interface Repository {
    List<HttpWork> httpWorks = new ArrayList<>(); //Http

    Set<String> set = new HashSet<>(); //변수명 저장
    PortVariable portVariable = new PortVariable();
}
