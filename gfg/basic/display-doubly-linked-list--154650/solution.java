class Solution {
    public List<List<Integer>> displayList(Node head) {
        List<Integer> forward = new ArrayList<>();
        List<Integer> backward = new ArrayList<>();

        Node curr = head;
        Node last = null;

        while (curr != null) {
            forward.add(curr.data);
            last = curr;
            curr = curr.next;
        }

        curr = last;
        while (curr != null) {
            backward.add(curr.data);
            curr = curr.prev;
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(forward);
        result.add(backward);

        return result;
    }
}