package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.awareness.fence.AwarenessFence;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceRegistrationStub;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation;
import java.util.ArrayList;

/* renamed from: grd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class grd {
    public final ArrayList a = new ArrayList();

    public final FenceUpdateRequestImpl a() {
        return new FenceUpdateRequestImpl(this.a);
    }

    public final void a(grc grc) {
        iva.a((Object) grc);
        this.a.add(new UpdateFenceOperation(3, (ContextFenceRegistrationStub) null, grc, (PendingIntent) null, (String) null, -1, -1));
    }

    public final void a(String str) {
        iva.c(str);
        this.a.add(UpdateFenceOperation.a(str));
    }

    public final void a(String str, AwarenessFence awarenessFence, grc grc) {
        iva.c(str);
        iva.a((Object) awarenessFence);
        iva.a((Object) grc);
        this.a.add(new UpdateFenceOperation(1, ContextFenceRegistrationStub.a(str, 0, (ContextFenceStub) awarenessFence), grc, (PendingIntent) null, (String) null, -1, -1));
    }
}
