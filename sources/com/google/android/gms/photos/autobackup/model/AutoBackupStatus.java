package com.google.android.gms.photos.autobackup.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AutoBackupStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new yjw();
    public final int a;
    public int b;
    public String c;
    public String d;
    public float e;
    public int f;
    public int g;
    public int h;
    public String[] i;
    public String j;
    public int k;

    public AutoBackupStatus() {
        this.a = 1;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("accountName", this.c);
        a2.a("autoBackupState", Integer.valueOf(this.b));
        a2.a("currentItem", this.d);
        a2.a("currentItemProgress", Float.valueOf(this.e));
        a2.a("numCompleted", Integer.valueOf(this.f));
        a2.a("numPending", Integer.valueOf(this.g));
        a2.a("numFailed", Integer.valueOf(this.h));
        a2.a("failedItems", this.i);
        a2.a("enabledAccountName", this.j);
        a2.a("numUploading", Integer.valueOf(this.k));
        return a2.toString();
    }

    public AutoBackupStatus(int i2, int i3, String str, String str2, float f2, int i4, int i5, int i6, String[] strArr, String str3, int i7) {
        this.a = i2;
        this.b = i3;
        this.c = str;
        this.d = str2;
        this.e = f2;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = strArr;
        this.j = str3;
        this.k = i7;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e);
        ivx.b(parcel, 6, this.f);
        ivx.b(parcel, 7, this.g);
        ivx.b(parcel, 8, this.h);
        ivx.a(parcel, 9, this.i, false);
        ivx.a(parcel, 10, this.j, false);
        ivx.b(parcel, 11, this.k);
        ivx.b(parcel, a2);
    }
}
