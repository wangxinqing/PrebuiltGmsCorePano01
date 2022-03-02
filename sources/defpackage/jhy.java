package defpackage;

import android.util.Base64;

/* renamed from: jhy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jhy {
    public static byte[] a(String str) {
        if (str != null) {
            return Base64.decode(str, 0);
        }
        return null;
    }

    public static String b(byte[] bArr) {
        if (bArr != null) {
            return Base64.encodeToString(bArr, 0);
        }
        return null;
    }

    public static String c(byte[] bArr) {
        if (bArr != null) {
            return Base64.encodeToString(bArr, 10);
        }
        return null;
    }

    public static String d(byte[] bArr) {
        if (bArr != null) {
            return Base64.encodeToString(bArr, 11);
        }
        return null;
    }

    public static byte[] a(byte[] bArr) {
        if (bArr != null) {
            return Base64.decode(bArr, 11);
        }
        return null;
    }

    public static byte[] b(String str) {
        if (str != null) {
            return Base64.decode(str, 10);
        }
        return null;
    }

    public static byte[] c(String str) {
        if (str != null) {
            return Base64.decode(str, 11);
        }
        return null;
    }
}
