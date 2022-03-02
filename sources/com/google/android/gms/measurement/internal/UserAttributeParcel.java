package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UserAttributeParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new szh();
    public final int a;
    public final String b;
    public final long c;
    public final Long d;
    public final String e;
    public final String f;
    public final Double g;

    public UserAttributeParcel(int i, String str, long j, Long l, Float f2, String str2, String str3, Double d2) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = l;
        if (i == 1) {
            this.g = f2 != null ? Double.valueOf(f2.doubleValue()) : null;
        } else {
            this.g = d2;
        }
        this.e = str2;
        this.f = str3;
    }

    public final Object a() {
        Long l = this.d;
        if (l != null) {
            return l;
        }
        Double d2 = this.g;
        if (d2 != null) {
            return d2;
        }
        String str = this.e;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        szh.a(this, parcel);
    }

    public UserAttributeParcel(String str) {
        iva.c(str);
        this.a = 2;
        this.b = str;
        this.c = 0;
        this.d = null;
        this.g = null;
        this.e = null;
        this.f = null;
    }

    public UserAttributeParcel(String str, long j, Object obj, String str2) {
        iva.c(str);
        this.a = 2;
        this.b = str;
        this.c = j;
        this.f = str2;
        if (obj == null) {
            this.d = null;
            this.g = null;
            this.e = null;
        } else if (obj instanceof Long) {
            this.d = (Long) obj;
            this.g = null;
            this.e = null;
        } else if (obj instanceof String) {
            this.d = null;
            this.g = null;
            this.e = (String) obj;
        } else if (obj instanceof Double) {
            this.d = null;
            this.g = (Double) obj;
            this.e = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public UserAttributeParcel(szi szi) {
        this(szi.c, szi.d, szi.e, szi.b);
    }
}
