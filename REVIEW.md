# 우테코 회고록

### 1주차

이번 과제는 총 7문제로 로직이 비교적 단순하여 로직 구현에 큰 고민을 하지않았다.<br/><br/>

그러나 [README](./README.md) 를 확인해보면 구현 과정보다 복잡한 코드 관리 규칙들이 존재한다.<br/>
요구사항에 맞는 규칙에 준수하여 작성하는데 적응하는 과정이 다소 오래 걸렸다.<br/><br/>

또한 원래 초기의 구현은 단순히 inner static class로 한 파일에 구현하려고 계획했었다.<br/>
하지만 문제를 마주하면서 만약 이 코드의 유지보수를 생각해야 한다면? 이라는 가정이 문득 떠올랐다.<br/>

만약, 1번 문제 같은 경우 요구사항이 달라져 유저의 점수 계산 방식이 바뀌고<br/>
전체 게임의 결과 값이 달라진다면 처음부터 다시 구현을 해야 했기 때문에<br/>
어떻게 유지보수하기 좋을까에 대하여 고민해보는 시간을 경험했다.<br/>
이러한 고민 끝에 단순히 문제만으로 인식하지 않고 추후 변경하기 쉽도록 인터페이스를 적극 활용하였다.<br/><br/>

아쉬웠던 점은 요구사항 분석 후 설계 -> 인터페이스와 Problem.solution 로직 구현 -> 인터페이스들의 구현체 구현 순으로<br/>
commit을 하려고 노력했지만 commit과 개발 절차에 있어서 잦은 실수가 있어 아쉬웠다고 생각한다.<br/>