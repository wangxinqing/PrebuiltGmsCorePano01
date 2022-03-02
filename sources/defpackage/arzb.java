package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.location.nearby.common.fastpair.slice.DeviceDetailsLinks;

/* renamed from: arzb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arzb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DeviceDetailsLinks[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        arzc h = DeviceDetailsLinks.h();
        h.a(bArr);
        boolean z = true;
        h.a(parcel.readByte() != 0);
        h.a(parcel.readString());
        h.b(parcel.readString());
        if (parcel.readByte() == 0) {
            z = false;
        }
        h.b(z);
        h.c(parcel.readString());
        h.d(parcel.readString());
        return h.a();
    }
}
