package oop1;

public class MusiplayerMain3 {

    public static void main(String[] args) {

        MusiPlayerData data = new MusiPlayerData();

        on(data);

        volumeUp(data);
        volumeUp(data);
        volumeDown(data);

        showStatus(data);

        off(data);

    }

    static void on (MusiPlayerData data){
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    static void off (MusiPlayerData data){
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp (MusiPlayerData data){
        data.volume++;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }


    static void volumeDown (MusiPlayerData data){
        data.volume--;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }
    static void showStatus (MusiPlayerData data){
        System.out.println("음악 플레이어 상태 확인.");

        if(data.isOn){
            System.out.println("음악 플레이어 ON, 볼륨:" + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
