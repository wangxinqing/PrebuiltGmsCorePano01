package defpackage;

import android.content.SharedPreferences;

/* renamed from: dpp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dpp extends dma {
    public SharedPreferences a;
    public final dpo b;
    private long c;
    private long e = -1;

    protected dpp(dmd dmd) {
        super(dmd);
        f();
        this.b = new dpo(this, "monitoring", ((Long) doz.F.a()).longValue());
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.a = d().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public final long b() {
        dkw.a();
        q();
        long j = this.c;
        if (j != 0) {
            return j;
        }
        long j2 = this.a.getLong("first_run", 0);
        if (j2 == 0) {
            long a2 = c().a();
            SharedPreferences.Editor edit = this.a.edit();
            edit.putLong("first_run", a2);
            if (!edit.commit()) {
                d("Failed to commit first run time");
            }
            this.c = a2;
            return a2;
        }
        this.c = j2;
        return j2;
    }

    public final long s() {
        dkw.a();
        q();
        long j = this.e;
        if (j != -1) {
            return j;
        }
        long j2 = this.a.getLong("last_dispatch", 0);
        this.e = j2;
        return j2;
    }

    public final void t() {
        dkw.a();
        q();
        long a2 = c().a();
        SharedPreferences.Editor edit = this.a.edit();
        edit.putLong("last_dispatch", a2);
        edit.apply();
        this.e = a2;
    }
}
