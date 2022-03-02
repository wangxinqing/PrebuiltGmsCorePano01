package defpackage;

/* renamed from: aepi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aepi {
    public int a = 1;
    private aepm b = aepm.c().a();
    private aepm c = aepm.c().a();
    private Integer d = null;
    private boolean e = false;
    private boolean f = false;

    public final aepj a() {
        int i = this.a;
        aepm aepm = this.b;
        aepm aepm2 = this.c;
        return new aepc(i, aepm, aepm, aepm2, aepm2, this.d, this.e, this.f);
    }

    public final void a(Integer num) {
        this.d = num;
        this.a = 2;
    }

    public final void a(boolean z) {
        this.e = z;
        this.a = 2;
    }

    public final void b(aepm aepm) {
        amrl.a(true, (Object) "Sync policy is more eager than sync policy with listener");
        this.b = aepm;
        this.a = 2;
    }

    public final void b(boolean z) {
        this.f = z;
        this.a = 2;
    }

    public final void a(aepm aepm) {
        amrl.a(true, (Object) "Sync policy is more eager than sync policy with listener");
        this.c = aepm;
        this.a = 2;
    }
}
