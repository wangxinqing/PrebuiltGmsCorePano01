package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.AbsSavedState;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator CREATOR = new akbb();
    public final ou c;

    public ExtendableSavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.c = new ou(readInt);
        for (int i = 0; i < readInt; i++) {
            this.c.put(strArr[i], bundleArr[i]);
        }
    }

    public final String toString() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(valueOf).length());
        sb.append("ExtendableSavedState{");
        sb.append(hexString);
        sb.append(" states=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int i2 = this.c.h;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = (String) this.c.b(i3);
            bundleArr[i3] = (Bundle) this.c.c(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.c = new ou();
    }
}
