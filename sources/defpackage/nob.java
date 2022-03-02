package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;
import java.util.Set;

/* renamed from: nob  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nob extends irg {
    private final noj a;
    private final noa b;

    public nob(Context context, noj noj, noa noa) {
        super(context, 116, new int[0]);
        this.a = noj;
        this.b = noa;
    }

    /* access modifiers changed from: protected */
    public final Set a() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    public final void a(isv isv, GetServiceRequest getServiceRequest) {
        isv.a(0, (IBinder) new npo(this.a, this.b), (Bundle) null);
    }
}
