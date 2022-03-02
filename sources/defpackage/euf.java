package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: euf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class euf implements icl, evi {
    public final Status a;
    public final boolean b;

    public euf(Status status, boolean z) {
        this.a = status;
        this.b = z;
    }

    public final Status aO() {
        return this.a;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putByteArray("status", ivy.a(this.a));
        bundle.putBoolean("boolean", this.b);
        return bundle;
    }
}
