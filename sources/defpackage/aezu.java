package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: aezu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aezu {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public final Context c;
    public final Executor d;
    public final aeri e;
    public final Object f = new Object();
    public aorr g;
    private final pdd h;

    public aezu(pdd pdd, Context context, Executor executor, aeri aeri) {
        this.h = pdd;
        this.c = context;
        this.d = executor;
        this.e = aeri;
    }

    public final aorr a() {
        aorr aorr = this.g;
        if (aorr != null) {
            return aorr;
        }
        aorr a2 = aopr.a(this.h.a(), (aoqb) new aezs(this), this.d);
        this.g = a2;
        return a2;
    }
}
