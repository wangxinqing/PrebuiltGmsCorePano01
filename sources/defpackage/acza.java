package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.udc.UdcCacheResponse;

/* renamed from: acza  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acza implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UdcCacheResponse.UdcSetting[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        int i = 0;
        UdcCacheResponse.SettingAvailability settingAvailability = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                i = ivw.g(parcel, readInt);
            } else if (a == 3) {
                i2 = ivw.g(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                settingAvailability = (UdcCacheResponse.SettingAvailability) ivw.a(parcel, readInt, UdcCacheResponse.SettingAvailability.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new UdcCacheResponse.UdcSetting(i, i2, settingAvailability);
    }
}
