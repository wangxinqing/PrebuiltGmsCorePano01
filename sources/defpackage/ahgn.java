package defpackage;

import android.content.Context;
import android.net.Uri;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.concurrent.Executors;

/* renamed from: ahgn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahgn {
    private static final Object a = new Object();
    private static volatile ahgn b;
    private final ahgm c;

    private ahgn(ahgm ahgm) {
        this.c = ahgm;
    }

    public static ahgm a(Context context) {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    ahej ahej = new ahej();
                    ahej.a(ahfi.a);
                    ahej.b = new agzs(Arrays.asList(new ahcn[]{new aham()}));
                    ahej.a = Executors.newSingleThreadExecutor();
                    ahei a2 = ahej.a();
                    ahai a3 = ahaj.a();
                    a3.a(context.getFilesDir());
                    a3.a("mobstore_salt.pb");
                    Uri a4 = a3.a();
                    ahee g = ahef.g();
                    g.a((audx) auil.c);
                    g.a(a4);
                    ahgk ahgk = new ahgk(new SecureRandom());
                    if (g.a == null) {
                        g.a = amzy.j();
                    }
                    g.a.c(ahgk);
                    b = new ahgn(new ahgm(a2.a(g.a())));
                }
            }
        }
        return b.c;
    }
}
