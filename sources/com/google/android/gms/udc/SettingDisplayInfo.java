package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SettingDisplayInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new acyk();
    public SettingState a;
    public String b;
    public String c;

    public SettingDisplayInfo() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SettingDisplayInfo) {
            SettingDisplayInfo settingDisplayInfo = (SettingDisplayInfo) obj;
            return ius.a(this.b, settingDisplayInfo.b) && ius.a(this.c, settingDisplayInfo.c) && ius.a(this.a, settingDisplayInfo.a);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public SettingDisplayInfo(SettingState settingState, String str, String str2) {
        this.a = settingState;
        this.b = str;
        this.c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c, false);
        ivx.b(parcel, a2);
    }
}
