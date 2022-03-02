package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.location.DeviceOrientation;
import com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor;
import com.google.location.bluemoon.inertialanchor.Pose;
import java.io.IOException;
import java.io.PrintWriter;

/* renamed from: aiie  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiie extends aiii implements arce {
    public final qvr a;
    public arce b;
    final float[] c;
    AndroidInertialAnchor d;
    boolean e;
    private final Context h;
    private final Display i;
    private final DeviceOrientation j;
    private final float[] k;
    private final float[] l;
    private final aihe m;
    private final int n;
    private final aihz o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiie(Context context, aidg aidg, aihz aihz) {
        super(context);
        aihe a2 = aihe.a(context);
        aihe a3 = aihe.a(context);
        int i2 = 1;
        if (axxm.l() && (a3 instanceof aihg)) {
            i2 = 2;
        }
        this.h = context;
        this.a = new qvr(aidg.a());
        this.o = aihz;
        this.m = a2;
        this.n = i2;
        this.j = new DeviceOrientation();
        this.k = new float[4];
        this.c = new float[9];
        this.l = new float[9];
        this.e = false;
        this.i = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        a2.a(this);
    }

    private static final void a(arcb arcb) {
        aucd o2 = arcq.l.o();
        boolean e2 = ayaz.e();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ((arcq) o2.b).a = e2;
        boolean g = ayaz.g();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ((arcq) o2.b).b = g;
        boolean k2 = aycp.k();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ((arcq) o2.b).c = k2;
        boolean g2 = aycp.g();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ((arcq) o2.b).d = g2;
        boolean i2 = aycp.i();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ((arcq) o2.b).e = i2;
        boolean f = aycp.f();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ((arcq) o2.b).f = f;
        boolean m2 = aycp.m();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ((arcq) o2.b).g = m2;
        boolean l2 = aycp.l();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ((arcq) o2.b).h = l2;
        boolean j2 = aycp.j();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ((arcq) o2.b).i = j2;
        boolean c2 = aycp.c();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ((arcq) o2.b).j = c2;
        boolean h2 = aycp.h();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ((arcq) o2.b).k = h2;
        arcb.e = (arcq) o2.i();
    }

    public final void a(float f) {
    }

    public final void a(float f, float f2, long j2) {
    }

    public final void a(long j2) {
    }

    public final void a(long j2, float f) {
    }

    public final boolean b() {
        boolean z = true;
        if (this.n != 1) {
            return true;
        }
        arcb a2 = AndroidInertialAnchor.a();
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = false;
        if (this.d == null) {
            a(a2);
            this.d = a2.a();
        } else {
            z = false;
        }
        AndroidInertialAnchor androidInertialAnchor = this.d;
        if (androidInertialAnchor != null) {
            z2 = androidInertialAnchor.b();
            if (z) {
                this.d = null;
                return z2;
            }
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    public final void c() {
        arcr arcr;
        if (this.n == 1) {
            arcb a2 = AndroidInertialAnchor.a();
            if (this.d == null) {
                a(a2);
                a2.b = this.a;
                a2.a(ayaz.h());
                a2.c = "FOP Inertial Anchor";
                a2.a((int) ayam.d());
                if (aycp.d() && ayaz.h()) {
                    a2.g = new arci(this.h, 2);
                }
                if (aycp.e()) {
                    arcr = aycp.b();
                } else {
                    try {
                        arcr = arcd.a(this.h, Integer.valueOf((int) ayaz.c()));
                    } catch (IOException e2) {
                        Log.e("GCoreFlp", "Error while loading InertialAnchor config for FOP (InertialAnchorOrientationEngine), using default.");
                        arcr = null;
                    }
                }
                a2.a = arcr;
                try {
                    if (ayaz.f()) {
                        a2.f = arcd.b(this.h, Integer.valueOf((int) ayaz.d()));
                    }
                } catch (IOException e3) {
                    Log.e("GCoreFlp", "Error while loading heading uncertainty model, using default.");
                }
                AndroidInertialAnchor a3 = a2.a();
                this.d = a3;
                if (a3 == null) {
                    Log.e("GCoreFlp", "Error while initializing Inertial Anchor. Inertial Anchor is not started");
                    return;
                }
            }
            if (this.f.isEmpty() && this.e) {
                this.d.a((arce) this);
                arce arce = this.b;
                if (arce != null) {
                    this.d.a(arce);
                }
                this.e = false;
                this.d.d();
            } else if (!this.f.isEmpty()) {
                if (!this.e && b()) {
                    this.d.a(this, this.a);
                    arce arce2 = this.b;
                    if (arce2 != null) {
                        this.d.a(arce2, this.a);
                    }
                    this.d.c();
                    this.e = true;
                } else {
                    Log.e("GCoreFlp", "Inertial Anchor is not supported on this device.");
                }
                if (this.e) {
                    this.g.f().a((acvv) new aiic(this));
                }
            }
        } else {
            if (!this.f.isEmpty() || !this.e) {
                if (this.e || !this.m.c(3)) {
                    return;
                }
            } else if (!this.m.d(3)) {
                return;
            }
            this.e = !this.e;
        }
    }

    public final void d() {
    }

    public final float a() {
        float a2 = aiik.a(this.i.getRotation(), this.c, this.l);
        if (!aiij.a(this.l)) {
            return Float.MAX_VALUE;
        }
        return a2;
    }

    public final void a(Location location) {
        AndroidInertialAnchor androidInertialAnchor;
        if (this.n == 1 && location != null && (androidInertialAnchor = this.d) != null) {
            androidInertialAnchor.a(location);
        }
    }

    public final void a(Pose pose) {
        aihz aihz = this.o;
        if (aihz != null) {
            this.j.j();
            pose.a(this.k);
            this.j.a(this.k);
            aqhe.a(this.c, this.k);
            this.j.b((float) Math.toDegrees((double) pose.headingErrorRad));
            this.j.a((float) Math.toDegrees((double) aiik.a(this.i.getRotation(), this.c, this.l)));
            aihz.a(this.j);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(PrintWriter printWriter) {
        String str;
        printWriter.println("Active OrientationEngine Instance: InertialAnchorOrientationEngine");
        int i2 = this.n;
        if (i2 != 1) {
            str = i2 != 2 ? "null" : "CHRE";
        } else {
            str = "AP";
        }
        StringBuilder sb = new StringBuilder(str.length() + 14);
        sb.append("Running Mode: ");
        sb.append(str);
        printWriter.println(sb.toString());
        AndroidInertialAnchor androidInertialAnchor = this.d;
        if (androidInertialAnchor != null) {
            boolean b2 = androidInertialAnchor.b();
            StringBuilder sb2 = new StringBuilder(35);
            sb2.append("Is Inertial Anchor supported: ");
            sb2.append(b2);
            printWriter.println(sb2.toString());
            this.d.a(printWriter);
        }
    }
}
