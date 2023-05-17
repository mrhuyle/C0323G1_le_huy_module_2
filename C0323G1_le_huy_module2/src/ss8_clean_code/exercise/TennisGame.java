package ss8_clean_code.exercise;

/**
 * Author: Le Huy C0323G1
 * Refactor result:
 * 1. Use tool format code of IDE Intellij (Option + Command + L). Because the code is unformatted
 * 2. A method getScore too complicated -> Extact this method (* following - line 8 below)
 * 3. Should use comments to explain the code -> should use comment
 * 4. The parameters player1Name, player2Name has not been used -> Delete this.
 * 5. The name of method getScore do not describe exactly what this method does -> Refactor name to displayScore
 * 6. The name of variables m_score1, m_score2 is not good -> Refactor to firstPlayerScore, secondPlayerScore
 * 7. Case 0,1,2,3 is MAGIC value. So use extract constant method to define it (initial LOVE, FIFTEEN, THIRTY, FOURTY)
 * 8. Extract method: (First) Method readPoint() to read the point (0,1,2,3) according to tennis rules
 * , (Second) Method displayScore() to display score.
 */
public class TennisGame {
    public static String readPoint(int point) {
        final int LOVE = 0;
        final int FIFTEEN = 1;
        final int THIRTY = 2;
        final int FORTY = 3;
        String result = "";
        switch (point) {
            case LOVE:
                result = "Love";
                break;
            case FIFTEEN:
                result = "Fifteen";
                break;
            case THIRTY:
                result = "Thirty";
                break;
            case FORTY:
                result = "Forty";
                break;
        }
        return result;
    }

    public static String displayScore(int firstPlayerScore, int secondPlayerScore) {
        String score = "";
        boolean beforeDeuce = firstPlayerScore < 4 && secondPlayerScore < 4;
        boolean equalPoints = firstPlayerScore == secondPlayerScore;
        if (secondPlayerScore < 0 && firstPlayerScore < 0) {
            score = "Invalid score";
        } else if (beforeDeuce && equalPoints) {
            score = readPoint(firstPlayerScore) + " - All";
        } else if (beforeDeuce) {
            score = readPoint(firstPlayerScore) + " - " + readPoint(secondPlayerScore);
        } else if (equalPoints) {
            score = "Deuce";
        } else {
            int minusScore = firstPlayerScore - secondPlayerScore;
            switch (minusScore) {
                case 1:
                    score = "Advantage FirstPlayer";
                    break;
                case -1:
                    score = "Advantage SecondPlayer";
                    break;
                case 2:
                    score = "Win for FirstPlayer";
                    break;
                case -2:
                    score = "Win for SecondPlayer";
                    break;
                default:
                    score = "Invalid score";
            }
        }
        return score;
    }
}