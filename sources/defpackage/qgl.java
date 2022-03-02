package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.instantapps.internal.OptInInfo;

/* renamed from: qgl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qgl implements icl {
    public final OptInInfo a;
    private final Status b;

    public qgl(Status status, OptInInfo optInInfo) {
        this.b = status;
        this.a = optInInfo;
    }

    public final Status aO() {
        return this.b;
    }
}
