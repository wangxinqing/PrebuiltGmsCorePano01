package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: asea  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asea {
    public final long a;
    public int b;
    public int c;
    private final int d;

    public asea(long j, int i) {
        this.a = j;
        this.d = i;
    }

    public final String toString() {
        long j;
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[4];
        objArr[0] = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.ENGLISH).format(new Date(this.a));
        int i = this.b;
        if (i == 0) {
            j = System.currentTimeMillis() - this.a;
        } else {
            j = (long) i;
        }
        objArr[1] = Long.valueOf(j);
        objArr[2] = Integer.valueOf(this.c);
        objArr[3] = avay.a(this.d);
        return String.format(locale, "%s - %dms %d results with %s", objArr);
    }
}
