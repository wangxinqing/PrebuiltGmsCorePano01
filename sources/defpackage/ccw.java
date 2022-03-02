package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: ccw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ccw extends ccy implements Runnable {
    private int b = 0;
    private final String k;

    public ccw(Context context, bsz bsz, ccj ccj, String str, but but) {
        super(context, bsz, ccj, str, but);
        this.k = str;
    }

    private final void l() {
        j();
        this.a.a((Runnable) this);
        long k2 = k();
        if (k2 <= 0) {
            this.a.a(this, bvq.a(this.k));
            ((anih) ((anih) bxk.a.c()).a("ccw", "l", 117, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[BatteryOKPeriodicProducer] Execution time delay is %s", k2);
            return;
        }
        this.a.a(this, k2, bvq.a(this.k));
    }

    public final void a(Context context, Intent intent) {
        String action = intent.getAction();
        if (!action.equals("android.intent.action.BATTERY_LOW") && !action.equals("android.intent.action.BATTERY_OKAY")) {
            return;
        }
        if (action.equals("android.intent.action.BATTERY_LOW") && this.b == 1) {
            this.b = 0;
            this.a.a((Runnable) this);
        } else if (action.equals("android.intent.action.BATTERY_OKAY") && this.b == 0) {
            this.b = 1;
            l();
        }
    }

    /* access modifiers changed from: protected */
    public final IntentFilter c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        return intentFilter;
    }

    public final boolean e() {
        if (!super.e()) {
            return false;
        }
        Intent registerReceiver = this.d.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver.getIntExtra("plugged", -1) <= 0) {
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra == -1 || intExtra2 == -1) {
                this.b = 0;
                run();
                return true;
            }
            double d = (double) intExtra;
            double d2 = (double) intExtra2;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d / d2;
            double ao = (double) ((int) awuz.a.a().ao());
            Double.isNaN(ao);
            if (d3 <= ao / 100.0d) {
                this.b = 0;
                run();
                return true;
            }
        }
        this.b = 1;
        run();
        return true;
    }

    public final void f() {
        this.a.a((Runnable) this);
        this.b = 0;
        super.f();
    }

    /* access modifiers changed from: protected */
    public abstract void j();

    /* access modifiers changed from: protected */
    public abstract long k();

    public final void run() {
        if (this.b != 0) {
            l();
        }
    }
}
