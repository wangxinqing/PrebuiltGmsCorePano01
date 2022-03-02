package defpackage;

import android.util.Log;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* renamed from: aarp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aarp extends nio {
    protected static final String a = aarp.class.getCanonicalName();

    public aarp() {
        super(45, "com.google.android.gms.safetynet.service.START", Collections.emptySet(), 3, 9);
    }

    /* access modifiers changed from: protected */
    public void a(nit nit, GetServiceRequest getServiceRequest) {
        if (Log.isLoggable(a, 6)) {
            Log.e(a, "Must implement onGetService");
        }
    }
}
