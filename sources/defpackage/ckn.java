package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;

/* renamed from: ckn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ckn implements bve {
    public final Future a() {
        cba s = cbi.s();
        if (s.a.a(0)) {
            String a = cbi.v().a();
            if (!TextUtils.isEmpty(a)) {
                HashMap hashMap = null;
                for (SparseArray sparseArray : s.a.c.values()) {
                    for (int i = 0; i < sparseArray.size(); i++) {
                        cay cay = (cay) sparseArray.valueAt(i);
                        if (cay.a(1) || cay.a(0)) {
                            if (hashMap == null) {
                                hashMap = new HashMap();
                            }
                            SparseArray sparseArray2 = (SparseArray) hashMap.get(cay.a);
                            if (sparseArray2 == null) {
                                sparseArray2 = new SparseArray();
                                hashMap.put(cay.a, sparseArray2);
                            }
                            sparseArray2.put(cay.b, cay);
                        }
                    }
                }
                if (hashMap == null || hashMap.isEmpty()) {
                    return buk.a;
                }
                bul bul = new bul();
                for (Map.Entry entry : hashMap.entrySet()) {
                    bsz bsz = (bsz) entry.getKey();
                    SparseArray sparseArray3 = (SparseArray) entry.getValue();
                    for (int i2 = 0; i2 < sparseArray3.size(); i2++) {
                        ((cay) sparseArray3.valueAt(i2)).e = ((cay) sparseArray3.valueAt(i2)).d;
                    }
                    cbl w = cbi.w();
                    HashSet hashSet = new HashSet();
                    int i3 = 0;
                    while (i3 < sparseArray3.size()) {
                        cay cay2 = (cay) sparseArray3.valueAt(i3);
                        aucd o = atqr.e.o();
                        atjv b = jtj.b(cay2.b);
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        atqr atqr = (atqr) o.b;
                        atqr.d = b.bA;
                        int i4 = atqr.a | 4;
                        atqr.a = i4;
                        a.getClass();
                        int i5 = i4 | 1;
                        atqr.a = i5;
                        atqr.b = a;
                        int i6 = cay2.d;
                        int i7 = i6 - 1;
                        if (i6 != 0) {
                            atqr.c = i7;
                            atqr.a = i5 | 2;
                            hashSet.add((atqr) o.i());
                            i3++;
                        } else {
                            throw null;
                        }
                    }
                    ckm ckm = new ckm(bsz, sparseArray3);
                    bul.a(ckm);
                    w.a(bsz, (Set) hashSet, (cbm) ckm, (but) cbi.k(), bvq.a("SyncServerInterestRecordsOperation#writeInterestRecords"));
                }
                return bul;
            }
            ((anih) ((anih) bxk.a.c()).a("ckn", "a", 53, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[SyncServerInterestRecordsOperation] No available gcm id.  Cannot proceed server interest records sync.");
            cbi.z().b(awuz.e());
            return buk.a;
        }
        if (s.a.a(1)) {
            cbi.z().b(awuz.t());
        }
        return buk.a;
    }
}
