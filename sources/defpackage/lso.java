package defpackage;

/* renamed from: lso  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lso {
    public static String a(String str) {
        boolean z;
        int i;
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < str.length()) {
            int codePointAt = str.codePointAt(i2);
            int type = Character.getType(codePointAt);
            if (type == 15 || type == 16 || type == 13 || type == 14) {
                z = false;
            } else {
                z = type != 12;
            }
            if (!z) {
                i = 32;
            } else {
                i = codePointAt;
            }
            sb.appendCodePoint(i);
            i2 += Character.charCount(codePointAt);
        }
        return sb.toString();
    }

    public static String b(String str) {
        String replace = str.replace("\\", "\\\\").replace("'", "\\'");
        StringBuilder sb = new StringBuilder(String.valueOf(replace).length() + 2);
        sb.append("'");
        sb.append(replace);
        sb.append("'");
        return sb.toString();
    }
}
