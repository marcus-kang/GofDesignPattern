package templateMethod;

public abstract class AbstGameConnectHelper {
    protected abstract String doSecurity(String string);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String userName);
    protected abstract String connection(String info);

    public String requestConnection(String encodedInfo){

        //보안작업 -> 암호화 된 문자열을 복호화
        String decodedInfo = doSecurity(encodedInfo);
        //반환된 것을 가지고 아이디, 암호를 할당
        String id = "aaa";
        String password = "bbb";

        //인증작업
        if(!authentication(id, password)){
            throw new Error("아이디, 암호 불일치");
        }

        String userName = "userName";

        //권한작업
        int i = authorization(userName);

        switch (i){
            case -1:
                throw new Error("셧다운");
            case 0://게임 매니저
                break;
            case 1://유료 회원
                break;
            case 2://무료 회원
                break;
            case 3://권한 없음
                break;
            default://기타상황
                break;
        }

        return connection(decodedInfo);
    }
}
