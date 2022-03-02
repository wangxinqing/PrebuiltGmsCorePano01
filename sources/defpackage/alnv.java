package defpackage;

import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;

/* renamed from: alnv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alnv implements alom {
    private final alpl a;
    private final List b = new ArrayList();
    private final alsu c;
    private final lkq d;

    public alnv(lkq lkq, alsx alsx, alpl alpl) {
        this.d = lkq;
        this.c = new alus((alst) null, alsx, -1, (alui) null);
        this.a = alpl;
    }

    public final void a(alop alop) {
        while (alop.c()) {
            try {
                amiw amiw = alop.b().g;
                if (amiw != null) {
                    ((alus) this.c).b(amiw);
                    this.b.add(amiw);
                }
            } catch (Exception e) {
                alnw.a.logp(Level.WARNING, "com.google.apps.brix.api.client.cache.sync.OtStateSyncer$SynchronousOperationReceivedHandler", "onChangeEvent", "Failed to apply operation", e);
                this.a.b();
                this.d.b(new alpj(500));
                return;
            }
        }
        if (!alop.c() && !alop.f()) {
            this.a.b();
            lkq lkq = this.d;
            List unmodifiableList = Collections.unmodifiableList(this.b);
            alrt g = alop.g();
            alsw alsw = alsw.b;
            alsu alsu = this.c;
            lkq.c = true;
            if (!lkq.a.b) {
                alsw = alsw.a;
            }
            try {
                new lkv(lkq.a, lkq.e.c, unmodifiableList, g, alsw, alsu, false).a(lkq.e.b);
            } catch (RemoteException | nja e2) {
                lkr.a.c("RealtimeDocumentSyncer", "Failed to send updates to server.", e2);
            }
            lkq.b.countDown();
        }
    }
}
