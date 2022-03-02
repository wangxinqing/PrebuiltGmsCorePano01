package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: acte  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acte extends nis {
    private final long a;
    private final long b;
    private final List c;
    private final ebx d;

    public acte(ebx ebx, long j, long j2, List list) {
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
        this.d.a(Status.a, actw.a(this.a, this.b, this.c));
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
        this.d.a(status, (List) null);
    }
}
