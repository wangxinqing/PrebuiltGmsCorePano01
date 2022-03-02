package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import androidx.slice.Slice;
import java.util.Set;

/* renamed from: aol  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aol extends aok {
    public aol(Context context) {
        super(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bb, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.net.Uri a(android.content.Intent r8) {
        /*
            r7 = this;
            android.content.Context r0 = r7.a
            java.lang.String r1 = "intent"
            defpackage.ot.a((java.lang.Object) r8, (java.lang.Object) r1)
            android.content.ComponentName r1 = r8.getComponent()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x001d
            java.lang.String r1 = r8.getPackage()
            if (r1 != 0) goto L_0x001d
            android.net.Uri r1 = r8.getData()
            if (r1 != 0) goto L_0x001d
            r1 = 0
            goto L_0x001e
        L_0x001d:
            r1 = 1
        L_0x001e:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r8
            java.lang.String r4 = "Slice intent must be explicit %s"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            defpackage.ot.a((boolean) r1, (java.lang.Object) r3)
            android.content.ContentResolver r1 = r0.getContentResolver()
            android.net.Uri r3 = r8.getData()
            r4 = 0
            if (r3 == 0) goto L_0x0045
            java.lang.String r5 = r1.getType(r3)
            java.lang.String r6 = "vnd.android.slice"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            goto L_0x00f8
        L_0x0045:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r8)
            java.lang.String r5 = "android.app.slice.category.SLICE"
            boolean r6 = r3.hasCategory(r5)
            if (r6 != 0) goto L_0x0055
            r3.addCategory(r5)
        L_0x0055:
            android.content.pm.PackageManager r5 = r0.getPackageManager()
            java.util.List r3 = r5.queryIntentContentProviders(r3, r2)
            if (r3 == 0) goto L_0x00c6
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L_0x0066
            goto L_0x00c6
        L_0x0066:
            java.lang.Object r0 = r3.get(r2)
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ProviderInfo r0 = r0.providerInfo
            java.lang.String r0 = r0.authority
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            java.lang.String r3 = "content"
            android.net.Uri$Builder r2 = r2.scheme(r3)
            android.net.Uri$Builder r0 = r2.authority(r0)
            android.net.Uri r0 = r0.build()
            apa r0 = defpackage.apb.a((android.content.ContentResolver) r1, (android.net.Uri) r0)     // Catch:{ RemoteException -> 0x00bc }
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x00b0 }
            r1.<init>()     // Catch:{ all -> 0x00b0 }
            java.lang.String r2 = "slice_intent"
            r1.putParcelable(r2, r8)     // Catch:{ all -> 0x00b0 }
            android.content.ContentProviderClient r8 = r0.a     // Catch:{ all -> 0x00b0 }
            java.lang.String r2 = "map_only"
            java.lang.String r3 = "supports_versioned_parcelable"
            android.os.Bundle r8 = r8.call(r2, r3, r1)     // Catch:{ all -> 0x00b0 }
            if (r8 == 0) goto L_0x00ab
            java.lang.String r1 = "slice"
            android.os.Parcelable r8 = r8.getParcelable(r1)     // Catch:{ all -> 0x00b0 }
            r3 = r8
            android.net.Uri r3 = (android.net.Uri) r3     // Catch:{ all -> 0x00b0 }
            r0.close()     // Catch:{ RemoteException -> 0x00bc }
            goto L_0x0043
        L_0x00ab:
            r0.close()     // Catch:{ RemoteException -> 0x00bc }
            r3 = r4
            goto L_0x00f8
        L_0x00b0:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x00b7 }
            goto L_0x00bb
        L_0x00b7:
            r0 = move-exception
            defpackage.apev.a((java.lang.Throwable) r8, (java.lang.Throwable) r0)     // Catch:{ RemoteException -> 0x00bc }
        L_0x00bb:
            throw r1     // Catch:{ RemoteException -> 0x00bc }
        L_0x00bc:
            r8 = move-exception
            java.lang.String r0 = "SliceProviderCompat"
            java.lang.String r1 = "Unable to map slice"
            android.util.Log.e(r0, r1, r8)
            r3 = r4
            goto L_0x00f8
        L_0x00c6:
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 128(0x80, float:1.794E-43)
            android.content.pm.ResolveInfo r8 = r0.resolveActivity(r8, r1)
            if (r8 == 0) goto L_0x00f7
            android.content.pm.ActivityInfo r0 = r8.activityInfo
            if (r0 == 0) goto L_0x00f7
            android.content.pm.ActivityInfo r0 = r8.activityInfo
            android.os.Bundle r0 = r0.metaData
            if (r0 == 0) goto L_0x00f7
            android.content.pm.ActivityInfo r0 = r8.activityInfo
            android.os.Bundle r0 = r0.metaData
            java.lang.String r1 = "android.metadata.SLICE_URI"
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x00ea
            r3 = r4
            goto L_0x00f8
        L_0x00ea:
            android.content.pm.ActivityInfo r8 = r8.activityInfo
            android.os.Bundle r8 = r8.metaData
            java.lang.String r8 = r8.getString(r1)
            android.net.Uri r8 = android.net.Uri.parse(r8)
            return r8
        L_0x00f7:
            r3 = r4
        L_0x00f8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aol.a(android.content.Intent):android.net.Uri");
    }

    public final void b(Uri uri) {
        Context context = this.a;
        Set set = apv.c;
        apa a = apb.a(context.getContentResolver(), uri);
        try {
            Bundle bundle = new Bundle();
            bundle.putParcelable("slice_uri", uri);
            bundle.putString("pkg", context.getPackageName());
            apb.a(bundle, set);
            a.a.call("unpin_slice", "supports_versioned_parcelable", bundle);
        } catch (RemoteException e) {
            Log.e("SliceProviderCompat", "Unable to unpin slice", e);
        } catch (Throwable th) {
            a.close();
            throw th;
        }
        a.close();
    }

    public final Slice c(Uri uri) {
        return apb.a(this.a, uri, apv.c);
    }

    public final void a(Uri uri) {
        Context context = this.a;
        Set set = apv.c;
        apa a = apb.a(context.getContentResolver(), uri);
        try {
            Bundle bundle = new Bundle();
            bundle.putParcelable("slice_uri", uri);
            bundle.putString("pkg", context.getPackageName());
            apb.a(bundle, set);
            a.a.call("pin_slice", "supports_versioned_parcelable", bundle);
        } catch (RemoteException e) {
            Log.e("SliceProviderCompat", "Unable to pin slice", e);
        } catch (Throwable th) {
            a.close();
            throw th;
        }
        a.close();
    }
}
