package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: tls  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tls implements Runnable {
    private final tlt a;
    private final tlh b;
    private final String c;

    public tls(tlt tlt, tlh tlh, String str) {
        this.a = tlt;
        this.b = tlh;
        this.c = str;
    }

    public final void run() {
        tlt tlt = this.a;
        tlh tlh = this.b;
        String str = this.c;
        if (tlh.e(str)) {
            tlt.a(tlh, str, (List) new ArrayList(tlh.n(str)));
        }
    }
}
