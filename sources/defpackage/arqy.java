package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: arqy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arqy {
    private static final SimpleDateFormat f = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
    public final long a;
    public arqp b = null;
    public arqp c = null;
    public arqp d = null;
    public boolean e = false;

    public arqy(long j) {
        this.a = j;
    }

    public static String a(long j) {
        return String.format("%s (%d)", new Object[]{f.format(new Date(j)), Long.valueOf(j)});
    }

    public final arrc a() {
        if (!this.e) {
            return arrv.a;
        }
        arrx arrx = new arrx();
        this.c.a(arrx);
        return arrx;
    }
}
