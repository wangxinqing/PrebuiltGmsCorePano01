package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.DeviceDataUploadOptInFlags;
import com.google.android.gms.udc.DeviceDataUploadOptedInAccountsParcelable;
import com.google.android.gms.udc.SettingDisplayInfo;
import com.google.android.gms.udc.SettingState;
import com.google.android.gms.udc.UdcCacheResponse;
import java.util.List;

/* renamed from: adbw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class adbw extends bhw implements adbx {
    public adbw() {
        super("com.google.android.gms.udc.internal.IUdcCallbacks");
    }

    public final void a(Status status) {
        throw new UnsupportedOperationException("Unsupported onLocalSettingsWritten callback");
    }

    public final void b(Status status, byte[] bArr) {
        throw new UnsupportedOperationException("Unsupported onOverviewConfigFetched callback");
    }

    public void c(Status status, byte[] bArr) {
        throw new UnsupportedOperationException("Unsupported onConsentConfigFetched callback");
    }

    public void d(Status status, byte[] bArr) {
        throw new UnsupportedOperationException("Unsupported onConsentWritten callback");
    }

    public final void a(Status status, PendingIntent pendingIntent) {
        throw new UnsupportedOperationException("Unsupported onPendingIntentFetched callback");
    }

    public void a(Status status, DeviceDataUploadOptInFlags deviceDataUploadOptInFlags) {
        throw new UnsupportedOperationException("Unsupported onDeviceDataUploadOptInStatusFetched callback");
    }

    public void a(Status status, DeviceDataUploadOptedInAccountsParcelable deviceDataUploadOptedInAccountsParcelable) {
        throw new UnsupportedOperationException("Unsupported onDeviceDataUploadOptedInAccountsFetched callback");
    }

    public final void a(Status status, SettingDisplayInfo settingDisplayInfo, PendingIntent pendingIntent) {
        throw new UnsupportedOperationException("Unsupported onSettingDisplayInfoFetched callback");
    }

    public void a(Status status, UdcCacheResponse udcCacheResponse) {
        throw new UnsupportedOperationException("Unsupported onCacheResponseFetched callback");
    }

    public final void a(Status status, List list) {
        throw new UnsupportedOperationException("Unsupported onConsentStatusReceived callback");
    }

    public final void a(Status status, byte[] bArr) {
        throw new UnsupportedOperationException("Unsupported onSettingsFetched callback");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                a((Status) bhx.a(parcel, Status.CREATOR), parcel.createByteArray());
                return true;
            case 2:
                b((Status) bhx.a(parcel, Status.CREATOR), parcel.createByteArray());
                return true;
            case 3:
                c((Status) bhx.a(parcel, Status.CREATOR), parcel.createByteArray());
                return true;
            case 4:
                d((Status) bhx.a(parcel, Status.CREATOR), parcel.createByteArray());
                return true;
            case 5:
                a((Status) bhx.a(parcel, Status.CREATOR), (List) parcel.createTypedArrayList(SettingState.CREATOR));
                return true;
            case 6:
                a((Status) bhx.a(parcel, Status.CREATOR), (PendingIntent) bhx.a(parcel, PendingIntent.CREATOR));
                return true;
            case 7:
                a((Status) bhx.a(parcel, Status.CREATOR), (SettingDisplayInfo) bhx.a(parcel, SettingDisplayInfo.CREATOR), (PendingIntent) bhx.a(parcel, PendingIntent.CREATOR));
                return true;
            case 8:
                a((Status) bhx.a(parcel, Status.CREATOR), (UdcCacheResponse) bhx.a(parcel, UdcCacheResponse.CREATOR));
                return true;
            case 9:
                a((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 10:
                a((Status) bhx.a(parcel, Status.CREATOR), (DeviceDataUploadOptInFlags) bhx.a(parcel, DeviceDataUploadOptInFlags.CREATOR));
                return true;
            case 11:
                a((Status) bhx.a(parcel, Status.CREATOR), (DeviceDataUploadOptedInAccountsParcelable) bhx.a(parcel, DeviceDataUploadOptedInAccountsParcelable.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
