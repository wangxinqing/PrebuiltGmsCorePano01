package defpackage;

import android.content.Context;
import java.security.NoSuchAlgorithmException;

/* renamed from: tud  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tud {
    public static final /* synthetic */ int a = 0;
    private static final String[] b = {"f00209", "f0020a", "f0020b", "f0020c", "f0020d", "f0020e", "f0020f", "f00210", "f00211", "f00212", "f00213", "f00214", "f00215", "f00400", "3e7f38", "750aca", "973e22", "b1f601", "1cc144", "641c2c", "6b1c64", "87bd86", "d46c23"};

    public static tuc a(Context context, arwc arwc, byte[] bArr) {
        try {
            byte[] a2 = aegb.a(context);
            for (String str : b) {
                byte[] a3 = aegb.a(a2, str);
                if (arwc.a(aooa.a(a3, bArr))) {
                    ((anih) tsp.a.d()).a("FastPairPrototype: Found a match model id %s.", (Object) str);
                    return new tuc(str, a3);
                }
            }
            return null;
        } catch (NoSuchAlgorithmException e) {
            anih anih = (anih) tsp.a.c();
            anih.a((Throwable) e);
            anih.a("FastPairPrototype: Can't generate key.");
            return null;
        }
    }
}
