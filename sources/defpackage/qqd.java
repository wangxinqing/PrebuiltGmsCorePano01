package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: qqd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qqd {
    public static final ScheduledExecutorService a = jfm.a(1, 10);
    public static final Executor b = jfm.a(10);
    public final Context c;
    public final qof d;
    public final qrd e;

    public qqd(Context context, qof qof, qrd qrd) {
        this.c = context;
        this.d = qof;
        this.e = qrd;
    }
}
