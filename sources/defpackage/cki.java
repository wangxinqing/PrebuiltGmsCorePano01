package defpackage;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Future;

/* renamed from: cki  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cki implements bve {
    private static final void a(Set set, Set set2, String str, int i) {
        if (set2 != null && !set2.isEmpty()) {
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                aucd o = atqr.e.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atqr atqr = (atqr) o.b;
                str.getClass();
                int i2 = atqr.a | 1;
                atqr.a = i2;
                atqr.b = str;
                atqr.c = i - 1;
                atqr.a = i2 | 2;
                atjv b = jtj.b(num.intValue());
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atqr atqr2 = (atqr) o.b;
                atqr2.d = b.bA;
                atqr2.a |= 4;
                set.add((atqr) o.i());
            }
        }
    }

    public final Future a() {
        String a = cbi.v().a();
        if (TextUtils.isEmpty(a)) {
            ((anih) ((anih) bxk.a.c()).a("cki", "a", 40, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[RefreshStateOperation] No available gcm id. Cannot proceed server interest records sync.");
            cbi.z().b(awuz.e());
            return buk.a;
        }
        Set<bsz> a2 = cbi.y().a();
        bul bul = new bul();
        for (bsz bsz : a2) {
            cba s = cbi.s();
            HashSet hashSet = new HashSet();
            a(hashSet, s.a(bsz, 2), a, 2);
            a(hashSet, s.a(bsz, 3), a, 3);
            Object[] objArr = {bsz, hashSet};
            if (hashSet.size() > 0) {
                cbl w = cbi.w();
                ckh ckh = new ckh(bsz);
                bul.a(ckh);
                w.a(bsz, (Set) hashSet, (cbm) ckh, (but) cbi.k(), bvq.a("RefreshStateOperation#writeInterestRecords"));
            }
        }
        cbi.z().c(awuz.s());
        return bul;
    }
}
