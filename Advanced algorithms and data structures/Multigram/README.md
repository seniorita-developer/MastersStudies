A multigram is a word that consists of concatenating two or more words that are all mutually anagrams. The first of these words is called the root of the multigram. For instance, the word bbabab is a multigram with the root bba because it consists of anagrams bba and bab.

Algorithm (implemented in C++) determines whether given word is a multigram and determines its root in case it is. If there are multiple possible roots of the multigram, output the shortest.

Input

The only line of input contains a word of length at most 100 000 lowercase English characters.
Output

If the given word is not a multigram, output -1. Otherwise, output the shortest root of the given word in one line.


Example

input: bbabab

output: bba


