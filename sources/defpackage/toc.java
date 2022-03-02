package defpackage;

import com.google.android.gms.nearby.internal.connection.ParcelablePayload;

/* renamed from: toc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class toc {
    final ParcelablePayload a;

    public toc(ParcelablePayload parcelablePayload) {
        this.a = parcelablePayload;
    }

    /* access modifiers changed from: package-private */
    public final long a() {
        return this.a.a;
    }

    public abstract void a(byte[] bArr);

    public abstract byte[] a(int i);

    public abstract long b();

    public void c() {
    }

    public abstract int d();

    public final String toString() {
        String str;
        int d = d();
        int i = d - 1;
        if (d != 0) {
            if (i != 1) {
                str = i != 2 ? i != 3 ? "UNKNOWN" : "STREAM" : "FILE";
            } else {
                str = "BYTES";
            }
            return String.format("(id:%s type:%s)", new Object[]{Long.valueOf(a()), str});
        }
        throw null;
    }
}
