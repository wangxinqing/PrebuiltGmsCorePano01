package defpackage;

import com.android.volley.toolbox.ImageRequest;
import java.util.concurrent.TimeUnit;

/* renamed from: aknz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aknz implements aknx {
    private static final float[] a = {0.0f, 10.0f, 20.0f, 40.0f, 80.0f, 160.0f, 320.0f, 640.0f};
    private aklr b = null;

    public final ou a(akln akln) {
        float f;
        int i;
        int i2;
        akln akln2 = akln;
        aklr aklr = akln2.a;
        ou ouVar = new ou();
        float f2 = aklr.g;
        Float valueOf = Float.valueOf(1.0f);
        if (f2 > 0.0f) {
            ouVar.put(aklv.b, Float.valueOf(Math.min(1.0f, f2 / 30.0f)));
        } else if (f2 == 0.0f) {
            ouVar.put(aklv.c, valueOf);
        }
        int i3 = aklr.c;
        int i4 = aklr.e;
        int i5 = i3 / ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
        ou ouVar2 = new ou();
        float[] fArr = a;
        double d = (double) fArr[0];
        double d2 = (double) fArr[fArr.length - 1];
        double d3 = (double) i5;
        if (d3 >= d2) {
            String str = aklv.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32);
            sb.append(str);
            sb.append(i4);
            sb.append("-accuracy-");
            sb.append((int) d2);
            ouVar2.put(sb.toString(), valueOf);
        } else if (d3 <= d) {
            String str2 = aklv.a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 32);
            sb2.append(str2);
            sb2.append(i4);
            sb2.append("-accuracy-");
            sb2.append((int) d);
            ouVar2.put(sb2.toString(), valueOf);
        } else {
            int i6 = 1;
            while (true) {
                float[] fArr2 = a;
                if (i6 >= fArr2.length) {
                    i = -1;
                    i2 = -1;
                    break;
                } else if (((float) i5) < fArr2[i6]) {
                    i = i6 - 1;
                    i2 = i6;
                    break;
                } else {
                    i6++;
                }
            }
            float[] fArr3 = a;
            float f3 = (fArr3[i2] - ((float) i5)) / (fArr3[i2] - fArr3[i]);
            String str3 = aklv.a;
            float f4 = a[i2];
            StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 32);
            sb3.append(str3);
            sb3.append(i4);
            sb3.append("-accuracy-");
            sb3.append((int) f4);
            ouVar2.put(sb3.toString(), Float.valueOf(f3));
            String str4 = aklv.a;
            float f5 = a[i];
            StringBuilder sb4 = new StringBuilder(String.valueOf(str4).length() + 32);
            sb4.append(str4);
            sb4.append(i4);
            sb4.append("-accuracy-");
            sb4.append((int) f5);
            ouVar2.put(sb4.toString(), Float.valueOf(1.0f - f3));
        }
        ouVar.a(ouVar2);
        ou ouVar3 = new ou();
        aklr aklr2 = this.b;
        if (aklr2 == null) {
            ouVar3.put(aklv.d, valueOf);
        } else {
            aklr aklr3 = akln2.a;
            float a2 = (float) aell.a(aklr3.a, aklr3.b, aklr2.a, aklr2.b);
            long seconds = TimeUnit.MILLISECONDS.toSeconds(akln2.a.f - this.b.f);
            ouVar3.put(aklv.e, Float.valueOf(1.0f - (Math.min(a2, 10000.0f) / 10000.0f)));
            ouVar3.put(aklv.f, Float.valueOf(1.0f - (((float) Math.min(seconds, 3600)) / 3600.0f)));
            String str5 = aklv.g;
            if (seconds != 0) {
                f = a2 / ((float) seconds);
            } else {
                f = 0.0f;
            }
            ouVar3.put(str5, Float.valueOf(Math.min(f, 350.0f) / 350.0f));
        }
        ouVar.a(ouVar3);
        this.b = aklr;
        return ouVar;
    }
}
