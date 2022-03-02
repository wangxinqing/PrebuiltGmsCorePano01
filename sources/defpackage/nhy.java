package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nhy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class nhy implements nhd {
    public final Context a;
    public final ngo b;
    final /* synthetic */ nhz c;
    private final List d = new ArrayList();
    private aorr e;

    public nhy(nhz nhz, Context context, ngo ngo) {
        this.c = nhz;
        this.a = context.getApplicationContext();
        this.b = ngo;
    }

    public final aorr a() {
        nhn nhn;
        aosh aosh;
        aosh f = aosh.f();
        nhz nhz = this.c;
        synchronized (nhz.b) {
            nhn = nhz.r;
        }
        if (nhn == null) {
            nfw a2 = nhu.a();
            String a3 = ngt.a(a2);
            synchronized (this.c.b) {
                if (this.e == null) {
                    ngz.c("FontsSharedState", "Attempting to fetch directory from %s", a3);
                    ngo ngo = this.b;
                    if (((ngs) ngo).g) {
                        aosh = ((ngs) ngo).b(a3, a2).d;
                    } else {
                        aosh = aosh.f();
                        aosh.b((Object) ngs.f);
                    }
                    this.e = aosh;
                } else {
                    ngz.c("FontsSharedState", "Adding subscriber to pending download", new Object[0]);
                }
                this.d.add(f);
                if (this.d.size() > 1) {
                    return f;
                }
                aorr aorr = this.e;
                aorr.a(new nhx(this, aorr, a3, a2), this.c.b());
                return f;
            }
        }
        f.b((Object) nhn);
        return f;
    }

    public final void a(String str, nfw nfw) {
        ArrayList arrayList;
        this.b.a(str, nfw.b);
        synchronized (this.c.b) {
            arrayList = new ArrayList(this.d);
            this.d.clear();
            this.e = null;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((aosh) arrayList.get(i)).b((Object) null);
        }
    }
}
