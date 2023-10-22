function sortArrayDescending(array) {
    return array.sort((a, b) => b - a);
}
let array = [5, 2, 8, 1, 3];
let sorted = sortArrayDescending(array);
console.log(sorted);
