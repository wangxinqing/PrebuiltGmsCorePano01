package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.ByteArrayOutputStream;

/* renamed from: hkc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hkc implements icl {
    public final Status a;
    public final amzy b;

    public hkc(Status status, amzy amzy) {
        iva.a((Object) status);
        this.a = status;
        iva.a((Object) amzy);
        this.b = amzy;
    }

    public final Status aO() {
        return this.a;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        qbx.a(bundle, "status", (SafeParcelable) this.a);
        amzy amzy = this.b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int size = amzy.size();
        for (int i = 0; i < size; i++) {
            ((audx) amzy.get(i)).b(byteArrayOutputStream);
        }
        bundle.putByteArray("entities", byteArrayOutputStream.toByteArray());
        return bundle;
    }
}
