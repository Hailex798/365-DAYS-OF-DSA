<h2><a href="https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/">1171. Remove Zero Sum Consecutive Nodes from Linked List</a></h2><h3>Medium</h3><hr><div><p>Given the <code>head</code> of a <span class="wiseone-analysis-result wiseone-analysis-result-entity">linked list</span>, we repeatedly delete consecutive sequences of nodes that sum to <code>0</code> until there are no such sequences.</p>

<p>After doing so, return the head of the final <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">linked list</span>.&nbsp; You may return any such answer.</p>

<p>&nbsp;</p>
<p>(Note that in the examples below, all sequences are <span class="wiseone-analysis-result wiseone-analysis-result-entity">serializations</span> of <code>ListNode</code> objects.)</p>

<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> head = [1,2,-3,3,1]
<strong>Output:</strong> [3,1]
<strong>Note:</strong> The answer [1,2,1] would also be accepted.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> head = [1,2,3,-3,4]
<strong>Output:</strong> [1,2,4]
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> head = [1,2,3,-3,-2]
<strong>Output:</strong> [1]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The given <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">linked list</span> will contain between <code>1</code> and <code>1000</code> nodes.</li>
	<li>Each node in the <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">linked list</span> has <code>-1000 &lt;= node.val &lt;= 1000</code>.</li>
</ul>
</div>