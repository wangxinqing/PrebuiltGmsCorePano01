package defpackage;

import android.os.Bundle;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/* renamed from: ahjq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahjq implements ahki {
    static final long a = TimeUnit.SECONDS.toMillis(90);
    private static final long b = TimeUnit.SECONDS.toMillis(4);
    private final ahmy c;
    private final float[][] d = ((float[][]) Array.newInstance(float.class, new int[]{18, 7}));
    private final long[] e = new long[18];
    private final float[] f = new float[6];
    private int g = -1;
    private long h = -1;

    public ahjq(ByteBuffer byteBuffer, int i, boolean z) {
        this.c = new ahmy(byteBuffer, i, z);
    }

    public final ActivityRecognitionResult a(ActivityRecognitionResult activityRecognitionResult) {
        throw new UnsupportedOperationException();
    }

    public final void a() {
    }

    public final void b() {
    }

    public final ActivityRecognitionResult a(TreeMap treeMap, long j, long j2, long j3, Bundle bundle) {
        long j4 = j;
        float[] fArr = null;
        if (treeMap == null || treeMap.isEmpty()) {
            return null;
        }
        int i = -1;
        if (j4 > this.h + a) {
            this.g = -1;
        } else if (((Long) treeMap.lastKey()).longValue() == this.e[this.g]) {
            return new ActivityRecognitionResult(ahmh.a(ahmh.a(this.f)), j2, j3, ahnk.CHRE_OAR_DNN_V2_BAR_GRU_V24.am, bundle);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            long longValue = ((Long) entry.getKey()).longValue();
            int i2 = this.g;
            if (i2 == i || longValue > this.e[i2]) {
                this.g = (i2 + 1) % 18;
                float[] fArr2 = new float[this.c.b];
                boolean z = false;
                for (DetectedActivity detectedActivity : (List) entry.getValue()) {
                    int a2 = detectedActivity.a();
                    int i3 = 4;
                    if (a2 == 1) {
                        i3 = 0;
                    } else if (a2 == 3) {
                        i3 = 5;
                    } else if (a2 == 4) {
                        i3 = 6;
                    } else if (a2 == 7) {
                        i3 = 2;
                    } else if (a2 == 8) {
                        i3 = 1;
                    } else if (a2 == 16) {
                        i3 = 3;
                    } else if (a2 != 17) {
                        i3 = -1;
                    }
                    if (i3 >= 0 && i3 < this.c.b) {
                        fArr2[i3] = (float) detectedActivity.e;
                        z = true;
                    }
                }
                if (!z) {
                    fArr2 = null;
                }
                if (fArr2 == null) {
                    return null;
                }
                System.arraycopy(fArr2, 0, this.d[this.g], 0, fArr2.length);
                this.e[this.g] = longValue;
                this.h = j4;
                i = -1;
            }
        }
        long j5 = this.e[this.g];
        this.c.a();
        int i4 = 0;
        while (i4 < 18) {
            int i5 = ((this.g - i4) + 18) % 18;
            if (this.e[i5] < j5 - b) {
                break;
            }
            fArr = this.c.c(this.d[i5]);
            i4++;
            j5 = this.e[i5];
        }
        this.c.b(fArr);
        System.arraycopy(fArr, 0, this.f, 0, fArr.length);
        return new ActivityRecognitionResult(ahmh.a(ahmh.a(fArr)), j2, j3, ahnk.CHRE_OAR_DNN_V2_BAR_GRU_V24.am, bundle);
    }
}
