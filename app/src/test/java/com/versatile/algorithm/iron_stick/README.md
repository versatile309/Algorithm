## 01. 이해
    '()'를 레이저로 보고 막대기와 레이저로 이루어진 배열을 입력받아 
    절단된 막대기의 갯수를 구한다. 이때 레이저인 '()'를 제외하고 나머지 괄호들에 대해
    '('는 막대기의 시작, ')'는 막대기의 끝이다.
    
       
## 02. 계획
    '('가 나올때마다 현재 깔려있는 막대기의 갯수와 총 막대기 갯수를 더하고 
    ')'가 나올 때마다 현재 깔려있는 막대기의 갯수와 총 막대기 갯수를 뺀다. 
    '()'를 만나면 현재 깔려있는 막대기의 갯수를 총 막대기 갯수에 더한다.
    
## 03. 실행

## 04. 회고
    레이저를 처음에 다른 문자로 치환해 놓으니까 ')'가 나왔을 때 이전 괄호와 함께 비교해서
    레이저인지 아닌지 판단할 필요가 없어서 편한 것 같다.