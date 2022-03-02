package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

/* renamed from: jbb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jbb {
    private final isv a;

    public jbb(isv isv) {
        this.a = isv;
    }

    public final void a(int i, Bundle bundle) {
        try {
            this.a.a(i, (IBinder) null, bundle);
        } catch (RemoteException e) {
        }
    }

    public final void a(jbh jbh) {
        try {
            this.a.a(0, jbh.asBinder(), (Bundle) null);
        } catch (RemoteException e) {
        }
    }
}
