package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.gms.location.FloorChangeEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import javax.crypto.SecretKey;

/* renamed from: ahix  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahix implements aizk, aibg, ajbk, aiao, ajad, ahpn, ajqp, ahkx, ajal, ajan, ahlz {
    public static volatile boolean Z = false;
    public static final ahup[] a = {ahup.ACCELEROMETER, ahup.BAROMETER};
    private static final List aA = Arrays.asList(new String[]{"angler", "bullhead", "marlin", "sailfish"});
    private static final int[] aO = {0, 1, 2, 3, 4, 7, 8, 16, 17};
    public static final String[] b = {"accel", "baro"};
    public static final String[][] c = {new String[]{"car", "bluetooth_gmm_car"}, new String[]{"possible", "bluetooth_gmm_possible_car"}, new String[]{"total", "bluetooth_gmm_total"}};
    public final ajbi A;
    public final ajaj B;
    public final ajam C;
    public List D = new ArrayList();
    public final Map E = new HashMap();
    public final ahmc F;
    public final ahkd G;
    public boolean H = false;
    public boolean I = false;
    public aizv J = null;
    public final ahjy K;
    public ahnc L;
    public ahnx M;
    public ahko N;
    public final ahil O = new ahlf();
    public final ahil P = new ahkq();
    public int Q = 0;
    public final Queue R = new PriorityQueue();
    public long S = Long.MAX_VALUE;
    public long T = 0;
    public long U = Long.MAX_VALUE;
    public long V = Long.MAX_VALUE;
    public final ahjn W;
    public Map X = new ConcurrentHashMap();
    public ahku Y;
    private final ajqq aB;
    private final aizz aC;
    private boolean aD;
    private boolean aE = true;
    private final ajar aF;
    private Map aG = Collections.emptyMap();
    private ahpe aH;
    private final ahli aI;
    private final Queue aJ = new PriorityQueue();
    private long aK = Long.MAX_VALUE;
    private final boolean aL;
    private long aM;
    private long aN;
    public boolean aa = false;
    public long ab;
    public long ac;
    public boolean ad = false;
    public boolean ae = false;
    public final int af = 1;
    public final int ag = 3;
    public final int ah = 3;
    public long ai = Long.MAX_VALUE;
    public aiac aj = null;
    public long ak = -1;
    public long al = -1;
    public long am = -1;
    public long an = -1;
    public long ao = -1;
    public long ap = -1;
    public final List aq = new ArrayList();
    public boolean ar;
    public boolean as = false;
    public boolean at = false;
    public long au = -1;
    public ajao av;
    public final aiwm aw;
    public ahox ax;
    public final ahzs ay;
    public final aixl az;
    public final aizl d;
    public final ahjc e;
    public final aizm f;
    public final aizy g;
    public final aicn h;
    public final ajaa i;
    public final ajbf j;
    public final ajbg k;
    public final ahiu l;
    public final ahiw m;
    public final ahjw n;
    public ahld o = null;
    public final boolean p;
    public ahle q;
    public final ahla r;
    public final ahla s;
    public aiac t = null;
    public ActivityRecognitionResult u = null;
    public ActivityRecognitionResult v = null;
    public aibl w = ahlm.a;
    public long x = -1;
    public final ahjr y;
    public final ajbi z;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: ahky} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: ahke} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: ahke} */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0420  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0449 A[Catch:{ IOException | IllegalArgumentException -> 0x046c }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0453 A[Catch:{ IOException | IllegalArgumentException -> 0x046c }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x02b9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x037d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ahix(defpackage.ahjc r31, defpackage.aizl r32, defpackage.aizm r33, defpackage.aiwm r34, defpackage.ajqq r35, defpackage.aizy r36, defpackage.aizz r37, defpackage.aicn r38, defpackage.ajaa r39, defpackage.ajbf r40, defpackage.ajbg r41, boolean r42, defpackage.ajbi r43, defpackage.ajbi r44, defpackage.aixl r45, defpackage.ajaj r46, defpackage.ajam r47, defpackage.aiap r48, defpackage.ajao r49) {
        /*
            r30 = this;
            r7 = r30
            r8 = r36
            r15 = r38
            r14 = r39
            r13 = r40
            r0 = r41
            r12 = r42
            r11 = r48
            r30.<init>()
            r10 = 0
            r7.o = r10
            r9 = 1
            r7.aE = r9
            r7.t = r10
            r7.u = r10
            r7.v = r10
            aibl r1 = defpackage.ahlm.a
            r7.w = r1
            r1 = -1
            r7.x = r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r7.D = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r7.E = r3
            r6 = 0
            r7.H = r6
            r7.I = r6
            r7.J = r10
            java.util.Map r3 = java.util.Collections.emptyMap()
            r7.aG = r3
            ahlf r3 = new ahlf
            r3.<init>()
            r7.O = r3
            ahkq r3 = new ahkq
            r3.<init>()
            r7.P = r3
            r7.Q = r6
            java.util.PriorityQueue r3 = new java.util.PriorityQueue
            r3.<init>()
            r7.aJ = r3
            java.util.PriorityQueue r3 = new java.util.PriorityQueue
            r3.<init>()
            r7.R = r3
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7.S = r3
            r1 = 0
            r7.T = r1
            r7.U = r3
            r7.aK = r3
            r7.V = r3
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r7.X = r1
            r7.aa = r6
            r7.ad = r6
            r7.ae = r6
            r7.af = r9
            r1 = 3
            r7.ag = r1
            r7.ah = r1
            r7.ai = r3
            r7.aj = r10
            r1 = -1
            r7.ak = r1
            r7.al = r1
            r7.am = r1
            r7.an = r1
            r7.ao = r1
            r7.ap = r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r7.aq = r3
            r7.as = r6
            r7.at = r6
            r7.au = r1
            r5 = r32
            r7.d = r5
            r1 = r31
            r7.e = r1
            r1 = r33
            r7.f = r1
            r1 = r34
            r7.aw = r1
            r4 = r35
            r7.aB = r4
            r7.g = r8
            r3 = r37
            r7.aC = r3
            r7.h = r15
            r7.i = r14
            r7.j = r13
            r7.k = r0
            r7.p = r12
            r7.aD = r6
            ahjn r1 = new ahjn
            r1.<init>(r0)
            r7.W = r1
            if (r12 != 0) goto L_0x00dc
            boolean r0 = defpackage.axzj.d()
            if (r0 == 0) goto L_0x00dc
            r16 = 1
            goto L_0x00de
        L_0x00dc:
            r16 = 0
        L_0x00de:
            if (r16 == 0) goto L_0x0110
            int r0 = r46.f()
            long r0 = (long) r0
            long r17 = defpackage.axyr.d()
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r2 < 0) goto L_0x0110
            ahna r0 = defpackage.ahna.PHONE_BAR_GRU_FOR_CHRE_DNN     // Catch:{ IOException -> 0x00f4 }
            java.nio.ByteBuffer r0 = r14.a((defpackage.ahna) r0)     // Catch:{ IOException -> 0x00f4 }
            goto L_0x0111
        L_0x00f4:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Failed to load CHRE BurstAR model: "
            int r2 = r0.length()
            if (r2 != 0) goto L_0x010b
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x010e
        L_0x010b:
            r1.concat(r0)
        L_0x010e:
            r0 = r10
            goto L_0x0111
        L_0x0110:
            r0 = r10
        L_0x0111:
            ajaq r29 = new ajaq
            java.lang.String r18 = defpackage.axwx.l()
            axyr r1 = defpackage.axyr.a
            axys r1 = r1.a()
            boolean r19 = r1.enableChreResultsBikeRelabeling()
            axyr r1 = defpackage.axyr.a
            axys r1 = r1.a()
            long r20 = r1.chreArTimeoutToIdleMs()
            axyr r1 = defpackage.axyr.a
            axys r1 = r1.a()
            long r22 = r1.chreArMajorityVoteWindowMillis()
            axxa r1 = defpackage.axxa.a
            axxb r1 = r1.a()
            long r1 = r1.minOnfootConfidenceForChreResultsBikeRelabeling()
            int r2 = (int) r1
            java.lang.Integer r24 = java.lang.Integer.valueOf(r2)
            axxa r1 = defpackage.axxa.a
            axxb r1 = r1.a()
            long r1 = r1.minOnfootCountForChreResultsBikeRelabeling()
            int r2 = (int) r1
            java.lang.Integer r25 = java.lang.Integer.valueOf(r2)
            axxa r1 = defpackage.axxa.a
            axxb r1 = r1.a()
            long r1 = r1.minVehicleConfidenceForChreResultsBikeRelabeling()
            int r2 = (int) r1
            java.lang.Integer r26 = java.lang.Integer.valueOf(r2)
            axxa r1 = defpackage.axxa.a
            axxb r1 = r1.a()
            long r1 = r1.minVehicleCountForChreResultsBikeRelabeling()
            int r2 = (int) r1
            java.lang.Integer r27 = java.lang.Integer.valueOf(r2)
            axwl r1 = defpackage.axwl.a
            axwm r1 = r1.a()
            long r1 = r1.hardwareActivityRecognitionConfidence()
            int r2 = (int) r1
            java.lang.Integer r28 = java.lang.Integer.valueOf(r2)
            r17 = r29
            r17.<init>(r18, r19, r20, r22, r24, r25, r26, r27, r28)
            if (r0 == 0) goto L_0x01ab
            ajar r2 = new ajar
            ahjq r1 = new ahjq
            long r10 = defpackage.axzj.e()
            int r11 = (int) r10
            boolean r10 = defpackage.axzj.b()
            r1.<init>(r0, r11, r10)
            java.lang.Class<ahjq> r0 = defpackage.ahjq.class
            r10 = r1
            r1 = r2
            r11 = r2
            r2 = r36
            r3 = r30
            r4 = r10
            r5 = r0
            r10 = 0
            r6 = r29
            r1.<init>(r2, r3, r4, r5, r6)
            r7.aF = r11
            goto L_0x01c1
        L_0x01ab:
            r10 = 0
            ajar r0 = new ajar
            ahky r4 = new ahky
            r4.<init>(r7, r7, r12)
            java.lang.Class<ahky> r5 = defpackage.ahky.class
            r1 = r0
            r2 = r36
            r3 = r30
            r6 = r29
            r1.<init>(r2, r3, r4, r5, r6)
            r7.aF = r0
        L_0x01c1:
            double r0 = defpackage.axwo.c()
            boolean r2 = defpackage.axwo.d()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 45
            r3.<init>(r4)
            java.lang.String r4 = "ArOffBody.watchHardwareOffBodyEnabled = "
            r3.append(r4)
            r3.append(r2)
            r3.toString()
            boolean r2 = defpackage.axwo.d()
            if (r2 != 0) goto L_0x01e3
            r2 = 0
            goto L_0x01e5
        L_0x01e3:
            r2 = r49
        L_0x01e5:
            r7.av = r2
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2[r10] = r0
            boolean r0 = defpackage.axzj.c()
            axzj r1 = defpackage.axzj.a
            axzk r1 = r1.a()
            boolean r1 = r1.arTestingClassifiersEnabled()
            java.lang.Class<ahmp> r2 = defpackage.ahmp.class
            if (r12 == 0) goto L_0x0210
            ahna r0 = defpackage.ahna.WATCH_ACTIVITY     // Catch:{ IOException -> 0x027f }
            java.nio.ByteBuffer r0 = r14.a((defpackage.ahna) r0)     // Catch:{ IOException -> 0x027f }
            r3 = r0
            r0 = 0
            r1 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            goto L_0x026a
        L_0x0210:
            boolean r6 = defpackage.axzj.h()     // Catch:{ IOException -> 0x027f }
            if (r0 != 0) goto L_0x0219
            java.lang.Class<ahmw> r2 = defpackage.ahmw.class
            goto L_0x021b
        L_0x0219:
            java.lang.Class<ahmq> r2 = defpackage.ahmq.class
        L_0x021b:
            if (r0 != 0) goto L_0x0220
            ahna r3 = defpackage.ahna.PHONE_ACTIVITY_DNN     // Catch:{ IOException -> 0x0279 }
            goto L_0x0222
        L_0x0220:
            ahna r3 = defpackage.ahna.PHONE_ACTIVITY_CNN     // Catch:{ IOException -> 0x0279 }
        L_0x0222:
            java.nio.ByteBuffer r3 = r14.a((defpackage.ahna) r3)     // Catch:{ IOException -> 0x0279 }
            if (r0 == 0) goto L_0x022a
            r4 = 0
            goto L_0x0237
        L_0x022a:
            if (r6 == 0) goto L_0x0236
            ahna r4 = defpackage.ahna.PHONE_TWO_WHEELER_DNN     // Catch:{ IOException -> 0x0233 }
            java.nio.ByteBuffer r4 = r14.a((defpackage.ahna) r4)     // Catch:{ IOException -> 0x0233 }
            goto L_0x0237
        L_0x0233:
            r0 = move-exception
            r1 = 0
            goto L_0x027c
        L_0x0236:
            r4 = 0
        L_0x0237:
            if (r1 != 0) goto L_0x023b
            r1 = 0
            goto L_0x0246
        L_0x023b:
            if (r0 != 0) goto L_0x0240
            ahna r1 = defpackage.ahna.PHONE_ACTIVITY_CNN     // Catch:{ IOException -> 0x0276 }
            goto L_0x0242
        L_0x0240:
            ahna r1 = defpackage.ahna.PHONE_ACTIVITY_DNN     // Catch:{ IOException -> 0x0276 }
        L_0x0242:
            java.nio.ByteBuffer r1 = r14.a((defpackage.ahna) r1)     // Catch:{ IOException -> 0x0276 }
        L_0x0246:
            if (r16 != 0) goto L_0x024b
            r0 = 0
            r5 = 0
            goto L_0x026a
        L_0x024b:
            if (r0 != 0) goto L_0x0254
            ahna r5 = defpackage.ahna.PHONE_BAR_GRU_BATCH_FOR_OAR_DNN     // Catch:{ IOException -> 0x0274 }
            java.nio.ByteBuffer r5 = r14.a((defpackage.ahna) r5)     // Catch:{ IOException -> 0x0274 }
            goto L_0x025a
        L_0x0254:
            ahna r5 = defpackage.ahna.PHONE_BAR_GRU_BATCH_FOR_OAR_CNN     // Catch:{ IOException -> 0x0274 }
            java.nio.ByteBuffer r5 = r14.a((defpackage.ahna) r5)     // Catch:{ IOException -> 0x0274 }
        L_0x025a:
            if (r0 != 0) goto L_0x0263
            ahna r0 = defpackage.ahna.PHONE_BAR_GRU_NON_BATCH_FOR_OAR_DNN     // Catch:{ IOException -> 0x0272 }
            java.nio.ByteBuffer r0 = r14.a((defpackage.ahna) r0)     // Catch:{ IOException -> 0x0272 }
            goto L_0x0269
        L_0x0263:
            ahna r0 = defpackage.ahna.PHONE_BAR_GRU_NON_BATCH_FOR_OAR_CNN     // Catch:{ IOException -> 0x0272 }
            java.nio.ByteBuffer r0 = r14.a((defpackage.ahna) r0)     // Catch:{ IOException -> 0x0272 }
        L_0x0269:
        L_0x026a:
            r21 = r0
            r11 = r3
            r19 = r5
            r28 = r6
            goto L_0x02a5
        L_0x0272:
            r0 = move-exception
            goto L_0x0285
        L_0x0274:
            r0 = move-exception
            goto L_0x027d
        L_0x0276:
            r0 = move-exception
            r1 = 0
            goto L_0x027d
        L_0x0279:
            r0 = move-exception
            r1 = 0
            r3 = 0
        L_0x027c:
            r4 = 0
        L_0x027d:
            r5 = 0
            goto L_0x0285
        L_0x027f:
            r0 = move-exception
            r1 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x0285:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r11 = "Failed to load core AR model: "
            int r16 = r0.length()
            if (r16 != 0) goto L_0x029b
            java.lang.String r0 = new java.lang.String
            r0.<init>(r11)
            goto L_0x029e
        L_0x029b:
            r11.concat(r0)
        L_0x029e:
            r11 = r3
            r19 = r5
            r28 = r6
            r21 = 0
        L_0x02a5:
            ahmc r0 = new ahmc
            r3 = r48
            r0.<init>(r3)
            r7.F = r0
            ahox r0 = r30.v()
            r7.ax = r0
            ahjy r0 = new ahjy
            if (r19 != 0) goto L_0x02b9
            goto L_0x02f4
        L_0x02b9:
            if (r21 == 0) goto L_0x02f4
            ahke r5 = new ahke
            axzj r6 = defpackage.axzj.a
            axzk r6 = r6.a()
            java.lang.String r20 = r6.arGruBurstBatchMaxAttemptsList()
            axzj r6 = defpackage.axzj.a
            axzk r6 = r6.a()
            java.lang.String r22 = r6.arGruBurstNonBatchMaxAttemptsList()
            axzj r6 = defpackage.axzj.a
            axzk r6 = r6.a()
            java.lang.String r23 = r6.arGruBurstConfidenceThresholdEarlyExitList()
            long r9 = defpackage.axzj.e()
            int r10 = (int) r9
            boolean r25 = defpackage.axzj.b()
            boolean r26 = defpackage.axzj.c()
            boolean r27 = defpackage.axzj.g()
            r18 = r5
            r24 = r10
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x02f9
        L_0x02f4:
            ahky r5 = new ahky
            r5.<init>(r7, r7, r12)
        L_0x02f9:
            ahox r10 = r7.ax
            ahmc r9 = r7.F
            r18 = r9
            r6 = 1
            r9 = r0
            r16 = r10
            r6 = 0
            r10 = r42
            r12 = r4
            r4 = r13
            r13 = r2
            r2 = r14
            r14 = r1
            r1 = r15
            r15 = r5
            r17 = r18
            r18 = r38
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r7.K = r0
            if (r42 == 0) goto L_0x0320
            ahko r0 = new ahko
            r0.<init>(r1)
            r7.N = r0
            goto L_0x0352
        L_0x0320:
            ahmz r0 = r0.d
            if (r0 == 0) goto L_0x0352
            ahna r0 = defpackage.ahna.PHONE_FLOOR_CHANGE     // Catch:{ IOException -> 0x0338, IllegalArgumentException -> 0x0336 }
            java.nio.ByteBuffer r0 = r2.a((defpackage.ahna) r0)     // Catch:{ IOException -> 0x0338, IllegalArgumentException -> 0x0336 }
            ahnx r5 = new ahnx     // Catch:{ IOException -> 0x0338, IllegalArgumentException -> 0x0336 }
            ahjy r9 = r7.K     // Catch:{ IOException -> 0x0338, IllegalArgumentException -> 0x0336 }
            ahmz r9 = r9.d     // Catch:{ IOException -> 0x0338, IllegalArgumentException -> 0x0336 }
            r5.<init>(r0, r9)     // Catch:{ IOException -> 0x0338, IllegalArgumentException -> 0x0336 }
            r7.M = r5     // Catch:{ IOException -> 0x0338, IllegalArgumentException -> 0x0336 }
            goto L_0x0352
        L_0x0336:
            r0 = move-exception
            goto L_0x0339
        L_0x0338:
            r0 = move-exception
        L_0x0339:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r5 = "Failed to load floor change model: "
            int r9 = r0.length()
            if (r9 != 0) goto L_0x034f
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5)
            goto L_0x0352
        L_0x034f:
            r5.concat(r0)
        L_0x0352:
            ahkp r0 = new ahkp
            r0.<init>(r7)
            r7.q = r0
            r5 = r43
            r7.z = r5
            r5 = r44
            r7.A = r5
            r5 = r45
            r7.az = r5
            r5 = r46
            r7.B = r5
            r5 = r47
            r7.C = r5
            ahli r0 = new ahli
            r0.<init>()
            r7.aI = r0
            ahkd r0 = new ahkd
            r0.<init>(r3)
            r7.G = r0
            if (r3 == 0) goto L_0x0380
            r3.a(r0)
        L_0x0380:
            ahjw r0 = new ahjw
            r0.<init>(r1)
            r7.n = r0
            boolean r0 = defpackage.ayfc.h()
            if (r0 == 0) goto L_0x03c5
            aibh r0 = new aibh
            byte[] r3 = r37.b()
            aqem r5 = defpackage.ajck.cd
            aiwu r2 = (defpackage.aiwu) r2
            android.content.Context r2 = r2.a
            java.io.File r2 = r2.getFilesDir()
            if (r2 == 0) goto L_0x03a7
            java.io.File r9 = new java.io.File
            java.lang.String r10 = "nlp_ash"
            r9.<init>(r2, r10)
            goto L_0x03a8
        L_0x03a7:
            r9 = r6
        L_0x03a8:
            r2 = 1
            r10 = 0
            r11 = 2
            r41 = r0
            r42 = r2
            r43 = r10
            r44 = r11
            r45 = r3
            r46 = r5
            r47 = r9
            r48 = r30
            r41.<init>(r42, r43, r44, r45, r46, r47, r48)
            ahld r2 = new ahld
            r2.<init>(r1, r0, r7)
            r7.o = r2
        L_0x03c5:
            ahiu r0 = new ahiu
            ahli r2 = r7.aI
            ahld r3 = r7.o
            r41 = r0
            r42 = r32
            r43 = r35
            r44 = r36
            r45 = r38
            r46 = r2
            r47 = r3
            r41.<init>(r42, r43, r44, r45, r46, r47)
            r7.l = r0
            ahiw r0 = new ahiw
            ahli r2 = r7.aI
            ahjw r3 = r7.n
            ahld r5 = r7.o
            r41 = r0
            r46 = r2
            r47 = r3
            r48 = r5
            r41.<init>(r42, r43, r44, r45, r46, r47, r48)
            r7.m = r0
            ahzs r0 = new ahzs
            r0.<init>(r6)
            r7.ay = r0
            ahla r0 = new ahla
            ahup r2 = defpackage.ahup.ACCELEROMETER
            r0.<init>(r2, r8, r4, r1)
            r7.r = r0
            ahla r0 = new ahla
            ahup r2 = defpackage.ahup.BAROMETER
            r0.<init>(r2, r8, r4, r1)
            r7.s = r0
            double r0 = java.lang.Math.random()
            axwx r2 = defpackage.axwx.a
            axwy r2 = r2.a()
            double r2 = r2.trackActivityPowerModeTimeProb()
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x0420
            r9 = 1
            goto L_0x0421
        L_0x0420:
            r9 = 0
        L_0x0421:
            r7.aL = r9
            long r0 = android.os.SystemClock.elapsedRealtime()
            r7.aM = r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            r7.aN = r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            r7.ab = r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            r7.ac = r0
            aibh r0 = r30.x()
            aqek r0 = r0.a()     // Catch:{ IOException -> 0x046e, IllegalArgumentException -> 0x046c }
            boolean r1 = defpackage.axwx.b()     // Catch:{ IOException -> 0x046e, IllegalArgumentException -> 0x046c }
            if (r1 == 0) goto L_0x0453
            r1 = 1
            boolean r0 = r0.a((int) r1)     // Catch:{ IOException -> 0x046e, IllegalArgumentException -> 0x046c }
            r1 = 0
            r7.a((boolean) r0, (boolean) r1)     // Catch:{ IOException -> 0x046e, IllegalArgumentException -> 0x046c }
            goto L_0x0457
        L_0x0453:
            r1 = 0
            r7.a((boolean) r1, (boolean) r1)     // Catch:{ IOException -> 0x046e, IllegalArgumentException -> 0x046c }
        L_0x0457:
            boolean r0 = Z     // Catch:{ IOException -> 0x046e, IllegalArgumentException -> 0x046c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x046e, IllegalArgumentException -> 0x046c }
            r2 = 33
            r1.<init>(r2)     // Catch:{ IOException -> 0x046e, IllegalArgumentException -> 0x046c }
            java.lang.String r2 = "State loaded: deepStillMode="
            r1.append(r2)     // Catch:{ IOException -> 0x046e, IllegalArgumentException -> 0x046c }
            r1.append(r0)     // Catch:{ IOException -> 0x046e, IllegalArgumentException -> 0x046c }
            r1.toString()     // Catch:{ IOException -> 0x046e, IllegalArgumentException -> 0x046c }
            goto L_0x046f
        L_0x046c:
            r0 = move-exception
            goto L_0x046f
        L_0x046e:
            r0 = move-exception
        L_0x046f:
            ahjr r0 = new ahjr
            boolean r1 = Z
            r0.<init>(r1)
            r7.y = r0
            boolean r0 = r40.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahix.<init>(ahjc, aizl, aizm, aiwm, ajqq, aizy, aizz, aicn, ajaa, ajbf, ajbg, boolean, ajbi, ajbi, aixl, ajaj, ajam, aiap, ajao):void");
    }

    public static ActivityRecognitionResult a(ActivityRecognitionResult activityRecognitionResult, int i2) {
        ahin ahin = new ahin();
        ahin.c = activityRecognitionResult.c;
        ahin.b = activityRecognitionResult.b;
        ahin.a.addAll(activityRecognitionResult.a);
        ahin.g = activityRecognitionResult.c();
        ahin.d = 4;
        ahin.e = 50;
        ahin.f = i2;
        TreeMap treeMap = new TreeMap();
        List list = ahin.a;
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            DetectedActivity detectedActivity = (DetectedActivity) list.get(i4);
            if (ahin.d == null || detectedActivity.a() != ahin.d.intValue()) {
                i3 += detectedActivity.e;
                treeMap.put(Integer.valueOf(detectedActivity.a()), Integer.valueOf(detectedActivity.e));
            }
        }
        double d2 = (double) i3;
        double d3 = (double) (100 - ahin.e);
        Double.isNaN(d2);
        Double.isNaN(d3);
        List a2 = ahin.a(treeMap, d2 / d3, false);
        Integer num = ahin.d;
        if (num != null) {
            a2.add(0, new DetectedActivity(num.intValue(), ahin.e));
        }
        Collections.sort(a2, ahin.h);
        return new ActivityRecognitionResult(a2, ahin.b, ahin.c, ahin.f, ahin.g);
    }

    private final long d(long j2) {
        return l() ? Math.max(axwx.a.a().activityPowerSaveModeMinIntervalMillis(), j2) : j2;
    }

    private final aibh x() {
        File file;
        SecretKey a2 = this.aC.a();
        byte[] b2 = this.aC.b();
        aqem aqem = ajck.cc;
        File filesDir = ((aiwu) this.i).a.getFilesDir();
        if (filesDir != null) {
            file = new File(filesDir, "nlp_acd");
        } else {
            file = null;
        }
        return new aibh(1, a2, 2, b2, aqem, file, this);
    }

    public final void a(ajah ajah) {
    }

    public final boolean a(aqek aqek) {
        return true;
    }

    public final void b(int i2) {
        this.aF.l = i2;
    }

    public final ActivityRecognitionResult c(ActivityRecognitionResult activityRecognitionResult) {
        boolean z2;
        int a2 = activityRecognitionResult.a().a();
        long j2 = activityRecognitionResult.c;
        if (a2 == 0) {
            z2 = true;
        } else {
            z2 = a2 == 1 || a2 == 2;
        }
        aibl aibl = this.w;
        if (aibl == null || j2 - this.x >= 90000 || aibl.a < 0.7d || aibl.b != 1 || !z2 || a2 == 2) {
            return activityRecognitionResult;
        }
        StringBuilder sb = new StringBuilder(126);
        sb.append("correctActivityByTravelMode: activity ");
        sb.append(a2);
        sb.append(" is inconsistent with travel mode. Add UNKNOWN as the most probable activity.");
        sb.toString();
        return a(activityRecognitionResult, activityRecognitionResult.d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r3.J;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r3 = this;
            boolean r0 = r3.d()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0015
            aizv r0 = r3.J
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            return r1
        L_0x0014:
            goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahix.e():boolean");
    }

    public final boolean f() {
        aizv aizv = this.J;
        if (aizv != null) {
            aizv.b();
        }
        if (e()) {
            if (SystemClock.elapsedRealtime() - this.ap >= k() - ((this.K.a / 1000000) + 1500)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void g() {
        if (!a(9) && this.Y != null) {
            this.Y = null;
        }
    }

    public final ahpe h() {
        if (d() && this.aH == null) {
            try {
                this.aH = new ahpe(this.i);
            } catch (IOException e2) {
            }
        }
        return this.aH;
    }

    /* access modifiers changed from: package-private */
    public final long i() {
        if (this.p || !this.X.containsKey(9)) {
            return Long.MAX_VALUE;
        }
        return d(((Long) this.X.get(9)).longValue());
    }

    /* access modifiers changed from: package-private */
    public final long j() {
        if (!this.p || !this.X.containsKey(9)) {
            return Long.MAX_VALUE;
        }
        return d(((Long) this.X.get(9)).longValue());
    }

    /* access modifiers changed from: package-private */
    public final long k() {
        if (this.p || !this.I) {
            return Long.MAX_VALUE;
        }
        return d(ayfc.a.a().sleepActivityDetectionIntervalMillis());
    }

    public final boolean l() {
        return !this.ae && this.ad;
    }

    /* access modifiers changed from: package-private */
    public final void m() {
        ahiw ahiw = this.m;
        double d2 = ahiw.v;
        StringBuilder sb = new StringBuilder(51);
        sb.append("accelFifoSizeSufficiency = ");
        sb.append(d2);
        sb.toString();
        double nextDouble = ahiw.x.nextDouble();
        double d3 = ahiw.w;
        this.aE = nextDouble < d3 + (ahiw.v * (1.0d - d3));
    }

    /* access modifiers changed from: package-private */
    public final void n() {
        if (this.t != null) {
            this.k.a(ajbe.ACTIVITY_DETECTION);
            this.t = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final long o() {
        long min = Math.min(this.U, this.V);
        for (Long longValue : this.X.values()) {
            long longValue2 = longValue.longValue();
            if (longValue2 < min) {
                min = longValue2;
            }
        }
        return Math.min(min, k());
    }

    public final void q() {
        if (this.aL) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (o() <= 300000) {
                if (this.aa) {
                    this.f.a("ar", "ar_power_mode_2", "low_power_mode_millis", elapsedRealtime - this.aM);
                } else {
                    this.f.a("ar", "ar_power_mode_2", "full_power_mode_millis", elapsedRealtime - this.aM);
                }
            }
            this.aM = elapsedRealtime;
            if (elapsedRealtime - this.aN >= 21600000) {
                ahpz.a(elapsedRealtime);
                this.aN = elapsedRealtime;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final Map r() {
        Set<aizo> a2;
        aiwm aiwm = this.aw;
        HashMap hashMap = null;
        if (!(aiwm == null || (a2 = aiwm.a()) == null)) {
            hashMap = new HashMap();
            hashMap.put("total", Integer.valueOf(a2.size()));
            int i2 = 0;
            int i3 = 0;
            for (aizo a3 : a2) {
                ahmd a4 = ahme.a(a3);
                if (a4.b()) {
                    i2++;
                }
                if (a4.a()) {
                    i3++;
                }
            }
            hashMap.put("possible", Integer.valueOf(i2));
            hashMap.put("car", Integer.valueOf(i3));
        }
        return hashMap;
    }

    public final void s() {
        ajar ajar = this.aF;
        aizy aizy = ajar.c;
        ajar.i = SystemClock.elapsedRealtime();
        aizy aizy2 = ajar.c;
        ajar.j = System.currentTimeMillis();
        ajar d2 = this.aF.clone();
        List<ActivityRecognitionResult> b2 = d2.b();
        if (!b2.isEmpty()) {
            for (ActivityRecognitionResult b3 : b2) {
                b(b3);
            }
        }
        a((ahzw) d2);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.ak = elapsedRealtime;
        this.al = elapsedRealtime;
        this.q.B();
        ajar ajar2 = this.aF;
        ajar2.d.clear();
        ajar2.i = -1;
        ajar2.j = -1;
        ajar2.k = -1;
        if (!ajar2.f.isEmpty()) {
            Map.Entry lastEntry = ajar2.f.lastEntry();
            amrl.a((Object) lastEntry);
            ajar2.f.clear();
            ajar2.f.put((Long) lastEntry.getKey(), (List) lastEntry.getValue());
        }
    }

    public final boolean t() {
        return this.B.a(new ajae(this.aG));
    }

    public final boolean u() {
        if (this.B.b()) {
            if (aA.contains(Build.DEVICE)) {
                if (((long) this.B.f()) >= axyr.a.a().chreArTransitionMinVersionAbms()) {
                    return true;
                }
                return false;
            } else if (((long) this.B.f()) >= axyr.a.a().chreArTransitionMinVersion()) {
                return true;
            }
        }
        return false;
    }

    public final ahox v() {
        if (!ayee.b() || !this.as) {
            return null;
        }
        ahox ahox = this.ax;
        if (ahox != null) {
            return ahox;
        }
        this.h.a(aico.PERSONALIZATION_ENABLED_FIT_CLIENT);
        return new ahox(ahoy.a());
    }

    public final void w() {
        ajao ajao = this.av;
        if (ajao != null && ajao.c) {
            ajao.b();
        }
    }

    public final void b(long j2) {
        a(new aiac(j2, 0));
    }

    public final void p() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ActivityRecognitionResult activityRecognitionResult = new ActivityRecognitionResult(new DetectedActivity(5, 100), System.currentTimeMillis(), elapsedRealtime, ahnk.HARDWARE_TILT_MANCHEGO.am, (Bundle) null);
        b(activityRecognitionResult);
        a(activityRecognitionResult);
        this.al = elapsedRealtime;
        this.q.z();
    }

    /* access modifiers changed from: package-private */
    public final void b(ActivityRecognitionResult activityRecognitionResult) {
        List list = this.D;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ahlp ahlp = (ahlp) list.get(i2);
            if (ahlw.a(activityRecognitionResult)) {
                int i3 = ahlp.a + 1;
                ahlp.a = i3;
                if (i3 > 1) {
                    ahlp.d.a(ahlp.c);
                }
            } else if (ahlw.b(activityRecognitionResult)) {
                int i4 = ahlp.b + 1;
                ahlp.b = i4;
                if (i4 > 2) {
                    ahlw ahlw = ahlp.d;
                    ahlw.a((ahlr) new ahlo(ahlw, ahlp.c));
                }
            }
        }
    }

    public final boolean d() {
        return this.I && ayfc.h() && !this.p;
    }

    public final void c(long j2) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("removeActivityDetectionInternalClient ");
        sb.append(j2);
        sb.toString();
        this.aJ.remove(Long.valueOf(j2));
        b(false, false);
    }

    public final void c(boolean z2) {
        boolean z3 = this.at;
        StringBuilder sb = new StringBuilder(58);
        sb.append("wifi connectivity status changed from = ");
        sb.append(z3);
        sb.append(" , to = ");
        sb.append(z2);
        sb.toString();
        this.at = z2;
    }

    public final boolean c() {
        return this.H && !this.C.b() && this.aE && axwi.b() && this.j.b(ahup.BAROMETER) && !this.p && this.M != null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (r7.B.d() == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        if (b() != false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(boolean r8) {
        /*
            r7 = this;
            boolean r0 = r7.c()
            if (r8 == 0) goto L_0x0008
            goto L_0x0075
        L_0x0008:
            boolean r8 = r7.aE
            if (r8 == 0) goto L_0x0075
            boolean r8 = r7.aa
            if (r8 != 0) goto L_0x0075
            boolean r8 = r7.p
            if (r8 != 0) goto L_0x003b
            axwx r8 = defpackage.axwx.a
            axwy r8 = r8.a()
            long r1 = r8.sensorBatchingNonwearableMaxPeriodMillis()
            long r3 = r7.o()
            long r5 = r7.i()
            if (r0 == 0) goto L_0x0029
            goto L_0x005b
        L_0x0029:
            ajaj r8 = r7.B
            boolean r8 = r8.d()
            if (r8 != 0) goto L_0x0036
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 <= 0) goto L_0x005b
            goto L_0x0075
        L_0x0036:
            int r8 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r8 > 0) goto L_0x0075
            goto L_0x005b
        L_0x003b:
            long r1 = r7.U
            long r3 = r7.V
            long r1 = java.lang.Math.min(r1, r3)
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 == 0) goto L_0x0054
            ajaj r8 = r7.B
            boolean r8 = r8.d()
            if (r8 == 0) goto L_0x005b
        L_0x0054:
            boolean r8 = r7.b()
            if (r8 != 0) goto L_0x005b
            goto L_0x0075
        L_0x005b:
            ahla r8 = r7.r
            int r1 = r7.af
            if (r0 != 0) goto L_0x0064
            r2 = 2500(0x9c4, float:3.503E-42)
            goto L_0x0066
        L_0x0064:
            r2 = 6500(0x1964, float:9.108E-42)
        L_0x0066:
            r8.a(r1, r2)
            if (r0 == 0) goto L_0x007a
            ahla r8 = r7.s
            int r0 = r7.ag
            r1 = 1300(0x514, float:1.822E-42)
            r8.a(r0, r1)
            return
        L_0x0075:
            ahla r8 = r7.r
            r8.a()
        L_0x007a:
            ahla r8 = r7.s
            r8.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahix.b(boolean):void");
    }

    /* access modifiers changed from: protected */
    public final void a(long j2) {
        ahle ahle = this.q;
        if (!(ahle instanceof ahkz)) {
            String.valueOf(ahle.getClass().getName()).concat(" attempt to setFirstScreenStateChangeTimeSinceLastTrigger, ignored.");
        } else {
            this.au = j2;
        }
    }

    public final void a(long j2, boolean z2) {
        StringBuilder sb = new StringBuilder(62);
        sb.append("addActivityDetectionInternalClient ");
        sb.append(j2);
        sb.append(", ");
        sb.append(z2);
        sb.toString();
        this.aJ.add(Long.valueOf(j2));
        b(true, z2);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0379, code lost:
        if (r6 >= r3.a(4)) goto L_0x039d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.ahzw r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            java.util.List r2 = r29.b()
            java.util.Iterator r2 = r2.iterator()
        L_0x000c:
            boolean r3 = r2.hasNext()
            r5 = 4
            r6 = -1
            r8 = 3
            r9 = 0
            r10 = 1
            if (r3 == 0) goto L_0x02c7
            java.lang.Object r3 = r2.next()
            com.google.android.gms.location.ActivityRecognitionResult r3 = (com.google.android.gms.location.ActivityRecognitionResult) r3
            aicn r11 = r0.h
            defpackage.ahis.a(r11, r3, r10)
            r0.u = r3
            com.google.android.gms.location.DetectedActivity r11 = r3.a()
            int r11 = r11.a()
            boolean r12 = r0.p
            if (r12 != 0) goto L_0x0032
            goto L_0x005d
        L_0x0032:
            boolean r12 = r0.aD
            r13 = 9
            if (r12 != 0) goto L_0x0056
            java.util.List r8 = r3.a
            java.util.Iterator r8 = r8.iterator()
        L_0x003e:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x005d
            java.lang.Object r12 = r8.next()
            com.google.android.gms.location.DetectedActivity r12 = (com.google.android.gms.location.DetectedActivity) r12
            if (r11 != r13) goto L_0x003e
            int r12 = r12.e
            r14 = 100
            if (r12 != r14) goto L_0x003e
            r0.a((boolean) r10)
            goto L_0x005d
        L_0x0056:
            if (r11 == r8) goto L_0x005d
            if (r11 == r13) goto L_0x005d
            r0.a((boolean) r9)
        L_0x005d:
            int[] r8 = aO
            int r12 = java.util.Arrays.binarySearch(r8, r11)
            if (r12 >= 0) goto L_0x0066
            goto L_0x006c
        L_0x0066:
            r8 = r8[r12]
            if (r8 != r11) goto L_0x006c
            r0.v = r3
        L_0x006c:
            ahku r8 = r0.Y
            if (r8 != 0) goto L_0x0071
            goto L_0x008a
        L_0x0071:
            if (r11 != 0) goto L_0x008a
            long r11 = r3.c
            ahkt r8 = r8.f
            r8.a(r11)
            r8.d = r11
            long r13 = r8.c
            int r15 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r15 == 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r8.c = r11
        L_0x0085:
            int r6 = r8.a
            int r6 = r6 + r10
            r8.a = r6
        L_0x008a:
            ahzs r6 = r0.ay
            com.google.android.gms.location.DetectedActivity r7 = r3.a()
            long r11 = r3.c
            long r13 = r6.c
            long r13 = r11 - r13
            r15 = 600000(0x927c0, double:2.964394E-318)
            int r8 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r8 < 0) goto L_0x00d0
            r6.c = r11
            r13 = -3600000(0xffffffffffc91180, double:NaN)
            long r13 = r13 + r11
            java.util.ArrayList r8 = r6.a
            int r8 = r8.size()
            r15 = 0
        L_0x00aa:
            if (r15 >= r8) goto L_0x00c2
            java.util.ArrayList r4 = r6.a
            java.lang.Object r4 = r4.get(r15)
            ahkw r4 = (defpackage.ahkw) r4
            r17 = r11
            long r10 = r4.b
            int r4 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r4 >= 0) goto L_0x00c4
            int r15 = r15 + 1
            r11 = r17
            r10 = 1
            goto L_0x00aa
        L_0x00c2:
            r17 = r11
        L_0x00c4:
            if (r15 <= 0) goto L_0x00d2
            java.util.ArrayList r4 = r6.a
            java.util.List r4 = r4.subList(r9, r15)
            r4.clear()
            goto L_0x00d2
        L_0x00d0:
            r17 = r11
        L_0x00d2:
            int r4 = r7.a()
            if (r4 == r5) goto L_0x02bf
            r5 = 5
            if (r4 == r5) goto L_0x02bf
            java.lang.String r5 = java.lang.String.valueOf(r3)
            java.lang.String r7 = java.lang.String.valueOf(r5)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r7 = r7 + 8
            r8.<init>(r7)
            java.lang.String r7 = "Adding: "
            r8.append(r7)
            r8.append(r5)
            r8.toString()
            ahkw r5 = new ahkw
            r7 = r17
            r5.<init>(r4, r7)
            java.util.ArrayList r4 = r6.a
            r4.add(r5)
            java.util.ArrayList r4 = r6.a
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x02b7
            java.util.ArrayList r4 = r6.a
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.Object r10 = r4.get(r9)
            ahkw r10 = (defpackage.ahkw) r10
            r11 = 0
            r18 = r11
            r11 = 1
        L_0x011f:
            int r12 = r4.size()
            if (r11 >= r12) goto L_0x0211
            java.lang.Object r12 = r4.get(r11)
            ahkw r12 = (defpackage.ahkw) r12
            int r14 = r11 + -1
            java.lang.Object r15 = r4.get(r14)
            ahkw r15 = (defpackage.ahkw) r15
            r20 = r14
            long r13 = r12.b
            r21 = r10
            long r9 = r15.b
            long r13 = r13 - r9
            r9 = 420000(0x668a0, double:2.075076E-318)
            int r22 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r22 <= 0) goto L_0x015f
            r9 = 210000(0x33450, double:1.03754E-318)
            r17 = r21
            r20 = r15
            r21 = r9
            ahkv r9 = defpackage.ahzs.a((defpackage.ahkw) r17, (long) r18, (defpackage.ahkw) r20, (long) r21)
            r5.add(r9)
            r9 = 210000(0x33450, double:1.03754E-318)
            r23 = r2
            r25 = r7
            r18 = r9
            r10 = r12
            goto L_0x0204
        L_0x015f:
            r10 = r21
            int r9 = r10.a
            r23 = r2
            int r2 = r12.a
            if (r2 != r9) goto L_0x016d
            r25 = r7
            goto L_0x0204
        L_0x016d:
            if (r9 == 0) goto L_0x0175
            r25 = r7
            r24 = r11
            goto L_0x01ee
        L_0x0175:
            java.util.ArrayList r2 = r6.a
            r9 = r20
            java.lang.Object r2 = r2.get(r9)
            ahkw r2 = (defpackage.ahkw) r2
            r9 = r11
            r20 = 0
            r21 = 0
            r22 = 0
        L_0x0186:
            r24 = r11
            java.util.ArrayList r11 = r6.a
            int r11 = r11.size()
            if (r9 >= r11) goto L_0x01c7
            java.util.ArrayList r11 = r6.a
            java.lang.Object r11 = r11.get(r9)
            ahkw r11 = (defpackage.ahkw) r11
            long r0 = r11.b
            r25 = r7
            long r7 = r2.b
            long r0 = r0 - r7
            r7 = 900000(0xdbba0, double:4.44659E-318)
            int r27 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r27 <= 0) goto L_0x01a7
            goto L_0x01c9
        L_0x01a7:
            int r0 = r11.a
            if (r0 == 0) goto L_0x01b8
            r1 = 1
            if (r0 == r1) goto L_0x01b5
            r1 = 2
            if (r0 == r1) goto L_0x01b2
            goto L_0x01ba
        L_0x01b2:
            int r22 = r22 + 1
            goto L_0x01ba
        L_0x01b5:
            int r21 = r21 + 1
            goto L_0x01ba
        L_0x01b8:
            int r20 = r20 + 1
        L_0x01ba:
            if (r0 == 0) goto L_0x01c9
            int r9 = r9 + 1
            r0 = r28
            r1 = r29
            r11 = r24
            r7 = r25
            goto L_0x0186
        L_0x01c7:
            r25 = r7
        L_0x01c9:
            if (r21 == 0) goto L_0x01cd
        L_0x01cb:
            r0 = -1
            goto L_0x01e9
        L_0x01cd:
            if (r22 == 0) goto L_0x01d0
            goto L_0x01cb
        L_0x01d0:
            if (r20 > 0) goto L_0x01dd
            java.util.ArrayList r0 = r6.a
            int r0 = r0.size()
            if (r9 != r0) goto L_0x01db
            goto L_0x01dd
        L_0x01db:
            r0 = -1
            goto L_0x01e9
        L_0x01dd:
            java.util.ArrayList r0 = r6.a
            int r0 = r0.size()
            if (r9 != r0) goto L_0x01e8
            int r0 = r9 + -1
            goto L_0x01e9
        L_0x01e8:
            r0 = r9
        L_0x01e9:
            r1 = -1
            if (r0 == r1) goto L_0x01ee
            r11 = r0
            goto L_0x0204
        L_0x01ee:
            r0 = 2
            long r0 = r13 / r0
            long r21 = r13 - r0
            r17 = r10
            r20 = r15
            ahkv r2 = defpackage.ahzs.a((defpackage.ahkw) r17, (long) r18, (defpackage.ahkw) r20, (long) r21)
            r5.add(r2)
            r18 = r0
            r10 = r12
            r11 = r24
        L_0x0204:
            r0 = 1
            int r11 = r11 + r0
            r0 = r28
            r1 = r29
            r2 = r23
            r7 = r25
            r9 = 0
            goto L_0x011f
        L_0x0211:
            r23 = r2
            r25 = r7
            int r0 = r4.size()
            r1 = -1
            int r0 = r0 + r1
            java.lang.Object r0 = r4.get(r0)
            r20 = r0
            ahkw r20 = (defpackage.ahkw) r20
            r21 = 210000(0x33450, double:1.03754E-318)
            r17 = r10
            ahkv r0 = defpackage.ahzs.a((defpackage.ahkw) r17, (long) r18, (defpackage.ahkw) r20, (long) r21)
            r5.add(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r5)
            long r1 = r3.b
            long r1 = r1 - r25
            java.util.Iterator r3 = r0.iterator()
        L_0x023b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x02ad
            java.lang.Object r4 = r3.next()
            ahkv r4 = (defpackage.ahkv) r4
            long r7 = r4.a
            long r9 = r4.b
            java.util.Date r5 = new java.util.Date
            long r11 = r1 + r7
            r5.<init>(r11)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.util.Date r11 = new java.util.Date
            long r12 = r4.b
            long r12 = r12 + r1
            r11.<init>(r12)
            java.lang.String r11 = java.lang.String.valueOf(r11)
            int r4 = r4.c
            java.lang.String r12 = java.lang.String.valueOf(r5)
            int r12 = r12.length()
            java.lang.String r13 = java.lang.String.valueOf(r11)
            int r13 = r13.length()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            int r12 = r12 + 138
            int r12 = r12 + r13
            r14.<init>(r12)
            java.lang.String r12 = "MergedActivity [startMillsSinceBoot="
            r14.append(r12)
            r14.append(r7)
            java.lang.String r7 = ", endMillisSinceBoot="
            r14.append(r7)
            r14.append(r9)
            java.lang.String r7 = ", start="
            r14.append(r7)
            r14.append(r5)
            java.lang.String r5 = ", end="
            r14.append(r5)
            r14.append(r11)
            java.lang.String r5 = ", activityType="
            r14.append(r5)
            r14.append(r4)
            java.lang.String r4 = "]"
            r14.append(r4)
            r14.toString()
            goto L_0x023b
        L_0x02ad:
            r6.b = r0
            r0 = r28
            r1 = r29
            r2 = r23
            goto L_0x000c
        L_0x02b7:
            r23 = r2
            r0 = r28
            r1 = r29
            goto L_0x000c
        L_0x02bf:
            r23 = r2
            r0 = r28
            r1 = r29
            goto L_0x000c
        L_0x02c7:
            boolean r0 = r29.a()
            if (r0 == 0) goto L_0x03cd
            boolean r0 = defpackage.axwx.b()
            if (r0 == 0) goto L_0x03bc
            r0 = r28
            ahjr r1 = r0.y
            long r2 = r29.c()
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x02e8
            boolean r1 = r1.a()
            r4 = r29
            r7 = 0
            goto L_0x03b6
        L_0x02e8:
            long r6 = r1.d
            r9 = -480000(0xfffffffffff8ad00, double:NaN)
            long r2 = r2 + r9
            long r2 = java.lang.Math.max(r2, r6)
            r4 = r29
            java.util.List r2 = r4.a((long) r2)
            boolean r3 = r1.a()
            java.util.Iterator r2 = r2.iterator()
        L_0x0300:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x03b4
            java.lang.Object r3 = r2.next()
            com.google.android.gms.location.ActivityRecognitionResult r3 = (com.google.android.gms.location.ActivityRecognitionResult) r3
            java.util.List r6 = r3.a
            int r7 = r6.size()
            r9 = 1
            if (r7 != r9) goto L_0x0350
            r7 = 0
            java.lang.Object r6 = r6.get(r7)
            com.google.android.gms.location.DetectedActivity r6 = (com.google.android.gms.location.DetectedActivity) r6
            int r6 = r6.a()
            int[] r7 = defpackage.ahjr.a
            int r9 = r7.length
            r10 = 0
        L_0x0324:
            if (r10 >= r9) goto L_0x0332
            r11 = r7[r10]
            if (r6 == r11) goto L_0x032d
            int r10 = r10 + 1
            goto L_0x0324
        L_0x032d:
            boolean r3 = r1.a()
            goto L_0x0300
        L_0x0332:
            r7 = 15
            if (r6 > r7) goto L_0x0337
            goto L_0x0350
        L_0x0337:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 42
            r2.<init>(r3)
            java.lang.String r3 = "Unable to handle new activity: "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0350:
            long r6 = r3.c
            r1.d = r6
            int r6 = r3.a((int) r8)
            r7 = 60
            if (r6 >= r7) goto L_0x0383
            int r6 = r3.a((int) r8)
            r7 = 0
            int r9 = r3.a((int) r7)
            if (r6 < r9) goto L_0x037e
            r9 = 1
            int r10 = r3.a((int) r9)
            if (r6 < r10) goto L_0x037c
            r9 = 2
            int r10 = r3.a((int) r9)
            if (r6 < r10) goto L_0x037f
            int r3 = r3.a((int) r5)
            if (r6 < r3) goto L_0x037f
            goto L_0x039d
        L_0x037c:
            r9 = 2
            goto L_0x037f
        L_0x037e:
            r9 = 2
        L_0x037f:
            r1.b()
            goto L_0x039d
        L_0x0383:
            r7 = 0
            r9 = 2
            com.google.android.gms.location.ActivityRecognitionResult r6 = r1.b
            if (r6 == 0) goto L_0x038a
            goto L_0x038c
        L_0x038a:
            r1.b = r3
        L_0x038c:
            r1.c = r3
            int r3 = r1.e
            r6 = 1
            int r3 = r3 + r6
            r1.e = r3
            boolean r3 = r1.a()
            if (r3 == 0) goto L_0x039d
            r3 = 1
            goto L_0x0300
        L_0x039d:
            int r3 = r1.e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r10 = 54
            r6.<init>(r10)
            java.lang.String r10 = "shouldSwitchToDeepStill: consecutiveStills="
            r6.append(r10)
            r6.append(r3)
            r6.toString()
            r3 = 0
            goto L_0x0300
        L_0x03b4:
            r7 = 0
            r1 = r3
        L_0x03b6:
            if (r1 == 0) goto L_0x03ba
            r9 = 1
            goto L_0x03c2
        L_0x03ba:
            r9 = 0
            goto L_0x03c2
        L_0x03bc:
            r0 = r28
            r4 = r29
            r7 = 0
            r9 = 0
        L_0x03c2:
            boolean r1 = Z
            if (r1 != r9) goto L_0x03c7
            goto L_0x03d1
        L_0x03c7:
            r1 = 1
            r0.a((boolean) r9, (boolean) r1)
            goto L_0x03d1
        L_0x03cd:
            r0 = r28
            r4 = r29
        L_0x03d1:
            ahjc r1 = r0.e
            r1.a((defpackage.ahzw) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahix.a(ahzw):void");
    }

    public final void b(boolean z2, boolean z3) {
        long j2;
        long j3;
        long j4;
        boolean z4 = z3;
        q();
        long j5 = this.U;
        long j6 = this.aK;
        long j7 = this.V;
        if (this.aJ.isEmpty() && this.Q == 0) {
            this.U = Long.MAX_VALUE;
            this.aK = Long.MAX_VALUE;
        } else {
            if (!this.aJ.isEmpty()) {
                String valueOf = String.valueOf(this.aJ);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("has internal client: ");
                sb.append(valueOf);
                sb.toString();
                long longValue = ((Long) this.aJ.peek()).longValue();
                this.U = Math.min(this.S, longValue);
                if (axwx.a.a().arBatchingApiLatencyFixRollback()) {
                    this.aK = Math.min(this.aK, longValue);
                } else {
                    j4 = Math.min(this.T, longValue);
                }
            } else {
                this.U = this.S;
                j4 = this.T;
            }
            this.aK = j4;
        }
        long d2 = d(this.U);
        this.U = d2;
        long max = Math.max(this.aK, d2);
        this.aK = max;
        if (max != Long.MAX_VALUE) {
            long j8 = this.U;
            if (j8 != 0) {
                if (j8 != 0) {
                    this.aK = j8 * Math.min(80, max / j8);
                } else {
                    this.aK = 4000;
                }
            }
        }
        if (!this.R.isEmpty()) {
            j2 = ((Long) this.R.peek()).longValue();
            this.V = j2;
        } else {
            this.V = Long.MAX_VALUE;
            j2 = Long.MAX_VALUE;
        }
        this.V = d(j2);
        boolean d3 = this.B.d();
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("hardwareArDetector.isEnabled(): ");
        sb2.append(d3);
        sb2.toString();
        if (this.B.d()) {
            long hardwareActivityMinPeriodMillis = axwl.a.a().hardwareActivityMinPeriodMillis();
            long j9 = this.aK;
            long j10 = this.U;
            long j11 = this.V;
            j3 = j7;
            StringBuilder sb3 = new StringBuilder(236);
            sb3.append("hardwareArDetector.hardwareActivityMinPeriodMillis() =  ");
            sb3.append(hardwareActivityMinPeriodMillis);
            sb3.append(", hardwareArDetector.maxReportLatencyMillis() = ");
            sb3.append(j9);
            sb3.append(", minPeriodMillis = ");
            sb3.append(j10);
            sb3.append(", minPeriodTiltDetectorMillis = ");
            sb3.append(j11);
            sb3.toString();
            if (axwf.b()) {
                long max2 = Math.max(hardwareActivityMinPeriodMillis, this.aK);
                this.U = max2;
                StringBuilder sb4 = new StringBuilder(39);
                sb4.append("minPeriodMillis =  ");
                sb4.append(max2);
                sb4.toString();
            } else {
                long max3 = Math.max(hardwareActivityMinPeriodMillis, this.U);
                this.U = max3;
                StringBuilder sb5 = new StringBuilder(51);
                sb5.append("minPeriodMillis no batching =  ");
                sb5.append(max3);
                sb5.toString();
            }
            this.V = Math.max(hardwareActivityMinPeriodMillis, this.V);
        } else {
            j3 = j7;
        }
        Locale locale = Locale.ENGLISH;
        Boolean valueOf2 = Boolean.valueOf(z3);
        Object[] objArr = {Long.valueOf(this.U), Long.valueOf(this.aK), Long.valueOf(this.V), Boolean.valueOf(z2), valueOf2, Integer.valueOf(this.aJ.size()), Integer.valueOf(this.R.size()), Integer.valueOf(this.Q)};
        long o2 = o();
        StringBuilder sb6 = new StringBuilder(46);
        sb6.append("overallMinPeriodMillis =  ");
        sb6.append(o2);
        sb6.toString();
        if (o() == Long.MAX_VALUE) {
            if (this.aG.isEmpty() && !axwx.a.a().arDisallowActivityDetectionDisable()) {
                this.q.s();
            }
        } else if (z2) {
            Locale locale2 = Locale.ENGLISH;
            new Object[1][0] = valueOf2;
            this.q.a(z4);
        }
        long j12 = this.U;
        if (j5 != j12 || j6 != this.aK || j3 != this.V || z4) {
            aicn aicn = this.h;
            long j13 = this.aK;
            long j14 = this.V;
            long j15 = j14;
            ahja ahja = r1;
            ahja ahja2 = new ahja(aico.SET_ACTIVITY_PERIOD, aicn.b(), Long.toHexString(j13), (int) j12, (int) j14, z3 ? 1 : 0, j12, j13, j15, z3);
            aicn.a((aicl) ahja);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = r3.av;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() {
        /*
            r3 = this;
            boolean r0 = r3.p
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0018
            r0 = 9
            boolean r0 = r3.a((int) r0)
            if (r0 == 0) goto L_0x0018
            ajao r0 = r3.av
            if (r0 == 0) goto L_0x0019
            boolean r0 = r0.c
            if (r0 == 0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            return r1
        L_0x0018:
            r1 = 0
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahix.b():boolean");
    }

    /* access modifiers changed from: package-private */
    public final void a(aiac aiac) {
        aiac aiac2 = this.t;
        if (aiac2 == null || !aiac2.equals(aiac)) {
            this.t = aiac;
            if (!ayfc.a.a().setAllowIdleAlarmForSleep() || !e()) {
                long j2 = aiac.a;
                String valueOf = String.valueOf(new Date(ajbt.e() + aiac.a));
                long j3 = aiac.b;
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 69);
                sb.append("Alarm set to: ");
                sb.append(j2);
                sb.append(" ");
                sb.append(valueOf);
                sb.append(" windowLength=");
                sb.append(j3);
                sb.toString();
                this.k.a(ajbe.ACTIVITY_DETECTION, aiac.a, aiac.b, this.W.c);
                return;
            }
            ajbg ajbg = this.k;
            ajbe ajbe = ajbe.ACTIVITY_DETECTION;
            long j4 = aiac.a;
            aizx aizx = this.W.c;
            ajbg.a(ajbe, j4);
        }
    }

    public final void a(ajai ajai) {
        ajar ajar = this.aF;
        if (ajai != null) {
            if (ajar.m != -1) {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(ajai.a - ajar.m);
                ajar.n = seconds;
                StringBuilder sb = new StringBuilder(40);
                sb.append("Audio lag in secs = ");
                sb.append(seconds);
                sb.toString();
            }
            ajar.m = ajai.a;
        }
    }

    public final void a(ActivityRecognitionResult activityRecognitionResult) {
        a((ahzw) new aibi(activityRecognitionResult));
    }

    public final void a(FloorChangeEvent floorChangeEvent) {
        this.e.a(Collections.singletonList(floorChangeEvent));
        ahjb.a(this.h, floorChangeEvent);
    }

    public final void a(List list) {
        if (this.B.e()) {
            ajar ajar = this.aF;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ajag ajag = (ajag) it.next();
                if (ajag.c != 0) {
                    long j2 = ajag.a;
                    int i2 = ajag.b;
                    if (i2 != 5 && ajar.e.remove(Integer.valueOf(i2))) {
                        ajar.f.put(Long.valueOf(j2), Collections.unmodifiableList(ajar.a((Collection) ajar.e)));
                    }
                } else {
                    long j3 = ajag.a;
                    int i3 = ajag.b;
                    if (i3 == 5) {
                        ajar.d.a(j3);
                    } else if (ajar.e.add(Integer.valueOf(i3))) {
                        ajar.f.put(Long.valueOf(j3), Collections.unmodifiableList(ajar.a((Collection) ajar.e)));
                    }
                }
                aizy aizy = ajar.c;
                ajar.k = SystemClock.elapsedRealtime();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01e0, code lost:
        if (r14 != 17) goto L_0x0221;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List r19, int[] r20) {
        /*
            r18 = this;
            r0 = r19
            r1 = r18
            r2 = r20
            ajar r3 = r1.aF
            ajaq r4 = r3.g
            boolean r5 = r4.b
            r11 = 1120403456(0x42c80000, float:100.0)
            r12 = 1
            if (r5 == 0) goto L_0x017e
            r5 = -1
            r13 = -1
            r14 = 0
            r15 = -1
        L_0x0015:
            int r6 = r2.length
            if (r14 >= r6) goto L_0x0026
            r6 = r2[r14]
            if (r6 != r12) goto L_0x001e
            r15 = r14
            goto L_0x0022
        L_0x001e:
            r12 = 4
            if (r6 != r12) goto L_0x0022
            r13 = r14
        L_0x0022:
            int r14 = r14 + 1
            r12 = 1
            goto L_0x0015
        L_0x0026:
            boolean r6 = r19.isEmpty()
            if (r6 == 0) goto L_0x002e
            goto L_0x017f
        L_0x002e:
            if (r15 != r5) goto L_0x0032
            goto L_0x017f
        L_0x0032:
            if (r13 == r5) goto L_0x017e
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r6 = 0
            r12 = 0
            r14 = 0
        L_0x003c:
            int r7 = r19.size()
            if (r6 >= r7) goto L_0x00f7
            java.lang.Object r7 = r0.get(r6)
            ajaf r7 = (defpackage.ajaf) r7
            java.lang.String r8 = java.lang.String.valueOf(r7)
            java.lang.String r16 = java.lang.String.valueOf(r8)
            int r16 = r16.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r10 = r16 + 18
            r9.<init>(r10)
            java.lang.String r10 = "received sample = "
            r9.append(r10)
            r9.append(r8)
            r9.toString()
            float[] r7 = r7.b
            r8 = 0
            r9 = 0
        L_0x006a:
            int r10 = r7.length
            if (r8 < r10) goto L_0x0082
            r7 = r7[r15]
            float r7 = r7 * r11
            int r7 = java.lang.Math.round(r7)
            if (r7 >= r9) goto L_0x0078
            goto L_0x007f
        L_0x0078:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r5.add(r7)
        L_0x007f:
            int r6 = r6 + 1
            goto L_0x003c
        L_0x0082:
            r10 = r7[r8]
            r16 = 0
            int r17 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r17 <= 0) goto L_0x00eb
            float r10 = r10 * r11
            int r10 = java.lang.Math.round(r10)
            r11 = r2[r8]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r17 = r6
            r6 = 82
            r1.<init>(r6)
            java.lang.String r6 = "confidence = "
            r1.append(r6)
            r1.append(r10)
            java.lang.String r6 = ", index = "
            r1.append(r6)
            r1.append(r8)
            java.lang.String r6 = ", activityDictionary[i] = "
            r1.append(r6)
            r1.append(r11)
            r1.toString()
            if (r10 <= r9) goto L_0x00ba
            r9 = r10
            goto L_0x00bb
        L_0x00ba:
        L_0x00bb:
            java.lang.Integer r1 = r4.e
            int r1 = r1.intValue()
            if (r10 < r1) goto L_0x00d1
            r1 = r2[r8]
            r6 = 7
            if (r1 != r6) goto L_0x00c9
        L_0x00c8:
            goto L_0x00ce
        L_0x00c9:
            r6 = 8
            if (r1 == r6) goto L_0x00c8
            goto L_0x00d1
        L_0x00ce:
            int r12 = r12 + 1
            goto L_0x00ed
        L_0x00d1:
            java.lang.Integer r1 = r4.g
            int r1 = r1.intValue()
            if (r10 >= r1) goto L_0x00da
        L_0x00d9:
            goto L_0x00ed
        L_0x00da:
            r1 = r2[r8]
            r6 = 16
            if (r1 != r6) goto L_0x00e1
        L_0x00e0:
            goto L_0x00e8
        L_0x00e1:
            r6 = 17
            if (r1 == r6) goto L_0x00e0
            if (r1 == 0) goto L_0x00e0
            goto L_0x00d9
        L_0x00e8:
            int r14 = r14 + 1
            goto L_0x00ed
        L_0x00eb:
            r17 = r6
        L_0x00ed:
            int r8 = r8 + 1
            r1 = r18
            r6 = r17
            r11 = 1120403456(0x42c80000, float:100.0)
            goto L_0x006a
        L_0x00f7:
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r6 = java.lang.String.valueOf(r1)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r6 = r6 + 75
            r7.<init>(r6)
            java.lang.String r6 = "on foot count = "
            r7.append(r6)
            r7.append(r12)
            java.lang.String r6 = ", vehicle count = "
            r7.append(r6)
            r7.append(r14)
            java.lang.String r6 = ", biking indices = "
            r7.append(r6)
            r7.append(r1)
            r7.toString()
            java.lang.Integer r1 = r4.f
            int r1 = r1.intValue()
            if (r12 >= r1) goto L_0x0138
            java.lang.Integer r1 = r4.h
            int r1 = r1.intValue()
            if (r14 < r1) goto L_0x0136
            goto L_0x0139
        L_0x0136:
            r5 = 0
            goto L_0x0139
        L_0x0138:
        L_0x0139:
            if (r5 == 0) goto L_0x017e
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L_0x017e
            java.util.ArrayList r1 = new java.util.ArrayList
            int r4 = r19.size()
            r1.<init>(r4)
            r4 = 0
        L_0x014b:
            int r6 = r19.size()
            if (r4 >= r6) goto L_0x017c
            java.lang.Object r6 = r0.get(r4)
            ajaf r6 = (defpackage.ajaf) r6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            boolean r7 = r5.contains(r7)
            if (r7 == 0) goto L_0x0176
            float[] r7 = r6.b
            r8 = r7[r15]
            r9 = r7[r13]
            r7[r15] = r9
            r7[r13] = r8
            ajaf r8 = new ajaf
            long r9 = r6.a
            r8.<init>(r9, r7)
            r1.add(r8)
            goto L_0x0179
        L_0x0176:
            r1.add(r6)
        L_0x0179:
            int r4 = r4 + 1
            goto L_0x014b
        L_0x017c:
            r0 = r1
            goto L_0x017f
        L_0x017e:
        L_0x017f:
            int r1 = r0.size()
            r4 = 0
        L_0x0184:
            if (r4 >= r1) goto L_0x029e
            java.lang.Object r5 = r0.get(r4)
            ajaf r5 = (defpackage.ajaf) r5
            float[] r6 = r5.b
            int r7 = r6.length
            int r8 = r2.length
            if (r7 != r8) goto L_0x0194
            r9 = 1
            goto L_0x0195
        L_0x0194:
            r9 = 0
        L_0x0195:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r11 = 65
            r10.<init>(r11)
            java.lang.String r11 = "sample size doesn't match, expect "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = " but see "
            r10.append(r8)
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            defpackage.amrl.a((boolean) r9, (java.lang.Object) r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x01bb:
            int r11 = r6.length
            if (r8 >= r11) goto L_0x0232
            r11 = r6[r8]
            r12 = 0
            int r13 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r13 <= 0) goto L_0x022c
            r13 = 1120403456(0x42c80000, float:100.0)
            float r11 = r11 * r13
            int r11 = java.lang.Math.round(r11)
            r14 = r2[r8]
            r15 = 7
            if (r14 != r15) goto L_0x01d3
            goto L_0x0202
        L_0x01d3:
            r12 = 8
            if (r14 == r12) goto L_0x0202
            r12 = 16
            if (r14 != r12) goto L_0x01de
            r12 = 17
            goto L_0x01e3
        L_0x01de:
            r12 = 17
            if (r14 == r12) goto L_0x01e3
            goto L_0x0221
        L_0x01e3:
            int r14 = r3.l
            ahnk r12 = defpackage.ahnk.CHRE_DNN_GRU_V1
            int r12 = r12.am
            if (r14 == r12) goto L_0x01fd
            int r12 = r3.l
            ahnk r14 = defpackage.ahnk.CHRE_DNN_V2
            int r14 = r14.am
            if (r12 == r14) goto L_0x01fd
            int r12 = r3.l
            ahnk r14 = defpackage.ahnk.CHRE_CNN_GRU_V1
            int r14 = r14.am
            if (r12 == r14) goto L_0x01fd
            int r10 = r10 + r11
            goto L_0x0221
        L_0x01fd:
            int r10 = java.lang.Math.max(r10, r11)
            goto L_0x0221
        L_0x0202:
            int r12 = r3.l
            ahnk r14 = defpackage.ahnk.CHRE_DNN_GRU_V1
            int r14 = r14.am
            if (r12 == r14) goto L_0x021c
            int r12 = r3.l
            ahnk r14 = defpackage.ahnk.CHRE_DNN_V2
            int r14 = r14.am
            if (r12 == r14) goto L_0x021c
            int r12 = r3.l
            ahnk r14 = defpackage.ahnk.CHRE_CNN_GRU_V1
            int r14 = r14.am
            if (r12 == r14) goto L_0x021c
            int r9 = r9 + r11
            goto L_0x0220
        L_0x021c:
            int r9 = java.lang.Math.max(r9, r11)
        L_0x0220:
        L_0x0221:
            com.google.android.gms.location.DetectedActivity r12 = new com.google.android.gms.location.DetectedActivity
            r14 = r2[r8]
            r12.<init>(r14, r11)
            r7.add(r12)
            goto L_0x022f
        L_0x022c:
            r13 = 1120403456(0x42c80000, float:100.0)
            r15 = 7
        L_0x022f:
            int r8 = r8 + 1
            goto L_0x01bb
        L_0x0232:
            r13 = 1120403456(0x42c80000, float:100.0)
            r15 = 7
            if (r9 <= 0) goto L_0x0240
            com.google.android.gms.location.DetectedActivity r6 = new com.google.android.gms.location.DetectedActivity
            r8 = 2
            r6.<init>(r8, r9)
            r7.add(r6)
        L_0x0240:
            if (r10 > 0) goto L_0x0244
            r8 = 0
            goto L_0x024d
        L_0x0244:
            com.google.android.gms.location.DetectedActivity r6 = new com.google.android.gms.location.DetectedActivity
            r8 = 0
            r6.<init>(r8, r10)
            r7.add(r6)
        L_0x024d:
            java.util.Comparator r6 = com.google.android.gms.location.DetectedActivity.a
            java.util.Collections.sort(r7, r6)
            java.util.TreeMap r6 = r3.f
            long r9 = r5.a
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r6.put(r9, r7)
            aizy r6 = r3.c
            long r9 = android.os.SystemClock.elapsedRealtime()
            r3.k = r9
            java.lang.String r6 = java.lang.String.valueOf(r7)
            float[] r5 = r5.b
            java.lang.String r5 = java.util.Arrays.toString(r5)
            java.lang.String r7 = java.lang.String.valueOf(r6)
            int r7 = r7.length()
            java.lang.String r9 = java.lang.String.valueOf(r5)
            int r9 = r9.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r7 = r7 + 23
            int r7 = r7 + r9
            r10.<init>(r7)
            java.lang.String r7 = "addSamples->"
            r10.append(r7)
            r10.append(r6)
            java.lang.String r6 = ", rawArray="
            r10.append(r6)
            r10.append(r5)
            r10.toString()
            int r4 = r4 + 1
            goto L_0x0184
        L_0x029e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahix.a(java.util.List, int[]):void");
    }

    public final void a(Map map) {
        if (map == null) {
            map = Collections.emptyMap();
        }
        this.aG = map;
        if (this.B.b()) {
            t();
            if (this.aG.isEmpty()) {
                b(false, false);
            }
        }
    }

    public final void a(boolean z2) {
        StringBuilder sb = new StringBuilder(24);
        sb.append("setIsWatchOffBody(");
        sb.append(z2);
        sb.append(")");
        sb.toString();
        this.aD = z2;
    }

    public final void a(boolean z2, int i2, aiaf aiaf) {
        if (i2 == 1) {
            this.q.v();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("Set deep still mode: ");
        sb.append(z2);
        sb.toString();
        Z = z2;
        if (z3) {
            aibh x2 = x();
            aqek aqek = new aqek(ajck.cc);
            aqek.b(1, Z);
            try {
                x2.a(aqek);
            } catch (IOException e2) {
            }
        }
        StringBuilder sb2 = new StringBuilder(61);
        sb2.append("Notify the deep still change listeners. deepStillMode = ");
        sb2.append(z2);
        sb2.toString();
        List list = this.aq;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ahji) list.get(i2)).a(z2);
        }
        if (!z2) {
            ajqq ajqq = this.aB;
            if (ajqq != null) {
                ajqq.a("com.google.android.location.activity.DEEP_STILL_MODE_DISABLED");
            }
            this.h.a(aico.DEEP_STILL_MODE_OFF);
            return;
        }
        ajqq ajqq2 = this.aB;
        if (ajqq2 != null) {
            ajqq2.a("com.google.android.location.activity.DEEP_STILL_MODE_ENABLED");
        }
        this.h.a(aico.DEEP_STILL_MODE_ON);
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return Z && !f() && ((this.p && a(9) && this.aD) || !a(9));
    }

    public final boolean a(int i2) {
        return this.X.containsKey(Integer.valueOf(i2));
    }
}
