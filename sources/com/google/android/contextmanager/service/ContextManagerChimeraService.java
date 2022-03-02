package com.google.android.contextmanager.service;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ContextManagerChimeraService extends nio {
    public ContextManagerChimeraService() {
        super(new int[]{47}, new String[]{"com.google.android.contextmanager.service.ContextManagerService.START"}, anfv.a, 3, cbi.k().c.d, (Map) null);
    }

    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        ContextManagerClientInfo contextManagerClientInfo;
        Bundle bundle = getServiceRequest.g;
        if (bundle != null) {
            byte[] byteArray = bundle.getByteArray("com.google.android.contextmanager.service.args");
            contextManagerClientInfo = byteArray != null ? (ContextManagerClientInfo) ivy.a(byteArray, ContextManagerClientInfo.CREATOR) : null;
        } else {
            contextManagerClientInfo = null;
        }
        Context f = cbi.f();
        String str = getServiceRequest.d;
        int i = 0;
        if (contextManagerClientInfo == null || contextManagerClientInfo.d() || contextManagerClientInfo.c()) {
            if (!jhg.b()) {
                if (contextManagerClientInfo != null && !TextUtils.equals(contextManagerClientInfo.b, str)) {
                    throw new SecurityException("Package name does not match.");
                }
                hya.a(f).a(str);
            }
        } else if (!contextManagerClientInfo.e()) {
            throw new SecurityException("Unknown package connection.");
        } else if (!awuz.a.a().k()) {
            long a = cbi.i().a();
            long j = cbi.j().a.getLong(str, 0);
            int i2 = j != 0 ? awuz.a.a().aO() > a - j ? 1 : 0 : 2;
            Object[] objArr = {Integer.valueOf(i2), str};
            if (i2 == 0) {
                chq chq = new chq(contextManagerClientInfo, str);
                chq.a.b();
                chq.a.a(chq, bvq.a("validate3P", cbi.f(), chq.b));
            } else if (i2 != 1) {
                i = chs.a(contextManagerClientInfo, str);
            }
        }
        if (i == 0) {
            nit.a(new cht(contextManagerClientInfo));
        } else {
            nit.a(i, (Bundle) null);
        }
    }

    public final void onCreate() {
        cbi.a(new nix(this, this.e, this.f));
        cbi.n();
        cbi.a(getBaseContext());
        cbi.G().a(3);
    }
}
