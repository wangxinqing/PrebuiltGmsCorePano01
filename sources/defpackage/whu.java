package defpackage;

import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: whu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class whu {
    public static int a(String str) {
        return str.getBytes(Charset.forName("UTF-8")).length;
    }

    public static boolean a(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("[ ");
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(String.format("0x%02x ", new Object[]{Byte.valueOf(bArr[i])}));
        }
        sb.append("]");
        return sb.toString();
    }

    public static String c(byte[] bArr) {
        int i = 0;
        int i2 = 1;
        for (byte b : bArr) {
            i = (i + (b * i2)) % 9973;
            i2 = (i2 * 31) % 9973;
        }
        return String.format(Locale.US, "%04d", new Object[]{Integer.valueOf(Math.abs(i))});
    }

    public static byte[] a(int i) {
        return a(i, new SecureRandom());
    }

    public static byte[] a(int i, SecureRandom secureRandom) {
        byte[] bArr = new byte[i];
        secureRandom.nextBytes(bArr);
        return bArr;
    }

    public static byte[] a(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return bArr2;
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr2.length == 0) {
            ((anih) ((anih) vvj.a.c()).a("whu", "a", 103, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Salt cannot be empty.");
            return null;
        }
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            try {
                instance.init(new SecretKeySpec(bArr2, "HmacSHA256"));
                return instance.doFinal(bArr);
            } catch (InvalidKeyException e) {
                anih anih = (anih) vvj.a.c();
                anih.a((Throwable) e);
                ((anih) anih.a("whu", "a", 118, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Invalid key.");
                return null;
            }
        } catch (NoSuchAlgorithmException e2) {
            anih anih2 = (anih) vvj.a.c();
            anih2.a((Throwable) e2);
            ((anih) anih2.a("whu", "a", 111, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("No such algorithm %s", (Object) "HmacSHA256");
            return null;
        }
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, int i) {
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            if (i > instance.getMacLength() * 255) {
                ((anih) ((anih) vvj.a.c()).a("whu", "a", 141, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Size too large.");
                return null;
            } else if (bArr2.length != 0) {
                try {
                    instance.init(new SecretKeySpec(bArr2, "HmacSHA256"));
                    byte[] bArr3 = new byte[i];
                    try {
                        instance.init(new SecretKeySpec(instance.doFinal(bArr), "HmacSHA256"));
                        byte[] bArr4 = new byte[0];
                        int i2 = 1;
                        int i3 = 0;
                        while (true) {
                            instance.update(bArr4);
                            instance.update((byte) i2);
                            bArr4 = instance.doFinal();
                            int length = bArr4.length;
                            int i4 = i3 + length;
                            if (i4 < i) {
                                System.arraycopy(bArr4, 0, bArr3, i3, length);
                                i2++;
                                i3 = i4;
                            } else {
                                System.arraycopy(bArr4, 0, bArr3, i3, i - i3);
                                return bArr3;
                            }
                        }
                    } catch (InvalidKeyException e) {
                        anih anih = (anih) vvj.a.c();
                        anih.a((Throwable) e);
                        ((anih) anih.a("whu", "a", 164, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Invalid key.");
                        return null;
                    }
                } catch (InvalidKeyException e2) {
                    anih anih2 = (anih) vvj.a.c();
                    anih2.a((Throwable) e2);
                    ((anih) anih2.a("whu", "a", 153, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Invalid key.");
                    return null;
                }
            } else {
                ((anih) ((anih) vvj.a.c()).a("whu", "a", 146, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Key cannot be empty.");
                return null;
            }
        } catch (NoSuchAlgorithmException e3) {
            anih anih3 = (anih) vvj.a.c();
            anih3.a((Throwable) e3);
            ((anih) anih3.a("whu", "a", 136, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("No such algorithm %s", (Object) "HmacSHA256");
            return null;
        }
    }
}
