package com.google.android.gms.family.v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class PageData implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new mqa();
    public HashMap a;
    public HashMap b;
    public ArrayList c;
    public int d;

    public PageData(Parcel parcel) {
        int i = 1;
        this.d = 1;
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new ArrayList();
        int a2 = apko.a(parcel.readInt());
        this.d = a2 != 0 ? a2 : i;
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            this.a.put(Integer.valueOf(parcel.readInt()), parcel.readString());
        }
        int readInt2 = parcel.readInt();
        for (int i3 = 0; i3 < readInt2; i3++) {
            this.b.put(parcel.readString(), (HelpData) HelpData.CREATOR.createFromParcel(parcel));
        }
        int readInt3 = parcel.readInt();
        for (int i4 = 0; i4 < readInt3; i4++) {
            this.c.add((BulletPoint) BulletPoint.CREATOR.createFromParcel(parcel));
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PageData)) {
            return false;
        }
        PageData pageData = (PageData) obj;
        return pageData.d == this.d && pageData.a.equals(this.a) && pageData.b.equals(this.b) && pageData.c.equals(this.c);
    }

    public final int hashCode() {
        Object[] objArr = new Object[4];
        int i = this.d;
        int i2 = i - 1;
        if (i != 0) {
            objArr[0] = Integer.valueOf(i2);
            objArr[1] = this.a;
            objArr[2] = this.b;
            objArr[3] = this.c;
            return Arrays.hashCode(objArr);
        }
        throw null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.d;
        int i3 = i2 - 1;
        if (i2 != 0) {
            parcel.writeInt(i3);
            parcel.writeInt(this.a.size());
            for (Map.Entry entry : this.a.entrySet()) {
                parcel.writeInt(((Integer) entry.getKey()).intValue());
                parcel.writeString((String) entry.getValue());
            }
            parcel.writeInt(this.b.size());
            for (Map.Entry entry2 : this.b.entrySet()) {
                parcel.writeString((String) entry2.getKey());
                ((HelpData) entry2.getValue()).writeToParcel(parcel, i);
            }
            parcel.writeInt(this.c.size());
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((BulletPoint) arrayList.get(i4)).writeToParcel(parcel, i);
            }
            return;
        }
        throw null;
    }

    public PageData(apkp apkp) {
        this.d = 1;
        int a2 = apko.a(apkp.a);
        this.d = a2 == 0 ? 1 : a2;
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new ArrayList();
        if (apkp.b.size() != 0) {
            aucx aucx = apkp.b;
            int size = aucx.size();
            for (int i = 0; i < size; i++) {
                apkj apkj = (apkj) aucx.get(i);
                HashMap hashMap = this.a;
                int a3 = apkl.a(apkj.a);
                if (a3 == 0) {
                    a3 = 1;
                }
                hashMap.put(Integer.valueOf(a3 - 1), apkj.b);
            }
        }
        if (apkp.c.size() != 0) {
            aucx aucx2 = apkp.c;
            int size2 = aucx2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                apkm apkm = (apkm) aucx2.get(i2);
                this.b.put(apkm.a, new HelpData(apkm));
            }
        }
        if (apkp.d.size() != 0) {
            aucx aucx3 = apkp.d;
            int size3 = aucx3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                this.c.add(new BulletPoint((apki) aucx3.get(i3)));
            }
        }
    }
}
