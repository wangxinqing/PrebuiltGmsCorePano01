package com.google.location.bluemoon.inertialanchor;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class Pose {
    private final aqhh accelBiasMps2;
    public final aqhg attitude;
    private final aqhh gyroBiasRps;
    public final float headingErrorRad;
    private final aqhh positionM;
    public long timestampNanos = 0;
    private final aqhh velocityMps;

    public Pose(arcg arcg) {
        this.timestampNanos = arcg.f;
        this.attitude = arcg.a;
        this.positionM = arcg.c;
        this.gyroBiasRps = arcg.d;
        this.accelBiasMps2 = arcg.e;
        this.velocityMps = arcg.b;
        this.headingErrorRad = 0.0f;
    }

    public static Pose a() {
        arcg arcg = new arcg();
        arcg.f = 0;
        aqhg a = aqhg.a();
        aqhg aqhg = arcg.a;
        a.a(aqhg);
        aqhg.b();
        arcg.a = aqhg;
        arcg.c = new aqhh();
        arcg.b = new aqhh();
        return new Pose(arcg);
    }

    private void setAccelBiasMps2(double d, double d2, double d3) {
        aqhh aqhh = this.accelBiasMps2;
        aqhh.c = d;
        aqhh.d = d2;
        aqhh.e = d3;
    }

    private void setGyroBiasRps(double d, double d2, double d3) {
        aqhh aqhh = this.gyroBiasRps;
        aqhh.c = d;
        aqhh.d = d2;
        aqhh.e = d3;
    }

    public void setAttitude(double d, double d2, double d3, double d4) {
        this.attitude.a(d, d2, d3, d4);
    }

    public void setPositionM(double d, double d2, double d3) {
        aqhh aqhh = this.positionM;
        aqhh.c = d;
        aqhh.d = d2;
        aqhh.e = d3;
    }

    public void setVelocityMps(double d, double d2, double d3) {
        aqhh aqhh = this.velocityMps;
        aqhh.c = d;
        aqhh.d = d2;
        aqhh.e = d3;
    }

    public final void a(float[] fArr) {
        aqhg aqhg = this.attitude;
        fArr[0] = (float) aqhg.a;
        fArr[1] = (float) aqhg.b;
        fArr[2] = (float) aqhg.c;
        fArr[3] = (float) aqhg.d;
    }
}
