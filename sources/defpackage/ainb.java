package defpackage;

import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import java.util.Calendar;

/* renamed from: ainb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ainb extends aimp implements ajbh {
    final /* synthetic */ aing d;
    private final Calendar e = Calendar.getInstance();
    private boolean f = false;
    private boolean g = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ainb(aing aing, aiml aiml) {
        super(aing, aiml);
        this.d = aing;
    }

    private final boolean m() {
        boolean z;
        this.e.setTimeInMillis(System.currentTimeMillis());
        int i = this.e.get(11);
        if (i < 7 || i >= 23) {
            z = true;
        } else {
            z = false;
        }
        boolean c = this.b.d.g.c();
        aiml aiml = this.b;
        boolean z2 = aikq.a;
        boolean z3 = !(SystemClock.elapsedRealtime() - aiml.h.b <= 3600000);
        boolean z4 = aikq.a;
        boolean z5 = z && c && z3;
        if (this.f == z5) {
            return false;
        }
        this.f = z5;
        boolean z6 = aikq.a;
        return true;
    }

    public final void E() {
        synchronized (this.d.k) {
            aiko.a.a(1811416624, false, 4);
            if (Log.isLoggable("GeofencerStateMachine", 4)) {
                aikq.a("GeofencerStateMachine", "sendSignificantMotion");
            }
            this.d.d(15);
        }
    }

    public final aoaq a() {
        return aoaq.STILL_ACTIVITY;
    }

    /* access modifiers changed from: protected */
    public final int b() {
        if (this.b.a()) {
            return 300;
        }
        if (this.b.b(100000.0d)) {
            return -1;
        }
        if (this.b.b(300.0d) || this.f || this.g) {
            return 300;
        }
        return 180;
    }

    /* access modifiers changed from: protected */
    public final int c() {
        if ((this.d.y || this.g) && d() == -1) {
            return -1;
        }
        if (this.b.a()) {
            return 60;
        }
        if (!this.b.b(3333.3333333333335d)) {
            return (this.b.b(300.0d) || this.f || this.g) ? 900 : 360;
        }
        return 1800;
    }

    /* access modifiers changed from: protected */
    public final int d() {
        int i = this.b.b;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i;
    }

    public final String g() {
        return "StillActivityState";
    }

    /* access modifiers changed from: protected */
    public final double h() {
        return 1.5d;
    }

    /* access modifiers changed from: protected */
    public final boolean j() {
        aucd aucd = this.d.D;
        if (aucd != null) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aoal aoal = (aoal) aucd.b;
            aoal aoal2 = aoal.g;
            aoal.a |= 4;
            aoal.d = false;
        }
        aikk aikk = this.d.q;
        if (aikk != null) {
            aikk.a(false);
        }
        if (this.d.B.a()) {
            a(30, false, true);
        }
        return true;
    }

    public final void k() {
        super.k();
        this.f = false;
        this.g = false;
    }

    public final void l() {
        this.f = false;
        this.g = false;
    }

    public final boolean a(aily aily) {
        if (!this.f && !this.g) {
            return super.a(aily);
        }
        if (Log.isLoggable("GeofencerStateMachine", 4)) {
            aikq.a("GeofencerStateMachine", "Use last location to update newly added Geofences.");
        }
        return a(aily, -1);
    }

    /* access modifiers changed from: protected */
    public final boolean b(aimy aimy) {
        if (m()) {
            b(this.f);
        }
        if (this.f || this.g) {
            if (!aybx.b()) {
                aiko.a.a((aikn) new aikm(-317571983, aimy.b, "Location dropped in deep still mode"));
            } else {
                aiko.a.a(-620788458, aimy.b, 7);
            }
            if (Log.isLoggable("GeofencerStateMachine", 4)) {
                aikq.a("GeofencerStateMachine", "Location dropped because in deep still mode.");
            }
        } else {
            a(aimy);
        }
        if ((!this.d.y && !this.g) || d() != -1) {
            d(false);
            return true;
        }
        int b = b();
        this.b.a(0, false, e(), b, f(), false);
        aing aing = this.d;
        aikk aikk = aing.q;
        if (aikk == null) {
            return true;
        }
        aikk.a(((aimr) aing.c()).a(), 0, b);
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean a(Intent intent) {
        super.a(intent);
        if (!m()) {
            return false;
        }
        d(false);
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean b(boolean z) {
        this.g = z;
        ajbi ajbi = this.d.z;
        if (((ajbr) ajbi).d) {
            if (!z) {
                if (ajbi.b()) {
                    this.d.z.c();
                    aucd aucd = this.d.D;
                    if (aucd != null) {
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        aoal aoal = (aoal) aucd.b;
                        aoal aoal2 = aoal.g;
                        aoal.a |= 4;
                        aoal.d = false;
                    }
                    aiko.a.a(1647503932, false, 3);
                }
            } else if (!ajbi.b()) {
                this.d.z.a(this);
                aucd aucd2 = this.d.D;
                if (aucd2 != null) {
                    if (aucd2.c) {
                        aucd2.c();
                        aucd2.c = false;
                    }
                    aoal aoal3 = (aoal) aucd2.b;
                    aoal aoal4 = aoal.g;
                    aoal3.a |= 4;
                    aoal3.d = true;
                }
                aiko.a.a(-1083843362, true, 3);
            }
            aikk aikk = this.d.q;
            if (aikk != null) {
                aikk.a(z);
            }
        }
        return false;
    }
}
