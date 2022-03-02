package defpackage;

/* renamed from: nzz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nzz {
    public final String a;
    public long b;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public final nzx f = new nzx();

    public final void a() {
        this.f.deleteObservers();
    }

    public final void b(boolean z) {
        this.d = z;
        if (z) {
            this.f.b();
        }
    }

    public nzz(String str, long j, boolean z) {
        this.a = str;
        this.b = j;
        this.c = z;
    }

    public final void a(boolean z) {
        this.e = z;
        if (z) {
            this.f.b();
        }
    }
}
