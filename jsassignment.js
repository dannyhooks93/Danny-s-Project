function sum(a) {
    return function ins(b)  {
        return a + b
    }
}

console.log(sum(1)(2))