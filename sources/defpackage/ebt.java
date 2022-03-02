package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: ebt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ebt implements ebi {
    private final ClientContext a;
    private final eaz b;

    public ebt(ClientContext clientContext, eaz eaz) {
        this.a = clientContext;
        this.b = eaz;
    }

    public final void a(Context context, eaw eaw) {
        int i;
        try {
            ClientContext clientContext = this.a;
            eaw.a.lock();
            Log.e("AppStateAgent", "API is not available anymore.");
            if (!awhx.c()) {
                context.getContentResolver().delete(ebc.b.buildUpon().appendPath("account_name").appendPath(clientContext.b()).build(), (String) null, (String[]) null);
            }
            eaw.a.unlock();
            i = 0;
        } catch (eif e) {
            Log.e("WipeStateOp", "Auth error while performing operation, requesting reconnect", e);
            i = 2;
        } catch (ebg e2) {
            throw null;
        } catch (RuntimeException e3) {
            Log.e("WipeStateOp", "Runtime exception while performing operation", e3);
            Log.wtf("WipeStateOp", "Killing (on development devices) due to RuntimeException", e3);
            i = 1;
        } catch (Throwable th) {
            eaw.a.unlock();
            throw th;
        }
        try {
            this.b.a(i);
        } catch (RemoteException e4) {
        }
    }
}
