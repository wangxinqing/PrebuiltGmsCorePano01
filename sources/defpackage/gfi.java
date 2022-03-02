package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: gfi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gfi {
    private final Context a;

    public gfi(Context context) {
        this.a = context;
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [android.os.IInterface] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        r4 = r0.queryLocalInterface("com.google.android.gms.auth.frp.IFrpService");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        if ((r4 instanceof defpackage.gfp) != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        r6 = new defpackage.gfn(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        r11 = r11.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        defpackage.jca.a().a(r10.a, (android.content.ServiceConnection) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        android.os.Binder.restoreCallingIdentity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r0 = r3.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (r0 == null) goto L_0x004c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.gfh r11) {
        /*
            r10 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.google.android.gms"
            android.content.Intent r0 = r0.setPackage(r1)
            java.lang.String r1 = "com.google.android.gms.auth.frp.FRP_BIND"
            android.content.Intent r0 = r0.setAction(r1)
            java.lang.String r1 = "android.intent.category.DEFAULT"
            android.content.Intent r0 = r0.addCategory(r1)
            long r1 = android.os.Binder.clearCallingIdentity()
            hwz r3 = new hwz     // Catch:{ all -> 0x0077 }
            r3.<init>()     // Catch:{ all -> 0x0077 }
            r4 = 1
            r5 = 1
        L_0x0022:
            r6 = 0
            r7 = 3
            if (r5 > r7) goto L_0x0073
            jca r8 = defpackage.jca.a()     // Catch:{ all -> 0x0077 }
            android.content.Context r9 = r10.a     // Catch:{ all -> 0x0077 }
            boolean r8 = r8.a(r9, r0, r3, r4)     // Catch:{ all -> 0x0077 }
            if (r8 == 0) goto L_0x0068
            android.os.IBinder r0 = r3.a()     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x004b
            java.lang.String r4 = "com.google.android.gms.auth.frp.IFrpService"
            android.os.IInterface r4 = r0.queryLocalInterface(r4)     // Catch:{ all -> 0x005d }
            boolean r5 = r4 instanceof defpackage.gfp     // Catch:{ all -> 0x005d }
            if (r5 != 0) goto L_0x0048
            gfn r6 = new gfn     // Catch:{ all -> 0x005d }
            r6.<init>(r0)     // Catch:{ all -> 0x005d }
            goto L_0x004c
        L_0x0048:
            r6 = r4
            gfp r6 = (defpackage.gfp) r6     // Catch:{ all -> 0x005d }
        L_0x004b:
        L_0x004c:
            java.lang.Object r11 = r11.a(r6)     // Catch:{ all -> 0x005d }
            jca r0 = defpackage.jca.a()     // Catch:{ all -> 0x0077 }
            android.content.Context r4 = r10.a     // Catch:{ all -> 0x0077 }
            r0.a((android.content.Context) r4, (android.content.ServiceConnection) r3)     // Catch:{ all -> 0x0077 }
            android.os.Binder.restoreCallingIdentity(r1)
            return r11
        L_0x005d:
            r11 = move-exception
            jca r0 = defpackage.jca.a()     // Catch:{ all -> 0x0077 }
            android.content.Context r4 = r10.a     // Catch:{ all -> 0x0077 }
            r0.a((android.content.Context) r4, (android.content.ServiceConnection) r3)     // Catch:{ all -> 0x0077 }
            throw r11     // Catch:{ all -> 0x0077 }
        L_0x0068:
            if (r5 < r7) goto L_0x006b
            goto L_0x0070
        L_0x006b:
            r6 = 100
            java.lang.Thread.sleep(r6)     // Catch:{ all -> 0x0077 }
        L_0x0070:
            int r5 = r5 + 1
            goto L_0x0022
        L_0x0073:
            android.os.Binder.restoreCallingIdentity(r1)
            return r6
        L_0x0077:
            r11 = move-exception
            android.os.Binder.restoreCallingIdentity(r1)
            goto L_0x007d
        L_0x007c:
            throw r11
        L_0x007d:
            goto L_0x007c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gfi.a(gfh):java.lang.Object");
    }

    public final boolean a() {
        try {
            Boolean bool = (Boolean) a(new gfg());
            if (bool != null) {
                return bool.booleanValue();
            }
            Log.w("FrpClient", "isChallengeRequired(): null");
            return false;
        } catch (RemoteException | InterruptedException e) {
            Log.w("FrpClient", e);
            return false;
        }
    }
}
