package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: evg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class evg implements icl, evi {
    public final Status a;
    public final amri b;

    public evg(Status status, amri amri) {
        this.a = status;
        this.b = amri;
    }

    public final Status aO() {
        return this.a;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        qbx.a(bundle, "status", (SafeParcelable) this.a);
        if (this.b.a()) {
            qbx.a(bundle, "parcelable", (SafeParcelable) this.b.b());
        }
        return bundle;
    }
}
