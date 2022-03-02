package com.google.android.gms.photos.autobackup.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AutoBackupSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new yjv();
    public final int a;
    public String b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public UserQuota k;

    public AutoBackupSettings() {
        this.a = 1;
    }

    public AutoBackupSettings(int i2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, UserQuota userQuota) {
        this.a = i2;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = z8;
        this.k = userQuota;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f);
        ivx.a(parcel, 7, this.g);
        ivx.a(parcel, 8, this.h);
        ivx.a(parcel, 9, this.i);
        ivx.a(parcel, 10, this.j);
        ivx.a(parcel, 11, this.k, i2, false);
        ivx.b(parcel, a2);
    }
}
