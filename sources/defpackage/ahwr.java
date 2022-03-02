package defpackage;

import com.google.android.gms.location.ActivityRecognitionResult;
import java.util.ArrayList;

/* renamed from: ahwr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahwr extends ahwp {
    long k = 0;
    long l;
    float m = 0.0f;
    boolean n = false;
    boolean o = false;
    final ArrayList p = new ArrayList();
    boolean q = false;
    long r;
    aibt s;
    boolean t = true;
    aqek u;
    long v = -1;
    int w = 1;
    aiwz x;
    private final ahwn y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahwr(ajbd ajbd, aizy aizy, ajbg ajbg, ahqq ahqq, ajbx ajbx, ajph ajph, ahwm ahwm) {
        super("ActiveCollector", ajbd, aizy, ajbg, ahqq, ajbx, ajph, ahwm, ahwo.OFF);
        this.k = (aizy.c() + 10800000) - axwc.b();
        this.l = 30000;
        aizy aizy2 = aizy;
        this.y = new ahwn(aizy, 1);
    }

    private static final boolean b(aiwz aiwz) {
        return aiwz.a() <= 40.0f && aiwz.d() <= 1.5f;
    }

    private final void h(long j) {
        if (j != this.v) {
            this.v = j;
            this.d.a(ajbe.ACTIVE_COLLECTOR, this.v, (aizx) null);
        }
    }

    private final void i() {
        this.j = ahwo.OFF;
        int i = this.w;
        if (i != 1) {
            if (i == 2) {
                this.b.l().a(ajbe.ACTIVE_COLLECTOR, false);
            }
            this.d.c(ajbe.ACTIVE_COLLECTOR);
            this.w = 1;
            this.k = this.c.c();
        }
        j();
        this.s = null;
    }

    private final void j() {
        this.p.clear();
        this.q = false;
        this.x = null;
    }

    public final void a(int i, int i2, boolean z) {
        this.n = z;
        float a = ajqz.a(i, i2);
        if (a >= 0.0f) {
            this.m = a;
        }
    }

    public final void a(ahqp ahqp) {
    }

    public final void a(aiaj aiaj) {
    }

    public final void a(aqek aqek) {
        this.u = null;
    }

    public final void c(boolean z) {
        if (this.o != z) {
            this.o = z;
        }
    }

    public final void d(boolean z) {
        this.t = z;
    }

    public final void e(boolean z) {
    }

    /* access modifiers changed from: protected */
    public final boolean f(long j) {
        if (i(j) && this.u != null) {
            h(this.k + this.l);
            return false;
        }
        i();
        return true;
    }

    public final void g(long j) {
        this.y.a(j);
    }

    /* access modifiers changed from: protected */
    public final boolean b(long j) {
        if (!i(j)) {
            i();
            return true;
        }
        long b = axwc.b();
        if (b <= j - this.k || this.y.a()) {
            this.d.b(ajbe.ACTIVE_COLLECTOR, 60000, (aizx) null);
            this.w = 2;
            this.k = this.c.c();
            this.l = 30000;
            this.b.l().a(ajbe.ACTIVE_COLLECTOR, true);
            this.j = ahwo.GPS_WAIT;
            this.y.b();
            return true;
        }
        h(this.k + b);
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean c(long j) {
        if (!i(j)) {
            i();
            return true;
        } else if (this.q) {
            this.r = j;
            this.b.n().a(ajbe.ACTIVE_COLLECTOR, false, (aizx) null);
            this.j = ahwo.SCAN_WAIT;
            return true;
        } else {
            h(this.k + this.l);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean d(long j) {
        if (!i(j)) {
            i();
            return true;
        } else if (this.s == null) {
            h(this.k + this.l);
            return false;
        } else {
            this.j = ahwo.POST_SCAN_GPS_WAIT;
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean e(long j) {
        if (!i(j)) {
            i();
            return true;
        } else if (this.x != null) {
            String valueOf = String.valueOf(this.p.get(0));
            String valueOf2 = String.valueOf(this.s);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23 + String.valueOf(valueOf2).length());
            sb.append("Success: location ");
            sb.append(valueOf);
            sb.append("scan ");
            sb.append(valueOf2);
            sb.toString();
            aqek a = ahwp.a(this.c.d(), this.x, (aiaj) null, this.s, (ActivityRecognitionResult) null, this.n, 13, this.b.m().a());
            aqek aqek = new aqek(ajck.al);
            aqek.a(4, (Object) a);
            this.f.a(this.c, aqek);
            ((aita) this.b).r().a(aqek, this.g);
            this.i.a(this.x, (aiaj) null, this.s);
            this.u = aqek;
            this.j = ahwo.UPLOAD_WAIT;
            this.b.l().a(ajbe.ACTIVE_COLLECTOR, false);
            this.w = 3;
            return true;
        } else {
            h(this.k + this.l);
            return false;
        }
    }

    public final void a(aibt aibt) {
        if (this.j != ahwo.SCAN_WAIT) {
            return;
        }
        if (aibt.a - this.r < 1000) {
            this.b.n().a(ajbe.ACTIVE_COLLECTOR, false, (aizx) null);
        } else {
            this.s = aibt;
        }
    }

    private final boolean i(long j) {
        float f;
        if (ahxc.a(1) && a()) {
            ahwo ahwo = ahwo.OFF;
            int ordinal = this.j.ordinal();
            if (!(ordinal == 0 || ordinal == 1)) {
                if (ordinal != 2) {
                    if (ordinal != 3 && ordinal != 4) {
                        return ordinal == 5 && this.l > j - this.k;
                    }
                    if (!this.q) {
                        return false;
                    }
                }
                if (!this.b.l().bf() || this.l <= j - this.k) {
                    return false;
                }
            }
            if (this.o && !this.t && this.u == null) {
                float f2 = this.m;
                if (!this.n) {
                    f = 0.7f;
                } else {
                    f = 0.3f;
                }
                if (f2 >= f || this.y.a()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final void a(aiwz aiwz) {
        ahwo ahwo = ahwo.OFF;
        int ordinal = this.j.ordinal();
        if (ordinal == 2) {
            if (!b(aiwz)) {
                j();
            } else if (this.p.isEmpty() || ahwp.a((aiwz) this.p.get(0), aiwz, 10)) {
                this.p.add(aiwz);
            } else {
                j();
                this.p.add(aiwz);
            }
            if (this.p.size() >= 2) {
                this.q = true;
            }
        } else if (ordinal != 3) {
            if (ordinal == 4) {
                if (!b(aiwz) || !ahwp.a((aiwz) this.p.get(0), aiwz, 10)) {
                    j();
                } else {
                    this.x = aiwz;
                }
            }
        } else if (!b(aiwz) || !ahwp.a((aiwz) this.p.get(0), aiwz, 10)) {
            j();
        }
    }

    public final void a(ajbe ajbe) {
        if (ajbe == ajbe.ACTIVE_COLLECTOR) {
            this.v = -1;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(long j) {
        if (!i(j)) {
            return false;
        }
        this.j = ahwo.IDLE;
        return true;
    }
}
