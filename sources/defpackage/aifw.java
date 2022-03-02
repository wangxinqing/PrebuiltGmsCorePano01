package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Looper;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.location.fused.NlpRequestHelper$DataReceiver;
import java.util.Collection;
import java.util.Collections;

/* renamed from: aifw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aifw implements jlc {
    public static final Object a = new Object();
    public static boolean b = false;
    public static boolean c = false;
    public static boolean d = false;
    private static boolean n = false;
    private static int o = 0;
    public final aidg e;
    public final acrz f;
    public final Context g;
    public final boolean h;
    public aifv i;
    public aift j;
    public WorkSource k;
    public boolean l;
    public boolean m = false;
    private final NlpRequestHelper$DataReceiver p;
    private final alv q;
    private final jld r;
    private boolean s = false;

    public aifw(Looper looper, Context context) {
        this.g = context;
        acrz acrz = new acrz(context, 1, "GCoreFlp", "NlpRequestHelper", "com.google.android.gms");
        this.f = acrz;
        acrz.a(true);
        this.e = new aidg(new aifu(this, looper), this.f);
        this.h = jlr.a(context);
        this.p = new NlpRequestHelper$DataReceiver(this);
        this.q = alv.a(context);
        jld jld = new jld(context, looper);
        this.r = jld;
        jld.a = this;
    }

    public static PendingIntent a(Context context) {
        return a(context, "com.google.android.location.internal.action.FLP_AR_RESULT");
    }

    public static PendingIntent b(Context context) {
        return a(context, "com.google.android.location.internal.action.FLP_FULL_POWER_LOCATION_RESULT");
    }

    public static PendingIntent c(Context context) {
        return a(context, "com.google.android.location.internal.action.FLP_LOW_POWER_LOCATION_RESULT");
    }

    public final void d() {
        if (!this.s) {
            this.s = true;
            this.r.a();
            this.q.a(this.p, new IntentFilter(asvl.a("com.google.android.location.internal.action.FLP_AR_RESULT")));
            this.q.a(this.p, new IntentFilter(asvl.a("com.google.android.location.internal.action.FLP_FULL_POWER_LOCATION_RESULT")));
            this.q.a(this.p, new IntentFilter(asvl.a("com.google.android.location.internal.action.FLP_LOW_POWER_LOCATION_RESULT")));
            this.q.a(this.p, new IntentFilter(asvl.a("com.google.android.location.internal.action.ACTION_FLP_COMPUTE_WIFI_LOCATIONS_RESULT")));
            synchronized (a) {
                o++;
                c();
                b();
                a();
            }
        }
    }

    public final void e() {
        if (this.s) {
            this.s = false;
            this.r.b();
            this.q.a((BroadcastReceiver) this.p);
            synchronized (a) {
                o--;
                c();
                b();
                a();
            }
        }
    }

    public static PendingIntent a(Context context, String str) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, "com.google.android.location.internal.PendingIntentCallbackService"));
        intent.setPackage(context.getPackageName());
        intent.setAction(str);
        return PendingIntent.getService(context, 0, intent, 134217728);
    }

    public final void b() {
        if (!c && o == 0) {
            atir atir = new atir("com.google.android.gms");
            PendingIntent c2 = c(this.g);
            atir.a(c2);
            if (atir.a(this.g) == null) {
                Log.w("GCoreFlp", "Unable to start the GMS NLP");
                c2.cancel();
            }
        } else if (!c) {
            b(Long.MAX_VALUE, Long.MAX_VALUE, false);
        }
    }

    public final void c() {
        if (!d && (o == 0 || !n)) {
            atir atir = new atir("com.google.android.gms");
            PendingIntent a2 = a(this.g);
            atir.b(a2);
            if (atir.a(this.g) == null) {
                Log.w("GCoreFlp", "Unable to start the GMS NLP");
                a2.cancel();
            }
        } else if (!d) {
            a(Long.MAX_VALUE, false);
        }
    }

    public final void a() {
        if (!b && o == 0) {
            atir atir = new atir("com.google.android.gms");
            PendingIntent b2 = b(this.g);
            atir.a(b2);
            if (atir.a(this.g) == null) {
                Log.w("GCoreFlp", "Unable to start the GMS NLP");
                b2.cancel();
            }
        } else if (!b) {
            a(Long.MAX_VALUE, Long.MAX_VALUE, false);
        }
    }

    public final void a(long j2, long j3, boolean z) {
        atir atir = new atir("com.google.android.gms");
        int i2 = Build.VERSION.SDK_INT;
        atir.a(j2, j3, b(this.g), "fused.NlpController:NlpFullPower");
        atir.c(z);
        WorkSource workSource = this.k;
        if (workSource != null) {
            atir.a(workSource);
        }
        atir.b(this.l);
        if (atir.a(this.g) == null) {
            Log.w("GCoreFlp", "Unable to bind to GMS NLP");
        }
    }

    public final void b(long j2, long j3, boolean z) {
        int i2 = Build.VERSION.SDK_INT;
        atir atir = new atir("com.google.android.gms");
        atir.a(j2, j3, c(this.g), "fused.NlpController:NlpLowPower");
        atir.c(z);
        WorkSource workSource = this.k;
        if (workSource != null) {
            atir.a(workSource);
        }
        atir.b(this.l);
        atir.a.putExtra("com.google.android.location.internal.EXTRA_LOCATION_LOW_POWER", true);
        if (atir.a(this.g) == null) {
            Log.w("GCoreFlp", "Unable to bind to GMS NLP");
        }
    }

    public final void a(long j2, boolean z) {
        rck rck = new rck();
        rck.a(j2);
        rck.c = z;
        rck.e = "fused.NlpController:AR";
        rck.d = this.k;
        atir atir = new atir("com.google.android.gms");
        atir.a(rck.a(), a(this.g));
        if (atir.a(this.g) == null) {
            Log.w("GCoreFlp", "Unable to bind to GMS NLP");
        }
    }

    public final void a(Collection collection) {
        if (collection == null) {
            collection = Collections.emptyList();
        }
        this.k = isb.a(collection);
    }

    public final void a(boolean z, boolean z2) {
        synchronized (a) {
            boolean z3 = true;
            if (!z && !z2) {
                z3 = false;
            }
            if (z3 != n) {
                n = z3;
                c();
            }
        }
    }
}
