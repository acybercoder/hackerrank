package hackerrank.java.advanced.java_visitor_pattern;


import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.ArrayList;
import java.util.Scanner;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}


class SumInLeavesVisitor extends TreeVis {
	private int result = 0;

	public int getResult() {
		//implement this
	    return result;
	}

	public void visitNode(TreeNode node) {
		//implement this
	}

	public void visitLeaf(TreeLeaf leaf) {
		//implement this
	    result += leaf.getValue();
	}
}

class ProductOfRedNodesVisitor extends TreeVis {
	private long result = 1;
	private final int M = 1000000007;

	public int getResult() {
		//implement this
	    return (int) result;
	}

	public void visitNode(TreeNode node) {
		//implement this
	    if(node.getColor().equals(Color.RED)) {
	        result = (result * node.getValue()) % M;
	    }
	}

	public void visitLeaf(TreeLeaf leaf) {
		//implement this
	    if(leaf.getColor().equals(Color.RED)) {
	        result = (result * leaf.getValue()) % M;
	    }
	}
}

class FancyVisitor extends TreeVis {
	private int evenDepthNonLeavesSum = 0;
	private int greenLeavesSum = 0;

	public int getResult() {
		//implement this
	    return Math.abs(evenDepthNonLeavesSum - greenLeavesSum);
	}

	public void visitNode(TreeNode node) {
		//implement this
	    if(node.getDepth() % 2 == 0)
	        evenDepthNonLeavesSum += node.getValue();
	}

	public void visitLeaf(TreeLeaf leaf) {
		//implement this
	    if(leaf.getColor().equals(Color.GREEN))
	        greenLeavesSum += leaf.getValue();
	}
}

public class Solution {
  
	private static int[] values;
    private static Color[] colors;
    private static Map<Integer, Set<Integer>> nodeMatrix = new TreeMap<>();
    private static Set<Integer> visitedParents = new HashSet<>();

    public static Tree solve() {
        Scanner in = new Scanner(System.in);
        int numberOfNodes = in.nextInt();
        values = new int[numberOfNodes];
        colors = new Color[numberOfNodes];
        for (int i = 0; i < numberOfNodes; i++) {
            values[i] = in.nextInt();
        }
        for (int i = 0; i < numberOfNodes; i++) {
            byte colorByte = in.nextByte();
            colors[i] = colorByte == 1 ? Color.GREEN : Color.RED;
        }
        for (int i = 0; i < numberOfNodes - 1; i++) {
            int from = in.nextInt()-1;
            int to = in.nextInt()-1;

            if (!nodeMatrix.containsKey(from)) {
                nodeMatrix.put(from, new HashSet<Integer>());
            }
            nodeMatrix.get(from).add(to);

            if (!nodeMatrix.containsKey(to)) {
                nodeMatrix.put(to, new HashSet<Integer>());
            }
            nodeMatrix.get(to).add(from);
        }
        in.close();
        TreeNode root = new TreeNode(values[0], colors[0], 0);
        return buildTree(root, 0);
    }

    private static TreeNode buildTree(TreeNode parent, int parentIndex) {
        Queue<Integer> indexes = new LinkedList<>();
        indexes.addAll(nodeMatrix.get(parentIndex));

        visitedParents.add(parentIndex);

        while (!indexes.isEmpty()) {
            Integer index = indexes.poll();
            if (visitedParents.contains(index))
                continue;
            if (nodeMatrix.get(index).size() == 1) {
                parent.addChild(new TreeLeaf(values[index], colors[index], parent.getDepth() + 1));
            } else {
                parent.addChild(buildTree(new TreeNode(values[index], colors[index], parent.getDepth() + 1), index));
            }
        }
        return parent;
    }
    

    public static void main(String[] args) {
      	Tree root = solve();
		SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
      	ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
      	FancyVisitor vis3 = new FancyVisitor();

      	root.accept(vis1);
      	root.accept(vis2);
      	root.accept(vis3);

      	int res1 = vis1.getResult();
      	int res2 = vis2.getResult();
      	int res3 = vis3.getResult();

      	System.out.println(res1);
     	System.out.println(res2);
    	System.out.println(res3);
	}
}