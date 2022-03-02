package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.AdvertisingInfo;
import com.google.android.gms.smartdevice.d2d.EsimActivationPayload;
import com.google.android.gms.smartdevice.d2d.ManagedAccountSetupInfo;
import java.util.List;

/* renamed from: abxp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class abxp extends bhw implements abxq {
    protected final idg a;

    public void a(Status status) {
        throw new UnsupportedOperationException();
    }

    public final void b(Status status) {
        throw new UnsupportedOperationException();
    }

    public void c(Status status) {
        throw new UnsupportedOperationException();
    }

    public final void d(Status status) {
        throw new UnsupportedOperationException();
    }

    public final void e(Status status) {
        throw new UnsupportedOperationException();
    }

    protected abxp(idg idg) {
        super("com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceCallbacks");
        this.a = idg;
    }

    public void a(Status status, AdvertisingInfo advertisingInfo) {
        throw new UnsupportedOperationException();
    }

    public void a(Status status, ManagedAccountSetupInfo managedAccountSetupInfo) {
        throw new UnsupportedOperationException();
    }

    public final void a(Status status, String str) {
        throw new UnsupportedOperationException();
    }

    public final void a(Status status, List list) {
        throw new UnsupportedOperationException();
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                a((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 2:
                b((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 3:
                c((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 4:
                a((Status) bhx.a(parcel, Status.CREATOR), parcel.readString());
                return true;
            case 5:
                d((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 6:
                e((Status) bhx.a(parcel, Status.CREATOR));
                return true;
            case 7:
                a((Status) bhx.a(parcel, Status.CREATOR), (ManagedAccountSetupInfo) bhx.a(parcel, ManagedAccountSetupInfo.CREATOR));
                return true;
            case 8:
                a((Status) bhx.a(parcel, Status.CREATOR), (List) parcel.createTypedArrayList(EsimActivationPayload.CREATOR));
                return true;
            case 9:
                a((Status) bhx.a(parcel, Status.CREATOR), (AdvertisingInfo) bhx.a(parcel, AdvertisingInfo.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
