package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ConnectionEvent extends StatsEvent {
    public static final Parcelable.Creator CREATOR = new jbw();
    final int a;
    public final long b;
    public int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final long j;
    public final long k;
    private long l;

    public ConnectionEvent(int i2, long j2, int i3, String str, String str2, String str3, String str4, String str5, String str6, long j3, long j4) {
        this.a = i2;
        this.b = j2;
        this.c = i3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.l = -1;
        this.h = str5;
        this.i = str6;
        this.j = j3;
        this.k = j4;
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
        return this.l;
    }

    public final long e() {
        return 0;
    }

    public final String f() {
        String str = this.d;
        String str2 = this.e;
        String str3 = this.f;
        String str4 = this.g;
        String str5 = this.h;
        if (str5 == null) {
            str5 = "";
        }
        long j2 = this.k;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(length + 26 + length2 + length3 + String.valueOf(str4).length() + str5.length());
        sb.append("\t");
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        sb.append("\t");
        sb.append(str3);
        sb.append("/");
        sb.append(str4);
        sb.append("\t");
        sb.append(str5);
        sb.append("\t");
        sb.append(j2);
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ void g() {
        this.c = 6;
    }

    public ConnectionEvent(long j2, int i2, String str, String str2, String str3, String str4, String str5, String str6, long j3, long j4) {
        this(1, j2, i2, str, str2, str3, str4, str5, str6, j3, j4);
    }

    public final StatsEvent a(StatsEvent statsEvent) {
        StatsEvent statsEvent2 = statsEvent;
        if (!(statsEvent2 instanceof ConnectionEvent)) {
            return statsEvent2;
        }
        ConnectionEvent connectionEvent = (ConnectionEvent) statsEvent2;
        int i2 = connectionEvent.a;
        long j2 = connectionEvent.b;
        int i3 = connectionEvent.c;
        String str = connectionEvent.d;
        String str2 = connectionEvent.e;
        String str3 = connectionEvent.f;
        String str4 = connectionEvent.g;
        String str5 = connectionEvent.h;
        String str6 = connectionEvent.i;
        long j3 = connectionEvent.j;
        long j4 = connectionEvent.k;
        ConnectionEvent connectionEvent2 = connectionEvent;
        ConnectionEvent connectionEvent3 = r2;
        ConnectionEvent connectionEvent4 = new ConnectionEvent(i2, j2, i3, str, str2, str3, str4, str5, str6, j3, j4);
        connectionEvent3.c = this.c;
        connectionEvent3.l = this.j - connectionEvent2.j;
        return connectionEvent3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f, false);
        ivx.a(parcel, 7, this.g, false);
        ivx.a(parcel, 8, this.h, false);
        ivx.a(parcel, 10, this.j);
        ivx.a(parcel, 11, this.k);
        ivx.b(parcel, 12, this.c);
        ivx.a(parcel, 13, this.i, false);
        ivx.b(parcel, a2);
    }
}
