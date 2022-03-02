package defpackage;

import com.google.android.gms.beacon.BleSettings;

/* renamed from: akxw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akxw extends akhl {
    final /* synthetic */ BleSettings b;
    final /* synthetic */ akxy c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akxw(akxy akxy, icc icc, BleSettings bleSettings) {
        super(icc);
        this.c = akxy;
        this.b = bleSettings;
    }

    /* access modifiers changed from: protected */
    public final icf a() {
        akxy akxy = this.c;
        gug gug = akxy.m;
        icc icc = akxy.f;
        gth gth = akxy.i;
        return icc.b((idf) new gud(icc, ((gui) icc.a(gtd.c)).a(icc, gth), gth, this.b));
    }
}
