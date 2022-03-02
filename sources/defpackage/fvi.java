package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;

/* renamed from: fvi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fvi extends jba {
    private final ClientContext a;
    private final fuw d;

    public fvi(ClientContext clientContext, fuw fuw) {
        super(16, "GetSpatulaHeaderOperation");
        iva.a((Object) clientContext);
        this.a = clientContext;
        iva.a((Object) fuw);
        this.d = fuw;
    }

    public final void a(Context context) {
        String str;
        try {
            str = new fxu(context).a(this.a.f);
        } catch (eif | IOException e) {
            Log.w("AuthSpatulaProxy", "Exception while getting app cert is being ignored.");
            str = null;
        }
        try {
            this.d.a(str);
        } catch (RemoteException e2) {
            Log.e("AuthSpatulaProxy", "RemoteException");
            Log.e("AuthSpatulaProxy", Log.getStackTraceString(e2));
        }
    }
}
