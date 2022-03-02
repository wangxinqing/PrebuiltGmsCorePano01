package defpackage;

import com.google.android.gms.nearby.bootstrap.request.ContinueConnectRequest;
import java.util.Locale;

/* renamed from: tfn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tfn implements Runnable {
    final /* synthetic */ ContinueConnectRequest a;
    final /* synthetic */ tfq b;

    public tfn(tfq tfq, ContinueConnectRequest continueConnectRequest) {
        this.b = tfq;
        this.a = continueConnectRequest;
    }

    public final void run() {
        tdf a2 = this.b.a();
        if (a2 != null) {
            ContinueConnectRequest continueConnectRequest = this.a;
            String str = continueConnectRequest.b;
            teb teb = continueConnectRequest.c;
            if (a2.c()) {
                tdl tdl = a2.d;
                if (!(tdl.k == null || tdl.s == null || a2.e != 2)) {
                    if (!tcv.e(str.toLowerCase(Locale.US))) {
                        a2.a(teb, 2989);
                        return;
                    }
                    a2.j.a(9, (tdk) a2.d);
                    a2.d.b(str);
                    a2.b(teb);
                    return;
                }
            }
            a2.a(teb, 2982);
        }
    }
}
