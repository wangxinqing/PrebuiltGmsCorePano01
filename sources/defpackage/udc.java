package defpackage;

import android.content.Context;
import com.google.android.gms.R;
import java.util.Collections;
import java.util.List;

/* renamed from: udc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class udc {
    public final Context a;
    public final udf b;
    public final arxg c;
    public final uap d;
    public final udk e;

    public udc(Context context) {
        this.a = context;
        this.b = (udf) thl.a(context, udf.class);
        this.d = (uap) thl.a(context, uap.class);
        this.c = (arxg) thl.a(context, arxg.class);
        this.e = (udk) thl.a(context, udk.class);
    }

    public static int a(Context context) {
        if (jkr.c()) {
            return hdg.a(context, R.drawable.quantum_ic_devices_other_googblue_24);
        }
        return hdg.a(context, R.drawable.quantum_ic_devices_other_white_24);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.List, java.util.Collection] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.util.Collection r4, java.lang.String r5) {
        /*
            jjg r0 = defpackage.tsp.a
            int r0 = r4.size()
            r1 = 0
        L_0x0007:
            if (r1 >= r0) goto L_0x0016
            java.lang.Object r2 = r4.get(r1)
            ttg r2 = (defpackage.ttg) r2
            r3 = 3
            r2.a((int) r3, (java.lang.String) r5)
            int r1 = r1 + 1
            goto L_0x0007
        L_0x0016:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.udc.a(java.util.Collection, java.lang.String):void");
    }

    public final String a(String str) {
        return this.a.getString(R.string.devices_notification_title, new Object[]{str});
    }

    public final String a(String str, String str2) {
        if (arxk.a(this.a, str2)) {
            return this.a.getString(R.string.common_tap_to_open_app, new Object[]{str});
        }
        return this.a.getString(R.string.common_tap_to_install_app, new Object[]{str});
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.d.a();
    }

    /* access modifiers changed from: package-private */
    public final void a(ttg ttg) {
        List<ttg> list;
        if (ttg != null) {
            list = Collections.singletonList(ttg);
        } else {
            list = null;
        }
        uap uap = this.d;
        if (!uap.a.g()) {
            if (list != null && !list.isEmpty()) {
                boolean z = true;
                for (ttg f : list) {
                    if (!f.f()) {
                        z = false;
                    }
                }
                if (z) {
                    return;
                }
            }
            int i = uap.a.c().getInt("KEY_NOTIFICATION_CONSECUTIVE_DISMISS", 0);
            if (((long) i) >= aymq.a.a().P()) {
                uap.a.a(Long.MAX_VALUE);
                uap.b.a(asom.NOTIFICATION_DISMISS_BACKOFF_MAXED, (List) list);
            } else if (uap.b()) {
                arxg arxg = uap.a;
                long c2 = uap.c();
                double F = (double) aymq.a.a().F();
                double pow = Math.pow((double) aymq.a.a().N(), (double) i);
                Double.isNaN(F);
                arxg.a(c2 + ((long) (F * pow)));
                uap.a.a(i + 1);
            }
        }
    }
}
