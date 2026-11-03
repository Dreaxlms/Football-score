import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FootBallTest {
    FootBallScore f5 = new FootBallScore();

    @Test
    void shouldequalamount(){
        FootBallScore footBallScore = new FootBallScore();
        String[] result = FootBallScore.calculatePoints();

        //Assert
        assertArrayEquals(finialpoints , result);




    }
}
