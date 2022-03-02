package com.google.firebase.auth.api.gms.service;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FirebaseAuthChimeraService extends jaz {
    public FirebaseAuthChimeraService() {
        super(112, "com.google.firebase.auth.api.gms.service.START", Collections.emptySet(), 3, 9);
        if (axic.a.a().d()) {
            this.c = amzy.a((Object) new apqf());
        }
    }

    /* access modifiers changed from: protected */
    public final void a(jbb jbb, GetServiceRequest getServiceRequest) {
        Bundle bundle = getServiceRequest.g;
        if (bundle != null) {
            String string = bundle.getString("com.google.firebase.auth.API_KEY");
            if (!TextUtils.isEmpty(string)) {
                jbb.a(new apqe(getServiceRequest.d, string, new aptp(bundle.getString("com.google.firebase.auth.LIBRARY_VERSION", "-1"), getServiceRequest.c), this, jbf.a()));
                return;
            }
            throw new IllegalArgumentException("ApiKey must not be empty.");
        }
        throw new IllegalArgumentException("ExtraArgs is null.");
    }
}
