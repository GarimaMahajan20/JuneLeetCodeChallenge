class Solution {
    private boolean isValidHexa(char a) {
        return (a >= 'a' && a <= 'f') || (a >= 'A' && a <= 'F');
    }
    private boolean isValidIPV4(String IP) {
        String[] a = IP.split("\\.");
        if (a.length != 4) return false;
        for (String p : a) {
            if (p.isEmpty() || p.length() > 1 && p.charAt(0) == '0' || p.length() > 3) return false;
            for (char c : p.toCharArray()) if (!Character.isDigit(c)) return false;
            int value = Integer.parseInt(p);
            if (value < 0 || value > 255) return false;
        }
        
        return IP.charAt(IP.length() - 1) != '.';
    }
    private boolean isValidIPV6(String IP) {
        String[] a = IP.split(":");
        if (a.length != 8) return false;
        for(String p : a) {
            if (p.length() > 4 || p.isEmpty()) return false;
            for (char c : p.toCharArray()) if (!Character.isDigit(c) && !isValidHexa(c)) return false;
        }
        return IP.charAt(IP.length() - 1) != ':';
    }
    public String validIPAddress(String IP) {
        return IP.contains(".") ? isValidIPV4(IP) ? "IPv4" : "Neither" : isValidIPV6(IP) ? "IPv6" : "Neither";
    }
}
