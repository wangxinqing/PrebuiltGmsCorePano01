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

/* renamed from: aiih  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiih extends aiii implements arce, aihb {
    public final qvr a;
    final float[] b = new float[9];
    AndroidInertialAnchor c;
    boolean d = false;
    final aiil e;
    private final Context h;
    private final Display i;
    private final DeviceOrientation j = new DeviceOrientation();
    private final float[] k = new float[4];
    private final float[] l = new float[9];
    private final aihe m;
    private final aihz n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiih(Context context, aidg aidg, aihz aihz) {
        super(context);
        aihe a2 = aihe.a(context);
        this.h = context;
        this.a = new qvr(aidg.a());
        this.n = aihz;
        this.m = a2;
        this.i = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        this.e = new aiil(this);
        if (axxm.l()) {
            a2.a(this.e.b(2));
            a2.a((aihb) this);
        }
    }

    private static final void a(arcb arcb) {
        aucd o = arcq.l.o();
        boolean e2 = ayaz.e();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((arcq) o.b).a = e2;
        boolean g = ayaz.g();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((arcq) o.b).b = g;
        boolean k2 = aycp.k();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((arcq) o.b).c = k2;
        boolean g2 = aycp.g();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((arcq) o.b).d = g2;
        boolean i2 = aycp.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((arcq) o.b).e = i2;
        boolean f = aycp.f();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((arcq) o.b).f = f;
        boolean m2 = aycp.m();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((arcq) o.b).g = m2;
        boolean l2 = aycp.l();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((arcq) o.b).h = l2;
        boolean j2 = aycp.j();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((arcq) o.b).i = j2;
        boolean c2 = aycp.c();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((arcq) o.b).j = c2;
        boolean h2 = aycp.h();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((arcq) o.b).k = h2;
        arcb.e = (arcq) o.i();
    }

    private final void b(boolean z) {
        arcr arcr;
        arcb a2 = AndroidInertialAnchor.a();
        AndroidInertialAnchor androidInertialAnchor = this.c;
        if (androidInertialAnchor == null) {
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
                    Log.e("GCoreFlp", "Error while loading InertialAnchor config for FOP (InertialAnchorOrientationEngineV2), using default.");
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
            androidInertialAnchor = a2.a();
            this.c = androidInertialAnchor;
            if (androidInertialAnchor == null) {
                Log.e("GCoreFlp", "Error while initializing Inertial Anchor. Inertial Anchor is not started");
                return;
            }
        }
        if (z) {
            androidInertialAnchor.a(this.e.b(1), this.a);
            this.c.c();
            return;
        }
        androidInertialAnchor.a(this.e.b(1));
        this.c.d();
    }

    private final void c(boolean z) {
        if (!z) {
            this.m.d(3);
        } else if (axxm.l()) {
            this.m.c(3);
        }
    }

    public final void a(float f) {
    }

    public final void a(float f, float f2, long j2) {
    }

    public final void a(long j2) {
    }

    public final void a(long j2, float f) {
    }

    public final void b(int i2) {
    }

    public final void be() {
    }

    public final void d() {
    }

    /* access modifiers changed from: protected */
    public final void c() {
        if (this.f.isEmpty() && this.d) {
            b(false);
            c(false);
            this.e.a(1, false);
            this.d = false;
        } else if (!this.d && b()) {
            b(true);
            c(true);
            this.d = true;
        }
        if (this.d) {
            this.g.f().a((acvv) new aiif(this));
        }
    }

    public final boolean b() {
        boolean z;
        arcb a2 = AndroidInertialAnchor.a();
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = false;
        if (this.c == null) {
            a(a2);
            this.c = a2.a();
            z = true;
        } else {
            z = false;
        }
        AndroidInertialAnchor androidInertialAnchor = this.c;
        if (androidInertialAnchor != null) {
            z2 = androidInertialAnchor.b();
            if (z) {
                this.c = null;
                return z2;
            }
        }
        return z2;
    }

    public final float a() {
        float a2 = aiik.a(this.i.getRotation(), this.b, this.l);
        if (!aiij.a(this.l)) {
            return Float.MAX_VALUE;
        }
        return a2;
    }

    public final void a(int i2) {
        this.e.a(1);
    }

    public final void a(Location location) {
        if (location != null) {
            AndroidInertialAnchor androidInertialAnchor = this.c;
            if (androidInertialAnchor != null) {
                androidInertialAnchor.a(location);
            }
            if (axxm.l() && axxm.n()) {
                this.m.a(location);
            }
        }
    }

    public final void a(Pose pose) {
        aihz aihz = this.n;
        if (aihz != null) {
            this.j.j();
            pose.a(this.k);
            this.j.a(this.k);
            aqhe.a(this.b, this.k);
            this.j.b((float) Math.toDegrees((double) pose.headingErrorRad));
            this.j.a((float) Math.toDegrees((double) aiik.a(this.i.getRotation(), this.b, this.l)));
            aihz.a(this.j);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(PrintWriter printWriter) {
        String str;
        printWriter.println("Active OrientationEngine Instance: InertialAnchorOrientationEngineV2");
        int i2 = this.e.c;
        if (i2 != 1) {
            str = i2 != 2 ? "null" : "CHRE";
        } else {
            str = "AP";
        }
        StringBuilder sb = new StringBuilder(str.length() + 14);
        sb.append("Running Mode: ");
        sb.append(str);
        printWriter.println(sb.toString());
        AndroidInertialAnchor androidInertialAnchor = this.c;
        if (androidInertialAnchor != null) {
            boolean b2 = androidInertialAnchor.b();
            StringBuilder sb2 = new StringBuilder(35);
            sb2.append("Is Inertial Anchor supported: ");
            sb2.append(b2);
            printWriter.println(sb2.toString());
            this.c.a(printWriter);
        }
    }

    public final void a(boolean z) {
        if (z && axxm.l()) {
            this.e.a(2);
        } else {
            this.e.a(1);
        }
    }
}
