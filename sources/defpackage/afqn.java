package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: afqn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afqn {
    public static volatile boolean a = false;
    public final Context b;
    public final afsb c;
    public final afpf d;
    public final afpi e;
    public final afqr f;
    public final afqu g;
    public final afnt h;
    public final afmh i;
    public final afso j;
    public final afsg k;
    public final afsi l;
    public final amri m;
    public final Executor n;

    public afqn(Context context, afsb afsb, afqr afqr, afqu afqu, afpf afpf, afpi afpi, afnt afnt, afmh afmh, afso afso, afsg afsg, afsi afsi, amri amri, Executor executor) {
        this.b = context;
        this.c = afsb;
        this.f = afqr;
        this.g = afqu;
        this.d = afpf;
        this.e = afpi;
        this.h = afnt;
        this.i = afmh;
        this.j = afso;
        this.k = afsg;
        this.l = afsi;
        this.m = amri;
        this.n = executor;
    }

    public final aorr a() {
        if (a) {
            return aorl.a((Object) null);
        }
        return aopr.a(aopr.a(aopr.a(aopr.a((aorr) aoqw.c(aorl.a((Object) null)), (aoqb) new afpl(this, afst.a(this.b, "gms_icing_mdd_manager_metadata", this.m)), this.n), (aoqb) new afpw(this), this.n), (aoqb) new afqf(this), this.n), afqg.a, this.n);
    }

    public final aorr b() {
        return aopr.a(a(), (aoqb) new afqk(this), this.n);
    }

    public final aorr c() {
        return aopr.a(a(), (aoqb) new afpp(this), this.n);
    }

    public final aorr d() {
        return aopr.a(a(), (aoqb) new afpr(this), this.n);
    }

    public final aorr e() {
        return aopr.a(this.d.a(), (aoqb) new afpt(this), this.n);
    }

    public final aorr f() {
        return aopr.a(this.d.a(), (aoqb) new afpu(this), this.n);
    }

    public final aorr a(afkn afkn, afkr afkr) {
        Object[] objArr = {"MDDManager", afkn.b, afkr.c};
        return aopr.a(a(), (aoqb) new afql(this, afkn, afkr), this.n);
    }

    public final aorr a(aflf aflf, afkr afkr) {
        return aopr.a(a(), (aoqb) new afqh(this, afkr, aflf), this.n);
    }
}
