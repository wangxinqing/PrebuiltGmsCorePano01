package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: asif  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asif implements Runnable, asia, asib {
    public final asic a;
    public final ashy b;
    public boolean c;
    final /* synthetic */ asig d;
    private final HashSet e;
    private int f;
    private long g;
    private final Runnable h = new asid(this);
    private final Runnable i = new asie(this);

    public asif(asig asig, asic asic, ashy ashy, asic[] asicArr) {
        this.d = asig;
        iva.a((Object) asic);
        this.a = asic;
        iva.a((Object) ashy);
        this.b = ashy;
        if (asicArr == null || asicArr.length == 0) {
            this.e = null;
        } else {
            HashSet hashSet = new HashSet();
            this.e = hashSet;
            hashSet.addAll(Arrays.asList(asicArr));
        }
        this.c = false;
        b(0);
    }

    private final void a(long j) {
        if (j > 0) {
            this.d.b.postDelayed(this, j);
        } else {
            run();
        }
    }

    private final void b(int i2) {
        if (this.f != i2) {
            this.f = i2;
            if (i2 == 0) {
                this.d.f.remove(this.a);
                asig asig = this.d;
                asig.b.post(asig.g);
            } else if (i2 == 1) {
                if (this.d.f.contains(this.a)) {
                    anih anih = (anih) asil.a.b();
                    anih.a((Throwable) new IllegalStateException());
                    ((anih) anih.a("asif", "b", 453, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DutyCycler: Should not be in running when transitioning to WARMUP");
                }
                this.d.f.add(this.a);
            } else if (i2 != 2) {
                if (i2 != 3) {
                    anih anih2 = (anih) asil.a.b();
                    anih2.a((Throwable) new IllegalStateException());
                    ((anih) anih2.a("asif", "b", 473, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DutyCycler: Unknown state %d", i2);
                    b(0);
                } else if (!this.d.f.contains(this.a)) {
                    anih anih3 = (anih) asil.a.b();
                    anih3.a((Throwable) new IllegalStateException());
                    ((anih) anih3.a("asif", "b", 467, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DutyCycler: Should already be in running when transitioning to COOLDOWN.");
                    this.d.f.add(this.a);
                }
            } else if (!this.d.f.contains(this.a)) {
                anih anih4 = (anih) asil.a.b();
                anih4.a((Throwable) new IllegalStateException());
                ((anih) anih4.a("asif", "b", 460, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DutyCycler: Should already be in running when transitioning to ACTIVE.");
                this.d.f.add(this.a);
            }
        }
    }

    private final void e() {
        int i2 = this.f;
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2) {
                this.a.a(asig.a);
                b(0);
                return;
            } else if (i2 != 3) {
                ((anih) ((anih) asil.a.b()).a("asif", "e", 494, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DutyCycler: Unknown state in runFinishSafely.");
                return;
            }
        }
        b(0);
    }

    public final boolean a(int i2) {
        return this.c || this.f == i2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        if (!a(3)) {
            anih anih = (anih) asil.a.b();
            anih.a(anig.MEDIUM);
            ((anih) anih.a("asif", "c", 408, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DutyCycler: Should be in cooldown state");
        }
        run();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d() {
        if (!a(1)) {
            anih anih = (anih) asil.a.b();
            anih.a(anig.MEDIUM);
            ((anih) anih.a("asif", "d", 395, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DutyCycler: Should be in warmup state.");
        }
        run();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof asif) {
            return this.a.equals(((asif) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void run() {
        if (!this.c) {
            int i2 = this.f;
            if (i2 == 0) {
                b(1);
                this.g = SystemClock.elapsedRealtime();
                this.a.a((asia) this);
            } else if (i2 == 1) {
                b(2);
                a(this.b.b);
            } else if (i2 == 2) {
                b(3);
                this.a.a((asib) this);
            } else if (i2 != 3) {
                ((anih) ((anih) asil.a.b()).a("asif", "run", 385, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DutyCycler: Unknown state.  Going to wait state immediately.");
                b(0);
                a(this.b.a);
            } else {
                b(0);
                long j = this.b.a;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.d.a(this, (j - elapsedRealtime) + this.g);
            }
        } else {
            int i3 = this.f;
            if (i3 != 0) {
                if (i3 == 1 || i3 == 2) {
                    this.a.a(asig.a);
                    b(0);
                    return;
                } else if (i3 != 3) {
                    ((anih) ((anih) asil.a.b()).a("asif", "e", 494, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DutyCycler: Unknown state in runFinishSafely.");
                    return;
                }
            }
            b(0);
        }
    }

    public final void a() {
        this.d.b.post(this.i);
    }

    public final boolean a(asic asic) {
        HashSet hashSet = this.e;
        if (hashSet != null) {
            return hashSet.contains(asic);
        }
        return false;
    }

    public final void b() {
        this.d.b.post(this.h);
    }
}
