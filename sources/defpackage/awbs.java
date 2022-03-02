package defpackage;

import java.util.zip.Inflater;

/* renamed from: awbs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awbs extends Inflater {
    public final int inflate(byte[] bArr, int i, int i2) {
        int inflate = super.inflate(bArr, i, i2);
        if (inflate != 0 || !needsDictionary()) {
            return inflate;
        }
        setDictionary(awbz.a);
        return super.inflate(bArr, i, i2);
    }
}
