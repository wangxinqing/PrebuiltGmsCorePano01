package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorManager;

/* renamed from: ajbr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajbr implements ajbi {
    public final String a;
    public final Object b;
    public final SensorManager c;
    public final boolean d;
    public final aicn e;
    public final aico f;
    public ajbh g;
    private final Sensor h;
    private final boolean i;
    private final ajbg j;
    private ajbq k;
    private ajbo l;

    public ajbr(SensorManager sensorManager, int i2, boolean z, boolean z2, ajbg ajbg, aicn aicn, aico aico, String str) {
        this.b = new Object();
        this.c = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(i2);
        this.h = defaultSensor;
        this.i = z;
        this.j = ajbg;
        this.e = aicn;
        this.f = aico;
        boolean z3 = false;
        if (defaultSensor != null && z2) {
            z3 = true;
        }
        this.d = z3;
        this.a = str;
    }

    public final boolean a() {
        return this.d;
    }

    public final boolean b() {
        boolean z;
        synchronized (this.b) {
            z = this.g != null;
        }
        return z;
    }

    public final void c() {
        synchronized (this.b) {
            if (this.g != null) {
                this.g = null;
                if (this.i) {
                    this.c.cancelTriggerSensor(this.k, this.h);
                } else {
                    this.c.unregisterListener(this.l);
                }
            }
        }
    }

    public final boolean a(ajbh ajbh) {
        boolean z;
        synchronized (this.b) {
            if (!this.d) {
                throw new IllegalArgumentException("This trigger sensor is not supported on this device");
            } else if (!b()) {
                this.g = ajbh;
                if (!this.i) {
                    ajbo ajbo = new ajbo(this.j, this);
                    this.l = ajbo;
                    z = this.c.registerListener(ajbo, this.h, 0);
                } else {
                    ajbq ajbq = new ajbq(this.j, this);
                    this.k = ajbq;
                    z = this.c.requestTriggerSensor(ajbq, this.h);
                }
                if (z) {
                    return true;
                }
                return false;
            } else {
                throw new IllegalArgumentException("This trigger sensor is already enabled");
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ajbr(android.hardware.SensorManager r12, boolean r13) {
        /*
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 33
            r0.<init>(r1)
            java.lang.String r1 = "HardwareTriggerSensor.17"
            r0.append(r1)
            java.lang.String r10 = r0.toString()
            r4 = 17
            r5 = 1
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r11
            r3 = r12
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajbr.<init>(android.hardware.SensorManager, boolean):void");
    }
}
