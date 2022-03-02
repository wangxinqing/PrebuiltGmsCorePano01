package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SettingState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new acyl();
    public int a;
    public int b;

    public SettingState() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SettingState) {
            SettingState settingState = (SettingState) obj;
            return ius.a(Integer.valueOf(this.a), Integer.valueOf(settingState.a)) && ius.a(Integer.valueOf(this.b), Integer.valueOf(settingState.b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    public SettingState(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.b(parcel, 3, this.b);
        ivx.b(parcel, a2);
    }
}
