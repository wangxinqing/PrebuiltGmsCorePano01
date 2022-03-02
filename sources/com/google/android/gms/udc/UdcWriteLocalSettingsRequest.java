package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UdcWriteLocalSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new acze();
    public SettingChange[] a;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SettingChange extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new acyj();
        public int a;
        public boolean b;

        public SettingChange(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            ivx.b(parcel, 2, this.a);
            ivx.a(parcel, 3, this.b);
            ivx.b(parcel, a2);
        }
    }

    public UdcWriteLocalSettingsRequest(SettingChange[] settingChangeArr) {
        this.a = settingChangeArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, (Parcelable[]) this.a, i);
        ivx.b(parcel, a2);
    }
}
