package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* renamed from: rbi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rbi {
    private static final Pattern i = Pattern.compile("[a-z]+");
    public Context a;
    public amqy b;
    public anaf c;
    public amsv d;
    public String e;
    public Executor f;
    public aekn g;
    public afto h;
    private ahei j;
    private rbk k;

    private rbi() {
    }

    public static final afji a(rbk rbk) {
        iyc iyc = iyc.MDI_SYNC;
        afts afts = new afts();
        rbk.getClass();
        rbb rbb = new rbb();
        rbk.getClass();
        return qva.a("GmsSyncPolicyEngine", iyc, afts, rbb, new rbc());
    }

    private final afto b(Context context, rbk rbk) {
        afto afto = this.h;
        return afto == null ? new afto(context, new rbg(rbk)) : afto;
    }

    public final void a(rbo rbo) {
        this.c = rbo.a;
    }

    public final aekn c() {
        aekn aekn = this.g;
        return aekn == null ? new aekp() : aekn;
    }

    public final rbk d() {
        rbk rbk = this.k;
        return rbk == null ? new rbk() : rbk;
    }

    public static final aftv a(Context context) {
        return new aftv(context);
    }

    public static rbd a(Context context, String str, String str2, aekn aekn, amqy amqy) {
        return new rbd(context, str, str2, aekn, amqy);
    }

    public final void b() {
        a((Object) this.a, "setContext");
        a((Object) this.c, "setTaskConfigMap");
        a((Object) this.d, "setGmsTaskScheduler");
        a((Object) this.f, "setScheduleExecutor");
        if (this.b != null) {
            anhj a2 = this.c.values().iterator();
            while (a2.hasNext()) {
                rav rav = (rav) a2.next();
                if (rav.d() != null) {
                    String valueOf = String.valueOf(rav);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67);
                    sb.append("Both policiesMap and TaskConfig.policySupplier are set! taskConfig=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            return;
        }
        anhj a3 = this.c.values().iterator();
        while (a3.hasNext()) {
            rav rav2 = (rav) a3.next();
            if (rav2.d() == null) {
                String valueOf2 = String.valueOf(rav2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 38);
                sb2.append("TaskConfig is missing policySupplier: ");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public static rbi a() {
        return new rbi();
    }

    private static void a(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(str.length() + 28);
            sb.append("Must call ");
            sb.append(str);
            sb.append("() before build().");
            throw new IllegalStateException(sb.toString());
        }
    }

    public final amqy a(Context context, rbk rbk) {
        return new rba(b(context, rbk));
    }

    public final void b(Context context) {
        amrl.a((Object) context);
        this.a = context;
    }

    public final qyp a(aucp aucp) {
        String str;
        String str2;
        b();
        a((Object) this.j, "setProtoDataStoreFactory");
        a((Object) this.e, "setModuleName");
        Context context = this.a;
        rbk d2 = d();
        afji a2 = a(d2);
        Executor executor = this.f;
        ray ray = new ray(context, executor);
        aekn c2 = c();
        afyz a3 = afza.a(aucp);
        a3.c = c2;
        a3.a(this.j);
        a3.d = jjg.a("SyncMetadataManager", iyc.MDI_SYNC);
        afza a4 = a3.a();
        amqy amqy = this.b;
        anaf anaf = this.c;
        amsv amsv = this.d;
        aftv a5 = a(context);
        rbd a6 = a(context, this.e, "syncPolicyEngine", c2, a(context, d2));
        rbh rbh = new rbh(context, this.e, "syncPolicyEngine");
        String packageName = context.getPackageName();
        if (!rbk.d()) {
            str = "syncPolicyEngine";
        } else {
            str = this.e;
        }
        if (!rbk.d()) {
            str2 = this.e;
        } else {
            str2 = "";
        }
        afto b2 = b(context, d2);
        b2.getClass();
        return new ras(d2, a2, amqy, anaf, amsv, executor, a5, a6, ray, a4, rbh, new aftw(packageName, str, str2, new raz(b2), new afts()));
    }

    public final void b(rbk rbk) {
        amrl.a((Object) rbk);
        this.k = rbk;
    }

    public final void a(ahei ahei) {
        amrl.a((Object) ahei);
        this.j = ahei;
    }

    @Deprecated
    public final void a(amqy amqy) {
        amrl.a((Object) amqy);
        this.b = amqy;
    }

    public final void a(amsv amsv) {
        amrl.a((Object) amsv);
        this.d = amsv;
    }

    @Deprecated
    public final void a(anaf anaf) {
        amrl.a((Object) anaf);
        this.c = anaf;
    }

    public final void a(String str) {
        amrl.a(i.matcher(str).matches());
        this.e = str;
    }

    public final void a(Executor executor) {
        amrl.a((Object) executor);
        this.f = executor;
    }
}
