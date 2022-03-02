package defpackage;

import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: ahwp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ahwp {
    protected final String a;
    final ajbd b;
    final aizy c;
    final ajbg d;
    final ahqq e;
    final ajph f;
    final ajbx g;
    public boolean h = false;
    public final ahwm i;
    public ahwo j;
    private boolean k = true;

    public ahwp(String str, ajbd ajbd, aizy aizy, ajbg ajbg, ahqq ahqq, ajbx ajbx, ajph ajph, ahwm ahwm, ahwo ahwo) {
        this.b = ajbd;
        this.d = ajbg;
        this.c = aizy;
        this.e = ahqq;
        this.g = ajbx;
        this.f = ajph;
        this.i = ahwm;
        this.j = ahwo;
        this.a = str;
    }

    protected static aqek a(long j2, aiwz aiwz, aiaj aiaj, aibt aibt, ActivityRecognitionResult activityRecognitionResult, boolean z, int i2, int i3) {
        aqek aqek;
        long j3 = j2;
        aiwz aiwz2 = aiwz;
        aiaj aiaj2 = aiaj;
        aibt aibt2 = aibt;
        ActivityRecognitionResult activityRecognitionResult2 = activityRecognitionResult;
        aqek aqek2 = new aqek(ajck.ah);
        if (aiwz2 != null) {
            boolean z2 = aiaj2 != null ? true : aibt2 != null;
            aqek aqek3 = new aqek(ajck.O);
            aqek3.g(1, aell.b(aiwz.b()));
            aqek3.g(2, aell.b(aiwz.c()));
            aqek aqek4 = new aqek(ajck.X);
            aqek4.b(1, (Object) aqek3);
            aqek4.g(8, 0);
            aqek4.b(6, aiwz.e());
            aqek4.b(17, z);
            aqek4.g(3, (int) aiwz.a());
            if (aiwz2.a.hasSpeed()) {
                aqek4.b(16, aiwz.d());
            }
            if (aiwz.i()) {
                aqek4.g(13, (int) aiwz.g());
            }
            if (z2 && aiwz.h()) {
                aqek4.g(10, (int) aiwz.f());
            }
            aqek2.b(3, (Object) aqek4);
            aqek2.b(14, (aiwz2.b + j3) - aiwz.e());
        }
        if (aiaj2 != null) {
            aqek2.b(1, (Object) aiaj2.b(j3));
        }
        if (aibt2 != null) {
            if (!aibt2.b.isEmpty()) {
                aqek = aibt2.d;
                if (aqek == null) {
                    aibt2.d = new aqek(ajck.N);
                    aibt2.d.b(1, aibt2.a + j3);
                    int min = Math.min(25, aibt2.b.size());
                    int i4 = 0;
                    while (i4 < min) {
                        aqek aqek5 = aibt2.d;
                        aibs aibs = (aibs) aibt2.b.get(i4);
                        long j4 = aibt2.a;
                        aqek a2 = aibu.a(Long.valueOf(aibs.e));
                        a2.g(4, aibs.g);
                        aibu.a(a2, aibs.h);
                        a2.b(2, (Object) aibs.f);
                        int i5 = i4;
                        long j5 = aibs.i;
                        if (j5 != 0) {
                            a2.g(12, (int) Math.abs(j4 - j5));
                        }
                        aqek5.a(2, (Object) a2);
                        i4 = i5 + 1;
                    }
                    aqek = aibt2.d;
                }
            } else {
                aqek = null;
            }
            aqek2.b(2, (Object) aqek);
        }
        if (ayag.c() && activityRecognitionResult2 != null) {
            aqek aqek6 = new aqek(ajck.v);
            aqek6.b(1, activityRecognitionResult2.c + j3);
            aqek6.g(3, activityRecognitionResult2.d);
            List<DetectedActivity> list = activityRecognitionResult2.a;
            if (list != null) {
                for (DetectedActivity detectedActivity : list) {
                    aqek aqek7 = new aqek(ajck.u);
                    aqek7.g(1, detectedActivity.a());
                    aqek7.g(2, detectedActivity.e);
                    aqek6.a(2, (Object) aqek7);
                }
            }
            aqek2.b(19, (Object) aqek6);
        }
        aqek aqek8 = new aqek(ajck.U);
        aqek8.g(1, i2);
        aqek8.g(8, i3);
        aqek2.a(99, (Object) aqek8);
        return aqek2;
    }

    private final String i() {
        String valueOf = String.valueOf(getClass().getSimpleName());
        return valueOf.length() == 0 ? new String("fault from instance of ") : "fault from instance of ".concat(valueOf);
    }

    public void a(int i2, int i3, boolean z) {
    }

    public void a(ahqp ahqp) {
    }

    public void a(aiaj aiaj) {
    }

    public void a(aibt aibt) {
    }

    public void a(aiwz aiwz) {
    }

    public void a(ajbe ajbe) {
    }

    public void a(aqek aqek) {
    }

    public void a(ActivityRecognitionResult activityRecognitionResult) {
    }

    public void a(PrintWriter printWriter) {
    }

    public void a(Object obj) {
    }

    public void a(boolean z) {
        this.h = z;
    }

    public void b() {
        boolean z = false;
        do {
            ahwo ahwo = this.j;
            long c2 = this.c.c();
            ahwo ahwo2 = ahwo.OFF;
            switch (this.j.ordinal()) {
                case 0:
                    z = a(c2);
                    break;
                case 1:
                    z = b(c2);
                    break;
                case 2:
                    z = c(c2);
                    break;
                case 3:
                    z = d(c2);
                    break;
                case 4:
                    z = e(c2);
                    break;
                case 5:
                    z = f(c2);
                    break;
                case 6:
                    z = f();
                    break;
                case 7:
                    z = h();
                    break;
                case 8:
                    z = g();
                    break;
            }
            ahwo ahwo3 = this.j;
            if (ahwo != ahwo3) {
                Object[] objArr = {ahwo, ahwo3};
                continue;
            }
        } while (z);
    }

    public void b(boolean z) {
    }

    public void c(boolean z) {
    }

    public void d() {
        this.k = false;
    }

    public void d(boolean z) {
    }

    public void e() {
    }

    public void e(boolean z) {
    }

    /* access modifiers changed from: protected */
    public boolean f() {
        throw new RuntimeException(i());
    }

    public void g(long j2) {
    }

    /* access modifiers changed from: protected */
    public boolean g() {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean h() {
        return false;
    }

    public boolean c() {
        return this.j == ahwo.OFF || this.j == ahwo.IDLE;
    }

    /* access modifiers changed from: protected */
    public boolean f(long j2) {
        throw new RuntimeException(i());
    }

    /* access modifiers changed from: protected */
    public boolean c(long j2) {
        throw new RuntimeException(i());
    }

    /* access modifiers changed from: protected */
    public boolean d(long j2) {
        throw new RuntimeException(i());
    }

    /* access modifiers changed from: protected */
    public boolean e(long j2) {
        throw new RuntimeException(i());
    }

    /* access modifiers changed from: protected */
    public boolean b(long j2) {
        throw new RuntimeException(i());
    }

    protected static boolean a(aibt aibt, aiwz aiwz) {
        return (aibt == null || aiwz == null || Math.abs(aibt.a - aiwz.b) > 720000) ? false : true;
    }

    protected static boolean a(aiwz aiwz, aiwz aiwz2, int i2) {
        return aell.b(aiwz.b(), aiwz.c(), aiwz2.b(), aiwz2.c()) < ((double) i2);
    }

    protected static boolean a(ActivityRecognitionResult activityRecognitionResult, aiwz aiwz) {
        if (aiwz != null) {
            return ayag.b() <= 0 || Math.abs(activityRecognitionResult.c - aiwz.b) <= ayag.b();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean a() {
        return this.k && !this.h && ahwx.a();
    }

    /* access modifiers changed from: protected */
    public boolean a(long j2) {
        throw new RuntimeException(i());
    }
}
