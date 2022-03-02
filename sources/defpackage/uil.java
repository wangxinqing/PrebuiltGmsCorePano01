package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;

/* renamed from: uil  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uil {
    public final ParcelablePayload a = new ParcelablePayload();

    public final void a(int i) {
        this.a.b = i;
    }

    public final void a(long j) {
        this.a.a = j;
    }

    public final void a(ParcelFileDescriptor parcelFileDescriptor) {
        this.a.d = parcelFileDescriptor;
    }

    public final void a(String str) {
        this.a.e = str;
    }

    public final void a(byte[] bArr) {
        this.a.c = bArr;
    }

    public final void b(long j) {
        this.a.f = j;
    }
}
