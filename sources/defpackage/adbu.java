package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.List;

/* renamed from: adbu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adbu implements acyt, icl {
    private final Status a;
    private final acyt b;

    public adbu(Status status, acyt acyt) {
        this.a = status;
        this.b = acyt;
    }

    public final List a() {
        Status status = this.a;
        if (status != null && status.c()) {
            acyt acyt = this.b;
            if (acyt == null) {
                return Collections.emptyList();
            }
            return acyt.a();
        }
        Log.e("OptedInAccRes", "Can't call getters on result as API call failed.");
        return Collections.emptyList();
    }

    public final Status aO() {
        return this.a;
    }

    public final List b() {
        Status status = this.a;
        if (status != null && status.c()) {
            acyt acyt = this.b;
            if (acyt == null) {
                return Collections.emptyList();
            }
            return acyt.b();
        }
        Log.e("OptedInAccRes", "Can't call getters on result as API call failed.");
        return Collections.emptyList();
    }
}
