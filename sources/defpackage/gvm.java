package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* renamed from: gvm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gvm extends jba {
    private final ifu a;
    private final int d;

    protected gvm(ifu ifu, int i) {
        super(130, "CheckinResult");
        this.d = i;
        this.a = ifu;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        ifu ifu = this.a;
        if (ifu != null) {
            gwd.a("CheckinApi:end", Integer.valueOf(ifu.hashCode()), Long.valueOf(SystemClock.elapsedRealtime()));
            this.a.a(new Status(this.d));
        }
    }
}
