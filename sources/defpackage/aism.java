package defpackage;

import com.google.android.gms.location.DetectedActivity;

/* renamed from: aism  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aism {
    public final long a;
    public final long b;
    public final int[] c;

    public aism(int[] iArr, long j, long j2) {
        this.c = iArr;
        this.a = j;
        this.b = j2;
    }

    public final int a() {
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        while (i < 23) {
            int i4 = this.c[i];
            int i5 = i4 > i2 ? i4 : i2;
            if (i4 > i2) {
                i3 = i;
            }
            i++;
            i2 = i5;
        }
        return i3;
    }

    public final boolean b(int i) {
        return a(i) >= 50;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityRecognitionResult");
        sb.append(" [probableActivities=<");
        String str = "";
        for (int i = 0; i < 23; i++) {
            int i2 = this.c[i];
            if (i2 > 0) {
                sb.append(str);
                sb.append("DetectedActivity [type=");
                sb.append(DetectedActivity.a(i));
                sb.append(", confidence=");
                sb.append(i2);
                sb.append(']');
                str = ", ";
            }
        }
        sb.append(">, utcTimeMillis=");
        sb.append(this.a);
        sb.append(", elapsedRealtimeMillis=");
        sb.append(this.b);
        sb.append(']');
        return sb.toString();
    }

    public final int a(int i) {
        if (i < 23) {
            return this.c[i];
        }
        return 0;
    }
}
