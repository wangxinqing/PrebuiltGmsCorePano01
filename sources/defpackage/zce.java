package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.internal.model.apps.ApplicationEntity;
import java.util.List;

/* renamed from: zce  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zce extends zax {
    private final ClientContext a;
    private final String b;
    private final ApplicationEntity c;
    private final List d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final ytk i;

    public zce(ClientContext clientContext, String str, ApplicationEntity applicationEntity, List list, boolean z, boolean z2, boolean z3, boolean z4, ytk ytk) {
        this.a = clientContext;
        this.b = str;
        this.c = applicationEntity;
        this.d = list;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = ytk;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r17, defpackage.yrr r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r3 = 0
            r5 = 0
            com.google.android.gms.common.internal.ClientContext r7 = r1.a     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            java.lang.String r8 = r1.b     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            com.google.android.gms.plus.internal.model.apps.ApplicationEntity r0 = r1.c     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            java.util.List r6 = r1.d     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            boolean r9 = r1.e     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            boolean r10 = r1.f     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            boolean r11 = r1.g     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            boolean r12 = r1.h     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            r13 = r18
            ysd r13 = r13.c     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            r14.<init>()     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            java.lang.String r15 = "allCircles"
            if (r11 != 0) goto L_0x0024
            goto L_0x003d
        L_0x0024:
            if (r9 == 0) goto L_0x0036
            zhx r6 = new zhx     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            r6.<init>()     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            r6.b(r15)     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            zhy r6 = r6.a()     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            r14.add(r6)     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            goto L_0x003d
        L_0x0036:
            java.util.ArrayList r6 = defpackage.yxf.a((java.util.List) r6)     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            r14.addAll(r6)     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
        L_0x003d:
            java.lang.String r6 = "visible"
            zei r9 = new zei     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            r9.<init>()     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            boolean r0 = r0.j     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            java.lang.String r4 = "allContacts"
            if (r0 != 0) goto L_0x004c
            r0 = r6
            goto L_0x007c
        L_0x004c:
            java.lang.String r0 = "connected"
            if (r10 != 0) goto L_0x0051
            goto L_0x0062
        L_0x0051:
            if (r12 == 0) goto L_0x0062
            zhx r6 = new zhx     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            r6.<init>()     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            r6.b(r4)     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            zhy r6 = r6.a()     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            r14.add(r6)     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
        L_0x0062:
            r9.a = r11     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            java.util.Set r6 = r9.c     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            r10 = 10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            r6.add(r10)     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            r9.b = r12     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            java.util.Set r6 = r9.c     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            r10 = 11
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            r6.add(r10)     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
        L_0x007c:
            r9.a((java.util.List) r14)     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            zej r6 = r9.a()     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            java.lang.String r10 = defpackage.yxg.a(r17)     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            zdf r9 = r13.a     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            r11 = r6
            com.google.android.gms.plus.service.v1whitelisted.models.AclEntity r11 = (com.google.android.gms.plus.service.v1whitelisted.models.AclEntity) r11     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            r6 = r9
            r9 = r0
            com.google.android.gms.plus.service.v1whitelisted.models.AclEntity r0 = r6.a(r7, r8, r9, r10, r11)     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            boolean r6 = r0.e()     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            if (r6 == 0) goto L_0x00da
            java.util.List r6 = r0.g     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x009d:
            int r10 = r6.size()     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            if (r7 >= r10) goto L_0x00d9
            java.lang.Object r10 = r6.get(r7)     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            zhy r10 = (defpackage.zhy) r10     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            java.lang.String r10 = r10.d()     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            int r11 = r10.hashCode()
            r12 = -2120936254(0xffffffff819514c2, float:-5.476374E-38)
            r13 = 1
            if (r11 == r12) goto L_0x00c5
            r12 = -393605868(0xffffffffe88a0d14, float:-5.2154226E24)
            if (r11 == r12) goto L_0x00bd
        L_0x00bc:
            goto L_0x00cd
        L_0x00bd:
            boolean r10 = r10.equals(r4)
            if (r10 == 0) goto L_0x00bc
            r10 = 1
            goto L_0x00ce
        L_0x00c5:
            boolean r10 = r10.equals(r15)
            if (r10 == 0) goto L_0x00bc
            r10 = 0
            goto L_0x00ce
        L_0x00cd:
            r10 = -1
        L_0x00ce:
            if (r10 == 0) goto L_0x00d5
            if (r10 == r13) goto L_0x00d3
            goto L_0x00d6
        L_0x00d3:
            r8 = 1
            goto L_0x00d6
        L_0x00d5:
            r9 = 1
        L_0x00d6:
            int r7 = r7 + 1
            goto L_0x009d
        L_0x00d9:
            goto L_0x00dc
        L_0x00da:
            r8 = 0
            r9 = 0
        L_0x00dc:
            if (r9 == 0) goto L_0x00e4
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            r4.<init>()     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            goto L_0x00e8
        L_0x00e4:
            java.util.ArrayList r4 = defpackage.yxf.a((defpackage.zej) r0)     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
        L_0x00e8:
            ywo r6 = new ywo     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            r6.<init>()     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            java.lang.String r7 = r0.d     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            r6.i = r7     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            java.lang.String r7 = r0.c     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            r6.j = r7     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            r6.c = r4     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            r6.d = r9     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            r6.e = r8     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            boolean r4 = r0.j     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            r6.f = r4     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            boolean r4 = r0.k     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            r6.g = r4     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            java.lang.String r0 = r0.l     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            int r0 = defpackage.ykm.a(r0)     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            r6.h = r0     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            com.google.android.gms.plus.internal.model.apps.AppAclsEntity r0 = r6.a()     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            ytk r4 = r1.i     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            r4.a((int) r5, (android.os.Bundle) r3, (com.google.android.gms.plus.internal.model.apps.AppAclsEntity) r0)     // Catch:{ UserRecoverableAuthException -> 0x012b, eif -> 0x011d, VolleyError -> 0x0115 }
            return
        L_0x0115:
            r0 = move-exception
            ytk r0 = r1.i
            r2 = 7
            r0.a((int) r2, (android.os.Bundle) r3)
            return
        L_0x011d:
            r0 = move-exception
            com.google.android.gms.common.internal.ClientContext r0 = r1.a
            android.os.Bundle r0 = defpackage.yug.a(r2, r0)
            ytk r2 = r1.i
            r3 = 4
            r2.a((int) r3, (android.os.Bundle) r0)
            return
        L_0x012b:
            r0 = move-exception
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            android.content.Intent r0 = r0.a()
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r2, r5, r0, r5)
            java.lang.String r2 = "pendingIntent"
            r3.putParcelable(r2, r0)
            ytk r0 = r1.i
            r2 = 4
            r0.a((int) r2, (android.os.Bundle) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zce.a(android.content.Context, yrr):void");
    }
}
