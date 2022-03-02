package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: addx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class addx {
    private static final Object c = new Object();
    private static volatile addx d;
    public rbo a;
    public final addt b;
    private final Context e;
    private final ahei f;
    private final afyw g;
    private final adde h;
    private final Executor i;
    private final Executor j;
    private final Object k = new Object();
    private volatile raw l = null;

    private addx(Context context) {
        this.e = context;
        agzs agzs = new agzs(amzy.a((Object) agzx.a(context).a()));
        ahej ahej = new ahej();
        ahej.a = jfm.a(10);
        ahej.b = agzs;
        ahej.a(ahdx.a);
        long D = azrk.a.a().D();
        if (D != 0) {
            ahgm a2 = ahgn.a(context);
            ahgf a3 = ahgg.a(context);
            a3.b = jfm.b(10);
            a3.c = afjn.a((aekn) new aekp(), a2.a(), (int) D);
            ahej.a(a3.a(), a2);
        }
        this.f = ahej.a();
        this.g = new afyw(context, agzs, "udcmobstoreprivate");
        this.h = new adde(new addr(context), new afts(), adds.a);
        this.b = new addt(context, new aftl(new aekp(), (int) azrk.a.a().v()));
        this.i = jfm.a(10);
        this.j = jfm.a(9);
        if (azrk.o()) {
            amqy a4 = a();
            rbn rbn = new rbn(aczd.SYNC_ID_UNKNOWN);
            rbn.a(aczd.SYNC_ID_CUSTOM_CACHE, rav.a("com.google.android.gms.udc.service.UdcContextInitService", "UdcSyncPeriodic", "UdcSyncOneOff", new addu(a4)));
            this.a = rbn.a();
        }
    }

    public static addx a(Context context) {
        if (d == null) {
            synchronized (c) {
                if (d == null) {
                    d = new addx(context.getApplicationContext());
                }
            }
        }
        return d;
    }

    public static ahei b(Context context) {
        return a(context).f;
    }

    public static afyw c(Context context) {
        return a(context).g;
    }

    public static adde d(Context context) {
        return a(context).h;
    }

    public static afyy e(Context context) {
        afyx afyx = new afyx();
        afyz a2 = afza.a(acyn.h);
        a2.a(b(context));
        afyx.b = a2.a();
        afyw c2 = c(context);
        if (c2 != null) {
            afyx.a = c2;
            String str = afyx.a == null ? " mobstoreHelper" : "";
            if (afyx.b == null) {
                str = str.concat(" pdsSyncMetadataManagerFactory");
            }
            if (str.isEmpty()) {
                return new afyu(afyx.a, afyx.b);
            }
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
        }
        throw new NullPointerException("Null mobstoreHelper");
    }

    public static Executor f(Context context) {
        return a(context).i;
    }

    public static raw g(Context context) {
        addx a2 = a(context);
        if (a2.l == null) {
            synchronized (a2.k) {
                if (a2.l == null) {
                    Context context2 = a2.e;
                    addx a3 = a(context2);
                    rbi a4 = rbi.a();
                    a4.b(context2);
                    rbo rbo = a3.a;
                    if (rbo == null) {
                        a4.a(a());
                        a4.a(anaf.a(aczd.SYNC_ID_CUSTOM_CACHE, rav.a("com.google.android.gms.udc.service.UdcContextInitService", "UdcSyncPeriodic", "UdcSyncOneOff")));
                    } else {
                        a4.a(rbo);
                    }
                    a4.a((amsv) new addv(context2));
                    a4.a(a3.j);
                    a4.b();
                    rbk d2 = a4.d();
                    a2.l = new ras(d2, rbi.a(d2), a4.b, a4.c, a4.d, a4.f, rbi.a(a4.a), rbi.a(a4.a, a4.e, "syncPolicyEngine", a4.c(), a4.a(a4.a, d2)), rax.a, (afza) null, (rbh) null, (aftw) null);
                }
            }
        }
        return a2.l;
    }

    private static amqy a() {
        return !azrk.a.a().p() ? new qyo() : addw.a;
    }
}
