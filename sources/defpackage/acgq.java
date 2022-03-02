package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;
import com.google.android.gms.smartdevice.postsetup.PostSetupAuthData;

/* renamed from: acgq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acgq extends nis {
    private final acgh a;
    private final HandshakeData b;
    private final acgz c;

    public acgq(acgz acgz, acgh acgh, HandshakeData handshakeData) {
        super(76, "AuthenticateOperation");
        this.c = acgz;
        this.a = acgh;
        this.b = handshakeData;
    }

    public final void a(Context context) {
        this.a.c(this.c, this.b);
    }

    public final void a(Status status) {
        this.c.a(status, new PostSetupAuthData());
    }
}
