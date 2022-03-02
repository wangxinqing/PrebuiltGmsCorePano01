package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: aizc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aizc implements SharedPreferences.OnSharedPreferenceChangeListener, ajaj, aiyy {
    public final aicn a;
    public final List b = new ArrayList();
    public boolean c = false;
    public int d = Integer.MAX_VALUE;
    public Map e;
    public arjg f;
    public boolean g = false;
    public final amqt h = new aizb();
    public final Context i;
    public final aiyz j;
    public final aiys k;
    public final aiyt l;
    public aizd m;
    private final ajbg p;

    public aizc(Context context, ajbg ajbg, aiyz aiyz, aiys aiys, aiyt aiyt, aicn aicn) {
        this.i = context;
        this.p = ajbg;
        this.j = aiyz;
        this.k = aiys;
        this.l = aiyt;
        this.a = aicn;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005d, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005f, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized defpackage.aizc a(defpackage.arnf r10, android.content.Context r11, defpackage.ajbg r12, defpackage.aicn r13) {
        /*
            java.lang.Class<aizc> r0 = defpackage.aizc.class
            monitor-enter(r0)
            boolean r1 = defpackage.axyr.c()     // Catch:{ all -> 0x0060 }
            r2 = 0
            if (r1 == 0) goto L_0x005e
            arnd r10 = r10.a(r11)     // Catch:{ all -> 0x0060 }
            if (r10 == 0) goto L_0x005e
            aiyz r1 = new aiyz     // Catch:{ all -> 0x0060 }
            r1.<init>(r10, r12, r13)     // Catch:{ all -> 0x0060 }
            aizc r10 = new aizc     // Catch:{ all -> 0x0060 }
            aiys r7 = new aiys     // Catch:{ all -> 0x0060 }
            r7.<init>(r1)     // Catch:{ all -> 0x0060 }
            aiyt r8 = new aiyt     // Catch:{ all -> 0x0060 }
            r8.<init>()     // Catch:{ all -> 0x0060 }
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r1
            r9 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0060 }
            r1.d = r10     // Catch:{ all -> 0x0060 }
            jfp r12 = new jfp     // Catch:{ all -> 0x0060 }
            java.lang.String r13 = "AR_CHRE_Handler"
            r2 = 9
            r12.<init>(r13, r2)     // Catch:{ all -> 0x0060 }
            r1.b = r12     // Catch:{ all -> 0x0060 }
            jfp r12 = r1.b     // Catch:{ all -> 0x0060 }
            r12.start()     // Catch:{ all -> 0x0060 }
            jfo r12 = new jfo     // Catch:{ all -> 0x0060 }
            jfp r13 = r1.b     // Catch:{ all -> 0x0060 }
            r12.<init>(r13)     // Catch:{ all -> 0x0060 }
            r1.c = r12     // Catch:{ all -> 0x0060 }
            arnd r12 = r1.a     // Catch:{ all -> 0x0060 }
            r2 = 5147455389092024331(0x476f6f676c00100b, double:1.3057659520462463E36)
            jfo r13 = r1.c     // Catch:{ all -> 0x0060 }
            r12.a(r2, r1, r13)     // Catch:{ all -> 0x0060 }
            java.lang.String r12 = "activityRecognitionAccuracyModeName"
            r13 = 0
            android.content.SharedPreferences r11 = r11.getSharedPreferences(r12, r13)     // Catch:{ all -> 0x0060 }
            if (r11 == 0) goto L_0x005c
            r11.registerOnSharedPreferenceChangeListener(r10)     // Catch:{ all -> 0x0060 }
        L_0x005c:
            monitor-exit(r0)
            return r10
        L_0x005e:
            monitor-exit(r0)
            return r2
        L_0x0060:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aizc.a(arnf, android.content.Context, ajbg, aicn):aizc");
    }

    public final boolean b() {
        if (!axyr.c()) {
            return false;
        }
        boolean a2 = this.k.a();
        StringBuilder sb = new StringBuilder(25);
        sb.append("areAllSupported() = ");
        sb.append(a2);
        sb.toString();
        return this.k.a();
    }

    public final void c() {
        if (axyr.b()) {
            boolean b2 = axyr.b();
            StringBuilder sb = new StringBuilder(76);
            sb.append("Ignore CHRE Disable as it is not allowed. chreArDisallowDisable flag = ");
            sb.append(b2);
            sb.toString();
            return;
        }
        h();
        this.j.a(aiyr.a(arii.DISABLE));
    }

    public final boolean d() {
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(17);
        sb.append("isEnabled()=");
        sb.append(z);
        sb.toString();
        if (axyr.c()) {
            return this.c;
        }
        return false;
    }

    public final boolean e() {
        return false;
    }

    public final int f() {
        return this.j.a();
    }

    public final void g() {
        if (SystemClock.elapsedRealtime() - this.l.c > axyr.a.a().chreArClockCheckTimeoutMs()) {
            this.j.a(aiyr.a(arii.QUERY));
        }
        this.g = this.j.a(aiyr.a(arii.FLUSH));
    }

    public final void h() {
        this.c = false;
        this.g = false;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        ajbg ajbg;
        String valueOf = String.valueOf(str);
        if (valueOf.length() == 0) {
            new String("onSharedPreferenceChanged, key=");
        } else {
            "onSharedPreferenceChanged, key=".concat(valueOf);
        }
        if (str != null && TextUtils.equals(str, "arAccuracyModePref") && (ajbg = this.p) != null) {
            ajbg.a((Runnable) new aiza(this));
        }
    }

    public final void a() {
        int i2;
        SharedPreferences sharedPreferences;
        aicn aicn = this.a;
        int ordinal = arii.CONFIG.ordinal();
        aicn.a((aicl) new aiti(aico.CHRE_AR_REQUEST, aicn.b(), ordinal, ordinal));
        int max = Math.max(Math.min((int) axyr.a.a().chreArModel(), arjg.values().length - 1), 0);
        if (this.i == null || !axxd.c() || (sharedPreferences = this.i.getSharedPreferences("activityRecognitionAccuracyModeName", 0)) == null || sharedPreferences.getInt("arAccuracyModePref", 0) != 1) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        aicn aicn2 = this.a;
        int i3 = i2 - 1;
        aicn2.a((aicl) new aitj(aico.CHRE_AR_MODE, aicn2.b(), i3, i3));
        aiyz aiyz = this.j;
        arjg arjg = arjg.values()[max];
        boolean chreArDebugLogEnabled = axyr.a.a().chreArDebugLogEnabled();
        long chreArAccelIntervalNs = axyr.a.a().chreArAccelIntervalNs();
        int numConsecutiveStillsToIdle = (int) axyr.a.a().numConsecutiveStillsToIdle();
        aucd o = arig.h.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        arig arig = (arig) o.b;
        arjg.getClass();
        if (!arig.b.a()) {
            arig.b = aucj.a(arig.b);
        }
        arig.b.d(arjg.g);
        if (o.c) {
            o.c();
            o.c = false;
        }
        arig arig2 = (arig) o.b;
        int i4 = arig2.a | 1;
        arig2.a = i4;
        arig2.c = chreArDebugLogEnabled;
        arig2.d = i3;
        int i5 = i4 | 2;
        arig2.a = i5;
        int i6 = i5 | 8;
        arig2.a = i6;
        arig2.f = chreArAccelIntervalNs;
        arig2.a = i6 | 16;
        arig2.g = numConsecutiveStillsToIdle;
        if (axxd.c()) {
            aucd o2 = arja.D.o();
            int chreArAudioMinContinuousAudioClassificationsCar = (int) axxd.a.a().chreArAudioMinContinuousAudioClassificationsCar();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arja arja = (arja) o2.b;
            arja.a |= 1;
            arja.b = chreArAudioMinContinuousAudioClassificationsCar;
            int chreArAudioMinContinuousAudioClassificationsNoncar = (int) axxd.a.a().chreArAudioMinContinuousAudioClassificationsNoncar();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arja arja2 = (arja) o2.b;
            arja2.a = 2 | arja2.a;
            arja2.c = chreArAudioMinContinuousAudioClassificationsNoncar;
            int chreArAudioMinContinuousMotionClassificationsOnfoot = (int) axxd.a.a().chreArAudioMinContinuousMotionClassificationsOnfoot();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arja arja3 = (arja) o2.b;
            arja3.a |= 4;
            arja3.d = chreArAudioMinContinuousMotionClassificationsOnfoot;
            int chreArAudioMinContinuousMotionClassificationsStill = (int) axxd.a.a().chreArAudioMinContinuousMotionClassificationsStill();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arja arja4 = (arja) o2.b;
            arja4.a |= 16;
            arja4.f = chreArAudioMinContinuousMotionClassificationsStill;
            int chreArAudioMinContinuousMotionClassificationsCar = (int) axxd.a.a().chreArAudioMinContinuousMotionClassificationsCar();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arja arja5 = (arja) o2.b;
            arja5.a |= 64;
            arja5.h = chreArAudioMinContinuousMotionClassificationsCar;
            int chreArAudioMinBufferedMotionClassificationsOnfoot = (int) axxd.a.a().chreArAudioMinBufferedMotionClassificationsOnfoot();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arja arja6 = (arja) o2.b;
            arja6.a |= 8;
            arja6.e = chreArAudioMinBufferedMotionClassificationsOnfoot;
            int chreArAudioMinBufferedMotionClassificationsStill = (int) axxd.a.a().chreArAudioMinBufferedMotionClassificationsStill();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arja arja7 = (arja) o2.b;
            arja7.a |= 32;
            arja7.g = chreArAudioMinBufferedMotionClassificationsStill;
            int chreArAudioMinBufferedMotionClassificationsCar = (int) axxd.a.a().chreArAudioMinBufferedMotionClassificationsCar();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arja arja8 = (arja) o2.b;
            arja8.a |= 128;
            arja8.i = chreArAudioMinBufferedMotionClassificationsCar;
            float chreArAudioMinAudioCarClassificationConfidence = (float) axxd.a.a().chreArAudioMinAudioCarClassificationConfidence();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arja arja9 = (arja) o2.b;
            arja9.a |= 512;
            arja9.k = chreArAudioMinAudioCarClassificationConfidence;
            float chreArAudioMinAudioNoncarClassificationConfidence = (float) axxd.a.a().chreArAudioMinAudioNoncarClassificationConfidence();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arja arja10 = (arja) o2.b;
            arja10.a |= 1024;
            arja10.l = chreArAudioMinAudioNoncarClassificationConfidence;
            float chreArAudioMinMotionOnfootClassificationConfidence = (float) axxd.a.a().chreArAudioMinMotionOnfootClassificationConfidence();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arja arja11 = (arja) o2.b;
            arja11.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
            arja11.n = chreArAudioMinMotionOnfootClassificationConfidence;
            float chreArAudioMinMotionStillClassificationConfidence = (float) axxd.a.a().chreArAudioMinMotionStillClassificationConfidence();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arja arja12 = (arja) o2.b;
            arja12.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
            arja12.o = chreArAudioMinMotionStillClassificationConfidence;
            float chreArAudioMinMotionCarClassificationConfidence = (float) axxd.a.a().chreArAudioMinMotionCarClassificationConfidence();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arja arja13 = (arja) o2.b;
            arja13.a |= 2048;
            arja13.m = chreArAudioMinMotionCarClassificationConfidence;
            boolean b2 = axxd.b();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arja arja14 = (arja) o2.b;
            arja14.a |= 524288;
            arja14.u = b2;
            boolean d2 = axxd.d();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arja arja15 = (arja) o2.b;
            arja15.a |= 1048576;
            arja15.v = d2;
            long chreArAudioTimeIntervalThresholdForPressurePeakMillis = axxd.a.a().chreArAudioTimeIntervalThresholdForPressurePeakMillis();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arja arja16 = (arja) o2.b;
            arja16.a |= 2097152;
            arja16.w = chreArAudioTimeIntervalThresholdForPressurePeakMillis;
            float chreArAudioMinPressurePeakSpikeThreshold = (float) axxd.a.a().chreArAudioMinPressurePeakSpikeThreshold();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arja arja17 = (arja) o2.b;
            arja17.a |= 4194304;
            arja17.x = chreArAudioMinPressurePeakSpikeThreshold;
            float chreArAudioMinPressurePeakSpikeBackDelta = (float) axxd.a.a().chreArAudioMinPressurePeakSpikeBackDelta();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arja arja18 = (arja) o2.b;
            arja18.a |= 8388608;
            arja18.y = chreArAudioMinPressurePeakSpikeBackDelta;
            long chreArOnfootRecencyTimeIntervalMillis = axxd.a.a().chreArOnfootRecencyTimeIntervalMillis();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arja arja19 = (arja) o2.b;
            arja19.a |= 32768;
            arja19.q = chreArOnfootRecencyTimeIntervalMillis;
            long chreArMaxLastVehicleDetectionIntervalForAllStillMillis = axxd.a.a().chreArMaxLastVehicleDetectionIntervalForAllStillMillis();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arja arja20 = (arja) o2.b;
            arja20.a |= 65536;
            arja20.r = chreArMaxLastVehicleDetectionIntervalForAllStillMillis;
            long chreArMaxLastVehicleDetectionIntervalForOtherTransitionMillis = axxd.a.a().chreArMaxLastVehicleDetectionIntervalForOtherTransitionMillis();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arja arja21 = (arja) o2.b;
            arja21.a |= 131072;
            arja21.s = chreArMaxLastVehicleDetectionIntervalForOtherTransitionMillis;
            long chreArDeepStillIntervalExitMillis = axxd.a.a().chreArDeepStillIntervalExitMillis();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arja arja22 = (arja) o2.b;
            arja22.a |= 262144;
            arja22.t = chreArDeepStillIntervalExitMillis;
            boolean enableCarExitOnIdle = axxd.a.a().enableCarExitOnIdle();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arja arja23 = (arja) o2.b;
            arja23.a |= 16777216;
            arja23.z = enableCarExitOnIdle;
            int chreArAudioMinContinuousMotionClassificationsBicycle = (int) axxd.a.a().chreArAudioMinContinuousMotionClassificationsBicycle();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arja arja24 = (arja) o2.b;
            arja24.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            arja24.j = chreArAudioMinContinuousMotionClassificationsBicycle;
            float chreArAudioMinMotionBicycleClassificationConfidence = (float) axxd.a.a().chreArAudioMinMotionBicycleClassificationConfidence();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arja arja25 = (arja) o2.b;
            arja25.a |= 16384;
            arja25.p = chreArAudioMinMotionBicycleClassificationConfidence;
            boolean enableAudioChreWifiFiltering = axxd.a.a().enableAudioChreWifiFiltering();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arja arja26 = (arja) o2.b;
            arja26.a |= 33554432;
            arja26.A = enableAudioChreWifiFiltering;
            int flexAudioFusion = (int) axxd.a.a().flexAudioFusion();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arja arja27 = (arja) o2.b;
            arja27.a |= 67108864;
            arja27.B = flexAudioFusion;
            boolean chreArEnableMultimodalModelBasedExitTransition = axxd.a.a().chreArEnableMultimodalModelBasedExitTransition();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arja arja28 = (arja) o2.b;
            arja28.a |= 134217728;
            arja28.C = chreArEnableMultimodalModelBasedExitTransition;
            arja arja29 = (arja) o2.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            arig arig3 = (arig) o.b;
            arja29.getClass();
            arig3.e = arja29;
            arig3.a |= 4;
        }
        aucd o3 = arij.g.o();
        arii arii = arii.CONFIG;
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        arij arij = (arij) o3.b;
        arij.b = arii.g;
        arij.a |= 1;
        arig arig4 = (arig) o.i();
        arig4.getClass();
        arij.e = arig4;
        arij.a |= 4;
        aiyz.a((arij) o3.i());
    }

    public final void a(ajad ajad) {
        if (!this.b.contains(ajad)) {
            this.b.add(ajad);
        }
    }

    public final void a(Boolean bool, Boolean bool2) {
        String valueOf = String.valueOf(bool);
        String valueOf2 = String.valueOf(bool2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43 + String.valueOf(valueOf2).length());
        sb.append("signal(), vehicleBluetoothConnected=");
        sb.append(valueOf);
        sb.append(", wifi=");
        sb.append(valueOf2);
        sb.toString();
        aucd o = arje.d.o();
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            arje arje = (arje) o.b;
            arje.a |= 1;
            arje.b = booleanValue;
        }
        if (bool2 != null) {
            boolean booleanValue2 = bool2.booleanValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            arje arje2 = (arje) o.b;
            arje2.a |= 2;
            arje2.c = booleanValue2;
        }
        aucd o2 = arij.g.o();
        arii arii = arii.CONTEXT_SIGNAL;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        arij arij = (arij) o2.b;
        arij.b = arii.g;
        arij.a |= 1;
        arje arje3 = (arje) o.i();
        arje3.getClass();
        arij.f = arje3;
        arij.a |= 8;
        this.j.a((arij) o2.i());
    }

    /* JADX INFO: finally extract failed */
    public final boolean a(ajae ajae) {
        if (!axyr.c() || !this.k.a()) {
            return false;
        }
        arij a2 = aiyr.a(Integer.MAX_VALUE, ajae.a);
        arii a3 = arii.a(a2.b);
        if (a3 == null) {
            a3 = arii.DISABLE;
        }
        String valueOf = String.valueOf(a3);
        int i2 = a2.c;
        int size = a2.d.size();
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 86);
        sb.append("ActivityRequest: command=");
        sb.append(valueOf);
        sb.append(", maxReportLatencyMs=");
        sb.append(i2);
        sb.append(", transitionCount=");
        sb.append(size);
        sb.toString();
        for (int i3 = 0; i3 < a2.d.size(); i3++) {
            ariu a4 = ariu.a(((arir) a2.d.get(i3)).b);
            if (a4 == null) {
                a4 = ariu.INVALID_ACTIVITY;
            }
            String valueOf2 = String.valueOf(a4);
            arji a5 = arji.a(((arir) a2.d.get(i3)).c);
            if (a5 == null) {
                a5 = arji.INVALID_TRANSITION;
            }
            String valueOf3 = String.valueOf(a5);
            int i4 = ((arir) a2.d.get(i3)).d;
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 82 + String.valueOf(valueOf3).length());
            sb2.append("transition ");
            sb2.append(i3);
            sb2.append(": activity=");
            sb2.append(valueOf2);
            sb2.append(", transitionType=");
            sb2.append(valueOf3);
            sb2.append(", maxReportLatencyMs=");
            sb2.append(i4);
            sb2.toString();
        }
        this.c = this.j.a(a2);
        aicn aicn = this.a;
        int size2 = ajae.a.size();
        aicn.a((aicl) new aitk(aico.CHRE_AR_REQUEST, aicn.b(), size2, size2));
        if (this.c) {
            this.d = Integer.MAX_VALUE;
            this.e = ajae.a;
            aiyt aiyt = this.l;
            int[] e2 = this.k.e();
            aiys aiys = this.k;
            aiys.a.lock();
            try {
                aiys.b();
                List list = aiys.d;
                aiys.a.unlock();
                this.m = new aizd(aiyt, e2, list);
            } catch (Throwable th) {
                aiys.a.unlock();
                throw th;
            }
        }
        return this.c;
    }
}
