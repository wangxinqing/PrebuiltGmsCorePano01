package defpackage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: bx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bx {
    public final vo a;
    public final vb b;
    final Executor c = c.b;
    public final List d = new CopyOnWriteArrayList();
    public boolean e;
    public ct f;
    public ct g;
    public int h;
    public final cq i = new cq(this);

    public bx(acg acg, vj vjVar) {
        this.a = new ve(acg);
        va vaVar = new va(vjVar);
        if (vaVar.a == null) {
            synchronized (va.c) {
                if (va.d == null) {
                    va.d = Executors.newFixedThreadPool(2);
                }
            }
            vaVar.a = va.d;
        }
        this.b = new vb(vaVar.a, vaVar.b);
    }

    public final int a() {
        ct ctVar = this.f;
        if (ctVar != null) {
            return ctVar.size();
        }
        ct ctVar2 = this.g;
        if (ctVar2 != null) {
            return ctVar2.size();
        }
        return 0;
    }

    public final void b() {
        for (cu cuVar : this.d) {
        }
    }
}
