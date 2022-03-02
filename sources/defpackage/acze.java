package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.udc.UdcWriteLocalSettingsRequest;

/* renamed from: acze  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acze implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UdcWriteLocalSettingsRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        UdcWriteLocalSettingsRequest.SettingChange[] settingChangeArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (ivw.a(readInt) != 2) {
                ivw.b(parcel, readInt);
            } else {
                settingChangeArr = (UdcWriteLocalSettingsRequest.SettingChange[]) ivw.b(parcel, readInt, UdcWriteLocalSettingsRequest.SettingChange.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new UdcWriteLocalSettingsRequest(settingChangeArr);
    }
}
