package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;

/* renamed from: cev  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cev extends ccy {
    public static final ccj b = new ccj(new ceu(), "ScreenProducer", new int[]{7}, (int[]) null);
    private atuf k;

    public cev(Context context, bsz bsz, String str, but but) {
        super(context, bsz, b, str, but);
    }

    private final void a(boolean z, long j) {
        int i;
        aucd o = atuf.c.o();
        if (!z) {
            i = 2;
        } else {
            i = 3;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        atuf atuf = (atuf) o.b;
        atuf.b = i - 1;
        atuf.a |= 1;
        this.k = (atuf) o.i();
        jti jti = new jti(7, 7, 1);
        jti.a(jut.b(j));
        jti.a(atuf.d, this.k);
        d(jti.a());
    }

    /* access modifiers changed from: protected */
    public final IntentFilter c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        return intentFilter;
    }

    /* access modifiers changed from: protected */
    public final void b() {
        a(cbi.i().a());
    }

    /* access modifiers changed from: protected */
    public final void a() {
        int i = Build.VERSION.SDK_INT;
        a(((PowerManager) this.d.getSystemService("power")).isInteractive(), cbi.i().a());
    }

    /* access modifiers changed from: protected */
    public final void a(long j) {
        super.a(j);
        this.k = null;
    }

    public final void a(Context context, Intent intent) {
        boolean z;
        int a;
        String action = intent.getAction();
        if (action.equals("android.intent.action.SCREEN_ON")) {
            z = true;
        } else if (action.equals("android.intent.action.SCREEN_OFF")) {
            z = false;
        } else {
            return;
        }
        if (!g()) {
            ((anih) ((anih) bxk.a.c()).a("cev", "a", 93, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ScreenProducer] No ongoing data (isScreenOn=%s)", (Object) Boolean.valueOf(z));
            a(z, cbi.i().a());
            return;
        }
        int a2 = atue.a(this.k.b);
        if ((a2 != 0 && a2 == 3 && z) || ((a = atue.a(this.k.b)) != 0 && a == 2 && !z)) {
            ((anih) ((anih) bxk.a.c()).a("cev", "a", 103, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ScreenProducer] Got same value as before for screen (isScreenOn=%s)", (Object) Boolean.valueOf(z));
            return;
        }
        long a3 = cbi.i().a();
        a(a3);
        a(z, a3 + 1);
    }
}
