package defpackage;

import android.os.IBinder;
import com.google.android.gms.audiomodem.Encoding;
import com.google.android.gms.audiomodem.TokenReceiver$Params;
import java.util.HashSet;
import java.util.Set;

/* renamed from: efr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class efr implements Runnable {
    private final efz a;
    private final IBinder b;
    private final efo c;
    private final String d;
    private final TokenReceiver$Params e;
    private final efb f;

    public efr(efz efz, IBinder iBinder, efo efo, String str, TokenReceiver$Params tokenReceiver$Params, efb efb) {
        this.a = efz;
        this.b = iBinder;
        this.c = efo;
        this.d = str;
        this.e = tokenReceiver$Params;
        this.f = efb;
    }

    public final void run() {
        efz efz = this.a;
        IBinder iBinder = this.b;
        efo efo = this.c;
        String str = this.d;
        TokenReceiver$Params tokenReceiver$Params = this.e;
        efb efb = this.f;
        eda eda = efz.b;
        if (!eda.a()) {
            eda.a(efb, 6500);
            return;
        }
        ecy ecy = new ecy(efo, str);
        if (eda.b.a(ecy, iBinder) != null) {
            HashSet hashSet = new HashSet();
            for (Encoding eem : tokenReceiver$Params.a) {
                hashSet.add(new eem(ecy, eem));
            }
            eda.a(ecy, (Set) hashSet);
            eda.a(efb, 0);
        }
    }
}
