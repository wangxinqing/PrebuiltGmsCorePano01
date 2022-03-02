package defpackage;

import android.os.Bundle;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* renamed from: ahke  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahke implements ahki {
    private int a;
    private ahmy b;
    private final ahmy c;
    private final ahmy d;
    private int[] e;
    private final int[] f;
    private final int[] g;
    private int h = 0;
    private final float[] i;
    private long j = 0;
    private long k = 0;
    private int l = 0;
    private int m = 0;
    private int n = 0;
    private int o = 0;
    private Bundle p = null;
    private final boolean q;
    private final boolean r;
    private final boolean s;

    public ahke(ByteBuffer byteBuffer, String str, ByteBuffer byteBuffer2, String str2, String str3, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        int i3;
        this.c = new ahmy(byteBuffer, i2, z);
        this.d = new ahmy(byteBuffer2, i2, z);
        this.f = new int[6];
        this.g = new int[6];
        String[] split = str.split(":", -1);
        String[] split2 = str2.split(":", -1);
        for (int i4 = 0; i4 < 6; i4++) {
            this.f[i4] = Integer.parseInt(split[i4]);
            this.g[i4] = Integer.parseInt(split2[i4]);
        }
        this.i = new float[6];
        String[] split3 = str3.split(":", -1);
        for (int i5 = 0; i5 < 6; i5++) {
            this.i[i5] = Float.parseFloat(split3[i5]);
        }
        this.b = this.d;
        this.e = this.g;
        if (z2) {
            i3 = ahnk.PHONE_OAR_CNN_V23_BAR_GRU_NON_BATCH_V23.am;
        } else {
            i3 = ahnk.PHONE_OAR_DNN_V14_BAR_GRU_NON_BATCH_V23.am;
        }
        this.a = i3;
        this.q = z2;
        this.r = z3;
        this.s = z4;
    }

    public final ActivityRecognitionResult a(ActivityRecognitionResult activityRecognitionResult) {
        int i2;
        float f2;
        float f3;
        float[] fArr = new float[this.b.b];
        Iterator it = activityRecognitionResult.a.iterator();
        boolean z = false;
        while (true) {
            int i3 = 2;
            if (it.hasNext()) {
                DetectedActivity detectedActivity = (DetectedActivity) it.next();
                int a2 = detectedActivity.a();
                if (a2 == 1) {
                    i3 = 0;
                } else if (a2 == 3) {
                    i3 = 5;
                } else if (a2 == 4) {
                    i3 = 6;
                } else if (a2 != 7) {
                    if (a2 != 8) {
                        switch (a2) {
                            case 16:
                                i3 = 3;
                                break;
                            case 17:
                                i3 = 4;
                                break;
                            case 18:
                                this.n += detectedActivity.e;
                                break;
                            case 19:
                                this.o += detectedActivity.e;
                                break;
                            case 20:
                                this.l += detectedActivity.e;
                                break;
                            case 21:
                                this.m += detectedActivity.e;
                                break;
                            default:
                                i3 = -1;
                                break;
                        }
                        i3 = -1;
                    } else {
                        i3 = 1;
                    }
                }
                if (i3 >= 0 && i3 < this.b.b) {
                    fArr[i3] = (float) detectedActivity.e;
                    z = true;
                }
            } else {
                if (!z) {
                    fArr = null;
                }
                if (fArr == null) {
                    return null;
                }
                int i4 = this.h;
                this.h = i4 + 1;
                if (i4 == 0) {
                    this.j = activityRecognitionResult.b;
                    this.k = activityRecognitionResult.c;
                    this.p = activityRecognitionResult.c();
                }
                float[] c2 = this.b.c(fArr);
                int i5 = this.h;
                int d2 = ahmh.d(c2);
                if (c2[d2] <= this.i[d2] && i5 < this.e[d2]) {
                    return null;
                }
                this.b.b(c2);
                List a3 = ahmh.a(c2);
                float f4 = c2[3];
                if (f4 > 0.0f) {
                    int i6 = this.n;
                    int i7 = this.o;
                    int i8 = i6 + i7;
                    if (this.r) {
                        float f5 = 0.33f;
                        if (i8 != 0) {
                            f2 = ((float) this.l) / ((float) i8);
                        } else {
                            f2 = 0.33f;
                        }
                        if (i8 != 0) {
                            f3 = ((float) this.m) / ((float) i8);
                        } else {
                            f3 = 0.33f;
                        }
                        if (i8 != 0) {
                            f5 = ((float) i6) / ((float) i8);
                        }
                        ahmh.a(a3, f4, new float[]{f2 * f4, f3 * f4, f5 * f4});
                    } else if (this.s) {
                        float f6 = i8 != 0 ? ((float) i7) / ((float) i8) : 0.5f;
                        ahmh.a(a3, new float[]{f4 * f6, f4 * (1.0f - f6)});
                    }
                }
                int i9 = this.a;
                if (ayee.a.a().addPersonalizedBitToDetectorInfo() && activityRecognitionResult.d == ahnk.PHONE_PERSONALIZATION_AF3_BASED.am) {
                    switch (ahnk.a(this.a).ordinal()) {
                        case 52:
                            i2 = ahnk.PHONE_OAR_CNN_V23_PAR_AF3_V2_BAR_GRU_BATCH_V23.am;
                            break;
                        case 53:
                            i2 = ahnk.PHONE_OAR_CNN_V23_PAR_AF3_V2_BAR_GRU_NON_BATCH_V23.am;
                            break;
                        case 54:
                            i2 = ahnk.PHONE_OAR_DNN_V14_PAR_AF3_V2_BAR_GRU_BATCH_V23.am;
                            break;
                        case 55:
                            i2 = ahnk.PHONE_OAR_DNN_V14_PAR_AF3_V2_BAR_GRU_NON_BATCH_V23.am;
                            break;
                    }
                }
                i2 = i9;
                return new ActivityRecognitionResult(ahmh.a(a3), this.j, this.k, i2, this.p);
            }
        }
    }

    public final ActivityRecognitionResult a(TreeMap treeMap, long j2, long j3, long j4, Bundle bundle) {
        return ahkh.a();
    }

    public final void b() {
        int i2;
        this.b = this.c;
        this.e = this.f;
        if (this.q) {
            i2 = ahnk.PHONE_OAR_CNN_V23_BAR_GRU_BATCH_V23.am;
        } else {
            i2 = ahnk.PHONE_OAR_DNN_V14_BAR_GRU_BATCH_V23.am;
        }
        this.a = i2;
    }

    public final void a() {
        this.h = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.c.a();
        this.d.a();
        this.b = this.d;
        this.e = this.g;
        this.a = this.q ? ahnk.PHONE_OAR_CNN_V23_BAR_GRU_NON_BATCH_V23.am : ahnk.PHONE_OAR_DNN_V14_BAR_GRU_NON_BATCH_V23.am;
    }
}
