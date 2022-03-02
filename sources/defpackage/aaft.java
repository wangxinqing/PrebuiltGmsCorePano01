package defpackage;

import com.google.android.gms.icing.nativeindex.NativeIndex;

/* renamed from: aaft  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaft extends ppr {
    final /* synthetic */ aafu a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aaft(aafu aafu, aonk aonk, psc psc) {
        super(aonk, psc);
        this.a = aafu;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        boolean z;
        ozq b = this.a.a.b();
        synchronized (b.a()) {
            anhj a2 = b.d().iterator();
            z = true;
            while (a2.hasNext()) {
                pao pao = (pao) a2.next();
                osz d = b.d(pao);
                if (d != null) {
                    if (!this.a.a.a(pao, this.a.a.m.d(d.e))) {
                        z = false;
                    }
                }
            }
        }
        return Boolean.valueOf(NativeIndex.nativeClearUsageReportData(this.a.a.n.b) & z);
    }
}
