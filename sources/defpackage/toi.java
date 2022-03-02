package defpackage;

import com.google.android.gms.nearby.internal.connection.ParcelablePayload;

/* renamed from: toi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class toi extends tok {
    public toi(ParcelablePayload parcelablePayload, aoru aoru) {
        super(parcelablePayload, parcelablePayload.d, aoru);
    }

    public final byte[] a(int i) {
        return super.a(Math.min(65536, i));
    }

    public final long b() {
        return -1;
    }

    public final int d() {
        return 4;
    }
}
