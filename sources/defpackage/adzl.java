package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: adzl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adzl extends adzj {
    final /* synthetic */ String a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adzl(icc icc, String str) {
        super(icc);
        this.a = str;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        String str = this.a;
        aeaz aeaz = (aeaz) ((aebt) ibf).x();
        aebr aebr = new aebr(this);
        Parcel aQ = aeaz.aQ();
        bhx.a(aQ, (IInterface) aebr);
        aQ.writeString(str);
        aeaz.b(47, aQ);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return new adzm(status);
    }
}
