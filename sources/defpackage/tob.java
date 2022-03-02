package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: tob  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tob {
    public final tnq a;
    public final aoru b = tid.b();
    public final Map c = new nz();
    public final aoru d = tid.a(50);
    public final aoru e = tid.a(50);

    public tob(tnq tnq) {
        this.a = tnq;
    }

    public final List a(List list, byte[] bArr, long j, long j2, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            tnm a2 = this.a.a(str2);
            if (a2 == null) {
                ((anih) tky.a.b()).a("EndpointManager failed to find EndpointChannel over which to write %s at offset %d of Payload %d to endpoint %s", str, Long.valueOf(j2), Long.valueOf(j), str2);
                arrayList.add(str2);
            } else {
                try {
                    a2.a(bArr);
                } catch (IOException e2) {
                    anih anih = (anih) tky.a.b();
                    anih.a((Throwable) e2);
                    anih.a("EndpointManager failed to write %s at offset %d of Payload %d to endpoint %s", str, Long.valueOf(j2), Long.valueOf(j), str2);
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final void b(asav asav, tny tny) {
        a(new tns(this, asav, tny));
    }

    /* access modifiers changed from: package-private */
    public final void a(asav asav, tny tny) {
        a(new tnr(this, asav, tny));
    }

    public final void a(Runnable runnable) {
        this.b.execute(runnable);
    }

    /* access modifiers changed from: package-private */
    public final void a(tlh tlh, String str) {
        a(new tnw(this, tlh, str));
    }

    public final void a(tlh tlh, String str, boolean z) {
        if (this.a.b(str)) {
            tlh.r(str);
            CountDownLatch countDownLatch = new CountDownLatch(((ou) this.c).h);
            for (tny a2 : this.c.values()) {
                a2.a(tlh, str, countDownLatch);
            }
            thr.a("waitForEndpointDisconnectionProcessing", countDownLatch, aymi.a.a().aA());
            tlh.a(str, z);
            jjg jjg = tky.a;
        }
    }
}
