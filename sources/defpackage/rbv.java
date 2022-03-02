package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CronetEngine;

/* renamed from: rbv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class rbv implements apyp {
    private final Context a;
    private final bapu b;

    public rbv(Context context, bapu bapu) {
        this.a = context;
        this.b = bapu;
    }

    public final azxi a(apyo apyo) {
        boolean z;
        Context context = this.a;
        bacm a2 = bacm.a(apyo.k(), apyo.l(), (CronetEngine) this.b.a());
        a2.h = new CronetEngine.Builder(context).getDefaultUserAgent();
        apxw apxw = (apxw) apyo;
        a2.a(apxw.b);
        long j = apxw.e;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        amrl.a(z, "idle timeout is %s, but must be positive", j);
        if (timeUnit.toDays(j) < 30) {
            a2.l = Math.max(timeUnit.toMillis(j), badc.b);
        } else {
            a2.l = -1;
        }
        Integer num = apxw.d;
        if (num != null) {
            a2.a(num.intValue());
        }
        Integer num2 = apxw.c;
        if (num2 != null) {
            a2.b(num2.intValue());
        }
        return a2.b();
    }
}
