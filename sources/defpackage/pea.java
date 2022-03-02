package defpackage;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.Map;

/* renamed from: pea  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pea implements pjl {
    private final ifu a;
    private final Map b;

    public pea(ifu ifu, Map map) {
        this.a = ifu;
        this.b = map;
    }

    public final void a() {
        for (aerj a2 : this.b.values()) {
            try {
                a2.a();
            } catch (InterruptedException e) {
                this.a.a(Status.b);
                return;
            } catch (IOException e2) {
                this.a.a(new Status(8, e2.getMessage()));
                return;
            }
        }
        this.a.a(Status.a);
    }

    public final void a(Status status) {
        this.a.a(status);
    }
}
