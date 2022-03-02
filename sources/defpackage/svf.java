package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.c;
import com.google.android.gms.ads.identifier.d;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* renamed from: svf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class svf extends swm {
    static final Pair a = new Pair("", 0L);
    private long A;
    public SharedPreferences b;
    public svd c;
    public final svc d = new svc(this, "last_upload", 0);
    public final svc e = new svc(this, "last_upload_attempt", 0);
    public final svc f = new svc(this, "backoff", 0);
    public final svc g = new svc(this, "last_delete_stale", 0);
    public final svc h;
    public final svc i;
    public final svc j;
    public final sve k;
    public final svc l;
    public final svb m;
    public final sve n;
    public final svb o;
    public final svb p;
    public final svc q;
    public final svc r;
    public boolean s;
    public final svb t;
    public final svb u;
    public final svc v;
    public final sve w;
    private String y;
    private boolean z;

    public svf(svv svv) {
        super(svv);
        new svc(this, "time_before_start", 10000);
        this.l = new svc(this, "session_timeout", 1800000);
        this.m = new svb(this, "start_new_session", true);
        this.q = new svc(this, "last_pause_time", 0);
        this.r = new svc(this, "time_active", 0);
        this.n = new sve(this, "non_personalized_ads");
        this.o = new svb(this, "use_dynamite_api", false);
        this.p = new svb(this, "allow_remote_dynamite", false);
        this.h = new svc(this, "midnight_offset", 0);
        this.i = new svc(this, "first_open_time", 0);
        this.j = new svc(this, "app_install_time", 0);
        this.k = new sve(this, "app_instance_id");
        this.t = new svb(this, "app_backgrounded", false);
        this.u = new svb(this, "deep_link_retrieval_complete", false);
        this.v = new svc(this, "deep_link_retrieval_attempts", 0);
        this.w = new sve(this, "firebase_feature_rollouts");
    }

    /* access modifiers changed from: protected */
    public final void G() {
        SharedPreferences sharedPreferences = z().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.b = sharedPreferences;
        boolean z2 = sharedPreferences.getBoolean("has_been_opened", false);
        this.s = z2;
        if (!z2) {
            SharedPreferences.Editor edit = this.b.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        v();
        this.c = new svd(this, "health_monitor", Math.max(0, ((Long) sud.c.a()).longValue()));
    }

    /* access modifiers changed from: package-private */
    public final Pair a(String str) {
        long j2;
        h();
        long b2 = A().b();
        String str2 = this.y;
        if (str2 != null && b2 < this.A) {
            return new Pair(str2, Boolean.valueOf(this.z));
        }
        spg v2 = v();
        suc suc = sud.b;
        if (str != null) {
            String a2 = v2.a.a(str, suc.a);
            if (TextUtils.isEmpty(a2)) {
                j2 = ((Long) suc.a()).longValue();
            } else {
                try {
                    j2 = ((Long) suc.a(Long.valueOf(Long.parseLong(a2)))).longValue();
                } catch (NumberFormatException e2) {
                    j2 = ((Long) suc.a()).longValue();
                }
            }
        } else {
            j2 = ((Long) suc.a()).longValue();
        }
        this.A = b2 + j2;
        try {
            c a3 = d.a(z());
            if (a3 != null) {
                this.y = a3.a;
                this.z = a3.b;
            }
            if (this.y == null) {
                this.y = "";
            }
        } catch (Exception e3) {
            E().j.a("Unable to get advertising id", e3);
            this.y = "";
        }
        return new Pair(this.y, Boolean.valueOf(this.z));
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final String b(String str) {
        h();
        String str2 = (String) a(str).first;
        MessageDigest f2 = szj.f();
        if (f2 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, f2.digest(str2.getBytes()))});
    }

    /* access modifiers changed from: protected */
    public final SharedPreferences c() {
        h();
        k();
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public final Boolean d() {
        h();
        if (c().contains("measurement_enabled")) {
            return Boolean.valueOf(c().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(long j2) {
        return j2 - this.l.a() > this.q.a();
    }
}
