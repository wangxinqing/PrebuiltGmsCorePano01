package com.google.location.nearby.common.fastpair.slice;

import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AutoValue_DeviceDetailsLinks extends DeviceDetailsLinks {
    private final byte[] a;
    private final boolean b;
    private final String c;
    private final String d;
    private final boolean e;
    private final String f;
    private final String g;

    public AutoValue_DeviceDetailsLinks(byte[] bArr, boolean z, String str, String str2, boolean z2, String str3, String str4) {
        this.a = bArr;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = z2;
        this.f = str3;
        this.g = str4;
    }

    public final byte[] a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.g;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        boolean z = this.b;
        String str = this.c;
        String str2 = this.d;
        boolean z2 = this.e;
        String str3 = this.f;
        String str4 = this.g;
        int length = String.valueOf(arrays).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 134 + length2 + length3 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("DeviceDetailsLinks{accountKey=");
        sb.append(arrays);
        sb.append(", assistantSupported=");
        sb.append(z);
        sb.append(", actionUrl=");
        sb.append(str);
        sb.append(", address=");
        sb.append(str2);
        sb.append(", firmwareUpdateAvailable=");
        sb.append(z2);
        sb.append(", authority=");
        sb.append(str3);
        sb.append(", signature=");
        sb.append(str4);
        sb.append("}");
        return sb.toString();
    }
}
