package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: eon  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eon extends bhv implements IInterface {
    public eon(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IClearTokenCallback");
    }

    public final void a(Status status, ClearTokenResponse clearTokenResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) clearTokenResponse);
        c(2, aQ);
    }
}
