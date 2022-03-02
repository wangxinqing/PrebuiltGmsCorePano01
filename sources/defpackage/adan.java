package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.List;

/* renamed from: adan  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adan implements icl {
    public final Status a;
    public final List b;

    public adan(Status status, List list) {
        this.a = status;
        this.b = Collections.unmodifiableList(list);
    }

    public final Status aO() {
        return this.a;
    }
}
