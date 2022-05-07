package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SolutionPlayMergeGame {
    public class Tile implements Cloneable {
        public int Color;
        public int Size;
        @Override
        protected Object clone() throws CloneNotSupportedException {
            var newTile = new Tile();
            newTile.Color = this.Color;
            newTile.Size = this.Size;
            return newTile;
        }
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + getEnclosingInstance().hashCode();
            result = prime * result + Color;
            result = prime * result + Size;
            return result;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Tile other = (Tile) obj;
            if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
                return false;
            if (Color != other.Color)
                return false;
            if (Size != other.Size)
                return false;
            return true;
        }
        private SolutionPlayMergeGame getEnclosingInstance() {
            return SolutionPlayMergeGame.this;
        }
    }

    public int whoMinMergeGame(List<Stack<Integer>> tiles) {
        var t = new Tile();
        int hash = t.hashCode();
        List<Integer> temp = new ArrayList<>();
        
        List<Integer[]> mergeIdx = new ArrayList<>();
 
        for (int i = 0; i < tiles.size() - 1; i++) {
            for (int j = i+1; j < tiles.size(); j++) {
                if ( tiles.get(i).peek() == tiles.get(j).peek() || tiles.get(i).size() == tiles.get(j).size()) {
                    // merge i, j
                    mergeIdx.add(new Integer[]{i,j});
                    System.out.println("merge i:" + i + " j:" + j);
                    List<Stack<Integer>> merge = new ArrayList<>();
                    var stack = new Stack<Integer>();
                    stack.addAll(tiles.get(i));
                    stack.addAll(tiles.get(j));
                    merge.add(stack);
                    for (int k = 0; k < tiles.size(); k++) {
                        if ( k != i && k != j ) {
                            merge.add(tiles.get(k));
                        }
                    }
                }    
            }
        }
        return 1;
    }
}
