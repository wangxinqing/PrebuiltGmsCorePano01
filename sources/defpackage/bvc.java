package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import java.util.concurrent.TimeUnit;

/* renamed from: bvc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bvc {
    public static void a(PendingIntent pendingIntent, Intent intent, String str) {
        boolean K = awuz.a.a().K();
        bvb bvb = new bvb(K);
        if (K) {
            bwn k = cbi.k();
            bvp bvp = bvb.b;
            new Object[1][0] = bvp.a;
            clj D = cbi.D();
            if (D != null) {
                D.a(bvp);
            }
            bvp.b();
            bwl bwl = k.c;
            int i = bwl.b;
            bwl.a(D, bvp);
        }
        int i2 = Build.VERSION.SDK_INT;
        String creatorPackage = pendingIntent.getCreatorPackage();
        Object[] objArr = {pendingIntent, creatorPackage, str};
        jjy.a(pendingIntent, cbi.f(), intent, (PendingIntent.OnFinished) bvb, str);
        if (!K) {
            try {
                if (!bvb.a.await(5000, TimeUnit.MILLISECONDS)) {
                    ((anih) ((anih) bxk.a.c()).a("bvc", "a", 66, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[PendingIntentCompat] Timed out delivering to pendingIntent=%s, package=%s, permission=%s", (Object) pendingIntent, (Object) creatorPackage, (Object) str);
                }
            } catch (InterruptedException e) {
                ((anih) ((anih) bxk.a.c()).a("bvc", "a", 75, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[PendingIntentCompat] Interrupted while delivering pendingIntent=%s, package=%s, permission=%s", (Object) pendingIntent, (Object) creatorPackage, (Object) str);
            }
        }
    }
}
