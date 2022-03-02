package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: hpl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hpl extends hst implements niz {
    private final Context a;

    public hpl(Context context) {
        this.a = context;
    }

    public final void a(hsr hsr) {
        try {
            Integer a2 = hpk.a(this.a);
            if (a2 != null) {
                hsr.a(Status.a, a2.intValue());
            } else {
                hsr.a(Status.c, -1);
            }
        } catch (RemoteException e) {
            Log.e("BootCountService", "Could not send a status back in the callback", e);
        }
    }
}
