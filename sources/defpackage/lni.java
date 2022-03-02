package defpackage;

import android.content.Context;
import java.util.logging.Logger;

/* renamed from: lni  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lni {
    private static lni f;
    public final lkm a;
    public final lkg b = new lkg();
    public final ljy c;
    public final lkr d;
    public final ljr e;
    private final Context g;

    private lni(Context context, lsm lsm) {
        this.g = context;
        this.a = new lkm(this.g, lsm.c, lsm.d);
        this.c = new ljy(this.g, this.a, lsm.G);
        Context context2 = this.g;
        lkg lkg = this.b;
        lkm lkm = this.a;
        kkf kkf = lsm.d;
        Logger logger = alnw.a;
        this.d = new lkr(context2, lkg, lkm, kkf, lsm.w, lsm.G);
        this.e = new ljr();
    }

    public static lni a(Context context, lsm lsm) {
        lni lni;
        Context applicationContext = context.getApplicationContext();
        synchronized (lni.class) {
            if (f == null) {
                f = new lni(applicationContext, lsm);
            } else if (f.g != applicationContext) {
                throw new IllegalStateException("attempted to initialize Singletons multiple times with different application context instances.");
            }
            lni = f;
        }
        return lni;
    }
}
