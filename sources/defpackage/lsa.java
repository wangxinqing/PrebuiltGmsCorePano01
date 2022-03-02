package defpackage;

import java.util.Locale;

/* renamed from: lsa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lsa implements lsg {
    private final lri a;
    private final lhx b;
    private final String c;

    public lsa(jiq jiq, lhx lhx, String str, agvx agvx, agvx agvx2) {
        long j;
        int i;
        iva.a((Object) str);
        this.c = str;
        this.b = lhx;
        iva.a((Object) str);
        String valueOf = String.valueOf(str);
        lhy lhy = (lhy) lhx;
        long j2 = lhy.d().getLong(valueOf.length() == 0 ? new String("bucket_rate_limiter_last_token_time.") : "bucket_rate_limiter_last_token_time.".concat(valueOf), -1);
        iva.a((Object) str);
        String valueOf2 = String.valueOf(str);
        int i2 = lhy.d().getInt(valueOf2.length() == 0 ? new String("bucket_rate_limiter_num_tokens.") : "bucket_rate_limiter_num_tokens.".concat(valueOf2), -1);
        if (j2 >= 0 && i2 >= 0) {
            i = i2;
            j = j2;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            i = ((Integer) agvx.c()).intValue();
            j = currentTimeMillis;
        }
        this.a = new lri(jiq, agvx, agvx2, i, j);
    }

    private final synchronized void a() {
        int b2 = this.a.b();
        long a2 = this.a.a();
        lhx lhx = this.b;
        String str = this.c;
        iva.a((Object) str);
        ((lhy) lhx).d().edit().putInt(str.length() == 0 ? new String("bucket_rate_limiter_num_tokens.") : "bucket_rate_limiter_num_tokens.".concat(str), b2).putLong(str.length() == 0 ? new String("bucket_rate_limiter_last_token_time.") : "bucket_rate_limiter_last_token_time.".concat(str), a2).apply();
    }

    public final synchronized boolean c() {
        return this.a.c();
    }

    public final synchronized boolean d() {
        boolean d;
        d = this.a.d();
        a();
        return d;
    }

    public final synchronized void f() {
        throw null;
    }

    public final synchronized void g() {
        a();
    }

    public final String toString() {
        return String.format(Locale.US, "%s[%s]", new Object[]{"PersistentBucketRateLimiter", this.a});
    }
}
