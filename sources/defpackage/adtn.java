package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;
import java.util.Set;

/* renamed from: adtn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adtn extends irg {
    public adtn(Context context) {
        super(context, 41, new int[0]);
    }

    /* access modifiers changed from: protected */
    public final Set a() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    public final void a(isv isv, GetServiceRequest getServiceRequest) {
        if (!aekv.a(this.d) || aztt.a.a().c()) {
            isv.a(0, (IBinder) new adsu(getServiceRequest.d, this.d), (Bundle) null);
        } else {
            isv.a(16, (IBinder) null, (Bundle) null);
        }
    }
}
