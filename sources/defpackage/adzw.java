package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.StorageInfoResponse;

/* renamed from: adzw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adzw extends adzj {
    public adzw(icc icc) {
        super(icc);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        aeaz aeaz = (aeaz) ((aebt) ibf).x();
        adzv adzv = new adzv(this);
        Parcel aQ = aeaz.aQ();
        bhx.a(aQ, (IInterface) adzv);
        aeaz.b(18, aQ);
    }

    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return new adzx(status, (StorageInfoResponse) null);
    }
}
