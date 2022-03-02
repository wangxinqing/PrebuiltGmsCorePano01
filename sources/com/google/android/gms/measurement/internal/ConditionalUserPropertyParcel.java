package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ConditionalUserPropertyParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new spd();
    public String a;
    public String b;
    public UserAttributeParcel c;
    public long d;
    public boolean e;
    public String f;
    public EventParcel g;
    public long h;
    public EventParcel i;
    public long j;
    public EventParcel k;

    public ConditionalUserPropertyParcel(ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        iva.a((Object) conditionalUserPropertyParcel);
        this.a = conditionalUserPropertyParcel.a;
        this.b = conditionalUserPropertyParcel.b;
        this.c = conditionalUserPropertyParcel.c;
        this.d = conditionalUserPropertyParcel.d;
        this.e = conditionalUserPropertyParcel.e;
        this.f = conditionalUserPropertyParcel.f;
        this.g = conditionalUserPropertyParcel.g;
        this.h = conditionalUserPropertyParcel.h;
        this.i = conditionalUserPropertyParcel.i;
        this.j = conditionalUserPropertyParcel.j;
        this.k = conditionalUserPropertyParcel.k;
    }

    public ConditionalUserPropertyParcel(String str, String str2, UserAttributeParcel userAttributeParcel, long j2, boolean z, String str3, EventParcel eventParcel, long j3, EventParcel eventParcel2, long j4, EventParcel eventParcel3) {
        this.a = str;
        this.b = str2;
        this.c = userAttributeParcel;
        this.d = j2;
        this.e = z;
        this.f = str3;
        this.g = eventParcel;
        this.h = j3;
        this.i = eventParcel2;
        this.j = j4;
        this.k = eventParcel3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c, i2, false);
        ivx.a(parcel, 5, this.d);
        ivx.a(parcel, 6, this.e);
        ivx.a(parcel, 7, this.f, false);
        ivx.a(parcel, 8, this.g, i2, false);
        ivx.a(parcel, 9, this.h);
        ivx.a(parcel, 10, this.i, i2, false);
        ivx.a(parcel, 11, this.j);
        ivx.a(parcel, 12, this.k, i2, false);
        ivx.b(parcel, a2);
    }
}
