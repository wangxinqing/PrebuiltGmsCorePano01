package defpackage;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.KeyGenerator;

/* renamed from: lrj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lrj {
    public static KeyGenerator a;

    static {
        a = null;
        try {
            SecureRandom secureRandom = new SecureRandom();
            secureRandom.nextLong();
            KeyGenerator instance = KeyGenerator.getInstance("AES");
            a = instance;
            instance.init(128, secureRandom);
        } catch (NoSuchAlgorithmException e) {
        }
    }
}
