<h2><a href="https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/">2816. Double a Number Represented as a Linked List</a></h2><h3>Medium</h3><hr><div><p>You are given the <code>head</code> of a <strong><span class="wiseone-analysis-result wiseone-analysis-result-entity">non-empty</span></strong> <span class="wiseone-analysis-result wiseone-analysis-result-entity">linked list</span> representing a <span class="wiseone-analysis-result wiseone-analysis-result-entity">non-negative integer</span> without leading zeroes.</p>

<p>Return <em>the </em><code>head</code><em> of the <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">linked list</span> after <strong>doubling</strong> it</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2023/05/28/example.png" style="width: 401px; height: 81px;">
<pre><strong>Input:</strong> head = [1,8,9]
<strong>Output:</strong> [3,7,8]
<strong>Explanation:</strong> The figure above corresponds to the given <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">linked list</span> which represents the number 189. Hence, the returned <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">linked list</span> represents the number 189 * 2 = 378.
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2023/05/28/example2.png" style="width: 401px; height: 81px;">
<pre><strong>Input:</strong> head = [9,9,9]
<strong>Output:</strong> [1,9,9,8]
<strong>Explanation:</strong> The figure above corresponds to the given <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">linked list</span> which represents the number 999. Hence, the returned <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">linked list</span> reprersents the number 999 * 2 = 1998. 
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the list is in the range <code>[1, 10<sup>4</sup>]</code></li>
	<li><font face="monospace"><code>0 &lt;= Node.val &lt;= 9</code></font></li>
	<li>The input is generated such that the list represents a number that does not have leading zeros, except the number <code>0</code> itself.</li>
</ul>
</div>