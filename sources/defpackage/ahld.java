package defpackage;

import com.google.android.gms.location.SleepSegmentEvent;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: ahld  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahld implements ajbk {
    public final ahix a;
    public long b = 0;
    public long c = 0;
    private final aicn d;
    private final ahpg e;
    private final ahoj f;
    private final ahjc g;
    private final aizl h;
    private final int i;
    private final int j;
    private final List k;
    private int l = 0;
    private long m = 0;
    private aixl n = null;

    public ahld(aicn aicn, aibh aibh, ahix ahix) {
        ahpg ahpg;
        boolean z;
        ahix ahix2 = ahix;
        this.d = aicn;
        this.a = ahix2;
        synchronized (ahpg.a) {
            if (ahpg.b == null) {
                ahpg.b = new ahpg("");
            }
            ahpg = ahpg.b;
        }
        this.e = ahpg;
        if (!ayfc.d() || !ayfc.c()) {
            z = false;
        } else {
            z = true;
        }
        ahoh ahoh = new ahoh(z);
        ahoh.g[0] = (int) ayfc.a.a().minAwakeHsmmParam();
        ahoh.g[1] = (int) ayfc.a.a().minSleepHsmmParam();
        this.f = new ahoj(ahoh.a, ahoh.b, ahoh.c, ahoh.d, ahoh.e, ahoh.f, ahoh.g, ahoh.h, aibh);
        this.g = ahix2.e;
        this.h = ahix2.d;
        this.i = (int) ayfc.a.a().segmentSleepStartHour();
        this.j = (int) ayfc.a.a().segmentSleepEndHour();
        this.k = new ArrayList();
    }

    static final aiba a(aiba aiba, aiba aiba2) {
        long max = Math.max(((Long) aiba.a).longValue(), ((Long) aiba2.a).longValue());
        long min = Math.min(((Long) aiba.b).longValue(), ((Long) aiba2.b).longValue());
        if (max < min) {
            return new aiba(Long.valueOf(max), Long.valueOf(min));
        }
        return null;
    }

    public final void p() {
        a(System.currentTimeMillis());
    }

    static final boolean a(long j2, long j3) {
        StringBuilder sb = new StringBuilder(56);
        sb.append("Previous sleep segment report time: ");
        sb.append(j3);
        sb.toString();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getDefault());
        gregorianCalendar.setTimeInMillis(j3);
        int i2 = gregorianCalendar.get(5);
        gregorianCalendar.setTimeInMillis(j2);
        return gregorianCalendar.get(5) == i2;
    }

    public final List a() {
        ahoe ahoe = this.f.a;
        ahoe.c();
        ArrayList arrayList = new ArrayList();
        List list = ahoe.j;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            aiba aiba = (aiba) list.get(i2);
            arrayList.add(new SleepSegmentEvent(((Long) aiba.a).longValue(), ((Long) aiba.b).longValue(), 0));
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final List a(List list, List list2, long j2) {
        aiba aiba;
        aiba aiba2;
        int i2;
        List list3 = list;
        long j3 = j2;
        ahnj bk = this.h.bk();
        if (bk == null || !ayfc.i()) {
            ArrayList arrayList = new ArrayList();
            if (!list.isEmpty()) {
                int size = list.size();
                aiba = null;
                for (int i3 = 0; i3 < size; i3++) {
                    aiba aiba3 = (aiba) list3.get(i3);
                    String valueOf = String.valueOf(aiba3.a);
                    String valueOf2 = String.valueOf(aiba3.b);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(valueOf2).length());
                    sb.append("Detected sleep:");
                    sb.append(valueOf);
                    sb.append("-");
                    sb.append(valueOf2);
                    sb.toString();
                    if (TimeUnit.MILLISECONDS.toHours(((Long) aiba3.b).longValue() - ((Long) aiba3.a).longValue()) >= ayfc.a.a().minSegmentedSleepHours()) {
                        aiba = aiba3;
                    }
                }
            } else {
                aiba = null;
            }
            if (!list2.isEmpty() && !ayfc.a.a().allowMissingWindowsDetection()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    aiba aiba4 = (aiba) it.next();
                    String valueOf3 = String.valueOf(aiba4.a);
                    String valueOf4 = String.valueOf(aiba4.b);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 15 + String.valueOf(valueOf4).length());
                    sb2.append("Missing data: ");
                    sb2.append(valueOf3);
                    sb2.append("-");
                    sb2.append(valueOf4);
                    sb2.toString();
                    if ((((Long) aiba4.b).longValue() - ((Long) aiba4.a).longValue()) / 3600000 < 12) {
                        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getDefault());
                        gregorianCalendar.setTimeInMillis(((Long) aiba4.a).longValue());
                        int i4 = gregorianCalendar.get(11);
                        gregorianCalendar.setTimeInMillis(((Long) aiba4.b).longValue());
                        int i5 = gregorianCalendar.get(11);
                        if (i4 <= i5 && i4 >= 10 && i5 <= 19) {
                            long millis = TimeUnit.SECONDS.toMillis(ayfc.a.a().sleepMissingDataMaxGapEpochs() * 360);
                            long longValue = ((Long) aiba.a).longValue() - millis;
                            long longValue2 = ((Long) aiba.b).longValue() + millis;
                            if ((((Long) aiba4.a).longValue() < longValue || ((Long) aiba4.a).longValue() > longValue2) && ((((Long) aiba4.b).longValue() < longValue || ((Long) aiba4.b).longValue() > longValue2) && (((Long) aiba4.a).longValue() >= longValue || ((Long) aiba4.b).longValue() <= longValue2))) {
                            }
                        }
                    }
                    SleepSegmentEvent sleepSegmentEvent = new SleepSegmentEvent(((Long) aiba.a).longValue(), ((Long) aiba.b).longValue(), 1);
                    arrayList.add(sleepSegmentEvent);
                    ahjb.a(this.d, sleepSegmentEvent, sleepSegmentEvent.c);
                    return arrayList;
                }
            }
            if (aiba != null) {
                arrayList.add(new SleepSegmentEvent(((Long) aiba.a).longValue(), ((Long) aiba.b).longValue(), 0));
                String valueOf5 = String.valueOf(aiba.a);
                String valueOf6 = String.valueOf(aiba.b);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf5).length() + 28 + String.valueOf(valueOf6).length());
                sb3.append("Reporting primary sleep: ");
                sb3.append(valueOf5);
                sb3.append(" - ");
                sb3.append(valueOf6);
                sb3.toString();
            }
            if (!arrayList.isEmpty() && ((SleepSegmentEvent) arrayList.get(0)).c == 0) {
                ahoe ahoe = this.f.a;
                ahoe.c();
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    SleepSegmentEvent sleepSegmentEvent2 = (SleepSegmentEvent) arrayList.get(i6);
                    if (sleepSegmentEvent2.c == 0) {
                        ahoe.j.add(new aiba(Long.valueOf(sleepSegmentEvent2.a), Long.valueOf(sleepSegmentEvent2.b)));
                    }
                }
                if (!ahoe.j.isEmpty() && ahoe.h != null) {
                    ahoe.a(System.currentTimeMillis());
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        if (ayfc.a.a().sleepWindowEpochCalculationBugFix()) {
            aiba2 = bk.a(j3);
        } else {
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(TimeZone.getDefault());
            gregorianCalendar2.setTimeInMillis(j3);
            gregorianCalendar2.set(11, bk.c);
            gregorianCalendar2.set(12, bk.d);
            gregorianCalendar2.set(13, 0);
            long timeInMillis = gregorianCalendar2.getTimeInMillis();
            if (timeInMillis > j3) {
                gregorianCalendar2.add(6, -1);
                timeInMillis = gregorianCalendar2.getTimeInMillis();
            }
            gregorianCalendar2.set(11, bk.a);
            gregorianCalendar2.set(12, bk.b);
            gregorianCalendar2.set(13, 0);
            long timeInMillis2 = gregorianCalendar2.getTimeInMillis();
            if (timeInMillis2 > timeInMillis) {
                gregorianCalendar2.add(6, -1);
                timeInMillis2 = gregorianCalendar2.getTimeInMillis();
            }
            aiba2 = new aiba(Long.valueOf(timeInMillis2), Long.valueOf(timeInMillis));
        }
        String valueOf7 = String.valueOf(aiba2.a);
        String valueOf8 = String.valueOf(aiba2.b);
        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf7).length() + 13 + String.valueOf(valueOf8).length());
        sb4.append("userWindow :");
        sb4.append(valueOf7);
        sb4.append("-");
        sb4.append(valueOf8);
        sb4.toString();
        int size3 = list.size();
        long j4 = 0;
        aiba aiba5 = null;
        for (int i7 = 0; i7 < size3; i7++) {
            aiba a2 = a(aiba2, (aiba) list3.get(i7));
            if (a2 != null) {
                String valueOf9 = String.valueOf(a2.a);
                String valueOf10 = String.valueOf(a2.b);
                StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf9).length() + 15 + String.valueOf(valueOf10).length());
                sb5.append("Overlap sleep:");
                sb5.append(valueOf9);
                sb5.append("-");
                sb5.append(valueOf10);
                sb5.toString();
                long longValue3 = ((Long) a2.b).longValue() - ((Long) a2.a).longValue();
                if (longValue3 > j4) {
                    aiba5 = a2;
                    j4 = longValue3;
                }
            }
        }
        if (aiba5 != null) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    i2 = 0;
                    break;
                }
                aiba aiba6 = (aiba) it2.next();
                if (a(aiba6, aiba2) != null) {
                    String valueOf11 = String.valueOf(aiba6.a);
                    String valueOf12 = String.valueOf(aiba6.b);
                    StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf11).length() + 17 + String.valueOf(valueOf12).length());
                    sb6.append("hasMissingData: ");
                    sb6.append(valueOf11);
                    sb6.append("-");
                    sb6.append(valueOf12);
                    sb6.toString();
                    i2 = 1;
                    break;
                }
            }
            arrayList2.add(new SleepSegmentEvent(((Long) aiba5.a).longValue(), ((Long) aiba5.b).longValue(), i2));
        }
        return arrayList2;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x03cf  */
    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x039b  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x03b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r29, long r30, long r32, defpackage.ahpf r34, boolean r35) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r7 = r30
            r9 = r34
            java.util.GregorianCalendar r2 = new java.util.GregorianCalendar
            java.util.TimeZone r3 = java.util.TimeZone.getDefault()
            r2.<init>(r3)
            r2.setTimeInMillis(r7)
            r10 = 11
            int r11 = r2.get(r10)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 45
            r2.<init>(r3)
            java.lang.String r3 = "Writing sleep confidence to HSMM: "
            r2.append(r3)
            r2.append(r1)
            r2.toString()
            long r2 = r0.c
            long r2 = r7 - r2
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MINUTES
            ayfc r5 = defpackage.ayfc.a
            ayfd r5 = r5.a()
            long r5 = r5.sleepClockAlarmConfidenceOverwriteMinutes()
            long r4 = r4.toMillis(r5)
            r12 = 0
            r14 = 1
            r15 = 0
            int r6 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r6 < 0) goto L_0x004f
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x004f
            r26 = 1
            goto L_0x0051
        L_0x004f:
            r26 = 0
        L_0x0051:
            if (r26 == 0) goto L_0x006f
            long r2 = defpackage.ayfc.g()
            int r3 = (int) r2
            int r3 = r3 + r14
            int r1 = java.lang.Math.min(r1, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 50
            r2.<init>(r3)
            java.lang.String r3 = "Clock alarm ring maybe overwrite conf: "
            r2.append(r3)
            r2.append(r1)
            r2.toString()
        L_0x006f:
            r5 = 34
            r27 = 2
            if (r35 == 0) goto L_0x0095
            ayfc r2 = defpackage.ayfc.a
            ayfd r2 = r2.a()
            long r2 = r2.sleepConfidenceFromMotion()
            int r3 = (int) r2
            int r1 = r1 + r3
            int r1 = r1 / 2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            java.lang.String r3 = "Motion overwrite conf: "
            r2.append(r3)
            r2.append(r1)
            r2.toString()
            r6 = r1
            goto L_0x0096
        L_0x0095:
            r6 = r1
        L_0x0096:
            ahoj r3 = r0.f
            ahoi r4 = new ahoi
            int[] r2 = new int[r14]
            r2[r15] = r6
            r1 = r4
            r10 = r3
            r12 = r4
            r3 = r30
            r13 = r6
            r5 = r32
            r1.<init>(r2, r3, r5)
            r10.a((defpackage.ahoi) r12)
            int r1 = r0.i
            r2 = -1
            if (r11 < r1) goto L_0x00be
            long r3 = defpackage.ayfc.g()
            int r1 = (int) r3
            if (r13 > r1) goto L_0x00be
            int r1 = r0.l
            int r1 = r1 + r14
            r0.l = r1
            goto L_0x00c5
        L_0x00be:
            int r1 = r0.i
            int r1 = r1 + r2
            if (r11 != r1) goto L_0x00c5
            r0.l = r15
        L_0x00c5:
            ahpc r1 = defpackage.ahpc.ACCEL
            float r3 = r9.f
            float r1 = r1.a(r3)
            int r1 = (int) r1
            ahpc r3 = defpackage.ahpc.LIGHT
            float r4 = r9.b
            float r3 = r3.a(r4)
            int r3 = (int) r3
            float r4 = r9.H
            r5 = 0
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x00e6
            ahpc r2 = defpackage.ahpc.LOG_BARK_DIFF
            float r2 = r2.a(r4)
            int r2 = (int) r2
            goto L_0x00e7
        L_0x00e6:
        L_0x00e7:
            ahpc r4 = defpackage.ahpc.LIGHT_DIFF
            float r5 = r9.c
            float r4 = r4.a(r5)
            int r4 = (int) r4
            ahpc r5 = defpackage.ahpc.HOUR
            float r6 = r9.K
            float r5 = r5.a(r6)
            int r5 = (int) r5
            float r6 = r9.L
            int r6 = (int) r6
            java.util.List r9 = r0.k
            r10 = 1000(0x3e8, double:4.94E-321)
            long r10 = r7 / r10
            com.google.android.gms.location.SleepClassifyEvent r12 = new com.google.android.gms.location.SleepClassifyEvent
            int r14 = (int) r10
            r16 = r12
            r17 = r14
            r18 = r13
            r19 = r1
            r20 = r3
            r21 = r2
            r22 = r4
            r23 = r5
            r24 = r26
            r25 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r9.add(r12)
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            aizl r12 = r0.h
            aixc r12 = (defpackage.aixc) r12
            android.content.Context r12 = r12.a
            java.lang.String r14 = "SLEEP_PREF_NAME"
            android.content.SharedPreferences r12 = r12.getSharedPreferences(r14, r15)
            java.lang.String r14 = "LAST_SLEEP_CLASSIFY_MILLIS"
            r22 = r5
            r23 = r6
            r5 = 0
            long r5 = r12.getLong(r14, r5)
            long r5 = r7 - r5
            long r5 = r9.toMinutes(r5)
            int r6 = (int) r5
            ayfc r5 = defpackage.ayfc.a
            ayfd r5 = r5.a()
            boolean r5 = r5.gmsSleepClassificationEventLoggingEnabled()
            if (r5 == 0) goto L_0x016d
            aicn r5 = r0.d
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            r29 = r2
            r12 = r3
            long r2 = r9.toSeconds(r7)
            aicl r9 = new aicl
            aico r17 = defpackage.aico.GMS_SLEEP_CLASSIFICATION_EVENT
            long r18 = r5.b()
            int r3 = (int) r2
            r16 = r9
            r20 = r3
            r21 = r13
            r16.<init>((defpackage.aico) r17, (long) r18, (int) r20, (int) r21)
            r5.a((defpackage.aicl) r9)
            goto L_0x0170
        L_0x016d:
            r29 = r2
            r12 = r3
        L_0x0170:
            java.util.Locale r2 = java.util.Locale.ENGLISH
            r2 = 10
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            r2[r15] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r5 = 1
            r2[r5] = r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r27] = r1
            r1 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r2[r1] = r3
            r1 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r29)
            r2[r1] = r3
            r1 = 5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r2[r1] = r3
            r1 = 6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r22)
            r2[r1] = r3
            r1 = 7
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r26)
            r2[r1] = r3
            r1 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r23)
            r2[r1] = r3
            r1 = 9
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r2[r1] = r3
            ayfc r1 = defpackage.ayfc.a
            ayfd r1 = r1.a()
            long r1 = r1.writeSleepClassifyIntervalMinutes()
            int r2 = (int) r1
            r1 = 0
            if (r6 < r2) goto L_0x0202
            java.util.List r2 = r0.k
            int r2 = r2.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 56
            r3.<init>(r4)
            java.lang.String r4 = "Sending classify events to the client. Size: "
            r3.append(r4)
            r3.append(r2)
            r3.toString()
            ahjc r2 = r0.g
            aibj r3 = new aibj
            java.util.List r4 = r0.k
            r3.<init>(r1, r4)
            aixc r2 = (defpackage.aixc) r2
            aixa r4 = r2.d
            aire r4 = (defpackage.aire) r4
            airj r5 = r4.q
            com.google.android.location.internal.server.GoogleLocationChimeraService r6 = r4.a
            aixc r4 = r4.j
            r5.a(r6, r3, r1, r4)
            r2.a((java.lang.String) r14)
            java.util.List r2 = r0.k
            r2.clear()
        L_0x0202:
            ayfc r2 = defpackage.ayfc.a
            ayfd r2 = r2.a()
            boolean r2 = r2.segmentSleepBeforeWindowEnds()
            r3 = 12
            if (r2 != 0) goto L_0x0302
            java.util.GregorianCalendar r2 = new java.util.GregorianCalendar
            java.util.TimeZone r4 = java.util.TimeZone.getDefault()
            r2.<init>(r4)
            r2.setTimeInMillis(r7)
            r4 = 11
            int r4 = r2.get(r4)
            int r2 = r2.get(r3)
            ahoj r3 = r0.f
            ahoe r3 = r3.a
            int r5 = r3.a()
            int r6 = r0.i
            int r9 = r0.j
            aizl r10 = r0.h
            ahnj r10 = r10.bk()
            if (r10 == 0) goto L_0x0242
            boolean r11 = defpackage.ayfc.i()
            if (r11 == 0) goto L_0x0242
            r11 = 1
            goto L_0x0243
        L_0x0242:
            r11 = 0
        L_0x0243:
            if (r11 == 0) goto L_0x024c
            int r6 = r10.c
            int r9 = r10.d
            r10 = r6
            r12 = r9
            goto L_0x024f
        L_0x024c:
            r10 = r9
            r9 = 0
            r12 = 0
        L_0x024f:
            long r13 = (long) r5
            ayfc r16 = defpackage.ayfc.a
            ayfd r16 = r16.a()
            long r16 = r16.minTotalEpochsBeforeSegment()
            int r18 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r18 >= 0) goto L_0x0271
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 34
            r1.<init>(r2)
            java.lang.String r2 = "Num epochs not enough: "
            r1.append(r2)
            r1.append(r5)
            r1.toString()
            return
        L_0x0271:
            aizl r5 = r0.h
            long r13 = r5.bj()
            boolean r5 = a((long) r7, (long) r13)
            if (r5 != 0) goto L_0x0301
            if (r4 < r6) goto L_0x0301
            if (r4 != r6) goto L_0x0283
            if (r2 < r9) goto L_0x0301
        L_0x0283:
            if (r11 == 0) goto L_0x0286
            goto L_0x02a6
        L_0x0286:
            int r5 = r0.l
            long r5 = (long) r5
            long r13 = defpackage.ayfc.f()
            int r9 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r9 >= 0) goto L_0x02a6
            int r1 = r0.l
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 64
            r2.<init>(r3)
            java.lang.String r3 = "Not enough awake indication. awakeCountSinceMorning: "
            r2.append(r3)
            r2.append(r1)
            r2.toString()
            return
        L_0x02a6:
            ahoj r5 = r0.f
            java.util.List r5 = r5.a((long) r7)
            java.util.List r3 = r3.b()
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x02cd
            java.util.List r3 = r0.a(r5, r3, r7)
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L_0x02c1
            goto L_0x02cd
        L_0x02c1:
            ahjc r2 = r0.g
            aibj r4 = new aibj
            r4.<init>(r3, r1)
            r1 = 1
            r2.a((defpackage.aibj) r4, (boolean) r1)
            return
        L_0x02cd:
            if (r4 <= r10) goto L_0x02d0
            goto L_0x02d5
        L_0x02d0:
            if (r4 != r10) goto L_0x0301
            if (r2 > r12) goto L_0x02d5
            goto L_0x0301
        L_0x02d5:
            com.google.android.gms.location.SleepSegmentEvent r2 = new com.google.android.gms.location.SleepSegmentEvent
            r3 = 0
            r5 = 0
            r7 = 2
            r29 = r2
            r30 = r3
            r32 = r5
            r34 = r7
            r29.<init>(r30, r32, r34)
            aicn r3 = r0.d
            int r4 = r2.c
            defpackage.ahjb.a(r3, r2, r4)
            ahjc r3 = r0.g
            aibj r4 = new aibj
            r5 = 1
            com.google.android.gms.location.SleepSegmentEvent[] r6 = new com.google.android.gms.location.SleepSegmentEvent[r5]
            r6[r15] = r2
            java.util.List r2 = java.util.Arrays.asList(r6)
            r4.<init>(r2, r1)
            r3.a((defpackage.aibj) r4, (boolean) r5)
        L_0x0301:
            return
        L_0x0302:
            aizl r2 = r0.h
            long r4 = r2.bj()
            boolean r2 = a((long) r7, (long) r4)
            if (r2 != 0) goto L_0x03fb
            aizl r2 = r0.h
            ahnj r2 = r2.bk()
            if (r2 == 0) goto L_0x031e
            boolean r4 = defpackage.ayfc.i()
            if (r4 == 0) goto L_0x031e
            r4 = 1
            goto L_0x031f
        L_0x031e:
            r4 = 0
        L_0x031f:
            ayfc r5 = defpackage.ayfc.a
            ayfd r5 = r5.a()
            long r5 = r5.sleepActivityDetectionIdleIntervalMillis()
            if (r4 == 0) goto L_0x036a
            java.util.GregorianCalendar r9 = new java.util.GregorianCalendar
            java.util.TimeZone r10 = java.util.TimeZone.getDefault()
            r9.<init>(r10)
            r9.setTimeInMillis(r7)
            int r10 = r2.c
            r11 = 11
            r9.set(r11, r10)
            int r2 = r2.d
            r9.set(r3, r2)
            r2 = 13
            r9.set(r2, r15)
            long r2 = r9.getTimeInMillis()
            long r2 = r2 - r5
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 < 0) goto L_0x036a
            ahoj r2 = r0.f
            ahoi r3 = new ahoi
            r9 = 1
            int[] r10 = new int[r9]
            r10[r15] = r13
            long r18 = r7 + r5
            long r20 = r32 + r5
            r16 = r3
            r17 = r10
            r16.<init>(r17, r18, r20)
            r2.a((defpackage.ahoi) r3)
            r2 = 1
            goto L_0x036b
        L_0x036a:
            r2 = 0
        L_0x036b:
            java.util.GregorianCalendar r3 = new java.util.GregorianCalendar
            java.util.TimeZone r9 = java.util.TimeZone.getDefault()
            r3.<init>(r9)
            r3.setTimeInMillis(r7)
            r9 = 11
            int r3 = r3.get(r9)
            if (r4 != 0) goto L_0x0392
            int r4 = r0.l
            long r9 = (long) r4
            long r11 = defpackage.ayfc.f()
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 < 0) goto L_0x0392
            int r4 = r0.i
            if (r3 >= r4) goto L_0x0390
            r4 = 0
            goto L_0x0393
        L_0x0390:
            r4 = 1
            goto L_0x0393
        L_0x0392:
            r4 = 0
        L_0x0393:
            if (r2 != 0) goto L_0x0397
            if (r4 == 0) goto L_0x03fb
        L_0x0397:
            if (r2 == 0) goto L_0x039b
            long r5 = r5 + r7
            goto L_0x039c
        L_0x039b:
            r5 = r7
        L_0x039c:
            ahoj r4 = r0.f
            java.util.List r4 = r4.a((long) r5)
            ahoj r5 = r0.f
            ahoe r5 = r5.a
            java.util.List r5 = r5.b()
            boolean r6 = r4.isEmpty()
            if (r6 != 0) goto L_0x03c7
            java.util.List r4 = r0.a(r4, r5, r7)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x03bb
            goto L_0x03c7
        L_0x03bb:
            ahjc r2 = r0.g
            aibj r3 = new aibj
            r3.<init>(r4, r1)
            r1 = 1
            r2.a((defpackage.aibj) r3, (boolean) r1)
            return
        L_0x03c7:
            if (r2 == 0) goto L_0x03ca
            goto L_0x03cf
        L_0x03ca:
            int r2 = r0.j
            if (r3 >= r2) goto L_0x03cf
            goto L_0x03fb
        L_0x03cf:
            com.google.android.gms.location.SleepSegmentEvent r2 = new com.google.android.gms.location.SleepSegmentEvent
            r3 = 0
            r5 = 0
            r7 = 2
            r29 = r2
            r30 = r3
            r32 = r5
            r34 = r7
            r29.<init>(r30, r32, r34)
            aicn r3 = r0.d
            int r4 = r2.c
            defpackage.ahjb.a(r3, r2, r4)
            ahjc r3 = r0.g
            aibj r4 = new aibj
            r5 = 1
            com.google.android.gms.location.SleepSegmentEvent[] r6 = new com.google.android.gms.location.SleepSegmentEvent[r5]
            r6[r15] = r2
            java.util.List r2 = java.util.Arrays.asList(r6)
            r4.<init>(r2, r1)
            r3.a((defpackage.aibj) r4, (boolean) r5)
        L_0x03fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahld.a(int, long, long, ahpf, boolean):void");
    }

    public final void a(long j2) {
        this.m = j2;
        aixl aixl = this.n;
        if (aixl != null && aixl.b()) {
            this.n.a();
        }
    }

    public final void a(ahpe ahpe, long j2, long j3, ahyq ahyq, ahyq ahyq2) {
        ahyq ahyq3 = ahyq;
        ahyq ahyq4 = ahyq2;
        int i2 = ahyq3.b;
        int i3 = ahyq4.b;
        if (i2 >= 50 && i3 > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put(ahup.ACCELEROMETER, ahyq3);
            hashMap.put(ahup.LIGHT, ahyq4);
            ahpf a2 = this.e.a(hashMap, (int) (j2 / 1000));
            ahpe ahpe2 = ahpe;
            int a3 = ahpe.a(a2);
            this.a.ap = j3;
            long j4 = j2 - this.m;
            long millis = TimeUnit.SECONDS.toMillis(360);
            boolean z = false;
            if (millis > 0 && j4 <= millis) {
                z = true;
            }
            a(a3, j2, j3, a2, z);
            StringBuilder sb = new StringBuilder(29);
            sb.append("Sleep confidence: ");
            sb.append(a3);
            sb.toString();
            if (this.n == null) {
                this.n = this.a.d.bl();
            }
            if (this.n.b()) {
                this.n.a(this);
            }
        }
    }
}
