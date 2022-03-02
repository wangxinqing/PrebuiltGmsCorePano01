package com.google.android.gms.family.v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class BulletPoint implements Parcelable {
    public static final Parcelable.Creator CREATOR = new mpu();
    public HashMap a = new HashMap();

    public BulletPoint(Parcel parcel) {
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.a.put(Integer.valueOf(parcel.readInt()), parcel.readString());
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof BulletPoint) && ((BulletPoint) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.size());
        for (Map.Entry entry : this.a.entrySet()) {
            parcel.writeInt(((Integer) entry.getKey()).intValue());
            parcel.writeString((String) entry.getValue());
        }
    }

    public BulletPoint(apki apki) {
        if (apki.a.size() != 0) {
            aucx aucx = apki.a;
            int size = aucx.size();
            for (int i = 0; i < size; i++) {
                apkj apkj = (apkj) aucx.get(i);
                HashMap hashMap = this.a;
                int a2 = apkl.a(apkj.a);
                if (a2 == 0) {
                    a2 = 1;
                }
                hashMap.put(Integer.valueOf(a2 - 1), apkj.b);
            }
        }
    }
}
