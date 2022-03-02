package defpackage;

import java.util.Collection;

/* renamed from: akqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akqo implements Runnable {
    final /* synthetic */ Collection a;
    final /* synthetic */ akqk b;
    final /* synthetic */ akqr c;

    public akqo(akqr akqr, Collection collection, akqk akqk) {
        this.c = akqr;
        this.a = collection;
        this.b = akqk;
    }

    public final void run() {
        akqr akqr = this.c;
        Collection collection = this.a;
        akqr.a.execute(new akqq(this.b, collection));
    }
}
