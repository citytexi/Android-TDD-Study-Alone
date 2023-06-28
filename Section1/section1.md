# Android TDD masterclass

- [https://www.udemy.com/course/android-11-tdd-masterclass](https://www.udemy.com/course/android-11-tdd-masterclass/learn/lecture/22925070#overview)
- 개인 공부용

---

## Test Driven Development Explained

---

### What is TDD?

- It’s software development methodology in which test drive the development of the application
    - TDD란 애플리케이션 개발을 테스트로 구동하는 소프트웨어 개발 방법론입니다.

### Advantages of TDD

1. Great understanding of the product requirements
    1. 제품 요구 사항에 대한 깊은 이해
2. Faster Development - 더 빠른 개발
    1. 디버그에 소요되는 시간을 줄일 수 있습니다.
3. Better Design: High Cohesion, Low coupling
    1. 더 나은 설계: 높은 응집력, 낮은 결합
4. Less Defects
    1. 더 적은 결함
5. Promotes Quality Culture
    1. 양질의 품질을 촉진합니다.
6. Regression Test Suite
7. Documentation
    1. 문서화

### Platform Independent

- TDD methodology can be applied regardless of programming language, domain or framework.
    - TDD 방법론은 프로그래밍 언어, 도메인 또는 프레임워크에 관계없이 적용할 수 있습니다.

### TDD - Development Lifecycle

1. we need to write a unit test that intends to validate a new functionality
    1. 새로운 기능을 검증하는 단위 테스트를 작성해야 합니다.
2. we need to write the minium software solution in order to make our test bus
    1. 테스트를 통과시키기 위해 최소한의 소프트웨어 솔루션을 작성해야 합니다.
3. refactor step is often neglected, but it is essential as it eliminates possible code duplications or any other code smells
    1. 리팩터링 단계는 종종 무시되지만, 가능한 코드 중복이나 기타 코드 문제점을 제거하는 데 필수적입니다.

### The 3 Rules of TDD

1. You may not write production code until you have written a failing unit test
    1. 실패하는 단위 테스트를 작성하기 전까지는 production code를 작성할 수 없습니다.
2. You may not write more of a unit test than is sufficient to fail, and not compiling is failing
    1. 실패하는 단위 테스트를 실행하기에 충분한 unit test만 작성할 수 있습니다.
3. You may not write more production code than is sufficient to pass the currently failing test
    1. 현재 실패하는 테스트를 통과시키기에 충분한 production code만 작성할 수 있습니다.

### What is a Test?

- It’s a block of code that verifies that another block of code works properly by comparing the outcome with the expected outcome.
    - 테스트는 다른 블록의 코드가 올바르게 작동하는지 확인하기 위해 결과를 예상 결과와 비교하는 코드 블록입니다.

### Test Example

```kotlin
fun addition(a: Int, b: Int): Int {
		return a + b
}

// addition(a = 1, b = 2) == 1 + 2 
// = 3
```

### Test Preconditions

- Fast
    - 빠르다
- Independent
    - 독립적이다
- Repeatable
    - 반복 가능
- Self-Validating
    - 자체 검증
- Timely

### Types Of Automated Tests

- Unit
    - Test a very small block of code, usually a method
- Integration
    - Software modules are combined and tested as a group
- End to End
    - Testing an application’s workflow form beginning to end Simulate User
    

### Google Testing Pyramid

- Unit → 70%
    - Easy to Write
    - Run Fast
    - Indicate the exact error
- Integration → 20%
- End to End → 10%
    - Hard to write
    - Slow to run
    - Do not indicate the exact problem
    - Great for regression testing
    

### Types Of TDD

- Classicist
    - Kent Beck, Uncle Bob, Ron Jeffries
    - No use of Mocks
    - Tests only the end results (state)
    - Emerging Design
    - Black box Testing
- Outside In
    - Steve Freeman, Sandi Metz, J.B Rainsberger
    - Vast use of Mocks
    - Testing the interactions
    - Upfront Design
    - White Box Testing

### Classicists VS Outside In

- Classicist
    - Pros
        - Faster Refactoring
    - Cons
        - Can be hard to identify what the issue is
        - Redundant coverage
- Outside In
    - Pros
        - Easier to track down issues
        - Upfront Design
        - Enforces Architectural Design
    - Cons
        - Refactoring the classes public API will require extra work on tests
        - Might produce false positives

### The true value of Tests

- Tracking down and correcting defects

### Outside-In TDD - Lifecycle

1. Failing Acceptance Test
2. TDD - Development Lifecycle