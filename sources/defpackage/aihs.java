package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.location.DeviceOrientation;
import com.google.android.location.fused.orientation.DeviceOrientationDetector$1;
import java.util.concurrent.TimeUnit;

/* renamed from: aihs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aihs extends nlb {
    private static final float E = (1.0f - (200000.0f / ((float) TimeUnit.SECONDS.toMicros(3))));
    public static final /* synthetic */ int l = 0;
    private static final Long m = Long.valueOf(TimeUnit.SECONDS.toNanos(1));
    private int A = -1;
    private int B = -1;
    private float C = Float.NaN;
    private float D = Float.NaN;
    private final aihz F;
    arua a = null;
    public boolean b;
    public float c = 0.0f;
    public Location d = null;
    public final Context e;
    public final BroadcastReceiver f;
    public final PowerManager g;
    public float h = Float.MAX_VALUE;
    public boolean i;
    public final Object j = new Object();
    public boolean k;
    private final Display n;
    private final SensorManager o;
    private final Handler p;
    private final Sensor q;
    private final Sensor r;
    private final Sensor s;
    private final DeviceOrientation t = new DeviceOrientation();
    private float u = Float.NaN;
    private final float[] v = new float[9];
    private final float[] w = new float[9];
    private final float[] x = new float[4];
    private final int y;
    private long z = Long.MIN_VALUE;

    public aihs(Context context, SensorManager sensorManager, Handler handler, aihz aihz) {
        super("DeviceOrientationDetector", "location");
        this.e = context;
        this.p = handler;
        this.o = sensorManager;
        this.g = (PowerManager) context.getSystemService("power");
        SensorManager sensorManager2 = this.o;
        int i2 = Build.VERSION.SDK_INT;
        Sensor defaultSensor = sensorManager2.getDefaultSensor(14);
        this.q = defaultSensor == null ? sensorManager2.getDefaultSensor(2) : defaultSensor;
        this.r = this.o.getDefaultSensor(1);
        this.s = this.o.getDefaultSensor(4);
        this.n = ((WindowManager) this.e.getSystemService("window")).getDefaultDisplay();
        this.y = (int) TimeUnit.MILLISECONDS.toMicros(ayaz.a.a().fopSensorSamplingPeriodMilliseconds());
        this.f = new DeviceOrientationDetector$1(this, "location");
        this.b = false;
        this.F = aihz;
    }

    public final void a() {
        Sensor sensor;
        if (this.i && (sensor = this.q) != null && this.r != null && this.s != null) {
            a(sensor, this.y);
            a(this.s, this.y);
            a(this.r, this.y);
        }
    }

    public final void b() {
        if (this.q != null && this.r != null && this.s != null) {
            this.o.unregisterListener(this);
        }
    }

    public final void c() {
        this.u = Float.NaN;
        this.h = Float.MAX_VALUE;
    }

    /* access modifiers changed from: protected */
    public final void a(Sensor sensor, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        this.o.registerListener(this, sensor, i2, 200000, this.p);
    }

    public final void a(SensorEvent sensorEvent) {
        float f2;
        float f3;
        float f4;
        float f5;
        arua arua;
        float f6;
        arud arud;
        float f7;
        int i2;
        int i3;
        float f8;
        float f9;
        arua arua2;
        SensorEvent sensorEvent2 = sensorEvent;
        if (sensorEvent2 != null && sensorEvent2.values != null && sensorEvent2.values.length >= 3 && this.a != null) {
            if (this.i) {
                if (!(this.z == Long.MIN_VALUE || sensorEvent2.timestamp - this.z <= m.longValue() || (arua2 = this.a) == null)) {
                    arua2.d = false;
                    arua2.e = 0.0f;
                    arua2.f = 0.0f;
                    arua2.g = 0.0f;
                    arua2.h = Double.NaN;
                    arua2.b.a();
                    arua2.a.b();
                    artz artz = arua2.c;
                    artz.a = Float.NaN;
                    artz.b = Float.NaN;
                    artz.c = Float.NaN;
                    artz.m = Float.NaN;
                    artz.n = Float.NaN;
                    artz.e.a();
                    artz.f.a();
                    artz.g.a();
                    artz.h = 45.0f;
                    artz.o = Long.MIN_VALUE;
                    arua2.k.b();
                    arua2.i = Long.MIN_VALUE;
                    arua2.j.a();
                }
                this.z = sensorEvent2.timestamp;
                int type = sensorEvent2.sensor.getType();
                if (type != 1) {
                    if (type == 2) {
                        f4 = 0.0f;
                        f3 = 0.0f;
                        f2 = 0.0f;
                    } else if (type == 4) {
                        arua arua3 = this.a;
                        float f10 = sensorEvent2.values[0];
                        float f11 = sensorEvent2.values[1];
                        float f12 = sensorEvent2.values[2];
                        long j2 = this.z;
                        arub arub = arua3.b;
                        if (arub.c > 0 && TimeUnit.NANOSECONDS.toSeconds(j2 - arub.c) > 1) {
                            arub.a();
                        }
                        arub.c = j2;
                        if (arub.d) {
                            arub.b.b();
                            aruh aruh = arub.b;
                            arue arue = arub.e;
                            float f13 = ((float) (j2 - arue.d)) * 1.0E-9f;
                            if (f13 > 0.04f) {
                                f13 = arue.c ? arue.a : 0.01f;
                            } else if (arue.b != 0) {
                                arue.a = aruf.a(0.95f, arue.a, f13);
                                int i4 = arue.b + 1;
                                arue.b = i4;
                                if (((float) i4) >= 10.0f) {
                                    arue.c = true;
                                }
                            } else {
                                arue.a = f13;
                                arue.b = 1;
                            }
                            arue.d = j2;
                            float sqrt = (float) Math.sqrt((double) ((f10 * f10) + (f11 * f11) + (f12 * f12)));
                            float f14 = f13 * sqrt;
                            if (((double) sqrt) > 1.0E-10d) {
                                f9 = ((float) Math.sin((double) (f14 / 2.0f))) / sqrt;
                            } else {
                                f9 = 0.0f;
                            }
                            aruh.a = f10 * f9;
                            aruh.b = f11 * f9;
                            aruh.c = f9 * f12;
                            aruh.d = (float) Math.cos((double) (f14 / 2.0f));
                            aruh aruh2 = arub.a;
                            aruh aruh3 = arub.b;
                            float f15 = aruh2.d;
                            float f16 = aruh3.a;
                            float f17 = aruh2.a;
                            float f18 = aruh3.d;
                            float f19 = aruh2.b;
                            float f20 = aruh3.c;
                            float f21 = aruh2.c;
                            float f22 = aruh3.b;
                            float f23 = (((f15 * f16) + (f17 * f18)) + (f19 * f20)) - (f21 * f22);
                            aruh2.a = f23;
                            float f24 = ((f15 * f22) - (f17 * f20)) + (f19 * f18) + (f21 * f16);
                            aruh2.b = f24;
                            float f25 = (((f15 * f20) + (f17 * f22)) - (f19 * f16)) + (f21 * f18);
                            aruh2.c = f25;
                            float f26 = (((f15 * f18) - (f17 * f16)) - (f19 * f22)) - (f21 * f20);
                            aruh2.d = f26;
                            float f27 = (f23 * f23) + (f24 * f24) + (f25 * f25) + (f26 * f26);
                            if (Math.abs(1.0f - f27) >= 2.107342E-8f) {
                                float sqrt2 = (float) Math.sqrt((double) f27);
                                if (sqrt2 != 0.0f) {
                                    float f28 = 1.0f / sqrt2;
                                    aruh2.a *= f28;
                                    aruh2.b *= f28;
                                    aruh2.c *= f28;
                                    aruh2.d *= f28;
                                } else {
                                    aruh2.b();
                                }
                            }
                        } else {
                            arub.a.b();
                            arub.e = new arue(j2);
                            arub.d = true;
                        }
                        arua3.a.a(j2, f10, f11, f12);
                        aruh aruh4 = arua3.b.a;
                        artz artz2 = arua3.c;
                        float f29 = aruh4.b;
                        float f30 = aruh4.c;
                        float f31 = aruh4.a;
                        float f32 = aruh4.d;
                        float a2 = aruf.a(((float) Math.toDegrees(Math.atan2((double) (1.0f - (((f29 + f29) * f29) + ((f30 + f30) * f30))), (double) (((f31 + f31) * f29) + ((f32 + f32) * f30))))) - 0.049804688f);
                        if (!Float.isNaN(a2)) {
                            artz2.b = a2;
                            artz2.j = j2;
                            return;
                        }
                        return;
                    } else if (type == 14) {
                        if (sensorEvent2.values.length >= 6) {
                            f3 = sensorEvent2.values[3];
                            f2 = sensorEvent2.values[4];
                            f4 = sensorEvent2.values[5];
                        } else {
                            f4 = 0.0f;
                            f3 = 0.0f;
                            f2 = 0.0f;
                        }
                    } else {
                        return;
                    }
                    arua arua4 = this.a;
                    float f33 = sensorEvent2.values[0];
                    float f34 = sensorEvent2.values[1];
                    float f35 = sensorEvent2.values[2];
                    long j3 = this.z;
                    aruc aruc = arua4.j;
                    arud arud2 = aruc.c;
                    if (arud2 == null) {
                        aruc.c = new arud(j3, f3, f2, f4);
                    } else if (Math.abs(arud2.a - f3) > 0.1f || Math.abs(aruc.c.b - f2) > 0.1f || Math.abs(aruc.c.c - f4) > 0.1f) {
                        float f36 = f33 - f3;
                        float f37 = f34 - f2;
                        float f38 = f35 - f4;
                        float sqrt3 = (float) Math.sqrt((double) ((f36 * f36) + (f37 * f37) + (f38 * f38)));
                        if (Float.isNaN(aruc.b) || Math.abs(sqrt3 - aruc.b) < 10.0f) {
                            aruc.c = new arud(j3, f3, f2, f4);
                            aruc.d = j3;
                        }
                    }
                    arud arud3 = arua4.j.c;
                    if (arud3 != null) {
                        f3 = arud3.a;
                        f2 = arud3.b;
                        f4 = arud3.c;
                    }
                    float f39 = f33 - f3;
                    float f40 = f34 - f2;
                    float f41 = f35 - f4;
                    double sqrt4 = Math.sqrt((double) ((f39 * f39) + (f40 * f40) + (f41 * f41)));
                    if (arua4.d) {
                        float f42 = arua4.g;
                        float f43 = arua4.f;
                        double d2 = (double) ((f40 * f42) - (f41 * f43));
                        float f44 = arua4.e;
                        double d3 = (double) ((f41 * f44) - (f42 * f39));
                        double d4 = (double) ((f43 * f39) - (f44 * f40));
                        Double.isNaN(d2);
                        Double.isNaN(d2);
                        Double.isNaN(d3);
                        Double.isNaN(d3);
                        Double.isNaN(d4);
                        Double.isNaN(d4);
                        double sqrt5 = 1.0d / Math.sqrt(((d2 * d2) + (d3 * d3)) + (d4 * d4));
                        arua = arua4;
                        float f45 = arua.e;
                        float f46 = arua.f;
                        f5 = f41;
                        float f47 = arua.g;
                        double sqrt6 = 1.0d / Math.sqrt((double) (((f45 * f45) + (f46 * f46)) + (f47 * f47)));
                        float f48 = arua.e;
                        Double.isNaN(d3);
                        f6 = f40;
                        double d5 = (double) arua.g;
                        Double.isNaN(d5);
                        Double.isNaN(d2);
                        double d6 = d5 * sqrt6 * d2 * sqrt5;
                        double d7 = (double) f48;
                        Double.isNaN(d7);
                        Double.isNaN(d4);
                        arua.h = Math.atan2(d3 * sqrt5, d6 - ((d7 * sqrt6) * (d4 * sqrt5)));
                        arua.i = j3;
                    } else {
                        f5 = f41;
                        f6 = f40;
                        arua = arua4;
                    }
                    artz artz3 = arua.c;
                    float f49 = (float) sqrt4;
                    if (!Float.isNaN(f49)) {
                        if (!Float.isNaN(artz3.a)) {
                            f49 = aruf.a(0.8f, artz3.a, f49);
                        }
                        artz3.a = f49;
                        artz3.i = j3;
                    }
                    artz artz4 = arua.c;
                    aruc aruc2 = arua.j;
                    long j4 = aruc2.d;
                    aruh aruh5 = null;
                    if (j4 == 0 || j3 - j4 >= aruc.a) {
                        arud = null;
                    } else {
                        arud = aruc2.c;
                    }
                    if (arud != null) {
                        artz4.o = arud.d;
                    }
                    if (!Double.isNaN(arua.h)) {
                        artz artz5 = arua.c;
                        float degrees = (float) Math.toDegrees(arua.h);
                        if (!Float.isNaN(degrees)) {
                            if (!Float.isNaN(artz5.c)) {
                                artz5.c = aruf.a((aruf.a(artz5.c - degrees) * 0.7f) + degrees);
                            } else {
                                artz5.c = degrees;
                            }
                            artz5.k = j3;
                            long j5 = artz5.l;
                            if (j5 == Long.MIN_VALUE || j3 - j5 >= artz.d) {
                                if (artz5.i != Long.MIN_VALUE && !Float.isNaN(artz5.a)) {
                                    artz5.g.a(artz5.a);
                                }
                                if (artz5.j != Long.MIN_VALUE && !Float.isNaN(artz5.b) && !Float.isNaN(artz5.m)) {
                                    artz5.e.a(aruf.a(artz5.b - artz5.m));
                                }
                                long j6 = artz5.k;
                                if (j6 == Long.MIN_VALUE || j3 - j6 > artz.d || Float.isNaN(artz5.c) || Float.isNaN(artz5.n)) {
                                    long j7 = artz5.k;
                                    if (j7 != Long.MIN_VALUE && j3 - j7 > artz.d) {
                                        artz5.f.a(1.0f);
                                    }
                                } else {
                                    artz5.f.a(aruf.a(artz5.c - artz5.n));
                                }
                                artz5.m = artz5.b;
                                artz5.n = artz5.c;
                                artz5.l = j3;
                            }
                        }
                    }
                    float a3 = arua.c.a(j3);
                    if (a3 == -1.0f) {
                        a3 = 180.0f;
                    }
                    arua.a.a(f39, f6, f5, a3);
                    if (this.a.a(this.z)) {
                        float[] b2 = this.a.b(this.z);
                        float[] fArr = this.v;
                        System.arraycopy(b2, 0, fArr, 0, fArr.length);
                        arua arua5 = this.a;
                        if (arua5.a(this.z)) {
                            f7 = arua5.a.a();
                        } else {
                            f7 = Float.NaN;
                        }
                        this.u = f7;
                        float a4 = aiik.a(this.n.getRotation(), this.v, this.w);
                        if (Math.abs(-3.4028235E38f + a4) < 1.0E-6f) {
                            c();
                        } else {
                            this.k = aiij.a(this.w);
                            if (aiik.a(a4)) {
                                f8 = aiik.b(this.c + a4);
                            } else {
                                f8 = Float.MAX_VALUE;
                            }
                            this.h = f8;
                            float f50 = this.u;
                            this.u = (!aiik.a(a4) || f50 < 0.0f || ((double) f50) > 3.141592653589793d) ? Float.NaN : this.u;
                        }
                        arua arua6 = this.a;
                        long j8 = this.z;
                        if (arua6.b(j8) != null) {
                            aruh5 = arua6.k;
                            float[] b3 = arua6.b(j8);
                            if (b3 != null) {
                                float f51 = b3[0];
                                float f52 = b3[4];
                                float f53 = b3[8];
                                float f54 = f51 + f52 + f53;
                                if (f54 > 1.0E-6f) {
                                    double sqrt7 = Math.sqrt((double) (f54 + 1.0f));
                                    float f55 = (float) (sqrt7 + sqrt7);
                                    aruh5.d = 0.25f * f55;
                                    aruh5.a = (b3[7] - b3[5]) / f55;
                                    aruh5.b = (b3[2] - b3[6]) / f55;
                                    aruh5.c = (b3[3] - b3[1]) / f55;
                                } else if (f51 > f52 && f51 > f53) {
                                    double sqrt8 = Math.sqrt((double) (((f51 + 1.0f) - f52) - f53));
                                    float f56 = (float) (sqrt8 + sqrt8);
                                    aruh5.d = (b3[7] - b3[5]) / f56;
                                    aruh5.a = 0.25f * f56;
                                    aruh5.b = (b3[3] + b3[1]) / f56;
                                    aruh5.c = (b3[2] + b3[6]) / f56;
                                } else if (f52 > f53) {
                                    double sqrt9 = Math.sqrt((double) (((f52 + 1.0f) - f51) - f53));
                                    float f57 = (float) (sqrt9 + sqrt9);
                                    aruh5.d = (b3[2] - b3[6]) / f57;
                                    aruh5.a = (b3[3] + b3[1]) / f57;
                                    aruh5.b = 0.25f * f57;
                                    aruh5.c = (b3[7] + b3[5]) / f57;
                                } else {
                                    double sqrt10 = Math.sqrt((double) (((f53 + 1.0f) - f51) - f52));
                                    float f58 = (float) (sqrt10 + sqrt10);
                                    aruh5.d = (b3[3] - b3[1]) / f58;
                                    aruh5.a = (b3[2] + b3[6]) / f58;
                                    aruh5.b = (b3[7] + b3[5]) / f58;
                                    aruh5.c = f58 * 0.25f;
                                }
                            }
                        }
                        if (aruh5 != null) {
                            float[] fArr2 = this.x;
                            fArr2[0] = aruh5.a;
                            fArr2[1] = aruh5.b;
                            fArr2[2] = aruh5.c;
                            fArr2[3] = aruh5.d;
                            float degrees2 = (float) ((int) Math.toDegrees((double) this.u));
                            if (degrees2 != Float.NaN) {
                                i2 = degrees2 > ((float) ayaz.l()) ? degrees2 > ((float) ayaz.n()) ? degrees2 <= ((float) ayaz.m()) ? 1 : 0 : 2 : 3;
                            } else {
                                i2 = -1;
                            }
                            this.B = i2;
                            float a5 = this.a.c.a(this.z);
                            if (a5 == -1.0f) {
                                a5 = 180.0f;
                            }
                            if (!Float.isNaN(this.D)) {
                                a5 = aruf.a(E, this.D, a5);
                            }
                            this.D = a5;
                            if (Float.isNaN(this.C) || Math.abs(this.D - this.C) >= ((float) ayaz.a.a().fopMinChangeErrorDegreesForLevelUpdate())) {
                                float f59 = this.D;
                                this.C = f59;
                                if (f59 <= 179.0f) {
                                    if (f59 >= 0.0f) {
                                        if (f59 <= ((float) ayaz.l())) {
                                            i3 = 3;
                                        } else if (f59 <= ((float) ayaz.n())) {
                                            i3 = 2;
                                        } else if (f59 <= ((float) ayaz.m())) {
                                            i3 = 1;
                                        }
                                    }
                                    i3 = 0;
                                } else {
                                    i3 = -1;
                                }
                                this.A = i3;
                            }
                            if (this.F != null && aiik.a(this.h)) {
                                float f60 = this.D;
                                if (f60 >= 0.0f && f60 <= 180.0f) {
                                    this.t.j();
                                    DeviceOrientation deviceOrientation = this.t;
                                    deviceOrientation.g = this.z;
                                    deviceOrientation.d = this.A;
                                    deviceOrientation.h = (byte) (deviceOrientation.h | 2);
                                    deviceOrientation.a((float) Math.toDegrees((double) this.h));
                                    DeviceOrientation deviceOrientation2 = this.t;
                                    deviceOrientation2.c = this.B;
                                    deviceOrientation2.h = (byte) (deviceOrientation2.h | 1);
                                    deviceOrientation2.a(this.x);
                                    this.t.b(this.D);
                                    this.F.a(this.t);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    c();
                    return;
                }
                arua arua7 = this.a;
                float f61 = sensorEvent2.values[0];
                float f62 = sensorEvent2.values[1];
                float f63 = sensorEvent2.values[2];
                if (arua7.d) {
                    arua7.e = (arua7.e * 0.8f) + (f61 * 0.19999999f);
                    arua7.f = (arua7.f * 0.8f) + (f62 * 0.19999999f);
                    arua7.g = (arua7.g * 0.8f) + (0.19999999f * f63);
                } else {
                    arua7.e = f61;
                    arua7.f = f62;
                    arua7.g = f63;
                    arua7.d = true;
                }
                arua7.a.a(f61, f62, f63);
                return;
            }
            c();
        }
    }
}
