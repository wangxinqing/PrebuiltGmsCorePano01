package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.postsetup.ConnectionHint;

/* renamed from: acgv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acgv extends nis {
    private final acgh a;
    private final acgz b;

    public acgv(acgz acgz, acgh acgh) {
        super(76, "GetConnectionHintOperation");
        this.b = acgz;
        this.a = acgh;
    }

    public final void a(Context context) {
        this.a.a(this.b);
    }

    public final void a(Status status) {
        this.b.a(status, new ConnectionHint());
    }
}
