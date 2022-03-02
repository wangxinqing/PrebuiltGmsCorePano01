package com.google.android.gms.cast_mirroring;

import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CastMirroringSinkChimeraService extends nio {
    public CastMirroringSinkChimeraService() {
        super(27, "com.google.android.gms.cast_mirroring.service.START", Collections.emptySet(), 1, 10);
    }

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        nit.a(new gut(getBaseContext()));
    }
}
