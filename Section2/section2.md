# Section2

### What problems do coroutines solve?

- Long running task
    - Long running task are that take too long to block the main thread
- Main Safety
    - Main Safety allows you to ensure that any suspend function can be called from the main thread

### Long running task solution

- Callbacks
- Rx
- Coroutines

### Coroutines Philosophy

- Coroutines manage to handle async code by applying callbacks logic in a way that it resembles synchronous code.

### Suspend

- Pauses the execution of the current coroutine, saving all local variables

### Resume

- Continue a suspended coroutine from the place it was paused

### Main-Safety with Coroutines

- Coroutines will run on the main thread, and suspend does not mean background
- Dispatchers
    - Dispatchers.Main
    - Dispatchers.IO
    - Dispatchers.Default
    - Room & Retrofit manage their own threads and do not require explicit main safety in your code when used with Kotlin coroutines

### Structured Concurrency

- Structured concurrency is a combination of language features and best practices that, when followed, help you keep track of all work running in coroutines
- Cancel Work
    - When it is no longer needed
- Keep Track
    - Of work while it’s running
- Signal Errors
    - When a coroutine fails
- Coroutine Scope
    - keeps track of your coroutines, even coroutines that are suspended and it can cancel all of the coroutines started in it
- Starting new Coroutines
    - launch
        - builder will start a new coroutine that is “fire and forget” - that means it won’t return the result to the caller
    - async
        - builder will start a new coroutine, and it allows you to return a result with a suspend function called await

### Kotlin flow

- Is an implementation of the Reactive Stream specification made on top of coroutines for Kotlin.

### Advantages of Kotlin flow

- Simpler API
- Structured Concurrency
- Backpressure Handling
- Suspending Execution
- Nullability