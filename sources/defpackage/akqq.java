package defpackage;

import java.util.Collection;
import java.util.HashMap;

/* renamed from: akqq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akqq implements Runnable {
    final /* synthetic */ akqk a;
    final /* synthetic */ Collection b;

    public akqq(akqk akqk, Collection collection) {
        this.a = akqk;
        this.b = collection;
    }

    public final void run() {
        this.a.a(new HashMap(), this.b);
    }
}
