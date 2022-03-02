package defpackage;

import android.os.WorkSource;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.gms.location.DetectedActivity;
import java.util.HashSet;
import java.util.Set;

/* renamed from: rck  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rck {
    public long a = Long.MIN_VALUE;
    public long b = 0;
    public boolean c = true;
    public WorkSource d;
    public String e;
    public boolean f = false;
    public String g;
    private Set h;

    public final ActivityRecognitionRequest a() {
        boolean z;
        int[] iArr;
        int i = 0;
        if (this.a != Long.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z, (Object) "Must set intervalMillis.");
        long j = this.a;
        boolean z2 = this.c;
        WorkSource workSource = this.d;
        String str = this.e;
        Set set = this.h;
        if (set == null || set.isEmpty()) {
            iArr = null;
        } else {
            Set<Integer> set2 = this.h;
            int[] iArr2 = new int[set2.size()];
            for (Integer intValue : set2) {
                iArr2[i] = intValue.intValue();
                i++;
            }
            iArr = iArr2;
        }
        return new ActivityRecognitionRequest(j, z2, workSource, str, iArr, this.f, this.g, this.b);
    }

    public final void b(long j) {
        boolean z = j >= 0;
        StringBuilder sb = new StringBuilder(70);
        sb.append("Max report latency can't be negative, but it was: ");
        sb.append(j);
        iva.b(z, sb.toString());
        this.b = j;
    }

    public final void a(int i) {
        int[] iArr = DetectedActivity.b;
        int length = iArr.length;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                if (i == iArr[i2]) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        StringBuilder sb = new StringBuilder(67);
        sb.append("Requested activity ");
        sb.append(i);
        sb.append(" is not a valid non-default activity.");
        iva.b(z, sb.toString());
        if (this.h == null) {
            this.h = new HashSet();
        }
        this.h.add(Integer.valueOf(i));
    }

    public final void a(long j) {
        iva.b(j >= 0, "intervalMillis can't be negative.");
        this.a = j;
    }
}
