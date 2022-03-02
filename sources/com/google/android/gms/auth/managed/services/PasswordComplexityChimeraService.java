package com.google.android.gms.auth.managed.services;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class PasswordComplexityChimeraService extends nio {
    public PasswordComplexityChimeraService() {
        super(187, "com.google.android.gms.auth.managed.START_POLICY_SERVICE", Collections.emptySet(), 3, 10);
    }

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        if (gjk.b().c()) {
            nit.a(new ghy(new nix(this, this.e, this.f), getServiceRequest.d));
            return;
        }
        nit.a(16, (Bundle) null);
        gji a = gji.a((Context) this);
        aucd o = baqa.f.o();
        String str = getServiceRequest.d;
        if (o.c) {
            o.c();
            o.c = false;
        }
        baqa baqa = (baqa) o.b;
        str.getClass();
        baqa.a |= 1;
        baqa.b = str;
        int b = gji.b(gjk.b().a());
        if (o.c) {
            o.c();
            o.c = false;
        }
        baqa baqa2 = (baqa) o.b;
        baqa2.e = b - 1;
        baqa2.a |= 8;
        a.a(4, (baqa) o.i());
    }
}
