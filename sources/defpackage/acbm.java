package defpackage;

import android.os.Handler;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;

/* renamed from: acbm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acbm extends tjd {
    public final Handler a;
    public final tjd b;

    public acbm(Handler handler, tjd tjd) {
        this.a = handler;
        this.b = tjd;
    }

    public final void a(String str, PayloadTransferUpdate payloadTransferUpdate) {
        this.a.post(new acbl(this, str, payloadTransferUpdate));
    }

    public final void a(String str, tjc tjc) {
        this.a.post(new acbk(this, str, tjc));
    }
}
