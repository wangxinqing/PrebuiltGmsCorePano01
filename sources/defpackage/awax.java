package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: awax  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awax extends awab {
    final /* synthetic */ awbf b;
    final /* synthetic */ awba c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awax(awba awba, String str, Object[] objArr, awbf awbf) {
        super(str, objArr);
        this.c = awba;
        this.b = awbf;
    }

    public final void a() {
        try {
            this.b.a(awak.REFUSED_STREAM);
        } catch (IOException e) {
            IOException iOException = e;
            Logger logger = awaa.a;
            Level level = Level.INFO;
            String valueOf = String.valueOf(this.c.c.e);
            logger.logp(level, "com.squareup.okhttp.internal.framed.FramedConnection$Reader$1", "execute", valueOf.length() == 0 ? new String("FramedConnection.Listener failure for ") : "FramedConnection.Listener failure for ".concat(valueOf), iOException);
            try {
                this.b.a(awak.PROTOCOL_ERROR);
            } catch (IOException e2) {
            }
        }
    }
}
