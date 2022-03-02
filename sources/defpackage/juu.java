package defpackage;

import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import java.util.ArrayList;

/* renamed from: juu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class juu {
    private final ArrayList a = new ArrayList();
    private int[] b = null;

    public final TimeFilterImpl a() {
        return new TimeFilterImpl(this.a, this.b);
    }

    public final void b() {
        this.a.add(new TimeFilterImpl.Interval(0, Long.MAX_VALUE));
    }

    public final void a(long j) {
        if (j < 0) {
            bxl.b("TimeFilter.Builder", "stopTimeMillis must be >= 0.  Clamping to 0.");
            j = 0;
        }
        this.a.add(new TimeFilterImpl.Interval(-1, j));
    }

    public final void a(long j, long j2) {
        if (j < 0) {
            bxl.b("TimeFilter.Builder", "startTimeMillis must be >= 0.  Clamping to 0.");
            j = 0;
        }
        if (j2 < 0) {
            bxl.b("TimeFilter.Builder", "stopTimeMillis must be >= 0.  Clamping to 0.");
            j2 = 0;
        }
        this.a.add(new TimeFilterImpl.Interval(j, j2));
    }

    public final void a(int... iArr) {
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            int i2 = iArr[i];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder(29);
                sb.append("Unknown time type=");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.b = iArr;
    }
}
