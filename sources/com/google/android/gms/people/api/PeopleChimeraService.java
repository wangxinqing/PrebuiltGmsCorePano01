package com.google.android.gms.people.api;

import java.util.Collections;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PeopleChimeraService extends nio {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: xpm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: wmu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: wmu} */
    /* JADX WARNING: type inference failed for: r13v2, types: [niz] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.nit r12, com.google.android.gms.common.internal.GetServiceRequest r13) {
        /*
            r11 = this;
            java.lang.String r0 = "PeopleChimeraService"
            java.lang.String r1 = "onService. callbacks = %s, request = %s"
            defpackage.xdt.a((java.lang.String) r0, (java.lang.String) r1, (java.lang.Object) r12, (java.lang.Object) r13)
            int r1 = r13.c
            if (r1 <= 0) goto L_0x00f6
            int r1 = r13.b
            iyc r1 = defpackage.iyc.a(r1)
            iyc r2 = defpackage.iyc.UNKNOWN
            java.lang.Object r1 = defpackage.amrh.a(r1, r2)
            iyc r1 = (defpackage.iyc) r1
            int r1 = r1.ordinal()
            r2 = 206(0xce, float:2.89E-43)
            if (r1 == r2) goto L_0x0097
            java.lang.String r6 = r13.d
            android.os.Bundle r13 = r13.g
            java.lang.String r1 = "social_client_application_id"
            r2 = 0
            if (r13 == 0) goto L_0x002f
            java.lang.String r3 = r13.getString(r1)
            goto L_0x0030
        L_0x002f:
            r3 = r2
        L_0x0030:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            r5 = 0
            if (r4 == 0) goto L_0x0074
            anaf r3 = defpackage.ycf.a
            java.lang.Object r3 = r3.get(r6)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x0046
            java.lang.String r2 = r3.toString()
            goto L_0x0047
        L_0x0046:
        L_0x0047:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x0072
            aywy r2 = defpackage.aywy.a
            ayxk r2 = r2.a()
            boolean r2 = r2.b()
            java.lang.String r3 = "Please use new constructor and specify app ID.  Talk to the team"
            if (r2 == 0) goto L_0x006c
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r5] = r3
            r3 = 1
            r2[r3] = r6
            java.lang.String r3 = "%s: package=%s"
            defpackage.xdt.a((java.lang.String) r0, (java.lang.String) r3, (java.lang.Object[]) r2)
            java.lang.String r0 = "0"
            r8 = r0
            goto L_0x0075
        L_0x006c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>(r3)
            throw r12
        L_0x0072:
            r8 = r2
            goto L_0x0075
        L_0x0074:
            r8 = r3
        L_0x0075:
            java.lang.String r0 = "real_client_package_name"
            java.lang.String r7 = r13.getString(r0)
            java.lang.String r0 = "support_new_image_callback"
            boolean r9 = r13.getBoolean(r0, r5)
            r13.getString(r1)
            wmu r13 = new wmu
            nix r5 = defpackage.nix.a()
            isv r0 = r12.a
            boolean r10 = r0.a()
            r3 = r13
            r4 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x00a8
        L_0x0097:
            xpm r0 = new xpm
            nix r1 = new nix
            com.google.android.gms.common.apiservice.LifecycleSynchronizer r2 = r11.e
            aoru r3 = r11.f
            r1.<init>(r11, r2, r3)
            java.lang.String r13 = r13.d
            r0.<init>(r11, r1, r13)
            r13 = r0
        L_0x00a8:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String[] r2 = defpackage.ycc.a
            java.lang.String[] r3 = defpackage.ycc.b
            defpackage.ycb.a(r1, r2, r3)
            aywy r2 = defpackage.aywy.a
            ayxk r2 = r2.a()
            boolean r2 = r2.dc()
            long r3 = android.os.Binder.clearCallingIdentity()
            android.os.Binder.restoreCallingIdentity(r3)
            java.lang.String r3 = "use_contactables_api"
            r1.putBoolean(r3, r2)
            defpackage.wms.a(r11)
            android.os.Bundle r2 = defpackage.wms.a
            java.lang.String r3 = "config.email_type_map"
            r1.putBundle(r3, r2)
            defpackage.wms.a(r11)
            android.os.Bundle r2 = defpackage.wms.b
            java.lang.String r3 = "config.phone_type_map"
            r1.putBundle(r3, r2)
            java.lang.String r2 = "post_init_configuration"
            r0.putBundle(r2, r1)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "post_init_resolution"
            r0.putBundle(r2, r1)
            r12.a((defpackage.niz) r13, (android.os.Bundle) r0)
            return
        L_0x00f6:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "clientVersion too old"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.people.api.PeopleChimeraService.a(nit, com.google.android.gms.common.internal.GetServiceRequest):void");
    }

    public PeopleChimeraService() {
        super(new int[]{5, 208}, new String[]{"com.google.android.gms.people.service.START", "com.google.android.gms.people.contactssync.service.START"}, Collections.emptySet(), 1, jfb.a((int) aywy.a.a().ci(), 9), (Map) null);
    }
}
