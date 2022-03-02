package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.util.UUID;

/* renamed from: tjc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tjc {
    public final long a;
    public final int b;
    public final byte[] c;
    public final tja d;
    public final tjb e;

    public tjc(long j, int i, byte[] bArr, tja tja, tjb tjb) {
        this.a = j;
        this.b = i;
        this.c = bArr;
        this.d = tja;
        this.e = tjb;
    }

    public static long a() {
        return UUID.randomUUID().getLeastSignificantBits();
    }

    public final void b() {
        tja tja = this.d;
        if (tja != null) {
            jjt.a(tja.b);
        }
        tjb tjb = this.e;
        if (tjb != null) {
            jjt.a(tjb.a);
            jjt.a((Closeable) tjb.b);
        }
    }

    public static tjc a(ParcelFileDescriptor parcelFileDescriptor) {
        return a(tja.a(parcelFileDescriptor), a());
    }

    public static tjc a(tja tja, long j) {
        return new tjc(j, 2, (byte[]) null, tja, (tjb) null);
    }

    public static tjc a(byte[] bArr) {
        iva.a((Object) bArr, (Object) "Cannot create a Payload from null bytes.");
        return a(bArr, a());
    }

    public static tjc a(byte[] bArr, long j) {
        return new tjc(j, 1, bArr, (tja) null, (tjb) null);
    }
}
