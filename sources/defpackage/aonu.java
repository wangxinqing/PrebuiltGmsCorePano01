package defpackage;

/* renamed from: aonu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aonu {
    static void a(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static void a(boolean z, String str, int i, int i2) {
        if (!z) {
            StringBuilder sb = new StringBuilder(str.length() + 36);
            sb.append("overflow: ");
            sb.append(str);
            sb.append("(");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            sb.append(")");
            throw new ArithmeticException(sb.toString());
        }
    }

    public static void a(boolean z, String str, long j, long j2) {
        if (!z) {
            StringBuilder sb = new StringBuilder(str.length() + 54);
            sb.append("overflow: ");
            sb.append(str);
            sb.append("(");
            sb.append(j);
            sb.append(", ");
            sb.append(j2);
            sb.append(")");
            throw new ArithmeticException(sb.toString());
        }
    }
}
