package defpackage;

/* renamed from: ory  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ory extends ppr {
    final /* synthetic */ osf a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ory(osf osf, aonk aonk) {
        super(aonk);
        this.a = osf;
    }

    public final void b() {
        try {
            this.a.j();
        } finally {
            this.a.f.release();
        }
    }
}
