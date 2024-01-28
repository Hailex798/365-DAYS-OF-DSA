<h2><a href="https://leetcode.com/problems/number-of-changing-keys/">3019. Number of Changing Keys</a></h2><h3>Easy</h3><hr><div><p>You are given a <strong>0-indexed </strong>string <code>s</code> typed by a user. Changing a key is defined as using a key different from the last used key. For example, <code>s = "ab"</code> has a change of a key while <code>s = "bBBb"</code> does not have any.</p>

<p>Return <em>the number of times the user had to change the key. </em></p>

<p><strong>Note: </strong>Modifiers like <code>shift</code> or <code><span class="wiseone-analysis-result wiseone-analysis-result-entity">caps lock</span></code> won't be counted in changing the key that is if a user typed the letter <code>'a'</code> and then the letter <code>'A'</code> then it will not be considered as a changing of key.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> s = "aAbBcC"
<strong>Output:</strong> 2
<strong>Explanation:</strong> 
From s[0] = 'a' to s[1] = 'A', there is no change of key as <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">caps lock</span> or shift is not counted.
From s[1] = 'A' to s[2] = 'b', there is a change of key.
From s[2] = 'b' to s[3] = 'B', there is no change of key as <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">caps lock</span> or shift is not counted.
From s[3] = 'B' to s[4] = 'c', there is a change of key.
From s[4] = 'c' to s[5] = 'C', there is no change of key as <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">caps lock</span> or shift is not counted.

</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> s = "AaAaAaaA"
<strong>Output:</strong> 0
<strong>Explanation:</strong> There is no change of key since only the letters 'a' and 'A' are<!-- notionvc: 8849fe75-f31e-41dc-a2e0-b7d33d8427d2 --> pressed which does not require change of key.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 100</code></li>
	<li><code>s</code> consists of only <span class="wiseone-analysis-result wiseone-analysis-result-entity">upper case</span> and <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">lower case</span> English letters.</li>
</ul>
</div>