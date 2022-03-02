package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: pef  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pef implements pjl {
    private final ifu a;
    private final String b;
    private final pjj c;

    public pef(ifu ifu, String str, pjj pjj) {
        this.a = ifu;
        this.b = str;
        this.c = pjj;
    }

    public final void a() {
        try {
            this.c.a(pee.a, this.b).a(false, 3, false, (Bundle) null);
            this.a.a(Status.a);
        } catch (Exception e) {
            this.a.a(pku.a(getClass().getSimpleName(), 8, String.format("Failed to start task %s", new Object[]{this.b})));
        }
    }

    public final void a(Status status) {
        this.a.a(status);
    }
}
