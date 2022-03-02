package com.google.location.bluemoon.inertialanchor;

import android.hardware.GeomagneticField;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.io.PrintWriter;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AndroidInertialAnchor extends InertialAnchorBase {
    Handler a = null;
    Handler b = null;
    Pose c = Pose.a();
    public ThreeAxisCalibrationData d = new ThreeAxisCalibrationData(arde.SENSOR_TYPE_UNSPECIFIED, aqhh.a);
    public boolean e = false;
    public Location f = null;
    private final String n;
    private arcf o = null;
    private boolean p = false;
    private final amsv q = amta.a(arbt.a);
    private final ReentrantLock r = new ReentrantLock();
    private final arcc s = new arcc(this.h);

    public AndroidInertialAnchor(arcb arcb) {
        super(arcb.a, arcb.e);
        Handler handler = arcb.b;
        this.b = handler == null ? new qvr(Looper.getMainLooper()) : handler;
        this.n = arcb.c;
        this.p = arcb.d;
        if (aycp.a.a().useMagFieldTracker()) {
            this.o = new arcf();
        }
        if (aycp.d()) {
            this.m = arcb.g;
        }
        int i = Build.VERSION.SDK_INT;
    }

    public static arcb a() {
        return new arcb();
    }

    public final boolean b() {
        return this.g.isSupported(e());
    }

    public final void c() {
        arci arci;
        byte[] clientLog;
        if (aycp.d() && (arci = this.m) != null && arci.a() && (clientLog = this.g.getClientLog(e())) != null) {
            try {
                aucd o2 = anzg.c.o();
                o2.b(clientLog, aubs.c());
                arci arci2 = this.m;
                anzg anzg = (anzg) o2.i();
                if (aycp.d() && arci2.a() && ((double) arci2.c.nextFloat()) < aycp.a.a().clearcutLogSamplingRate()) {
                    arci2.e.o().a((acvv) new arch(arci2, anzg));
                }
            } catch (auda e2) {
                String valueOf = String.valueOf(e2.getMessage());
                if (valueOf.length() == 0) {
                    new String("Inertial Anchor Clearcut not uploaded, log bytes parse error.");
                } else {
                    "Inertial Anchor Clearcut not uploaded, log bytes parse error.".concat(valueOf);
                }
            }
        }
        if (this.h.isEmpty()) {
            throw new IllegalStateException("Listener list is empty.");
        } else if (b()) {
            this.r.lock();
            try {
                this.g.setMainThreadJniEnv(e());
                this.e = true;
                this.b.post(new arbu(this));
            } finally {
                this.r.unlock();
            }
        } else {
            throw new IllegalStateException("Device is not supported.");
        }
    }

    public final void d() {
        this.r.lock();
        try {
            synchronized (this.l) {
                this.b.post(new arbv(this, this.k));
            }
            this.r.unlock();
        } catch (Throwable th) {
            this.r.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public void onBearingUpdate(float f2, float f3, long j) {
        if (this.r.tryLock()) {
            this.a.post(new arca(this, f2, f3, j));
            this.r.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public void onCalibrationUpdate() {
        if (this.r.tryLock()) {
            this.a.post(new arby(this));
            this.r.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public void onCarryChangeUpdate(long j, long j2, long j3, float f2) {
        if (this.r.tryLock()) {
            this.a.post(new arbz(this, j3, f2));
            this.r.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public void onFilterReInit(long j) {
        if (this.r.tryLock()) {
            this.a.post(new arbw(this, j));
            this.r.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public void onPoseRateChange(float f2) {
        if (this.r.tryLock()) {
            this.a.post(new arbx(this, f2));
            this.r.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public void onPoseUpdate() {
        ReentrantLock reentrantLock;
        if (this.r.tryLock()) {
            try {
                Pose pose = this.c;
                if (pose == null) {
                    throw new IllegalArgumentException("outPose cannot be null.");
                } else if (this.g.getLatestPose(e(), pose)) {
                    ((Boolean) this.q.a()).booleanValue();
                    Pose pose2 = this.c;
                    if (pose2 != null) {
                        arcc arcc = this.s;
                        arcc.a = pose2;
                        this.a.post(arcc);
                    }
                    reentrantLock = this.r;
                    reentrantLock.unlock();
                } else {
                    throw new IllegalStateException("Error occurred when querying pose from native.");
                }
            } catch (IllegalArgumentException | IllegalStateException e2) {
                e2.getMessage();
                reentrantLock = this.r;
            } catch (Throwable th) {
                this.r.unlock();
                throw th;
            }
        }
    }

    public final void a(Location location) {
        if (location != null) {
            arcf arcf = this.o;
            if (arcf == null) {
                Location location2 = this.f;
                if (location2 == null || location2.distanceTo(location) >= 100000.0f) {
                    GeomagneticField geomagneticField = new GeomagneticField((float) location.getLatitude(), (float) location.getLongitude(), (float) location.getAltitude(), location.getTime());
                    aucd o2 = arcv.b.o();
                    aucd o3 = arcy.d.o();
                    double radians = Math.toRadians((double) geomagneticField.getDeclination());
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    ((arcy) o3.b).c = radians;
                    double radians2 = Math.toRadians((double) geomagneticField.getInclination());
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    ((arcy) o3.b).b = radians2;
                    double fieldStrength = (double) geomagneticField.getFieldStrength();
                    Double.isNaN(fieldStrength);
                    double d2 = fieldStrength * 0.001d;
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    ((arcy) o3.b).a = d2;
                    arcy arcy = (arcy) o3.i();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    arcy.getClass();
                    ((arcv) o2.b).a = arcy;
                    a((arcv) o2.i());
                    this.f = location;
                    return;
                }
                return;
            }
            arcv a2 = arcf.a(location);
            if (a2 != null) {
                a(a2);
            }
        }
    }

    public final void a(arce arce, Handler handler) {
        if (arce != null) {
            synchronized (this.h) {
                this.h.add(arce);
            }
            if (handler == null) {
                handler = new qvr(Looper.getMainLooper());
            }
            this.a = handler;
            return;
        }
        throw new IllegalArgumentException("listener cannot be null.");
    }

    public final void a(PrintWriter printWriter) {
        if (this.p) {
            printWriter.println(String.format("### %s START ###", new Object[]{this.n}));
            try {
                byte[] debugLog = this.g.getDebugLog(e());
                if (debugLog != null) {
                    arcm arcm = (arcm) aucj.a((aucj) arcm.a, debugLog);
                    printWriter.println("IA_LOG: OK");
                    printWriter.println(anml.e.a(debugLog));
                } else {
                    printWriter.println("IA_LOG: PROTO_NULL");
                }
            } catch (auda e2) {
                e2.getMessage();
                printWriter.println("IA_LOG: PROTO_ERROR");
            }
            printWriter.println(String.format("### %s STOP ###", new Object[]{this.n}));
            printWriter.println("");
        }
    }
}
