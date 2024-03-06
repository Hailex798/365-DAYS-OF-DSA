<h2><a href="https://leetcode.com/problems/linked-list-cycle/">141. Linked List Cycle</a></h2><h3>Easy</h3><hr><div><p>Given <code>head</code>, the head of a <span class="wiseone-analysis-result wiseone-analysis-result-entity">linked list</span>, determine if the <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">linked list</span> has a cycle in it.</p>

<p><span class="wiseone-analysis-result wiseone-analysis-result-fact">There is a cycle in a <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">linked list</span> if there is some node in the list that can be reached again by continuously following the&nbsp;<code>next</code>&nbsp;pointer.</span> Internally, <code>pos</code>&nbsp;is used to denote the index of the node that&nbsp;tail's&nbsp;<code>next</code>&nbsp;pointer is connected to.&nbsp;<strong>Note that&nbsp;<code>pos</code>&nbsp;is not passed as a parameter</strong>.</p>

<p><span class="wiseone-analysis-result wiseone-analysis-result-fact">Return&nbsp;<code>true</code><em> if there is a cycle in the <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">linked list</span></em>.</span> Otherwise, return <code>false</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist.png" style="width: 300px; height: 97px; margin-top: 8px; margin-bottom: 8px;">
<pre><strong>Input:</strong> head = [3,2,0,-4], pos = 1
<strong>Output:</strong> true
<strong>Explanation:</strong> There is a cycle in the <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">linked list</span>, where the tail connects to the 1st node (0-indexed).
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test2.png" style="width: 141px; height: 74px;">
<pre><strong>Input:</strong> head = [1,2], pos = 0
<strong>Output:</strong> true
<strong>Explanation:</strong> There is a cycle in the <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">linked list</span>, where the tail connects to the 0th node.
</pre>

<p><strong class="example">Example 3:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test3.png" style="width: 45px; height: 45px;">
<pre><strong>Input:</strong> head = [1], pos = -1
<strong>Output:</strong> false
<strong>Explanation:</strong> There is no cycle in the <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">linked list</span>.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of the nodes in the list is in the range <code>[0, 10<sup>4</sup>]</code>.</li>
	<li><code>-10<sup>5</sup> &lt;= Node.val &lt;= 10<sup>5</sup></code></li>
	<li><code>pos</code> is <code>-1</code> or a <strong>valid index</strong> in the <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">linked-list</span>.</li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong> Can you solve it using <code><span class="wiseone-analysis-result wiseone-analysis-result-entity">O(1)</span></code> (i.e. constant) memory?</p>
</div>