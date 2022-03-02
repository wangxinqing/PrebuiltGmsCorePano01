package defpackage;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.HandlerThread;
import java.util.concurrent.TimeUnit;

/* renamed from: ajfk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajfk extends nlb {
    public final Context a;
    public final HandlerThread b;
    public final arus c;
    public amri d;
    public SensorManager e;
    private final ajgd f;
    private final aruq g;
    private final ajfo h;

    static {
        iyc iyc = iyc.UNKNOWN;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajfk(Context context, HandlerThread handlerThread, ajfo ajfo, ajgd ajgd) {
        super("SeismicMonitor", "location");
        arus arus = new arus(TimeUnit.MILLISECONDS.toNanos(ayek.n()), TimeUnit.MILLISECONDS.toNanos(ayek.a.a().seismicEventDetectionWindowMillis()), TimeUnit.MILLISECONDS.toNanos(ayek.o()), TimeUnit.MILLISECONDS.toNanos(ayek.a.a().seismicOffsetRefreshIntervalMillis()), (int) ayek.e(), (int) ayek.a.a().seismicAccelFrequencyMax(), (int) ayek.a.a().seismicAccelFrequencyMin(), ayel.a.a().quakeApiAccelQuantizedLsbMs2());
        arum arum = new arum();
        arum.a = Long.valueOf(TimeUnit.MILLISECONDS.toNanos(ayek.n() + ayek.a.a().seismicDetectorTimeoutMillis()));
        arum.b = Double.valueOf(ayek.a.a().seismicAccelVarianceThreshold());
        arum.c = Double.valueOf(ayek.a.a().seismicAccelMeanDiffThreshold());
        arum.d = Integer.valueOf((int) ayek.a.a().seismicAccelResamplingRate());
        arum.e = Boolean.valueOf(ayek.a.a().seismicAccelAngles());
        arum.f = Double.valueOf(ayek.a.a().seismicAnglesFilterAlpha());
        arum.g = Double.valueOf(ayek.a.a().seismicAnglesThresholdDegrees());
        arum.h = Integer.valueOf((int) ayek.a.a().seismicRunningPickupRecency());
        arum.i = Boolean.valueOf(ayek.a.a().seismicAccelShortenEpoch());
        arum.j = Double.valueOf(ayek.a.a().seismicAccelEpochProportion());
        arum.k = Boolean.valueOf(ayek.c());
        arum.l = Double.valueOf(ayek.a.a().seismicAccelOutlierAccelThreshold());
        arum.m = Boolean.valueOf(ayek.d());
        arum.n = Double.valueOf(ayek.a.a().seismicAccelSpikeThreshold());
        arum.o = Double.valueOf(ayek.a.a().seismicAccelSpikeDurationSeconds());
        arum.p = Boolean.valueOf(ayek.b());
        arum.q = Boolean.valueOf(ayek.f());
        arum.r = Boolean.valueOf(ayek.g());
        arum.s = Double.valueOf(ayek.a.a().seismicAccelMinVarianceThresholdM2s4());
        arum.t = Double.valueOf(ayek.a.a().seismicAccelMaxVarianceThresholdM2s4());
        arum.u = Double.valueOf(ayek.a.a().seismicAccelVarianceThresholdFactor());
        arum.v = Double.valueOf(ayek.a.a().seismicAccelVarianceThresholdNoisySessionM2s4());
        arum.x = Double.valueOf(ayek.a.a().seismicAccelFilterInputFactor());
        arum.w = Double.valueOf(ayek.a.a().seismicAccelVarianceFilterAlpha());
        String str = arum.a == null ? " timeoutNanos" : "";
        str = arum.b == null ? str.concat(" varianceThreshold") : str;
        str = arum.c == null ? String.valueOf(str).concat(" diffMeanThreshold") : str;
        str = arum.d == null ? String.valueOf(str).concat(" resamplingRate") : str;
        str = arum.e == null ? String.valueOf(str).concat(" seismicAccelAngles") : str;
        str = arum.f == null ? String.valueOf(str).concat(" anglesFilterAlpha") : str;
        str = arum.g == null ? String.valueOf(str).concat(" accelAnglesThresholdDegrees") : str;
        str = arum.h == null ? String.valueOf(str).concat(" seismicRunningPickupRecencyEpochs") : str;
        str = arum.i == null ? String.valueOf(str).concat(" seismicAccelShortenEpoch") : str;
        str = arum.j == null ? String.valueOf(str).concat(" seismicAccelEpochProportion") : str;
        str = arum.k == null ? String.valueOf(str).concat(" detectOutliers") : str;
        str = arum.l == null ? String.valueOf(str).concat(" outlierAccelThreshold") : str;
        str = arum.m == null ? String.valueOf(str).concat(" detectSpikes") : str;
        str = arum.n == null ? String.valueOf(str).concat(" spikeThreshold") : str;
        str = arum.o == null ? String.valueOf(str).concat(" spikeDurationSeconds") : str;
        str = arum.p == null ? String.valueOf(str).concat(" seismicAccelAdaptiveThreshold") : str;
        str = arum.q == null ? String.valueOf(str).concat(" seismicAccelIndividualAdaptiveThreshold") : str;
        str = arum.r == null ? String.valueOf(str).concat(" seismicAccelRejectNoisyDetectionSession") : str;
        str = arum.s == null ? String.valueOf(str).concat(" seismicAccelMinVarianceThresholdM2s4") : str;
        str = arum.t == null ? String.valueOf(str).concat(" seismicAccelMaxVarianceThresholdM2s4") : str;
        str = arum.u == null ? String.valueOf(str).concat(" seismicAccelVarianceThresholdFactor") : str;
        str = arum.v == null ? String.valueOf(str).concat(" seismicAccelVarianceThresholdNoisySessionM2s4") : str;
        str = arum.w == null ? String.valueOf(str).concat(" seismicAccelVarianceFilterAlpha") : str;
        str = arum.x == null ? String.valueOf(str).concat(" seismicAccelFilterInputFactor") : str;
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
        }
        aruq aruq = new aruq(new arut(arum.a.longValue(), arum.b.doubleValue(), arum.c.doubleValue(), arum.d.intValue(), arum.e.booleanValue(), arum.f.doubleValue(), arum.g.doubleValue(), arum.h.intValue(), arum.i.booleanValue(), arum.j.doubleValue(), arum.k.booleanValue(), arum.l.doubleValue(), arum.m.booleanValue(), arum.n.doubleValue(), arum.o.doubleValue(), arum.p.booleanValue(), arum.q.booleanValue(), arum.r.booleanValue(), arum.s.doubleValue(), arum.t.doubleValue(), arum.u.doubleValue(), arum.v.doubleValue(), arum.w.doubleValue(), arum.x.doubleValue()));
        this.d = ampu.a;
        this.a = context;
        this.b = handlerThread;
        this.h = ajfo;
        this.f = ajgd;
        this.c = arus;
        this.g = aruq;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0419, code lost:
        if (r14.o < r4) goto L_0x041b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0422 A[Catch:{ NullPointerException -> 0x080b }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0425 A[ADDED_TO_REGION, Catch:{ NullPointerException -> 0x080b }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x047b A[Catch:{ NullPointerException -> 0x080b }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0480 A[Catch:{ NullPointerException -> 0x080b }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x057d A[Catch:{ NullPointerException -> 0x080b }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x05b4 A[Catch:{ NullPointerException -> 0x080b }] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x05e5 A[Catch:{ NullPointerException -> 0x080b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.hardware.SensorEvent r46) {
        /*
            r45 = this;
            r1 = r45
            r2 = r46
            arus r3 = r1.c     // Catch:{ NullPointerException -> 0x0811 }
            long r4 = r2.timestamp     // Catch:{ NullPointerException -> 0x0811 }
            float[] r2 = r2.values     // Catch:{ NullPointerException -> 0x0811 }
            ahyb r6 = r3.a     // Catch:{ NullPointerException -> 0x0811 }
            r6.a((long) r4, (float[]) r2)     // Catch:{ NullPointerException -> 0x0811 }
            long r6 = r3.g     // Catch:{ NullPointerException -> 0x0811 }
            r8 = -1
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x001b
            r3.g = r4     // Catch:{ NullPointerException -> 0x0811 }
            r6 = r4
            goto L_0x001c
        L_0x001b:
        L_0x001c:
            long r6 = r4 - r6
            long r8 = r3.b     // Catch:{ NullPointerException -> 0x0811 }
            r2 = 0
            r10 = -1
            r11 = 2
            r12 = 1
            r13 = 0
            int r14 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r14 < 0) goto L_0x0079
            ahyb r6 = r3.a     // Catch:{ NullPointerException -> 0x0811 }
            long r7 = r3.c     // Catch:{ NullPointerException -> 0x0811 }
            long r7 = r4 - r7
            int r6 = r6.a((long) r7)     // Catch:{ NullPointerException -> 0x0811 }
            if (r6 == r10) goto L_0x0079
            r3.g = r4     // Catch:{ NullPointerException -> 0x0811 }
            ahyb r3 = r3.a     // Catch:{ NullPointerException -> 0x0811 }
            int r4 = r3.c     // Catch:{ NullPointerException -> 0x0811 }
            int r4 = r4 - r6
            long[] r5 = new long[r4]     // Catch:{ NullPointerException -> 0x0811 }
            r7 = 3
            int[] r8 = new int[r11]     // Catch:{ NullPointerException -> 0x0811 }
            r8[r12] = r4     // Catch:{ NullPointerException -> 0x0811 }
            r8[r13] = r7     // Catch:{ NullPointerException -> 0x0811 }
            java.lang.Class<float> r7 = float.class
            java.lang.Object r7 = java.lang.reflect.Array.newInstance(r7, r8)     // Catch:{ NullPointerException -> 0x0811 }
            float[][] r7 = (float[][]) r7     // Catch:{ NullPointerException -> 0x0811 }
            r8 = 0
        L_0x004e:
            if (r8 < r4) goto L_0x0056
            ahyq r3 = new ahyq     // Catch:{ NullPointerException -> 0x0811 }
            r3.<init>(r5, r7)     // Catch:{ NullPointerException -> 0x0811 }
            goto L_0x0093
        L_0x0056:
            int r9 = r6 + r8
            long r14 = r3.a((int) r9)     // Catch:{ NullPointerException -> 0x0811 }
            r5[r8] = r14     // Catch:{ NullPointerException -> 0x0811 }
            r14 = r7[r13]     // Catch:{ NullPointerException -> 0x0811 }
            float r15 = r3.a((int) r9, (int) r13)     // Catch:{ NullPointerException -> 0x0811 }
            r14[r8] = r15     // Catch:{ NullPointerException -> 0x0811 }
            r14 = r7[r12]     // Catch:{ NullPointerException -> 0x0811 }
            float r15 = r3.a((int) r9, (int) r12)     // Catch:{ NullPointerException -> 0x0811 }
            r14[r8] = r15     // Catch:{ NullPointerException -> 0x0811 }
            r14 = r7[r11]     // Catch:{ NullPointerException -> 0x0811 }
            float r9 = r3.a((int) r9, (int) r11)     // Catch:{ NullPointerException -> 0x0811 }
            r14[r8] = r9     // Catch:{ NullPointerException -> 0x0811 }
            int r8 = r8 + 1
            goto L_0x004e
        L_0x0079:
            long r6 = r3.h     // Catch:{ NullPointerException -> 0x0811 }
            long r6 = r4 - r6
            long r8 = r3.d     // Catch:{ NullPointerException -> 0x0811 }
            int r14 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r14 < 0) goto L_0x0092
            r3.h = r4     // Catch:{ NullPointerException -> 0x0811 }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ NullPointerException -> 0x0811 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ NullPointerException -> 0x0811 }
            long r6 = r6.toNanos(r7)     // Catch:{ NullPointerException -> 0x0811 }
            long r6 = r6 - r4
            r3.i = r6     // Catch:{ NullPointerException -> 0x0811 }
        L_0x0092:
            r3 = r2
        L_0x0093:
            if (r3 == 0) goto L_0x080f
            aruq r4 = r1.g     // Catch:{ NullPointerException -> 0x0811 }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ NullPointerException -> 0x0811 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ NullPointerException -> 0x0811 }
            long r5 = r5.toNanos(r6)     // Catch:{ NullPointerException -> 0x0811 }
            arun r7 = r4.a     // Catch:{ NullPointerException -> 0x0811 }
            r8 = r7
            arut r8 = (defpackage.arut) r8     // Catch:{ NullPointerException -> 0x0811 }
            boolean r8 = r8.i     // Catch:{ NullPointerException -> 0x0811 }
            if (r8 == 0) goto L_0x0112
            long r5 = r3.a((int) r13)     // Catch:{ NullPointerException -> 0x0811 }
            int r7 = r3.b     // Catch:{ NullPointerException -> 0x0811 }
            int r7 = r7 + r10
            long r7 = r3.a((int) r7)     // Catch:{ NullPointerException -> 0x0811 }
            double r14 = (double) r7
            double r5 = (double) r5
            java.lang.Double.isNaN(r14)
            java.lang.Double.isNaN(r5)
            double r14 = r14 - r5
            r5 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r14 = r14 / r5
            arun r5 = r4.a     // Catch:{ NullPointerException -> 0x0811 }
            r6 = r5
            arut r6 = (defpackage.arut) r6     // Catch:{ NullPointerException -> 0x0811 }
            double r11 = r6.j     // Catch:{ NullPointerException -> 0x0811 }
            double r14 = r14 * r11
            arut r5 = (defpackage.arut) r5     // Catch:{ NullPointerException -> 0x0811 }
            int r5 = r5.d     // Catch:{ NullPointerException -> 0x0811 }
            double r5 = (double) r5     // Catch:{ NullPointerException -> 0x0811 }
            double[][] r5 = defpackage.ahmx.a((defpackage.ahyq) r3, (double) r5)     // Catch:{ NullPointerException -> 0x0811 }
            arun r6 = r4.a     // Catch:{ NullPointerException -> 0x0811 }
            arut r6 = (defpackage.arut) r6     // Catch:{ NullPointerException -> 0x0811 }
            int r6 = r6.d     // Catch:{ NullPointerException -> 0x0811 }
            double r11 = (double) r6
            java.lang.Double.isNaN(r11)
            double r14 = r14 * r11
            int r6 = (int) r14
            if (r6 <= 0) goto L_0x010f
            r14 = 4472406533629990549(0x3e112e0be826d695, double:1.0E-9)
            java.lang.Double.isNaN(r11)
            double r11 = r11 * r14
            long r14 = r3.a((int) r13)     // Catch:{ NullPointerException -> 0x0811 }
            int r9 = r3.b     // Catch:{ NullPointerException -> 0x0811 }
            int r9 = r9 + r10
            long r17 = r3.a((int) r9)     // Catch:{ NullPointerException -> 0x0811 }
            long r14 = r17 - r14
            double r14 = (double) r14
            java.lang.Double.isNaN(r14)
            double r14 = r14 * r11
            int r9 = (int) r14
            r14 = 1
            int r15 = r9 + 1
            if (r15 < r6) goto L_0x0109
            goto L_0x010a
        L_0x0109:
            r6 = 1
        L_0x010a:
            double[][] r3 = defpackage.ahmx.a((defpackage.ahyq) r3, (double) r11, (int) r6)     // Catch:{ NullPointerException -> 0x0811 }
            goto L_0x0110
        L_0x010f:
            r3 = r5
        L_0x0110:
            r15 = r7
            goto L_0x011d
        L_0x0112:
            arut r7 = (defpackage.arut) r7     // Catch:{ NullPointerException -> 0x0811 }
            int r7 = r7.d     // Catch:{ NullPointerException -> 0x0811 }
            double r7 = (double) r7     // Catch:{ NullPointerException -> 0x0811 }
            double[][] r3 = defpackage.ahmx.a((defpackage.ahyq) r3, (double) r7)     // Catch:{ NullPointerException -> 0x0811 }
            r15 = r5
            r5 = r3
        L_0x011d:
            arun r6 = r4.a     // Catch:{ NullPointerException -> 0x0811 }
            r7 = r6
            arut r7 = (defpackage.arut) r7     // Catch:{ NullPointerException -> 0x0811 }
            boolean r7 = r7.r     // Catch:{ NullPointerException -> 0x0811 }
            arul r8 = new arul     // Catch:{ NullPointerException -> 0x0811 }
            r11 = r6
            arut r11 = (defpackage.arut) r11     // Catch:{ NullPointerException -> 0x0811 }
            double r11 = r11.t     // Catch:{ NullPointerException -> 0x0811 }
            arut r6 = (defpackage.arut) r6     // Catch:{ NullPointerException -> 0x0811 }
            double r9 = r6.u     // Catch:{ NullPointerException -> 0x0811 }
            double r17 = r11 / r9
            r14 = r8
            r19 = r7
            r14.<init>(r15, r17, r19)     // Catch:{ NullPointerException -> 0x0811 }
            arul r6 = r4.b     // Catch:{ NullPointerException -> 0x0811 }
            if (r6 != 0) goto L_0x013c
            goto L_0x014d
        L_0x013c:
            long r9 = r8.a     // Catch:{ NullPointerException -> 0x0811 }
            long r6 = r6.a     // Catch:{ NullPointerException -> 0x0811 }
            long r9 = r9 - r6
            arun r6 = r4.a     // Catch:{ NullPointerException -> 0x0811 }
            arut r6 = (defpackage.arut) r6     // Catch:{ NullPointerException -> 0x0811 }
            long r6 = r6.a     // Catch:{ NullPointerException -> 0x0811 }
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 <= 0) goto L_0x014d
            r4.b = r2     // Catch:{ NullPointerException -> 0x0811 }
        L_0x014d:
            r2 = r3[r13]     // Catch:{ NullPointerException -> 0x0811 }
            double r6 = defpackage.ahmx.a(r2)     // Catch:{ NullPointerException -> 0x0811 }
            r8.c = r6     // Catch:{ NullPointerException -> 0x0811 }
            r2 = 1
            r6 = r3[r2]     // Catch:{ NullPointerException -> 0x0811 }
            double r6 = defpackage.ahmx.a(r6)     // Catch:{ NullPointerException -> 0x0811 }
            r8.d = r6     // Catch:{ NullPointerException -> 0x0811 }
            r2 = 2
            r6 = r3[r2]     // Catch:{ NullPointerException -> 0x0811 }
            double r6 = defpackage.ahmx.a(r6)     // Catch:{ NullPointerException -> 0x0811 }
            r8.e = r6     // Catch:{ NullPointerException -> 0x0811 }
            r2 = r3[r13]     // Catch:{ NullPointerException -> 0x0811 }
            double r6 = defpackage.ahmx.b(r2)     // Catch:{ NullPointerException -> 0x0811 }
            r8.p = r6     // Catch:{ NullPointerException -> 0x0811 }
            r2 = 1
            r6 = r3[r2]     // Catch:{ NullPointerException -> 0x0811 }
            double r6 = defpackage.ahmx.b(r6)     // Catch:{ NullPointerException -> 0x0811 }
            r8.q = r6     // Catch:{ NullPointerException -> 0x0811 }
            r2 = 2
            r6 = r3[r2]     // Catch:{ NullPointerException -> 0x0811 }
            double r6 = defpackage.ahmx.b(r6)     // Catch:{ NullPointerException -> 0x0811 }
            r8.r = r6     // Catch:{ NullPointerException -> 0x0811 }
            arun r2 = r4.a     // Catch:{ NullPointerException -> 0x0811 }
            arut r2 = (defpackage.arut) r2     // Catch:{ NullPointerException -> 0x0811 }
            boolean r2 = r2.e     // Catch:{ NullPointerException -> 0x0811 }
            if (r2 == 0) goto L_0x01cb
            double r6 = r8.c     // Catch:{ NullPointerException -> 0x0811 }
            double r10 = r8.d     // Catch:{ NullPointerException -> 0x0811 }
            double r14 = r8.e     // Catch:{ NullPointerException -> 0x0811 }
            double r16 = java.lang.Math.signum(r14)     // Catch:{ NullPointerException -> 0x0811 }
            double r14 = r14 * r14
            r18 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r18 = r18 * r10
            double r18 = r18 * r10
            double r14 = r14 + r18
            double r10 = java.lang.Math.sqrt(r14)     // Catch:{ NullPointerException -> 0x0811 }
            double r10 = r10 * r16
            double r6 = java.lang.Math.atan2(r6, r10)     // Catch:{ NullPointerException -> 0x0811 }
            double r6 = java.lang.Math.toDegrees(r6)     // Catch:{ NullPointerException -> 0x0811 }
            r8.k = r6     // Catch:{ NullPointerException -> 0x0811 }
            double r6 = r8.c     // Catch:{ NullPointerException -> 0x0811 }
            double r10 = r8.d     // Catch:{ NullPointerException -> 0x0811 }
            double r14 = r8.e     // Catch:{ NullPointerException -> 0x0811 }
            double r10 = -r10
            double r6 = r6 * r6
            double r14 = r14 * r14
            double r6 = r6 + r14
            double r6 = java.lang.Math.sqrt(r6)     // Catch:{ NullPointerException -> 0x0811 }
            double r6 = java.lang.Math.atan2(r10, r6)     // Catch:{ NullPointerException -> 0x0811 }
            double r6 = java.lang.Math.toDegrees(r6)     // Catch:{ NullPointerException -> 0x0811 }
            r8.l = r6     // Catch:{ NullPointerException -> 0x0811 }
        L_0x01cb:
            arun r2 = r4.a     // Catch:{ NullPointerException -> 0x0811 }
            r6 = r2
            arut r6 = (defpackage.arut) r6     // Catch:{ NullPointerException -> 0x0811 }
            double r6 = r6.b     // Catch:{ NullPointerException -> 0x0811 }
            arul r10 = r4.b     // Catch:{ NullPointerException -> 0x0811 }
            if (r10 != 0) goto L_0x01de
            r11 = r4
            r1 = r6
            r3 = r1
            r9 = r3
            r5 = 0
            r12 = 0
            goto L_0x0625
        L_0x01de:
            r14 = r2
            arut r14 = (defpackage.arut) r14     // Catch:{ NullPointerException -> 0x0811 }
            boolean r14 = r14.p     // Catch:{ NullPointerException -> 0x0811 }
            if (r14 == 0) goto L_0x0204
            r14 = r2
            arut r14 = (defpackage.arut) r14     // Catch:{ NullPointerException -> 0x0811 }
            double r14 = r14.t     // Catch:{ NullPointerException -> 0x0811 }
            r9 = r2
            arut r9 = (defpackage.arut) r9     // Catch:{ NullPointerException -> 0x0811 }
            double r11 = r9.s     // Catch:{ NullPointerException -> 0x0811 }
            double r9 = r10.s     // Catch:{ NullPointerException -> 0x0811 }
            arut r2 = (defpackage.arut) r2     // Catch:{ NullPointerException -> 0x0811 }
            r21 = r14
            double r13 = r2.u     // Catch:{ NullPointerException -> 0x0811 }
            double r9 = r9 * r13
            double r9 = java.lang.Math.max(r11, r9)     // Catch:{ NullPointerException -> 0x0811 }
            r11 = r21
            double r9 = java.lang.Math.min(r11, r9)     // Catch:{ NullPointerException -> 0x0811 }
            goto L_0x0205
        L_0x0204:
            r9 = r6
        L_0x0205:
            arun r2 = r4.a     // Catch:{ NullPointerException -> 0x0811 }
            r11 = r2
            arut r11 = (defpackage.arut) r11     // Catch:{ NullPointerException -> 0x0811 }
            boolean r11 = r11.q     // Catch:{ NullPointerException -> 0x0811 }
            r12 = 4613937818241073152(0x4008000000000000, double:3.0)
            if (r11 == 0) goto L_0x023c
            arul r6 = r4.b     // Catch:{ NullPointerException -> 0x0811 }
            double r6 = r6.t     // Catch:{ NullPointerException -> 0x0811 }
            double r6 = defpackage.aruq.a(r2, r6)     // Catch:{ NullPointerException -> 0x0811 }
            arun r2 = r4.a     // Catch:{ NullPointerException -> 0x0811 }
            arul r9 = r4.b     // Catch:{ NullPointerException -> 0x0811 }
            double r9 = r9.u     // Catch:{ NullPointerException -> 0x0811 }
            double r9 = defpackage.aruq.a(r2, r9)     // Catch:{ NullPointerException -> 0x0811 }
            arun r2 = r4.a     // Catch:{ NullPointerException -> 0x0811 }
            arul r11 = r4.b     // Catch:{ NullPointerException -> 0x0811 }
            double r14 = r11.v     // Catch:{ NullPointerException -> 0x0811 }
            double r14 = defpackage.aruq.a(r2, r14)     // Catch:{ NullPointerException -> 0x0811 }
            double r21 = r6 + r9
            double r21 = r21 + r14
            double r21 = r21 / r12
            r43 = r6
            r6 = r21
            r21 = r14
            r14 = r9
            r10 = r43
            goto L_0x0242
        L_0x023c:
            r14 = r6
            r21 = r14
            r6 = r9
            r10 = r21
        L_0x0242:
            arul r2 = r4.b     // Catch:{ NullPointerException -> 0x0811 }
            double r12 = r2.c     // Catch:{ NullPointerException -> 0x0811 }
            double r1 = r8.c     // Catch:{ NullPointerException -> 0x080b }
            double r12 = r12 - r1
            double r1 = java.lang.Math.abs(r12)     // Catch:{ NullPointerException -> 0x080b }
            r8.m = r1     // Catch:{ NullPointerException -> 0x080b }
            arul r1 = r4.b     // Catch:{ NullPointerException -> 0x080b }
            double r1 = r1.d     // Catch:{ NullPointerException -> 0x080b }
            double r12 = r8.d     // Catch:{ NullPointerException -> 0x080b }
            double r1 = r1 - r12
            double r1 = java.lang.Math.abs(r1)     // Catch:{ NullPointerException -> 0x080b }
            r8.n = r1     // Catch:{ NullPointerException -> 0x080b }
            arul r1 = r4.b     // Catch:{ NullPointerException -> 0x080b }
            double r1 = r1.e     // Catch:{ NullPointerException -> 0x080b }
            double r12 = r8.e     // Catch:{ NullPointerException -> 0x080b }
            double r1 = r1 - r12
            double r1 = java.lang.Math.abs(r1)     // Catch:{ NullPointerException -> 0x080b }
            r8.o = r1     // Catch:{ NullPointerException -> 0x080b }
            arun r1 = r4.a     // Catch:{ NullPointerException -> 0x080b }
            r2 = r1
            arut r2 = (defpackage.arut) r2     // Catch:{ NullPointerException -> 0x080b }
            boolean r2 = r2.e     // Catch:{ NullPointerException -> 0x080b }
            if (r2 == 0) goto L_0x037d
            arul r2 = r4.b     // Catch:{ NullPointerException -> 0x080b }
            double r12 = r2.k     // Catch:{ NullPointerException -> 0x080b }
            r8.i = r12     // Catch:{ NullPointerException -> 0x080b }
            double r12 = r2.l     // Catch:{ NullPointerException -> 0x080b }
            r8.j = r12     // Catch:{ NullPointerException -> 0x080b }
            arut r1 = (defpackage.arut) r1     // Catch:{ NullPointerException -> 0x080b }
            double r1 = r1.f     // Catch:{ NullPointerException -> 0x080b }
            boolean r9 = defpackage.aruq.a(r5)     // Catch:{ NullPointerException -> 0x080b }
            if (r9 != 0) goto L_0x0291
            r27 = r3
            r32 = r6
            r34 = r10
            r30 = r14
            r11 = r4
            goto L_0x036f
        L_0x0291:
            r12 = 0
            int r9 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r9 < 0) goto L_0x0366
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r9 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r9 > 0) goto L_0x0366
            arul r9 = r4.b     // Catch:{ NullPointerException -> 0x080b }
            double r12 = r9.f     // Catch:{ NullPointerException -> 0x080b }
            r8.f = r12     // Catch:{ NullPointerException -> 0x080b }
            double r12 = r9.g     // Catch:{ NullPointerException -> 0x080b }
            r8.g = r12     // Catch:{ NullPointerException -> 0x080b }
            double r12 = r9.h     // Catch:{ NullPointerException -> 0x080b }
            r8.h = r12     // Catch:{ NullPointerException -> 0x080b }
            r12 = 0
            r13 = 0
        L_0x02ad:
            r27 = r3
            r9 = 0
            r3 = r5[r9]     // Catch:{ NullPointerException -> 0x080b }
            int r9 = r3.length     // Catch:{ NullPointerException -> 0x080b }
            if (r12 >= r9) goto L_0x0354
            r28 = r3[r12]     // Catch:{ NullPointerException -> 0x080b }
            double r28 = r28 * r1
            r25 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r30 = r25 - r1
            r32 = r6
            double r6 = r8.f     // Catch:{ NullPointerException -> 0x080b }
            double r6 = r6 * r30
            double r6 = r28 + r6
            r8.f = r6     // Catch:{ NullPointerException -> 0x080b }
            r3 = 1
            r16 = r5[r3]     // Catch:{ NullPointerException -> 0x080b }
            r28 = r16[r12]     // Catch:{ NullPointerException -> 0x080b }
            double r28 = r28 * r1
            r34 = r10
            double r9 = r8.g     // Catch:{ NullPointerException -> 0x080b }
            double r9 = r9 * r30
            double r9 = r28 + r9
            r8.g = r9     // Catch:{ NullPointerException -> 0x080b }
            r11 = 2
            r16 = r5[r11]     // Catch:{ NullPointerException -> 0x080b }
            r28 = r16[r12]     // Catch:{ NullPointerException -> 0x080b }
            double r28 = r28 * r1
            r11 = r4
            double r3 = r8.h     // Catch:{ NullPointerException -> 0x080b }
            double r30 = r30 * r3
            double r3 = r28 + r30
            r8.h = r3     // Catch:{ NullPointerException -> 0x080b }
            if (r13 != 0) goto L_0x033e
            arul r13 = r11.b     // Catch:{ NullPointerException -> 0x080b }
            r28 = r1
            double r1 = r13.c     // Catch:{ NullPointerException -> 0x080b }
            r30 = r14
            double r14 = r13.d     // Catch:{ NullPointerException -> 0x080b }
            r36 = r12
            double r12 = r13.e     // Catch:{ NullPointerException -> 0x080b }
            double r37 = r6 * r6
            double r39 = r9 * r9
            double r37 = r37 + r39
            double r39 = r3 * r3
            double r37 = r37 + r39
            double r37 = java.lang.Math.sqrt(r37)     // Catch:{ NullPointerException -> 0x080b }
            double r39 = r1 * r1
            double r41 = r14 * r14
            double r39 = r39 + r41
            double r41 = r12 * r12
            double r39 = r39 + r41
            double r39 = java.lang.Math.sqrt(r39)     // Catch:{ NullPointerException -> 0x080b }
            double r6 = r6 * r1
            double r9 = r9 * r14
            double r6 = r6 + r9
            double r3 = r3 * r12
            double r6 = r6 + r3
            double r37 = r37 * r39
            r1 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            int r3 = (r37 > r1 ? 1 : (r37 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0330
            double r6 = r6 / r37
            double r1 = java.lang.Math.acos(r6)     // Catch:{ NullPointerException -> 0x080b }
            double r12 = java.lang.Math.toDegrees(r1)     // Catch:{ NullPointerException -> 0x080b }
            goto L_0x0332
        L_0x0330:
            r12 = 0
        L_0x0332:
            arun r1 = r11.a     // Catch:{ NullPointerException -> 0x080b }
            arut r1 = (defpackage.arut) r1     // Catch:{ NullPointerException -> 0x080b }
            double r1 = r1.g     // Catch:{ NullPointerException -> 0x080b }
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x0344
            r13 = 0
            goto L_0x0345
        L_0x033e:
            r28 = r1
            r36 = r12
            r30 = r14
        L_0x0344:
            r13 = 1
        L_0x0345:
            int r12 = r36 + 1
            r4 = r11
            r3 = r27
            r1 = r28
            r14 = r30
            r6 = r32
            r10 = r34
            goto L_0x02ad
        L_0x0354:
            r32 = r6
            r34 = r10
            r30 = r14
            r11 = r4
            if (r13 == 0) goto L_0x036f
            arun r1 = r11.a     // Catch:{ NullPointerException -> 0x080b }
            arut r1 = (defpackage.arut) r1     // Catch:{ NullPointerException -> 0x080b }
            int r1 = r1.h     // Catch:{ NullPointerException -> 0x080b }
            r8.b = r1     // Catch:{ NullPointerException -> 0x080b }
            goto L_0x0386
        L_0x0366:
            r27 = r3
            r32 = r6
            r34 = r10
            r30 = r14
            r11 = r4
        L_0x036f:
            arul r1 = r11.b     // Catch:{ NullPointerException -> 0x080b }
            int r1 = r1.b     // Catch:{ NullPointerException -> 0x080b }
            r2 = -1
            int r1 = r1 + r2
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)     // Catch:{ NullPointerException -> 0x080b }
            r8.b = r1     // Catch:{ NullPointerException -> 0x080b }
            goto L_0x0386
        L_0x037d:
            r27 = r3
            r32 = r6
            r34 = r10
            r30 = r14
            r11 = r4
        L_0x0386:
            arun r1 = r11.a     // Catch:{ NullPointerException -> 0x080b }
            r2 = r1
            arut r2 = (defpackage.arut) r2     // Catch:{ NullPointerException -> 0x080b }
            boolean r2 = r2.e     // Catch:{ NullPointerException -> 0x080b }
            if (r2 == 0) goto L_0x03ef
            r2 = r1
            arut r2 = (defpackage.arut) r2     // Catch:{ NullPointerException -> 0x080b }
            boolean r2 = r2.q     // Catch:{ NullPointerException -> 0x080b }
            if (r2 == 0) goto L_0x03c5
            double r2 = r8.p     // Catch:{ NullPointerException -> 0x080b }
            int r4 = (r2 > r34 ? 1 : (r2 == r34 ? 0 : -1))
            if (r4 > 0) goto L_0x03a8
            double r2 = r8.q     // Catch:{ NullPointerException -> 0x080b }
            int r4 = (r2 > r30 ? 1 : (r2 == r30 ? 0 : -1))
            if (r4 > 0) goto L_0x03a8
            double r2 = r8.r     // Catch:{ NullPointerException -> 0x080b }
            int r4 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r4 <= 0) goto L_0x0402
        L_0x03a8:
            double r2 = r8.m     // Catch:{ NullPointerException -> 0x080b }
            r4 = r1
            arut r4 = (defpackage.arut) r4     // Catch:{ NullPointerException -> 0x080b }
            double r4 = r4.c     // Catch:{ NullPointerException -> 0x080b }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0402
            double r2 = r8.n     // Catch:{ NullPointerException -> 0x080b }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0402
            double r2 = r8.o     // Catch:{ NullPointerException -> 0x080b }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0402
            int r2 = r8.b     // Catch:{ NullPointerException -> 0x080b }
            if (r2 != 0) goto L_0x0402
            r2 = 1
            goto L_0x041c
        L_0x03c5:
            double r2 = r8.p     // Catch:{ NullPointerException -> 0x080b }
            int r4 = (r2 > r32 ? 1 : (r2 == r32 ? 0 : -1))
            if (r4 > 0) goto L_0x03d7
            double r2 = r8.q     // Catch:{ NullPointerException -> 0x080b }
            int r4 = (r2 > r32 ? 1 : (r2 == r32 ? 0 : -1))
            if (r4 > 0) goto L_0x03d7
            double r2 = r8.r     // Catch:{ NullPointerException -> 0x080b }
            int r4 = (r2 > r32 ? 1 : (r2 == r32 ? 0 : -1))
            if (r4 <= 0) goto L_0x0402
        L_0x03d7:
            double r2 = r8.m     // Catch:{ NullPointerException -> 0x080b }
            r4 = r1
            arut r4 = (defpackage.arut) r4     // Catch:{ NullPointerException -> 0x080b }
            double r4 = r4.c     // Catch:{ NullPointerException -> 0x080b }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0402
            double r2 = r8.n     // Catch:{ NullPointerException -> 0x080b }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0402
            double r2 = r8.o     // Catch:{ NullPointerException -> 0x080b }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0402
            goto L_0x041b
        L_0x03ef:
            double r2 = r8.p     // Catch:{ NullPointerException -> 0x080b }
            int r4 = (r2 > r32 ? 1 : (r2 == r32 ? 0 : -1))
            if (r4 > 0) goto L_0x0404
            double r2 = r8.q     // Catch:{ NullPointerException -> 0x080b }
            int r4 = (r2 > r32 ? 1 : (r2 == r32 ? 0 : -1))
            if (r4 > 0) goto L_0x0404
            double r2 = r8.r     // Catch:{ NullPointerException -> 0x080b }
            int r4 = (r2 > r32 ? 1 : (r2 == r32 ? 0 : -1))
            if (r4 <= 0) goto L_0x0402
            goto L_0x0404
        L_0x0402:
            r2 = 0
            goto L_0x041c
        L_0x0404:
            double r2 = r8.m     // Catch:{ NullPointerException -> 0x080b }
            r4 = r1
            arut r4 = (defpackage.arut) r4     // Catch:{ NullPointerException -> 0x080b }
            double r4 = r4.c     // Catch:{ NullPointerException -> 0x080b }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0402
            double r2 = r8.n     // Catch:{ NullPointerException -> 0x080b }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0402
            double r2 = r8.o     // Catch:{ NullPointerException -> 0x080b }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0402
        L_0x041b:
            r2 = 1
        L_0x041c:
            arut r1 = (defpackage.arut) r1     // Catch:{ NullPointerException -> 0x080b }
            boolean r1 = r1.k     // Catch:{ NullPointerException -> 0x080b }
            if (r1 != 0) goto L_0x0425
            r16 = 0
            goto L_0x0473
        L_0x0425:
            if (r2 == 0) goto L_0x0471
            boolean r1 = defpackage.aruq.a(r27)     // Catch:{ NullPointerException -> 0x080b }
            if (r1 == 0) goto L_0x0471
            r1 = 0
        L_0x042e:
            r3 = 0
            r4 = r27[r3]     // Catch:{ NullPointerException -> 0x080b }
            int r3 = r4.length     // Catch:{ NullPointerException -> 0x080b }
            if (r1 >= r3) goto L_0x0471
            r3 = r4[r1]     // Catch:{ NullPointerException -> 0x080b }
            double r3 = java.lang.Math.abs(r3)     // Catch:{ NullPointerException -> 0x080b }
            arun r5 = r11.a     // Catch:{ NullPointerException -> 0x080b }
            arut r5 = (defpackage.arut) r5     // Catch:{ NullPointerException -> 0x080b }
            double r5 = r5.l     // Catch:{ NullPointerException -> 0x080b }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x046e
            r3 = 1
            r4 = r27[r3]     // Catch:{ NullPointerException -> 0x080b }
            r3 = r4[r1]     // Catch:{ NullPointerException -> 0x080b }
            double r3 = java.lang.Math.abs(r3)     // Catch:{ NullPointerException -> 0x080b }
            arun r5 = r11.a     // Catch:{ NullPointerException -> 0x080b }
            arut r5 = (defpackage.arut) r5     // Catch:{ NullPointerException -> 0x080b }
            double r5 = r5.l     // Catch:{ NullPointerException -> 0x080b }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x046e
            r3 = 2
            r4 = r27[r3]     // Catch:{ NullPointerException -> 0x080b }
            r3 = r4[r1]     // Catch:{ NullPointerException -> 0x080b }
            double r3 = java.lang.Math.abs(r3)     // Catch:{ NullPointerException -> 0x080b }
            arun r5 = r11.a     // Catch:{ NullPointerException -> 0x080b }
            arut r5 = (defpackage.arut) r5     // Catch:{ NullPointerException -> 0x080b }
            double r5 = r5.l     // Catch:{ NullPointerException -> 0x080b }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x046e
            int r1 = r1 + 1
            goto L_0x042e
        L_0x046e:
            r16 = 1
            goto L_0x0473
        L_0x0471:
            r16 = 0
        L_0x0473:
            arun r1 = r11.a     // Catch:{ NullPointerException -> 0x080b }
            arut r1 = (defpackage.arut) r1     // Catch:{ NullPointerException -> 0x080b }
            boolean r1 = r1.m     // Catch:{ NullPointerException -> 0x080b }
            if (r1 != 0) goto L_0x0480
            r20 = r2
            r12 = 0
            goto L_0x0574
        L_0x0480:
            if (r2 == 0) goto L_0x0571
            boolean r1 = defpackage.aruq.a(r27)     // Catch:{ NullPointerException -> 0x080b }
            if (r1 == 0) goto L_0x0571
            r1 = 0
            r3 = r27[r1]     // Catch:{ NullPointerException -> 0x080b }
            int r1 = r3.length     // Catch:{ NullPointerException -> 0x080b }
            r3 = 0
            r4 = 0
            r12 = 0
        L_0x0490:
            if (r3 >= r1) goto L_0x04ce
            r5 = 0
            r6 = r27[r5]     // Catch:{ NullPointerException -> 0x080b }
            r5 = r6[r3]     // Catch:{ NullPointerException -> 0x080b }
            double r14 = r8.c     // Catch:{ NullPointerException -> 0x080b }
            double r5 = r5 - r14
            double r5 = java.lang.Math.abs(r5)     // Catch:{ NullPointerException -> 0x080b }
            r7 = 1
            r10 = r27[r7]     // Catch:{ NullPointerException -> 0x080b }
            r14 = r10[r3]     // Catch:{ NullPointerException -> 0x080b }
            double r9 = r8.d     // Catch:{ NullPointerException -> 0x080b }
            double r14 = r14 - r9
            double r9 = java.lang.Math.abs(r14)     // Catch:{ NullPointerException -> 0x080b }
            r14 = 2
            r15 = r27[r14]     // Catch:{ NullPointerException -> 0x080b }
            r14 = r15[r3]     // Catch:{ NullPointerException -> 0x080b }
            r28 = r1
            r20 = r2
            double r1 = r8.e     // Catch:{ NullPointerException -> 0x080b }
            double r14 = r14 - r1
            double r1 = java.lang.Math.abs(r14)     // Catch:{ NullPointerException -> 0x080b }
            double r5 = r5 + r9
            double r5 = r5 + r1
            int r1 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r1 > 0) goto L_0x04c1
            goto L_0x04c2
        L_0x04c1:
            r4 = r3
        L_0x04c2:
            int r1 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r1 <= 0) goto L_0x04c7
            r12 = r5
        L_0x04c7:
            int r3 = r3 + 1
            r2 = r20
            r1 = r28
            goto L_0x0490
        L_0x04ce:
            r28 = r1
            r20 = r2
            arun r1 = r11.a     // Catch:{ NullPointerException -> 0x080b }
            r2 = r1
            arut r2 = (defpackage.arut) r2     // Catch:{ NullPointerException -> 0x080b }
            int r2 = r2.d     // Catch:{ NullPointerException -> 0x080b }
            double r2 = (double) r2     // Catch:{ NullPointerException -> 0x080b }
            arut r1 = (defpackage.arut) r1     // Catch:{ NullPointerException -> 0x080b }
            double r5 = r1.o     // Catch:{ NullPointerException -> 0x080b }
            java.lang.Double.isNaN(r2)
            double r2 = r2 * r5
            long r1 = java.lang.Math.round(r2)     // Catch:{ NullPointerException -> 0x080b }
            int r2 = (int) r1     // Catch:{ NullPointerException -> 0x080b }
            int r1 = r4 - r2
            r3 = 1
            int r1 = r1 + r3
            r3 = 0
            int r1 = java.lang.Math.max(r3, r1)     // Catch:{ NullPointerException -> 0x080b }
            r12 = 0
        L_0x04f3:
            if (r1 <= r4) goto L_0x0517
            double r1 = r8.p     // Catch:{ NullPointerException -> 0x080b }
            double r3 = r8.q     // Catch:{ NullPointerException -> 0x080b }
            double r1 = r1 + r3
            double r3 = r8.r     // Catch:{ NullPointerException -> 0x080b }
            double r1 = r1 + r3
            r3 = r28
            double r3 = (double) r3
            java.lang.Double.isNaN(r3)
            double r1 = r1 * r3
            double r3 = r1 - r12
            arun r5 = r11.a     // Catch:{ NullPointerException -> 0x080b }
            arut r5 = (defpackage.arut) r5     // Catch:{ NullPointerException -> 0x080b }
            double r5 = r5.n     // Catch:{ NullPointerException -> 0x080b }
            double r1 = r1 * r5
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 < 0) goto L_0x0515
            r12 = 0
            goto L_0x0574
        L_0x0515:
            r12 = 1
            goto L_0x0574
        L_0x0517:
            r3 = r28
            int r5 = r1 + r2
            int r5 = java.lang.Math.min(r3, r5)     // Catch:{ NullPointerException -> 0x080b }
            r10 = r1
            r6 = 0
        L_0x0522:
            if (r10 >= r5) goto L_0x0560
            r14 = 0
            r15 = r27[r14]     // Catch:{ NullPointerException -> 0x080b }
            r14 = r15[r10]     // Catch:{ NullPointerException -> 0x080b }
            r29 = r10
            double r9 = r8.c     // Catch:{ NullPointerException -> 0x080b }
            double r14 = r14 - r9
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r14 = java.lang.Math.pow(r14, r9)     // Catch:{ NullPointerException -> 0x080b }
            r28 = 1
            r36 = r27[r28]     // Catch:{ NullPointerException -> 0x080b }
            r37 = r36[r29]     // Catch:{ NullPointerException -> 0x080b }
            double r9 = r8.d     // Catch:{ NullPointerException -> 0x080b }
            double r9 = r37 - r9
            r36 = r2
            r37 = r3
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r9 = java.lang.Math.pow(r9, r2)     // Catch:{ NullPointerException -> 0x080b }
            double r14 = r14 + r9
            r2 = 2
            r3 = r27[r2]     // Catch:{ NullPointerException -> 0x080b }
            r2 = r3[r29]     // Catch:{ NullPointerException -> 0x080b }
            double r9 = r8.e     // Catch:{ NullPointerException -> 0x080b }
            double r2 = r2 - r9
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = java.lang.Math.pow(r2, r9)     // Catch:{ NullPointerException -> 0x080b }
            double r14 = r14 + r2
            double r6 = r6 + r14
            int r10 = r29 + 1
            r2 = r36
            r3 = r37
            goto L_0x0522
        L_0x0560:
            r36 = r2
            r37 = r3
            r28 = 1
            double r12 = java.lang.Math.max(r12, r6)     // Catch:{ NullPointerException -> 0x080b }
            int r1 = r1 + 1
            r2 = r36
            r28 = r37
            goto L_0x04f3
        L_0x0571:
            r20 = r2
            r12 = 0
        L_0x0574:
            arun r1 = r11.a     // Catch:{ NullPointerException -> 0x080b }
            r2 = r1
            arut r2 = (defpackage.arut) r2     // Catch:{ NullPointerException -> 0x080b }
            boolean r2 = r2.p     // Catch:{ NullPointerException -> 0x080b }
            if (r2 == 0) goto L_0x05ab
            arut r1 = (defpackage.arut) r1     // Catch:{ NullPointerException -> 0x080b }
            double r1 = r1.x     // Catch:{ NullPointerException -> 0x080b }
            arul r3 = r11.b     // Catch:{ NullPointerException -> 0x080b }
            double r3 = r3.s     // Catch:{ NullPointerException -> 0x080b }
            double r5 = r8.p     // Catch:{ NullPointerException -> 0x080b }
            double r9 = r8.q     // Catch:{ NullPointerException -> 0x080b }
            double r13 = r8.r     // Catch:{ NullPointerException -> 0x080b }
            double r1 = r1 * r3
            double r5 = r5 + r9
            double r5 = r5 + r13
            r3 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r5 = r5 / r3
            double r1 = java.lang.Math.min(r1, r5)     // Catch:{ NullPointerException -> 0x080b }
            arun r3 = r11.a     // Catch:{ NullPointerException -> 0x080b }
            arut r3 = (defpackage.arut) r3     // Catch:{ NullPointerException -> 0x080b }
            double r3 = r3.w     // Catch:{ NullPointerException -> 0x080b }
            double r1 = r1 * r3
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r5 - r3
            arul r5 = r11.b     // Catch:{ NullPointerException -> 0x080b }
            double r5 = r5.s     // Catch:{ NullPointerException -> 0x080b }
            double r3 = r3 * r5
            double r1 = r1 + r3
            r8.s = r1     // Catch:{ NullPointerException -> 0x080b }
        L_0x05ab:
            arun r1 = r11.a     // Catch:{ NullPointerException -> 0x080b }
            r2 = r1
            arut r2 = (defpackage.arut) r2     // Catch:{ NullPointerException -> 0x080b }
            boolean r2 = r2.q     // Catch:{ NullPointerException -> 0x080b }
            if (r2 == 0) goto L_0x05dc
            double r2 = r8.p     // Catch:{ NullPointerException -> 0x080b }
            arul r4 = r11.b     // Catch:{ NullPointerException -> 0x080b }
            double r4 = r4.t     // Catch:{ NullPointerException -> 0x080b }
            double r1 = defpackage.aruq.a(r1, r2, r4)     // Catch:{ NullPointerException -> 0x080b }
            r8.t = r1     // Catch:{ NullPointerException -> 0x080b }
            arun r1 = r11.a     // Catch:{ NullPointerException -> 0x080b }
            double r2 = r8.q     // Catch:{ NullPointerException -> 0x080b }
            arul r4 = r11.b     // Catch:{ NullPointerException -> 0x080b }
            double r4 = r4.u     // Catch:{ NullPointerException -> 0x080b }
            double r1 = defpackage.aruq.a(r1, r2, r4)     // Catch:{ NullPointerException -> 0x080b }
            r8.u = r1     // Catch:{ NullPointerException -> 0x080b }
            arun r1 = r11.a     // Catch:{ NullPointerException -> 0x080b }
            double r2 = r8.r     // Catch:{ NullPointerException -> 0x080b }
            arul r4 = r11.b     // Catch:{ NullPointerException -> 0x080b }
            double r4 = r4.v     // Catch:{ NullPointerException -> 0x080b }
            double r1 = defpackage.aruq.a(r1, r2, r4)     // Catch:{ NullPointerException -> 0x080b }
            r8.v = r1     // Catch:{ NullPointerException -> 0x080b }
        L_0x05dc:
            arun r1 = r11.a     // Catch:{ NullPointerException -> 0x080b }
            r2 = r1
            arut r2 = (defpackage.arut) r2     // Catch:{ NullPointerException -> 0x080b }
            boolean r2 = r2.r     // Catch:{ NullPointerException -> 0x080b }
            if (r2 == 0) goto L_0x0616
            r2 = r1
            arut r2 = (defpackage.arut) r2     // Catch:{ NullPointerException -> 0x080b }
            boolean r2 = r2.q     // Catch:{ NullPointerException -> 0x080b }
            if (r2 != 0) goto L_0x05ff
            arul r2 = r11.b     // Catch:{ NullPointerException -> 0x080b }
            boolean r2 = r2.w     // Catch:{ NullPointerException -> 0x080b }
            if (r2 == 0) goto L_0x05fb
            arut r1 = (defpackage.arut) r1     // Catch:{ NullPointerException -> 0x080b }
            double r1 = r1.v     // Catch:{ NullPointerException -> 0x080b }
            int r3 = (r32 > r1 ? 1 : (r32 == r1 ? 0 : -1))
            if (r3 < 0) goto L_0x05fb
            goto L_0x0619
        L_0x05fb:
            r1 = 0
            r8.w = r1     // Catch:{ NullPointerException -> 0x080b }
            goto L_0x0619
        L_0x05ff:
            arut r1 = (defpackage.arut) r1     // Catch:{ NullPointerException -> 0x080b }
            double r1 = r1.v     // Catch:{ NullPointerException -> 0x080b }
            arul r3 = r11.b     // Catch:{ NullPointerException -> 0x080b }
            boolean r3 = r3.w     // Catch:{ NullPointerException -> 0x080b }
            if (r3 == 0) goto L_0x0616
            int r3 = (r34 > r1 ? 1 : (r34 == r1 ? 0 : -1))
            if (r3 < 0) goto L_0x0616
            int r3 = (r30 > r1 ? 1 : (r30 == r1 ? 0 : -1))
            if (r3 < 0) goto L_0x0616
            int r3 = (r21 > r1 ? 1 : (r21 == r1 ? 0 : -1))
            if (r3 < 0) goto L_0x0616
            goto L_0x0619
        L_0x0616:
            r1 = 0
            r8.w = r1     // Catch:{ NullPointerException -> 0x080b }
        L_0x0619:
            r5 = r16
            r13 = r20
            r9 = r21
            r3 = r30
            r6 = r32
            r1 = r34
        L_0x0625:
            r11.b = r8     // Catch:{ NullPointerException -> 0x080b }
            aruo r11 = new aruo     // Catch:{ NullPointerException -> 0x080b }
            r11.<init>()     // Catch:{ NullPointerException -> 0x080b }
            r14 = 0
            r11.a((boolean) r14)     // Catch:{ NullPointerException -> 0x080b }
            r11.b((boolean) r14)     // Catch:{ NullPointerException -> 0x080b }
            r11.c((boolean) r14)     // Catch:{ NullPointerException -> 0x080b }
            r14 = 0
            r11.a((double) r14)     // Catch:{ NullPointerException -> 0x080b }
            r11.b((double) r14)     // Catch:{ NullPointerException -> 0x080b }
            r11.c((double) r14)     // Catch:{ NullPointerException -> 0x080b }
            r11.d(r14)     // Catch:{ NullPointerException -> 0x080b }
            arul r14 = new arul     // Catch:{ NullPointerException -> 0x080b }
            r17 = 0
            r19 = 0
            r21 = 0
            r16 = r14
            r16.<init>(r17, r19, r21)     // Catch:{ NullPointerException -> 0x080b }
            r11.h = r14     // Catch:{ NullPointerException -> 0x080b }
            r11.a((boolean) r13)     // Catch:{ NullPointerException -> 0x080b }
            r11.b((boolean) r5)     // Catch:{ NullPointerException -> 0x080b }
            r11.c((boolean) r12)     // Catch:{ NullPointerException -> 0x080b }
            r11.a((double) r6)     // Catch:{ NullPointerException -> 0x080b }
            r11.b((double) r1)     // Catch:{ NullPointerException -> 0x080b }
            r11.c((double) r3)     // Catch:{ NullPointerException -> 0x080b }
            r11.d(r9)     // Catch:{ NullPointerException -> 0x080b }
            r11.h = r8     // Catch:{ NullPointerException -> 0x080b }
            java.lang.String r1 = ""
            java.lang.String r2 = " detected"
            java.lang.Boolean r3 = r11.a     // Catch:{ NullPointerException -> 0x080b }
            if (r3 == 0) goto L_0x0673
            goto L_0x0674
        L_0x0673:
            r1 = r2
        L_0x0674:
            java.lang.Boolean r2 = r11.b     // Catch:{ NullPointerException -> 0x080b }
            if (r2 != 0) goto L_0x067e
            java.lang.String r2 = " outlierAccel"
            java.lang.String r1 = r1.concat(r2)     // Catch:{ NullPointerException -> 0x080b }
        L_0x067e:
            java.lang.Boolean r2 = r11.c     // Catch:{ NullPointerException -> 0x080b }
            if (r2 != 0) goto L_0x068c
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ NullPointerException -> 0x080b }
            java.lang.String r2 = " spike"
            java.lang.String r1 = r1.concat(r2)     // Catch:{ NullPointerException -> 0x080b }
        L_0x068c:
            java.lang.Double r2 = r11.d     // Catch:{ NullPointerException -> 0x080b }
            if (r2 != 0) goto L_0x069a
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ NullPointerException -> 0x080b }
            java.lang.String r2 = " accelVarianceAverageThresholdM2s4"
            java.lang.String r1 = r1.concat(r2)     // Catch:{ NullPointerException -> 0x080b }
        L_0x069a:
            java.lang.Double r2 = r11.e     // Catch:{ NullPointerException -> 0x080b }
            if (r2 != 0) goto L_0x06a8
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ NullPointerException -> 0x080b }
            java.lang.String r2 = " accelVarianceXThresholdM2s4"
            java.lang.String r1 = r1.concat(r2)     // Catch:{ NullPointerException -> 0x080b }
        L_0x06a8:
            java.lang.Double r2 = r11.f     // Catch:{ NullPointerException -> 0x080b }
            if (r2 != 0) goto L_0x06b6
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ NullPointerException -> 0x080b }
            java.lang.String r2 = " accelVarianceYThresholdM2s4"
            java.lang.String r1 = r1.concat(r2)     // Catch:{ NullPointerException -> 0x080b }
        L_0x06b6:
            java.lang.Double r2 = r11.g     // Catch:{ NullPointerException -> 0x080b }
            if (r2 != 0) goto L_0x06c4
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ NullPointerException -> 0x080b }
            java.lang.String r2 = " accelVarianceZThresholdM2s4"
            java.lang.String r1 = r1.concat(r2)     // Catch:{ NullPointerException -> 0x080b }
        L_0x06c4:
            arul r2 = r11.h     // Catch:{ NullPointerException -> 0x080b }
            if (r2 != 0) goto L_0x06d2
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ NullPointerException -> 0x080b }
            java.lang.String r2 = " accelFeatures"
            java.lang.String r1 = r1.concat(r2)     // Catch:{ NullPointerException -> 0x080b }
        L_0x06d2:
            boolean r2 = r1.isEmpty()     // Catch:{ NullPointerException -> 0x080b }
            if (r2 == 0) goto L_0x07eb
            aruu r1 = new aruu     // Catch:{ NullPointerException -> 0x080b }
            java.lang.Boolean r2 = r11.a     // Catch:{ NullPointerException -> 0x080b }
            boolean r13 = r2.booleanValue()     // Catch:{ NullPointerException -> 0x080b }
            java.lang.Boolean r2 = r11.b     // Catch:{ NullPointerException -> 0x080b }
            boolean r14 = r2.booleanValue()     // Catch:{ NullPointerException -> 0x080b }
            java.lang.Boolean r2 = r11.c     // Catch:{ NullPointerException -> 0x080b }
            boolean r15 = r2.booleanValue()     // Catch:{ NullPointerException -> 0x080b }
            java.lang.Double r2 = r11.d     // Catch:{ NullPointerException -> 0x080b }
            double r16 = r2.doubleValue()     // Catch:{ NullPointerException -> 0x080b }
            java.lang.Double r2 = r11.e     // Catch:{ NullPointerException -> 0x080b }
            double r18 = r2.doubleValue()     // Catch:{ NullPointerException -> 0x080b }
            java.lang.Double r2 = r11.f     // Catch:{ NullPointerException -> 0x080b }
            double r20 = r2.doubleValue()     // Catch:{ NullPointerException -> 0x080b }
            java.lang.Double r2 = r11.g     // Catch:{ NullPointerException -> 0x080b }
            double r22 = r2.doubleValue()     // Catch:{ NullPointerException -> 0x080b }
            arul r2 = r11.h     // Catch:{ NullPointerException -> 0x080b }
            r12 = r1
            r24 = r2
            r12.<init>(r13, r14, r15, r16, r18, r20, r22, r24)     // Catch:{ NullPointerException -> 0x080b }
            amri r2 = defpackage.amri.b(r1)     // Catch:{ NullPointerException -> 0x080b }
            r3 = r45
            r3.d = r2     // Catch:{ NullPointerException -> 0x07e8 }
            boolean r2 = r1.a     // Catch:{ NullPointerException -> 0x07e8 }
            if (r2 == 0) goto L_0x07e6
            ajfo r2 = r3.h     // Catch:{ NullPointerException -> 0x07e8 }
            android.content.Context r4 = r3.a     // Catch:{ NullPointerException -> 0x07e8 }
            com.google.android.location.quake.ShakeVettingHints r14 = new com.google.android.location.quake.ShakeVettingHints     // Catch:{ NullPointerException -> 0x07e8 }
            long r6 = defpackage.ajfr.b(r4)     // Catch:{ NullPointerException -> 0x07e8 }
            boolean r8 = r1.b     // Catch:{ NullPointerException -> 0x07e8 }
            boolean r9 = r1.c     // Catch:{ NullPointerException -> 0x07e8 }
            arul r4 = r1.h     // Catch:{ NullPointerException -> 0x07e8 }
            double r10 = r4.i     // Catch:{ NullPointerException -> 0x07e8 }
            double r12 = r4.j     // Catch:{ NullPointerException -> 0x07e8 }
            double r4 = r1.d     // Catch:{ NullPointerException -> 0x07e8 }
            r15 = r4
            double r3 = r1.e     // Catch:{ NullPointerException -> 0x080b }
            r17 = r3
            double r3 = r1.f     // Catch:{ NullPointerException -> 0x080b }
            r19 = r3
            double r3 = r1.g     // Catch:{ NullPointerException -> 0x080b }
            ajfd r2 = r2.a     // Catch:{ NullPointerException -> 0x080b }
            int r22 = r2.d()     // Catch:{ NullPointerException -> 0x080b }
            r5 = r14
            r2 = r14
            r14 = r15
            r16 = r17
            r18 = r19
            r20 = r3
            r5.<init>(r6, r8, r9, r10, r12, r14, r16, r18, r20, r22)     // Catch:{ NullPointerException -> 0x080b }
            ayek r3 = defpackage.ayek.a     // Catch:{ NullPointerException -> 0x080b }
            ayeo r3 = r3.a()     // Catch:{ NullPointerException -> 0x080b }
            boolean r3 = r3.seismicFilterActiveVibe()     // Catch:{ NullPointerException -> 0x080b }
            if (r3 != 0) goto L_0x0758
            goto L_0x0780
        L_0x0758:
            long r3 = r2.a     // Catch:{ NullPointerException -> 0x080b }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0780
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ NullPointerException -> 0x080b }
            arul r4 = r1.h     // Catch:{ NullPointerException -> 0x080b }
            long r4 = r4.a     // Catch:{ NullPointerException -> 0x080b }
            long r3 = r3.toMillis(r4)     // Catch:{ NullPointerException -> 0x080b }
            long r5 = r2.a     // Catch:{ NullPointerException -> 0x080b }
            long r3 = r3 - r5
            long r3 = java.lang.Math.abs(r3)     // Catch:{ NullPointerException -> 0x080b }
            ayek r5 = defpackage.ayek.a     // Catch:{ NullPointerException -> 0x080b }
            ayeo r5 = r5.a()     // Catch:{ NullPointerException -> 0x080b }
            long r5 = r5.seismicFilterActiveVibeIntervalMs()     // Catch:{ NullPointerException -> 0x080b }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0780
            goto L_0x07c0
        L_0x0780:
            ayek r3 = defpackage.ayek.a     // Catch:{ NullPointerException -> 0x080b }
            ayeo r3 = r3.a()     // Catch:{ NullPointerException -> 0x080b }
            boolean r3 = r3.seismicAccelFilterOutlierAccel()     // Catch:{ NullPointerException -> 0x080b }
            if (r3 != 0) goto L_0x078d
            goto L_0x0792
        L_0x078d:
            boolean r3 = r1.b     // Catch:{ NullPointerException -> 0x080b }
            if (r3 == 0) goto L_0x0792
            goto L_0x07c0
        L_0x0792:
            ayek r3 = defpackage.ayek.a     // Catch:{ NullPointerException -> 0x080b }
            ayeo r3 = r3.a()     // Catch:{ NullPointerException -> 0x080b }
            boolean r3 = r3.seismicAccelFilterSpikes()     // Catch:{ NullPointerException -> 0x080b }
            if (r3 == 0) goto L_0x07a2
            boolean r3 = r1.c     // Catch:{ NullPointerException -> 0x080b }
            if (r3 != 0) goto L_0x07c0
        L_0x07a2:
            boolean r3 = defpackage.ayek.g()     // Catch:{ NullPointerException -> 0x080b }
            if (r3 == 0) goto L_0x07b0
            arul r3 = r1.h     // Catch:{ NullPointerException -> 0x080b }
            boolean r3 = r3.w     // Catch:{ NullPointerException -> 0x080b }
            if (r3 != 0) goto L_0x07af
            goto L_0x07b0
        L_0x07af:
            return
        L_0x07b0:
            long r3 = defpackage.ayek.x()     // Catch:{ NullPointerException -> 0x080b }
            r5 = 2
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x07c1
            int r3 = r2.j     // Catch:{ NullPointerException -> 0x080b }
            r4 = 2
            if (r3 == r4) goto L_0x07c0
            goto L_0x07c1
        L_0x07c0:
            return
        L_0x07c1:
            com.google.android.location.quake.ShakeEvent r3 = new com.google.android.location.quake.ShakeEvent     // Catch:{ NullPointerException -> 0x080b }
            arul r1 = r1.h     // Catch:{ NullPointerException -> 0x080b }
            long r4 = r1.a     // Catch:{ NullPointerException -> 0x080b }
            r3.<init>(r4, r2)     // Catch:{ NullPointerException -> 0x080b }
            r2 = r45
            ajgd r1 = r2.f     // Catch:{ NullPointerException -> 0x0809 }
            ajgt r4 = r1.b     // Catch:{ NullPointerException -> 0x0809 }
            int r1 = r1.a     // Catch:{ NullPointerException -> 0x0809 }
            int r5 = defpackage.ajgu.d     // Catch:{ NullPointerException -> 0x0809 }
            ajgu r5 = r4.a     // Catch:{ NullPointerException -> 0x0809 }
            java.lang.String r5 = r5.a     // Catch:{ NullPointerException -> 0x0809 }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ NullPointerException -> 0x0809 }
            r5.<init>()     // Catch:{ NullPointerException -> 0x0809 }
            java.lang.String r6 = "d"
            r5.putParcelable(r6, r3)     // Catch:{ NullPointerException -> 0x0809 }
            r4.a((int) r1, (android.os.Bundle) r5)     // Catch:{ NullPointerException -> 0x0809 }
            return
        L_0x07e6:
            r2 = r3
            goto L_0x0810
        L_0x07e8:
            r0 = move-exception
            r2 = r3
            goto L_0x0813
        L_0x07eb:
            r2 = r45
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ NullPointerException -> 0x0809 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ NullPointerException -> 0x0809 }
            java.lang.String r4 = "Missing required properties:"
            int r5 = r1.length()     // Catch:{ NullPointerException -> 0x0809 }
            if (r5 != 0) goto L_0x0801
            java.lang.String r1 = new java.lang.String     // Catch:{ NullPointerException -> 0x0809 }
            r1.<init>(r4)     // Catch:{ NullPointerException -> 0x0809 }
            goto L_0x0805
        L_0x0801:
            java.lang.String r1 = r4.concat(r1)     // Catch:{ NullPointerException -> 0x0809 }
        L_0x0805:
            r3.<init>(r1)     // Catch:{ NullPointerException -> 0x0809 }
            throw r3     // Catch:{ NullPointerException -> 0x0809 }
        L_0x0809:
            r0 = move-exception
            goto L_0x0813
        L_0x080b:
            r0 = move-exception
            r2 = r45
            goto L_0x0813
        L_0x080f:
            r2 = r1
        L_0x0810:
            return
        L_0x0811:
            r0 = move-exception
            r2 = r1
        L_0x0813:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajfk.a(android.hardware.SensorEvent):void");
    }
}
