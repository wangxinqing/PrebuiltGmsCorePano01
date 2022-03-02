package defpackage;

import android.content.Context;
import android.os.SystemClock;

/* renamed from: adlz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class adlz extends adlq {
    public static final adro e = new adro("next_action_name", "");
    public static final adrf f = new adrf("next_action_params");
    public static final adra g = new adra("enforce_delay", false);
    private static final adrk h = new adrk("earliest_execution_time", 0L);
    private static final adrk i = new adrk("boot_token", -1L);
    private final Context j;
    private final jbs k;

    protected adlz(String str, Context context, adre adre) {
        super(str, adre);
        this.j = context;
        this.k = new jbs(context);
    }

    public final adll c() {
        long j2;
        long e2 = ((Long) a(h)).longValue() == 0 ? e() : ((Long) a(h)).longValue();
        long d = ((adkt) adkt.e.b()).d();
        if (((Long) a(i)).longValue() != -1) {
            j2 = ((Long) a(i)).longValue();
        } else {
            j2 = d;
        }
        if (j2 != d || e2 <= SystemClock.elapsedRealtime()) {
            return new adll((String) a(e), (adre) a(f));
        }
        this.k.a("DelayExecutionAction-Alarm", 3, e2, adlk.a(this.j, 0), (String) null);
        if (!((Boolean) a(g)).booleanValue()) {
            return new adll((String) a(e), (adre) a(f), (byte[]) null);
        }
        String str = this.a;
        adrd b = a().b();
        b.a(h, Long.valueOf(e2));
        b.a(i, Long.valueOf(j2));
        return new adll(str, b.a(), (byte[]) null);
    }

    /* access modifiers changed from: protected */
    public abstract long e();
}
