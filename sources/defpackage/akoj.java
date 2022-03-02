package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: akoj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akoj implements akle {
    final /* synthetic */ Set a;
    final /* synthetic */ akoi b;

    public akoj(Set set, akoi akoi) {
        this.a = set;
        this.b = akoi;
    }

    public final void a(Collection collection, Collection collection2) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            astz astz = (astz) it.next();
            int i = astz.a;
            if ((i & 4) == 0 || (i & 8) == 0) {
                aklz.a().b("PlaceInfo missing lat or lng.");
            } else {
                this.a.add(new aklr(astz.d, astz.e, 0, Float.NaN, "unknown", 0, -1.0f));
            }
        }
        akoi akoi = this.b;
        Set<aklr> set = this.a;
        if (!set.isEmpty()) {
            aklz.a();
            akke akke = akoi.b.b;
            HashSet<Long> hashSet = new HashSet<>();
            for (aklr a2 : set) {
                hashSet.addAll(aklw.a(a2, (int) azco.a.a().a()));
            }
            long[] jArr = new long[hashSet.size()];
            int i2 = 0;
            for (Long longValue : hashSet) {
                jArr[i2] = longValue.longValue();
                i2++;
            }
            akke.a.a(jArr, true);
            akke.h.e++;
        }
    }
}
