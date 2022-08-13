# study
 2022_08_03

interface

인터페이스 정의: 인터페이스는 사용규칙을 정의한 것.
              그러므로 인터페이스에 선언하는 모든 메서드는 추상 메서드이어야 한다.

규칙1)인터페이스에 선언되는 모든 메서드는 public 이다.
-인터페이스에 정의하는 메서드는 호출 규칙이다.
-규칙은 공개되어야 한다.
규칙2) 인터페이스에 선언되는 모든 메서드는 추상 메서드로 선언한다.
-인터페이스에 선언하는 메서드는 호출 규칙을 정의한 것이다.
-규칙은 클래스가 따라야 한다.
-인터페이스에 선언되는 모든 메서드는 몸체를 구현하지 않는다.


인터페이스 레퍼런스?

=> 해당 인터페이스에 따라 작성된(사용규칙을 준수하는) 클래스의 인스턴스 주소를 저장한다.

프로그램을 코딩하다가 인터페이스를 만나게 되면

-누가 호출자이고 누가 피호출자인지 확인할것.

-본인이 맡은 개발 일이 호출자를 만드는 것인지 아니면 피호출자를 만드는 것인지 확인!



인터페이스와 추상클래스
- 인터페이스를 직접구현하면 클래스를 만드는 개발자가 인터페이스의 모든 메서드를

일일이 구현해야한다 그러므로 구현하기가 번거롭다는 단점이있다.

그래서 단점을 보완하고자 추상클래스를 활용 해서 상속 받은 클래스는 원하는 메소드만 오버라이딩한다. 인터페이스 구현을 간소화 할 수 있다.

인터페이스의 메서드 중에서 서브클래스에 공통으로 물려 줄 메서드를 미리 구현한다.



breadcrumb



2022_08_04


상속의 generaliztion 수행

concrete 클래스 구체 클래스 

GoF 디자인 패턴 - 템플릿 메서드 패턴 : 슈퍼클래스에서 틀을 잡고 서브 클래스에서 그 틀안에서 세부적으로 구체화 하는것.
*슈퍼 클래스에서 실행의 흐름을 정의하고 서브클래스에서 세부적인 작업을 구체적으로 정의하는 방식.



* Polyglot 프로그래밍
 - 여러가지 언어를 사용하여 App을 프로그래밍 하는것.

다형적 변수 와 제네릭
(polymorphic variable)

1. 다형적 변수

 object obj;
 obj = new String();
 obj = new File();
 obj = new Date();


 2. 제네릭(일반화)

 E obj;

obj = ? ; <E가 가르키는 타입이 무엇이냐에 따라 저장 할 수 있는 값이 결정된다.>
 E = 타입을 미지정할수 있다. 타입을 가르키는 변수 = 타임 파타미터라 한다.





제네릭 문법 활용


각 타입마다 클래스를 정의하다보면 유지보수가 거의 불가능하고,

오브젝트 클래스를 사용했을땐 클래스 한개만 정의해서 좋지만, 특정 파일만 저장할수 없고

매번 사용할때마다 형변환을 해야한다는 번거로움이 있다. 즉 사용이 불편하다.

제네릭 문법의 가치 
 한개의 클래스를 만들어 놓고 각 타입별로 따로 만든 클래스 인것 처럼 사용할 수 있게 해주는 문법.
   타입 정보를 전달.
objectList<E> list = new ObjectList<>();

보통 변수명은 외자 대문자로 받는 파라미터를 타입 파라미터라고 한다.

제네릭은 배열을 만드는 문법에선 제네릭 문법을 사용할수 없다. E e = new E << 이거 안됨
그래서 바깥에서 배열을 받아와서 사용하는 방법을 사용하는데 까다롭다.


 * 한개의 클래스를 정의하여 타입별로 클래스가 있는  것처럼 사용한다.
   * 즉 타입 파라미터를 이용하여 목록에서 특정 타입의 값만 다루도록 제한한다.
   * 형변환 없이 목록에 들어 있는 데이터를 꺼낸다.



2022_08_05

  
객체 지향이란
어떻게 쓰느냐 어떤 구조로 쓰느냐 
어떻게 서로 클래스와 인터페이스 인터페이스와 인터페이스와의 관계 인터페이스와 추상클래스와의 관계  
추상클래스와 이러한 관계를 어떻게 형성하느냐 오브젝트 오리엔티드 프로그래밍
설계를 얘기할줄 알아야한다.



## Iterator 패턴

stack  데이터 조회는 => pop() 
queue  데이터 조회는 => poll()
Hashset 데이터 조회는 => to Array()
                       - hashset 은 데이터를 저장할때 데이터를 가지고 특점 게산식의 결과 값을 인덱스로 사용하여 저장
                                                              l-특점 계산식의 결과값 이란 해시값 (hash value) = 정수로 된 ID 값 
                                                               -배열의 인덱스처럼 0에서 시작하는 값으로 조회 할 수 없다. 그래서 get메소드가 없다.
                    결론! 
                      데이터  저장 방식( daa staucture) 자료구조에 따라 데이터를 조회하는 방식이 다르다.
                      => 데이터 조회를 위한 코딩이 일관성이 없다.

                      해결책
                         -데이터 조회하는 일을 별도의 객체로 맡기자!
                         -단 데이터 조회 방식을 통일하기 위해 인터페이스로 조회 방식을 규격화 한다.
                       데이터 조회의 일관성 확보 = 즉 유지보수가 쉽다.


        Iterator 패턴: 데이터 조회 코드를 객체화시켜 분리
          -자료구조에 상관없이 일고나된 방법으로 데이터 조회 수행
          ->객체화 -> 다양항 조회 방식을 제공/교체

            데이터 조회를 다른 객체에게 맡긴면서 데이터 조회 방식을 통일한다.
            그렇게 되면 데이터 조회의 일관성을 확보하므로 유지보수가 쉬워진다.




  
* 객체간의 관계를 의인화 시켜서 이해를 한다면 더 큰 구조의 객체지  그램을 더 잘 이해할 수 있다.
 ( 인스턴스 한개가 한사람처럼 컨셉처럼 )

 


* 실전 : Low coupling  

*객체지향 프로그램도 어느정도는 느슨해야한다.

가능한 접점을 줄이는 방법.


1.프론트를 프랑스어로 말하면 퍼샤드 facade 패턴 (모든 학생과 얘기하다가 27:1 반장을 내새워서 반장이랑만 얘기함 1:1  ) 

      


2022_08_08

데이터 조회를 객체화: Iterator 패턴 적용
  -> 데이터 조회와 관련된 필드와 메서드를 분리하여 외부 부품으로 만든다 <- 객체화(부품화)
    기능 변경및 교체가 쉽다. 즉 유지보수가 쉽다.


      바이너리(binary) 데이터 입출력
      byte형식의 데이터


FileOutputStream 클래스


1byte출력 > write()
바이트 배열 출력 > write(byte[])



FileInputStream 클래스



1byte 읽기    > read()
바이트 배열 읽기 > read(byte[])

인풋 스트링 아우풋 스트링


2022_08_09 

App. 파일입출력 소스들 객체화 시킴

Primitive 타입 및 데이터를 가공하여 입출력하는 기능을 개체화 함.

2022_08_10

객체화 = 메서드, 클래스라는 블록에 감추기 = encapsulation (캡슐화)


primitive type 의 값을 출력하는 코드를 메서드 안에 넣는다(감춘다).=> encapsulation (캡슐화)
=> 복잡한 코드를 메소드안에 감춰서 쓰기 쉽게 하는것.

java에서 제공하는 데코레이터(중간에서 가공처리 일을 하는 객체) 사용하기


버퍼 - 식판 필통 지갑 ( 잠시 사용할 것만 일부 담는 곳 ) RAM


                                  버퍼가 꽉 차면 실제 파일로 출력
Date          ->        buff       ->              file
             출력        RAM         RAM이 꽉차면 HDD로 출력함으로써 입출력에 소요되는 시간을 줄인다.
          출력할 데이터를
          RAM에 모아둔다.

             버퍼를 사용하는 이유는  RAM이 꽉차면 HDD로 출력함으로써 입출력에 소요되는 시간을 줄인다.
  
1byte 씩 바로 바로 HDD로 출력하는것보다 일정량의 바이트들은 메모리에 모았다가 한번에 출력하는 것이 시간이 덜 소요된다.


Serialize       와      Deserialize
(직력화)= marshaling      (역직렬화)    = unmarshaling      
->바이트배열로 변환         -> 바이트배열 있는 데이터를 가지고 인스턴스 생성하는것,

클래스 정보 (이름, 패키지명)     클래스 정보 (이름, 패키지명)
버전 번호 (serialversionUID) 버전 번호 (serialversionUID)
필드 값                      필드 값

직접 필드값을 출력하는 것보다       
파일크기가 커지는 단점이있다.       

객체 직렬화 방식으로 입출력을 한다면.
  |코딩이 편한 장점이있지만      
  |다른 프로그래밍 언어로 읽고쓰기가 어렵다.


  CSV ( Comma _Seperated valuse)


*텍스트 형식의 데이터 특징

-바이너리 형식보다 파일크기가 크다
-저장할때 , UTF-16 -> UTF-8 로 잍코딩   
 읽을때 , UTF-8 -> UTF-16 디코딩 
 을 해야해서 인코딩/디코딩에 시간소요
|-텍스트 편집기로 직접 변경가능 <=>바이너리 형식은 전용 App을 사용해야한다.
|-프로그래밍 언어간 호환이 잘된다. -> App 끼리 데이터 교환이 쉽다.
바로 위 두개의 특징 떄문에 XML, JSON 형식을 많이 사용한다.


Factory Method 패턴 , Information Expert 패턴
 GoF 의 디자인 패턴       GRASP 패턴
            생성 
  csv data ->  Board 객체


*랩퍼(wrapper) 클래스

오브젝트 파라미터의 타입을 만들면 따로 안붙여도 컴파일러가 알아서 코드작성해서 컴파일한다.


오토 언박싱 
  다음과 같이 프로그래밍 중에
  primitive type의 값을 인스턴스에 담고("박싱(boxing)"이라 부른다)
  인스턴스의 담긴 primitive 값을 다시 꺼내는 일("언박싱(unboxing)"이라 부른다)은
  매우 불편한다.


    Integer obj = 100; // ==> Integer.valueOf(100)

     obj는 레퍼런스인데 어떻게 가능한가?
     => 내부적으로 Integer.valueOf(100) 호출 코드로 바뀐다.
     => 즉 int 값이 obj에 바로 저장되는 것이 아니라,
       내부적으로 Integer 객체가 생성되어 그 주소가 저장된다.
     => 이렇게 int 값을 자동으로 Integer 객체로 만드는 것을
        "오토박싱(auto-boxing)"이라 한다.


  Integer obj = Integer.valueOf(300);
    int i = obj; // ==> obj.intValue()

             obj에 저장된 것은 int 값이 아니라 Integer 객체의 주소인데 어떻게 가능한가?
     => 내부적으로 obj.intValue() 호출 코드로 바뀐다.
     => 즉 obj에 들어있는 인스턴스 주소가 i에 저장되는 것이 아니라,
        obj 인스턴스에 들어 있는 값을 꺼내 i에 저장하는 것이다.
     => 이렇게 Wrapper 객체 안에 들어 있는 값을 자동으로 꺼낸다고 해서
        "오토언박싱"이라 부른다.




        2022_08_11



1. Exception 

2. Currency 

3. Timezone

4. Regular Expression 

JSON 형식으로 데이터를 읽고 쓰는 법
google에서 제공 해주는 JSON 라이브러인 Gson 사용법.
 
            번호,이름,이메일,암호,등록일

=>한줄의 문자열로 데이터 표현 할수 있고 , 로 항목을 구분하며 , 텍스트형식 이므로
전용 편집기의 도움없이 읽고 쓸 수있다는 장점이 있다.
하지만  다른 데이터를 포함하고 있고 데이터를 표현하기 힘들다
즉, 계층 구조로된 데이터를 표현하기 어렵다.
=

계층 구조의 데이터 ex)

      [책 정보]
        -제목
        -내용
        -저자들
          -저자
            -이름  
            -이메일




            -연락처
          -저자2
            -이름  
            -이메일
            -연락처
        -출판사
          -출판사명
          -홈페이지
          -전화
          -팩스

위와 같은 예제의 경우처럼 책 데이터 안에 (저자들의 데이터,출판사의 데이터가 있을경우)csv로 표현하기가 어렵다.

=>실무에서 다루는 데이터는 게시글 처럼 단순한 선형(linear) 구조로만 되어 있지 않다.
예제의 " 책 정보" 처럼 다른 데이터를 포함하는 계층구조로된 경우가 많다.

(계층 구조의 데이터를 표현 할 수 있고, 텍스트형식으로 되어 있어, OS나 프로그래밍 언어에 종속되지 않는 공개된 데이터 포맷)=> XML,JSON

바이너리형식 많이 불편하다. 
(1바이트로 짤라내서 다시 1바이트씩 읽어들여서 해당되는바이트로 넣고 출력하는것.)



텍스트형식으로 사용하는방식은 편하다
(OS나 프로그래밍 언어에 상관없이 데이터를 주고 받기 편리하다. )

## XML

XML은 계층적인 구조의 데이터 표현을 주로 사용하고 각 데이터의 의미를 표시 하므로
데이터 조회 및 추출이 용이하고 App에서 데이터를 다루기 쉽고 텍스트 형식으로
OS나 프로그래밍 언어에 상관없이 데이터를 주고 받기 편리하는 장점이 있다.

단점으로는 데이터 보다 부가 데이터가 더 클 수 있기 때문에 파일 크기가 매우 커진다는 단점이있다.

## JSON

JavaScript Object Notation: 자바 스크립트에서 객체는 표기하는 문법을 차용해서 데이터를 표현하는 문법으로 만든 것.


      { 
      "title" :"-",
        "description" : "-",
        "authors" :[ { "name": "-","email":,"-","tel":"-"},
                     {"name": "-","email":,"-","tel":"-"}]
        "press":{"name": "-","homepage":,"-","tel":"-"}

    }  

JSON 형식
https://www.json.org/json-en.html

JSON 형식의 특징으로는 텍스트 형식이며 계층형 데이터 표현이 쉽고,프로퍼티 명(XML의 태그명)을 통해 데이터 의미를 표시한다.
(XML 보다 간결하며 XML 보다 부가데이터 크기가 작다)

build.gradle 프로젝트 설정 파일에 dependencies 부분에  implementation 'com.google.code.gson:gson:2.9.1' 추가해준다.

프라퍼티명 (필드명)


## 네티워킹을 이용한 파일 공유
    
    - Client / Server Application Arcgitecture
      장점: 다중 사용자에게 동시 서비스 제공.
      단점: 


두 Application이 데이터를 주고 받을 수 있도록 연결


    
    
