package defpackage;

import com.google.android.gms.nearby.internal.connection.ParcelablePayload;
import com.google.android.gms.nearby.internal.connection.SendPayloadParams;

/* renamed from: uir  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uir {
    public final SendPayloadParams a = new SendPayloadParams();

    public final void a(ParcelablePayload parcelablePayload) {
        this.a.c = parcelablePayload;
    }

    public final void a(uha uha) {
        this.a.a = uha;
    }

    public final void a(boolean z) {
        this.a.d = z;
    }

    public final void a(String[] strArr) {
        this.a.b = strArr;
    }
}
