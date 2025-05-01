package CoR2;

public class Application {
    public static void main(String[] args) {
        Attack attack = new Attack(100);

        Armor armor1 = new Armor(10);
        Armor armor2 = new Armor(15);

        armor1.setNextDefense(armor2);
        armor1.defense(attack);

        System.out.println(attack.getAmount());

        /*
        동적으로 아래와 같이 설정 추가 가능
         */
        Defense defense = new Defense() {
            @Override
            public void defense(Attack attack) {
                int amount = attack.getAmount();
                attack.setAmount(amount -= 50);
            }
        };

        armor2.setNextDefense(defense);

        attack.setAmount(100);
        armor1.defense(attack);

        System.out.println(attack.getAmount());
    }
}
