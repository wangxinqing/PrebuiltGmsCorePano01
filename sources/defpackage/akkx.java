package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: akkx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akkx implements Runnable {
    final /* synthetic */ Collection a;
    final /* synthetic */ akld b;
    final /* synthetic */ aklb c;

    public akkx(aklb aklb, Collection collection, akld akld) {
        this.c = aklb;
        this.a = collection;
        this.b = akld;
    }

    public final void run() {
        aklb aklb = this.c;
        Collection collection = this.a;
        akld akld = this.b;
        akkm akkm = aklb.a;
        if (akkm != null) {
            aklg a2 = akkm.a((Set) new HashSet(collection));
            HashSet hashSet = new HashSet();
            long[] jArr = new long[a2.b.size()];
            int i = 0;
            for (Long longValue : a2.b) {
                jArr[i] = longValue.longValue();
                i++;
            }
            for (long[] jArr2 : a2.a.values()) {
                for (long valueOf : (long[]) r1.next()) {
                    hashSet.add(Long.valueOf(valueOf));
                }
            }
            aklb.h.execute(new akky(akld, hashSet, jArr));
        }
    }
}
