package defpackage;

import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: ahpi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahpi implements aiao {
    public static final Object a = new Object();
    public static ahpi b;
    private static final List c = Arrays.asList(new Integer[]{5, 4});
    private final ardu d = new ardu();
    private ahpl e;
    private ahpt f;
    private ActivityTransitionEvent g;
    private final aizy h;
    private final ahzz i;
    private final aicn j;
    private boolean k = false;

    public ahpi(aizy aizy, ahzz ahzz, aicn aicn) {
        this.h = aizy;
        this.i = ahzz;
        this.j = aicn;
    }

    static int a(List list, int i2) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (((ActivityTransitionEvent) list.get(i3)).b == i2) {
                return i3;
            }
        }
        return -1;
    }

    public static List b(List list) {
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            int i2 = ((ActivityTransitionEvent) list.get(list.size() - 1)).b;
            int size = list.size() - 1;
            while (size >= 0 && ((ActivityTransitionEvent) list.get(size)).b == i2) {
                arrayList.add((ActivityTransitionEvent) list.get(size));
                size--;
            }
        }
        return arrayList;
    }

    private final void c(List list) {
        boolean z;
        if (this.j == null || list == null || list.isEmpty()) {
            boolean z2 = true;
            int i2 = 0;
            if (this.j == null) {
                z = true;
            } else {
                z = false;
            }
            if (list != null) {
                z2 = false;
            }
            if (list != null) {
                i2 = list.size();
            }
            StringBuilder sb = new StringBuilder(94);
            sb.append("Not writing eventlog. eventLog is null? ");
            sb.append(z);
            sb.append(", events is null? ");
            sb.append(z2);
            sb.append(", events size= ");
            sb.append(i2);
            sb.toString();
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) it.next();
            this.j.a(aico.AR_TRANSITION_RESPONSE, activityTransitionEvent.a, activityTransitionEvent.b);
        }
    }

    private static ActivityTransitionEvent a(ActivityTransitionEvent activityTransitionEvent, long j2) {
        return new ActivityTransitionEvent(activityTransitionEvent.a, activityTransitionEvent.b == 0 ? 1 : 0, j2);
    }

    public static ActivityTransitionEvent a(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return (ActivityTransitionEvent) list.get(0);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) it.next();
            if (DetectedActivity.b(activityTransitionEvent.a)) {
                return activityTransitionEvent;
            }
        }
        String valueOf = String.valueOf(list.get(0));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 108);
        sb.append("Could not find the most exclusive activity from the list;  returning first item from list to avoid crashes: ");
        sb.append(valueOf);
        sb.toString();
        return (ActivityTransitionEvent) list.get(0);
    }

    private final void a() {
        if (this.g == null) {
            ahzz ahzz = this.i;
            int i2 = ahzz.a.getInt("current_activity_key", -1);
            long j2 = ahzz.a.getLong("current_activity_epoch_time_key", -1);
            StringBuilder sb = new StringBuilder(84);
            sb.append("getCurrentActivity: activity = ");
            sb.append(i2);
            sb.append(", epoch time millis = ");
            sb.append(j2);
            sb.toString();
            ahzy ahzy = null;
            if (!(i2 == -1 || j2 == -1)) {
                ahzy = new ahzy(i2, j2);
            }
            if (ahzy != null) {
                int i3 = ahzy.a;
                long currentTimeMillis = System.currentTimeMillis() - ahzy.b;
                StringBuilder sb2 = new StringBuilder(76);
                sb2.append("createCurrentTransitionEvent elapsedTimeApproximation = ");
                sb2.append(currentTimeMillis);
                sb2.toString();
                ActivityTransitionEvent activityTransitionEvent = new ActivityTransitionEvent(i3, 0, TimeUnit.MILLISECONDS.toNanos(currentTimeMillis));
                this.g = activityTransitionEvent;
                String valueOf = String.valueOf(activityTransitionEvent);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 57);
                sb3.append("Initialized the current activity transition from cache = ");
                sb3.append(valueOf);
                sb3.toString();
            }
        }
    }

    private final void a(int i2) {
        ahzz ahzz = this.i;
        ahzy ahzy = new ahzy(i2, System.currentTimeMillis());
        String valueOf = String.valueOf(ahzy);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56);
        sb.append("Adding the current activity to persistent store. Data = ");
        sb.append(valueOf);
        sb.toString();
        boolean z = false;
        if (ahzy.a >= 0 && ahzy.b > 0) {
            z = true;
        }
        ativ.b(z, "Invalid activity and epoch time.");
        ahzz.a.edit().putInt("current_activity_key", ahzy.a).putLong("current_activity_epoch_time_key", ahzy.b).apply();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: ardh} */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x056d, code lost:
        return null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x04aa  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0223  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List a(com.google.android.gms.location.ActivityRecognitionResult r55, boolean r56, boolean r57) {
        /*
            r54 = this;
            r1 = r54
            r0 = r55
            r2 = r56
            r3 = r57
            java.lang.Class<int> r4 = int.class
            monitor-enter(r54)
            java.lang.String r5 = java.lang.String.valueOf(r55)     // Catch:{ all -> 0x05c8 }
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x05c8 }
            int r6 = r6.length()     // Catch:{ all -> 0x05c8 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x05c8 }
            int r6 = r6 + 38
            r7.<init>(r6)     // Catch:{ all -> 0x05c8 }
            java.lang.String r6 = "current activity recognition result = "
            r7.append(r6)     // Catch:{ all -> 0x05c8 }
            r7.append(r5)     // Catch:{ all -> 0x05c8 }
            r7.toString()     // Catch:{ all -> 0x05c8 }
            if (r0 == 0) goto L_0x05c5
            r54.a()     // Catch:{ all -> 0x05c8 }
            ahpl r6 = r1.e     // Catch:{ all -> 0x05c8 }
            if (r6 == 0) goto L_0x0033
            goto L_0x0042
        L_0x0033:
            ahpl r6 = new ahpl     // Catch:{ all -> 0x05c8 }
            com.google.android.gms.location.ActivityTransitionEvent r8 = r1.g     // Catch:{ all -> 0x05c8 }
            if (r8 == 0) goto L_0x003c
            int r8 = r8.a     // Catch:{ all -> 0x05c8 }
            goto L_0x003d
        L_0x003c:
            r8 = -1
        L_0x003d:
            r6.<init>(r8)     // Catch:{ all -> 0x05c8 }
            r1.e = r6     // Catch:{ all -> 0x05c8 }
        L_0x0042:
            axxa r6 = defpackage.axxa.a     // Catch:{ all -> 0x05c8 }
            axxb r6 = r6.a()     // Catch:{ all -> 0x05c8 }
            boolean r6 = r6.arTransitionFilteringEnabled()     // Catch:{ all -> 0x05c8 }
            r8 = 1
            r9 = 0
            if (r6 == 0) goto L_0x0092
            ahpl r4 = r1.e     // Catch:{ all -> 0x05c8 }
            boolean r6 = r1.k     // Catch:{ all -> 0x05c8 }
            ahpk r2 = r4.a(r0, r3, r6, r2)     // Catch:{ all -> 0x05c8 }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x05c8 }
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x05c8 }
            int r4 = r4.length()     // Catch:{ all -> 0x05c8 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x05c8 }
            int r4 = r4 + 27
            r6.<init>(r4)     // Catch:{ all -> 0x05c8 }
            java.lang.String r4 = "Activity filter response = "
            r6.append(r4)     // Catch:{ all -> 0x05c8 }
            r6.append(r3)     // Catch:{ all -> 0x05c8 }
            r6.toString()     // Catch:{ all -> 0x05c8 }
            int r3 = r2.b     // Catch:{ all -> 0x05c8 }
            if (r3 == r8) goto L_0x008f
            com.google.android.gms.location.ActivityTransitionEvent r3 = new com.google.android.gms.location.ActivityTransitionEvent     // Catch:{ all -> 0x05c8 }
            int r2 = r2.a     // Catch:{ all -> 0x05c8 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x05c8 }
            long r6 = r0.c     // Catch:{ all -> 0x05c8 }
            long r6 = r4.toNanos(r6)     // Catch:{ all -> 0x05c8 }
            r3.<init>(r2, r9, r6)     // Catch:{ all -> 0x05c8 }
            java.util.List r0 = r1.a((com.google.android.gms.location.ActivityTransitionEvent) r3)     // Catch:{ all -> 0x05c8 }
            goto L_0x0556
        L_0x008f:
            r0 = 0
            goto L_0x0556
        L_0x0092:
            java.util.List r6 = r0.a     // Catch:{ all -> 0x05c8 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x05c8 }
            r10.<init>()     // Catch:{ all -> 0x05c8 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x05c8 }
        L_0x009d:
            boolean r11 = r6.hasNext()     // Catch:{ all -> 0x05c8 }
            if (r11 == 0) goto L_0x00b8
            java.lang.Object r11 = r6.next()     // Catch:{ all -> 0x05c8 }
            com.google.android.gms.location.DetectedActivity r11 = (com.google.android.gms.location.DetectedActivity) r11     // Catch:{ all -> 0x05c8 }
            ardq r12 = new ardq     // Catch:{ all -> 0x05c8 }
            int r13 = r11.a()     // Catch:{ all -> 0x05c8 }
            int r11 = r11.e     // Catch:{ all -> 0x05c8 }
            r12.<init>(r13, r11)     // Catch:{ all -> 0x05c8 }
            r10.add(r12)     // Catch:{ all -> 0x05c8 }
            goto L_0x009d
        L_0x00b8:
            ardr r6 = new ardr     // Catch:{ all -> 0x05c8 }
            long r11 = r0.c     // Catch:{ all -> 0x05c8 }
            r6.<init>(r10, r11)     // Catch:{ all -> 0x05c8 }
            ards r10 = new ards     // Catch:{ all -> 0x05c8 }
            r10.<init>(r6)     // Catch:{ all -> 0x05c8 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x05c8 }
            r6.<init>()     // Catch:{ all -> 0x05c8 }
            r6.add(r10)     // Catch:{ all -> 0x05c8 }
            ardu r10 = r1.d     // Catch:{ all -> 0x05c8 }
            boolean r11 = r1.k     // Catch:{ all -> 0x05c8 }
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x05c8 }
            boolean r14 = r6.isEmpty()     // Catch:{ all -> 0x05c8 }
            if (r14 != 0) goto L_0x05bd
            r15 = 6
            r5 = 1120403456(0x42c80000, float:100.0)
            if (r2 == 0) goto L_0x00ed
            r10.a(r6)     // Catch:{ all -> 0x05c8 }
            ardh r2 = new ardh     // Catch:{ all -> 0x05c8 }
            r2.<init>(r12, r15, r5)     // Catch:{ all -> 0x05c8 }
            r3 = 7
            r7 = 1
            r18 = 4
            goto L_0x04b2
        L_0x00ed:
            if (r11 == 0) goto L_0x00fa
            ardh r2 = new ardh     // Catch:{ all -> 0x05c8 }
            r2.<init>(r12, r9, r5)     // Catch:{ all -> 0x05c8 }
            r3 = 7
            r7 = 1
            r18 = 4
            goto L_0x04b2
        L_0x00fa:
            boolean r2 = r6.isEmpty()     // Catch:{ all -> 0x05c8 }
            if (r2 != 0) goto L_0x05b5
            r10.a(r6)     // Catch:{ all -> 0x05c8 }
            ardi r2 = r10.b     // Catch:{ all -> 0x05c8 }
            java.util.LinkedList r5 = r10.a     // Catch:{ all -> 0x05c8 }
            boolean r6 = r5.isEmpty()     // Catch:{ all -> 0x05c8 }
            if (r6 != 0) goto L_0x05ad
            r5.isEmpty()     // Catch:{ all -> 0x05c8 }
            int r6 = defpackage.ardv.c     // Catch:{ all -> 0x05c8 }
            int r10 = r5.size()     // Catch:{ all -> 0x05c8 }
            int r10 = r10 + r8
            r11 = 2
            int[] r12 = new int[r11]     // Catch:{ all -> 0x05c8 }
            r12[r8] = r10     // Catch:{ all -> 0x05c8 }
            r12[r9] = r6     // Catch:{ all -> 0x05c8 }
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r4, r12)     // Catch:{ all -> 0x05c8 }
            int[][] r6 = (int[][]) r6     // Catch:{ all -> 0x05c8 }
            int r10 = defpackage.ardv.c     // Catch:{ all -> 0x05c8 }
            int r12 = r5.size()     // Catch:{ all -> 0x05c8 }
            int r12 = r12 + r8
            int[] r13 = new int[r11]     // Catch:{ all -> 0x05c8 }
            r13[r8] = r12     // Catch:{ all -> 0x05c8 }
            r13[r9] = r10     // Catch:{ all -> 0x05c8 }
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r13)     // Catch:{ all -> 0x05c8 }
            int[][] r4 = (int[][]) r4     // Catch:{ all -> 0x05c8 }
            int[] r10 = defpackage.ardv.b     // Catch:{ all -> 0x05c8 }
            int r12 = r10.length     // Catch:{ all -> 0x05c8 }
            r13 = 0
        L_0x013b:
            if (r13 < r12) goto L_0x058f
            int r10 = defpackage.ardv.c     // Catch:{ all -> 0x05c8 }
            double[] r10 = new double[r10]     // Catch:{ all -> 0x05c8 }
            int r12 = defpackage.ardv.c     // Catch:{ all -> 0x05c8 }
            double[] r12 = new double[r12]     // Catch:{ all -> 0x05c8 }
            int r13 = defpackage.ardv.c     // Catch:{ all -> 0x05c8 }
            long[] r13 = new long[r13]     // Catch:{ all -> 0x05c8 }
            int r15 = defpackage.ardv.c     // Catch:{ all -> 0x05c8 }
            long[] r15 = new long[r15]     // Catch:{ all -> 0x05c8 }
            int r14 = r5.size()     // Catch:{ all -> 0x05c8 }
            long[] r14 = new long[r14]     // Catch:{ all -> 0x05c8 }
            int r7 = r5.size()     // Catch:{ all -> 0x05c8 }
            long[] r7 = new long[r7]     // Catch:{ all -> 0x05c8 }
            java.lang.Object r20 = r5.get(r9)     // Catch:{ all -> 0x05c8 }
            ards r20 = (defpackage.ards) r20     // Catch:{ all -> 0x05c8 }
            long r20 = r20.c()     // Catch:{ all -> 0x05c8 }
            r14[r9] = r20     // Catch:{ all -> 0x05c8 }
            int[] r11 = defpackage.ardv.b     // Catch:{ all -> 0x05c8 }
            int r8 = r11.length     // Catch:{ all -> 0x05c8 }
        L_0x0168:
            if (r9 < r8) goto L_0x056f
            double r8 = defpackage.ardi.b     // Catch:{ all -> 0x05c8 }
            r11 = 0
            r10[r11] = r8     // Catch:{ all -> 0x05c8 }
            double r8 = defpackage.ardi.a     // Catch:{ all -> 0x05c8 }
            r11 = 1
            r10[r11] = r8     // Catch:{ all -> 0x05c8 }
            double r8 = defpackage.ardi.b     // Catch:{ all -> 0x05c8 }
            r11 = 2
            r10[r11] = r8     // Catch:{ all -> 0x05c8 }
            double r8 = defpackage.ardi.a     // Catch:{ all -> 0x05c8 }
            r11 = 3
            r10[r11] = r8     // Catch:{ all -> 0x05c8 }
            double r8 = defpackage.ardi.b     // Catch:{ all -> 0x05c8 }
            r18 = 4
            r10[r18] = r8     // Catch:{ all -> 0x05c8 }
            double r8 = defpackage.ardi.b     // Catch:{ all -> 0x05c8 }
            r11 = 5
            r10[r11] = r8     // Catch:{ all -> 0x05c8 }
            double r8 = defpackage.ardi.c     // Catch:{ all -> 0x05c8 }
            r17 = 6
            r10[r17] = r8     // Catch:{ all -> 0x05c8 }
            double r8 = defpackage.ardi.c     // Catch:{ all -> 0x05c8 }
            r16 = 7
            r10[r16] = r8     // Catch:{ all -> 0x05c8 }
            r11 = 0
            r22 = 0
            r23 = -1
        L_0x019a:
            int r8 = r5.size()     // Catch:{ all -> 0x05c8 }
            r27 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            if (r11 >= r8) goto L_0x0337
            java.lang.Object r8 = r5.get(r11)     // Catch:{ all -> 0x05c8 }
            ards r8 = (defpackage.ards) r8     // Catch:{ all -> 0x05c8 }
            long r29 = r8.c()     // Catch:{ all -> 0x05c8 }
            r14[r11] = r29     // Catch:{ all -> 0x05c8 }
            r25 = -1
            int r9 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r9 == 0) goto L_0x01cc
            ardr r9 = r8.a     // Catch:{ all -> 0x05c8 }
            boolean r9 = r9.a()     // Catch:{ all -> 0x05c8 }
            if (r9 == 0) goto L_0x01cc
            ardr r9 = r8.a     // Catch:{ all -> 0x05c8 }
            ardq r9 = r9.b()     // Catch:{ all -> 0x05c8 }
            int r9 = r9.a     // Catch:{ all -> 0x05c8 }
            r0 = 3
            if (r9 == r0) goto L_0x01cb
            goto L_0x01cc
        L_0x01cb:
            goto L_0x01d0
        L_0x01cc:
            long r23 = r8.c()     // Catch:{ all -> 0x05c8 }
        L_0x01d0:
            if (r11 == 0) goto L_0x01dc
            r29 = r14[r11]     // Catch:{ all -> 0x05c8 }
            int r0 = r11 + -1
            r31 = r14[r0]     // Catch:{ all -> 0x05c8 }
            long r29 = r29 - r31
            r7[r11] = r29     // Catch:{ all -> 0x05c8 }
        L_0x01dc:
            ardr r0 = r8.a     // Catch:{ all -> 0x05c8 }
            boolean r0 = r0.a()     // Catch:{ all -> 0x05c8 }
            if (r0 == 0) goto L_0x01f3
            ardr r0 = r8.a     // Catch:{ all -> 0x05c8 }
            ardq r0 = r0.b()     // Catch:{ all -> 0x05c8 }
            int r0 = r0.a     // Catch:{ all -> 0x05c8 }
            r9 = 5
            if (r0 == r9) goto L_0x01f1
            r0 = 0
            goto L_0x01f4
        L_0x01f1:
            r0 = 1
            goto L_0x01f4
        L_0x01f3:
            r0 = 0
        L_0x01f4:
            java.util.List r9 = r8.a()     // Catch:{ all -> 0x05c8 }
            java.util.List r9 = defpackage.ardm.a(r9)     // Catch:{ all -> 0x05c8 }
            int[] r3 = defpackage.ardv.b     // Catch:{ all -> 0x05c8 }
            r29 = r14
            int r14 = r3.length     // Catch:{ all -> 0x05c8 }
            r30 = r5
            r5 = 0
        L_0x0204:
            if (r5 < r14) goto L_0x0223
            int r11 = r11 + 1
            r3 = r57
            r22 = r0
            r14 = r29
            r5 = r30
            r0 = r55
            r51 = r6
            r6 = r4
            r4 = r51
            r52 = r12
            r12 = r10
            r10 = r52
            r53 = r15
            r15 = r13
            r13 = r53
            goto L_0x019a
        L_0x0223:
            r17 = r14
            r14 = r3[r5]     // Catch:{ all -> 0x05c8 }
            r31 = 0
            if (r0 != 0) goto L_0x0239
            double r33 = defpackage.ardm.a((int) r14, (defpackage.ards) r8, (java.util.List) r9)     // Catch:{ all -> 0x05c8 }
            r36 = r9
            r35 = r10
            double r9 = java.lang.Math.log10(r33)     // Catch:{ all -> 0x05c8 }
            double r9 = -r9
            goto L_0x023f
        L_0x0239:
            r36 = r9
            r35 = r10
            r9 = r31
        L_0x023f:
            r33 = r3
            ardx r3 = r2.e     // Catch:{ all -> 0x05c8 }
            ardw r3 = r3.a(r14)     // Catch:{ all -> 0x05c8 }
            r34 = r8
            int[] r8 = defpackage.ardv.b     // Catch:{ all -> 0x05c8 }
            r37 = r5
            int r5 = r8.length     // Catch:{ all -> 0x05c8 }
            r39 = r7
            r38 = r8
            r40 = r27
            r7 = 0
            r8 = -1
        L_0x0256:
            if (r7 < r5) goto L_0x02ba
            r5 = r6[r8]     // Catch:{ all -> 0x05c8 }
            r7 = r4[r14]     // Catch:{ all -> 0x05c8 }
            r42 = r4
            r4 = r11
        L_0x025f:
            if (r4 >= 0) goto L_0x0264
            r43 = r6
            goto L_0x0271
        L_0x0264:
            r43 = r6
            r6 = r5[r4]     // Catch:{ all -> 0x05c8 }
            r31 = r5
            r5 = r7[r4]     // Catch:{ all -> 0x05c8 }
            if (r6 == r5) goto L_0x026f
            goto L_0x02b1
        L_0x026f:
            if (r4 >= r11) goto L_0x02b1
        L_0x0271:
            int r4 = r11 + 1
            r7[r4] = r14     // Catch:{ all -> 0x05c8 }
            double r40 = r40 + r9
            r12[r14] = r40     // Catch:{ all -> 0x05c8 }
            if (r0 == 0) goto L_0x027c
            goto L_0x029d
        L_0x027c:
            r4 = 0
            if (r3 == 0) goto L_0x029a
            ardx r6 = r2.e     // Catch:{ all -> 0x05c8 }
            ardw r6 = r6.a(r8)     // Catch:{ all -> 0x05c8 }
            if (r6 != r3) goto L_0x0296
            r4 = r13[r8]     // Catch:{ all -> 0x05c8 }
            r15[r14] = r4     // Catch:{ all -> 0x05c8 }
            int r3 = r3.b     // Catch:{ all -> 0x05c8 }
            if (r3 != r8) goto L_0x029d
            r6 = r39[r11]     // Catch:{ all -> 0x05c8 }
            long r4 = r4 + r6
            r15[r14] = r4     // Catch:{ all -> 0x05c8 }
            goto L_0x029d
        L_0x0296:
            r15[r14] = r4     // Catch:{ all -> 0x05c8 }
            goto L_0x029d
        L_0x029a:
            r15[r14] = r4     // Catch:{ all -> 0x05c8 }
        L_0x029d:
            int r5 = r37 + 1
            r14 = r17
            r3 = r33
            r8 = r34
            r10 = r35
            r9 = r36
            r7 = r39
            r4 = r42
            r6 = r43
            goto L_0x0204
        L_0x02b1:
            r7[r4] = r6     // Catch:{ all -> 0x05c8 }
            int r4 = r4 + -1
            r5 = r31
            r6 = r43
            goto L_0x025f
        L_0x02ba:
            r42 = r4
            r43 = r6
            r4 = r38[r7]     // Catch:{ all -> 0x05c8 }
            if (r0 != 0) goto L_0x02d3
            long r44 = r34.c()     // Catch:{ all -> 0x05c8 }
            r46 = r5
            long r5 = r44 - r23
            r44 = r8
            r8 = r22
            double r5 = defpackage.ardy.a(r4, r14, r8, r5)     // Catch:{ all -> 0x05c8 }
            goto L_0x02e0
        L_0x02d3:
            r46 = r5
            r44 = r8
            r8 = r22
            if (r4 == r14) goto L_0x02de
            double r5 = defpackage.ardi.d     // Catch:{ all -> 0x05c8 }
            goto L_0x02e0
        L_0x02de:
            r5 = r31
        L_0x02e0:
            r47 = r35[r4]     // Catch:{ all -> 0x05c8 }
            double r5 = r5 + r47
            if (r0 != 0) goto L_0x0311
            r22 = r0
            ardx r0 = r2.e     // Catch:{ all -> 0x05c8 }
            ardw r0 = r0.a(r4)     // Catch:{ all -> 0x05c8 }
            if (r0 != r3) goto L_0x02f5
            r45 = r3
            r49 = r4
            goto L_0x0317
        L_0x02f5:
            if (r0 == 0) goto L_0x0313
            r47 = r13[r4]     // Catch:{ all -> 0x05c8 }
            r45 = r3
            int r3 = r0.b     // Catch:{ all -> 0x05c8 }
            if (r3 != r4) goto L_0x0304
            r49 = r39[r11]     // Catch:{ all -> 0x05c8 }
            long r47 = r47 + r49
            goto L_0x0305
        L_0x0304:
        L_0x0305:
            r49 = r4
            long r3 = r0.a     // Catch:{ all -> 0x05c8 }
            int r0 = (r47 > r3 ? 1 : (r47 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0317
            double r3 = defpackage.ardx.a     // Catch:{ all -> 0x05c8 }
            double r5 = r5 + r3
            goto L_0x0317
        L_0x0311:
            r22 = r0
        L_0x0313:
            r45 = r3
            r49 = r4
        L_0x0317:
            int r0 = (r5 > r40 ? 1 : (r5 == r40 ? 0 : -1))
            if (r0 >= 0) goto L_0x031c
        L_0x031b:
            goto L_0x0321
        L_0x031c:
            int r0 = (r40 > r27 ? 1 : (r40 == r27 ? 0 : -1))
            if (r0 == 0) goto L_0x031b
            goto L_0x0325
        L_0x0321:
            r40 = r5
            r44 = r49
        L_0x0325:
            int r7 = r7 + 1
            r0 = r22
            r4 = r42
            r6 = r43
            r3 = r45
            r5 = r46
            r22 = r8
            r8 = r44
            goto L_0x0256
        L_0x0337:
            r30 = r5
            r43 = r6
            r35 = r10
            r29 = r14
            int[] r0 = defpackage.ardv.b     // Catch:{ all -> 0x05c8 }
            int r3 = r0.length     // Catch:{ all -> 0x05c8 }
            r4 = -1
            r5 = 0
        L_0x0344:
            if (r5 >= r3) goto L_0x035d
            r6 = r0[r5]     // Catch:{ all -> 0x05c8 }
            r7 = r35[r6]     // Catch:{ all -> 0x05c8 }
            int r9 = (r7 > r27 ? 1 : (r7 == r27 ? 0 : -1))
            if (r9 >= 0) goto L_0x0350
            r9 = r7
            goto L_0x0352
        L_0x0350:
            r9 = r27
        L_0x0352:
            int r11 = (r7 > r27 ? 1 : (r7 == r27 ? 0 : -1))
            if (r11 < 0) goto L_0x0357
            goto L_0x0358
        L_0x0357:
            r4 = r6
        L_0x0358:
            int r5 = r5 + 1
            r27 = r9
            goto L_0x0344
        L_0x035d:
            r0 = -1
            if (r4 == r0) goto L_0x047e
            r0 = r43[r4]     // Catch:{ all -> 0x05c8 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x05c8 }
            int r4 = r30.size()     // Catch:{ all -> 0x05c8 }
            r3.<init>(r4)     // Catch:{ all -> 0x05c8 }
            r4 = 0
        L_0x036c:
            int r5 = r30.size()     // Catch:{ all -> 0x05c8 }
            if (r4 >= r5) goto L_0x03ab
            r5 = r30
            java.lang.Object r6 = r5.get(r4)     // Catch:{ all -> 0x05c8 }
            ards r6 = (defpackage.ards) r6     // Catch:{ all -> 0x05c8 }
            java.util.List r6 = r6.a()     // Catch:{ all -> 0x05c8 }
            r7 = 0
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x05c8 }
            ardq r6 = (defpackage.ardq) r6     // Catch:{ all -> 0x05c8 }
            int r6 = r6.a     // Catch:{ all -> 0x05c8 }
            r7 = 5
            if (r6 != r7) goto L_0x0398
            int r6 = r4 + 1
            int r8 = r5.size()     // Catch:{ all -> 0x05c8 }
            if (r6 < r8) goto L_0x0393
            goto L_0x0398
        L_0x0393:
            int r6 = r4 + 2
            r6 = r0[r6]     // Catch:{ all -> 0x05c8 }
            goto L_0x039c
        L_0x0398:
            int r6 = r4 + 1
            r6 = r0[r6]     // Catch:{ all -> 0x05c8 }
        L_0x039c:
            ardh r8 = new ardh     // Catch:{ all -> 0x05c8 }
            r9 = r29[r4]     // Catch:{ all -> 0x05c8 }
            r8.<init>(r9, r6)     // Catch:{ all -> 0x05c8 }
            r3.add(r8)     // Catch:{ all -> 0x05c8 }
            int r4 = r4 + 1
            r30 = r5
            goto L_0x036c
        L_0x03ab:
            ardl r0 = r2.f     // Catch:{ all -> 0x05c8 }
            boolean r2 = r3.isEmpty()     // Catch:{ all -> 0x05c8 }
            if (r2 != 0) goto L_0x047c
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x05c8 }
            r2.<init>()     // Catch:{ all -> 0x05c8 }
            r4 = 0
            r5 = -1
        L_0x03bb:
            int r7 = r3.size()     // Catch:{ all -> 0x05c8 }
            if (r4 >= r7) goto L_0x042d
            java.lang.Object r7 = r3.get(r4)     // Catch:{ all -> 0x05c8 }
            ardh r7 = (defpackage.ardh) r7     // Catch:{ all -> 0x05c8 }
            int r8 = r7.b     // Catch:{ all -> 0x05c8 }
            long r9 = r7.a     // Catch:{ all -> 0x05c8 }
            r7 = 1
            if (r8 != 0) goto L_0x03d2
            r14 = 2
            r19 = -1
            goto L_0x0429
        L_0x03d2:
            if (r8 == r7) goto L_0x0426
            r11 = 2
            if (r8 != r11) goto L_0x03d8
            goto L_0x03e1
        L_0x03d8:
            r11 = 3
            if (r8 == r11) goto L_0x03e1
            int r4 = r4 + 1
            r14 = 2
            r19 = -1
            goto L_0x042c
        L_0x03e1:
            int r8 = r4 + 1
        L_0x03e3:
            int r11 = r3.size()     // Catch:{ all -> 0x05c8 }
            if (r8 >= r11) goto L_0x03fe
            java.lang.Object r11 = r3.get(r8)     // Catch:{ all -> 0x05c8 }
            ardh r11 = (defpackage.ardh) r11     // Catch:{ all -> 0x05c8 }
            int r11 = r11.b     // Catch:{ all -> 0x05c8 }
            r14 = 2
            r12 = 3
            if (r11 != r14) goto L_0x03f6
            goto L_0x03fb
        L_0x03f6:
            if (r11 == r12) goto L_0x03fb
            int r8 = r8 + -1
            goto L_0x0406
        L_0x03fb:
            int r8 = r8 + 1
            goto L_0x03e3
        L_0x03fe:
            r12 = 3
            r14 = 2
            int r8 = r3.size()     // Catch:{ all -> 0x05c8 }
            r11 = -1
            int r8 = r8 + r11
        L_0x0406:
            ardo r11 = r0.a     // Catch:{ all -> 0x05c8 }
            boolean r13 = r11.a     // Catch:{ all -> 0x05c8 }
            r19 = -1
            if (r13 != 0) goto L_0x040f
            goto L_0x0422
        L_0x040f:
            int r13 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r13 == 0) goto L_0x0422
            long r9 = r9 - r5
            long r12 = r11.b     // Catch:{ all -> 0x05c8 }
            int r11 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r11 >= 0) goto L_0x0422
            ardk r9 = new ardk     // Catch:{ all -> 0x05c8 }
            r9.<init>(r4, r8)     // Catch:{ all -> 0x05c8 }
            r2.add(r9)     // Catch:{ all -> 0x05c8 }
        L_0x0422:
            int r8 = r8 + 1
            r4 = r8
            goto L_0x042c
        L_0x0426:
            r14 = 2
            r19 = -1
        L_0x0429:
            int r4 = r4 + 1
            r5 = r9
        L_0x042c:
            goto L_0x03bb
        L_0x042d:
            r7 = 1
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x05c8 }
            if (r0 != 0) goto L_0x047d
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x05c8 }
            int r4 = r3.size()     // Catch:{ all -> 0x05c8 }
            r0.<init>(r4)     // Catch:{ all -> 0x05c8 }
            r4 = 0
        L_0x043e:
            int r5 = r3.size()     // Catch:{ all -> 0x05c8 }
            if (r4 >= r5) goto L_0x047a
            java.lang.Object r5 = r3.get(r4)     // Catch:{ all -> 0x05c8 }
            ardh r5 = (defpackage.ardh) r5     // Catch:{ all -> 0x05c8 }
            int r6 = r2.size()     // Catch:{ all -> 0x05c8 }
            r8 = 0
        L_0x044f:
            if (r8 >= r6) goto L_0x0474
            java.lang.Object r9 = r2.get(r8)     // Catch:{ all -> 0x05c8 }
            ardk r9 = (defpackage.ardk) r9     // Catch:{ all -> 0x05c8 }
            int r10 = r9.a     // Catch:{ all -> 0x05c8 }
            if (r4 < r10) goto L_0x0463
            int r9 = r9.b     // Catch:{ all -> 0x05c8 }
            if (r4 <= r9) goto L_0x0461
            r9 = 0
            goto L_0x0464
        L_0x0461:
            r9 = 1
            goto L_0x0464
        L_0x0463:
            r9 = 0
        L_0x0464:
            int r8 = r8 + 1
            if (r9 == 0) goto L_0x044f
            ardh r6 = new ardh     // Catch:{ all -> 0x05c8 }
            long r8 = r5.a     // Catch:{ all -> 0x05c8 }
            r5 = 7
            r6.<init>(r8, r5)     // Catch:{ all -> 0x05c8 }
            r0.add(r6)     // Catch:{ all -> 0x05c8 }
            goto L_0x0477
        L_0x0474:
            r0.add(r5)     // Catch:{ all -> 0x05c8 }
        L_0x0477:
            int r4 = r4 + 1
            goto L_0x043e
        L_0x047a:
            r3 = r0
            goto L_0x0484
        L_0x047c:
            r7 = 1
        L_0x047d:
            goto L_0x0484
        L_0x047e:
            r7 = 1
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x05c8 }
            r3.<init>()     // Catch:{ all -> 0x05c8 }
        L_0x0484:
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x05c8 }
            if (r0 != 0) goto L_0x04a4
            ardt r0 = new ardt     // Catch:{ all -> 0x05c8 }
            r0.<init>()     // Catch:{ all -> 0x05c8 }
            java.util.Comparator r0 = java.util.Collections.reverseOrder(r0)     // Catch:{ all -> 0x05c8 }
            java.util.Collections.sort(r3, r0)     // Catch:{ all -> 0x05c8 }
            r0 = 0
            java.lang.Object r2 = r3.get(r0)     // Catch:{ all -> 0x05c8 }
            r0 = r2
            ardh r0 = (defpackage.ardh) r0     // Catch:{ all -> 0x05c8 }
            int r2 = r0.b     // Catch:{ all -> 0x05c8 }
            r3 = 7
            if (r2 == r3) goto L_0x04a5
            goto L_0x04a6
        L_0x04a4:
            r3 = 7
        L_0x04a5:
            r0 = 0
        L_0x04a6:
            if (r0 != 0) goto L_0x04aa
        L_0x04a8:
            r2 = 0
            goto L_0x04b2
        L_0x04aa:
            if (r57 == 0) goto L_0x04b1
            int r2 = r0.b     // Catch:{ all -> 0x05c8 }
            if (r2 != 0) goto L_0x04b1
            goto L_0x04a8
        L_0x04b1:
            r2 = r0
        L_0x04b2:
            if (r2 == 0) goto L_0x050e
            int r0 = r2.b     // Catch:{ all -> 0x05c8 }
            switch(r0) {
                case 0: goto L_0x04c7;
                case 1: goto L_0x04c7;
                case 2: goto L_0x04c5;
                case 3: goto L_0x04c5;
                case 4: goto L_0x04c3;
                case 5: goto L_0x04c0;
                case 6: goto L_0x04be;
                case 7: goto L_0x04bc;
                default: goto L_0x04b9;
            }     // Catch:{ all -> 0x05c8 }
        L_0x04b9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x05c8 }
            goto L_0x04c9
        L_0x04bc:
            r8 = 4
            goto L_0x04da
        L_0x04be:
            r8 = 3
            goto L_0x04da
        L_0x04c0:
            r8 = 8
            goto L_0x04da
        L_0x04c3:
            r8 = 7
            goto L_0x04da
        L_0x04c5:
            r8 = 1
            goto L_0x04da
        L_0x04c7:
            r8 = 0
            goto L_0x04da
        L_0x04c9:
            r4 = 51
            r3.<init>(r4)     // Catch:{ all -> 0x05c8 }
            java.lang.String r4 = "Received an unrecognised filter state = "
            r3.append(r4)     // Catch:{ all -> 0x05c8 }
            r3.append(r0)     // Catch:{ all -> 0x05c8 }
            r3.toString()     // Catch:{ all -> 0x05c8 }
            r8 = -1
        L_0x04da:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x05c8 }
            r3 = 36
            r0.<init>(r3)     // Catch:{ all -> 0x05c8 }
            java.lang.String r3 = "detectedActivity State = "
            r0.append(r3)     // Catch:{ all -> 0x05c8 }
            r0.append(r8)     // Catch:{ all -> 0x05c8 }
            r0.toString()     // Catch:{ all -> 0x05c8 }
            r0 = -1
            if (r8 == r0) goto L_0x050e
            java.util.List r0 = c     // Catch:{ all -> 0x05c8 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x05c8 }
            boolean r0 = r0.contains(r3)     // Catch:{ all -> 0x05c8 }
            if (r0 != 0) goto L_0x050e
            com.google.android.gms.location.ActivityTransitionEvent r0 = new com.google.android.gms.location.ActivityTransitionEvent     // Catch:{ all -> 0x05c8 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x05c8 }
            long r4 = r2.a     // Catch:{ all -> 0x05c8 }
            long r2 = r3.toNanos(r4)     // Catch:{ all -> 0x05c8 }
            r4 = 0
            r0.<init>(r8, r4, r2)     // Catch:{ all -> 0x05c8 }
            java.util.List r0 = r1.a((com.google.android.gms.location.ActivityTransitionEvent) r0)     // Catch:{ all -> 0x05c8 }
            goto L_0x050f
        L_0x050e:
            r0 = 0
        L_0x050f:
            if (r0 != 0) goto L_0x0555
            com.google.android.gms.location.DetectedActivity r0 = defpackage.ahpp.a((com.google.android.gms.location.ActivityRecognitionResult) r55)     // Catch:{ all -> 0x05c8 }
            com.google.android.gms.location.ActivityTransitionEvent r2 = new com.google.android.gms.location.ActivityTransitionEvent     // Catch:{ all -> 0x05c8 }
            int r0 = r0.a()     // Catch:{ all -> 0x05c8 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x05c8 }
            r4 = r55
            long r4 = r4.c     // Catch:{ all -> 0x05c8 }
            long r3 = r3.toNanos(r4)     // Catch:{ all -> 0x05c8 }
            r5 = 0
            r2.<init>(r0, r5, r3)     // Catch:{ all -> 0x05c8 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x05c8 }
            r0.<init>()     // Catch:{ all -> 0x05c8 }
            r0.add(r2)     // Catch:{ all -> 0x05c8 }
            int r2 = r0.size()     // Catch:{ all -> 0x05c8 }
            r3 = -1
            int r2 = r2 + r3
        L_0x0537:
            if (r2 < 0) goto L_0x0550
            java.lang.Object r3 = r0.get(r2)     // Catch:{ all -> 0x05c8 }
            com.google.android.gms.location.ActivityTransitionEvent r3 = (com.google.android.gms.location.ActivityTransitionEvent) r3     // Catch:{ all -> 0x05c8 }
            java.util.List r4 = c     // Catch:{ all -> 0x05c8 }
            int r5 = r3.a     // Catch:{ all -> 0x05c8 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x05c8 }
            boolean r4 = r4.contains(r5)     // Catch:{ all -> 0x05c8 }
            if (r4 == 0) goto L_0x0551
            int r2 = r2 + -1
            goto L_0x0537
        L_0x0550:
            r3 = 0
        L_0x0551:
            java.util.List r0 = r1.a((com.google.android.gms.location.ActivityTransitionEvent) r3)     // Catch:{ all -> 0x05c8 }
        L_0x0555:
        L_0x0556:
            if (r0 == 0) goto L_0x056c
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x05c8 }
            if (r2 != 0) goto L_0x056c
            com.google.android.gms.location.ActivityTransitionEvent r2 = r1.g     // Catch:{ all -> 0x05c8 }
            if (r2 == 0) goto L_0x0567
            int r2 = r2.a     // Catch:{ all -> 0x05c8 }
            r1.a((int) r2)     // Catch:{ all -> 0x05c8 }
        L_0x0567:
            r1.c(r0)     // Catch:{ all -> 0x05c8 }
            monitor-exit(r54)
            return r0
        L_0x056c:
            monitor-exit(r54)
            r0 = 0
            return r0
        L_0x056f:
            r39 = r7
            r29 = r14
            r0 = 3
            r3 = 7
            r7 = 1
            r14 = 2
            r17 = 6
            r18 = 4
            r16 = r11[r9]     // Catch:{ all -> 0x05c8 }
            r19 = r6[r16]     // Catch:{ all -> 0x05c8 }
            r20 = 0
            r19[r20] = r16     // Catch:{ all -> 0x05c8 }
            int r9 = r9 + 1
            r0 = r55
            r3 = r57
            r14 = r29
            r7 = r39
            goto L_0x0168
        L_0x058f:
            r0 = 3
            r3 = 7
            r7 = 1
            r14 = 2
            r17 = 6
            r18 = 4
            r20 = 0
            r8 = r10[r13]     // Catch:{ all -> 0x05c8 }
            r8 = r4[r8]     // Catch:{ all -> 0x05c8 }
            r9 = -1
            java.util.Arrays.fill(r8, r9)     // Catch:{ all -> 0x05c8 }
            int r13 = r13 + 1
            r0 = r55
            r3 = r57
            r8 = 1
            r9 = 0
            r11 = 2
            r15 = 6
            goto L_0x013b
        L_0x05ad:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x05c8 }
            java.lang.String r2 = "Need at least 1 observation"
            r0.<init>(r2)     // Catch:{ all -> 0x05c8 }
            throw r0     // Catch:{ all -> 0x05c8 }
        L_0x05b5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x05c8 }
            java.lang.String r2 = "Need at least 1 observation"
            r0.<init>(r2)     // Catch:{ all -> 0x05c8 }
            throw r0     // Catch:{ all -> 0x05c8 }
        L_0x05bd:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x05c8 }
            java.lang.String r2 = "Need at least 1 observation"
            r0.<init>(r2)     // Catch:{ all -> 0x05c8 }
            throw r0     // Catch:{ all -> 0x05c8 }
        L_0x05c5:
            monitor-exit(r54)
            r0 = 0
            return r0
        L_0x05c8:
            r0 = move-exception
            monitor-exit(r54)
            goto L_0x05cc
        L_0x05cb:
            throw r0
        L_0x05cc:
            goto L_0x05cb
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahpi.a(com.google.android.gms.location.ActivityRecognitionResult, boolean, boolean):java.util.List");
    }

    /* access modifiers changed from: package-private */
    public final List a(ActivityTransitionEvent activityTransitionEvent) {
        String valueOf = String.valueOf(activityTransitionEvent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
        sb.append("transitionEvents: detectedActivityTransition State = ");
        sb.append(valueOf);
        sb.toString();
        ahph ahph = new ahph();
        if (activityTransitionEvent != null) {
            ActivityTransitionEvent activityTransitionEvent2 = this.g;
            if (activityTransitionEvent2 == null) {
                this.g = activityTransitionEvent;
                ahph.add(activityTransitionEvent);
                return ahph;
            } else if (activityTransitionEvent2.a != activityTransitionEvent.a) {
                ActivityTransitionEvent a2 = a(activityTransitionEvent2, activityTransitionEvent.c);
                this.g = activityTransitionEvent;
                ahph.add(a2);
                ahph.add(activityTransitionEvent);
            }
        }
        return ahph;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0299  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List a(java.util.List r17, boolean r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            monitor-enter(r16)
            java.lang.String r2 = java.lang.String.valueOf(r17)     // Catch:{ all -> 0x0409 }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0409 }
            int r3 = r3.length()     // Catch:{ all -> 0x0409 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            int r3 = r3 + 20
            r4.<init>(r3)     // Catch:{ all -> 0x0409 }
            java.lang.String r3 = "transition events = "
            r4.append(r3)     // Catch:{ all -> 0x0409 }
            r4.append(r2)     // Catch:{ all -> 0x0409 }
            r4.toString()     // Catch:{ all -> 0x0409 }
            r16.a()     // Catch:{ all -> 0x0409 }
            ahpt r2 = r1.f     // Catch:{ all -> 0x0409 }
            if (r2 != 0) goto L_0x0033
            ahpt r2 = new ahpt     // Catch:{ all -> 0x0409 }
            aizy r3 = r1.h     // Catch:{ all -> 0x0409 }
            r2.<init>(r3)     // Catch:{ all -> 0x0409 }
            r1.f = r2     // Catch:{ all -> 0x0409 }
        L_0x0033:
            java.lang.String r2 = java.lang.String.valueOf(r17)     // Catch:{ all -> 0x0409 }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0409 }
            int r3 = r3.length()     // Catch:{ all -> 0x0409 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            int r3 = r3 + 34
            r4.<init>(r3)     // Catch:{ all -> 0x0409 }
            java.lang.String r3 = "transition events before filter = "
            r4.append(r3)     // Catch:{ all -> 0x0409 }
            r4.append(r2)     // Catch:{ all -> 0x0409 }
            r4.toString()     // Catch:{ all -> 0x0409 }
            ahpt r2 = r1.f     // Catch:{ all -> 0x0409 }
            boolean r9 = r1.k     // Catch:{ all -> 0x0409 }
            java.util.Iterator r3 = r17.iterator()     // Catch:{ all -> 0x0409 }
        L_0x0059:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0409 }
            if (r4 == 0) goto L_0x0077
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0409 }
            com.google.android.gms.location.ActivityTransitionEvent r4 = (com.google.android.gms.location.ActivityTransitionEvent) r4     // Catch:{ all -> 0x0409 }
            int r4 = r4.a     // Catch:{ all -> 0x0409 }
            java.util.List r5 = defpackage.ahpp.a     // Catch:{ all -> 0x0409 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0409 }
            boolean r4 = r5.contains(r4)     // Catch:{ all -> 0x0409 }
            if (r4 == 0) goto L_0x0059
            r3.remove()     // Catch:{ all -> 0x0409 }
            goto L_0x0059
        L_0x0077:
            boolean r3 = defpackage.axxa.e()     // Catch:{ all -> 0x0409 }
            r11 = -1
            r12 = 0
            r13 = 1
            r14 = 0
            if (r3 != 0) goto L_0x009b
            boolean r0 = defpackage.axxa.e()     // Catch:{ all -> 0x0409 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            r3 = 67
            r2.<init>(r3)     // Catch:{ all -> 0x0409 }
            java.lang.String r3 = "Skipping hardware transition filtering. Flag is not enabled = "
            r2.append(r3)     // Catch:{ all -> 0x0409 }
            r2.append(r0)     // Catch:{ all -> 0x0409 }
            r2.toString()     // Catch:{ all -> 0x0409 }
            r15 = r17
            goto L_0x0270
        L_0x009b:
            java.lang.String r3 = java.lang.String.valueOf(r17)     // Catch:{ all -> 0x0409 }
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0409 }
            int r4 = r4.length()     // Catch:{ all -> 0x0409 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            int r4 = r4 + 83
            r5.<init>(r4)     // Catch:{ all -> 0x0409 }
            java.lang.String r4 = "run filter. events = "
            r5.append(r4)     // Catch:{ all -> 0x0409 }
            r5.append(r3)     // Catch:{ all -> 0x0409 }
            java.lang.String r3 = ", isWifiConnected = "
            r5.append(r3)     // Catch:{ all -> 0x0409 }
            r5.append(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r3 = ", isVehicleBluetoothConnected = "
            r5.append(r3)     // Catch:{ all -> 0x0409 }
            r5.append(r9)     // Catch:{ all -> 0x0409 }
            r5.toString()     // Catch:{ all -> 0x0409 }
            boolean r3 = r17.isEmpty()     // Catch:{ all -> 0x0409 }
            if (r3 != 0) goto L_0x00e2
            int r3 = r17.size()     // Catch:{ all -> 0x0409 }
            int r3 = r3 + r11
            r15 = r17
            java.lang.Object r3 = r15.get(r3)     // Catch:{ all -> 0x0409 }
            com.google.android.gms.location.ActivityTransitionEvent r3 = (com.google.android.gms.location.ActivityTransitionEvent) r3     // Catch:{ all -> 0x0409 }
            int r4 = r3.b     // Catch:{ all -> 0x0409 }
            if (r4 != 0) goto L_0x00e4
            r10 = r3
            goto L_0x00e5
        L_0x00e2:
            r15 = r17
        L_0x00e4:
            r10 = r12
        L_0x00e5:
            if (r10 != 0) goto L_0x0117
            java.lang.String r2 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0409 }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0409 }
            int r3 = r3.length()     // Catch:{ all -> 0x0409 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            int r3 = r3 + 92
            r4.<init>(r3)     // Catch:{ all -> 0x0409 }
            java.lang.String r3 = "Found no latest enter event = "
            r4.append(r3)     // Catch:{ all -> 0x0409 }
            r4.append(r2)     // Catch:{ all -> 0x0409 }
            java.lang.String r2 = ", isWifiConnected = "
            r4.append(r2)     // Catch:{ all -> 0x0409 }
            r4.append(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = ", isVehicleBluetoothConnected = "
            r4.append(r0)     // Catch:{ all -> 0x0409 }
            r4.append(r9)     // Catch:{ all -> 0x0409 }
            r4.toString()     // Catch:{ all -> 0x0409 }
            goto L_0x0270
        L_0x0117:
            boolean r3 = r2.b     // Catch:{ all -> 0x0409 }
            if (r3 == 0) goto L_0x0131
            int r3 = r10.a     // Catch:{ all -> 0x0409 }
            boolean r3 = defpackage.ahpp.a((int) r3)     // Catch:{ all -> 0x0409 }
            if (r3 == 0) goto L_0x0131
            aizy r0 = r2.a     // Catch:{ all -> 0x0409 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0409 }
            r2.d = r3     // Catch:{ all -> 0x0409 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0409 }
            goto L_0x0271
        L_0x0131:
            if (r9 == 0) goto L_0x01ad
            boolean r3 = r2.b     // Catch:{ all -> 0x0409 }
            if (r3 != 0) goto L_0x01ad
            int r0 = r10.a     // Catch:{ all -> 0x0409 }
            boolean r0 = defpackage.ahpp.a((int) r0)     // Catch:{ all -> 0x0409 }
            if (r0 == 0) goto L_0x0158
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            r3 = 99
            r0.<init>(r3)     // Catch:{ all -> 0x0409 }
            java.lang.String r3 = "isVehicleBluetoothConnected = true, found latest event with vehicle. No short circuiting required."
            r0.append(r3)     // Catch:{ all -> 0x0409 }
            r0.toString()     // Catch:{ all -> 0x0409 }
            aizy r0 = r2.a     // Catch:{ all -> 0x0409 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0409 }
            r2.d = r3     // Catch:{ all -> 0x0409 }
            goto L_0x0270
        L_0x0158:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            r3 = 79
            r0.<init>(r3)     // Catch:{ all -> 0x0409 }
            java.lang.String r3 = "isVehicleBluetoothConnected = true, Short circuit for the connected bluetooth."
            r0.append(r3)     // Catch:{ all -> 0x0409 }
            r0.toString()     // Catch:{ all -> 0x0409 }
            r2.b = r13     // Catch:{ all -> 0x0409 }
            aizy r0 = r2.a     // Catch:{ all -> 0x0409 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0409 }
            r2.d = r3     // Catch:{ all -> 0x0409 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0409 }
            r0.<init>()     // Catch:{ all -> 0x0409 }
            com.google.android.gms.location.ActivityTransitionEvent r3 = defpackage.ahpt.a(r17)     // Catch:{ all -> 0x0409 }
            if (r3 == 0) goto L_0x0180
            r0.add(r3)     // Catch:{ all -> 0x0409 }
            goto L_0x019e
        L_0x0180:
            java.lang.String r3 = java.lang.String.valueOf(r17)     // Catch:{ all -> 0x0409 }
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0409 }
            int r4 = r4.length()     // Catch:{ all -> 0x0409 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            int r4 = r4 + 63
            r5.<init>(r4)     // Catch:{ all -> 0x0409 }
            java.lang.String r4 = "Found no exit events during vehicle short circuiting. Events = "
            r5.append(r4)     // Catch:{ all -> 0x0409 }
            r5.append(r3)     // Catch:{ all -> 0x0409 }
            r5.toString()     // Catch:{ all -> 0x0409 }
        L_0x019e:
            aizy r2 = r2.a     // Catch:{ all -> 0x0409 }
            long r2 = r2.a()     // Catch:{ all -> 0x0409 }
            com.google.android.gms.location.ActivityTransitionEvent r2 = defpackage.ahpt.a(r14, r14, r2)     // Catch:{ all -> 0x0409 }
            r0.add(r2)     // Catch:{ all -> 0x0409 }
            goto L_0x0271
        L_0x01ad:
            boolean r3 = r2.b     // Catch:{ all -> 0x0409 }
            if (r3 == 0) goto L_0x01ba
            boolean r3 = defpackage.ahpp.a((com.google.android.gms.location.ActivityTransitionEvent) r10)     // Catch:{ all -> 0x0409 }
            if (r3 != 0) goto L_0x01b8
            goto L_0x01ba
        L_0x01b8:
            r11 = r10
            goto L_0x01d4
        L_0x01ba:
            boolean r3 = r2.b     // Catch:{ all -> 0x0409 }
            if (r3 == 0) goto L_0x0207
            ahpu r3 = r2.e     // Catch:{ all -> 0x0409 }
            long r5 = r2.d     // Catch:{ all -> 0x0409 }
            aizy r4 = r2.a     // Catch:{ all -> 0x0409 }
            r4 = 0
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0409 }
            boolean r12 = r2.b     // Catch:{ all -> 0x0409 }
            r11 = r10
            r10 = r12
            boolean r3 = r3.a(r4, r5, r7, r9, r10)     // Catch:{ all -> 0x0409 }
            if (r3 != 0) goto L_0x01d4
            goto L_0x0208
        L_0x01d4:
            r2.b = r14     // Catch:{ all -> 0x0409 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0409 }
            r0.<init>()     // Catch:{ all -> 0x0409 }
            long r2 = r11.c     // Catch:{ all -> 0x0409 }
            com.google.android.gms.location.ActivityTransitionEvent r2 = defpackage.ahpt.a(r14, r13, r2)     // Catch:{ all -> 0x0409 }
            r0.add(r2)     // Catch:{ all -> 0x0409 }
            r0.add(r11)     // Catch:{ all -> 0x0409 }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0409 }
            int r3 = r3.length()     // Catch:{ all -> 0x0409 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            int r3 = r3 + 26
            r4.<init>(r3)     // Catch:{ all -> 0x0409 }
            java.lang.String r3 = "Exiting vehicle. Events = "
            r4.append(r3)     // Catch:{ all -> 0x0409 }
            r4.append(r2)     // Catch:{ all -> 0x0409 }
            r4.toString()     // Catch:{ all -> 0x0409 }
            goto L_0x0271
        L_0x0207:
            r11 = r10
        L_0x0208:
            int r3 = r11.a     // Catch:{ all -> 0x0409 }
            boolean r3 = defpackage.ahpp.a((int) r3)     // Catch:{ all -> 0x0409 }
            r4 = 3
            if (r3 != 0) goto L_0x0212
            goto L_0x0258
        L_0x0212:
            if (r0 == 0) goto L_0x0258
            r2.c = r13     // Catch:{ all -> 0x0409 }
            com.google.android.gms.location.ActivityTransitionEvent r0 = defpackage.ahpt.a(r17)     // Catch:{ all -> 0x0409 }
            int r3 = r0.a     // Catch:{ all -> 0x0409 }
            if (r3 == r4) goto L_0x0256
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0409 }
            r3.<init>()     // Catch:{ all -> 0x0409 }
            if (r0 == 0) goto L_0x0229
            r3.add(r0)     // Catch:{ all -> 0x0409 }
            goto L_0x0247
        L_0x0229:
            java.lang.String r0 = java.lang.String.valueOf(r17)     // Catch:{ all -> 0x0409 }
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0409 }
            int r5 = r5.length()     // Catch:{ all -> 0x0409 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            int r5 = r5 + 63
            r6.<init>(r5)     // Catch:{ all -> 0x0409 }
            java.lang.String r5 = "Found no exit events during vehicle short circuiting. Events = "
            r6.append(r5)     // Catch:{ all -> 0x0409 }
            r6.append(r0)     // Catch:{ all -> 0x0409 }
            r6.toString()     // Catch:{ all -> 0x0409 }
        L_0x0247:
            aizy r0 = r2.a     // Catch:{ all -> 0x0409 }
            long r5 = r0.a()     // Catch:{ all -> 0x0409 }
            com.google.android.gms.location.ActivityTransitionEvent r0 = defpackage.ahpt.a(r4, r14, r5)     // Catch:{ all -> 0x0409 }
            r3.add(r0)     // Catch:{ all -> 0x0409 }
            r0 = r3
            goto L_0x0271
        L_0x0256:
            r0 = 0
            goto L_0x0271
        L_0x0258:
            boolean r0 = r2.c     // Catch:{ all -> 0x0409 }
            if (r0 == 0) goto L_0x0270
            r2.c = r14     // Catch:{ all -> 0x0409 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0409 }
            r0.<init>()     // Catch:{ all -> 0x0409 }
            long r2 = r11.c     // Catch:{ all -> 0x0409 }
            com.google.android.gms.location.ActivityTransitionEvent r2 = defpackage.ahpt.a(r4, r13, r2)     // Catch:{ all -> 0x0409 }
            r0.add(r2)     // Catch:{ all -> 0x0409 }
            r0.add(r11)     // Catch:{ all -> 0x0409 }
            goto L_0x0271
        L_0x0270:
            r0 = r15
        L_0x0271:
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0409 }
            int r3 = r3.length()     // Catch:{ all -> 0x0409 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            int r3 = r3 + 33
            r4.<init>(r3)     // Catch:{ all -> 0x0409 }
            java.lang.String r3 = "transition events after filter = "
            r4.append(r3)     // Catch:{ all -> 0x0409 }
            r4.append(r2)     // Catch:{ all -> 0x0409 }
            r4.toString()     // Catch:{ all -> 0x0409 }
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0409 }
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x0409 }
            if (r3 != 0) goto L_0x0403
            boolean r2 = defpackage.axxa.c()     // Catch:{ all -> 0x0409 }
            if (r2 == 0) goto L_0x03af
            com.google.android.gms.location.ActivityTransitionEvent r2 = r1.g     // Catch:{ all -> 0x0409 }
            if (r2 != 0) goto L_0x02a5
            goto L_0x03af
        L_0x02a5:
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x0409 }
            if (r3 != 0) goto L_0x02d0
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0409 }
            r3.<init>()     // Catch:{ all -> 0x0409 }
            java.lang.Object r4 = r0.get(r14)     // Catch:{ all -> 0x0409 }
            com.google.android.gms.location.ActivityTransitionEvent r4 = (com.google.android.gms.location.ActivityTransitionEvent) r4     // Catch:{ all -> 0x0409 }
            int r4 = r4.b     // Catch:{ all -> 0x0409 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x0409 }
        L_0x02bc:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0409 }
            if (r6 == 0) goto L_0x02d1
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0409 }
            com.google.android.gms.location.ActivityTransitionEvent r6 = (com.google.android.gms.location.ActivityTransitionEvent) r6     // Catch:{ all -> 0x0409 }
            int r7 = r6.b     // Catch:{ all -> 0x0409 }
            if (r7 != r4) goto L_0x02d1
            r3.add(r6)     // Catch:{ all -> 0x0409 }
            goto L_0x02bc
        L_0x02d0:
            r3 = r0
        L_0x02d1:
            com.google.android.gms.location.ActivityTransitionEvent r3 = a((java.util.List) r3)     // Catch:{ all -> 0x0409 }
            int r4 = r2.a     // Catch:{ all -> 0x0409 }
            int r5 = r3.a     // Catch:{ all -> 0x0409 }
            if (r4 != r5) goto L_0x02e2
            int r2 = r2.b     // Catch:{ all -> 0x0409 }
            int r3 = r3.b     // Catch:{ all -> 0x0409 }
            if (r2 != r3) goto L_0x03af
            goto L_0x02ec
        L_0x02e2:
            int r2 = r2.b     // Catch:{ all -> 0x0409 }
            if (r2 != r13) goto L_0x02ec
            int r2 = r3.b     // Catch:{ all -> 0x0409 }
            if (r2 != 0) goto L_0x02ec
            goto L_0x03af
        L_0x02ec:
            com.google.android.gms.location.ActivityTransitionEvent r2 = r1.g     // Catch:{ all -> 0x0409 }
            java.lang.Object r3 = r0.get(r14)     // Catch:{ all -> 0x0409 }
            com.google.android.gms.location.ActivityTransitionEvent r3 = (com.google.android.gms.location.ActivityTransitionEvent) r3     // Catch:{ all -> 0x0409 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0409 }
            r4.<init>()     // Catch:{ all -> 0x0409 }
            int r5 = r2.a     // Catch:{ all -> 0x0409 }
            int r6 = r3.a     // Catch:{ all -> 0x0409 }
            if (r5 != r6) goto L_0x0316
            int r7 = r3.b     // Catch:{ all -> 0x0409 }
            if (r7 != 0) goto L_0x0316
            int r2 = a((java.util.List) r0, (int) r13)     // Catch:{ all -> 0x0409 }
            r3 = -1
            if (r2 == r3) goto L_0x034d
            int r3 = r0.size()     // Catch:{ all -> 0x0409 }
            java.util.List r2 = r0.subList(r2, r3)     // Catch:{ all -> 0x0409 }
            r4.addAll(r2)     // Catch:{ all -> 0x0409 }
            goto L_0x034d
        L_0x0316:
            if (r5 != r6) goto L_0x0319
            goto L_0x033a
        L_0x0319:
            int r5 = r2.b     // Catch:{ all -> 0x0409 }
            if (r5 != 0) goto L_0x033a
            long r5 = r3.c     // Catch:{ all -> 0x0409 }
            com.google.android.gms.location.ActivityTransitionEvent r2 = a((com.google.android.gms.location.ActivityTransitionEvent) r2, (long) r5)     // Catch:{ all -> 0x0409 }
            r4.add(r2)     // Catch:{ all -> 0x0409 }
            int r3 = r2.a     // Catch:{ all -> 0x0409 }
            boolean r3 = com.google.android.gms.location.DetectedActivity.b(r3)     // Catch:{ all -> 0x0409 }
            if (r3 == 0) goto L_0x033a
            com.google.android.gms.location.ActivityTransitionEvent r3 = new com.google.android.gms.location.ActivityTransitionEvent     // Catch:{ all -> 0x0409 }
            int r5 = r2.b     // Catch:{ all -> 0x0409 }
            long r6 = r2.c     // Catch:{ all -> 0x0409 }
            r3.<init>(r14, r5, r6)     // Catch:{ all -> 0x0409 }
            r4.add(r3)     // Catch:{ all -> 0x0409 }
        L_0x033a:
            int r2 = a((java.util.List) r0, (int) r14)     // Catch:{ all -> 0x0409 }
            r3 = -1
            if (r2 == r3) goto L_0x034d
            int r3 = r0.size()     // Catch:{ all -> 0x0409 }
            java.util.List r2 = r0.subList(r2, r3)     // Catch:{ all -> 0x0409 }
            r4.addAll(r2)     // Catch:{ all -> 0x0409 }
        L_0x034d:
            com.google.android.gms.location.ActivityTransitionEvent r2 = r1.g     // Catch:{ all -> 0x0409 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0409 }
            com.google.android.gms.location.ActivityTransitionEvent r3 = r1.g     // Catch:{ all -> 0x0409 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0409 }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0409 }
            java.lang.String r6 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0409 }
            int r6 = r6.length()     // Catch:{ all -> 0x0409 }
            java.lang.String r7 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0409 }
            int r7 = r7.length()     // Catch:{ all -> 0x0409 }
            java.lang.String r8 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0409 }
            int r8 = r8.length()     // Catch:{ all -> 0x0409 }
            java.lang.String r9 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0409 }
            int r9 = r9.length()     // Catch:{ all -> 0x0409 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            int r6 = r6 + 92
            int r6 = r6 + r7
            int r6 = r6 + r8
            int r6 = r6 + r9
            r10.<init>(r6)     // Catch:{ all -> 0x0409 }
            java.lang.String r6 = "Transitions received are not a valid transition from current state: "
            r10.append(r6)     // Catch:{ all -> 0x0409 }
            r10.append(r2)     // Catch:{ all -> 0x0409 }
            java.lang.String r2 = " -> "
            r10.append(r2)     // Catch:{ all -> 0x0409 }
            r10.append(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = ". Corrected to: "
            r10.append(r0)     // Catch:{ all -> 0x0409 }
            r10.append(r3)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = " -> "
            r10.append(r0)     // Catch:{ all -> 0x0409 }
            r10.append(r5)     // Catch:{ all -> 0x0409 }
            r10.toString()     // Catch:{ all -> 0x0409 }
            r0 = r4
        L_0x03af:
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x0409 }
            if (r2 != 0) goto L_0x0401
            int r2 = r0.size()     // Catch:{ all -> 0x0409 }
            r3 = -1
            int r2 = r2 + r3
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x0409 }
            com.google.android.gms.location.ActivityTransitionEvent r2 = (com.google.android.gms.location.ActivityTransitionEvent) r2     // Catch:{ all -> 0x0409 }
            int r3 = r2.b     // Catch:{ all -> 0x0409 }
            if (r3 != 0) goto L_0x03e0
            boolean r3 = defpackage.axwr.b()     // Catch:{ all -> 0x0409 }
            if (r3 == 0) goto L_0x03d6
            java.util.List r2 = b(r0)     // Catch:{ all -> 0x0409 }
            com.google.android.gms.location.ActivityTransitionEvent r2 = a((java.util.List) r2)     // Catch:{ all -> 0x0409 }
            r1.g = r2     // Catch:{ all -> 0x0409 }
            goto L_0x03d8
        L_0x03d6:
            r1.g = r2     // Catch:{ all -> 0x0409 }
        L_0x03d8:
            com.google.android.gms.location.ActivityTransitionEvent r2 = r1.g     // Catch:{ all -> 0x0409 }
            int r2 = r2.a     // Catch:{ all -> 0x0409 }
            r1.a((int) r2)     // Catch:{ all -> 0x0409 }
            goto L_0x0401
        L_0x03e0:
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0409 }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0409 }
            int r3 = r3.length()     // Catch:{ all -> 0x0409 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            int r3 = r3 + 75
            r4.<init>(r3)     // Catch:{ all -> 0x0409 }
            java.lang.String r3 = "received an transition event which is not of type enter new state. Event = "
            r4.append(r3)     // Catch:{ all -> 0x0409 }
            r4.append(r2)     // Catch:{ all -> 0x0409 }
            r4.toString()     // Catch:{ all -> 0x0409 }
            r2 = 0
            r1.g = r2     // Catch:{ all -> 0x0409 }
        L_0x0401:
            r2 = r0
            goto L_0x0404
        L_0x0403:
        L_0x0404:
            r1.c(r2)     // Catch:{ all -> 0x0409 }
            monitor-exit(r16)
            return r2
        L_0x0409:
            r0 = move-exception
            monitor-exit(r16)
            goto L_0x040d
        L_0x040c:
            throw r0
        L_0x040d:
            goto L_0x040c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahpi.a(java.util.List, boolean):java.util.List");
    }

    public final synchronized void a(boolean z, int i2, aiaf aiaf) {
        String str;
        String str2;
        Object[] objArr = new Object[2];
        if (i2 != 1) {
            str = "not inveh";
        } else {
            str = "inveh";
        }
        objArr[0] = str;
        if (!z) {
            str2 = "disconnect";
        } else {
            str2 = "connect";
        }
        objArr[1] = str2;
        if (axxa.a.a().arTransitionVehicleBluetoothFilteringEnabled()) {
            if (i2 == 1 && z) {
                boolean z2 = this.k;
                StringBuilder sb = new StringBuilder(57);
                sb.append("Changing the bluetooth connected from = ");
                sb.append(z2);
                sb.append(", to = true");
                sb.toString();
                this.k = true;
                return;
            }
        }
        boolean z3 = this.k;
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Changing the bluetooth connected from = ");
        sb2.append(z3);
        sb2.append(", to false");
        sb2.toString();
        this.k = false;
    }
}
