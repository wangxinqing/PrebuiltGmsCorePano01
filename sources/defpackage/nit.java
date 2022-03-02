package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

/* renamed from: nit  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nit {
    public final isv a;
    public final int b;

    public nit(isv isv, int i) {
        this.a = isv;
        this.b = i;
    }

    public final void a(int i, Bundle bundle) {
        try {
            this.a.a(i, (IBinder) null, bundle);
        } catch (RemoteException e) {
        }
    }

    public final void a(niz niz) {
        a(niz, (Bundle) null);
    }

    public final void a(niz niz, Bundle bundle) {
        try {
            this.a.a(0, niz.asBinder(), bundle);
        } catch (RemoteException e) {
        }
    }
}
