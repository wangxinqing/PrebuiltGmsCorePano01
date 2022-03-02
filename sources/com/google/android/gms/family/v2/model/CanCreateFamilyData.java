package com.google.android.gms.family.v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class CanCreateFamilyData implements Parcelable, ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new mpv();
    public boolean a;
    public apku[] b;
    public PageData c;

    public CanCreateFamilyData(Parcel parcel) {
        apku[] apkuArr;
        this.a = parcel.createBooleanArray()[0];
        int[] createIntArray = parcel.createIntArray();
        if (createIntArray != null) {
            apkuArr = new apku[createIntArray.length];
        } else {
            apkuArr = new apku[0];
        }
        for (int i = 0; i < apkuArr.length; i++) {
            apkuArr[i] = apku.a(createIntArray[i]);
        }
        this.b = apkuArr;
        this.c = (PageData) parcel.readParcelable(PageData.class.getClassLoader());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int[] iArr;
        parcel.writeBooleanArray(new boolean[]{this.a});
        apku[] apkuArr = this.b;
        if (apkuArr == null) {
            iArr = new int[0];
        } else {
            int[] iArr2 = new int[apkuArr.length];
            for (int i2 = 0; i2 < apkuArr.length; i2++) {
                iArr2[i2] = apkuArr[i2].U;
            }
            iArr = iArr2;
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelable(this.c, i);
    }

    public CanCreateFamilyData(aphh aphh) {
        this.a = aphh.c;
        this.b = (apku[]) new aucu(aphh.d, aphh.e).toArray(new apku[0]);
        if ((aphh.a & 8) != 0) {
            apkp apkp = aphh.f;
            this.c = new PageData(apkp == null ? apkp.e : apkp);
        }
    }
}
