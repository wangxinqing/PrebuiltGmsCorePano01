package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: x  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class x {
    final Executor a;
    public final as b;
    final AtomicBoolean c = new AtomicBoolean(true);
    final AtomicBoolean d = new AtomicBoolean(false);
    final Runnable e = new v(this);
    public ct f;
    public cf g;
    final /* synthetic */ cc h;
    final /* synthetic */ cs i;
    final /* synthetic */ Executor j;
    final /* synthetic */ Executor k;
    public final cg l;

    public x(Executor executor, cc ccVar, cs csVar, Executor executor2, Executor executor3) {
        this.h = ccVar;
        this.i = csVar;
        this.j = executor2;
        this.k = executor3;
        new w(this);
        this.a = executor;
        this.b = new u(this);
        this.l = new cg();
    }
}
