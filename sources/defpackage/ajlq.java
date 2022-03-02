package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.android.location.reporting.state.update.AccountConfig;

/* renamed from: ajlq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajlq {
    private static ajlq e;
    public final Context a;
    public final ajmm b;
    public final long c = SystemClock.elapsedRealtime();
    public final long d;

    private ajlq(Context context, ajmm ajmm, long j) {
        this.a = context;
        this.b = ajmm;
        this.d = j;
    }

    public static synchronized ajlq a(Context context, ajmm ajmm) {
        ajlq ajlq;
        long j;
        Long l;
        synchronized (ajlq.class) {
            if (e == null) {
                if (azsd.b()) {
                    ajmp a2 = ajmp.a(context);
                    if (a2.a.contains("reportingAutoenableManagerInitTimeMillisKey")) {
                        l = Long.valueOf(a2.a.getLong("reportingAutoenableManagerInitTimeMillisKey", 0));
                    } else {
                        l = null;
                    }
                    if (l == null) {
                        j = System.currentTimeMillis();
                        SharedPreferences.Editor edit = a2.a.edit();
                        edit.putLong("reportingAutoenableManagerInitTimeMillisKey", j);
                        edit.apply();
                    } else {
                        j = l.longValue();
                    }
                } else {
                    j = -1;
                }
                e = new ajlq(context, ajmm, j);
            }
            ajlq = e;
        }
        return ajlq;
    }

    public final boolean b(Account account) {
        return aztb.a.a().ae() && !aztb.A() && this.b.a.b.getBoolean(ajmr.r(account), true);
    }

    /* access modifiers changed from: package-private */
    public final boolean c(Account account) {
        return this.b.a.b.getBoolean(ajmr.t(account), false);
    }

    /* access modifiers changed from: package-private */
    public final boolean d(Account account) {
        return this.b.a.b.getBoolean(ajmr.u(account), false);
    }

    public final void e(Account account) {
        if (b(account)) {
            boolean z = false;
            if (b(account) && c(account) && d(account) && this.b.a(account).h()) {
                z = true;
            }
            String a2 = rmp.a(account);
            boolean b2 = b(account);
            boolean c2 = c(account);
            boolean d2 = d(account);
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 100);
            sb.append("AutoEnableManager shouldSwitchOnReporting for ");
            sb.append(a2);
            sb.append(": isEl=");
            sb.append(b2);
            sb.append(" isNew=");
            sb.append(c2);
            sb.append(" isHEnabled=");
            sb.append(d2);
            sb.append(" result=");
            sb.append(z);
            sb.toString();
            if (z) {
                String valueOf = String.valueOf(rmp.a(account));
                ajix.a("GCoreUlr", valueOf.length() == 0 ? new String("AutoEnableManager setReportingEnabled for ") : "AutoEnableManager setReportingEnabled for ".concat(valueOf));
                AccountConfig a3 = this.b.a(account);
                if (a3.b() != 1) {
                    a(account);
                    if (azte.b()) {
                        ajjb.a("UlrAutoEnableEvents", 6);
                        return;
                    }
                    return;
                }
                ajmz a4 = ajna.a(account, "com.google.android.gms+autoenabled");
                a4.a(a3.c);
                a4.g = true;
                a4.a(true);
                this.b.a("ReportingAutoEnableManager.setReportingEnabled", a4.a(), "autoenable");
                if (azte.b()) {
                    ajjb.a("UlrAutoEnableEvents", 1);
                }
                a(account);
                if (azte.b()) {
                    ajjb.a("UlrAutoEnableEvents", 7);
                }
            }
        }
    }

    public final void a(Account account) {
        String valueOf = String.valueOf(rmp.a(account));
        ajix.a("GCoreUlr", valueOf.length() == 0 ? new String("AutoEnableManager setIneligible for ") : "AutoEnableManager setIneligible for ".concat(valueOf));
        ajmr ajmr = this.b.a;
        String r = ajmr.r(account);
        SharedPreferences.Editor edit = ajmr.b.edit();
        edit.putBoolean(r, false);
        edit.apply();
        ajmm ajmm = this.b;
        ajmm.b(account, false);
        ajmm.c(account, false);
    }
}
