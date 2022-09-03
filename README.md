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


파일 읽어들일떄는 파일리더 파일 인풋 스트림 

바이너리를 읽어 들일때는 파일 인풋 스트림
텍스트 타입을 읽어 들일때는 파일리더


## 네티워킹을 이용한 파일 공유
    
    - Client / Server Application Arcgitecture
      장점: 다중 사용자에게 동시 서비스 제공.
    
두 Application이 데이터를 주고 받을 수 있도록 연결


DataInputStream 
문자열을 UTF-8 로 변환시켜준다.

InputStreamReader

비트를 UTF-16 으로 변환시켜준다


 FileInputStream, FileOutputStream, DataInputStream, DataOutputStream, BufferedInputStream, BufferedOutputStream, CipherInputStream, CipherOutputStream 등 수많은 클래스의 부모 클래스가 되는 InputStream 과 OutpuStream 클래스가 있습니다. 일반적인 경우, InputStream 의 read() 메소드와 OutputStream 의 write() 메소드만 있으면 입출력하는데 부족함이 없습니다. 수많은 종류의 스트림들은 이 부모 스트림들을 확장해서 특수한 목적에 사용되도록 특수한 성질을 부여한 스트림입니다. 예를 들어, Buffered{Input	Output}Stream 은 내부적으로 적절한 버퍼링을 하여 입출력을 효율적으로 하도록 도와줍니다. Cipher{Input	Output}Stream 은 객체 암호문을 쉽고 편하게 입출력 하도록 도와줍니다.
그럼 자바에서 유닉스의 파일 디스크립터와 같은 역할을 하는것은 무엇일까요. 각각의 InputStream 과 OutputStream 의 인스턴스들입니다. System.out 은 C의 stdout 이라고 봐도 무방할듯 합니다. 자바를 한번이라도 접해본 사람은 다음과 같은 코드를 본 적이 있을것입니다.



=> key나 value에 null을 사용하고 싶다면 HashMap을 사용하라.
=> key나 value가 null이 되어서는 안된다면 Hashtable을 사용하라.





       2022_08_19

    
    ##Proxy 패턴을 활용한 네트워킹 코드 캡슐화

    캡슐화란 복잡한 코드가 안보이도록 클래스 안의 메서드로 감추는것. 해당 기능이 필요한 경우 간단히 메서드 호출로 처리 한다. 



  2022_08_22

  
  Remote Object (서버 서블릿)

  Stub (BoardDao proxy)

  skeleton (BoardServlet)

  2022_08_23

  서버는 포트 번호를 고정 시켜야하지만

  클라이언트는 고정시킬 필요없기때문에 OS가 자동으로 부여한다.
  

  출력은 블로킹이 안걸리지만 리딩은 블로킹이 걸린다.                                                                        

  버퍼 쓸때 flush 항상 생각하기
  왜? 버퍼는 버퍼에 다 쌓여야 보내기때문에

  
  게임은 전형적인 Stateful 방식이다. Stateful 의 멀티쓰레드가 동작 한다.

  인터넷 검색은 전형적인 Statelees 방식이다. 

  Node.js 방식은 예제 stateless2 방식이다.
  문제점은 한명이 기달리게되면 나머지애들도 다 기달려야된다.

  stateless도 결국 싱글 스레드 이기 때문에 문제가 발생되고
  그 문제를 해결하기 위해선 쓰레드를 사용해야한다.

  UDP 
  단점을 보완하기 위해서 루틴을 산입해야한다.
  루틴이란 상대가 받았는지 안받았는지 확인하는 방법.


  URI -> URL,URN


  URI (Uniform Resource Identifier)

   - URL (Uniform Resource Locator)
        http:(프로토콜(Scheme))

          hong (사용자 ID)        생략함 
          11111 (암호 password)  생략함
          www.naver.com (서버주소 host)
          80(포트번호 prot)       생략 ( http ->80 , https -> 443)
          cafe(경로 path)
          list?no=20&sort=a (Query String)


   - URN (Uniform Resource Name)
        ex) example:animal:ferret:nose




Static Resource



Dynamice Resource = 실행할 때마다 리턴결과가 달라질 수 있다.



## Query String
     - 자원의 경로(예: /index.php) 다음(물음표 ? 다음)에 오는 파라미터
     - 형식: 파라미터명=값&파라미터명=값&파라미터명=값
     - 예) sm=top_hty&fbm=1&ie=utf8&query=비트캠프



웹 파싱할때 net = ex08 번 예제 0110 사용할것.
      응답 헤더 필요하면 예제 0210 사용
  



App를 실행하여 필요한 H/W 자원만 사용

물론 VM 처럼 별도의 컴퓨터에서 실행하는 것처럼 동작.

- # 멀티 스레딩

code와 heap 메모리를 여러 스레드가 공유를 한다
멀티 프로세싱 방식에 비해 메모리 낭비가 적다.

VM (하드웨어 자원을 다 사용해서 자원이 많이 들어간다.)

  Parallels - 맥에서 윈도우 프로그램 사용할수있게해주는 가상머신

Docker (최소한의 자원만 사용한다.) 도커 엔진은 VM 웨어의 이미지라 생각하면 편하고 
도커는 서버의 저장된 이미지를 불러와서 실행하기 떄문에 많이 가볍고 속도도 빠르다.  

# 프로세스 종료시 종속된 스레드도 모두 사용 종료된다.


 Parallels 병렬 프로그래밍 . 정말 따로따로 실행되는것.


 멀티 테스킹
 콘크런트 동시성. 왔다갔다 왔다갔다 마치 동시에 실행되는것처럼 보이게 실행하는것.



## CPU가 프로세스나 스레드의 명령을 실행할 때, CPU 실행을 분배한느 전략?
(cpu를 어떤식으로 분배해서 명ㄹ형을 처리할 것인가?)
=> "cpu Scheduling"

1.windows -> Round Robin (프로세스와 스레드에 동일 시간 분배)

2.Unix -> priority (문제점 하버드대하교에서 프로그램실행이 3년동안 밀린사건.)
          + Aging 
priorty는 우선순위가 높은 프로세스나 스레드를 더많이 실행하는것.
Aging은 우선순위가 낮아 실행이 밀릴 때 마다 우선순위를 높여서 다음 번엔 실행 될수 있게 하는것.


# Context Switching
- cpu가 다른 프로세스나 스레드를 실행하기 위해 현재 프로세스나 스레드의 실행상태(여기까지 실행했다.)를 저장하고
실행 할 프로세스나 스레드의 실행상태(어디서부터 실행하나?)를 로딩하는것.

ex) 5대의 컴퓨터를 10초마다 돌아가면서 코딩하는데 코딩하고 다음 컴퓨터 코딩 하면서
어? 어디까지 코딩했지? 아 여기 까지 했지. 라고 생각하는 데 시간이 소요된다.
이러한것을 Context라 한다.
          

      cpu 스케쥴링 시간을 너무 짧게 잡으면 명령을 실행하는 시간보다
      Context Switching 에 더많은 시간을 소비하는 문제가 발생한다.
      -> 너무 간극을 크게 잡으면 동시실행 효과가 떨어진다.


  2022_08_25

  
  Socket socket = serverSocket.accept();
   문장 이해하기 이해안되면 생성자와 인스턴스 필드 이해야됨

   익명클래스에서 바깥에있는 로컬변수를 사용하는것.
   익명클래스에서 필드초기화 문장이 생성자에 

12:00 다시보기.
  


  2022_08_26

  모든 스레드가 완료 할 때까지  JVM은 종료되지 않는다.

  Running = cpu 를 받을수 있는 상태 (cpu 스케줄링 대상)
 (지금 실행하고있다는 뜻이아니라 대기를 하고있는상태)

 한번 Dead된 쓰레드는 다시 작동하지 않는다.
예외 발생 ! IllegalThreadStateException.

Not Runnable = cpu 를 안받는 상태( cpu 스케줄링 대상에서 제외)

요즘은 거의다 선점형 운영체제다

OS가 cpu 사용을 온전히 점유하여 점유하여 관리한다.

IOT는
(마이크로 보드)아두이노


트렌지스터를 가지고 and or 게이트 -> 더하기 뺴기 -> 미니보드에 초소형 os 


Cpu Racing 

OS가 CPU 스케쥴링에 규칙에 의해서 결정한다.


# 같은메모리를 여러 스레드가 동시에 접근할때 문제점

-       여러 스레드가 동시에 이 메서드에 진입하면 
       배열의 값을 덮어쓰는 문제가 발생한다.
       이렇게 여러 스레드가 동시에 접근했을 때 문제가 발생하는 코드 부분을
       한국말 로는 치명적인 영역 영어로는 
       "Critical Section" 또는 "Critical Region" 이라 부른다.

        어떤 코드에 문제가 발생하는가?
       같은 메모리(변수)를 동시에 접근할 때
       다른 쓰레드가 쓴 값을 덮어 쓸수 있다.

        해결책? 상호배제 기법 
       한번에 한 스레드 만이 접근하도록 제한하면 된다.
       Mutual Exclusion (상호 배제 -> Mutex 뮤텍스라 부른다.)
       Semaphore(n) (n개 까지만 허용 나머지는 배제);
       ex) Semaphore(1) 이것을 Mutex라 부른다.
       ex) Semaphore(최대수용인원) 화장실이라 정하면 대변기 한칸 Semaphore(1) 이것을 Mutex라 부른다. 
       자바에서는 Mutex를 문법으로 지원한다!
       세마포어는 개발자가 프로그램 짜야한다.



    비동기 실행은 모든 스레드가 진입 가능하고 동기 실행은 한번에 한 스레드만 진입 가능하다. 
    블록 동기 실행은 한번에 한스레드만이 블록에 진입가능.
    블록의 코드 실행이 완료되어야만 다른스레드 진입가능!


14시 50분 개념 설명 반복해서 듣기 

## DBMS(DataBase Management Sytstem Service)
 DBMS 란 DataBase 를 지원하고 관리해주는 S/W
  - DataBase 관리
  - 다중 Client 요청 관리
  - 접속자 인증/권한 검사
  
  ex) 
  
    Oracle -  Oracle DBMS  
    Oracle -  MYSQL ( 오픈소스) 재발 커뮤니티에서 관리
      MS   -  MS_SQL
      IBM  -  DB2
      한국  -  Cubrid
              Altibase
              Tobero

## DataBase 
  - 데이터 공유
  - 일관성,무결성,보안성
  - 데이터중복 최소화
  - 실시간 접근

  

## DBMS 사용법

각 DBMS 마다 문법이 다른데 이 문법을 통일 시킨것
SQL(Structured Query Language) 
구조를 갖춘 DBMS에 명령을 내릴떄 사용하는 문법

*SQL 표준?

SQL 표준 문법 + Oracle 에서만 인식되는 문법

SQL 표준 문법 + MS-SQL 에서만 인식되는 문법

SQL 표준 문법 + MariaDB에서만 실행 할 수 있는 문법

왜? DBMS 마다 전용문법이 있는가?
DBMS만의  마다 특별한 기능을 사용할 문법이 필요.

왜 다른 언어들을 사용하는가?
상황마다 적합한 언어가 있다.
 

 ##  MariaDB Server 와 Client


brew install mariadb

brew services start mariadb

sudo mysql_secure_installation

 mysql -u root -p




2022_08_29


mysql -u root -p
루트권한으로 접속

select user, host frome mysql.user;
유저목록 보기

create database studydb character set utf8 collate utf8_general_ci;
생성

show databasees;
데이터베이스 목록 보기.

show variables like 'character_set%';
마리아 DB가 지원하는 케릭터셋 보기.

grant all on studydb.* to 'study'@'localhost';
권한

create table test1(name vardar (50) not null,
);


use root;
사용할 데이터베이스 지정

insert into test1(no, name) values(1, 'aaa');
테이블에 데이터 입력

select no,name from test1;
테이블에 들어있는 데이터 조회


desc test1;

select *


2022_08_30


# DDL(Data Definition Language)
DB 객체(테이블, 뷰, 함수, 트리거 등)를 생성, 변경, 삭제하는 SQL 명령이다.


 alter table test1
    add constraint test1_pk primary key(no),
    add constraint test1_uk unique (name, age);

alter = 변경하는 명령어.


unique  = primary key 중복해서 사용할수 있게해주는 명령어

 
 변수 지정해줄떄 사용해도되지만
 
 alter 명령어로 따로 지정해줄수있다.


 인덱스 컬럼은 빠르게 검색 하고싶을때 사용한다.
 select * from test1 where name = 'bbb';

  단점, 이런 이유로 이름으로 검색할 때 찾기 속도는 빠르지만,
  입력,변경,삭제 속도는 느리게 된다.


  Key - 데이터를 구분하는 식별자.

  데이터를 식별할때 사용할 수 있는 컬럼들의 값.

  
  candidata key (후보키 = 최소키)
   -이메일, 주민번호,휴대폰
 Key중에서 최소의 컬럼으로 줄인 Key


 primary key (주(핵심) 키)
= alternate key (대안 키지만 주키처럼 쓸수 있는 키)
 => unique 컬럼으로 지정된다.

줄여서 PK라 부르는데 PK는 변경할 수 없다.


후보키 중에서 DB관리자가 선정한 키

artificial key (인공키)

PK로 사용하기에 적절한 키가 없다면
임의의 컬럼을 만들어 PK로 지정한다.
보통 일련번호 컬럼.


특정조건의 데이터를 선택하는 것을 selection 이라 부른다.
ex) select no,name from test1 where no > 10; 

결과로 추출할  컬럼(행)을 지정 하는것을 projection프로젝션이라 부른다.
ex) select no,name from test1;
 


 select no, concat(name,'(',class,')') from test1;

dbms에서 코딩을 하면 업무와 관련된 코드가 작성될수 밖에없는데
그래서 회사에서는 dbms에다가 (비지니스로직)을 놓지말라고 권고하지만,
자바에서 하면 네트워크에 부하가 많이걸려서
편하게 작업하기 위해서 dbms에서 작업하는 경우가 많다. 


 결과 데이터중에서 추출할 컬럼을 선택하는걸 프로젝션
 결과 데이터를 선택하는것을 셀렉션.


Mariadb 실행 순서:
 from --> where --> group by --> select --> having --> order by
 