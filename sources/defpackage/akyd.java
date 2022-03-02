package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: akyd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akyd extends akhl {
    final /* synthetic */ rdv b;
    final /* synthetic */ akyk c;
    final /* synthetic */ akyn d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akyd(akyn akyn, icc icc, rdv rdv, akyk akyk) {
        super(icc);
        this.d = akyn;
        this.b = rdv;
        this.c = akyk;
    }

    /* access modifiers changed from: protected */
    public final icf a() {
        akyn akyn = this.d;
        rgb rgb = akyn.x;
        icc icc = akyn.k;
        return icc.b((idf) new rfy(icc, this.b.a(), this.d.j));
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        Status status = (Status) icl;
        super.a((icl) status);
        this.d.d.post(new akyc(this, status));
    }
}
