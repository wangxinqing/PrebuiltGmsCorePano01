package defpackage;

/* renamed from: bwo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bwo extends bva {
    final /* synthetic */ bwp a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bwo(bwp bwp, String str, Object... objArr) {
        super(str, objArr);
        this.a = bwp;
    }

    public final void a(Exception exc) {
        this.a.b(7508);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue()) {
            this.a.b(7508);
        } else {
            this.a.b(0);
        }
    }
}
