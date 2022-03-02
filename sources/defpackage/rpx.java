package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.lockbox.internal.LockboxOptInFlags;

/* renamed from: rpx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rpx implements rox, icl {
    private final Status a;
    private final rox b;

    public rpx(Status status, rox rox) {
        this.a = status;
        this.b = rox;
    }

    public final Status aO() {
        return this.a;
    }

    public final String b() {
        return ((LockboxOptInFlags) this.b).a;
    }

    public final boolean c() {
        return ((LockboxOptInFlags) this.b).b;
    }

    public final boolean d() {
        return ((LockboxOptInFlags) this.b).c;
    }
}
