package defpackage;

import android.os.Build;
import android.os.SystemClock;
import java.util.Locale;

/* renamed from: ahlc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahlc implements aizt {
    private final aicn a;
    private final ahoz b = new ahoz(Build.DEVICE);
    private final ahix c;
    private final ahld d;

    public ahlc(aicn aicn, ahix ahix, ahld ahld) {
        this.a = aicn;
        this.c = ahix;
        this.d = ahld;
    }

    public final void a(aizu aizu) {
        boolean z;
        aizu aizu2 = aizu;
        if (ayfc.h() && ayfc.d()) {
            String format = String.format(Locale.ENGLISH, "m=%d, t=%.2f, l=%.1f, l_m=%.1f, noise=%.1f, ts=%d, pres=%d,", new Object[]{Integer.valueOf(aizu2.d), Float.valueOf(aizu2.c), Float.valueOf(aizu2.a), Float.valueOf(aizu2.b), Float.valueOf(aizu2.e), Long.valueOf(aizu2.f), Integer.valueOf(aizu2.g)});
            String valueOf = String.valueOf(format);
            if (valueOf.length() == 0) {
                new String("CHRE data received: ");
            } else {
                "CHRE data received: ".concat(valueOf);
            }
            ahpe h = this.c.h();
            if (h != null) {
                this.c.ap = SystemClock.elapsedRealtime();
                ahpf a2 = this.b.a(aizu2);
                int a3 = h.a(a2);
                StringBuilder sb = new StringBuilder();
                for (String str : ahpf.M) {
                    sb.append(", ");
                    sb.append(str);
                    sb.append(" = ");
                    sb.append(a2.a(str));
                }
                String valueOf2 = String.valueOf(sb.toString());
                if (valueOf2.length() == 0) {
                    new String("CHRE features: ");
                } else {
                    "CHRE features: ".concat(valueOf2);
                }
                ahld ahld = this.d;
                if (ahld != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (aizu2.d > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ahld.a(a3, currentTimeMillis, elapsedRealtime, a2, z);
                    this.a.a(new aicl(aico.CHRE_SLEEP_EVENT, this.a.b(), (String) null, format, -1, -1, -1));
                }
            }
        }
    }
}
