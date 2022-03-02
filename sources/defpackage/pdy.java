package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: pdy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pdy implements pjl {
    private final ifu a;
    private final Map b;

    public pdy(ifu ifu, Map map) {
        this.a = ifu;
        this.b = map;
    }

    public final void a() {
        try {
            ((afbv) this.b.get("mdh-channelconfig-refresh")).a((Bundle) null).get();
            this.a.a(Status.a);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            a(pku.a(getClass().getSimpleName(), 14, "Failed to refresh channel config list"));
        } catch (ExecutionException e2) {
            a(pku.a(getClass().getSimpleName(), 8, "Failed to refresh channel config list"));
        }
    }

    public final void a(Status status) {
        this.a.a(status);
    }
}
