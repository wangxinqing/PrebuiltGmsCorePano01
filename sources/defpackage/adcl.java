package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: adcl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adcl extends adcj {
    protected final adck a = new adck(this);
    final /* synthetic */ atzx b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adcl(icc icc, atzx atzx) {
        super(icc);
        this.b = atzx;
    }

    /* access modifiers changed from: protected */
    public final void a(adca adca) {
        adca.d(this.a, this.b.k());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final acyu b(Status status) {
        return new adcq(status, (atzy) null);
    }
}
