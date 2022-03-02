package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator CREATOR = new jdp();
    final int a;
    public final long b;
    public int c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final List h;
    public final String i;
    public final long j;
    public int k;
    public final String l;
    public final float m;
    public final long n;
    public final boolean o;
    public long p;

    public WakeLockEvent(int i2, long j2, int i3, String str, int i4, List list, String str2, long j3, int i5, String str3, String str4, float f2, long j4, String str5, boolean z) {
        this.a = i2;
        this.b = j2;
        this.c = i3;
        this.d = str;
        this.e = str3;
        this.f = str5;
        this.g = i4;
        this.p = -1;
        this.h = list;
        this.i = str2;
        this.j = j3;
        this.k = i5;
        this.l = str4;
        this.m = f2;
        this.n = j4;
        this.o = z;
    }

    public final long a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final String c() {
        return this.i;
    }

    public final long d() {
        return this.p;
    }

    public final long e() {
        return this.n;
    }

    public final String f() {
        String str;
        String str2 = this.d;
        int i2 = this.g;
        List list = this.h;
        String str3 = "";
        if (list != null) {
            str = TextUtils.join(",", list);
        } else {
            str = str3;
        }
        int i3 = this.k;
        String str4 = this.e;
        if (str4 == null) {
            str4 = str3;
        }
        String str5 = this.l;
        if (str5 == null) {
            str5 = str3;
        }
        float f2 = this.m;
        String str6 = this.f;
        if (str6 != null) {
            str3 = str6;
        }
        boolean z = this.o;
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str).length();
        int length3 = str4.length();
        StringBuilder sb = new StringBuilder(length + 51 + length2 + length3 + str5.length() + str3.length());
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i3);
        sb.append("\t");
        sb.append(str4);
        sb.append("\t");
        sb.append(str5);
        sb.append("\t");
        sb.append(f2);
        sb.append("\t");
        sb.append(str3);
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ void g() {
        int i2;
        long j2 = this.n;
        if (j2 != 0) {
            this.p = j2;
        }
        int i3 = this.c;
        if (i3 == 7) {
            i2 = 9;
        } else if (i3 == 10) {
            i2 = 12;
        } else {
            return;
        }
        this.c = i2;
    }

    public WakeLockEvent(long j2, int i2, String str, int i3, List list, String str2, long j3, int i4, String str3, String str4, float f2, long j4, String str5, boolean z) {
        this(2, j2, i2, str, i3, list, str2, j3, i4, str3, str4, f2, j4, str5, z);
    }

    public final StatsEvent a(StatsEvent statsEvent) {
        StatsEvent statsEvent2 = statsEvent;
        if (!(statsEvent2 instanceof WakeLockEvent)) {
            return statsEvent2;
        }
        WakeLockEvent wakeLockEvent = (WakeLockEvent) statsEvent2;
        int i2 = wakeLockEvent.a;
        int i3 = i2;
        WakeLockEvent wakeLockEvent2 = new WakeLockEvent(i3, wakeLockEvent.b, wakeLockEvent.c, wakeLockEvent.d, wakeLockEvent.g, wakeLockEvent.h, wakeLockEvent.i, wakeLockEvent.j, wakeLockEvent.k, wakeLockEvent.e, wakeLockEvent.l, wakeLockEvent.m, wakeLockEvent.n, wakeLockEvent.f, wakeLockEvent.o);
        wakeLockEvent2.c = this.c;
        wakeLockEvent2.p = this.j - wakeLockEvent.j;
        return wakeLockEvent2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 4, this.d, false);
        ivx.b(parcel, 5, this.g);
        ivx.b(parcel, 6, this.h, false);
        ivx.a(parcel, 8, this.j);
        ivx.a(parcel, 10, this.e, false);
        ivx.b(parcel, 11, this.c);
        ivx.a(parcel, 12, this.i, false);
        ivx.a(parcel, 13, this.l, false);
        ivx.b(parcel, 14, this.k);
        ivx.a(parcel, 15, this.m);
        ivx.a(parcel, 16, this.n);
        ivx.a(parcel, 17, this.f, false);
        ivx.a(parcel, 18, this.o);
        ivx.b(parcel, a2);
    }
}
