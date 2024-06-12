<h2><a href="https://leetcode.com/problems/compare-version-numbers/">165. Compare Version Numbers</a></h2><h3>Medium</h3><hr><div><p><span class="wiseone-analysis-result wiseone-analysis-result-fact">Given two <strong>version strings</strong>, <code><span class="wiseone-analysis-result wiseone-analysis-result-entity">version1</span></code> and <code><span class="wiseone-analysis-result wiseone-analysis-result-entity">version2</span></code>, compare them.</span> A version string consists of <strong>revisions</strong> separated by dots <code>'.'</code>. The <strong>value of the revision</strong> is its <strong>integer conversion</strong> ignoring <span class="wiseone-analysis-result wiseone-analysis-result-entity">leading zeros</span>.</p>

<p><span class="wiseone-analysis-result wiseone-analysis-result-fact">To compare version strings, compare their revision values in <strong><span class="wiseone-analysis-result wiseone-analysis-result-entity">left-to-right</span> order</strong>.</span> If one of the version strings has fewer revisions, treat the missing revision values as <code>0</code>.</p>

<p>Return the following:</p>

<ul>
	<li>If <code><span class="wiseone-analysis-result wiseone-analysis-result-entity">version1</span> &lt; <span class="wiseone-analysis-result wiseone-analysis-result-entity">version2</span></code>, return -1.</li>
	<li>If <code><span class="wiseone-analysis-result wiseone-analysis-result-entity">version1</span> &gt; <span class="wiseone-analysis-result wiseone-analysis-result-entity">version2</span></code>, return 1.</li>
	<li>Otherwise, return 0.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io"><span class="wiseone-analysis-result wiseone-analysis-result-entity">version1</span> = "1.2", <span class="wiseone-analysis-result wiseone-analysis-result-entity">version2</span> = "1.10"</span></p>

<p><strong>Output:</strong> <span class="example-io">-1</span></p>

<p><strong>Explanation:</strong></p>

<p><span class="wiseone-analysis-result wiseone-analysis-result-entity">version1</span>'s second revision is "2" and <span class="wiseone-analysis-result wiseone-analysis-result-entity">version2</span>'s second revision is "10": 2 &lt; 10, so <span class="wiseone-analysis-result wiseone-analysis-result-entity">version1</span> &lt; <span class="wiseone-analysis-result wiseone-analysis-result-entity">version2</span>.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io"><span class="wiseone-analysis-result wiseone-analysis-result-entity">version1</span> = "1.01", <span class="wiseone-analysis-result wiseone-analysis-result-entity">version2</span> = "1.001"</span></p>

<p><strong>Output:</strong> <span class="example-io">0</span></p>

<p><strong>Explanation:</strong></p>

<p>Ignoring <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">leading zeroes</span>, both "01" and "001" represent the same integer "1".</p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io"><span class="wiseone-analysis-result wiseone-analysis-result-entity">version1</span> = "1.0", <span class="wiseone-analysis-result wiseone-analysis-result-entity">version2</span> = "1.0.0.0"</span></p>

<p><strong>Output:</strong> <span class="example-io">0</span></p>

<p><strong>Explanation:</strong></p>

<p><span class="wiseone-analysis-result wiseone-analysis-result-entity">version1</span> has less revisions, which means every missing revision are treated as "0".</p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= <span class="wiseone-analysis-result wiseone-analysis-result-entity">version1</span>.length, <span class="wiseone-analysis-result wiseone-analysis-result-entity">version2</span>.length &lt;= 500</code></li>
	<li><code><span class="wiseone-analysis-result wiseone-analysis-result-entity">version1</span></code> and <code><span class="wiseone-analysis-result wiseone-analysis-result-entity">version2</span></code>&nbsp;only contain digits and <code>'.'</code>.</li>
	<li><code><span class="wiseone-analysis-result wiseone-analysis-result-entity">version1</span></code> and <code><span class="wiseone-analysis-result wiseone-analysis-result-entity">version2</span></code>&nbsp;<strong>are valid version numbers</strong>.</li>
	<li>All the given revisions in&nbsp;<code><span class="wiseone-analysis-result wiseone-analysis-result-entity">version1</span></code> and <code><span class="wiseone-analysis-result wiseone-analysis-result-entity">version2</span></code>&nbsp;can be stored in&nbsp;a&nbsp;<strong><span class="wiseone-analysis-result wiseone-analysis-result-entity">32-bit</span> integer</strong>.</li>
</ul>
</div>