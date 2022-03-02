package com.google.android.libraries.bluetooth.fastpair;

import android.net.Uri;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AutoValue_TrueWirelessHeadset extends TrueWirelessHeadset {
    private final String a;
    private final HeadsetPiece b;
    private final HeadsetPiece c;
    private final HeadsetPiece d;
    private final long e;
    private final String f;
    private final long g;
    private final Uri h;

    public AutoValue_TrueWirelessHeadset(String str, HeadsetPiece headsetPiece, HeadsetPiece headsetPiece2, HeadsetPiece headsetPiece3, long j, String str2, long j2, Uri uri) {
        this.a = str;
        this.b = headsetPiece;
        this.c = headsetPiece2;
        this.d = headsetPiece3;
        this.e = j;
        this.f = str2;
        this.g = j2;
        this.h = uri;
    }

    public final String a() {
        return this.a;
    }

    public final HeadsetPiece b() {
        return this.b;
    }

    public final HeadsetPiece c() {
        return this.c;
    }

    public final HeadsetPiece d() {
        return this.d;
    }

    public final long e() {
        return this.e;
    }

    public final String f() {
        return this.f;
    }

    public final long g() {
        return this.g;
    }

    public final Uri h() {
        return this.h;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        long j = this.e;
        String str2 = this.f;
        long j2 = this.g;
        String valueOf4 = String.valueOf(this.h);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 200 + length2 + length3 + length4 + String.valueOf(str2).length() + String.valueOf(valueOf4).length());
        sb.append("TrueWirelessHeadset{name=");
        sb.append(str);
        sb.append(", leftBud=");
        sb.append(valueOf);
        sb.append(", rightBud=");
        sb.append(valueOf2);
        sb.append(", headsetCase=");
        sb.append(valueOf3);
        sb.append(", lastUpdateElapsedRealtimeMillis=");
        sb.append(j);
        sb.append(", modelId=");
        sb.append(str2);
        sb.append(", firstObservationTimestampMillis=");
        sb.append(j2);
        sb.append(", mainIconContentUri=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
