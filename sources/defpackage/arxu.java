package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;
import com.google.location.nearby.common.fastpair.DiscoveryListItem;
import com.google.location.nearby.common.fastpair.slice.DeviceDetailsLinks;
import java.util.ArrayList;
import java.util.List;

/* renamed from: arxu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arxu extends bhv implements arxw {
    public arxu(IBinder iBinder) {
        super(iBinder, "com.google.location.nearby.common.fastpair.IDeviceStatusService");
    }

    public final TrueWirelessHeadset a(String str) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        Parcel a = a(2, aQ);
        TrueWirelessHeadset trueWirelessHeadset = (TrueWirelessHeadset) bhx.a(a, TrueWirelessHeadset.CREATOR);
        a.recycle();
        return trueWirelessHeadset;
    }

    public final DeviceDetailsLinks b(String str) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        Parcel a = a(3, aQ);
        DeviceDetailsLinks deviceDetailsLinks = (DeviceDetailsLinks) bhx.a(a, DeviceDetailsLinks.CREATOR);
        a.recycle();
        return deviceDetailsLinks;
    }

    public final String a(byte[] bArr) {
        Parcel aQ = aQ();
        aQ.writeByteArray(bArr);
        Parcel a = a(4, aQ);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final List b() {
        Parcel a = a(5, aQ());
        ArrayList createTypedArrayList = a.createTypedArrayList(DiscoveryListItem.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }
}
