class Solution {
    public String encode(List<String> strs) {
        if (strs.isEmpty()) {
            return "";
        }

        var sb = new StringBuilder();
        for (var s : strs) {
            sb.append(s.length()).append("#").append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        if (str.isEmpty()) {
            return List.of();
        }

        List<String> result = new ArrayList<>();
        var i = 0;
        while (i < str.length()) {
            var j = str.indexOf("#", i);
            var length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            result.add(str.substring(i, i + length));
            i = i + length;
        }

        return result;
    }
}
