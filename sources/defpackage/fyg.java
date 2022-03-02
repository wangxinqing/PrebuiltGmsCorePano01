package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: fyg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fyg {
    public static final iwd a = new iwd("GLSActivity", "CheckinHelper");
    public static final fzi d = new fyb();
    public final Context b;
    public final gvl c;

    public fyg(Context context) {
        gvl a2 = gvl.a(context);
        this.b = context;
        this.c = a2;
    }

    public final void b() {
        if (ent.ae()) {
            this.c.b((ihb) new gvg()).a((acvp) new fyf(this, new fyc(this)));
        }
    }

    public final void a() {
        int i = Build.VERSION.SDK_INT;
        if (jlo.m() == 4 && jlo.n() == 6) {
            a.c("Checkin check is skipped because force legacy multi dex is enabled", new Object[0]);
            return;
        }
        if (jhg.a(this.b) == 0) {
            gvt gvt = new gvt(this.b, this);
            gvt.b();
            try {
                int intValue = ((Integer) acws.a(this.c.a(gvt.a()), 2, TimeUnit.MINUTES)).intValue();
                if (!ibt.d(intValue)) {
                    iwd iwd = a;
                    StringBuilder sb = new StringBuilder(47);
                    sb.append("Checkin fails and the error code is ");
                    sb.append(intValue);
                    iwd.e(sb.toString(), new Object[0]);
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                a.e("Error waiting for checkin result", e, new Object[0]);
            }
        }
        if (jhg.a(this.b) == 0) {
            a.e("AndroidId is still 0 after Checkin", new Object[0]);
        }
    }
}
