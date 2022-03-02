package defpackage;

import android.os.Build;

/* renamed from: mav  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mav {
    private final String a;

    public mav(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mav) {
            return this.a.equals(((mav) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = Build.FINGERPRINT;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("/20.12.16 (080306-{{cl}})/");
        sb.append(str2);
        return sb.toString();
    }
}
