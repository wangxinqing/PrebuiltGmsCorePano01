package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: akkw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akkw implements Runnable {
    final /* synthetic */ astz[] a;
    final /* synthetic */ aklb b;

    public akkw(aklb aklb, astz[] astzArr) {
        this.b = aklb;
        this.a = astzArr;
    }

    public final void run() {
        aklb aklb = this.b;
        astz[] astzArr = this.a;
        if (aklb.b != null) {
            HashSet hashSet = new HashSet(r3);
            for (astz astz : astzArr) {
                if ((astz.a & 1) != 0) {
                    asth asth = astz.b;
                    if (asth == null) {
                        asth = asth.b;
                    }
                    hashSet.add(Long.valueOf(asth.a));
                }
            }
            aklg a2 = aklb.b.a((Set) hashSet);
            nz nzVar = new nz(a2.b.size());
            for (astz astz2 : astzArr) {
                if ((astz2.a & 1) != 0) {
                    asth asth2 = astz2.b;
                    if (asth2 == null) {
                        asth2 = asth.b;
                    }
                    long j = asth2.a;
                    Set set = a2.b;
                    Long valueOf = Long.valueOf(j);
                    if (set.contains(valueOf)) {
                        nzVar.put(valueOf, astz2);
                    }
                }
            }
            int i = nzVar.h;
            StringBuilder sb = new StringBuilder(36);
            sb.append("adding ");
            sb.append(i);
            sb.append(" new l2data points");
            sb.toString();
            aklb.b(aklb.b.a(nzVar, false));
        }
    }
}
