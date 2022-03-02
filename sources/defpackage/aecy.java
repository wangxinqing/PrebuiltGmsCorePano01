package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aecy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aecy {
    private static boolean b = false;
    private static aecy c;
    public final Map a = Collections.synchronizedMap(new HashMap());
    private final Context d;
    private ContentProviderClient e;

    private aecy(Context context, ContentProviderClient contentProviderClient) {
        this.d = context;
        this.e = contentProviderClient;
    }

    public static synchronized aecy a(Context context) {
        synchronized (aecy.class) {
            if (!b) {
                ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(aecz.a.getAuthority(), 0);
                aecy aecy = null;
                if (resolveContentProvider != null) {
                    if (!resolveContentProvider.packageName.equals("com.google.android.gms")) {
                        String str = resolveContentProvider.packageName;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 85);
                        sb.append("Package ");
                        sb.append(str);
                        sb.append(" is invalid for instant apps content provider; instant apps will be disabled.");
                        Log.e("IAMetadataClient", sb.toString());
                    } else {
                        int i = Build.VERSION.SDK_INT;
                        ContentProviderClient b2 = b(context);
                        if (b2 != null) {
                            aecy = new aecy(context, b2);
                        }
                    }
                }
                c = aecy;
                b = true;
                return aecy;
            }
            aecy aecy2 = c;
            return aecy2;
        }
    }

    public static synchronized void a() {
        synchronized (aecy.class) {
            c = null;
            b = false;
        }
    }

    private static ContentProviderClient b(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver != null) {
            return contentResolver.acquireUnstableContentProviderClient(aecz.a);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized android.content.ContentProviderClient a(android.content.ContentProviderClient r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            android.content.ContentProviderClient r0 = r1.e     // Catch:{ all -> 0x001c }
            if (r2 != r0) goto L_0x001a
            android.content.Context r2 = r1.d     // Catch:{ all -> 0x001c }
            android.content.ContentProviderClient r2 = b(r2)     // Catch:{ all -> 0x001c }
            if (r2 == 0) goto L_0x0018
            android.content.ContentProviderClient r0 = r1.e     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x0014
            r0.release()     // Catch:{ all -> 0x001c }
        L_0x0014:
            r1.e = r2     // Catch:{ all -> 0x001c }
        L_0x0016:
            monitor-exit(r1)
            return r2
        L_0x0018:
            r2 = 0
            goto L_0x0016
        L_0x001a:
            monitor-exit(r1)
            return r0
        L_0x001c:
            r2 = move-exception
            monitor-exit(r1)
            goto L_0x0020
        L_0x001f:
            throw r2
        L_0x0020:
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aecy.a(android.content.ContentProviderClient):android.content.ContentProviderClient");
    }

    public final Bundle a(String str, Bundle bundle) {
        ContentProviderClient contentProviderClient;
        Bundle bundle2;
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            synchronized (this) {
                contentProviderClient = this.e;
            }
            if (contentProviderClient == null) {
                bundle2 = this.d.getContentResolver().call(aecz.a, str, (String) null, bundle);
            } else {
                bundle2 = contentProviderClient.call(str, (String) null, bundle);
            }
        } catch (DeadObjectException e2) {
            ContentProviderClient a2 = a(contentProviderClient);
            if (a2 != null) {
                bundle2 = a2.call(str, (String) null, bundle);
            } else {
                throw e2;
            }
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
        Binder.restoreCallingIdentity(clearCallingIdentity);
        if (bundle2 != null) {
            return bundle2;
        }
        throw new RemoteException();
    }
}
