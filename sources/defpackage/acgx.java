package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

/* renamed from: acgx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acgx extends nis {
    private final acgh a;
    private final acgz b;

    public acgx(acgz acgz, acgh acgh) {
        super(76, "HandshakeInitOperation");
        this.b = acgz;
        this.a = acgh;
    }

    public final void a(Context context) {
        this.a.b(this.b);
    }

    public final void a(Status status) {
        this.b.a(status, new HandshakeData());
    }
}
