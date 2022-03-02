package defpackage;

/* renamed from: ampw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ampw {
    public static char a(char c) {
        return b(c) ? (char) (c ^ ' ') : c;
    }

    public static String b(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (!b(str.charAt(i))) {
                i++;
            } else {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (b(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
        }
        return str;
    }

    public static boolean b(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean c(char c) {
        return c >= 'A' && c <= 'Z';
    }

    private static int d(char c) {
        return (char) ((c | ' ') - 'a');
    }

    public static String a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (!c(str.charAt(i))) {
                i++;
            } else {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
        }
        return str;
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        int d;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence2.charAt(i);
            if (charAt != charAt2 && ((d = d(charAt)) >= 26 || d != d(charAt2))) {
                return false;
            }
        }
        return true;
    }
}
