package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.DeviceManagementInfoResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: eow  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eow extends bhv implements eoy {
    public eow(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGetDeviceManagementInfoCallback");
    }

    public final void a(Status status, DeviceManagementInfoResponse deviceManagementInfoResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) deviceManagementInfoResponse);
        c(2, aQ);
    }
}
