package defpackage;

/* renamed from: orp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class orp extends ppr {
    final /* synthetic */ osf a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public orp(osf osf, aonk aonk) {
        super(aonk);
        this.a = osf;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        if (!this.a.d()) {
            oso.b("Maintenance skipped because init failed");
            this.a.r.a("maintenance_skipped");
            return false;
        }
        this.a.m();
        return true;
    }
}
