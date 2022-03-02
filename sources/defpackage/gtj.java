package defpackage;

import android.os.WorkSource;
import com.google.android.gms.beacon.BleSettings;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gtj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gtj {
    public int a = 0;
    private int b = 0;
    private int c = 1;
    private long d = 0;
    private List e = new ArrayList();
    private WorkSource f = new WorkSource();

    public gtj() {
    }

    public final BleSettings a() {
        return new BleSettings(this.b, this.c, this.d, this.e, this.f, this.a);
    }

    public final void b(int i) {
        if (i == 1 || i == 2 || i == 0 || i == 3) {
            this.b = i;
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("invalid scan mode ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void a(int i) {
        if (i == 1 || i == 2 || i == 4 || i == 6) {
            this.c = i;
            return;
        }
        StringBuilder sb = new StringBuilder(35);
        sb.append("invalid callback type - ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public gtj(BleSettings bleSettings) {
        this.b = bleSettings.a;
        this.c = bleSettings.b;
        this.d = bleSettings.c;
        this.e = bleSettings.d;
        this.f = bleSettings.e;
        this.a = bleSettings.f;
    }

    public final void a(long j) {
        if (j >= 0) {
            this.d = j;
            return;
        }
        throw new IllegalArgumentException("reportDelayMillis must be >= 0");
    }

    public final void a(WorkSource workSource) {
        if (workSource != null) {
            this.f = workSource;
            return;
        }
        throw new IllegalArgumentException("workSource must be not null");
    }

    public final void a(List list) {
        if (list != null) {
            this.e = list;
            return;
        }
        throw new IllegalArgumentException("bleFilters must be not null");
    }
}
