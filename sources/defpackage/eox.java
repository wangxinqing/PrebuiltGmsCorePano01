package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.dataservice.DeviceManagementInfoResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: eox  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eox extends bhw implements eoy {
    final /* synthetic */ acwd a;

    public eox() {
        super("com.google.android.gms.auth.account.data.IGetDeviceManagementInfoCallback");
    }

    public final void a(Status status, DeviceManagementInfoResponse deviceManagementInfoResponse) {
        ihd.a(status, deviceManagementInfoResponse, this.a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eox(acwd acwd) {
        super("com.google.android.gms.auth.account.data.IGetDeviceManagementInfoCallback");
        this.a = acwd;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        a((Status) bhx.a(parcel, Status.CREATOR), (DeviceManagementInfoResponse) bhx.a(parcel, DeviceManagementInfoResponse.CREATOR));
        return true;
    }
}
