package defpackage;

/* renamed from: orr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class orr extends ppr {
    final /* synthetic */ osf a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public orr(osf osf, aonk aonk) {
        super(aonk);
        this.a = osf;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        if (!this.a.d()) {
            oso.b("UpdateNativeConfig skipped because init failed");
            return false;
        }
        osf osf = this.a;
        if (osf.n.a(osf.i())) {
            return true;
        }
        oso.b("Failed while calling updateNativeConfig.");
        return false;
    }
}
