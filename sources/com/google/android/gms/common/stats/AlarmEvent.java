package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AlarmEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new jbp();
    final int a;
    public final long b;
    public int c;
    public final String d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;
    public final int i;
    public int j;
    public final String k;
    public final float l;

    public AlarmEvent(int i2, long j2, int i3, String str, long j3, long j4, long j5, List list, int i4, int i5, String str2, float f2) {
        this.a = i2;
        this.b = j2;
        this.c = i3;
        this.d = str;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = list;
        this.i = i4;
        this.j = i5;
        this.k = str2;
        this.l = f2;
    }

    public final String toString() {
        String str;
        long j2 = this.b;
        int i2 = this.c;
        String str2 = this.d;
        long j3 = this.e;
        long j4 = this.f;
        long j5 = this.g;
        int i3 = this.i;
        List list = this.h;
        String str3 = "";
        if (list != null) {
            str = TextUtils.join(",", list);
        } else {
            str = str3;
        }
        int i4 = this.j;
        String str4 = this.k;
        if (str4 != null) {
            str3 = str4;
        }
        float f2 = this.l;
        int length = String.valueOf(str2).length();
        float f3 = f2;
        StringBuilder sb = new StringBuilder(length + 138 + String.valueOf(str).length() + str3.length());
        sb.append(j2);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(j3);
        sb.append("\t");
        sb.append(j4);
        sb.append("\t");
        sb.append(j5);
        sb.append("\t");
        sb.append(i3);
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i4);
        sb.append("\t");
        sb.append(str3);
        sb.append("\t");
        sb.append(f3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.b(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f);
        ivx.a(parcel, 7, this.g);
        ivx.b(parcel, 8, this.h, false);
        ivx.b(parcel, 9, this.i);
        ivx.b(parcel, 10, this.j);
        ivx.a(parcel, 11, this.k, false);
        ivx.a(parcel, 12, this.l);
        ivx.b(parcel, a2);
    }
}
