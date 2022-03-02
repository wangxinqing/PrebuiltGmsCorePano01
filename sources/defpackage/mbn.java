package defpackage;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.os.Build;
import android.util.Log;
import java.util.UUID;

/* renamed from: mbn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mbn {
    public static final /* synthetic */ int d = 0;
    private static final UUID e = new UUID(-1301668207276963122L, -6645017420763422227L);
    public boolean a;
    public boolean b;
    public final lyp c;
    private boolean f;

    public mbn(lyp lyp) {
        this.c = lyp;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ce A[Catch:{ all -> 0x00de }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b() {
        /*
            r8 = this;
            android.media.MediaDrm r6 = new android.media.MediaDrm     // Catch:{ Exception -> 0x00f2 }
            java.util.UUID r0 = e     // Catch:{ Exception -> 0x00f2 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x00f2 }
            r0 = 0
            byte[] r7 = r6.openSession()     // Catch:{ MediaDrmException -> 0x0052, Exception -> 0x0042, all -> 0x003f }
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch:{ MediaDrmException -> 0x003d, Exception -> 0x003b, all -> 0x0036 }
            java.lang.String r1 = "rrrr"
            byte[] r2 = r1.getBytes(r0)     // Catch:{ MediaDrmException -> 0x003d, Exception -> 0x003b, all -> 0x0036 }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ MediaDrmException -> 0x003d, Exception -> 0x003b, all -> 0x0036 }
            r5.<init>()     // Catch:{ MediaDrmException -> 0x003d, Exception -> 0x003b, all -> 0x0036 }
            java.lang.String r3 = "application/octet-stream"
            r4 = 1
            r0 = r6
            r1 = r7
            r0.getKeyRequest(r1, r2, r3, r4, r5)     // Catch:{ MediaDrmException -> 0x003d, Exception -> 0x003b, all -> 0x0036 }
            if (r7 == 0) goto L_0x0032
            java.lang.Object r0 = defpackage.mbp.a
            monitor-enter(r0)
            r6.closeSession(r7)     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            goto L_0x0032
        L_0x002f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r1
        L_0x0032:
            r6.release()
            return
        L_0x0036:
            r0 = move-exception
            r1 = r0
            r0 = r7
            goto L_0x00e1
        L_0x003b:
            r0 = move-exception
            goto L_0x0045
        L_0x003d:
            r0 = move-exception
            goto L_0x0055
        L_0x003f:
            r1 = move-exception
            goto L_0x00e1
        L_0x0042:
            r1 = move-exception
            r7 = r0
            r0 = r1
        L_0x0045:
            mbo r1 = new mbo     // Catch:{ all -> 0x004d }
            java.lang.String r2 = "Exception while opening mediaDrm session."
            r1.<init>(r2, r0)     // Catch:{ all -> 0x004d }
            throw r1     // Catch:{ all -> 0x004d }
        L_0x004d:
            r0 = move-exception
            r1 = r0
            r0 = r7
            goto L_0x00e1
        L_0x0052:
            r1 = move-exception
            r7 = r0
            r0 = r1
        L_0x0055:
            boolean r1 = r0 instanceof android.media.NotProvisionedException     // Catch:{ all -> 0x00de }
            if (r1 != 0) goto L_0x00ce
            java.lang.String r1 = "securityLevel"
            java.lang.String r1 = r6.getPropertyString(r1)     // Catch:{ Exception -> 0x00af }
            java.lang.String r2 = "numberOfOpenSessions"
            java.lang.String r2 = r6.getPropertyString(r2)     // Catch:{ Exception -> 0x00af }
            java.lang.String r3 = "maxNumberOfSessions"
            java.lang.String r3 = r6.getPropertyString(r3)     // Catch:{ Exception -> 0x00af }
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00af }
            int r4 = r4.length()     // Catch:{ Exception -> 0x00af }
            int r4 = r4 + 37
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x00af }
            int r5 = r5.length()     // Catch:{ Exception -> 0x00af }
            int r4 = r4 + r5
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x00af }
            int r5 = r5.length()     // Catch:{ Exception -> 0x00af }
            int r4 = r4 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00af }
            r5.<init>(r4)     // Catch:{ Exception -> 0x00af }
            java.lang.String r4 = "(securityLevel:"
            r5.append(r4)     // Catch:{ Exception -> 0x00af }
            r5.append(r1)     // Catch:{ Exception -> 0x00af }
            java.lang.String r1 = ",open/max sessions:"
            r5.append(r1)     // Catch:{ Exception -> 0x00af }
            r5.append(r2)     // Catch:{ Exception -> 0x00af }
            java.lang.String r1 = "/"
            r5.append(r1)     // Catch:{ Exception -> 0x00af }
            r5.append(r3)     // Catch:{ Exception -> 0x00af }
            java.lang.String r1 = ")."
            r5.append(r1)     // Catch:{ Exception -> 0x00af }
            java.lang.String r1 = r5.toString()     // Catch:{ Exception -> 0x00af }
            goto L_0x00b2
        L_0x00af:
            r1 = move-exception
            java.lang.String r1 = "(Failed to get session status)."
        L_0x00b2:
            mbo r2 = new mbo     // Catch:{ all -> 0x00de }
            java.lang.String r3 = "Unable to check/trigger provisioning right now "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00de }
            int r4 = r1.length()     // Catch:{ all -> 0x00de }
            if (r4 != 0) goto L_0x00c6
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x00de }
            r1.<init>(r3)     // Catch:{ all -> 0x00de }
            goto L_0x00ca
        L_0x00c6:
            java.lang.String r1 = r3.concat(r1)     // Catch:{ all -> 0x00de }
        L_0x00ca:
            r2.<init>(r1, r0)     // Catch:{ all -> 0x00de }
            throw r2     // Catch:{ all -> 0x00de }
        L_0x00ce:
            mbm r1 = new mbm     // Catch:{ all -> 0x00de }
            r1.<init>(r8, r6)     // Catch:{ all -> 0x00de }
            r1.start()     // Catch:{ all -> 0x00de }
            mbo r1 = new mbo     // Catch:{ all -> 0x00de }
            java.lang.String r2 = "Waiting for provisioning response from server."
            r1.<init>(r2, r0)     // Catch:{ all -> 0x00de }
            throw r1     // Catch:{ all -> 0x00de }
        L_0x00de:
            r0 = move-exception
            r1 = r0
            r0 = r7
        L_0x00e1:
            if (r0 == 0) goto L_0x00ee
            java.lang.Object r2 = defpackage.mbp.a
            monitor-enter(r2)
            r6.closeSession(r0)     // Catch:{ all -> 0x00eb }
            monitor-exit(r2)     // Catch:{ all -> 0x00eb }
            goto L_0x00ee
        L_0x00eb:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00eb }
            throw r0
        L_0x00ee:
            r6.release()
            throw r1
        L_0x00f2:
            r0 = move-exception
            int r1 = android.os.Build.VERSION.SDK_INT
            boolean r1 = r0 instanceof android.media.UnsupportedSchemeException
            if (r1 == 0) goto L_0x0101
            java.lang.String r1 = "DG.WV"
            java.lang.String r2 = "Widevine DRM not supported on this device"
            android.util.Log.w(r1, r2, r0)
            return
        L_0x0101:
            java.lang.String r1 = "DG.WV"
            java.lang.String r2 = "Unexpected exception while creating MediaDrm."
            android.util.Log.w(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mbn.b():void");
    }

    public final void a() {
        try {
            int i = Build.VERSION.SDK_INT;
            if (this.f) {
                Log.w("DG.WV", "Provisioning request denied by server.");
            } else if (!this.b || this.a) {
                b();
            } else {
                Log.i("DG.WV", "Waiting for provisioning response from server.");
            }
        } catch (mbo e2) {
            Log.w("DG.WV", "Waiting for device certificate provisioning.", e2);
            this.c.a((Throwable) e2);
        } catch (Exception | LinkageError e3) {
            Log.e("DG.WV", "Unexpected exception.", e3);
            this.c.a(e3);
        }
    }

    public final void a(byte[] bArr, MediaDrm mediaDrm) {
        try {
            mediaDrm.provideProvisionResponse(bArr);
        } catch (DeniedByServerException e2) {
            this.f = true;
            Log.e("DG.WV", "Provisioning denied by remote server", e2);
        }
    }
}
