package onboarding.problem6.impl;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CrewValidatorV1Test {

    @Test
    public void koreanSpellingCheck() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        CrewValidatorV1 validator = new CrewValidatorV1();

        Method isKorean = validator.getClass().getDeclaredMethod("isKorean", String.class);
        isKorean.setAccessible(true);

        boolean ret1 = (boolean) isKorean.invoke(validator, "한");
        assertThat(ret1).isEqualTo(true);

        boolean ret2 = (boolean) isKorean.invoke(validator, "글");
        assertThat(ret2).isEqualTo(true);

        boolean ret3 = (boolean) isKorean.invoke(validator, "N");
        assertThat(ret3).isEqualTo(false);
    }

    @Test
    public void isValidNicknameCheck() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        CrewValidatorV1 validator = new CrewValidatorV1();

        Method isValidNickname = validator.getClass().getDeclaredMethod("isValidNickname", String.class);
        isValidNickname.setAccessible(true);

        boolean ret1 = (boolean) isValidNickname.invoke(validator, "한글닉네임");
        assertThat(ret1).isEqualTo(true);

        boolean ret2 = (boolean) isValidNickname.invoke(validator, "가나다라ㅁㄴㅇㄹ");
        assertThat(ret2).isEqualTo(true);

        boolean ret3 = (boolean) isValidNickname.invoke(validator, "NoKorean");
        assertThat(ret3).isEqualTo(false);

        boolean ret4 = (boolean) isValidNickname.invoke(validator, "이십글자이십글자이십글자이십글자안됩니다");
        assertThat(ret4).isEqualTo(false);

        boolean ret5 = (boolean) isValidNickname.invoke(validator, "");
        assertThat(ret5).isEqualTo(false);
    }

}