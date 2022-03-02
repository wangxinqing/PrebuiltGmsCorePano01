package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: kjo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kjo implements Runnable {
    final /* synthetic */ kmp a;
    final /* synthetic */ Set b;
    final /* synthetic */ kjp c;

    public kjo(kjp kjp, kmp kmp, Set set) {
        this.c = kjp;
        this.a = kmp;
        this.b = set;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        kky a2 = this.c.a(this.a, kqz.a);
        HashSet<String> hashSet = new HashSet<>(this.b);
        try {
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                kmq kmq = (kmq) it.next();
                hashSet.remove(kmq.b);
                if (!this.b.contains(kmq.b)) {
                    this.c.b(kmq);
                }
            }
            a2.close();
            long h = this.a.h();
            for (String kmq2 : hashSet) {
                this.c.a((kqi) new kmq(this.c.a, h, kmq2));
            }
        } catch (Throwable th) {
            a2.close();
            throw th;
        }
    }
}
