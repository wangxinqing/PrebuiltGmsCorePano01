package defpackage;

import android.content.Context;
import com.google.android.gms.appusage.AppUsageIntervals;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: actd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class actd extends nis {
    private final long a;
    private final long b;
    private final List c;
    private final ebx d;

    public actd(ebx ebx, long j, long j2, List list) {
        super(193, "AppUsage");
        this.d = ebx;
        this.a = j;
        this.b = j2;
        this.c = list;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        List list;
        if (this.a > this.b || ((list = this.c) != null && list.isEmpty())) {
            throw new nja(10, "invalid parameters");
        }
        actv actv = new actv(this.a, this.b, this.c);
        actv.a();
        this.d.a(Status.a, actv.b);
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
        this.d.a(status, (AppUsageIntervals) null);
    }
}
