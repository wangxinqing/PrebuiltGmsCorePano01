package defpackage;

import java.util.concurrent.Executor;

/* renamed from: cm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class cm extends by {
    public final Object b = new Object();
    public Object c = null;
    public Object d = null;

    public final void a(int i, Executor executor, cn cnVar) {
        cj cjVar = new cj(this, cnVar);
        a(new ck(i), cjVar);
        ce ceVar = cjVar.a;
        synchronized (ceVar.c) {
            ceVar.d = executor;
        }
    }

    public abstract void a(ck ckVar, cj cjVar);

    public abstract void a(cl clVar, ci ciVar);

    public final boolean a() {
        return false;
    }

    public final Object b() {
        return null;
    }

    public final void b(Executor executor, cn cnVar) {
        Object obj;
        synchronized (this.b) {
            obj = this.d;
        }
        if (obj != null) {
            new cl(obj);
            new ci(this, 2, executor, cnVar);
            return;
        }
        cnVar.a(2, co.a);
    }

    public final void a(Executor executor, cn cnVar) {
        Object obj;
        synchronized (this.b) {
            obj = this.c;
        }
        if (obj != null) {
            a(new cl(obj), new ci(this, 1, executor, cnVar));
        } else {
            cnVar.a(1, co.a);
        }
    }
}
