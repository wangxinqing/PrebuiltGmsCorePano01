package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.internal.DeviceMetaDataRequest;

/* renamed from: eta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eta extends eti {
    final /* synthetic */ DeviceMetaDataRequest a;

    public eta(DeviceMetaDataRequest deviceMetaDataRequest) {
        this.a = deviceMetaDataRequest;
    }

    /* access modifiers changed from: protected */
    public final void a(eua eua) {
        esz esz = new esz(this, this);
        DeviceMetaDataRequest deviceMetaDataRequest = this.a;
        Parcel aQ = eua.aQ();
        bhx.a(aQ, (IInterface) esz);
        bhx.a(aQ, (Parcelable) deviceMetaDataRequest);
        eua.b(7, aQ);
    }
}
