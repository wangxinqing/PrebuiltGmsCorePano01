package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: aemu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aemu {
    public final CopyOnWriteArrayList a;
    public final ou b;
    public int c;
    public long d;
    public boolean e;
    private boolean f;
    private final aemn g = new aemt(this);
    private final aemv h = new aems(this);

    public aemu(aemr... aemrArr) {
        this.a = new CopyOnWriteArrayList(aemrArr);
        this.b = new ou(1);
        this.c = 1;
        aemrArr[0].a(this.h);
        this.b.put(aemrArr[0], true);
    }

    public final void a() {
        if (!this.f) {
            this.f = true;
            this.d = -1;
            c();
        }
    }

    public final void b() {
        if (this.f) {
            if (this.e) {
                this.e = false;
                aemp.a().b(this.g);
            }
            this.f = false;
        }
    }

    public final void c() {
        if (!this.e && this.f && this.c != 0) {
            this.e = true;
            aemp.a().a(this.g);
        }
    }
}
