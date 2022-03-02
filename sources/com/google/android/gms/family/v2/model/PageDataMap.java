package com.google.android.gms.family.v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class PageDataMap implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new mqb();
    private final SparseArray a = new SparseArray();

    public PageDataMap() {
    }

    public final PageData a(int i) {
        return (PageData) this.a.get(i);
    }

    public final boolean b(int i) {
        return this.a.get(i) != null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.size());
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            int keyAt = this.a.keyAt(i2);
            parcel.writeInt(keyAt);
            ((PageData) this.a.get(keyAt)).writeToParcel(parcel, i);
        }
    }

    public PageDataMap(Parcel parcel) {
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.a.put(parcel.readInt(), (PageData) PageData.CREATOR.createFromParcel(parcel));
        }
    }

    public final void a(int i, PageData pageData) {
        this.a.put(i, pageData);
    }
}
