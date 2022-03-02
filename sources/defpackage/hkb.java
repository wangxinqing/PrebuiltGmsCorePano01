package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: hkb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hkb implements icl {
    public final Status a;
    public final SafeParcelable b;

    public hkb(Status status, SafeParcelable safeParcelable) {
        iva.a((Object) status);
        this.a = status;
        this.b = safeParcelable;
    }

    public final Status aO() {
        return this.a;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        qbx.a(bundle, "status", (SafeParcelable) this.a);
        SafeParcelable safeParcelable = this.b;
        if (safeParcelable != null) {
            qbx.a(bundle, "parcelable", safeParcelable);
        }
        return bundle;
    }
}
