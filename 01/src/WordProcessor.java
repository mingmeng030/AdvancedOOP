import java.util.*;

public class WordProcessor {
    ISpellChecker spellChecker;
    Map<String, DocConverter> docConverters=new HashMap<String, DocConverter>(); //문자열과 DocConverter를 담은 map
    String fileName;

    WordProcessor(String fileName){ //확장자가 주어지지 않은 상태인 file 이름
        this.fileName=fileName;
    }

    void addDocConverter(DocConverter converter){//확장자 모듈 추가를 원할 시 등록할 수 있게 해주는 함수
        String s=converter.getExtension();
        //map형 변수 docConverters에 key로 확장자명, 내용물로 전달받은 객체 넣어주기
        this.docConverters.put(s, converter);
    }

    void convertDocTo(String ext){//확장자가 주어졌을 때 그 확장자를 처리하는 모듈이 있는지 보고 있으면 호출, 없으면 에러 메시지.
        if(docConverters.containsKey(ext)) {
            //map docConverters에서 key값이 ext인 객체를 temp에 저장하고 이를 통해 save 함수 호출.
            DocConverter temp=docConverters.get(ext);
            temp.save(fileName);
        }
        else System.out.println(ext+"파일 형식을 지원하는 DocConverters가 없습니다.");
    }

    void setSpellChecker(ISpellChecker spellChecker){//스펠링 체크 모듈을 지정해주는 함수
        this.spellChecker=spellChecker;
    }

    void checkSpelling(){//인터페이스의 스펠링 체크 함수 호출
        spellChecker.check();
    }
}