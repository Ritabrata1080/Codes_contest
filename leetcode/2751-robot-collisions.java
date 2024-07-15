package leetcode;

import java.util.*;
class Solution {
    class Robot{
        int position;
        int health;
        char direction;
        int index;
        int originalIndex;
        Robot(int p, int h, char d, int idx, int originalIdx){
            position = p;
            health = h;
            direction = d;
            index = idx;
            originalIndex = originalIdx;
        }
    }
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        List<Robot> list = new ArrayList<>();
        for(int i=0; i<positions.length; i++){
            list.add(new Robot(positions[i], healths[i], directions.charAt(i), 0, i));
        }
        Collections.sort(list, (a,b) -> a.position - b.position);
        for(int i=0; i<list.size(); i++){
            list.get(i).index = i;
        }
        Stack<Robot> stack = new Stack<>();
        for(int i=0; i<list.size(); i++){
            if(list.get(i).direction == 'R'){
                stack.push(list.get(i));
            }
            else{
                while(!stack.isEmpty() && list.get(i).health > 0){
                    if(list.get(i).health > stack.peek().health){
                        list.get(i).health -= 1;
                        list.get(stack.peek().index).health = 0;
                        stack.pop();
                    }
                    else if(list.get(i).health < stack.peek().health){
                        list.get(i).health = 0;
                        list.get(stack.peek().index).health -= 1;
                    }
                    else{
                        list.get(i).health = 0;
                        list.get(stack.peek().index).health = 0;
                        stack.pop();
                    }
                }
            }
        }
        Collections.sort(list, (a,b) -> a.originalIndex - b.originalIndex);
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            if(list.get(i).health > 0)
                res.add(list.get(i).health);
        }
        return res;
    }
}
