package defpackage;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.database.ContentObserver;
import android.net.Uri;
import android.util.Log;
import com.google.android.chimera.SliceProvider;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* renamed from: bst  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bst extends SliceProvider {
    private final bsq a;
    private final String[] b;
    private SliceManager c;

    public bst(bsq bsq, String[] strArr) {
        this.b = (strArr == null || strArr.length == 0) ? null : strArr;
        this.a = bsq;
    }

    private final void a(Uri uri) {
        if (uri != null) {
            for (String str : this.b) {
                if (getContext().checkCallingPermission(str) == 0) {
                    this.c.grantSlicePermission(str, uri);
                    getContext().getContentResolver().notifyChange(uri, (ContentObserver) null);
                    return;
                }
            }
        }
    }

    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        this.a.attachInfo(context, providerInfo);
        super.attachInfo(context, providerInfo);
        this.c = (SliceManager) context.getSystemService(SliceManager.class);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle call(java.lang.String r5, java.lang.String r6, android.os.Bundle r7) {
        /*
            r4 = this;
            java.lang.String[] r0 = r4.b
            if (r0 == 0) goto L_0x0047
            java.lang.String r0 = "bind_slice"
            boolean r0 = r0.equals(r5)
            r1 = 0
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = "map_slice"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = "slice_intent"
            android.os.Parcelable r0 = r7.getParcelable(r0)
            android.content.Intent r0 = (android.content.Intent) r0
            if (r0 == 0) goto L_0x0024
            android.net.Uri r1 = defpackage.bsq.b()
            goto L_0x0032
        L_0x0024:
            goto L_0x0032
        L_0x0025:
            if (r7 == 0) goto L_0x0031
            java.lang.String r0 = "slice_uri"
            android.os.Parcelable r0 = r7.getParcelable(r0)
            r1 = r0
            android.net.Uri r1 = (android.net.Uri) r1
            goto L_0x0032
        L_0x0031:
        L_0x0032:
            if (r1 == 0) goto L_0x0047
            android.app.slice.SliceManager r0 = r4.c
            int r2 = android.os.Binder.getCallingPid()
            int r3 = android.os.Binder.getCallingUid()
            int r0 = r0.checkSlicePermission(r1, r2, r3)
            if (r0 == 0) goto L_0x0047
            r4.a(r1)
        L_0x0047:
            android.os.Bundle r5 = super.call(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bst.call(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    public final Slice onBindSlice(Uri uri, Set set) {
        ans.b(set);
        try {
            return ans.a(this.a.a(uri));
        } catch (Exception e) {
            String uri2 = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(uri2).length() + 27);
            sb.append("Slice with URI ");
            sb.append(uri2);
            sb.append(" is invalid.");
            Log.wtf("ChimeraSliceProviderWra", sb.toString(), e);
            return null;
        }
    }

    public final boolean onCreate() {
        return true;
    }

    public final PendingIntent onCreatePermissionRequest(Uri uri) {
        if (this.b != null) {
            a(uri);
        }
        return super.onCreatePermissionRequest(uri);
    }

    public final Uri onMapIntentToUri(Intent intent) {
        return bsq.b();
    }

    public final void onSlicePinned(Uri uri) {
        this.a.c(uri);
    }

    public final void onSliceUnpinned(Uri uri) {
        this.a.b(uri);
        this.a.d(uri);
    }

    public final Collection onGetSliceDescendants(Uri uri) {
        return Collections.emptyList();
    }
}
