package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: ahdo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahdo implements ahel {
    public static final TimeUnit a = TimeUnit.MILLISECONDS;
    public final Context b;
    public final String c;
    public final Handler d;
    public final amsv e;
    public final TimeUnit f;
    public final aorv g;
    public final ahdg h;
    private final aoqb i;

    public ahdo(ahdl ahdl) {
        this.b = ahdl.a;
        this.i = ahdl.b;
        this.c = ahdl.c;
        this.d = ahdl.d;
        this.e = ahdl.e;
        this.f = ahdl.f;
        this.g = ahdl.g;
        this.h = ahdl.h;
    }

    public static ahdl a() {
        return new ahdl();
    }

    public final aorr a(aorr aorr) {
        aorr a2 = aopr.a(aorr, this.i, (Executor) aoqm.a);
        return aorl.c(aorr, a2).a((aoqa) new ahdh(this, aorr, a2), (Executor) aoqm.a);
    }

    public final aorr a(aorr aorr, Runnable runnable) {
        return aopr.a(aorr, (amqy) new ahdi(this, runnable), (Executor) aoqm.a);
    }
}
