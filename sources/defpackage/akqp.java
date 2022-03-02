package defpackage;

import java.util.Collection;
import java.util.HashMap;

/* renamed from: akqp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akqp implements Runnable {
    final /* synthetic */ Collection a;
    final /* synthetic */ akpw b;

    public akqp(akpw akpw, Collection collection) {
        this.b = akpw;
        this.a = collection;
    }

    public final void run() {
        this.b.a(new HashMap(), this.a);
    }
}
