import java.util.Scanner;

public class Hellojava {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        System.out.println("Hello, World");
        System.out.println("Hello, World");
        System.out.println("Hello, World");
        System.out.println("안녕, 자바");
        //위에 자바를 내가 입력한 글자로 바꾸고 싶다.
        //구글에 자바 입력 검색
        //스캐너라는게 나옴 이걸 복붙
        Scanner sc = new Scanner(System.in); // 키보드로 부터 입력 받기 준비
//        System.out.print("입력: ");
//        String name = sc.next(); // 키보드로 부터 글자를 입력 받기
//        // 위에 name는 사용자가 입력한 글자가 저장이 된다.
        //anme 에 저장된 글을 출력을 해보자.
//        System.out.println("안녕"+ name +"야");
        //캐릭터 이름 설정
        System.out.println("캐릭터 이름 설정");
        System.out.println("이름 입력: ");
        String name = sc.next();
        // 포켓몬 캐릭터가 주인과 함께 여행을 떠난다거나
        System.out.println(name + "가 설정 되었습니다.");
        System.out.println(name + "가 여행을 떠난다.");
        //가다가 다른 포켓몬을 만났다.
        System.out.println(name + "가 길을 가다 다른포켓몬을 만났다.");
        //1. 싸운다 2. 포켓볼을 던진다. 3. 36계 줄행랑
        System.out.println("1. 싸운다 2. 포켓볼을 던진다 3.36계 줄행랑");
        // 싸운다를 선택한 당신 어떤 스킬을 쓰시겠습니까?
        System.out.println("선택: ");
        int num = sc.nextInt(); //숫자를 입력
        // 만약에 1번이면 포켓몬 스킬을 시전한다.
        if (num == 1) {         //싸운다 선택
            System.out.println("전광석화!!");
            System.out.println("백만볼트!!!");
            System.out.println("아이언테일!!!!");
            System.out.print("선택: ");
            num = sc.nextInt();
        }else if (num == 2) {   //2번을 입력하면
            //포켓볼을 던진다.
            System.out.println("가랏 몬스터볼");
            System.out.println("가랏 슈퍼볼");
            System.out.println("가랏 마스터볼");
            System.out.print("선택: ");
            num = sc.nextInt();
        }else if (num == 3){ //3번을 입력하면 36계 줄행랑을 친다.
            System.out.println("나는 도망가야겠어");
        }else{
            System.out.println("잘 못 입력 게임오버!!");
        }
        // 1.전광석화 2.백만볼트 3. 아이언테일
        // 포켓볼을 던진다를 선택한 당신 무슨 포켓볼을 던지시겠습니까?
        // 1.그냥 포켓볼 2.슈퍼볼 3.마스터볼
        // 36계 줄행랑을 선택한 당신 어떻게 도망치시겠습니까?
        // 1.달리기 2.자동차로 이동 3.?

    }
}
