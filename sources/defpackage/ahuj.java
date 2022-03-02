package defpackage;

import android.location.GnssMeasurementsEvent;
import android.location.GnssNavigationMessage;
import android.location.GpsStatus;
import android.location.Location;
import android.telephony.CellLocation;
import java.util.List;

/* renamed from: ahuj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
interface ahuj {
    void a();

    void a(float f, float f2, float f3, float f4);

    void a(float f, float f2, float f3, float f4, float f5, float f6, int i, long j, long j2);

    void a(float f, float f2, float f3, float f4, int i, long j, long j2);

    void a(float f, float f2, float f3, int i, long j, long j2);

    void a(float f, int i, long j, long j2);

    void a(int i, int i2);

    void a(int i, int i2, int i3);

    void a(int i, int i2, long j);

    void a(int i, long j);

    void a(int i, String str, CellLocation cellLocation, int i2, long j);

    void a(int i, long[] jArr, float[][] fArr);

    void a(aizo aizo, int i, long j);

    void a(GnssMeasurementsEvent gnssMeasurementsEvent, long j);

    void a(GnssNavigationMessage gnssNavigationMessage, long j);

    void a(GpsStatus gpsStatus, long j);

    void a(Location location, long j);

    void a(List list, List list2, long j);

    void a(double[] dArr, double[] dArr2, double[] dArr3, double[] dArr4, double[] dArr5, long j);

    void a(float[] fArr, long j, int i);

    void b(float f, float f2, float f3, int i, long j, long j2);

    void b(float f, int i, long j, long j2);

    void c(float f, float f2, float f3, int i, long j, long j2);

    void c(float f, int i, long j, long j2);

    void d(float f, float f2, float f3, int i, long j, long j2);

    void d(float f, int i, long j, long j2);

    void e(float f, int i, long j, long j2);
}
