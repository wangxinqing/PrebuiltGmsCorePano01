package defpackage;

import android.app.AlarmManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.TriggerEventListener;
import android.os.Build;
import com.google.android.gms.awareness.fence.FenceState;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TimeZone;

/* renamed from: cdg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cdg extends ccy implements grc {
    public static final ccj L = new ccj(new cdf(), "DNDModeProducer", new int[]{59}, (int[]) null);
    protected static final HashSet b = new HashSet(Arrays.asList(new String[]{"com.google.android.deskclock", "com.google.android.deskclock", "com.android.deskclock", "com.android.alarmclock", "com.sec.android.app.clockpackage", "com.sec.android.app.clockpackage.alarm", "com.htc.android.worldclock", "com.motorola.blur.alarmclock", "com.sonyericsson.alarm", "zte.com.cn.alarmclock", "com.lge.alarm", "com.lge.clock", "com.mobitobi.android.gentlealarm", "com.urbandroid.sleep.alarmclock", "com.splunchy.android.alarmclock"}));
    protected int A;
    protected long B;
    protected long C;
    protected long D;
    protected long E;
    protected float F;
    protected long G;
    protected HashSet H;
    protected int I;
    protected atrw J = atrw.UNKNOWN_STATE;
    protected atrw K = atrw.UNKNOWN_STATE;
    private iwq M;
    private final cdb N = new cdb(this);
    public final bwn k = cbi.k();
    public final TriggerEventListener l = new ccz(this);
    public final SensorEventListener m = new cda(this, "DNDModeProducer", "contextmanager");
    protected final Runnable n = new cdc(this);
    public final Runnable o = new cdd(this);
    public final Runnable p = new cde(this);
    protected AlarmManager q;
    protected SensorManager r;
    protected Sensor s;
    protected Sensor t;
    protected chf u;
    protected int v;
    protected Set w;
    protected long x;
    protected long y;
    protected boolean z;

    public cdg(Context context, bsz bsz, String str, but but) {
        super(context, bsz, L, str, but);
    }

    private final void b(cas cas) {
        int i;
        cbc g = cas.g();
        if (g != null) {
            i = g.a.i | this.v;
            this.v = i;
        } else {
            i = this.v | 64;
            this.v = i;
        }
        this.v = i & ((int) awuz.a.a().F());
    }

    private final void m() {
        this.r.cancelTriggerSensor(this.l, this.s);
        this.k.a(this.o);
    }

    public final void a() {
        this.x = awuz.a.a().E();
        this.y = awuz.a.a().D();
        this.v = 0;
        this.w = new HashSet();
        this.H = new HashSet();
        if (b(4)) {
            jtm jtm = new jtm();
            jtm.a(7);
            gra.c(this.d, this.g).a(jtm.a(), (jtv) this).a((acvp) new bva("[%s] registerContextListener, account=%s", this.c, this.e));
        }
        k();
        if (b(1)) {
            iwq a = iwq.a(this.d);
            this.M = a;
            this.A = a.c();
        }
        if (b(2)) {
            this.q = (AlarmManager) this.d.getSystemService("alarm");
            l();
        }
        j();
        b(0);
    }

    /* access modifiers changed from: protected */
    public final boolean b(int i) {
        return (i & this.v) != 0;
    }

    /* access modifiers changed from: protected */
    public final IntentFilter c() {
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23 && b(1)) {
            intentFilter.addAction("android.app.action.INTERRUPTION_FILTER_CHANGED");
        }
        int i = Build.VERSION.SDK_INT;
        if (b(2)) {
            intentFilter.addAction("android.app.action.NEXT_ALARM_CLOCK_CHANGED");
        }
        if (intentFilter.countActions() == 0) {
            return null;
        }
        return intentFilter;
    }

    /* access modifiers changed from: protected */
    public final void j() {
        boolean z2;
        boolean z3;
        boolean z4;
        if (b(24) && this.r == null) {
            this.r = (SensorManager) this.d.getSystemService("sensor");
        }
        if (!b(8)) {
            if (this.s != null) {
                m();
                this.s = null;
            }
            z2 = false;
        } else if (this.s == null) {
            Sensor defaultSensor = this.r.getDefaultSensor(17);
            this.s = defaultSensor;
            z2 = this.r.requestTriggerSensor(this.l, defaultSensor);
        } else {
            z2 = false;
        }
        if (!b(16)) {
            if (this.t != null) {
                this.r.unregisterListener(this.m);
                this.k.a(this.p);
                this.t = null;
            }
            z3 = false;
        } else if (this.t == null) {
            Sensor defaultSensor2 = this.r.getDefaultSensor(5);
            this.t = defaultSensor2;
            z3 = this.r.registerListener(this.m, defaultSensor2, 3);
        } else {
            z3 = false;
        }
        if (!b(24)) {
            this.r = null;
        }
        if (!b(64)) {
            chf chf = this.u;
            if (chf != null) {
                chf.a(this.N);
                this.u = null;
                z4 = false;
            } else {
                z4 = false;
            }
        } else if (this.u == null) {
            chf a = chf.a();
            this.u = a;
            a.a.add(this.N);
            if (!a.b) {
                a.d();
            }
            z4 = true;
        } else {
            z4 = false;
        }
        Object[] objArr = {Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4)};
    }

    /* access modifiers changed from: protected */
    public final void l() {
        String str;
        long j;
        AlarmManager alarmManager = this.q;
        if (alarmManager != null) {
            AlarmManager.AlarmClockInfo nextAlarmClock = alarmManager.getNextAlarmClock();
            if (nextAlarmClock != null) {
                str = nextAlarmClock.getShowIntent().getCreatorPackage();
            } else {
                str = null;
            }
            new Object[1][0] = str;
            if (b.contains(str) || str == null) {
                this.B = this.C;
                if (this.q.getNextAlarmClock() != null) {
                    j = this.q.getNextAlarmClock().getTriggerTime();
                } else {
                    j = 0;
                }
                this.C = j;
            }
            Object[] objArr = {str, Long.valueOf(this.C)};
        }
    }

    /* access modifiers changed from: protected */
    public final void k() {
        boolean z2;
        long j;
        long b2 = bvl.b(cbi.i().a(), TimeZone.getDefault());
        long j2 = this.x;
        long j3 = this.y;
        if (j2 < j3) {
            if (j2 > b2 || j3 < b2) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.z = z2;
        } else {
            z2 = j2 <= b2 || j3 >= b2;
            this.z = z2;
        }
        new Object[1][0] = Boolean.valueOf(z2);
        if (!this.z) {
            j = this.x;
        } else {
            j = this.y;
        }
        ContextFenceStub a = ContextFenceStub.a(jvz.a(j, 60000 + j));
        String format = String.format("%s_%s_%s", new Object[]{"DNDModeProducer", "night", Long.valueOf(j)});
        grd grd = new grd();
        grd.a(format, a, this);
        gra.a(this.d, this.g).a(grd.a()).a((acvp) new bva("[DNDModeProducer] register time fence", new Object[0]));
        this.H.add(format);
    }

    public final void b() {
        if (!this.H.isEmpty()) {
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                a((String) it.next());
            }
        }
        this.H = null;
        this.k.a(this.n);
        if (this.r != null) {
            if (b(8)) {
                m();
                this.s = null;
            }
            if (b(16)) {
                this.r.unregisterListener(this.m);
                this.k.a(this.p);
                this.t = null;
            }
            if (b(64)) {
                this.u.a(this.N);
                this.u = null;
            }
            this.r = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void b(long j) {
        this.G = cbi.i().a();
        new Object[1][0] = Long.valueOf(j);
        if (j == 0) {
            this.k.a(this.n, bvq.a("DNDModeProducer_produce_context"));
        } else {
            this.k.a(this.n, j, bvq.a("DNDModeProducer_produce_context"));
        }
    }

    public final void a(Context context, Intent intent) {
        String action = intent.getAction();
        String valueOf = String.valueOf(action);
        if (valueOf.length() == 0) {
            new String("Received intent: ");
        } else {
            "Received intent: ".concat(valueOf);
        }
        if (action.equals("android.app.action.INTERRUPTION_FILTER_CHANGED") && b(1)) {
            int c = this.M.c();
            this.A = c;
            new Object[1][0] = Integer.valueOf(c);
            b(0);
        } else if (action.equals("android.app.action.NEXT_ALARM_CLOCK_CHANGED") && b(2)) {
            new Object[1][0] = action;
            l();
            b(0);
            long a = cbi.i().a();
            long j = this.C - a;
            if (j > awuz.g() * 3600000) {
                b((j - (awuz.g() * 3600000)) + 1);
            }
            long j2 = a - this.B;
            if (j2 < awuz.h() * 3600000 && j > 0) {
                b(((awuz.h() * 3600000) - j2) + 1);
            }
        }
    }

    public final void b(ContextData contextData) {
        String str;
        boolean z2;
        if (!b(4) || contextData.g() != 7) {
            anih anih = (anih) ((anih) bxk.a.c()).a("cdg", "b", 476, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
            if (contextData != null) {
                str = Integer.toString(contextData.g());
            } else {
                str = "null";
            }
            anih.a("[DNDModeProducer] Received unexpected context %s", (Object) str);
        } else if (contextData.j().a() == 2) {
            int a = atue.a(((atuf) contextData.a((aubq) atuf.d)).b);
            if (a == 0) {
                a = 1;
            }
            if (a == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                this.D = contextData.j().c();
            } else {
                this.D = -1;
            }
            b(0);
            b(this.z ? awuz.i() : awuz.j());
            Object[] objArr = {Boolean.valueOf(z2), Integer.valueOf(contextData.j().a()), Long.valueOf(this.D)};
        }
    }

    public final void a(cas cas) {
        if (cas.b() == atjv.DND_MODE && this.w.remove(cas)) {
            int i = this.v;
            this.v = 0;
            for (cas b2 : this.w) {
                b(b2);
            }
            if (i != this.v) {
                j();
            }
            new Object[1][0] = Integer.valueOf(this.v);
        }
    }

    public final void a(cas cas, cas cas2) {
        if (cas.b() == atjv.DND_MODE) {
            if (cas2 != null) {
                a(cas2);
            }
            this.w.add(cas);
            int i = this.v;
            b(cas);
            if (i != this.v) {
                j();
            }
            new Object[1][0] = Integer.valueOf(this.v);
        }
    }

    public final void a(FenceState fenceState) {
        Object[] objArr = new Object[2];
        boolean z2 = false;
        objArr[0] = fenceState.b();
        if (fenceState.a() == 2) {
            z2 = true;
        }
        objArr[1] = Boolean.valueOf(z2);
        if (fenceState.a() != 1 && fenceState.b().startsWith("night")) {
            k();
            b(0);
            a(fenceState.b());
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        new Object[1][0] = str;
        HashSet hashSet = this.H;
        if (hashSet != null && !hashSet.isEmpty()) {
            grd grd = new grd();
            grd.a(str);
            gra.a(this.d, this.g).a(grd.a()).a((acvp) new bva("[DNDModeProducer] unregister time fence", new Object[0]));
            this.H.remove(str);
        }
    }
}
