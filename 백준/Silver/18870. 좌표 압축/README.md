# 📁 [Silver II] 좌표 압축 - 18870 

[문제 링크](https://www.acmicpc.net/problem/18870) 

<hr>

### ✅ 접근 방법
이분 탐색과 JAVA 에서 제공되는 HashMap 을 활용하여 해결할 수 있다. 이번 풀이는 이분탐색 구현으로 진행하였다.
사용자로부터 입력받은 배열과 이를 복제한 배열 arr2 를 만들고 이를 정렬한 뒤, 여기서 원하는 값을 이분탐색으로 찾으면된다.

### ✅ 알게된 내용

``` arr2 = Arrays.stream(arr2).distinct().sorted().toArray(); ``` 
<br>


**Arrays.stream(arr2) :** 배열을 스트림으로 변환
스트림은 Java 8 이상에서 제공하는 기능으로, 스트림으로 변환하여 이후에 다양한 연산을 할 수 있다.<br>
**distinct() : **스트림의 중복된 요소를 제거하는 메소드
배열 arr2에 중복된 값이 있다면, 이 메소드는 중복을 제거하여 고유한 값만 남긴다.

<br>

**sorted() :**  스트림의 요소들을 오름차순으로 정렬

<br>

**toArray() :** toArray()는 스트림을 다시 배열로 변환

<hr>

### ✅ 성능 요약

메모리: 237172 KB, 시간: 1804 ms

### ✅ 분류

정렬, 값 / 좌표 압축

### ✅ 제출 일자

2025년 7월 24일 13:05:45

### ✅ 문제 설명

<p>수직선 위에 N개의 좌표 X<sub>1</sub>, X<sub>2</sub>, ..., X<sub>N</sub>이 있다. 이 좌표에 좌표 압축을 적용하려고 한다.</p>

<p>X<sub>i</sub>를 좌표 압축한 결과 X'<sub>i</sub>의 값은 X<sub>i</sub> > X<sub>j</sub>를 만족하는 서로 다른 좌표 X<sub>j</sub>의 개수와 같아야 한다.</p>

<p>X<sub>1</sub>, X<sub>2</sub>, ..., X<sub>N</sub>에 좌표 압축을 적용한 결과 X'<sub>1</sub>, X'<sub>2</sub>, ..., X'<sub>N</sub>를 출력해보자.</p>

### ✅ 입력 

 <p>첫째 줄에 N이 주어진다.</p>

<p>둘째 줄에는 공백 한 칸으로 구분된 X<sub>1</sub>, X<sub>2</sub>, ..., X<sub>N</sub>이 주어진다.</p>

### ✅ 출력 

 <p>첫째 줄에 X'<sub>1</sub>, X'<sub>2</sub>, ..., X'<sub>N</sub>을 공백 한 칸으로 구분해서 출력한다.</p>

