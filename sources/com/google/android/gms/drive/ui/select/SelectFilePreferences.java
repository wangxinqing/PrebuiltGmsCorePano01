package com.google.android.gms.drive.ui.select;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SelectFilePreferences implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new lpr();
    private final Map a = new HashMap();

    public final lqs a(lqu lqu) {
        iva.a((Object) lqu);
        lqs lqs = (lqs) this.a.get(lqu);
        return lqs == null ? lqu.g : lqs;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.size());
        for (Map.Entry entry : this.a.entrySet()) {
            parcel.writeString(((lqu) entry.getKey()).f);
            parcel.writeString(((lqs) entry.getValue()).a());
        }
    }

    public final void a(lqu lqu, lqs lqs) {
        iva.a((Object) lqu);
        iva.a((Object) lqs);
        this.a.put(lqu, lqs);
    }
}
