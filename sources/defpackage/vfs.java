package defpackage;

import com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService;
import java.util.Map;
import java.util.Set;

/* renamed from: vfs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vfs extends irg {
    final /* synthetic */ NearbyMessagesChimeraService a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vfs(NearbyMessagesChimeraService nearbyMessagesChimeraService) {
        super(nearbyMessagesChimeraService, 62, new int[0]);
        this.a = nearbyMessagesChimeraService;
    }

    /* access modifiers changed from: protected */
    public final Set a() {
        return NearbyMessagesChimeraService.b;
    }

    /* access modifiers changed from: protected */
    public final Map b() {
        return NearbyMessagesChimeraService.c;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.isv r13, com.google.android.gms.common.internal.GetServiceRequest r14) {
        /*
            r12 = this;
            android.os.Bundle r0 = r14.g
            com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService r1 = r12.a
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            java.lang.String r1 = r14.d
            java.lang.String r2 = "ClientAppContext"
            android.os.Parcelable r2 = r0.getParcelable(r2)
            com.google.android.gms.nearby.messages.internal.ClientAppContext r2 = (com.google.android.gms.nearby.messages.internal.ClientAppContext) r2
            r3 = 2806(0xaf6, float:3.932E-42)
            java.lang.String r4 = "com.google.android.gms"
            r5 = 0
            java.lang.String r6 = "vfs"
            java.lang.String r7 = "a"
            java.lang.String r8 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            if (r2 == 0) goto L_0x0046
            boolean r9 = r1.equals(r4)
            if (r9 != 0) goto L_0x0029
            goto L_0x004b
        L_0x0029:
            java.lang.String r9 = r2.c
            if (r9 != 0) goto L_0x004b
            jjg r14 = defpackage.tgc.a
            anie r14 = r14.b()
            anih r14 = (defpackage.anih) r14
            r0 = 720(0x2d0, float:1.009E-42)
            anie r14 = r14.a((java.lang.String) r6, (java.lang.String) r7, (int) r0, (java.lang.String) r8)
            anih r14 = (defpackage.anih) r14
            java.lang.String r0 = "A client from GMSCore attempted to connect, but didn't set a zero party identifier. Client, you need to replace your call to addApi(Nearby.MESSAGES_API) with addApi(Nearby.MESSAGES_API, new MessagesOptions.Builder().setZeroPartyPackageName(ZERO_PARTY_PACKAGE_NAME)). We use this to keep your state separate from other GMSCore clients."
            r14.a((java.lang.String) r0)
            r13.a((int) r3, (android.os.IBinder) r5, (android.os.Bundle) r5)
            return
        L_0x0046:
            com.google.android.gms.nearby.messages.internal.ClientAppContext r2 = new com.google.android.gms.nearby.messages.internal.ClientAppContext
            r2.<init>(r1)
        L_0x004b:
            com.google.android.gms.nearby.messages.ClientAppIdentifier r1 = com.google.android.gms.nearby.messages.ClientAppIdentifier.a((java.lang.String) r1, (com.google.android.gms.nearby.messages.internal.ClientAppContext) r2)
            jjg r2 = defpackage.tgc.a
            int r2 = r14.c
            com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService r2 = r12.a
            android.content.Context r2 = r2.getBaseContext()
            boolean r9 = defpackage.jhg.b()
            r10 = 1
            if (r9 != 0) goto L_0x007c
            hya r9 = defpackage.hya.a((android.content.Context) r2)
            java.lang.String r11 = r1.d
            boolean r9 = r9.b((java.lang.String) r11)
            if (r9 != 0) goto L_0x0078
            java.lang.String r9 = r1.d
            boolean r2 = defpackage.uxv.a(r2, r9)
            if (r2 != 0) goto L_0x0078
            r2 = 4
            r1.e = r2
            goto L_0x007e
        L_0x0078:
            r2 = 2
            r1.e = r2
            goto L_0x007e
        L_0x007c:
            r1.e = r10
        L_0x007e:
            java.lang.String r2 = r1.d
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x00ad
            java.lang.String r2 = r1.d
            com.google.android.gms.nearby.messages.internal.ClientAppContext r4 = r1.c
            java.lang.String r4 = r4.b
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x00ad
            com.google.android.gms.nearby.messages.internal.ClientAppContext r2 = r1.c
            java.lang.String r4 = r2.c
            if (r4 != 0) goto L_0x00ad
            boolean r4 = r2.d
            if (r4 != 0) goto L_0x00ad
            java.lang.String r2 = r2.f
            if (r2 == 0) goto L_0x00a1
            goto L_0x00ad
        L_0x00a1:
            boolean r2 = r1.d()
            if (r2 == 0) goto L_0x00b4
            r2 = 3
            boolean r2 = r1.a((int) r2)
            goto L_0x00b2
        L_0x00ad:
            boolean r2 = r1.a((int) r10)
        L_0x00b2:
            if (r2 == 0) goto L_0x0115
        L_0x00b4:
            com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService r2 = r12.a
            vgh r2 = r2.a((com.google.android.gms.nearby.messages.ClientAppIdentifier) r1)
            r3 = -1
            java.lang.String r4 = "NearbyPermissions"
            int r0 = r0.getInt(r4, r3)
            int r0 = r2.a((int) r0)
            java.lang.String r1 = r1.c()
            boolean r3 = r2.a()
            if (r3 != 0) goto L_0x0110
            uxy r3 = r2.b()
            uyf r3 = r3.e
            boolean r3 = r3.a()
            if (r3 != 0) goto L_0x0110
            int r14 = r14.c
            boolean r14 = defpackage.uyf.a((int) r14)
            if (r14 == 0) goto L_0x00e4
            goto L_0x0110
        L_0x00e4:
            com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService r14 = r12.a
            java.lang.Object r3 = com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService.a
            vgm r14 = r14.g
            boolean r14 = r14.a(r1)
            r3 = 2802(0xaf2, float:3.926E-42)
            if (r14 == 0) goto L_0x0109
            r2.b(r0)
            com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService r14 = r12.a
            android.app.PendingIntent r14 = com.google.android.gms.nearby.messages.settings.NearbyMessagesAppOptInChimeraActivity.a(r14, r1)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "pendingIntent"
            r0.putParcelable(r1, r14)
            r13.a((int) r3, (android.os.IBinder) r5, (android.os.Bundle) r0)
            return
        L_0x0109:
            r2.b(r0)
            r13.a((int) r3, (android.os.IBinder) r5, (android.os.Bundle) r5)
            return
        L_0x0110:
            r14 = 0
            r13.a((int) r14, (android.os.IBinder) r2, (android.os.Bundle) r5)
            return
        L_0x0115:
            jjg r14 = defpackage.tgc.a
            anie r14 = r14.b()
            anih r14 = (defpackage.anih) r14
            r0 = 747(0x2eb, float:1.047E-42)
            anie r14 = r14.a((java.lang.String) r6, (java.lang.String) r7, (int) r0, (java.lang.String) r8)
            anih r14 = (defpackage.anih) r14
            java.lang.String r0 = "%s attempted to connect, but we do not trust them. See verbose logs for why."
            r14.a((java.lang.String) r0, (java.lang.Object) r1)
            r13.a((int) r3, (android.os.IBinder) r5, (android.os.Bundle) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vfs.a(isv, com.google.android.gms.common.internal.GetServiceRequest):void");
    }
}
