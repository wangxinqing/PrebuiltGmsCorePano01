package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: ebl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ebl implements ebi {
    private final String a;

    protected ebl(String str, ClientContext clientContext) {
        iva.a((Object) str);
        this.a = str;
        iva.a((Object) clientContext);
    }

    /* access modifiers changed from: protected */
    public abstract DataHolder a();

    public final void a(Context context, eaw eaw) {
        DataHolder dataHolder;
        try {
            dataHolder = a();
        } catch (eif e) {
            Log.e(this.a, "Auth error while performing operation, requesting reconnect", e);
            dataHolder = DataHolder.b(2);
        } catch (ebg e2) {
            throw null;
        } catch (RuntimeException e3) {
            Log.e(this.a, "Runtime exception while performing operation", e3);
            Log.wtf(this.a, "Killing (on development devices) due to RuntimeException", e3);
            dataHolder = DataHolder.b(1);
        }
        try {
            a(dataHolder);
        } catch (RemoteException e4) {
        } catch (Throwable th) {
            dataHolder.close();
            throw th;
        }
        dataHolder.close();
    }

    /* access modifiers changed from: protected */
    public abstract void a(DataHolder dataHolder);
}
