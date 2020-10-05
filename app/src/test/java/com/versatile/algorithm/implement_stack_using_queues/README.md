## 01. 이해 
    스택의 내부 함수 구현 문제. 단, 구현할 때 큐에서 사용하는 함수들만 사용해서 구현해야함
       
## 02. 계획
    top, empty는 그냥 기본대로 구현하면 될 것 같다. 큐의 poll을 사용해서 pop을 구현하려면
    push를 할 때부터 데이터가 거꾸로 들어가 있어야 할 것 같다.
    
## 03. 실행

## 04. 회고
        현업 개발을 하면서 queue를 쓸 일이 없어서(써야 하는데 쓰지 않은 경우가 있었을 지도...)
        queue에서 사용하는 함수들(peek, offer, poll)의 이름이 낯설게 느껴졌다.
        제출 결과는 속도는 준수했는데 메모리 사용량이 좋지 못했다.
        
        Runtime: 148 ms, faster than 80.00% of Kotlin online submissions for Implement Stack using Queues.
        Memory Usage: 34.9 MB, less than 5.00% of Kotlin online submissions for Implement Stack using Queues.
