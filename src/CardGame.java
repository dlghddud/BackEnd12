import java.util.*;

class Card {
    String suit;
    int rank;

    Card(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        String rankStr = rank > 10 ? switch(rank) {
            case 11 -> "J";
            case 12 -> "Q";
            case 13 -> "K";
            case 14 -> "A";
            default -> String.valueOf(rank);
        } : String.valueOf(rank);
        return rankStr + suit;
    }
}

class Player {
    String name;
    int money;
    int wins;
    int losses;
    List<Card> hand;

    Player(int playerNumber) {
        this.name = "플레이어 " + playerNumber;
        this.money = 10000;
        this.wins = 0;
        this.losses = 0;
        this.hand = new ArrayList<>();
    }
}

class HandEvaluator {
    static int evaluateHand(List<Card> hand) {
        int[] ranks = hand.stream().mapToInt(c -> c.rank).sorted().toArray();
        boolean isFlush = hand.stream().allMatch(c -> c.suit.equals(hand.get(0).suit));
        boolean isStraight = ranks[4] - ranks[0] == 4 && Arrays.stream(ranks).distinct().count() == 5;


        if (ranks[0] == 2 && ranks[1] == 3 && ranks[2] == 4 && ranks[3] == 5 && ranks[4] == 14) {
            isStraight = true;
        }

        if (isFlush && isStraight) return 800; // 스트레이트 플러시
        if (isFourOfAKind(ranks)) return 700;  // 포카드
        if (isFullHouse(ranks)) return 600;    // 풀 하우스
        if (isFlush) return 500;               // 플러시
        if (isStraight) return 400;            // 스트레이트
        if (isThreeOfAKind(ranks)) return 300; // 트리플
        if (isTwoPair(ranks)) return 200;      // 투 페어
        if (isOnePair(ranks)) return 100;      // 원 페어
        return ranks[4];                       // 하이 카드
    }

    private static boolean isFourOfAKind(int[] ranks) {
        return (ranks[0] == ranks[3]) || (ranks[1] == ranks[4]);
    }

    private static boolean isFullHouse(int[] ranks) {
        return (ranks[0] == ranks[2] && ranks[3] == ranks[4]) ||
                (ranks[0] == ranks[1] && ranks[2] == ranks[4]);
    }

    private static boolean isThreeOfAKind(int[] ranks) {
        return (ranks[0] == ranks[2]) || (ranks[1] == ranks[3]) || (ranks[2] == ranks[4]);
    }

    private static boolean isTwoPair(int[] ranks) {
        return (ranks[0] == ranks[1] && ranks[2] == ranks[3]) ||
                (ranks[0] == ranks[1] && ranks[3] == ranks[4]) ||
                (ranks[1] == ranks[2] && ranks[3] == ranks[4]);
    }

    private static boolean isOnePair(int[] ranks) {
        for (int i = 0; i < 4; i++) {
            if (ranks[i] == ranks[i + 1]) return true;
        }
        return false;
    }
}

class CardGame {
    List<Card> deck;
    List<Player> players;
    Random random;

    CardGame(int numPlayers) {
        if (numPlayers > 4) {
            throw new IllegalArgumentException("최대 4명 플레이어만 가능합니다");
        }
        this.players = new ArrayList<>();
        for (int i = 1; i <= numPlayers; i++) {
            players.add(new Player(i));
        }
        this.random = new Random();
        initializeDeck();
    }

    void initializeDeck() {
        deck = new ArrayList<>();
        String[] suits = {"♠", "♥", "♦", "♣"};
        for (String suit : suits) {
            for (int rank = 2; rank <= 14; rank++) {
                deck.add(new Card(suit, rank));
            }
        }
    }

    void dealCards() {
        Collections.shuffle(deck, random);
        for (Player player : players) {
            player.hand.clear();
            for (int i = 0; i < 5; i++) {
                player.hand.add(deck.remove(0));
            }
        }
    }

    void playGame() {
        for (int game = 1; game <= 100; game++) {
            System.out.println("\n게임 " + game + ":");
            initializeDeck();
            dealCards();

            List<Player> winners = new ArrayList<>();
            int highestScore = -1;

            // 모든 플레이어의 패 평가
            for (Player player : players) {
                int score = HandEvaluator.evaluateHand(player.hand);
                System.out.print(player.name + "의 패: " + player.hand);
                System.out.println(" (점수: " + score + ")");
                if (score > highestScore) {
                    winners.clear();
                    winners.add(player);
                    highestScore = score;
                } else if (score == highestScore) {
                    winners.add(player);
                }
            }

            for (Player player : players) {
                if (winners.contains(player)) {
                    player.wins++;
                    player.money += 100;
                } else {
                    player.losses++;
                }
            }

            if (winners.size() == 1) {
                System.out.println(winners.get(0).name + " 승리!");
            } else {
                System.out.print("동점 승리: ");
                for (int i = 0; i < winners.size(); i++) {
                    System.out.print(winners.get(i).name);
                    if (i < winners.size() - 1) System.out.print(", ");
                }
                System.out.println();
            }
        }

        players.sort((p1, p2) -> p2.wins - p1.wins);
        System.out.println("\n<최종 결과>");
        System.out.println("플레이어\t\t승리\t패배\t게임머니");
        for (Player player : players) {
            System.out.printf("%s\t%d\t%d\t%d%n",
                    player.name, player.wins, player.losses, player.money);
        }
    }

    public static void main(String[] args) {
        CardGame game = new CardGame(4);
        game.playGame();
    }
}