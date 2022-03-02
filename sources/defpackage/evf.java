package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

/* renamed from: evf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class evf implements icl, evi {
    public final Status a;
    public final amzy b;

    public evf(Status status, amzy amzy) {
        this.a = status;
        this.b = amzy;
    }

    public final Status aO() {
        return this.a;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        qbx.a(bundle, "status", (SafeParcelable) this.a);
        amzy amzy = this.b;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelableArrayList("parcelables", new ArrayList(amzy));
        bundle.putBundle("parcelables", bundle2);
        return bundle;
    }
}
