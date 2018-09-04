package com.thefallenbrain.stayfithub.services.controller;

import com.thefallenbrain.stayfithub.services.domain.Member;
import com.thefallenbrain.stayfithub.services.domain.Trainer;
import com.thefallenbrain.stayfithub.services.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    //get all members
    @GetMapping("/members")
    public List<Member> retrieveUsers(){
        return memberRepository.findAll();
    }

    //get member by ID
    @GetMapping("/member/{id}")
    public Member retrieveUserByID(@PathVariable int id){
        Optional<Member> member =  memberRepository.findById(id);

        if(!member.isPresent())
            throw new NullPointerException();
        else
            return member.get();
    }
    //get all members under a trainer
    @GetMapping("/membersByTrainerID/{id}")
    public List<Member> retrieveMemberByTrainerID(@PathVariable int id){
        return memberRepository.findMemberByTrainerId(id);
    }
    //get all members in a fitness center
    @GetMapping("/membersByFitnessCenter/{id}")
    public List<Member> retrieveMemberByFitnessCenter(@PathVariable int id){
        return memberRepository.findMemberByFitnessCenterId(id);
    }

    //delete a member by ID
    @DeleteMapping("/member/{id}")
    public void deleteMember(@PathVariable int id){
        memberRepository.deleteById(id);
    }

    //add a new member
    @PostMapping("/member")
    public Member createMember(@RequestBody Member member){
        return memberRepository.save(member);
    }

    //update a member
    @PutMapping("member/{id}")
    public Member updateMember(@PathVariable int id, @RequestBody Member member){
        Optional<Member> memberOptional = memberRepository.findById(id);
        if (!memberOptional.isPresent())
            throw new NullPointerException();
        member.setId(id);
        return memberRepository.save(member);
    }
}
