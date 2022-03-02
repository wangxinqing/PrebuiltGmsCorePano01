package com.google.android.gms.auth.api.proxy;

import android.os.Binder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AuthChimeraService extends jaz {
    public static final Map a = Collections.synchronizedMap(new HashMap());

    public AuthChimeraService() {
        super(16, "com.google.android.gms.auth.service.START", (Set) anax.a((Object) "android.permission.INTERNET"), 3, 10);
    }

    public static void a(ClientContext clientContext, fvb fvb) {
        a.put(clientContext, new WeakReference(fvb));
    }

    /* access modifiers changed from: protected */
    public final void a(jbb jbb, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.d;
        String string = getServiceRequest.g.getString("consumerPkg");
        ClientContext clientContext = new ClientContext(Binder.getCallingUid(), getServiceRequest.h, getServiceRequest.a(), str, string == null ? str : string, (ArrayList) null, (ArrayList) null, getServiceRequest.g);
        jbf a2 = jbf.a();
        a(clientContext, new fvb(this, a2, clientContext));
        a2.a(this, new fvm(jbb, Binder.getCallingUid(), getServiceRequest.g, clientContext));
    }
}
