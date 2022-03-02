package defpackage;

import android.util.Base64;

/* renamed from: bfr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bfr {
    public static String a(byte[] bArr, boolean z) {
        return Base64.encodeToString(bArr, !z ? 2 : 11);
    }

    public static byte[] a(String str, boolean z) {
        int i;
        if (!z) {
            i = 2;
        } else {
            i = 11;
        }
        byte[] decode = Base64.decode(str, i);
        if (decode.length != 0 || str.length() <= 0) {
            return decode;
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unable to decode ") : "Unable to decode ".concat(valueOf));
    }
}
