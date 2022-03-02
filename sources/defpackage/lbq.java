package defpackage;

import java.util.Locale;

/* renamed from: lbq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lbq {
    public final String a;

    private lbq(String str) {
        this.a = str.toLowerCase(Locale.US);
    }

    public static lbq a(String str) {
        boolean z = true;
        if (str != null && str.isEmpty()) {
            z = false;
        }
        iva.b(z);
        if (str != null) {
            return new lbq(str);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this.a.equals(((lbq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }

    public final boolean a() {
        return this.a.equals("application/vnd.google-apps.drive-sdk");
    }
}
