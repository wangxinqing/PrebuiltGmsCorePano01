package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: akqy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akqy implements Runnable {
    final /* synthetic */ Collection a;
    final /* synthetic */ akqk b;
    final /* synthetic */ akra c;

    public akqy(akra akra, Collection collection, akqk akqk) {
        this.c = akra;
        this.a = collection;
        this.b = akqk;
    }

    public final void run() {
        akra akra = this.c;
        Collection collection = this.a;
        akqk akqk = this.b;
        akkm akkm = akra.h;
        if (akkm != null) {
            akra.e.execute(new akqz(akqk, akkm.a((Set) new HashSet(collection))));
        }
    }
}
