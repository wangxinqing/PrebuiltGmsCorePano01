package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.GoogleCertificatesQuery;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.googlecertificates.ModuleDescriptor;
import java.util.concurrent.Callable;

/* renamed from: hxs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hxs {
    private static volatile iub a;
    private static final Object b = new Object();
    private static Context c;

    static hxv a(String str, hxm hxm, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return b(str, hxm, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static hxv b(String str, hxm hxm, boolean z, boolean z2) {
        try {
            if (a == null) {
                iva.a((Object) c);
                synchronized (b) {
                    if (a == null) {
                        a = iua.asInterface(mcx.a(c, mcx.c, ModuleDescriptor.MODULE_ID).a("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                }
            }
            iva.a((Object) c);
            try {
                if (!a.isGoogleOrPlatformSigned(new GoogleCertificatesQuery(str, hxm, z, z2), mbz.a((Object) c.getPackageManager()))) {
                    return hxv.a((Callable) new hxl(z, str, hxm));
                }
                return hxv.a;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return hxv.a("module call", e);
            }
        } catch (mct e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            String valueOf = String.valueOf(e2.getMessage());
            return hxv.a(valueOf.length() == 0 ? new String("module init: ") : "module init: ".concat(valueOf), e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void a(android.content.Context r2) {
        /*
            java.lang.Class<hxs> r0 = defpackage.hxs.class
            monitor-enter(r0)
            android.content.Context r1 = c     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0011
            if (r2 == 0) goto L_0x000f
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x001a }
            c = r2     // Catch:{ all -> 0x001a }
        L_0x000f:
            monitor-exit(r0)
            return
        L_0x0011:
            java.lang.String r2 = "GoogleCertificates"
            java.lang.String r1 = "GoogleCertificates has been initialized already"
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x001a }
            monitor-exit(r0)
            return
        L_0x001a:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hxs.a(android.content.Context):void");
    }
}
