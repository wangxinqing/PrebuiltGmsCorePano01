package defpackage;

import java.io.File;
import java.util.Arrays;

/* renamed from: npr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class npr {
    public final bhu a;
    public final File b;
    public final File c;
    public byte[] d;
    private final File e;
    private byte[] f;

    public npr(bhu bhu, File file, File file2, File file3) {
        this.a = bhu;
        this.b = file;
        this.c = file3;
        this.e = file2;
    }

    public final byte[] a() {
        if (this.f == null) {
            this.f = npt.a(this.e);
        }
        byte[] bArr = this.f;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    public final boolean b() {
        return System.currentTimeMillis() / 1000 > this.a.d;
    }
}
