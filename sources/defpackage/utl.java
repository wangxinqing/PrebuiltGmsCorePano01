package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: utl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class utl {
    private static final int b = ((int) aymi.D());
    private static baaj c;
    protected final izd a;

    public utl(izd izd) {
        this.a = izd;
    }

    public final awfv a(ClientContext clientContext, awfu awfu) {
        if (c == null) {
            c = baaj.a(baai.UNARY, "google.internal.communications.instantmessaging.v1.PeerToPeer/GetICEServer", baoq.a(awfu.c), baoq.a(awfv.b));
        }
        return (awfv) this.a.a(c, clientContext, awfu, (long) b, TimeUnit.MILLISECONDS);
    }
}
