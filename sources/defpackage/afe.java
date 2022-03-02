package defpackage;

/* renamed from: afe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afe extends qi {
    final /* synthetic */ int a;
    final /* synthetic */ aff b;
    private boolean c = false;

    public afe(aff aff, int i) {
        this.b = aff;
        this.a = i;
    }

    public final void a() {
        this.c = true;
    }

    public final void b() {
        if (!this.c) {
            this.b.a.setVisibility(this.a);
        }
    }

    public final void c() {
        this.b.a.setVisibility(0);
    }
}
