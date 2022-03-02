package defpackage;

import com.google.android.gms.nearby.internal.connection.ParcelablePayload;

/* renamed from: tod  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tod extends toc {
    private boolean b = false;

    public tod(ParcelablePayload parcelablePayload) {
        super(parcelablePayload);
    }

    public final void a(byte[] bArr) {
    }

    public final byte[] a(int i) {
        if (this.b) {
            return null;
        }
        this.b = true;
        return this.a.c;
    }

    public final long b() {
        return (long) this.a.c.length;
    }

    public final int d() {
        return 2;
    }
}
