package defpackage;

import android.content.Intent;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: sgp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sgp implements ska {
    public static final anij a = sjk.b();
    public final qyp b;
    public final afji c;
    public final shf d;
    private final Executor e;

    public sgp(qyp qyp, shf shf, Executor executor, afji afji) {
        this.b = qyp;
        this.d = shf;
        this.e = executor;
        this.c = afji;
    }

    static final /* synthetic */ Void a(Boolean bool) {
        if (bool.booleanValue()) {
            a.d().a("sgp", "a", 115, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Profile sync successfully scheduled.");
            return null;
        }
        a.d().a("sgp", "a", 117, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Profile sync disabled.");
        return null;
    }

    public final aorr a() {
        a.d().a("sgp", "a", 110, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Scheduling a profile sync in reaction to push message...");
        return aopr.a(this.b.e(slq.PROFILE_SYNC), sgo.a, (Executor) aoqm.a);
    }

    public final aorr a(Intent intent) {
        aorr aorr;
        if (!aygz.a.a().d()) {
            a.d().a("sgp", "a", 53, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Profile sync push handler disabled, skipping push message handling...");
            return aorl.a((Object) null);
        } else if (!aygz.a.a().e() ? !intent.hasExtra(aygz.a.a().l()) : !(intent.hasExtra("notification_type") && "sgbe_update_profile".equals(intent.getStringExtra("notification_type")))) {
            a.d().a("sgp", "a", 58, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Message not relevant for profile sync, skipping push message handling...");
            return aorl.a((Object) null);
        } else if (!aygz.a.a().c()) {
            return a();
        } else {
            if (!intent.hasExtra("user_id")) {
                aorr = aorl.a((Object) null);
            } else {
                String stringExtra = intent.getStringExtra("user_id");
                amrl.a((Object) stringExtra);
                aorr = aorl.a((Callable) new sgl(this, stringExtra), this.e);
            }
            return aopr.a(aopr.a((aorr) aoqw.c(aorr), (aoqb) new sgj(this), (Executor) aoqm.a), (aoqb) new sgk(this), (Executor) aoqm.a);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void a(Exception exc) {
        int i;
        afji afji = this.c;
        if (!(exc instanceof IOException)) {
            i = 6;
        } else {
            i = 5;
        }
        anie a2 = afji.a(i);
        a2.a((Throwable) exc);
        ((anih) ((anih) a2).a("sgp", "a", 102, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to notify account that profile push occurred!");
        return null;
    }
}
