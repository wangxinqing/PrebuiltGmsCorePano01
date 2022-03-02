package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import java.util.Set;

/* renamed from: cej  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cej extends ccy {
    public static final ccj b = new ccj(new cei(), "PhoneLockProducer", new int[]{25}, (int[]) null);
    private static final Set k = jir.a((Object) "android.intent.action.USER_PRESENT", (Object) "android.intent.action.SCREEN_OFF");
    private attn l;

    public cej(Context context, bsz bsz, String str, but but) {
        super(context, bsz, b, str, but);
    }

    private final void a(boolean z) {
        int a;
        if (!g()) {
            ((anih) ((anih) bxk.a.c()).a("cej", "a", 106, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[PhoneLockProducer] No ongoing data (isLocked=%s)", (Object) Boolean.valueOf(z));
            a(z, cbi.i().a());
            return;
        }
        int a2 = attm.a(this.l.b);
        if ((a2 != 0 && a2 == 3 && z) || ((a = attm.a(this.l.b)) != 0 && a == 2 && !z)) {
            ((anih) ((anih) bxk.a.c()).a("cej", "a", 115, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[PhoneLockProducer] Got same value as before for phonelock (isLocked=%s)", (Object) Boolean.valueOf(z));
            return;
        }
        long a3 = cbi.i().a();
        a(a3);
        a(z, a3 + 1);
    }

    /* access modifiers changed from: protected */
    public final IntentFilter c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        return intentFilter;
    }

    /* access modifiers changed from: package-private */
    public final boolean j() {
        boolean z;
        PowerManager powerManager = (PowerManager) this.d.getSystemService("power");
        try {
            int i = Build.VERSION.SDK_INT;
            z = powerManager.isInteractive();
        } catch (RuntimeException e) {
            if ("java.lang.RuntimeException".equals(e.getClass().getName())) {
                anih anih = (anih) bxk.a.b();
                anih.a((Throwable) e);
                ((anih) anih.a("cej", "j", 164, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[PhoneLockProducer] Cannot get interactive status.");
                z = false;
            } else {
                throw e;
            }
        }
        new Object[1][0] = Boolean.valueOf(z);
        return z;
    }

    /* access modifiers changed from: protected */
    public final void b() {
        a(cbi.i().a());
    }

    private final void a(boolean z, long j) {
        int i;
        aucd o = attn.c.o();
        if (!z) {
            i = 2;
        } else {
            i = 3;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        attn attn = (attn) o.b;
        attn.b = i - 1;
        attn.a |= 1;
        this.l = (attn) o.i();
        jti jti = new jti(7, 25, 1);
        jti.a(jut.b(j));
        jti.a(attn.d, this.l);
        d(jti.a());
    }

    /* access modifiers changed from: protected */
    public final void a() {
        a(!j(), cbi.i().a());
    }

    /* access modifiers changed from: protected */
    public final void a(long j) {
        super.a(j);
        this.l = null;
    }

    public final void a(Context context, Intent intent) {
        if (k.contains(intent.getAction())) {
            boolean z = !j();
            if ((intent.getAction().equals("android.intent.action.USER_PRESENT") && z) || (intent.getAction().equals("android.intent.action.SCREEN_OFF") && !z)) {
                a(!z);
            }
            a(z);
        }
    }
}
