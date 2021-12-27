package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    // memberService 객체를 하나만 생성! 스프링 컨테이너에서 인스턴스 관리
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
