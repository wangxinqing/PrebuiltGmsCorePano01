package defpackage;

import android.os.Bundle;

/* renamed from: sym  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class sym implements Runnable {
    private final syn a;

    public sym(syn syn) {
        this.a = syn;
    }

    public final void run() {
        syn syn = this.a;
        syo syo = syn.b;
        long j = syn.a;
        syo.b.h();
        syo.b.E().j.a("Application going to the background");
        syo.b.f().a("auto", "_ab", j, new Bundle());
    }
}
