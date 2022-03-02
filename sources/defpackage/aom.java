package defpackage;

import android.app.slice.SliceManager;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import androidx.slice.Slice;
import com.google.android.cast.JGCastService;
import java.util.Set;

/* renamed from: aom  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aom extends aok {
    private final nz b = new nz();
    private final nz c = new nz();
    private final SliceManager d;
    private final Set e;

    public aom(Context context) {
        super(context);
        this.d = (SliceManager) context.getSystemService(SliceManager.class);
        this.e = ans.a(apv.c);
    }

    public final Uri a(Intent intent) {
        return this.d.mapIntentToUri(intent);
    }

    public final void b(Uri uri) {
        try {
            this.d.unpinSlice(uri);
        } catch (IllegalStateException e2) {
        }
    }

    public final Slice c(Uri uri) {
        String authority = uri.getAuthority();
        String str = (String) this.c.get(authority);
        boolean z = false;
        if (str == null) {
            ProviderInfo resolveContentProvider = this.a.getPackageManager().resolveContentProvider(authority, 0);
            if (resolveContentProvider != null) {
                str = resolveContentProvider.packageName;
                this.c.put(authority, str);
            }
            return ans.a(this.d.bindSlice(uri, this.e), this.a);
        }
        Boolean bool = (Boolean) this.b.get(str);
        if (bool == null) {
            try {
                if ((this.a.getPackageManager().getApplicationInfo(str, 0).flags & JGCastService.FLAG_PRIVATE_DISPLAY) != 0) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
                this.b.put(str, bool);
            } catch (PackageManager.NameNotFoundException e2) {
            }
        }
        if (bool.booleanValue()) {
            return null;
        }
        return ans.a(this.d.bindSlice(uri, this.e), this.a);
    }

    public final void a(Uri uri) {
        try {
            this.d.pinSlice(uri, this.e);
        } catch (RuntimeException e2) {
            ContentProviderClient acquireContentProviderClient = this.a.getContentResolver().acquireContentProviderClient(uri);
            if (acquireContentProviderClient == null) {
                throw new IllegalArgumentException("No provider found for " + uri);
            }
            acquireContentProviderClient.release();
            throw e2;
        }
    }
}
