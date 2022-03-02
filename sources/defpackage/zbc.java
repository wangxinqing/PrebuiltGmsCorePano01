package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.internal.model.apps.ApplicationEntity;

/* renamed from: zbc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zbc extends zax {
    private final ClientContext a;
    private final String b;
    private final ytk c;
    private final ApplicationEntity d;

    public zbc(ClientContext clientContext, String str, ytk ytk, ApplicationEntity applicationEntity) {
        this.a = clientContext;
        this.b = str;
        this.c = ytk;
        this.d = applicationEntity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0119, code lost:
        r1.c.a(7, (android.os.Bundle) null, r1.b, (com.google.android.gms.plus.internal.model.apps.AppAclsEntity) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0122, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0124, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0134, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0135, code lost:
        r3 = new android.os.Bundle();
        r3.putParcelable("pendingIntent", android.app.PendingIntent.getActivity(r2, 0, r0.a(), 0));
        r1.c.a(4, r3, r1.b, (com.google.android.gms.plus.internal.model.apps.AppAclsEntity) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0151, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0118 A[ExcHandler: VolleyError (e com.android.volley.VolleyError), Splitter:B:10:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0134 A[ExcHandler: UserRecoverableAuthException (r0v0 'e' com.google.android.gms.auth.UserRecoverableAuthException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r19, defpackage.yrr r20) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r5 = 0
            com.google.android.gms.common.internal.ClientContext r0 = r1.a     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            java.lang.String r13 = r1.b     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            com.google.android.gms.plus.internal.model.apps.ApplicationEntity r14 = r1.d     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            r6 = r20
            ysd r15 = r6.c     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            izb r6 = r15.i     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            r6.d()     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            java.lang.String r16 = defpackage.yxg.a(r19)     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            jhi r17 = defpackage.jhi.a()     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            jhi r12 = r17.b()     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            zdf r6 = r15.a     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            java.lang.String r9 = "shared"
            r7 = r0
            r8 = r13
            r10 = r16
            r11 = r12
            r20 = r12
            r6.a(r7, r8, r9, r10, r11, r12)     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            jhi r12 = r17.b()     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            r0.e()     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            java.lang.String r6 = "visible"
            boolean r7 = r14.j     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            if (r7 != 0) goto L_0x003d
            r9 = r6
            goto L_0x0040
        L_0x003d:
            java.lang.String r6 = "connected"
            r9 = r6
        L_0x0040:
            zdf r6 = r15.a     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            r7 = r0
            r8 = r13
            r10 = r16
            r11 = r12
            r13 = r12
            r6.a(r7, r8, r9, r10, r11, r12)     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            izb r0 = r15.i     // Catch:{ InterruptedException -> 0x0051 }
            r0.e()     // Catch:{ InterruptedException -> 0x0051 }
            goto L_0x0052
        L_0x0051:
            r0 = move-exception
        L_0x0052:
            r17.c()     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            boolean r0 = r20.d()     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            if (r0 == 0) goto L_0x0110
            boolean r0 = r13.d()     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            if (r0 == 0) goto L_0x0110
            r6 = r20
            jag r0 = r6.a((int) r5)     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            com.google.android.gms.plus.service.v1whitelisted.models.AclEntity r0 = (com.google.android.gms.plus.service.v1whitelisted.models.AclEntity) r0     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            com.google.android.gms.common.people.data.Audience r6 = defpackage.yxf.b(r0)     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            jag r7 = r13.a((int) r5)     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            com.google.android.gms.plus.service.v1whitelisted.models.AclEntity r7 = (com.google.android.gms.plus.service.v1whitelisted.models.AclEntity) r7     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            boolean r8 = r7.j     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            boolean r9 = r7.k     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            java.lang.String r10 = r7.l     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            int r10 = defpackage.ykm.a(r10)     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            java.lang.String r11 = r7.d     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            java.lang.String r12 = r7.c     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            boolean r13 = r7.e()     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            if (r13 == 0) goto L_0x00d6
            java.util.List r13 = r7.g     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x008d:
            int r3 = r13.size()     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            if (r14 >= r3) goto L_0x00d3
            java.lang.Object r3 = r13.get(r14)     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            zhy r3 = (defpackage.zhy) r3     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            java.lang.String r3 = r3.d()     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            int r4 = r3.hashCode()
            r5 = -2120936254(0xffffffff819514c2, float:-5.476374E-38)
            r20 = r13
            r13 = 1
            if (r4 == r5) goto L_0x00b9
            r5 = -393605868(0xffffffffe88a0d14, float:-5.2154226E24)
            if (r4 == r5) goto L_0x00af
        L_0x00ae:
            goto L_0x00c3
        L_0x00af:
            java.lang.String r4 = "allContacts"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00ae
            r3 = 1
            goto L_0x00c4
        L_0x00b9:
            java.lang.String r4 = "allCircles"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00ae
            r3 = 0
            goto L_0x00c4
        L_0x00c3:
            r3 = -1
        L_0x00c4:
            if (r3 == 0) goto L_0x00cb
            if (r3 == r13) goto L_0x00c9
            goto L_0x00cd
        L_0x00c9:
            r15 = 1
            goto L_0x00cd
        L_0x00cb:
            r16 = 1
        L_0x00cd:
            int r14 = r14 + 1
            r13 = r20
            r5 = 0
            goto L_0x008d
        L_0x00d3:
            r3 = r16
            goto L_0x00d8
        L_0x00d6:
            r3 = 0
            r15 = 0
        L_0x00d8:
            if (r3 == 0) goto L_0x00e0
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            r4.<init>()     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            goto L_0x00e4
        L_0x00e0:
            java.util.ArrayList r4 = defpackage.yxf.a((defpackage.zej) r7)     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
        L_0x00e4:
            ywo r5 = new ywo     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            r5.<init>()     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            r5.i = r11     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            r5.j = r12     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            r5.b = r6     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            r5.c = r4     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            r5.d = r3     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            r5.e = r15     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            r5.f = r8     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            r5.g = r9     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            r5.h = r10     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            java.lang.String r0 = r0.d     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            r5.a = r0     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            com.google.android.gms.plus.internal.model.apps.AppAclsEntity r0 = r5.a()     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            ytk r3 = r1.c     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            java.lang.String r4 = r1.b     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            r5 = 0
            r6 = 0
            r3.a(r6, r5, r4, r0)     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x010d, VolleyError -> 0x0118 }
            return
        L_0x010d:
            r0 = move-exception
            r4 = r5
            goto L_0x0125
        L_0x0110:
            com.android.volley.VolleyError r0 = new com.android.volley.VolleyError     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            java.lang.String r3 = "Interrupted."
            r0.<init>((java.lang.String) r3)     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
            throw r0     // Catch:{ UserRecoverableAuthException -> 0x0134, eif -> 0x0123, VolleyError -> 0x0118 }
        L_0x0118:
            r0 = move-exception
            ytk r0 = r1.c
            r2 = 7
            java.lang.String r3 = r1.b
            r4 = 0
            r0.a(r2, r4, r3, r4)
            return
        L_0x0123:
            r0 = move-exception
            r4 = 0
        L_0x0125:
            com.google.android.gms.common.internal.ClientContext r0 = r1.a
            android.os.Bundle r0 = defpackage.yug.a(r2, r0)
            ytk r2 = r1.c
            java.lang.String r3 = r1.b
            r5 = 4
            r2.a(r5, r0, r3, r4)
            return
        L_0x0134:
            r0 = move-exception
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            android.content.Intent r0 = r0.a()
            r4 = 0
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r2, r4, r0, r4)
            java.lang.String r2 = "pendingIntent"
            r3.putParcelable(r2, r0)
            ytk r0 = r1.c
            java.lang.String r2 = r1.b
            r4 = 4
            r5 = 0
            r0.a(r4, r3, r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zbc.a(android.content.Context, yrr):void");
    }
}
