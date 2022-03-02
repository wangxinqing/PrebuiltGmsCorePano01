package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: abrt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abrt implements Runnable {
    final /* synthetic */ abru a;

    public abrt(abru abru) {
        this.a = abru;
    }

    public final void run() {
        abru abru = this.a;
        absf absf = abru.b;
        abxe abxe = abru.a;
        Bundle bundle = abru.c;
        iva.a(absf.c);
        absf.b.e(2);
        acaj.a(absf.b, 8);
        abqd abqd = absf.d.k;
        if (abqd != null) {
            try {
                iva.a(abqd.h, (Object) "Bootstrap needs to first be paused before it can be resumed.");
                if (bundle.containsKey("pendingIntentResult")) {
                    if (abqd.j != null) {
                        abqd.d.a("Resuming bootstrap, pending intents are completed", new Object[0]);
                        bundle.getInt("pendingIntentResult");
                        if (abqd.j.e.decrementAndGet() == 0) {
                            abqd.h = false;
                        }
                    }
                }
                abqd.h = false;
                abpt abpt = abqd.i;
                if (abpt == null) {
                    abqd.d.e("resumeBootstrap called but SourceAccountTransferController was null!", new Object[0]);
                } else {
                    abpt.a(bundle.getParcelableArrayList("accounts"));
                }
            } finally {
                abra.h(abxe, new Status(0));
            }
        } else {
            abra.a.e("No connection in progress.", new Object[0]);
            abra.h(abxe, new Status(10567));
        }
    }
}
