package defpackage;

import java.util.HashSet;
import java.util.NavigableMap;
import java.util.Set;

/* renamed from: bvg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bvg implements Runnable {
    final /* synthetic */ bvk a;

    public bvg(bvk bvk) {
        this.a = bvk;
    }

    public final void run() {
        HashSet<bve> hashSet;
        bwn k = cbi.k();
        long b = cbi.i().b();
        bvj bvj = this.a.a;
        NavigableMap headMap = bvj.a.headMap(Long.valueOf(b), true);
        if (!headMap.isEmpty()) {
            hashSet = new HashSet<>();
            for (Set<bvi> it : headMap.values()) {
                for (bvi bvi : it) {
                    hashSet.add(bvi.a);
                }
            }
            for (Set<bvi> it2 : headMap.values()) {
                for (bvi bvi2 : it2) {
                    bvj.c.c(bvi2.a, bvi2);
                }
            }
            headMap.clear();
            bvj.b = Long.MAX_VALUE;
            if (!bvj.a()) {
                for (Set<bvi> it3 : bvj.a.values()) {
                    for (bvi bvi3 : it3) {
                        bvj.b = Math.min(bvj.b, bvi3.c);
                    }
                }
            }
        } else {
            hashSet = null;
        }
        if (hashSet != null) {
            for (bve bvf : hashSet) {
                k.a(new bvf(bvf), bvq.a("TaskConsolidator#ExecuteOperation#taskExecute"));
            }
        }
        if (!this.a.a.a()) {
            this.a.a();
        }
    }
}
