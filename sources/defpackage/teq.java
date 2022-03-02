package defpackage;

import com.google.android.gms.nearby.bootstrap.request.StartScanRequest;

/* renamed from: teq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class teq extends igi {
    final /* synthetic */ teh c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public teq(ige ige, teh teh) {
        super(ige);
        this.c = teh;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf, acwd acwd) {
        tdo tdo = (tdo) ibf;
        idg b = tev.b(acwd);
        teh teh = this.c;
        tdo.w();
        ((tee) tdo.x()).a(new StartScanRequest(teh, tea.a(b)));
    }
}
