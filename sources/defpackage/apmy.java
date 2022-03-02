package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: apmy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apmy extends apna {
    private final ContentResolver a;
    private final Context b;

    public apmy(Context context) {
        this.b = context;
        this.a = context.getContentResolver();
    }

    public final void a(String str, Uri uri) {
        ContentProviderClient acquireUnstableContentProviderClient = this.a.acquireUnstableContentProviderClient(uri);
        try {
            Bundle bundle = new Bundle();
            bundle.putParcelable("slice_uri", uri);
            bundle.putString("provider_pkg", this.b.getPackageName());
            bundle.putString("pkg", str);
            acquireUnstableContentProviderClient.call("grant_perms", (String) null, bundle);
        } catch (RemoteException e) {
            Log.e("ContentValues", "Unable to get slice descendants", e);
        } catch (Throwable th) {
            acquireUnstableContentProviderClient.release();
            throw th;
        }
        acquireUnstableContentProviderClient.release();
    }
}
