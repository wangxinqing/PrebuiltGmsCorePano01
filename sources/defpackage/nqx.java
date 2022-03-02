package defpackage;

import android.content.pm.PackageManager;
import com.google.android.gms.gcm.GcmChimeraService;

/* renamed from: nqx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class nqx implements nti {
    private final nrj a;

    public nqx(nrj nrj) {
        this.a = nrj;
    }

    public final void a(nth nth) {
        Integer num;
        nrj nrj = this.a;
        String string = nth.d.getString("google.message_id");
        GcmChimeraService.a("Acked %s %s", nth.c, string);
        nud nud = nrj.h;
        ntx ntx = nth.c;
        if (nud.a) {
            nua nua = nud.c;
            nub nub = nud.b;
            try {
                int d = nua.d(ntx);
                synchronized (nua) {
                    Integer num2 = (Integer) nua.b.get(ntx);
                    if (num2 != null) {
                        if (num2.intValue() == d) {
                        }
                    }
                    nua.b.put(ntx, Integer.valueOf(d));
                    nvp nvp = nua.a;
                    aucd f = nua.f(ntx);
                    if (f.c) {
                        f.c();
                        f.c = false;
                    }
                    nrm nrm = (nrm) f.b;
                    nrm nrm2 = nrm.h;
                    nrm.a |= 4;
                    nrm.d = d;
                    nvp.a((aucj) (nrm) f.i());
                    if (num2 == null) {
                        nub.a("CLIENT_QUEUE_NEW_SUPPORTED_APP_INSTANCE");
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
            nud.d.a(ntx, string);
            nud.a();
            nub nub2 = nud.b;
            synchronized (nub2) {
                num = (Integer) nub2.b.remove(string);
            }
            if (num != null) {
                int intValue = num.intValue();
                if (intValue == -1) {
                    nub2.b(ntx, string, 4, 0);
                    nub2.a("CLIENT_QUEUE_ACKED_RETRY_ON_RESTART");
                } else if (intValue != 0) {
                    nub2.b(ntx, string, 3, num.intValue());
                    if (axlc.j()) {
                        nub2.a.a.d("CLIENT_QUEUE_ACKED_RETRY_WITH_BACKOFF").a(num.intValue());
                    }
                } else {
                    nub2.b(ntx, string, 2, 0);
                    nub2.a("CLIENT_QUEUE_ACKED_INITIAL_BROADCAST");
                }
            } else {
                nub2.b(ntx, string, 1, 0);
            }
        }
    }
}
