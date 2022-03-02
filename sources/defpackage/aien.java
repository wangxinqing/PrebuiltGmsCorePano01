package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.GpsSatellite;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.NetworkLocationStatus;
import com.google.android.gms.location.WifiScan;
import com.google.android.location.fused.FusionEngine$AlarmListener;
import com.google.android.location.fused.FusionScheduler;
import com.google.android.location.fused.LocationStatusHelper;
import com.google.android.location.util.DeviceActiveAlarmTimer;
import com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: aien  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aien implements aiex, aifr, aifv, ajpp, aihp, ajpx, aifk, rni, rnh, qup, aihc {
    static final long a = TimeUnit.SECONDS.toMillis(10);
    public static final /* synthetic */ int m = 0;
    private static final long n = TimeUnit.SECONDS.toMillis(5);
    private final FusionScheduler A;
    private final rns B;
    private final DeviceActiveAlarmTimer C;
    private final List D;
    private final Comparator E;
    private final aidh F;
    public final aidg b;
    public final aiii c;
    public final AndroidInertialAnchor d;
    public final aieu e;
    public long f;
    public boolean g;
    public final aqgg h;
    public final aidf i;
    public final aifi j;
    final FusionEngine$AlarmListener k;
    public final aihe l;
    private final aifw o;
    private final LocationStatusHelper p;
    private aiew q;
    private Location r;
    private final aieu s;
    private long t;
    private long u;
    private aies v;
    private int w;
    private aies x;
    private final Context y;
    private final aqim z;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: aqgp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: aqfp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: aqgb} */
    /* JADX WARNING: type inference failed for: r8v1, types: [com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor, aiii, aqim, aies] */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x021e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public aien(android.content.Context r56, android.os.Looper r57, defpackage.aidf r58, defpackage.aicw r59, defpackage.aiii r60) {
        /*
            r55 = this;
            r1 = r55
            r12 = r56
            r13 = r57
            r2 = r59
            r8 = r60
            aihe r3 = defpackage.aihe.a((android.content.Context) r56)
            ajpz r9 = defpackage.ajpz.a((android.content.Context) r56)
            java.lang.String r0 = "sensor"
            java.lang.Object r0 = r12.getSystemService(r0)
            r10 = r0
            android.hardware.SensorManager r10 = (android.hardware.SensorManager) r10
            aifs r11 = new aifs
            qvr r0 = new qvr
            r0.<init>((android.os.Looper) r13)
            r11.<init>(r12, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            com.google.android.location.util.DeviceActiveAlarmTimer r7 = new com.google.android.location.util.DeviceActiveAlarmTimer
            r7.<init>(r12, r13)
            jiu r5 = defpackage.jiu.a
            aifw r4 = new aifw
            r4.<init>(r13, r12)
            boolean r0 = defpackage.ayam.g()
            java.lang.String r6 = "Missing required properties:"
            java.lang.String r14 = ""
            if (r0 == 0) goto L_0x05ff
            r15 = 4
            r2.a((int) r15)
            ayam r0 = defpackage.ayam.a
            ayan r0 = r0.a()
            boolean r0 = r0.enableLogcatLogger()
            if (r0 == 0) goto L_0x0057
            aqjv r0 = new aqjv
            r0.<init>()
            java.util.Set r15 = defpackage.aqju.a
            r15.add(r0)
        L_0x0057:
            boolean r0 = defpackage.ayam.f()
            if (r0 == 0) goto L_0x009c
            boolean r0 = r8 instanceof defpackage.aiie
            if (r0 == 0) goto L_0x008e
            boolean r0 = r60.b()
            if (r0 != 0) goto L_0x006a
            r23 = r7
            goto L_0x0090
        L_0x006a:
            aqgs r0 = defpackage.aifx.a(r2, r3)
            r15 = r8
            aiie r15 = (defpackage.aiie) r15
            r23 = r7
            arce r7 = r0.e()
            r16 = r0
            arce r0 = r15.b
            if (r0 == 0) goto L_0x007e
            goto L_0x0080
        L_0x007e:
            r15.b = r7
        L_0x0080:
            r7 = 5
            r2.b((int) r7)
            r24 = r11
            r15 = r14
            r0 = r16
            r2 = 0
            r7 = 4
            goto L_0x0246
        L_0x008e:
            r23 = r7
        L_0x0090:
            r0 = 6
            r2.b((int) r0)
            r24 = r11
            r15 = r14
            r0 = 0
            r2 = 0
            r7 = 4
            goto L_0x0246
        L_0x009c:
            r23 = r7
            boolean r0 = defpackage.aycp.e()
            if (r0 == 0) goto L_0x00aa
            arcr r0 = defpackage.aycp.b()
            r7 = r14
            goto L_0x00cb
        L_0x00aa:
            ayam r0 = defpackage.ayam.a     // Catch:{ IOException -> 0x00c1 }
            ayan r0 = r0.a()     // Catch:{ IOException -> 0x00c1 }
            r7 = r14
            long r14 = r0.flpInertialAnchorConfigurationIndex()     // Catch:{ IOException -> 0x00bf }
            int r0 = (int) r14     // Catch:{ IOException -> 0x00bf }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x00bf }
            arcr r0 = defpackage.arcd.a(r12, r0)     // Catch:{ IOException -> 0x00bf }
            goto L_0x00cb
        L_0x00bf:
            r0 = move-exception
            goto L_0x00c3
        L_0x00c1:
            r0 = move-exception
            r7 = r14
        L_0x00c3:
            java.lang.String r0 = "GCoreFlp"
            java.lang.String r14 = "Error while loading InertialAnchor config for FLP, using default."
            android.util.Log.e(r0, r14)
            r0 = 0
        L_0x00cb:
            arcb r14 = com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor.a()
            qvr r15 = new qvr
            r15.<init>((android.os.Looper) r13)
            r14.b = r15
            boolean r15 = defpackage.ayam.e()
            r14.a((boolean) r15)
            java.lang.String r15 = "FLP Inertial Anchor"
            r14.c = r15
            r15 = r7
            long r7 = defpackage.ayam.d()
            int r8 = (int) r7
            r14.a((int) r8)
            arcq r7 = defpackage.arcq.l
            aucd r7 = r7.o()
            boolean r8 = defpackage.ayaz.e()
            r24 = r11
            boolean r11 = r7.c
            if (r11 == 0) goto L_0x0100
            r7.c()
            r11 = 0
            r7.c = r11
        L_0x0100:
            aucj r11 = r7.b
            arcq r11 = (defpackage.arcq) r11
            r11.a = r8
            boolean r8 = defpackage.ayaz.g()
            boolean r11 = r7.c
            if (r11 != 0) goto L_0x010f
            goto L_0x0115
        L_0x010f:
            r7.c()
            r11 = 0
            r7.c = r11
        L_0x0115:
            aucj r11 = r7.b
            arcq r11 = (defpackage.arcq) r11
            r11.b = r8
            boolean r8 = defpackage.aycp.k()
            boolean r11 = r7.c
            if (r11 != 0) goto L_0x0124
            goto L_0x012a
        L_0x0124:
            r7.c()
            r11 = 0
            r7.c = r11
        L_0x012a:
            aucj r11 = r7.b
            arcq r11 = (defpackage.arcq) r11
            r11.c = r8
            boolean r8 = defpackage.aycp.g()
            boolean r11 = r7.c
            if (r11 != 0) goto L_0x0139
            goto L_0x013f
        L_0x0139:
            r7.c()
            r11 = 0
            r7.c = r11
        L_0x013f:
            aucj r11 = r7.b
            arcq r11 = (defpackage.arcq) r11
            r11.d = r8
            boolean r8 = defpackage.aycp.i()
            boolean r11 = r7.c
            if (r11 != 0) goto L_0x014e
            goto L_0x0154
        L_0x014e:
            r7.c()
            r11 = 0
            r7.c = r11
        L_0x0154:
            aucj r11 = r7.b
            arcq r11 = (defpackage.arcq) r11
            r11.e = r8
            boolean r8 = defpackage.aycp.f()
            boolean r11 = r7.c
            if (r11 != 0) goto L_0x0163
            goto L_0x0169
        L_0x0163:
            r7.c()
            r11 = 0
            r7.c = r11
        L_0x0169:
            aucj r11 = r7.b
            arcq r11 = (defpackage.arcq) r11
            r11.f = r8
            boolean r8 = defpackage.aycp.m()
            boolean r11 = r7.c
            if (r11 != 0) goto L_0x0178
            goto L_0x017e
        L_0x0178:
            r7.c()
            r11 = 0
            r7.c = r11
        L_0x017e:
            aucj r11 = r7.b
            arcq r11 = (defpackage.arcq) r11
            r11.g = r8
            boolean r8 = defpackage.aycp.l()
            boolean r11 = r7.c
            if (r11 != 0) goto L_0x018d
            goto L_0x0193
        L_0x018d:
            r7.c()
            r11 = 0
            r7.c = r11
        L_0x0193:
            aucj r11 = r7.b
            arcq r11 = (defpackage.arcq) r11
            r11.h = r8
            boolean r8 = defpackage.aycp.j()
            boolean r11 = r7.c
            if (r11 != 0) goto L_0x01a2
            goto L_0x01a8
        L_0x01a2:
            r7.c()
            r11 = 0
            r7.c = r11
        L_0x01a8:
            aucj r11 = r7.b
            arcq r11 = (defpackage.arcq) r11
            r11.i = r8
            boolean r8 = defpackage.aycp.c()
            boolean r11 = r7.c
            if (r11 != 0) goto L_0x01b7
            goto L_0x01bd
        L_0x01b7:
            r7.c()
            r11 = 0
            r7.c = r11
        L_0x01bd:
            aucj r11 = r7.b
            arcq r11 = (defpackage.arcq) r11
            r11.j = r8
            boolean r8 = defpackage.aycp.h()
            boolean r11 = r7.c
            if (r11 != 0) goto L_0x01cc
            goto L_0x01d2
        L_0x01cc:
            r7.c()
            r11 = 0
            r7.c = r11
        L_0x01d2:
            aucj r11 = r7.b
            arcq r11 = (defpackage.arcq) r11
            r11.k = r8
            aucj r7 = r7.i()
            arcq r7 = (defpackage.arcq) r7
            r14.e = r7
            if (r0 != 0) goto L_0x01e3
            goto L_0x01e5
        L_0x01e3:
            r14.a = r0
        L_0x01e5:
            boolean r0 = defpackage.aycp.d()
            if (r0 == 0) goto L_0x01f9
            boolean r0 = defpackage.ayam.e()
            if (r0 == 0) goto L_0x01f9
            arci r0 = new arci
            r7 = 3
            r0.<init>(r12, r7)
            r14.g = r0
        L_0x01f9:
            com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor r0 = r14.a()
            if (r0 == 0) goto L_0x021e
            boolean r7 = r0.b()
            if (r7 != 0) goto L_0x0206
            goto L_0x021e
        L_0x0206:
            aqgs r7 = defpackage.aifx.a(r2, r3)
            arce r8 = r7.e()
            qvr r11 = new qvr
            r11.<init>((android.os.Looper) r13)
            r0.a(r8, r11)
            r8 = 2
            r2.b((int) r8)
            r2 = r0
            r0 = r7
            r7 = 4
            goto L_0x0246
        L_0x021e:
            ayam r7 = defpackage.ayam.a
            ayan r7 = r7.a()
            boolean r7 = r7.clearcutFlpVersionsFix147319069()
            if (r7 != 0) goto L_0x022e
            r0 = 0
            r2 = 0
            r7 = 4
            goto L_0x0246
        L_0x022e:
            if (r0 != 0) goto L_0x0237
            r7 = 4
            r2.b((int) r7)
            r0 = 0
            r2 = 0
            goto L_0x0246
        L_0x0237:
            r7 = 4
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x0243
            r8 = 3
            r2.b((int) r8)
            goto L_0x0244
        L_0x0243:
        L_0x0244:
            r0 = 0
            r2 = 0
        L_0x0246:
            aqid r8 = defpackage.aqie.i()
            ayam r11 = defpackage.ayam.a
            ayan r11 = r11.a()
            r18 = r15
            double r14 = r11.outputLinearKfProcessNoiseUnknownPosM()
            r8.d(r14)
            ayam r11 = defpackage.ayam.a
            ayan r11 = r11.a()
            double r14 = r11.outputLinearKfProcessNoiseUnknownVelMps()
            r8.e(r14)
            ayam r11 = defpackage.ayam.a
            ayan r11 = r11.a()
            double r14 = r11.outputLinearKfProcessNoiseFeetPosM()
            r8.b(r14)
            ayam r11 = defpackage.ayam.a
            ayan r11 = r11.a()
            double r14 = r11.outputLinearKfProcessNoiseFeetVelMps()
            r8.c(r14)
            ayam r11 = defpackage.ayam.a
            ayan r11 = r11.a()
            double r14 = r11.outputLinearKfProcessNoiseWheelsPosM()
            r8.f(r14)
            ayam r11 = defpackage.ayam.a
            ayan r11 = r11.a()
            double r14 = r11.outputLinearKfProcessNoiseWheelsVelMps()
            r8.g(r14)
            ayam r11 = defpackage.ayam.a
            ayan r11 = r11.a()
            boolean r11 = r11.outputKalmanFilterEnableReset()
            r8.a((boolean) r11)
            ayam r11 = defpackage.ayam.a
            ayan r11 = r11.a()
            double r14 = r11.outputKalmanFilterResetThresholdM()
            r8.a((double) r14)
            aqie r8 = r8.a()
            aqif r11 = new aqif
            r11.<init>()
            r14 = 4617315517961601024(0x4014000000000000, double:5.0)
            r11.d((double) r14)
            r14 = 1
            r11.j(r14)
            r59 = r8
            r7 = 4626885667169763328(0x4036000000000000, double:22.0)
            r11.e((double) r7)
            r7 = 5
            r11.a((int) r7)
            r11.a((boolean) r14)
            aqhx r7 = defpackage.aqhy.f()
            aqhy r7 = r7.a()
            r11.t = r7
            r11.i(r14)
            r7 = 4633641066610819072(0x404e000000000000, double:60.0)
            r11.c((double) r7)
            r11.b((double) r7)
            r7 = 0
            r11.a((double) r7)
            r7 = 0
            r11.e((boolean) r7)
            r7 = 10000000000(0x2540be400, double:4.9406564584E-314)
            r11.b((long) r7)
            r11.h(r14)
            r11.c((boolean) r14)
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            r11.n = r7
            r11.b((boolean) r14)
            r7 = 5000000000(0x12a05f200, double:2.470328229E-314)
            r11.a((long) r7)
            r11.g(r14)
            r11.f(r14)
            r11.d((boolean) r14)
            aqid r7 = defpackage.aqie.i()
            aqie r7 = r7.a()
            r11.u = r7
            ayam r7 = defpackage.ayam.a
            ayan r7 = r7.a()
            double r7 = r7.speedUpperThresholdMps()
            r11.d((double) r7)
            ayam r7 = defpackage.ayam.a
            ayan r7 = r7.a()
            boolean r7 = r7.useNStepActivationFilter()
            r11.j(r7)
            ayam r7 = defpackage.ayam.a
            ayan r7 = r7.a()
            double r7 = r7.stepTimeoutThresholdSeconds()
            r11.e((double) r7)
            ayam r7 = defpackage.ayam.a
            ayan r7 = r7.a()
            long r7 = r7.requiredStepCount()
            int r8 = (int) r7
            r11.a((int) r8)
            ayam r7 = defpackage.ayam.a
            ayan r7 = r7.a()
            boolean r7 = r7.alwaysRunAfterOneStep()
            r11.a((boolean) r7)
            ayam r7 = defpackage.ayam.a
            ayan r7 = r7.a()
            boolean r7 = r7.useAltitudeFilter()
            r11.i(r7)
            ayam r7 = defpackage.ayam.a
            ayan r7 = r7.a()
            double r7 = r7.altitudeFilterWifiValidTimeSeconds()
            r11.c((double) r7)
            ayam r7 = defpackage.ayam.a
            ayan r7 = r7.a()
            double r7 = r7.altitudeFilterGpsValidTimeSeconds()
            r11.b((double) r7)
            ayam r7 = defpackage.ayam.a
            ayan r7 = r7.a()
            double r7 = r7.altitudeFilterFloorLabelValidTimeSeconds()
            r11.a((double) r7)
            boolean r7 = defpackage.axxm.k()
            r11.e((boolean) r7)
            axxm r7 = defpackage.axxm.a
            axxn r7 = r7.a()
            long r7 = r7.flpBluePixelOverruleIntervalNanos()
            r11.b((long) r7)
            ayam r7 = defpackage.ayam.a
            ayan r7 = r7.a()
            boolean r7 = r7.enableOutputKalmanFilter()
            r11.h(r7)
            ayam r7 = defpackage.ayam.a
            ayan r7 = r7.a()
            boolean r7 = r7.enableActivityAwareKalmanFilter()
            r11.c((boolean) r7)
            ayam r7 = defpackage.ayam.a
            ayan r7 = r7.a()
            boolean r7 = r7.enableAccuracyOutputFilter()
            r11.b((boolean) r7)
            ayam r7 = defpackage.ayam.a
            ayan r7 = r7.a()
            long r7 = r7.accuracyOutputFilterMaxAgeInWindowNanos()
            r11.a((long) r7)
            ayam r7 = defpackage.ayam.a
            ayan r7 = r7.a()
            boolean r7 = r7.enableOutputFilterTimestampFix()
            r11.g(r7)
            ayam r7 = defpackage.ayam.a
            ayan r7 = r7.a()
            boolean r7 = r7.enableIncomingPositionAccuracyScaling()
            r11.f(r7)
            ayam r7 = defpackage.ayam.a
            ayan r7 = r7.a()
            boolean r7 = r7.enableArForDriving()
            r11.d((boolean) r7)
            r7 = r59
            r11.u = r7
            java.lang.Double r7 = r11.a
            if (r7 != 0) goto L_0x0416
            java.lang.String r14 = " speedUpperThresholdMps"
            goto L_0x0418
        L_0x0416:
            r14 = r18
        L_0x0418:
            java.lang.Boolean r7 = r11.b
            if (r7 != 0) goto L_0x0422
            java.lang.String r7 = " useNStepActivationFilter"
            java.lang.String r14 = r14.concat(r7)
        L_0x0422:
            java.lang.Double r7 = r11.c
            if (r7 != 0) goto L_0x0430
            java.lang.String r7 = java.lang.String.valueOf(r14)
            java.lang.String r8 = " stepTimeoutThresholdSeconds"
            java.lang.String r14 = r7.concat(r8)
        L_0x0430:
            java.lang.Integer r7 = r11.d
            if (r7 != 0) goto L_0x043e
            java.lang.String r7 = java.lang.String.valueOf(r14)
            java.lang.String r8 = " requiredStepCount"
            java.lang.String r14 = r7.concat(r8)
        L_0x043e:
            java.lang.Boolean r7 = r11.e
            if (r7 != 0) goto L_0x044c
            java.lang.String r7 = java.lang.String.valueOf(r14)
            java.lang.String r8 = " alwaysRunAfterOneStep"
            java.lang.String r14 = r7.concat(r8)
        L_0x044c:
            java.lang.Boolean r7 = r11.f
            if (r7 != 0) goto L_0x045a
            java.lang.String r7 = java.lang.String.valueOf(r14)
            java.lang.String r8 = " useAltitudeFilter"
            java.lang.String r14 = r7.concat(r8)
        L_0x045a:
            java.lang.Double r7 = r11.g
            if (r7 != 0) goto L_0x0468
            java.lang.String r7 = java.lang.String.valueOf(r14)
            java.lang.String r8 = " altitudeFilterWifiValidTimeSeconds"
            java.lang.String r14 = r7.concat(r8)
        L_0x0468:
            java.lang.Double r7 = r11.h
            if (r7 != 0) goto L_0x0476
            java.lang.String r7 = java.lang.String.valueOf(r14)
            java.lang.String r8 = " altitudeFilterGpsValidTimeSeconds"
            java.lang.String r14 = r7.concat(r8)
        L_0x0476:
            java.lang.Double r7 = r11.i
            if (r7 != 0) goto L_0x0484
            java.lang.String r7 = java.lang.String.valueOf(r14)
            java.lang.String r8 = " altitudeFilterFloorLabelValidTimeSeconds"
            java.lang.String r14 = r7.concat(r8)
        L_0x0484:
            java.lang.Boolean r7 = r11.j
            if (r7 != 0) goto L_0x0492
            java.lang.String r7 = java.lang.String.valueOf(r14)
            java.lang.String r8 = " enableBluePixel"
            java.lang.String r14 = r7.concat(r8)
        L_0x0492:
            java.lang.Long r7 = r11.k
            if (r7 != 0) goto L_0x04a0
            java.lang.String r7 = java.lang.String.valueOf(r14)
            java.lang.String r8 = " bluePixelOverruleIntervalNanos"
            java.lang.String r14 = r7.concat(r8)
        L_0x04a0:
            java.lang.Boolean r7 = r11.l
            if (r7 != 0) goto L_0x04ae
            java.lang.String r7 = java.lang.String.valueOf(r14)
            java.lang.String r8 = " enableOutputKalmanFilter"
            java.lang.String r14 = r7.concat(r8)
        L_0x04ae:
            java.lang.Boolean r7 = r11.m
            if (r7 != 0) goto L_0x04bc
            java.lang.String r7 = java.lang.String.valueOf(r14)
            java.lang.String r8 = " enableActivityAwareKalmanFilter"
            java.lang.String r14 = r7.concat(r8)
        L_0x04bc:
            java.lang.Double r7 = r11.n
            if (r7 != 0) goto L_0x04ca
            java.lang.String r7 = java.lang.String.valueOf(r14)
            java.lang.String r8 = " globalAccuracyFactor"
            java.lang.String r14 = r7.concat(r8)
        L_0x04ca:
            java.lang.Boolean r7 = r11.o
            if (r7 != 0) goto L_0x04d8
            java.lang.String r7 = java.lang.String.valueOf(r14)
            java.lang.String r8 = " enableAccuracyOutputFilter"
            java.lang.String r14 = r7.concat(r8)
        L_0x04d8:
            java.lang.Long r7 = r11.p
            if (r7 != 0) goto L_0x04e6
            java.lang.String r7 = java.lang.String.valueOf(r14)
            java.lang.String r8 = " accuracyOutputFilterMaxAgeInWindowNanos"
            java.lang.String r14 = r7.concat(r8)
        L_0x04e6:
            java.lang.Boolean r7 = r11.q
            if (r7 != 0) goto L_0x04f4
            java.lang.String r7 = java.lang.String.valueOf(r14)
            java.lang.String r8 = " enableOutputFilterTimestampFix"
            java.lang.String r14 = r7.concat(r8)
        L_0x04f4:
            java.lang.Boolean r7 = r11.r
            if (r7 != 0) goto L_0x0502
            java.lang.String r7 = java.lang.String.valueOf(r14)
            java.lang.String r8 = " enableIncomingPositionAccuracyScaling"
            java.lang.String r14 = r7.concat(r8)
        L_0x0502:
            java.lang.Boolean r7 = r11.s
            if (r7 != 0) goto L_0x0510
            java.lang.String r7 = java.lang.String.valueOf(r14)
            java.lang.String r8 = " enableArForDriving"
            java.lang.String r14 = r7.concat(r8)
        L_0x0510:
            aqhy r7 = r11.t
            if (r7 != 0) goto L_0x051e
            java.lang.String r7 = java.lang.String.valueOf(r14)
            java.lang.String r8 = " bluemoonLocalizerSensorFusionConfiguration"
            java.lang.String r14 = r7.concat(r8)
        L_0x051e:
            aqie r7 = r11.u
            if (r7 != 0) goto L_0x052c
            java.lang.String r7 = java.lang.String.valueOf(r14)
            java.lang.String r8 = " linearLatLngKalmanFilterConfiguration"
            java.lang.String r14 = r7.concat(r8)
        L_0x052c:
            boolean r7 = r14.isEmpty()
            if (r7 != 0) goto L_0x054c
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = java.lang.String.valueOf(r14)
            int r3 = r2.length()
            if (r3 != 0) goto L_0x0544
            java.lang.String r2 = new java.lang.String
            r2.<init>(r6)
            goto L_0x0548
        L_0x0544:
            java.lang.String r2 = r6.concat(r2)
        L_0x0548:
            r0.<init>(r2)
            throw r0
        L_0x054c:
            aqhs r16 = new aqhs
            r25 = r16
            java.lang.Double r6 = r11.a
            double r26 = r6.doubleValue()
            java.lang.Boolean r6 = r11.b
            boolean r28 = r6.booleanValue()
            java.lang.Double r6 = r11.c
            double r29 = r6.doubleValue()
            java.lang.Integer r6 = r11.d
            int r31 = r6.intValue()
            java.lang.Boolean r6 = r11.e
            boolean r32 = r6.booleanValue()
            java.lang.Boolean r6 = r11.f
            boolean r33 = r6.booleanValue()
            java.lang.Double r6 = r11.g
            double r34 = r6.doubleValue()
            java.lang.Double r6 = r11.h
            double r36 = r6.doubleValue()
            java.lang.Double r6 = r11.i
            double r38 = r6.doubleValue()
            java.lang.Boolean r6 = r11.j
            boolean r40 = r6.booleanValue()
            java.lang.Long r6 = r11.k
            long r41 = r6.longValue()
            java.lang.Boolean r6 = r11.l
            boolean r43 = r6.booleanValue()
            java.lang.Boolean r6 = r11.m
            boolean r44 = r6.booleanValue()
            java.lang.Double r6 = r11.n
            double r45 = r6.doubleValue()
            java.lang.Boolean r6 = r11.o
            boolean r47 = r6.booleanValue()
            java.lang.Long r6 = r11.p
            long r48 = r6.longValue()
            java.lang.Boolean r6 = r11.q
            boolean r50 = r6.booleanValue()
            java.lang.Boolean r6 = r11.r
            boolean r51 = r6.booleanValue()
            java.lang.Boolean r6 = r11.s
            boolean r52 = r6.booleanValue()
            aqhy r6 = r11.t
            r53 = r6
            aqie r6 = r11.u
            r54 = r6
            r25.<init>(r26, r28, r29, r31, r32, r33, r34, r36, r38, r40, r41, r43, r44, r45, r47, r48, r50, r51, r52, r53, r54)
            aqgb r6 = new aqgb
            java.lang.String r7 = android.os.Build.PRODUCT
            long r14 = defpackage.ayap.d()
            r8 = r10
            long r10 = defpackage.ayap.f()
            r26 = r8
            r25 = r9
            long r8 = defpackage.ayap.e()
            float r7 = defpackage.aqgd.a(r7)
            int r15 = (int) r14
            int r11 = (int) r10
            int r9 = (int) r8
            r14 = r6
            r10 = r15
            r8 = 0
            r15 = r7
            r17 = r10
            r18 = r11
            r19 = r9
            r20 = r0
            r21 = r2
            r22 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r0 = r6
            goto L_0x06ff
        L_0x05ff:
            r23 = r7
            r25 = r9
            r26 = r10
            r24 = r11
            r18 = r14
            r8 = 0
            ayaj r0 = defpackage.ayaj.a
            ayak r0 = r0.a()
            boolean r0 = r0.flpUseGpsWifiFusion()
            if (r0 == 0) goto L_0x06ef
            r7 = 3
            r2.a((int) r7)
            aqfi r0 = new aqfi
            r0.<init>()
            java.lang.String r2 = android.os.Build.PRODUCT
            float r2 = defpackage.aqgd.a(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r0.a = r2
            long r9 = defpackage.ayap.d()
            int r2 = (int) r9
            r0.a((int) r2)
            long r9 = defpackage.ayap.f()
            int r2 = (int) r9
            r0.c(r2)
            long r9 = defpackage.ayap.e()
            int r2 = (int) r9
            r0.b(r2)
            ayaj r2 = defpackage.ayaj.a
            ayak r2 = r2.a()
            boolean r2 = r2.flpUsePdrWithGpsPosition()
            r0.a((boolean) r2)
            r0.a()
            java.lang.Float r2 = r0.a
            if (r2 != 0) goto L_0x065a
            java.lang.String r14 = " gpsAccuracyNormalizationFactor"
            goto L_0x065c
        L_0x065a:
            r14 = r18
        L_0x065c:
            java.lang.Integer r2 = r0.b
            if (r2 != 0) goto L_0x0666
            java.lang.String r2 = " gpsPositionRequestTimePeriodSec"
            java.lang.String r14 = r14.concat(r2)
        L_0x0666:
            java.lang.Integer r2 = r0.c
            if (r2 != 0) goto L_0x0674
            java.lang.String r2 = java.lang.String.valueOf(r14)
            java.lang.String r7 = " wifiLocationRequestTimePeriodSec"
            java.lang.String r14 = r2.concat(r7)
        L_0x0674:
            java.lang.Integer r2 = r0.d
            if (r2 != 0) goto L_0x0682
            java.lang.String r2 = java.lang.String.valueOf(r14)
            java.lang.String r7 = " nearIndoorsGpsSnrThreshold"
            java.lang.String r14 = r2.concat(r7)
        L_0x0682:
            java.lang.Boolean r2 = r0.e
            if (r2 != 0) goto L_0x0690
            java.lang.String r2 = java.lang.String.valueOf(r14)
            java.lang.String r7 = " usePdrWithGpsPosition"
            java.lang.String r14 = r2.concat(r7)
        L_0x0690:
            java.lang.Integer r2 = r0.f
            if (r2 != 0) goto L_0x069e
            java.lang.String r2 = java.lang.String.valueOf(r14)
            java.lang.String r7 = " flpMinimumOutputAccuracyMm"
            java.lang.String r14 = r2.concat(r7)
        L_0x069e:
            boolean r2 = r14.isEmpty()
            if (r2 != 0) goto L_0x06be
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = java.lang.String.valueOf(r14)
            int r3 = r2.length()
            if (r3 != 0) goto L_0x06b6
            java.lang.String r2 = new java.lang.String
            r2.<init>(r6)
            goto L_0x06ba
        L_0x06b6:
            java.lang.String r2 = r6.concat(r2)
        L_0x06ba:
            r0.<init>(r2)
            throw r0
        L_0x06be:
            aqfc r2 = new aqfc
            java.lang.Float r6 = r0.a
            float r15 = r6.floatValue()
            java.lang.Integer r6 = r0.b
            int r16 = r6.intValue()
            java.lang.Integer r6 = r0.c
            int r17 = r6.intValue()
            java.lang.Integer r6 = r0.d
            int r18 = r6.intValue()
            java.lang.Boolean r6 = r0.e
            boolean r19 = r6.booleanValue()
            java.lang.Integer r0 = r0.f
            int r20 = r0.intValue()
            r14 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20)
            aqfp r6 = new aqfp
            r6.<init>(r2)
            r0 = r6
            goto L_0x06ff
        L_0x06ef:
            r6 = 2
            r2.a((int) r6)
            aqgp r6 = new aqgp
            aqgk r0 = new aqgk
            r0.<init>()
            r6.<init>(r0)
            r0 = r6
        L_0x06ff:
            boolean r2 = defpackage.ayam.c()
            if (r2 == 0) goto L_0x070b
            aihq r15 = new aihq
            r15.<init>(r12)
            goto L_0x070c
        L_0x070b:
            r15 = r8
        L_0x070c:
            rns r11 = defpackage.rns.f(r56)
            r55.<init>()
            r6 = 0
            r1.f = r6
            r1.u = r6
            aifi r2 = new aifi
            r2.<init>()
            r1.j = r2
            aidh r2 = new aidh
            r2.<init>()
            r1.F = r2
            r1.y = r12
            r56.getPackageName()
            aidg r2 = new aidg
            qvr r6 = new qvr
            r6.<init>((android.os.Looper) r13)
            acrz r7 = defpackage.aieo.a(r56)
            r2.<init>(r6, r7)
            r1.b = r2
            r1.o = r4
            r4.i = r1
            r2 = r58
            r1.i = r2
            aqfs r2 = new aqfs
            r2.<init>(r0)
            r1.h = r2
            r1.B = r11
            r1.l = r3
            boolean r2 = defpackage.axxm.k()
            if (r2 == 0) goto L_0x075e
            aift r2 = r3.b()
            r4.j = r2
            r3.a((defpackage.aihc) r1)
        L_0x075e:
            boolean r2 = defpackage.ayap.i()
            if (r2 == 0) goto L_0x078c
            aqim r2 = new aqim
            ayap r3 = defpackage.ayap.a
            ayaq r3 = r3.a()
            long r3 = r3.sensorFusionOutputPositionLogMaxBufferSize()
            int r4 = (int) r3
            ayap r3 = defpackage.ayap.a
            ayaq r3 = r3.a()
            long r6 = r3.sensorFusionOutputPositionLogTimeWindowSec()
            double r6 = (double) r6
            r21 = 1
            java.lang.String r17 = "FusionEngine"
            r16 = r2
            r18 = r4
            r19 = r6
            r16.<init>(r17, r18, r19, r21)
            r1.z = r2
            goto L_0x078e
        L_0x078c:
            r1.z = r8
        L_0x078e:
            r1.v = r8
            r1.x = r8
            r2 = 0
            r1.w = r2
            aieu r2 = new aieu
            r2.<init>()
            r1.e = r2
            aieu r2 = new aieu
            r2.<init>()
            r1.s = r2
            jgy r4 = defpackage.jgy.a((android.content.Context) r56)
            com.google.android.location.fused.LocationStatusHelper r2 = new com.google.android.location.fused.LocationStatusHelper
            jld r3 = new jld
            r3.<init>(r12, r13)
            aifw r6 = new aifw
            r6.<init>(r13, r12)
            com.google.android.location.util.DeviceActiveAlarmTimer r7 = new com.google.android.location.util.DeviceActiveAlarmTimer
            r7.<init>(r12, r13)
            r2.<init>(r3, r6, r7)
            r1.p = r2
            r2.o = r1
            aiix r9 = new aiix
            aidf r7 = r1.i
            r2 = r9
            r3 = r25
            r6 = r57
            r14 = r23
            r2.<init>(r3, r4, r5, r6, r7)
            aiek r2 = new aiek
            r2.<init>(r1)
            r9.i = r2
            boolean r2 = defpackage.ayap.m()
            if (r2 == 0) goto L_0x07e6
            aoqm r2 = defpackage.aoqm.a
            ajpq r3 = r9.b
            if (r3 != 0) goto L_0x07ed
            ajpz r3 = r9.a
            r3.a(r1, r2)
            goto L_0x07ed
        L_0x07e6:
            ajpq r2 = r9.b
            if (r2 == 0) goto L_0x07ed
            r2.a(r1)
        L_0x07ed:
            r2 = 4
            r9.o = r2
            ayap r2 = defpackage.ayap.a
            ayaq r2 = r2.a()
            long r2 = r2.flpHighPowerGpsPulseMs()
            r9.n = r2
            boolean r2 = defpackage.ayam.c()
            if (r2 != 0) goto L_0x0803
            goto L_0x0807
        L_0x0803:
            if (r15 == 0) goto L_0x0807
            r15.a = r1
        L_0x0807:
            boolean r2 = defpackage.ayam.g()
            if (r2 == 0) goto L_0x0838
            boolean r2 = r0 instanceof defpackage.aqgb
            if (r2 == 0) goto L_0x0838
            boolean r2 = defpackage.ayam.f()
            if (r2 == 0) goto L_0x081a
            r4 = r26
            goto L_0x083a
        L_0x081a:
            r1.c = r8
            aqgb r0 = (defpackage.aqgb) r0
            com.google.location.bluemoon.inertialanchor.InertialAnchorBase r0 = r0.d
            com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor r0 = (com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor) r0
            r1.d = r0
            aijf r0 = new aijf
            aigh r2 = new aigh
            aidg r3 = r1.b
            android.os.Handler r3 = r3.c
            r4 = r26
            r2.<init>(r4, r1, r3)
            com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor r3 = r1.d
            r0.<init>((defpackage.aigh) r2, (com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor) r3)
            r5 = r0
            goto L_0x084f
        L_0x0838:
            r4 = r26
        L_0x083a:
            r2 = r60
            r1.c = r2
            r1.d = r8
            aijf r0 = new aijf
            aigh r3 = new aigh
            aidg r5 = r1.b
            android.os.Handler r5 = r5.c
            r3.<init>(r4, r1, r5)
            r0.<init>((defpackage.aigh) r3, (defpackage.aiii) r2)
            r5 = r0
        L_0x084f:
            com.google.android.location.fused.FusionScheduler r0 = new com.google.android.location.fused.FusionScheduler
            aijb r4 = new aijb
            aiel r2 = new aiel
            java.lang.String r3 = "location"
            java.lang.String r6 = "FusionEngine"
            r2.<init>(r1, r3, r6)
            r3 = r25
            r4.<init>(r3, r2, r13)
            aija r6 = new aija
            aifw r2 = r1.o
            aidf r3 = r1.i
            r6.<init>(r2, r3)
            aiiz r7 = new aiiz
            aifw r2 = r1.o
            aidf r3 = r1.i
            r7.<init>(r2, r3)
            aiin r8 = new aiin
            aifw r2 = r1.o
            aidf r3 = r1.i
            r8.<init>(r2, r3)
            aiio r10 = new aiio
            aidf r2 = r1.i
            r10.<init>(r15, r2)
            jkz r15 = new jkz
            qvr r2 = new qvr
            r2.<init>((android.os.Looper) r13)
            r15.<init>(r12, r2)
            r2 = r0
            r3 = r9
            r9 = r10
            r10 = r15
            r15 = r24
            r12 = r56
            r13 = r57
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1.A = r0
            long r2 = android.os.SystemClock.elapsedRealtime()
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r4
            r1.a((long) r2)
            r1.C = r14
            int r0 = android.os.Build.VERSION.SDK_INT
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.D = r0
            java.util.Comparator r0 = defpackage.aiej.a
            r1.E = r0
            r15.a(r1)
            com.google.android.location.fused.FusionEngine$AlarmListener r0 = new com.google.android.location.fused.FusionEngine$AlarmListener
            r0.<init>(r1)
            r1.k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aien.<init>(android.content.Context, android.os.Looper, aidf, aicw, aiii):void");
    }

    private final Location a(Location location) {
        boolean z2;
        aies aies;
        String str;
        String str2;
        aies aies2;
        int i2;
        Integer num;
        Location location2 = location;
        if (!this.g || this.q == null) {
            return null;
        }
        String provider = location.getProvider();
        long time = location.getTime();
        long a2 = aicu.a(location);
        if ("network".equals(provider)) {
            Location location3 = this.s.a;
            if (location3 != null && location3.getTime() == location.getTime()) {
                return null;
            }
            if ("cell".equals(atiq.a(location))) {
                this.i.a(10);
                z2 = false;
            } else {
                this.i.a(9);
                Bundle extras = location.getExtras();
                if (extras == null || !extras.containsKey("locationSubtype")) {
                    num = 0;
                } else {
                    num = Integer.valueOf(extras.getInt("locationSubtype"));
                }
                z2 = num.intValue() == 6;
            }
            if (this.B.a("network")) {
                this.s.a(new Location(location2));
                this.t = a2;
            }
            if (!ayap.k()) {
                long a3 = aicu.a(location);
                if (rev.b(location)) {
                    str = rev.a(location);
                } else {
                    str = null;
                }
                if (!aybc.b() || !rev.f(location)) {
                    str2 = null;
                } else {
                    str2 = rev.e(location);
                }
                if (str == null && str2 == null) {
                    aies2 = null;
                } else {
                    aies2 = !rev.c(location) ? new aies(str, str2, a3) : new aies(str, rev.d(location).intValue(), str2, a3);
                }
                if (atiu.a(aies2, this.v)) {
                    i2 = this.w + 1;
                    this.w = i2;
                } else {
                    this.w = 1;
                    i2 = 1;
                }
                this.v = aies2;
                aies aies3 = this.x;
                if (aies3 == null || i2 >= 2 || a3 - aies3.e > 20000000000L) {
                    this.x = this.v;
                }
            }
        } else if ("gps".equals(provider) || "gps_injected".equals(provider)) {
            Location location4 = this.r;
            if (location4 != null && location4.getTime() == location.getTime()) {
                return null;
            }
            this.i.a(8, 1);
            if (this.B.a("gps")) {
                this.r = new Location(location2);
            }
            z2 = false;
        } else {
            if (!"fused".equals(provider)) {
                this.i.a(11);
            }
            return null;
        }
        if (rev.j(location)) {
            location2.setProvider("fused");
            rev.k(location);
            return location2;
        }
        if (!ayap.k() && (aies = this.x) != null && a2 - aies.e > 40000000000L) {
            this.x = null;
        }
        this.h.a(a2, aiet.a(location2, ayap.k()));
        a(a2);
        Location a4 = a(time, a2);
        if (!z2 || !aydu.c()) {
            return a4;
        }
        if (ayap.k()) {
            return aiet.a(aiet.a(location2, true), "fused", time, a2);
        }
        return aiet.a(aiet.a(location2, false), "fused", this.x, time, a2);
    }

    private static final void b(Location location, Location location2) {
        if (location != null) {
            Location location3 = new Location(location);
            location3.setProvider("fused");
            rev.a(location2, "noGPSLocation", location3);
        }
    }

    private final void d(List list) {
        if (this.g) {
            List list2 = null;
            if (list.size() == 1) {
                Location a2 = a((Location) list.get(0));
                if (a2 != null) {
                    list2 = Collections.singletonList(a2);
                }
            } else {
                int i2 = Build.VERSION.SDK_INT;
                if (!list.isEmpty()) {
                    list2 = new ArrayList(list.size());
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Location a3 = a((Location) it.next());
                        if (a3 != null) {
                            list2.add(a3);
                        }
                    }
                }
            }
            c(list2);
        }
    }

    private final void h() {
        if (this.r != null) {
            this.r = null;
            aieu aieu = this.s;
            a(aieu.a, aieu.a());
        }
    }

    private final void i() {
        aieu aieu = this.s;
        if (aieu.a != null) {
            aieu.a = null;
            aieu.b = null;
            a(this.r, (Location) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void j() {
        /*
            r11 = this;
            boolean r0 = r11.g()
            if (r0 != 0) goto L_0x0015
            aidh r0 = r11.F
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x000f
            goto L_0x0015
        L_0x000f:
            com.google.android.location.util.DeviceActiveAlarmTimer r0 = r11.C
            r0.b()
            return
        L_0x0015:
            boolean r0 = r11.g()
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 == 0) goto L_0x0039
            aifi r0 = r11.j
            long r3 = r0.g
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x0039
            long r0 = r0.f
            float r0 = (float) r0
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            long r0 = (long) r0
            long r5 = n
            long r0 = java.lang.Math.max(r0, r5)
            long r0 = r0 + r3
            r1 = r0
            goto L_0x003a
        L_0x0039:
        L_0x003a:
            aidh r0 = r11.F
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x004a
            long r3 = a
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x004a
            r6 = r3
            goto L_0x004c
        L_0x004a:
            r6 = r1
        L_0x004c:
            com.google.android.location.util.DeviceActiveAlarmTimer r0 = r11.C
            long r0 = r0.c()
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0063
            com.google.android.location.util.DeviceActiveAlarmTimer r5 = r11.C
            aifi r0 = r11.j
            java.util.Collection r8 = r0.k
            com.google.android.location.fused.FusionEngine$AlarmListener r10 = r11.k
            java.lang.String r9 = "com.google.android.gms.location.ENGINE_BATCH_TIMEOUT"
            r5.a(r6, r8, r9, r10)
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aien.j():void");
    }

    public final void a(aiew aiew) {
        this.q = aiew;
    }

    public final void a(NetworkLocationStatus[] networkLocationStatusArr) {
    }

    public final void c() {
        if (this.F.a()) {
            f();
            aidh aidh = this.F;
            if (!aidh.a.isEmpty()) {
                aido[] aidoArr = (aido[]) aidh.a.toArray(aidh.b);
                aidh.a.clear();
                for (aido aido : aidoArr) {
                    if (aido != null) {
                        aido.a();
                    }
                }
            }
            j();
        }
    }

    public final void e() {
        h();
    }

    public final void f() {
        if (!this.D.isEmpty()) {
            Collections.sort(this.D, this.E);
            d(this.D);
            this.D.clear();
            j();
        }
    }

    public final String toString() {
        return "FusionEngine";
    }

    public final boolean g() {
        int i2 = Build.VERSION.SDK_INT;
        return this.j.b();
    }

    public final void b() {
        if (this.g) {
            this.g = false;
            this.B.a((rni) this);
            this.B.a((rnh) this);
            LocationStatusHelper locationStatusHelper = this.p;
            locationStatusHelper.l = false;
            locationStatusHelper.p.e();
            locationStatusHelper.q.b();
            locationStatusHelper.r.b();
            FusionScheduler fusionScheduler = this.A;
            if (fusionScheduler.n) {
                fusionScheduler.b.e();
                fusionScheduler.h.a();
                fusionScheduler.j.unregisterReceiver(fusionScheduler);
                fusionScheduler.i.a((rng) fusionScheduler);
                fusionScheduler.n = false;
                fusionScheduler.o = false;
                fusionScheduler.a(false);
            }
            this.o.e();
            int i2 = Build.VERSION.SDK_INT;
            this.D.clear();
            aidf aidf = this.i;
            aidf.a(1, aidf.j.a((Object) "FusionEngine"));
        }
    }

    public final void c(List list) {
        if (list != null && !list.isEmpty()) {
            aiew aiew = this.q;
            if (aiew != null) {
                aiew.e(list);
            }
            Location location = (Location) list.get(list.size() - 1);
            if (rns.b(this.y)) {
                LocationStatusHelper locationStatusHelper = this.p;
                if (list.isEmpty()) {
                    String valueOf = String.valueOf(list);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
                    sb.append("Received invalid locations to report: ");
                    sb.append(valueOf);
                    Log.wtf("GCoreFlp", new IllegalArgumentException(sb.toString()));
                } else {
                    int i2 = Build.VERSION.SDK_INT;
                    ListIterator listIterator = list.listIterator(list.size());
                    boolean z2 = false;
                    boolean z3 = false;
                    while (listIterator.hasPrevious() && (!z2 || !z3)) {
                        Location location2 = (Location) listIterator.previous();
                        int i3 = rev.i(location2);
                        char c2 = 2;
                        if (i3 == 1) {
                            c2 = 0;
                        } else if (i3 == 2 || i3 == 3) {
                            c2 = 1;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        long millis = TimeUnit.NANOSECONDS.toMillis(location2.getElapsedRealtimeNanos());
                        if (c2 != 0) {
                            if (c2 != 1) {
                                if (!z2) {
                                    locationStatusHelper.i = millis;
                                }
                                if (!z3) {
                                    locationStatusHelper.j = millis;
                                    z2 = true;
                                }
                            } else if (!z3) {
                                locationStatusHelper.j = millis;
                            }
                            z3 = true;
                        } else if (!z2) {
                            locationStatusHelper.i = millis;
                        }
                        z2 = true;
                    }
                    if (z2 || z3) {
                        locationStatusHelper.e();
                    }
                    locationStatusHelper.c();
                }
                this.e.a(location);
            }
        }
    }

    public final void d() {
        c();
    }

    /* access modifiers changed from: package-private */
    public final void b(List list) {
        if (this.g && !list.isEmpty()) {
            if (g()) {
                this.D.addAll(list);
                if (list.size() > 1 || this.C.c() <= 0 || this.D.size() >= 50) {
                    this.C.b();
                    f();
                    return;
                }
                return;
            }
            d(list);
        }
    }

    private final void a(Location location, Location location2) {
        if (location != null) {
            Location location3 = new Location(location);
            location3.setProvider("fused");
            b(this.s.a, location3);
            location = location3;
        }
        if (location2 != null) {
            Location location4 = new Location(location2);
            location4.setProvider("fused");
            b(this.s.a(), location4);
            location2 = location4;
        }
        aieu aieu = this.e;
        aieu.a = location;
        aieu.b = location2;
        this.h.c();
    }

    private final void a(List list, float f2) {
        float f3;
        int size = list.size();
        if (size > 0) {
            f3 = f2 / ((float) size);
        } else {
            f3 = 0.0f;
        }
        Collections.sort(list, Collections.reverseOrder());
        int min = Math.min(5, size);
        float[] fArr = new float[min];
        for (int i2 = 0; i2 < min; i2++) {
            fArr[i2] = ((Float) list.get(i2)).floatValue();
        }
        this.b.a(26, new aiem(this, new aqfq(size, f3, fArr)));
    }

    public final Location a(long j2, long j3) {
        Location location;
        Location location2;
        String str;
        Integer num;
        Float f2;
        WifiScan wifiScan;
        byte[] bArr;
        byte[] bArr2;
        int i2;
        long j4 = j3;
        aqey a2 = this.h.a();
        long b2 = this.h.b();
        if (a2 == null || b2 <= this.u) {
            return null;
        }
        this.u = b2;
        if (ayap.i() && this.z != null) {
            aqex aqex = a2.a;
            aqex aqex2 = aqex.GPS;
            int ordinal = aqex.ordinal();
            if (ordinal == 0) {
                i2 = 101;
            } else if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        i2 = 104;
                    } else if (ordinal != 4) {
                        i2 = 106;
                    }
                }
                i2 = 105;
            } else {
                i2 = 102;
            }
            double d2 = (double) j4;
            Double.isNaN(d2);
            double d3 = d2 * 1.0E-9d;
            double b3 = aell.b(a2.b);
            double b4 = aell.b(a2.c);
            double d4 = (double) a2.d;
            Double.isNaN(d4);
            this.z.a(new aqjb(i2, d3, b3, b4, d4 * 0.001d, (byte[]) null));
        }
        if (ayap.k()) {
            location = aiet.a(a2, "fused", j2, j3);
        } else {
            location = aiet.a(a2, "fused", this.x, j2, j3);
        }
        if (location != null) {
            this.f = j4;
            b(this.s.a, location);
            if (Math.abs(j4 - this.t) <= 0 && (location2 = this.s.a) != null) {
                Bundle extras = location2.getExtras();
                if (extras != null) {
                    str = extras.getString("levelId");
                } else {
                    str = null;
                }
                Bundle extras2 = location2.getExtras();
                if (extras2 == null || !extras2.containsKey("levelNumberE3")) {
                    num = null;
                } else {
                    num = Integer.valueOf(extras2.getInt("levelNumberE3"));
                }
                Bundle extras3 = location2.getExtras();
                if (extras3 == null || !extras3.containsKey("verticalAccuracy")) {
                    f2 = null;
                } else {
                    f2 = Float.valueOf(extras3.getFloat("verticalAccuracy"));
                }
                String a3 = atiq.a(location2);
                if (!ayfi.b()) {
                    Bundle extras4 = location2.getExtras();
                    if (extras4 != null) {
                        bArr2 = extras4.getByteArray("wifiScan");
                    } else {
                        bArr2 = null;
                    }
                    wifiScan = bArr2 != null ? atis.a(new aibr(bArr2)) : null;
                } else {
                    Bundle extras5 = location2.getExtras();
                    if (extras5 != null) {
                        bArr = extras5.getByteArray("newWifiScan");
                    } else {
                        bArr = null;
                    }
                    wifiScan = bArr != null ? WifiScan.a(bArr) : null;
                }
                location2.setExtras((Bundle) null);
                if (str != null) {
                    rev.b(location2, str);
                }
                if (num != null) {
                    rev.a(location2, num);
                }
                if (f2 != null) {
                    rev.a(location2, f2.floatValue());
                }
                if (wifiScan != null) {
                    rev.a(location2, wifiScan);
                }
                if ("wifi".equals(a3)) {
                    rev.a(location2, 3);
                } else if ("cell".equals(a3)) {
                    rev.a(location2, 2);
                } else {
                    rev.a(location2, 0);
                }
                WifiScan a4 = WifiScan.a(location2);
                if (a4 != null) {
                    rev.a(location, a4);
                }
            }
        }
        return location;
    }

    public final Location a(boolean z2) {
        Location location;
        if (!z2) {
            location = this.e.a;
        } else {
            location = this.e.a();
        }
        if (location == null) {
            Log.w("GCoreFlp", "No location to return for getLastLocation()");
        }
        return location;
    }

    public final void a() {
        if (!this.g) {
            this.g = true;
            aidf aidf = this.i;
            aidf.a(0, aidf.j.a((Object) "FusionEngine"));
            LocationStatusHelper locationStatusHelper = this.p;
            if (locationStatusHelper.o == null) {
                Log.wtf("GCoreFlp", new IllegalStateException("Called enable without already setting a listener"));
            }
            locationStatusHelper.b = 0;
            locationStatusHelper.c = 1;
            locationStatusHelper.d = 1;
            locationStatusHelper.e = 1;
            locationStatusHelper.f = 1;
            locationStatusHelper.m = true;
            locationStatusHelper.n = true;
            aifw aifw = locationStatusHelper.p;
            aifw.i = locationStatusHelper;
            aifw.d();
            locationStatusHelper.q.a = locationStatusHelper;
            locationStatusHelper.q.a();
            locationStatusHelper.l = true;
            locationStatusHelper.b();
            FusionScheduler fusionScheduler = this.A;
            if (!fusionScheduler.n) {
                fusionScheduler.n = true;
                fusionScheduler.o = fusionScheduler.h.b();
                fusionScheduler.j.registerReceiver(fusionScheduler, new IntentFilter("com.google.android.location.internal.server.ACTION_RESTARTED"), (String) null, fusionScheduler.k);
                fusionScheduler.i.a((rng) fusionScheduler, fusionScheduler.k.getLooper());
                fusionScheduler.h.a((jky) fusionScheduler);
                fusionScheduler.b.b();
                fusionScheduler.a(false);
            }
            this.o.d();
            if (ayap.n()) {
                this.B.a((rnh) this, this.b.a());
            } else {
                this.B.a((rni) this, this.b.a());
            }
            a(TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime()));
        }
    }

    public final void a(long j2) {
        int i2;
        FusionScheduler fusionScheduler = this.A;
        aqgg aqgg = this.h;
        boolean a2 = fusionScheduler.i.a("gps");
        if (!fusionScheduler.a.u) {
            i2 = 0;
        } else {
            i2 = a2 ? 4 : 0;
        }
        aijf aijf = fusionScheduler.c;
        if (aijf.u && aijf.v) {
            i2 |= 8;
        }
        aiin aiin = fusionScheduler.f;
        if (aiin.u && aiin.v) {
            i2 |= 16;
        }
        boolean a3 = fusionScheduler.i.a("network");
        if (fusionScheduler.d.u && a3) {
            i2 |= 35;
        } else if (fusionScheduler.e.u && a3) {
            i2 |= 2;
        }
        if (fusionScheduler.g.u && a2 && a3) {
            i2 |= 64;
        }
        int a4 = aqgg.a(j2, i2);
        if (fusionScheduler.l != a4) {
            fusionScheduler.l = a4;
            fusionScheduler.a(false);
        }
    }

    public final void a(ahyn ahyn) {
        ArrayList arrayList = new ArrayList();
        float f2 = 0.0f;
        for (int i2 = 0; i2 < ahyn.a(); i2++) {
            if (ahyn.d(i2)) {
                f2 += ahyn.c(i2);
                arrayList.add(Float.valueOf(ahyn.c(i2)));
            }
        }
        a((List) arrayList, f2);
    }

    public final void a(aido aido) {
        if (this.g) {
            int i2 = Build.VERSION.SDK_INT;
            this.F.a.add(aido);
            if (this.B.a("network")) {
                aifw aifw = this.o;
                atir atir = new atir("com.google.android.gms");
                atir.a.putExtra("nlp.FLUSH_BATCH_INTENT", 0);
                if (atir.a(aifw.g) == null) {
                    Log.w("GCoreFlp", "Unable to bind to GMS NLP");
                }
                aifw.m = true;
                j();
                return;
            }
            c();
        } else if (aido != null) {
            aido.a();
        }
    }

    public final void a(Location location, int i2) {
        if (i2 != 1) {
            StringBuilder sb = new StringBuilder(35);
            sb.append("Unknown injection type: ");
            sb.append(i2);
            Log.wtf("GCoreFlp", new IllegalArgumentException(sb.toString()));
            return;
        }
        location.setProvider("gps_injected");
        b(Collections.singletonList(location));
    }

    public final void a(ActivityRecognitionResult activityRecognitionResult) {
        aqgf aqgf;
        int a2 = activityRecognitionResult.a().a();
        if (a2 == 0) {
            aqgf = aqgf.IN_VEHICLE;
        } else if (a2 == 1) {
            aqgf = aqgf.ON_BICYCLE;
        } else if (a2 == 2) {
            aqgf = aqgf.ON_FOOT;
        } else if (a2 != 3) {
            aqgf = aqgf.UNKNOWN;
        } else {
            aqgf = aqgf.STILL;
        }
        long j2 = activityRecognitionResult.c * 1000000;
        this.h.a(j2, aqgf);
        a(j2);
    }

    public final void a(LocationAvailability locationAvailability) {
        aiew aiew;
        if (this.g && (aiew = this.q) != null) {
            aiew.a(locationAvailability);
            a(TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime()));
        }
    }

    public final void a(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str;
        aieu aieu = this.e;
        Location location = aieu.a;
        Location a2 = aieu.a();
        aieu aieu2 = this.s;
        Location location2 = aieu2.a;
        Location location3 = this.r;
        Location a3 = aieu2.a();
        printWriter.println("--FusionEngine--");
        boolean z2 = this.g;
        StringBuilder sb = new StringBuilder(16);
        sb.append("  enabled: ");
        sb.append(z2);
        printWriter.println(sb.toString());
        if (this.g) {
            FusionScheduler fusionScheduler = this.A;
            printWriter.println("  controllers:");
            String valueOf = String.valueOf(fusionScheduler.a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 4);
            sb2.append("    ");
            sb2.append(valueOf);
            printWriter.println(sb2.toString());
            String valueOf2 = String.valueOf(fusionScheduler.b);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 4);
            sb3.append("    ");
            sb3.append(valueOf2);
            printWriter.println(sb3.toString());
            String valueOf3 = String.valueOf(fusionScheduler.c);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 4);
            sb4.append("    ");
            sb4.append(valueOf3);
            printWriter.println(sb4.toString());
            String valueOf4 = String.valueOf(fusionScheduler.d);
            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf4).length() + 4);
            sb5.append("    ");
            sb5.append(valueOf4);
            printWriter.println(sb5.toString());
            String valueOf5 = String.valueOf(fusionScheduler.e);
            StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf5).length() + 4);
            sb6.append("    ");
            sb6.append(valueOf5);
            printWriter.println(sb6.toString());
            String valueOf6 = String.valueOf(fusionScheduler.f);
            StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf6).length() + 4);
            sb7.append("    ");
            sb7.append(valueOf6);
            printWriter.println(sb7.toString());
            String valueOf7 = String.valueOf(fusionScheduler.g);
            StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf7).length() + 4);
            sb8.append("    ");
            sb8.append(valueOf7);
            printWriter.println(sb8.toString());
        }
        printWriter.println("  last locations:");
        String valueOf8 = String.valueOf(location);
        StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf8).length() + 11);
        sb9.append("    fused: ");
        sb9.append(valueOf8);
        printWriter.println(sb9.toString());
        String valueOf9 = String.valueOf(a2);
        StringBuilder sb10 = new StringBuilder(String.valueOf(valueOf9).length() + 19);
        sb10.append("    fused(coarse): ");
        sb10.append(valueOf9);
        printWriter.println(sb10.toString());
        String valueOf10 = String.valueOf(location3);
        StringBuilder sb11 = new StringBuilder(String.valueOf(valueOf10).length() + 9);
        sb11.append("    gps: ");
        sb11.append(valueOf10);
        printWriter.println(sb11.toString());
        String valueOf11 = String.valueOf(location2);
        StringBuilder sb12 = new StringBuilder(String.valueOf(valueOf11).length() + 13);
        sb12.append("    network: ");
        sb12.append(valueOf11);
        printWriter.println(sb12.toString());
        String valueOf12 = String.valueOf(a3);
        StringBuilder sb13 = new StringBuilder(String.valueOf(valueOf12).length() + 21);
        sb13.append("    network(coarse): ");
        sb13.append(valueOf12);
        printWriter.println(sb13.toString());
        if (ayap.a.a().flpEnableSensorfusionLogs()) {
            printWriter.println("--SensorFusion--");
            if (this.c != null) {
                str = "OrientationEngine";
            } else {
                str = "InertialAnchor";
            }
            printWriter.println(str.length() == 0 ? new String("FLP orientation source: ") : "FLP orientation source: ".concat(str));
            this.h.a(SystemClock.elapsedRealtime() * 1000000, printWriter);
            if (axxm.k()) {
                printWriter.println();
                printWriter.println("### start BluePixel log ###");
                this.l.a(printWriter);
                printWriter.println("### end BluePixel log ###");
                printWriter.println();
            }
        }
        if (ayap.i() && this.z != null) {
            printWriter.println("FusionEngine output positions. Contains PII.");
            this.z.a(SystemClock.elapsedRealtime() * 1000000, printWriter);
        }
    }

    public final void a(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        float f2 = 0.0f;
        while (it.hasNext()) {
            GpsSatellite gpsSatellite = (GpsSatellite) it.next();
            if (gpsSatellite.usedInFix()) {
                f2 += gpsSatellite.getSnr();
                arrayList.add(Float.valueOf(gpsSatellite.getSnr()));
            }
        }
        a((List) arrayList, f2);
    }

    public final void a(String str, boolean z2) {
        if ("gps".equals(str)) {
            a(TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime()));
            if (!z2) {
                h();
            }
        } else if ("network".equals(str) && !z2) {
            i();
        }
    }

    public final void a(Collection collection, boolean z2) {
        long j2;
        LocationStatusHelper locationStatusHelper = this.p;
        locationStatusHelper.g.a(anbs.a((Iterable) collection, aifi.a));
        locationStatusHelper.h.a(anbs.a((Iterable) collection, aifi.b));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(locationStatusHelper.i, locationStatusHelper.j);
        if (!z2) {
            j2 = max + locationStatusHelper.g.f;
        } else {
            j2 = elapsedRealtime;
        }
        if (j2 > elapsedRealtime) {
            locationStatusHelper.k = false;
            locationStatusHelper.c();
        } else {
            locationStatusHelper.b();
        }
        FusionScheduler fusionScheduler = this.A;
        fusionScheduler.m = collection;
        fusionScheduler.a(z2);
        a(TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime()));
        int i2 = Build.VERSION.SDK_INT;
        this.j.a(anbs.a((Iterable) collection, aifi.a));
        if (!g()) {
            f();
        }
        j();
        if (!axxm.k()) {
            return;
        }
        if (this.j.h <= 0) {
            this.l.d(2);
        } else if (z2) {
            this.l.c(2);
        }
    }

    public final void a(List list) {
        b(list);
    }

    public final void a(Set set) {
        if (set.contains("gps") || set.contains("network")) {
            a(TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime()));
            if (!this.B.a("gps")) {
                h();
            }
            if (!this.B.a("network")) {
                i();
            }
        }
    }
}
