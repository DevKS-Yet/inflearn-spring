package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;
//    private final MemberService memberService = new MemberService();

    // 필드주입
//    @Autowired private MemberService memberService;

    //세터 주입
//    @Autowired
//    public void setMemberService(MemberService memberService) {
//        this.memberService = memberService;
//    }
    //  예전에는 많이 사용했으나 지금은 많이 사용하지 않음.

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
