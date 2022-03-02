package defpackage;

import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/* renamed from: iup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iup implements isr, iss {
    private final Context a;
    private final Map b = new ConcurrentHashMap();

    public iup(Context context) {
        this.a = context;
    }

    public final ConnectionResult a(GetServiceRequest getServiceRequest, ConnectionInfo connectionInfo) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.b.put(getServiceRequest, countDownLatch);
        try {
            jfm.b(10).execute(new iuo(this, countDownLatch, getServiceRequest));
            return ConnectionResult.a;
        } catch (OutOfMemoryError e) {
            if (awyg.a.a().b()) {
                jjc.a();
            }
            throw e;
        }
    }

    public final void b(GetServiceRequest getServiceRequest, int i) {
        int i2 = getServiceRequest.b;
        if (i2 > 0) {
            iyc a2 = iyc.a(i2);
            if (a2 == null) {
                a2 = iyc.UNKNOWN;
            }
            new ivh(getServiceRequest.c, getServiceRequest.d, a2).a(this.a, i);
        }
    }

    public final boolean a(GetServiceRequest getServiceRequest, int i) {
        CountDownLatch countDownLatch = (CountDownLatch) this.b.remove(getServiceRequest);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        b(getServiceRequest, i);
        return true;
    }
}
