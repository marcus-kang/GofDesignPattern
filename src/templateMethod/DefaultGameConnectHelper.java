package templateMethod;

public class DefaultGameConnectHelper extends AbstGameConnectHelper{
    @Override
    protected String doSecurity(String string) {
        System.out.println("강화된 알고리즘을 이용한 디코드");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("아이디/암호 확인 과정");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("권한 확인");
        //서버에서 유저이름 유저 나이를 확인
        //10시 이후 미성년자는 권한 없는 것으로 한다
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("마지막 접속단계!");
        return info;
    }
}
