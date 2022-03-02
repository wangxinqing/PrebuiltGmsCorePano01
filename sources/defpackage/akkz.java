package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: akkz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akkz implements Runnable {
    final /* synthetic */ Collection a;
    final /* synthetic */ akle b;
    final /* synthetic */ aklb c;

    public akkz(aklb aklb, Collection collection, akle akle) {
        this.c = aklb;
        this.a = collection;
        this.b = akle;
    }

    public final void run() {
        aklb aklb = this.c;
        Collection collection = this.a;
        akle akle = this.b;
        akkm akkm = aklb.b;
        if (akkm != null) {
            aklb.h.execute(new akla(akle, akkm.a((Set) new HashSet(collection))));
        }
    }
}
