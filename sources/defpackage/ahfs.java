package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: ahfs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahfs implements aoqa {
    public List a;
    final /* synthetic */ ahfv b;

    public ahfs(ahfv ahfv) {
        this.b = ahfv;
    }

    public final aorr a() {
        ArrayList arrayList;
        String valueOf = String.valueOf(this.b.a);
        amkr a2 = amlv.a(valueOf.length() == 0 ? new String("Initialize ") : "Initialize ".concat(valueOf), amlw.a);
        try {
            synchronized (this.b.d) {
                if (this.a == null) {
                    ahfv ahfv = this.b;
                    this.a = ahfv.e;
                    ahfv.e = Collections.emptyList();
                }
            }
            arrayList = new ArrayList(this.a.size());
            ahfu ahfu = new ahfu(this.b);
            for (aoqb a3 : this.a) {
                arrayList.add(a3.a(ahfu));
            }
        } catch (Exception e) {
            arrayList.add(aorl.a((Throwable) e));
        } catch (Throwable th) {
            if (a2 != null) {
                try {
                    a2.close();
                } catch (Throwable th2) {
                    apev.a(th, th2);
                }
            }
            throw th;
        }
        aorr a4 = aorl.c((Iterable) arrayList).a((Callable) new ahfr(this), (Executor) aoqm.a);
        a2.a(a4);
        if (a2 != null) {
            a2.close();
        }
        return a4;
    }
}
