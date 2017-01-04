/*
 * You are given a table, BST, containing two columns: N and P, where N represents the value of a node in BST, and P is the parent of N.
 * Write a query to find the node type of BST ordered by the value of the node. Output one of the following for each node:
 * 		Root: If node is root node.
 * 		Leaf: If node is leaf node.
 * 		Inner: If node is neither root nor leaf node.
 */

-- MySQL
-- ISNULL(X) = X IS NULL
SELECT N,	CASE 
						WHEN P IS NULL THEN 'Root'
						WHEN NOT EXISTS (SELECT N FROM BST WHERE P=T0.N) THEN 'Leaf'
						ELSE 'Inner'
					END T
FROM BST T0
ORDER BY N;

--Oracle
SELECT N,	CASE 
						WHEN P IS NULL THEN 'Root'
						WHEN NOT EXISTS (SELECT N FROM BST WHERE P=T0.N) THEN 'Leaf'
						ELSE 'Inner'
					END T
FROM BST T0
ORDER BY N;