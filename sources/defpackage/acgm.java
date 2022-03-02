package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

/* renamed from: acgm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acgm extends nis {
    private final acgh a;
    private final HandshakeData b;
    private final acgz c;

    public acgm(acgz acgz, acgh acgh, HandshakeData handshakeData) {
        super(190, "HandshakeFinishOperation");
        this.c = acgz;
        this.a = acgh;
        this.b = handshakeData;
    }

    public final void a(Context context) {
        this.a.b(this.c, this.b);
    }

    public final void a(Status status) {
        this.c.c(status, new HandshakeData());
    }
}
