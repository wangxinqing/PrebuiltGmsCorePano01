package com.google.location.bluemoon.inertialanchor;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ThreeAxisCalibrationData {
    public aqhh bias;
    public float quality;
    public arde sensorType;
    public long timestampNanos = -1;

    public ThreeAxisCalibrationData(arde arde, aqhh aqhh) {
        this.sensorType = arde;
        this.bias = aqhh.b();
        this.quality = Float.POSITIVE_INFINITY;
    }

    private void setBias(double d, double d2, double d3) {
        aqhh aqhh = this.bias;
        aqhh.c = d;
        aqhh.d = d2;
        aqhh.e = d3;
    }

    private void setSensorTypeFromInt(int i) {
        this.sensorType = arde.a(i);
    }
}
