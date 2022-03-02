package defpackage;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Random;

/* renamed from: ahxv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahxv {
    public final ahyw a;
    public final amzy b;
    public final int c;
    private final long d;

    public ahxv(ahyw ahyw, amzy amzy, int i, Calendar calendar, long j) {
        long j2;
        long j3;
        ahyw ahyw2;
        this.a = ahyw;
        this.d = j;
        ArrayList arrayList = new ArrayList();
        if (amzy != null) {
            anhk i2 = amzy.listIterator();
            ahyw ahyw3 = null;
            while (i2.hasNext()) {
                ahyw ahyw4 = (ahyw) i2.next();
                long max = Math.max(ahyw4.a, ahyw.a);
                long min = Math.min(ahyw4.b, ahyw.b);
                if (min > max) {
                    ahyw2 = new ahyw(max, min);
                } else {
                    ahyw2 = null;
                }
                if (!(ahyw2 == null || ahyw3 == null)) {
                    long j4 = ahyw2.a;
                    long j5 = ahyw3.b;
                    if (j4 < j5) {
                        long j6 = ahyw2.b;
                        ahyw2 = j5 < j6 ? new ahyw(j5, j6) : null;
                    }
                }
                if (ahyw2 != null) {
                    arrayList.add(ahyw2);
                    ahyw3 = ahyw2;
                }
            }
        }
        if (arrayList.size() == 0) {
            arrayList.add(ahyw);
        }
        amzy a2 = amzy.a((Collection) arrayList);
        if (a2.size() == 1 && ((ahyw) a2.get(0)).equals(ahyw)) {
            i = 1;
        }
        this.c = i;
        int size = a2.size();
        long j7 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            j7 += ((ahyw) a2.get(i3)).a();
        }
        Calendar calendar2 = (Calendar) calendar.clone();
        ahyw.a(calendar2, this.a.a);
        double nextDouble = new Random(this.d ^ calendar2.getTimeInMillis()).nextDouble();
        long j8 = this.a.a;
        double d2 = (double) (j7 / 2);
        Double.isNaN(d2);
        long j9 = (long) (nextDouble * d2);
        int size2 = a2.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                j2 = Long.MAX_VALUE;
                break;
            }
            ahyw ahyw5 = (ahyw) a2.get(i4);
            if (j8 > ahyw5.a) {
                long j10 = ahyw5.b;
                if (j8 < j10) {
                    j3 = j10 - j8;
                } else {
                    j3 = 0;
                }
            } else {
                j3 = ahyw5.a();
            }
            if (j3 > j9) {
                j2 = Math.max(ahyw5.a, j8) + j9;
                break;
            } else {
                j9 -= j3;
                i4++;
            }
        }
        ArrayList arrayList2 = new ArrayList(a2.size());
        int size3 = a2.size();
        for (int i5 = 0; i5 < size3; i5++) {
            ahyw ahyw6 = (ahyw) a2.get(i5);
            if (ahyw6.b > j2) {
                if (ahyw6.a(j2)) {
                    arrayList2.add(new ahyw(j2, ahyw6.b));
                } else {
                    arrayList2.add(ahyw6);
                }
            }
        }
        this.b = amzy.a((Collection) arrayList2);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String str = this.c != 1 ? "REFINED_BY_IN_OUTDOOR" : "FULL";
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 75 + String.valueOf(valueOf2).length() + str.length());
        sb.append("SensorCollectionTimeSpan [targetTimeSpan=");
        sb.append(valueOf);
        sb.append(", subTimeSpans=");
        sb.append(valueOf2);
        sb.append(", subTimeSpanType=");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
