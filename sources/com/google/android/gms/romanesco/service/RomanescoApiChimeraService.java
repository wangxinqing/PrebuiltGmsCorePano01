package com.google.android.gms.romanesco.service;

import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RomanescoApiChimeraService extends nio {
    private static final anax a = anax.a("android.permission-group.CONTACTS", "android.permission-group.PHONE", "android.permission-group.SMS");

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RomanescoApiChimeraService() {
        /*
            r9 = this;
            r0 = 1
            int[] r2 = new int[r0]
            r1 = 135(0x87, float:1.89E-43)
            r3 = 0
            r2[r3] = r1
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "com.google.android.gms.romanesco.service.START"
            r0[r3] = r1
            azfa r1 = defpackage.azfa.a
            azfb r1 = r1.a()
            boolean r1 = r1.K()
            if (r1 == 0) goto L_0x001e
            anax r1 = a
            r4 = r1
            goto L_0x0023
        L_0x001e:
            java.util.Set r1 = defpackage.ixm.c()
            r4 = r1
        L_0x0023:
            r5 = 1
            r6 = 9
            azfa r1 = defpackage.azfa.a
            azfb r1 = r1.a()
            long r7 = r1.C()
            int r7 = (int) r7
            r8 = 0
            r1 = r9
            r3 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.romanesco.service.RomanescoApiChimeraService.<init>():void");
    }

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.d;
        zsj zsj = null;
        if (azfa.a.a().l()) {
            zsj = zsj.a(getApplicationContext(), (Application) null);
        }
        if (azfa.a.a().m()) {
            int a2 = kr.a(getApplicationContext(), "android.permission.READ_CONTACTS", str);
            int a3 = kr.a(getApplicationContext(), "android.permission.WRITE_CONTACTS", str);
            if (!(a2 == 0 && a3 == 0)) {
                nit.a(16, new Bundle());
                if (zsj != null) {
                    ((ahgz) zsj.a.e.a()).b(new Object[0]);
                    return;
                }
                return;
            }
        }
        if (!azfa.a.a().n() || azfa.a.a().d().a.contains(str)) {
            nit.a(new zyr(this, nix.a()));
            return;
        }
        nit.a(16, new Bundle());
        if (zsj != null) {
            ((ahgz) zsj.a.f.a()).b(new Object[0]);
        }
    }
}
