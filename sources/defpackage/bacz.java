package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* renamed from: bacz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class bacz extends badf implements baef, bajv {
    public static final Logger q = Logger.getLogger(bacz.class.getName());
    private final bagl a;
    private baaf b;
    private volatile boolean c;
    public final balu r;
    public final boolean s;

    protected bacz(balw balw, balm balm, balu balu, baaf baaf, azxh azxh) {
        amrl.a((Object) baaf, (Object) "headers");
        amrl.a((Object) balu, (Object) "transportTracer");
        this.r = balu;
        this.s = bagt.a(azxh);
        this.a = new bajw(this, balw, balm);
        this.b = baaf;
    }

    public final void a(int i) {
        boolean z;
        bajw bajw = (bajw) this.a;
        if (bajw.a == -1) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z, (Object) "max size already set");
        bajw.a = i;
    }

    /* access modifiers changed from: protected */
    public abstract bacx b();

    public final void b(int i) {
        ((bajs) d().j).b = i;
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ bade c() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public abstract bade d();

    /* access modifiers changed from: protected */
    public final bagl e() {
        return this.a;
    }

    public final void f() {
        if (!d().r) {
            d().r = true;
            e().c();
        }
    }

    public final void b(babj babj) {
        amrl.a(!babj.a(), (Object) "Should not cancel with OK status");
        this.c = true;
        b().a(babj);
    }

    public final void c(int i) {
        b().a(i);
    }

    public final void a(azyf azyf) {
        this.b.c(bagt.a);
        this.b.a(bagt.a, (Object) Long.valueOf(Math.max(0, azyf.a(TimeUnit.NANOSECONDS))));
    }

    public final void a(azyi azyi) {
        boolean z;
        bade d = d();
        if (d.p == null) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z, (Object) "Already called start");
        amrl.a((Object) azyi, (Object) "decompressorRegistry");
        d.q = azyi;
    }

    public final void a(baeh baeh) {
        boolean z;
        bade d = d();
        if (d.p == null) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z, (Object) "Already called setListener");
        amrl.a((Object) baeh, (Object) "listener");
        d.p = baeh;
        b().a(this.b);
        this.b = null;
    }

    public final void a(bahb bahb) {
        bahb.a("remote_addr", a().a(azyn.a));
    }

    public final void a(balv balv, boolean z, boolean z2, int i) {
        boolean z3 = true;
        if (balv == null && !z) {
            z3 = false;
        }
        amrl.a(z3, (Object) "null frame before EOS");
        b().a(balv, z, z2, i);
    }
}
