package defpackage;

import java.util.Arrays;

/* renamed from: alxk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alxk {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;

    public alxk(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, String str6) {
        alys.a((Object) str, "sessionId");
        this.a = str;
        this.b = str2;
        alys.a((Object) str3, "displayName");
        this.c = str3;
        alys.a((Object) str4, "color");
        this.d = str4;
        this.e = z;
        this.f = z2;
        alys.a((Object) str5, "photoUrl");
        this.g = str5;
        this.h = str6;
    }

    public static alxk a(String str, String str2, String str3, String str4, boolean z, String str5, String str6) {
        return new alxk(str, str2, str3, str4, false, z, str5, str6);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof alxk)) {
            return false;
        }
        alxk alxk = (alxk) obj;
        return alyr.a(this.a, alxk.a, this.b, alxk.b, this.c, alxk.c, this.d, alxk.d, Boolean.valueOf(this.e), Boolean.valueOf(alxk.e), Boolean.valueOf(this.f), Boolean.valueOf(alxk.f), this.g, alxk.g, this.h, alxk.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Boolean.valueOf(this.e), this.g, this.h});
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.h;
        String str4 = this.c;
        String str5 = this.d;
        boolean z = this.e;
        boolean z2 = this.f;
        String str6 = this.g;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        StringBuilder sb = new StringBuilder(length + 116 + length2 + length3 + length4 + String.valueOf(str5).length() + String.valueOf(str6).length());
        sb.append("SessionMetadata [sessionId=");
        sb.append(str);
        sb.append(", userId=");
        sb.append(str2);
        sb.append(", permissionId=");
        sb.append(str3);
        sb.append(", displayName=");
        sb.append(str4);
        sb.append(", color=");
        sb.append(str5);
        sb.append(", isAnonymous=");
        sb.append(z);
        sb.append(", isMe=");
        sb.append(z2);
        sb.append(", photoUrl=");
        sb.append(str6);
        sb.append("]");
        return sb.toString();
    }
}
