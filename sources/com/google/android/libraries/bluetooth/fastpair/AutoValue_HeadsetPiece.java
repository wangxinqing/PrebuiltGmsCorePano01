package com.google.android.libraries.bluetooth.fastpair;

import android.net.Uri;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AutoValue_HeadsetPiece extends HeadsetPiece {
    private final int a;
    private final int b;
    private final String c;
    private final boolean d;
    private final Uri e;

    public AutoValue_HeadsetPiece(int i, int i2, String str, boolean z, Uri uri) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = z;
        this.e = uri;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final Uri e() {
        return this.e;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        String str = this.c;
        boolean z = this.d;
        String valueOf = String.valueOf(this.e);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 114 + String.valueOf(valueOf).length());
        sb.append("HeadsetPiece{lowLevelThreshold=");
        sb.append(i);
        sb.append(", batteryLevel=");
        sb.append(i2);
        sb.append(", imageUrl=");
        sb.append(str);
        sb.append(", charging=");
        sb.append(z);
        sb.append(", imageContentUri=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
