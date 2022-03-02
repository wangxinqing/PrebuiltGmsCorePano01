package defpackage;

import java.util.Locale;

/* renamed from: sls  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class sls {
    public static sls a(slq slq, slr slr) {
        return new slk(slq, slr);
    }

    public abstract slq a();

    public abstract slr b();

    public final String c() {
        Locale locale = Locale.ROOT;
        slr b = b();
        slr slr = slr.PERIODIC;
        return String.format(locale, "%d%s%s", new Object[]{Integer.valueOf(a().d), '_', b.c});
    }

    public final String toString() {
        int i = a().d;
        String valueOf = String.valueOf(b());
        String c = c();
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15 + String.valueOf(c).length());
        sb.append(i);
        sb.append(" ");
        sb.append(valueOf);
        sb.append(" (");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
}
