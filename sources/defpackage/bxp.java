package defpackage;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: bxp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bxp {
    public static long a = 0;
    public static long b = 0;
    public static long c = 0;

    public static Cipher a(int i, byte[] bArr) {
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(i, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(new byte[16]));
        return instance;
    }
}
