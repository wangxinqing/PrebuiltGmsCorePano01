package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: tww  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tww {
    private static final anax a = anax.a((Object) babj.l, (Object) babj.n);
    private final tss b;

    public tww(tss tss) {
        this.b = tss;
    }

    /* access modifiers changed from: package-private */
    public final twv a(Context context, ClientContext clientContext, avuu avuu, boolean z) {
        boolean z2 = false;
        if (!z) {
            try {
                jjg jjg = tsp.a;
                twu c = twv.c();
                c.a(avuv.FAILURE);
                c.a(false);
                return c.a();
            } catch (babk e) {
                anih anih = (anih) tsp.a.c();
                anih.a((Throwable) e);
                anih.a("FastPair: Failed to send device to FMA");
                twu c2 = twv.c();
                c2.a(avuv.FAILURE);
                c2.a(!a.contains(e.a));
                return c2.a();
            } catch (eif e2) {
                anih anih2 = (anih) tsp.a.c();
                anih2.a((Throwable) e2);
                anih2.a("FastPair: Failed to send device to FMA");
                twu c3 = twv.c();
                c3.a(avuv.FAILURE);
                c3.a(true);
                return c3.a();
            }
        } else {
            tss tss = this.b;
            if (tss.b == null) {
                tss.b = baaj.a(baai.UNARY, "security.fma.WirelessAndroidSecurityFmaService/StoreAccessory", baoq.a(avuu.g), baoq.a(avuw.b));
            }
            avuv a2 = avuv.a(((avuw) tss.a.a(tss.b, clientContext, avuu, 10000, TimeUnit.MILLISECONDS)).a);
            if (a2 == null) {
                a2 = avuv.UNRECOGNIZED;
            }
            ((tsu) thl.a(context, tsu.class)).a(asom.FIND_MY_ACCESSORY_UPLOADED);
            twu c4 = twv.c();
            c4.a(a2);
            if (a2 != avuv.SUCCESS) {
                z2 = true;
            }
            c4.a(z2);
            return c4.a();
        }
    }
}
