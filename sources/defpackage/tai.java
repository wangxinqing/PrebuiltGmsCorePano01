package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;
import java.util.Set;

/* renamed from: tai  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tai extends irg {
    public tai(Context context) {
        super(context, 93, new int[0]);
    }

    public final Set a() {
        return Collections.emptySet();
    }

    public final void a(isv isv, GetServiceRequest getServiceRequest) {
        isv.a(0, (IBinder) new suf(sze.a(this.d), getServiceRequest.d), (Bundle) null);
    }
}
