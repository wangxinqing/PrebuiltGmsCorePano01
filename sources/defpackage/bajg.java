package defpackage;

/* renamed from: bajg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bajg extends badg {
    final azze a;
    final azyx b;
    final badt c;
    final badu d;
    bahv e;
    boolean f;
    boolean g;
    babp h;
    final /* synthetic */ baji i;

    public bajg(baji baji, azze azze, baix baix) {
        this.i = baji;
        amrl.a((Object) azze, (Object) "args");
        this.a = azze;
        amrl.a((Object) baix, (Object) "helper");
        this.b = azyx.a("Subchannel", baji.a());
        azyx azyx = this.b;
        long a2 = baji.k.a();
        String valueOf = String.valueOf(azze.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("Subchannel for ");
        sb.append(valueOf);
        this.d = new badu(azyx, a2, sb.toString());
        this.c = new badt(this.d, baji.k);
    }

    public final void a() {
        this.i.a("Subchannel.shutdown()");
        this.i.l.execute(new bajf(this));
    }

    public final void b() {
        this.i.a("Subchannel.requestConnection()");
        amrl.b(this.f, (Object) "not started");
        this.e.a();
    }

    public final String toString() {
        return this.b.toString();
    }
}
