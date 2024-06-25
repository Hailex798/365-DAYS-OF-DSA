<h2><a href="https://leetcode.com/problems/convert-bst-to-greater-tree/">538. Convert BST to Greater Tree</a></h2><h3>Medium</h3><hr><div><p>Given the <code>root</code> of a <span class="wiseone-analysis-result wiseone-analysis-result-entity">Binary Search</span> Tree (<span class="wiseone-analysis-result wiseone-analysis-result-entity">BST</span>), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus the sum of all keys greater than the original key in BST.</p>

<p><span class="wiseone-analysis-result wiseone-analysis-result-fact">As a reminder, a <em><span class="wiseone-analysis-result wiseone-analysis-result-entity">binary search</span> tree</em> is a tree that satisfies these constraints:</span></p>

<ul>
	<li><span class="wiseone-analysis-result wiseone-analysis-result-fact">The left <span class="wiseone-analysis-result wiseone-analysis-result-entity">subtree</span> of a node contains only nodes with keys <strong>less than</strong> the node's key.</span></li>
	<li><span class="wiseone-analysis-result wiseone-analysis-result-fact">The right <span class="wiseone-analysis-result wiseone-analysis-result-entity">subtree</span> of a node contains only nodes with keys <strong>greater than</strong> the node's key.</span></li>
	<li>Both the left and right <span class="wiseone-analysis-result wiseone-analysis-result-entity">subtrees</span> must also be <span class="wiseone-analysis-result wiseone-analysis-result-entity">binary search</span> trees.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2019/05/02/tree.png" style="width: 500px; height: 341px;">
<pre><strong>Input:</strong> root = [4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]
<strong>Output:</strong> [30,36,21,36,35,26,15,null,null,null,33,null,null,null,8]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> root = [0,null,1]
<strong>Output:</strong> [1,null,1]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the tree is in the range <code>[0, 10<sup>4</sup>]</code>.</li>
	<li><code>-10<sup>4</sup> &lt;= Node.val &lt;= 10<sup>4</sup></code></li>
	<li>All the values in the tree are <strong>unique</strong>.</li>
	<li><code>root</code> is guaranteed to be a valid <span class="wiseone-analysis-result wiseone-analysis-result-entity">binary search</span> tree.</li>
</ul>

<p>&nbsp;</p>
<p><strong>Note:</strong> This question is the same as 1038: <a href="https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/" target="_blank" previewlistener="true">https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/</a></p>
</div>