package defpackage;

import android.util.Base64;

/* renamed from: mae  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mae {
    public static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public static String b(String str) {
        return a(a(str));
    }

    public static byte[] a(String str) {
        String valueOf = String.valueOf(str);
        return (valueOf.length() == 0 ? new String("ERROR : ") : "ERROR : ".concat(valueOf)).getBytes();
    }
}
