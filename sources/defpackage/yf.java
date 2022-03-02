package defpackage;

/* renamed from: yf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yf implements xg {
    final /* synthetic */ yh a;

    public yf(yh yhVar) {
        this.a = yhVar;
    }

    public final void a(wt wtVar, boolean z) {
        if (wtVar instanceof xp) {
            wtVar.j().a(false);
        }
        xg xgVar = this.a.e;
        if (xgVar != null) {
            xgVar.a(wtVar, z);
        }
    }

    public final boolean a(wt wtVar) {
        if (wtVar != null) {
            yh yhVar = this.a;
            yhVar.p = ((xp) wtVar).l.a;
            xg xgVar = yhVar.e;
            if (xgVar != null) {
                return xgVar.a(wtVar);
            }
        }
        return false;
    }
}
