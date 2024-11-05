<h2><a href="https://leetcode.com/problems/circular-sentence/">2490. Circular Sentence</a></h2><h3>Easy</h3><hr><div><p>A <strong>sentence</strong> is a list of words that are separated by a<strong> single</strong> space with no leading or trailing spaces.</p>

<ul>
	<li>For example, <code>"Hello World"</code>, <code>"HELLO"</code>, <code>"hello world hello world"</code> are all sentences.</li>
</ul>

<p><span class="wiseone-analysis-result wiseone-analysis-result-fact">Words consist of <strong>only</strong> <span class="wiseone-analysis-result wiseone-analysis-result-entity">uppercase and lowercase</span> English letters.</span> <span class="wiseone-analysis-result wiseone-analysis-result-fact"><span class="wiseone-analysis-result wiseone-analysis-result-entity">Uppercase and lowercase</span> English letters are considered different.</span></p>

<p>A sentence is <strong>circular </strong>if:</p>

<ul>
	<li>The last character of a word is equal to the first character of the next word.</li>
	<li>The last character of the last word is equal to the first character of the first word.</li>
</ul>

<p>For example, <code>"<span class="wiseone-analysis-result wiseone-analysis-result-entity"><span class="wiseone-analysis-result wiseone-analysis-result-entity">leetcode</span></span> exercises sound delightful"</code>, <code>"eetcode"</code>, <code>"<span class="wiseone-analysis-result wiseone-analysis-result-entity">leetcode</span> eats soul" </code>are all circular sentences. However, <code>"<span class="wiseone-analysis-result wiseone-analysis-result-entity"><span class="wiseone-analysis-result wiseone-analysis-result-entity">Leetcode</span></span> is cool"</code>, <code>"happy <span class="wiseone-analysis-result wiseone-analysis-result-entity"><span class="wiseone-analysis-result wiseone-analysis-result-entity">Leetcode</span></span>"</code>, <code>"<span class="wiseone-analysis-result wiseone-analysis-result-entity"><span class="wiseone-analysis-result wiseone-analysis-result-entity">Leetcode</span></span>"</code> and <code>"I like <span class="wiseone-analysis-result wiseone-analysis-result-entity">Leetcode</span>"</code> are <strong>not</strong> circular sentences.</p>

<p>Given a string <code>sentence</code>, return <code>true</code><em> if it is circular</em>. Otherwise, return <code>false</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> sentence = "<span class="wiseone-analysis-result wiseone-analysis-result-entity">leetcode</span> exercises sound delightful"
<strong>Output:</strong> true
<strong>Explanation:</strong> The words in sentence are ["<span class="wiseone-analysis-result wiseone-analysis-result-entity">leetcode</span>", "exercises", "sound", "delightful"].
- leetcod<u>e</u>'s&nbsp;last character is equal to <u>e</u>xercises's first character.
- exercise<u>s</u>'s&nbsp;last character is equal to <u>s</u>ound's first character.
- soun<u>d</u>'s&nbsp;last character is equal to <u>d</u>elightful's first character.
- delightfu<u>l</u>'s&nbsp;last character is equal to <u>l</u>eetcode's first character.
The sentence is circular.</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> sentence = "eetcode"
<strong>Output:</strong> true
<strong>Explanation:</strong> The words in sentence are ["eetcode"].
- eetcod<u>e</u>'s&nbsp;last character is equal to <u>e</u>etcode's first character.
The sentence is circular.</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> sentence = "Leetcode is cool"
<strong>Output:</strong> false
<strong>Explanation:</strong> The words in sentence are ["Leetcode", "is", "cool"].
- Leetcod<u>e</u>'s&nbsp;last character is <strong>not</strong> equal to <u>i</u>s's first character.
The sentence is <strong>not</strong> circular.</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= sentence.length &lt;= 500</code></li>
	<li><code>sentence</code> consist of only lowercase and <span class="wiseone-analysis-result wiseone-analysis-result-entity">uppercase</span> English letters and spaces.</li>
	<li>The words in <code>sentence</code> are separated by a single space.</li>
	<li>There are no leading or trailing spaces.</li>
</ul>
</div>