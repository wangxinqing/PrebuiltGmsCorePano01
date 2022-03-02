package defpackage;

import java.nio.charset.Charset;

/* renamed from: ankv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class ankv implements anli {
    public anlh a(CharSequence charSequence) {
        int length = charSequence.length();
        anlj a = a(length + length);
        a.a(charSequence);
        return a.a();
    }

    public anlh a(CharSequence charSequence, Charset charset) {
        return a().a(charSequence, charset).a();
    }

    public final anlh a(byte[] bArr) {
        return a(bArr, bArr.length);
    }

    public anlh a(byte[] bArr, int i) {
        amrl.a(0, i, bArr.length);
        anlj a = a(i);
        a.b(bArr, 0, i);
        return a.a();
    }

    public anlj a(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z, "expectedInputSize must be >= 0 but was %s", i);
        return a();
    }
}
