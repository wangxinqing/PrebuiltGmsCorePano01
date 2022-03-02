package defpackage;

/* renamed from: irq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class irq {
    public Object d;
    public boolean e = false;
    final /* synthetic */ irx f;

    public irq(irx irx, Object obj) {
        this.f = irx;
        this.d = obj;
    }

    /* access modifiers changed from: protected */
    public abstract void a(Object obj);

    /* access modifiers changed from: protected */
    public abstract void b();

    public final void c() {
        d();
        irx irx = this.f;
        String[] strArr = irx.r;
        synchronized (irx.j) {
            this.f.j.remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.d = null;
        }
    }
}
