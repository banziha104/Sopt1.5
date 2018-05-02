package review;


// 추상화된 컴퓨터
// 부팅시 부팅음악을 사용자(인스턴스를 만들떄!)가 구현해야함

public class AbsractComputer {
    Bootable bootable;

    public AbsractComputer(Bootable bootable) {
        this.bootable = bootable;
        bootable.booting();
    }
}
