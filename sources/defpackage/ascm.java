package defpackage;

import android.os.WorkSource;
import java.util.List;

/* renamed from: ascm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ascm {
    public final List a;
    public final WorkSource b;
    public final asey[] c;

    public ascm(List list, WorkSource workSource, asey[] aseyArr) {
        this.a = list;
        this.b = workSource == null ? new WorkSource() : workSource;
        this.c = aseyArr;
    }
}
