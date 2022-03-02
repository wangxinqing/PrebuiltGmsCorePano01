package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.request.UnclaimBleDeviceRequest;

/* renamed from: nen  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nen extends ndi {
    final /* synthetic */ String a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nen(icc icc, String str) {
        super(icc);
        this.a = str;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        nel nel = new nel(this);
        ned ned = (ned) ((ndk) ibf).x();
        UnclaimBleDeviceRequest unclaimBleDeviceRequest = new UnclaimBleDeviceRequest(this.a, (nem) nel);
        Parcel aQ = ned.aQ();
        bhx.a(aQ, (Parcelable) unclaimBleDeviceRequest);
        ned.b(4, aQ);
    }
}
