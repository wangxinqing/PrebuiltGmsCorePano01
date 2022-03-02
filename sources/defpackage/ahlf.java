package defpackage;

import android.os.Bundle;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.Collections;

/* renamed from: ahlf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahlf extends ahil {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahlf() {
        super(400000000);
        ahnk ahnk = ahnk.UNKNOWN;
    }

    public final aibm a(long j, long j2, ahyq ahyq) {
        int i;
        ahyq ahyq2 = ahyq;
        ahmn ahmn = this.b;
        boolean z = true;
        if (ahmn == null) {
            int i2 = ahyq2.b;
            int a = ahil.a(ahyq2, i2 - 1, 400000000);
            if (a == -1) {
                return aibm.a(ahip.b((long) ahyq2.b), (Object) null, Collections.emptyList());
            }
            ahyq b = ahyq2.b(a, i2 - a);
            int i3 = b.b;
            double[] dArr = new double[i3];
            int a2 = b.a();
            for (int i4 = 0; i4 < i3; i4++) {
                double d = 0.0d;
                for (int i5 = 0; i5 < a2; i5++) {
                    double a3 = (double) b.a(i4, i5);
                    Double.isNaN(a3);
                    Double.isNaN(a3);
                    d += a3 * a3;
                }
                dArr[i4] = Math.sqrt(d);
            }
            double d2 = Double.MAX_VALUE;
            double d3 = Double.MIN_VALUE;
            for (int i6 = 0; i6 < i3; i6++) {
                double d4 = dArr[i6];
                if (d4 < d2) {
                    d2 = d4;
                }
                if (d4 > d3) {
                    d3 = d4;
                }
            }
            if (d3 - d2 >= 1.0d) {
                z = false;
            }
        } else if (ahmn != ahmn.STILL) {
            z = false;
        }
        if (!z) {
            i = 4;
        } else {
            i = 3;
        }
        ActivityRecognitionResult activityRecognitionResult = new ActivityRecognitionResult(new DetectedActivity(i, 100), j, j2, ahnk.STATIONARY_FROYO.am, (Bundle) null);
        this.c = false;
        return aibm.a(ahip.c, activityRecognitionResult, Collections.emptyList());
    }
}
