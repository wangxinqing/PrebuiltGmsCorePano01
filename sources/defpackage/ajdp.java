package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Process;
import com.google.android.gms.common.internal.ClientContext;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajdp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajdp extends izd implements ajdi {
    public static final jjg e = jjg.a("QuakeGrpcServer", iyc.LOCATION);
    public final ThreadPoolExecutor f = new jfz(10, new LinkedBlockingQueue(4), ajdk.a);
    public final rlv g;
    public final AtomicReference h = new AtomicReference();
    public final AtomicReference j = new AtomicReference(auay.b);

    public ajdp(Context context) {
        super(context, ayel.i(), 443, Process.myUid(), 1536);
        a("X-Android-Package", context.getPackageName());
        a("X-Android-Cert", jhg.h(context, context.getPackageName()));
        this.g = new rlv(this);
        ayel.i();
    }

    public final void a(long j2, ajdo ajdo) {
        this.f.execute(new ajdn(this, j2, ajdo));
    }

    public final ClientContext c() {
        Context context = this.i;
        List d = jgu.d(context, context.getPackageName());
        if (d.isEmpty()) {
            return null;
        }
        ClientContext clientContext = new ClientContext();
        clientContext.e = this.i.getPackageName();
        clientContext.f = this.i.getPackageName();
        clientContext.b = Process.myUid();
        clientContext.d = (Account) d.get(0);
        clientContext.c = (Account) d.get(0);
        clientContext.d(ayel.g());
        return clientContext;
    }

    public final void d() {
        a("x-goog-skey");
    }
}
