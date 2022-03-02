package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: cny  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cny {
    public final Context a;
    public final coh b;
    public final coe c;
    public final cpo d;
    public final cnb e;
    private final Executor f;

    public cny(Context context, cnb cnb, coh coh, coe coe, Executor executor, cpo cpo) {
        this.a = context;
        this.e = cnb;
        this.b = coh;
        this.c = coe;
        this.f = executor;
        this.d = cpo;
    }

    public final void a(cmm cmm, int i, Runnable runnable) {
        this.f.execute(new cnt(this, cmm, i, runnable));
    }
}
