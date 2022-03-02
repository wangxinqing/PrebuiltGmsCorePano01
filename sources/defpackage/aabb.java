package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;

/* renamed from: aabb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aabb extends nis {
    private final Intent a;
    private final aaav b;

    public aabb(Intent intent, aaav aaav) {
        super(218, "HandleSchedulerIntent");
        this.a = intent;
        this.b = aaav;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        new aabh(context, this.a).run();
        this.b.a(Status.a);
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
        this.b.a(status);
    }
}
