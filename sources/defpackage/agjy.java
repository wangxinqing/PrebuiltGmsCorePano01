package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: agjy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agjy implements aoqa {
    private final agka a;
    private final baql b;

    public agjy(agka agka, baql baql) {
        this.a = agka;
        this.b = baql;
    }

    public final aorr a() {
        agka agka = this.a;
        return aorl.a((Callable) new agjz(agka, this.b), (Executor) agka.a.a());
    }
}
