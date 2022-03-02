package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: aebb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aebb extends adzj {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ byte[] c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aebb(icc icc, String str, String str2, byte[] bArr) {
        super(icc);
        this.a = str;
        this.b = str2;
        this.c = bArr;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        String str = this.a;
        String str2 = this.b;
        byte[] bArr = this.c;
        aeaz aeaz = (aeaz) ((aebt) ibf).x();
        aebs aebs = new aebs(this);
        Parcel aQ = aeaz.aQ();
        bhx.a(aQ, (IInterface) aebs);
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeByteArray(bArr);
        aeaz.b(12, aQ);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return new aebc(status, -1);
    }
}
