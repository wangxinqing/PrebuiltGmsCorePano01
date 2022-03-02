package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: akkq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akkq extends akko {
    private final akkn a;

    public akkq(akkn akkn) {
        this.a = akkn;
    }

    public final /* bridge */ /* synthetic */ int a(Object obj) {
        Long l = (Long) obj;
        return 8;
    }

    public final /* bridge */ /* synthetic */ int b(Object obj) {
        return akkn.a((((long[]) obj).length * 8) + 4) + 4;
    }

    /* renamed from: c */
    public final long[] b(aubc aubc) {
        try {
            byte[] b = this.a.b(aubc.e(aubc.h()));
            if (b.length != 0) {
                ByteBuffer wrap = ByteBuffer.wrap(b);
                int i = wrap.getInt();
                long[] jArr = new long[i];
                for (int i2 = 0; i2 < i; i2++) {
                    jArr[i2] = wrap.getLong();
                }
                return jArr;
            }
            aklz.a().c("Tried to read from empty decrypted buffer");
            return new long[0];
        } catch (GeneralSecurityException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Failed to read value");
            sb.append(valueOf);
            throw new IOException(sb.toString());
        }
    }

    public final /* bridge */ /* synthetic */ Object a(aubc aubc) {
        return Long.valueOf(aubc.g());
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, aubk aubk) {
        aubk.d(((Long) obj).longValue());
    }

    /* renamed from: a */
    public final void b(long[] jArr, aubk aubk) {
        ByteBuffer allocate = ByteBuffer.allocate((r0 * 8) + 4);
        allocate.putInt(r0);
        for (long putLong : jArr) {
            allocate.putLong(putLong);
        }
        try {
            byte[] a2 = this.a.a(allocate.array());
            aubk.e(a2.length);
            aubk.b(a2);
        } catch (GeneralSecurityException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("Failed to write value");
            sb.append(valueOf);
            throw new IOException(sb.toString());
        }
    }
}
