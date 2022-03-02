package defpackage;

import android.content.Context;
import java.util.Random;

/* renamed from: wjw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wjw {
    public static final jjg a = jjg.a(iyc.GUNS);
    private static wjw d;
    public final Context b;
    public final Random c = new Random(System.currentTimeMillis());

    private wjw(Context context) {
        this.b = context;
    }

    public static synchronized wjw a(Context context) {
        wjw wjw;
        synchronized (wjw.class) {
            if (d == null) {
                d = new wjw(context);
            }
            wjw = d;
        }
        return wjw;
    }
}
