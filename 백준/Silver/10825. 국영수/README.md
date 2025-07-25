# 📁 [Silver IV] 국영수 - 10825 

[문제 링크](https://www.acmicpc.net/problem/10825) 

<hr>

### ✅ 접근 방법
위 문제는 Comparator 를 활용하여 compare 메소드를 오버라이딩 하여 구현한 후 해결하는 문제이다.
문제에서 주어진 조건에 맞게 조건식을 작성하고 compare 메소드를 완성하면 된다


### ✅ 알게된 내용
```
국어 점수 내림차순 (Integer.parseInt(o2[1]) - Integer.parseInt(o1[1]))

영어 점수 오름차순 (Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]))

수학 점수 내림차순 (Integer.parseInt(o2[3]) - Integer.parseInt(o1[3]))

이름 사전순 오름차순 (o1[0].compareTo(o2[0]))
```
<hr>

### ✅ 성능 요약

메모리: 67728 KB, 시간: 892 ms

### ✅ 분류

정렬

### ✅ 제출 일자

2025년 7월 22일 22:33:03

### ✅ 문제 설명

<p>도현이네 반 학생 N명의 이름과 국어, 영어, 수학 점수가 주어진다. 이때, 다음과 같은 조건으로 학생의 성적을 정렬하는 프로그램을 작성하시오.</p>

<ol>
	<li>국어 점수가 감소하는 순서로</li>
	<li>국어 점수가 같으면 영어 점수가 증가하는 순서로</li>
	<li>국어 점수와 영어 점수가 같으면 수학 점수가 감소하는 순서로</li>
	<li>모든 점수가 같으면 이름이 사전 순으로 증가하는 순서로 (단, 아스키 코드에서 대문자는 소문자보다 작으므로 사전순으로 앞에 온다.)</li>
</ol>

### ✅ 입력 

 <p>첫째 줄에 도현이네 반의 학생의 수 N (1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 한 줄에 하나씩 각 학생의 이름, 국어, 영어, 수학 점수가 공백으로 구분해 주어진다. 점수는 1보다 크거나 같고, 100보다 작거나 같은 자연수이다. 이름은 알파벳 대소문자로 이루어진 문자열이고, 길이는 10자리를 넘지 않는다.</p>

### ✅ 출력 

 <p>문제에 나와있는 정렬 기준으로 정렬한 후 첫째 줄부터 N개의 줄에 걸쳐 각 학생의 이름을 출력한다.</p>

