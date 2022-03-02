package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: akqw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akqw implements Runnable {
    final /* synthetic */ Collection a;
    final /* synthetic */ akra b;
    final /* synthetic */ akpw c;

    public akqw(akra akra, Collection collection, akpw akpw) {
        this.b = akra;
        this.a = collection;
        this.c = akpw;
    }

    public final void run() {
        akra akra = this.b;
        Collection collection = this.a;
        akpw akpw = this.c;
        akkm akkm = akra.g;
        if (akkm != null) {
            akra.e.execute(new akqx(akpw, akkm.a((Set) new HashSet(collection))));
        }
    }
}
