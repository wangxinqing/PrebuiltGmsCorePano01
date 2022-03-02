package defpackage;

/* renamed from: dmg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dmg extends dnb {
    final /* synthetic */ dmk a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dmg(dmk dmk, dmd dmd) {
        super(dmd);
        this.a = dmk;
    }

    public final void a() {
        dmk dmk = this.a;
        dkw.a();
        if (dmk.b()) {
            dmk.b("Inactivity, disconnecting from device AnalyticsService");
            dmk.t();
        }
    }
}
