public class PasswordInfoWithDAO {
    public static void main(String[] args) {
        PasswordInfo p;
        PasswordDAO passwordDao = new PasswordDaoImpl();

        System.out.println("--- inserting..."); //data 추가
        p = new PasswordInfo("https://www.smu.ac.kr", "smu", "abcde");
        passwordDao.insert(p);
        p = new PasswordInfo("https://www.smu2.ac.kr", "smu2", "abcde");
        passwordDao.insert(p);

        System.out.println("--- finding all..."); //data 추가 후 select로 확인
        for (PasswordInfo pi : passwordDao.findAll()) {
            System.out.println("reading... " + pi);
        }

        System.out.println("--- updating..."); //두 번째 데이터의 id인 "smu2"를 "smu1"으로 수정
        p = passwordDao.findAll().get(1);
        p.setId("smu1");
        passwordDao.update(p, p.getUrl());

        System.out.println("--- see if updated..."); //data 수정 후 select로 확인
        p = passwordDao.findByKey("https://www.smu2.ac.kr");
        if (p != null) { System.out.println(p); }

        System.out.println("--- deleting...");
        passwordDao.delete("https://www.smu2.ac.kr"); //key(url)로 삭제

        System.out.println("--- finding all after deleting..."); //전체 데이터 출력해서 데이터가 제대로 삭제되었는지 확인
        for (PasswordInfo pi : passwordDao.findAll()) {
            System.out.println("reading... " + pi);
        }
    }
}