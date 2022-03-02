package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: bpr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bpr {
    public static int a(boz boz, List list) {
        int i;
        int e = boz.e();
        apxg apxg = new apxg();
        Iterator it = list.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            boc boc = (boc) it.next();
            String str = boc.b;
            long j = boc.c;
            int a = a(str, j, boz, apxg);
            if (a < 0) {
                z = true;
            } else if (apxg.t()) {
                z2 = true;
            } else if (j == -1 && (i = a + 1) < e) {
                boz.a(apxg, i);
                z2 = str.equals(apxg.Q());
            }
        }
        if (z) {
            return 1;
        }
        if (!z2) {
            return 0;
        }
        return 2;
    }

    public static int a(boz boz, byte[] bArr) {
        try {
            aucx aucx = ((boe) aucj.a((aucj) boe.b, bArr, aubs.b())).a;
            ArrayList arrayList = new ArrayList(aucx.size());
            int size = aucx.size();
            for (int i = 0; i < size; i++) {
                bob bob = (bob) aucx.get(i);
                aucd o = boc.d.o();
                String str = bob.b;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                boc boc = (boc) o.b;
                str.getClass();
                int i2 = boc.a | 1;
                boc.a = i2;
                boc.b = str;
                long j = bob.c;
                boc.a = i2 | 2;
                boc.c = j;
                arrayList.add((boc) o.i());
            }
            return a(boz, (List) arrayList);
        } catch (auda e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.e("FeatureCheckUtils", valueOf.length() == 0 ? new String("Failed to parse FeatureList proto: ") : "Failed to parse FeatureList proto: ".concat(valueOf));
            return 3;
        }
    }

    private static int a(String str, long j, boz boz, apxg apxg) {
        int a = bqj.a(boz, bqj.c, new bqh(str, j));
        if (a >= 0) {
            boz.a(apxg, a);
            return a;
        }
        int i = (-a) - 1;
        if (i != boz.e()) {
            boz.a(apxg, i);
            if (str.equals(apxg.Q())) {
                return i;
            }
        }
        return -1;
    }

    public static List a(boz boz, Collection collection) {
        int e = boz.e();
        apxg apxg = new apxg();
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            int a = a(str, 0, boz, apxg);
            if (a >= 0) {
                do {
                    arrayList.add(bog.a(apxg));
                    a++;
                    if (a == e) {
                        break;
                    }
                    boz.a(apxg, a);
                } while (str.equals(apxg.Q()));
            }
        }
        return arrayList;
    }
}
