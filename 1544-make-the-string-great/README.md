<h2><a href="https://leetcode.com/problems/make-the-string-great/">1544. Make The String Great</a></h2><h3>Easy</h3><hr><div><p><span class="wiseone-analysis-result wiseone-analysis-result-fact">Given a string <code>s</code> of lower and <span class="wiseone-analysis-result wiseone-analysis-result-entity">upper case</span> English letters.</span></p>

<p>A good string is a string which doesn't have <strong>two adjacent characters</strong> <code>s[i]</code> and <code>s[i + 1]</code> where:</p>

<ul>
	<li><code>0 &lt;= i &lt;= s.length - 2</code></li>
	<li><code>s[i]</code> is a <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">lower-case letter</span> and <code>s[i + 1]</code> is the same letter but in <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">upper-case</span> or <strong>vice-versa</strong>.</li>
</ul>

<p>To make the string good, you can choose <strong>two adjacent</strong> characters that make the string bad and remove them. You can keep doing this until the string becomes good.</p>

<p>Return <em>the string</em> after making it good. The answer is guaranteed to be unique under the given constraints.</p>

<p><strong>Notice</strong> that an <span class="wiseone-analysis-result wiseone-analysis-result-entity">empty string</span> is also good.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> s = "leEeetcode"
<strong>Output:</strong> "<span class="wiseone-analysis-result wiseone-analysis-result-entity">leetcode</span>"
<strong>Explanation:</strong> In the first step, either you choose i = 1 or i = 2, both will result "leEeetcode" to be reduced to "<span class="wiseone-analysis-result wiseone-analysis-result-entity">leetcode</span>".
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> s = "abBAcC"
<strong>Output:</strong> ""
<strong>Explanation:</strong> We have many possible scenarios, and all lead to the same answer. For example:
"abBAcC" --&gt; "aAcC" --&gt; "cC" --&gt; ""
"abBAcC" --&gt; "abBA" --&gt; "aA" --&gt; ""
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> s = "s"
<strong>Output:</strong> "s"
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 100</code></li>
	<li><code>s</code> contains only lower and <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">upper case</span> English letters.</li>
</ul>
</div>