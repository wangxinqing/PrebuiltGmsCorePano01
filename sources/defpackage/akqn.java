package defpackage;

import java.util.Collection;

/* renamed from: akqn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akqn implements Runnable {
    final /* synthetic */ Collection a;
    final /* synthetic */ akqr b;
    final /* synthetic */ akpw c;

    public akqn(akqr akqr, Collection collection, akpw akpw) {
        this.b = akqr;
        this.a = collection;
        this.c = akpw;
    }

    public final void run() {
        akqr akqr = this.b;
        Collection collection = this.a;
        akqr.a.execute(new akqp(this.c, collection));
    }
}
