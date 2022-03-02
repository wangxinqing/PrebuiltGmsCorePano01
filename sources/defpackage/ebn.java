package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: ebn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ebn implements ebi {
    private final int a;
    private final eaz b;

    public ebn(eaz eaz, int i) {
        this.b = eaz;
        this.a = i;
    }

    public final void a(Context context, eaw eaw) {
        Log.e("DeleteStateOp", "API is not available anymore.");
        try {
            this.b.b(this.a);
        } catch (RemoteException e) {
        }
    }
}
