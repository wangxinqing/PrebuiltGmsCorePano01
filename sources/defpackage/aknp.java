package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: aknp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aknp extends aknl {
    final /* synthetic */ aknq a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aknp(aknq aknq, icc icc, String str) {
        super(icc, str);
        this.a = aknq;
    }

    /* access modifiers changed from: protected */
    public final icf a() {
        aknq aknq = this.a;
        return juc.a(aknq.d, aknq.c);
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        super.a((icl) (Status) icl);
        this.a.d.g();
    }
}
