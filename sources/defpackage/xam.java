package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: xam  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xam extends wzu {
    private final xbw a;

    public xam(xbw xbw) {
        this.a = xbw;
    }

    public final void a(int i, Bundle bundle, DataHolder[] dataHolderArr) {
        int i2 = xbi.x;
        ConnectionResult connectionResult = new ConnectionResult(i, xbi.a(bundle));
        xbw xbw = this.a;
        if (connectionResult.b()) {
            xbw.e.a("people loaded");
        } else {
            xbw.e.a("people load failure");
        }
        if (dataHolderArr != null && dataHolderArr.length >= 2) {
            DataHolder dataHolder = dataHolderArr[0];
        }
        synchronized (xbw.a) {
            xbw.f = true;
            xbw.g = connectionResult;
            if (xbw.g.b()) {
                xbw.h = dataHolderArr[0];
                xbw.i = dataHolderArr[1];
            }
        }
        if (!xbw.d) {
            xbw.d();
        } else if (!xbw.g.b()) {
            synchronized (xbw.a) {
                xbw.j = true;
            }
            xbw.c();
        } else {
            xbw.a();
        }
    }
}
