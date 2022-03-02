package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: ajar  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajar implements Cloneable, ahzw {
    public static final int[] h = {0, 1, 3, 4, 7, 8};
    private static final Comparator o = new ajap();
    private static final List t = Collections.singletonList(new DetectedActivity(3, 100));
    public final aizy c;
    public final baps d = new bapp();
    public final HashSet e = new HashSet();
    public final TreeMap f = new TreeMap();
    public final ajaq g;
    public long i = -1;
    public long j = -1;
    public long k = -1;
    public int l = ahnk.UNKNOWN.am;
    public long m = -1;
    public long n = -1;
    private final ajqp p;
    private final ahki q;
    private final Class r;
    private final List s;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ajar(defpackage.aizy r4, defpackage.ajqp r5, defpackage.ahki r6, java.lang.Class r7, defpackage.ajaq r8) {
        /*
            r3 = this;
            r3.<init>()
            bapp r0 = new bapp
            r0.<init>()
            r3.d = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r3.e = r0
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r3.f = r0
            r0 = -1
            r3.i = r0
            r3.j = r0
            r3.k = r0
            ahnk r2 = defpackage.ahnk.UNKNOWN
            int r2 = r2.am
            r3.l = r2
            r3.m = r0
            r3.n = r0
            r3.c = r4
            r3.p = r5
            r3.q = r6
            r3.r = r7
            r3.g = r8
            java.lang.String r4 = r8.a
            r5 = 0
            r6 = 3
            r7 = 1
            r8 = -1
            if (r4 == 0) goto L_0x00b0
            int r0 = r4.length()
            if (r0 == 0) goto L_0x00b0
            int r0 = r4.hashCode()
            r1 = 4
            r2 = 2
            switch(r0) {
                case -2026200673: goto L_0x0074;
                case -1584802318: goto L_0x006a;
                case 79227272: goto L_0x0060;
                case 1071255167: goto L_0x0056;
                case 1836798297: goto L_0x004c;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x007e
        L_0x004c:
            java.lang.String r0 = "WALKING"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x007e
            r0 = 3
            goto L_0x007f
        L_0x0056:
            java.lang.String r0 = "ON_BICYCLE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x007e
            r0 = 1
            goto L_0x007f
        L_0x0060:
            java.lang.String r0 = "STILL"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x007e
            r0 = 4
            goto L_0x007f
        L_0x006a:
            java.lang.String r0 = "IN_VEHICLE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x007e
            r0 = 0
            goto L_0x007f
        L_0x0074:
            java.lang.String r0 = "RUNNING"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x007e
            r0 = 2
            goto L_0x007f
        L_0x007e:
            r0 = -1
        L_0x007f:
            if (r0 == 0) goto L_0x00af
            if (r0 == r7) goto L_0x00ad
            if (r0 == r2) goto L_0x00aa
            if (r0 == r6) goto L_0x00a8
            if (r0 == r1) goto L_0x00a6
            int r5 = r4.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r5 = r5 + 31
            r6.<init>(r5)
            java.lang.String r5 = "Mock activity "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = " is not supported"
            r6.append(r4)
            r6.toString()
            r5 = -1
            goto L_0x00b1
        L_0x00a6:
            r5 = 3
            goto L_0x00b1
        L_0x00a8:
            r5 = 7
            goto L_0x00b1
        L_0x00aa:
            r5 = 8
            goto L_0x00b1
        L_0x00ad:
            r5 = 1
            goto L_0x00b1
        L_0x00af:
            goto L_0x00b1
        L_0x00b0:
            r5 = -1
        L_0x00b1:
            if (r5 == r8) goto L_0x00c1
            com.google.android.gms.location.DetectedActivity r4 = new com.google.android.gms.location.DetectedActivity
            r6 = 100
            r4.<init>(r5, r6)
            java.util.List r4 = java.util.Collections.singletonList(r4)
        L_0x00be:
            r3.s = r4
            return
        L_0x00c1:
            r4 = 0
            goto L_0x00be
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajar.<init>(aizy, ajqp, ahki, java.lang.Class, ajaq):void");
    }

    private final int a(long j2, int i2) {
        while (true) {
            baps baps = this.d;
            if (i2 >= ((bapp) baps).b || baps.a(i2) > j2) {
                return i2;
            }
            i2++;
        }
        return i2;
    }

    private final ActivityRecognitionResult b(ahzv ahzv) {
        ActivityRecognitionResult activityRecognitionResult;
        ahzv ahzv2 = ahzv;
        amrl.b(this.i != -1, (Object) "onFlushCompleted must called before getting the results.");
        if (this.f.isEmpty()) {
            return null;
        }
        List list = this.s;
        if (list != null) {
            return a(new ActivityRecognitionResult(list, this.j, this.i, this.l, (Bundle) null), ahzv2);
        }
        if ((this.l >> 16) != 19) {
            Map.Entry lastEntry = this.f.lastEntry();
            amrl.a((Object) lastEntry);
            return a(new ActivityRecognitionResult((List) lastEntry.getValue(), this.j, this.i, this.l, (Bundle) null), ahzv2);
        } else if (SystemClock.elapsedRealtime() - this.k > this.g.c) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = this.k;
            long j3 = this.g.c;
            StringBuilder sb = new StringBuilder(154);
            sb.append("CHRE AR is idling, millisSinceBoot=");
            sb.append(elapsedRealtime);
            sb.append(", lastResultFlushedTimeSinceBootMs=");
            sb.append(j2);
            sb.append(", chreArTimeoutToIdleMs=");
            sb.append(j3);
            sb.toString();
            return a(new ActivityRecognitionResult(t, this.j, this.i, ahnk.CHRE_IDLE.am, e()), ahzv2);
        } else {
            if (this.q != null && this.l != ahnk.CHRE_DNN_GRU_V1.am && this.l != ahnk.CHRE_CNN_GRU_V1.am) {
                this.q.a();
                if (this.r != ahjq.class || (activityRecognitionResult = this.q.a(this.f, System.currentTimeMillis(), this.j, this.i, e())) == null) {
                    Iterator it = this.f.descendingMap().entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        Map.Entry lastEntry2 = this.f.lastEntry();
                        amrl.a((Object) lastEntry2);
                        if (((Long) lastEntry2.getKey()).longValue() - ((Long) entry.getKey()).longValue() > this.g.d) {
                            break;
                        }
                        ActivityRecognitionResult activityRecognitionResult2 = new ActivityRecognitionResult((List) entry.getValue(), this.j, this.i, this.l, e());
                        String valueOf = String.valueOf(activityRecognitionResult2);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 25);
                        sb2.append("adding to majority vote: ");
                        sb2.append(valueOf);
                        sb2.toString();
                        ActivityRecognitionResult a = this.q.a(activityRecognitionResult2);
                        if (a != null) {
                            activityRecognitionResult = a;
                            break;
                        }
                    }
                }
                return a(activityRecognitionResult, ahzv2);
            }
            Map.Entry lastEntry3 = this.f.lastEntry();
            amrl.a((Object) lastEntry3);
            activityRecognitionResult = new ActivityRecognitionResult((List) lastEntry3.getValue(), this.j, this.i, this.l, e());
            return a(activityRecognitionResult, ahzv2);
        }
    }

    private final Bundle e() {
        long j2 = this.n;
        if (j2 == -1) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("test_sensor_lag", j2);
        return bundle;
    }

    public final long c() {
        long j2 = -1;
        if (!this.d.isEmpty()) {
            baps baps = this.d;
            j2 = Math.max(-1, baps.a(((bapp) baps).b - 1));
        }
        return !this.f.isEmpty() ? Math.max(j2, ((Long) this.f.lastKey()).longValue()) : j2;
    }

    /* renamed from: d */
    public final ajar clone() {
        return new ajar(this);
    }

    private final int a(long j2, int i2, long j3, List list) {
        int i3 = i2;
        long j4 = j3;
        baps baps = this.d;
        if (i3 >= ((bapp) baps).b) {
            return i3;
        }
        long a = baps.a(i3);
        if (a >= j4) {
            return i3;
        }
        list.add(new ActivityRecognitionResult(new DetectedActivity(5, 100), j2 + a, a, this.l, (Bundle) null));
        return a(j4, i3);
    }

    private final ActivityRecognitionResult a(ActivityRecognitionResult activityRecognitionResult, ahzv ahzv) {
        return ahzv.a(this.p.c(activityRecognitionResult));
    }

    public final List a(long j2) {
        return a(j2, 60000, ahzw.a);
    }

    public final List a(long j2, long j3, ahzv ahzv) {
        long j4;
        ArrayList arrayList;
        long j5;
        long j6;
        int i2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        long j7;
        long j8;
        int i3;
        long j9;
        long j10 = j2;
        ahzv ahzv2 = ahzv;
        amrl.b(this.i != -1, (Object) "onFlushCompleted must called before getting the results.");
        if (!this.f.isEmpty() && this.i - ((Long) this.f.firstKey()).longValue() > 600000) {
            Locale locale = Locale.US;
            Object[] objArr = {Long.valueOf(this.i), this.f.firstKey()};
        }
        if (this.f.ceilingEntry(Long.valueOf(1 + j10)) == null && this.i - j10 < 1000) {
            return Collections.emptyList();
        }
        long min = Math.min(j3 / 2, 10000);
        int a = a(j10, 0);
        long e2 = ajbt.e();
        Locale locale2 = Locale.US;
        Object[] objArr2 = {Long.valueOf(j2), new Date(e2 + j10), Long.valueOf(j3), this.f};
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList(this.f.entrySet());
        long j11 = this.i;
        long j12 = j10 + j3;
        int i4 = a;
        long j13 = j10;
        int i5 = 0;
        long j14 = j12;
        long j15 = j13;
        while (j14 <= j11) {
            int i6 = i4;
            int i7 = i5;
            while (true) {
                if (i7 >= arrayList5.size()) {
                    j4 = j11;
                    arrayList = arrayList5;
                    j5 = min;
                    j6 = j14;
                    i2 = i7;
                    break;
                }
                Map.Entry entry = (Map.Entry) arrayList5.get(i7);
                long longValue = ((Long) entry.getKey()).longValue();
                if (longValue > j14) {
                    j4 = j11;
                    arrayList = arrayList5;
                    j5 = min;
                    j6 = j14;
                    i2 = i7;
                    break;
                }
                if (longValue > j15 + 500) {
                    ActivityRecognitionResult a2 = a(new ActivityRecognitionResult((List) entry.getValue(), e2 + longValue, longValue, this.l, e()), ahzv2);
                    j8 = min;
                    j9 = j14;
                    i3 = i7;
                    j7 = j11;
                    arrayList3 = arrayList5;
                    i6 = a(e2, i6, longValue, arrayList4);
                    if (a2 != null) {
                        arrayList4.add(a2);
                    }
                } else {
                    j7 = j11;
                    arrayList3 = arrayList5;
                    j8 = min;
                    j9 = j14;
                    i3 = i7;
                }
                i7 = i3 + 1;
                arrayList5 = arrayList3;
                j14 = j9;
                min = j8;
                j11 = j7;
            }
            int i8 = i2 - 1;
            if (i8 < 0) {
                arrayList2 = arrayList;
            } else if (i8 >= arrayList.size()) {
                arrayList2 = arrayList;
            } else if (arrayList4.isEmpty() || ((ActivityRecognitionResult) arrayList4.get(arrayList4.size() - 1)).c != j6) {
                if (this.i - j6 > j5) {
                    arrayList2 = arrayList;
                    Map.Entry entry2 = (Map.Entry) arrayList2.get(i8);
                    List list = (List) entry2.getValue();
                    if (!list.isEmpty()) {
                        if (((DetectedActivity) list.get(0)).a() == 3 && j6 - ((Long) entry2.getKey()).longValue() > 480000) {
                        }
                    }
                    int a3 = a(e2, i6, j6, arrayList4);
                    ActivityRecognitionResult a4 = a(new ActivityRecognitionResult((List) entry2.getValue(), e2 + j6, j6, this.l, e()), ahzv2);
                    if (a4 != null) {
                        arrayList4.add(a4);
                    }
                    i4 = a3;
                    j15 = j6;
                    j14 = j6 + j3;
                    i5 = i2;
                    arrayList5 = arrayList2;
                    min = j5;
                    j11 = j4;
                } else {
                    arrayList2 = arrayList;
                }
                i4 = i6;
                j14 = j6 + j3;
                i5 = i2;
                arrayList5 = arrayList2;
                min = j5;
                j11 = j4;
            } else {
                arrayList2 = arrayList;
            }
            StringBuilder sb = new StringBuilder(34);
            sb.append("No result at: ");
            sb.append(j6);
            sb.toString();
            i4 = i6;
            j14 = j6 + j3;
            i5 = i2;
            arrayList5 = arrayList2;
            min = j5;
            j11 = j4;
        }
        ActivityRecognitionResult b = b(ahzv2);
        if (b != null) {
            a(e2, i4, b.c, arrayList4);
            arrayList4.add(b);
        }
        Collections.sort(arrayList4, o);
        return arrayList4;
    }

    private ajar(ajar ajar) {
        this.c = ajar.c;
        baps baps = this.d;
        baps baps2 = ajar.d;
        bapp bapp = (bapp) baps;
        int i2 = bapp.b;
        ((bapn) baps).d(i2);
        bapp bapp2 = (bapp) baps2;
        int i3 = bapp2.b;
        if (i3 != 0) {
            bapp.h(bapp.b + i3);
            int i4 = bapp.b;
            if (i2 != i4) {
                long[] jArr = bapp.a;
                System.arraycopy(jArr, i2, jArr, i2 + i3, i4 - i2);
            }
            long[] jArr2 = bapp.a;
            int length = jArr2.length;
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException("Offset (" + i2 + ") is negative");
            } else if (i3 >= 0) {
                int i5 = i2 + i3;
                if (i5 <= length) {
                    System.arraycopy(bapp2.a, 0, jArr2, i2, i3);
                    bapp.b += i3;
                } else {
                    throw new ArrayIndexOutOfBoundsException("Last index (" + i5 + ") is greater than array length (" + length + ")");
                }
            } else {
                throw new IllegalArgumentException("Length (" + i3 + ") is negative");
            }
        }
        this.e.addAll(ajar.e);
        this.f.putAll(ajar.f);
        this.i = ajar.i;
        this.j = ajar.j;
        this.k = ajar.k;
        this.p = ajar.p;
        this.q = ajar.q;
        this.r = ajar.r;
        this.s = ajar.s;
        this.l = ajar.l;
        this.m = ajar.m;
        this.n = ajar.n;
        this.g = ajar.g;
    }

    public final List b() {
        return a(ahzw.a);
    }

    public final List a(ahzv ahzv) {
        boolean z;
        boolean z2;
        ActivityRecognitionResult activityRecognitionResult;
        int i2;
        int i3 = 1;
        if (this.i != -1) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z, (Object) "onFlushCompleted must called before getting the results.");
        if (this.i != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        amrl.b(z2, (Object) "onFlushCompleted must called before getting the results.");
        if (!this.d.isEmpty()) {
            long a = this.d.a(0);
            activityRecognitionResult = new ActivityRecognitionResult(new DetectedActivity(5, 100), ajbt.e() + a, a, this.l, (Bundle) null);
        } else {
            activityRecognitionResult = null;
        }
        ActivityRecognitionResult b = b(ahzv);
        if (activityRecognitionResult == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if (b == null) {
            i3 = 0;
        }
        ArrayList arrayList = new ArrayList(i2 + i3);
        if (activityRecognitionResult != null) {
            arrayList.add(activityRecognitionResult);
        }
        if (b != null) {
            arrayList.add(b);
        }
        Collections.sort(arrayList, o);
        return Collections.unmodifiableList(arrayList);
    }

    public final List a(Collection collection) {
        ArrayList arrayList = new ArrayList();
        int[] iArr = h;
        int length = iArr.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            int intValue = ((!collection.contains(Integer.valueOf(i4)) && (!collection.isEmpty() || i4 != 4)) ? this.g.j : this.g.i).intValue();
            arrayList.add(new DetectedActivity(i4, intValue));
            if (i4 == 7 || i4 == 8) {
                i2 += intValue;
            }
        }
        arrayList.add(new DetectedActivity(2, i2));
        Collections.sort(arrayList, DetectedActivity.a);
        return arrayList;
    }

    public final boolean a() {
        return !this.d.isEmpty() || !this.f.isEmpty();
    }
}
