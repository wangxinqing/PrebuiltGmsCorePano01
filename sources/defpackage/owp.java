package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: owp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class owp extends irg {
    public static final Map b = new HashMap();
    public final prm a;

    public owp(Context context, prm prm) {
        super(context, 113, new int[0]);
        this.a = prm;
    }

    /* access modifiers changed from: protected */
    public final Set a() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    public final void a(isv isv, GetServiceRequest getServiceRequest) {
        if (this.a != null) {
            String str = getServiceRequest.d;
            this.a.c.d(new owo(this, aonk.GET_APP_INDEXING_SERVICE, str, isv, str, getServiceRequest.c, Binder.getCallingUid()));
            return;
        }
        oso.a("AppIndexingService is unavailable on this device");
        isv.a(16, (IBinder) null, new Bundle());
    }
}
