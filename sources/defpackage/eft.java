package defpackage;

import android.os.IBinder;
import com.google.android.gms.audiomodem.Encoding;
import com.google.android.gms.audiomodem.TokenBroadcaster$Params;
import java.util.HashSet;
import java.util.Set;

/* renamed from: eft  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class eft implements Runnable {
    private final efz a;
    private final IBinder b;
    private final efl c;
    private final String d;
    private final TokenBroadcaster$Params e;
    private final efb f;

    public eft(efz efz, IBinder iBinder, efl efl, String str, TokenBroadcaster$Params tokenBroadcaster$Params, efb efb) {
        this.a = efz;
        this.b = iBinder;
        this.c = efl;
        this.d = str;
        this.e = tokenBroadcaster$Params;
        this.f = efb;
    }

    public final void run() {
        efz efz = this.a;
        IBinder iBinder = this.b;
        efl efl = this.c;
        String str = this.d;
        TokenBroadcaster$Params tokenBroadcaster$Params = this.e;
        efb efb = this.f;
        eda eda = efz.b;
        if (!eda.b()) {
            eda.a(efb, 6501);
            return;
        }
        ecx ecx = new ecx(efl, str);
        if (eda.b.a(ecx, iBinder) != null) {
            HashSet hashSet = new HashSet();
            for (Encoding eeq : tokenBroadcaster$Params.c) {
                eeq eeq2 = r7;
                eeq eeq3 = new eeq(ecx, eeq, tokenBroadcaster$Params.b, tokenBroadcaster$Params.a, tokenBroadcaster$Params.d);
                hashSet.add(eeq2);
            }
            eda.a(ecx, (Set) hashSet);
            eda.a(efb, 0);
        }
    }
}
