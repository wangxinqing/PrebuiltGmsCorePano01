package defpackage;

import java.security.Key;
import java.security.SecureRandom;
import java.util.Arrays;

/* renamed from: autr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class autr {
    public auay a = null;
    public auay b = null;
    public final SecureRandom c = new SecureRandom();

    public static boolean a(Key key, auto auto, Key key2) {
        return auto.e || !Arrays.equals(key.getEncoded(), key2.getEncoded());
    }
}
