package defpackage;

import java.util.concurrent.Executor;

/* renamed from: absp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class absp {
    public boolean a = true;
    public final acel b;
    final /* synthetic */ absq c;
    private boolean d = false;

    public absp(absq absq, long j) {
        this.c = absq;
        this.b = new acel(absq.b, (Executor) null, j, new abso(this, j));
    }

    public final void a() {
        this.b.c();
    }

    public final void b() {
        this.d = true;
        d();
    }

    public final void c() {
        this.d = false;
        d();
    }

    public final void d() {
        if (this.a && !this.d) {
            this.b.a();
        } else {
            this.b.b();
        }
    }
}
