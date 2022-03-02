package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: bvj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bvj {
    public final cle a = new cle();
    public long b = Long.MAX_VALUE;
    public final amxb c = amzg.q();

    public final void a(bvi bvi) {
        cle cle = this.a;
        Long valueOf = Long.valueOf(bvi.b);
        Set set = (Set) cle.get(valueOf);
        if (set == null) {
            HashSet hashSet = new HashSet();
            cle.put(valueOf, hashSet);
            hashSet.add(bvi);
        } else {
            set.add(bvi);
        }
        this.c.a((Object) bvi.a, (Object) bvi);
    }

    public final boolean a() {
        return this.a.isEmpty();
    }
}
