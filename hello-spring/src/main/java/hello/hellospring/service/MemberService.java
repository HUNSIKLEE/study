package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemoryMemberRepository;

import java.util.List;
import java.util.Optional;

public class MemverService {

    private final MemoryMemberRepository memoryMemberRepository;

    public MemverService(MemoryMemberRepository memoryMemberRepository) {
        this.memoryMemberRepository = memoryMemberRepository;
    }

    public Long join(Member member) {

        validateDuplicateMember(member);

        memoryMemberRepository.save(member);
        return member.getId();


    }

    private void validateDuplicateMember(Member member) {
        memoryMemberRepository.findByName(member.getName())
               .ifPresent(member1 -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                 });
    }


    public List<Member> findMembers(){
      return memoryMemberRepository.findAll();

    }

    public Optional<Member> findOne(Long memberId){
        return memoryMemberRepository.findById(memberId);
    }

}
