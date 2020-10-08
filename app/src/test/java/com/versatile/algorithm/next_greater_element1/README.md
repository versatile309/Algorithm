## 01. 이해 
    nums1의 각각의 원소에 대해 nums2에서 오른쪽으로 가장 가까운 원소보다 큰 수의 배열을 반환.
    단, 원소보다 큰 수가 없을 경우 -1로 적용.
       
## 02. 계획
    각각의 nums1의 원소에 대해 nums2에서 해당 원소의 위치를 찾고 인덱스를 오른쪽으로 이동하면서 큰 수가
    있는지 탐색하는 방식으로 구현.
    
## 03. 실행

## 04. 회고
    문제의 난이도는 높지 않은 수준인데 조금 더 효율적으로 풀 수 있는 방법이 있는가에 대한 고민이 많았다.
    성능 결과를 보니 딱 중간정도로 푼 듯.
    
    Runtime: 196 ms, faster than 53.13% of Kotlin online submissions for Next Greater Element I.
    Memory Usage: 37.7 MB, less than 9.38% of Kotlin online submissions for Next Greater Element I.
