package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: jkl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jkl {
    public long a = SystemClock.elapsedRealtime();
    public final ou b = new ou();
    public jkk c = null;

    public final void b(Object obj, long j) {
        jkk jkk = (jkk) this.b.get(obj);
        if (jkk == null) {
            jkk = this.c;
        }
        if (jkk == null) {
            Log.e("PeriodStatsTracker", "Couldn't find package statistics when removing location request.");
        } else if (jkk.a <= 0) {
            Log.e("PeriodStatsTracker", "Reference counting corrupted in usage statistics.");
        } else {
            jkk.c();
            int i = 0;
            while (true) {
                int i2 = jkk.a;
                if (i >= i2) {
                    break;
                }
                long[] jArr = jkk.d;
                if (j == jArr[i] && i < i2 - 1) {
                    System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
                    break;
                }
                i++;
            }
            jkk.a--;
        }
    }

    public final String toString() {
        return a((aidy) null);
    }

    public final long a() {
        return SystemClock.elapsedRealtime() - this.a;
    }

    public final String a(aidy aidy) {
        int i = this.b.h;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            if (aidy != null) {
                Object b2 = this.b.b(i2);
                String str = aidy.a;
                String[] strArr = aiei.a;
                if (!((aieh) b2).a.startsWith(str)) {
                }
            }
            arrayList.add((jkk) this.b.c(i2));
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        sb.append("Tracked duration ");
        double elapsedRealtime = (double) (SystemClock.elapsedRealtime() - this.a);
        Double.isNaN(elapsedRealtime);
        sb.append(Math.round(elapsedRealtime / 60000.0d));
        sb.append("[minutes]\n");
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            sb.append(arrayList.get(i3));
            sb.append(10);
        }
        if (this.c != null) {
            sb.append("Overflow: ");
            sb.append(this.c);
        }
        return sb.toString();
    }

    public final void a(Object obj, long j) {
        jkk jkk = (jkk) this.b.get(obj);
        if (jkk == null) {
            if (this.b.h < 40) {
                jkk = new jkk(obj);
                this.b.put(obj, jkk);
            } else {
                if (this.c == null) {
                    this.c = new jkk((Object) null);
                }
                jkk = this.c;
            }
        }
        jkk.c();
        int i = jkk.a;
        long[] jArr = jkk.d;
        int length = jArr.length;
        if (i >= length) {
            jkk.d = Arrays.copyOf(jArr, length + 3);
        }
        long[] jArr2 = jkk.d;
        int i2 = jkk.a;
        jArr2[i2] = j;
        int i3 = i2 + 1;
        jkk.a = i3;
        jkk.c++;
        if (j < jkk.e) {
            jkk.e = j;
        }
        if (j > jkk.f) {
            jkk.f = j;
        }
        if (i3 == 1) {
            jkk.b = SystemClock.elapsedRealtime();
        }
    }
}
