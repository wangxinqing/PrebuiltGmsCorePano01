package defpackage;

/* renamed from: ankn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ankn extends RuntimeException {
    public ankn(String str) {
        super(str);
    }

    public static ankn a(String str, String str2, int i) {
        return new ankn(b(str, str2, i, i + 1));
    }

    public static ankn b(String str, String str2, int i) {
        return new ankn(b(str, str2, i, -1));
    }

    public final synchronized Throwable fillInStackTrace() {
        return this;
    }

    public static ankn a(String str, String str2, int i, int i2) {
        return new ankn(b(str, str2, i, i2));
    }

    private static String b(String str, String str2, int i, int i2) {
        if (i2 < 0) {
            i2 = str2.length();
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(": ");
        if (i > 8) {
            sb.append("...");
            sb.append(str2, i - 5, i);
        } else {
            sb.append(str2, 0, i);
        }
        sb.append('[');
        sb.append(str2.substring(i, i2));
        sb.append(']');
        if (str2.length() - i2 > 8) {
            sb.append(str2, i2, i2 + 5);
            sb.append("...");
        } else {
            sb.append(str2, i2, str2.length());
        }
        return sb.toString();
    }
}
