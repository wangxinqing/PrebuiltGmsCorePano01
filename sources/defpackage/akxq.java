package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: akxq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akxq extends akhl {
    final /* synthetic */ boolean b;
    final /* synthetic */ akxr c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akxq(akxr akxr, icc icc, boolean z) {
        super(icc);
        this.c = akxr;
        this.b = z;
    }

    /* access modifiers changed from: protected */
    public final icf a() {
        akxr akxr = this.c;
        icc icc = akxr.a;
        return icc.b((idf) new rfi(icc, akxr.b()));
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        Status status = (Status) icl;
        super.a((icl) status);
        if (status.c()) {
            akxr akxr = this.c;
            akxr.c = false;
            if (this.b) {
                akxr.a.g();
            }
        }
    }
}
