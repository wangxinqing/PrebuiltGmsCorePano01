package defpackage;

import android.content.Context;
import android.os.PowerManager;
import com.google.android.gms.gcm.GcmChimeraService;

/* renamed from: ntu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ntu extends nsg {
    private final Context a;
    private final nut b;
    private final nrj c;
    private final nuh d;

    public ntu(Context context, nut nut, nrj nrj, nuh nuh) {
        this.a = context;
        this.b = nut;
        this.c = nrj;
        this.d = nuh;
    }

    public static boolean a(Context context) {
        if (jkr.b()) {
            return ((PowerManager) context.getSystemService(PowerManager.class)).isDeviceIdleMode();
        }
        return false;
    }

    public static boolean b(Context context) {
        return a(context) || nqw.e();
    }

    public final void b(int i) {
        if (i != 4) {
            if (i != 5) {
                return;
            }
        } else if (this.b.b() && jkr.b() && axlc.a.a().k()) {
            boolean a2 = a(this.a);
            amnb amnb = (amnb) amnc.r.o();
            if (amnb.c) {
                amnb.c();
                amnb.c = false;
            }
            amnc amnc = (amnc) amnb.b;
            "com.google.android.gsf.gtalkservice".getClass();
            amnc.a |= 16;
            amnc.e = "com.google.android.gsf.gtalkservice";
            nrj.a(amnb, "DozeNotification", String.valueOf(a2));
            this.b.a((audw) amnb);
            if (a2) {
                GcmChimeraService.a("Entering doze", new Object[0]);
            } else {
                GcmChimeraService.a("Exiting doze", new Object[0]);
            }
        }
        if (jkr.b() && nrj.e() && !b(this.a)) {
            this.d.b(this.c);
        }
    }
}
