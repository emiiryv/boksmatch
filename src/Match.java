public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    public void run() {
        if (this.isCheck()) {
            int tmp = (int)(Math.random() * 2.0 + 1.0);

            while(this.f1.healt > 0 && this.f2.healt > 0) {
                System.out.println("----Yeni Round----");
                if (tmp == 1) {
                    this.f2.healt = this.f1.hit(this.f2);
                    if (this.isWin()) {
                        break;
                    }

                    this.f1.healt = this.f2.hit(this.f1);
                    if (this.isWin()) {
                        break;
                    }

                    System.out.println(this.f1.name + " Sağlık : " + this.f1.healt);
                    System.out.println(this.f2.name + " Sağlık : " + this.f2.healt);
                }

                if (tmp == 2) {
                    this.f1.healt = this.f2.hit(this.f1);
                    if (this.isWin()) {
                        break;
                    }

                    this.f2.healt = this.f1.hit(this.f2);
                    if (this.isWin()) {
                        break;
                    }

                    System.out.println(this.f2.name + " Sağlık : " + this.f2.healt);
                    System.out.println(this.f1.name + " Sağlık : " + this.f1.healt);
                }
            }
        } else {
            System.out.println("Sporcuların sikletleri uyuşmuyor.");
        }

    }

    boolean isCheck() {
        return this.f1.weight >= this.minWeight && this.f1.weight <= this.maxWeight && this.f2.weight >= this.minWeight && this.f2.weight <= this.maxWeight;
    }

    boolean isWin() {
        if (this.f1.healt == 0) {
            System.out.println(this.f2.name + " Kazandı.");
            return true;
        } else if (this.f2.healt == 0) {
            System.out.println(this.f1.name + " Kazandı.");
            return true;
        } else {
            return false;
        }
    }
}

