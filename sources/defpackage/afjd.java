package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: afjd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afjd implements amqy {
    private final byte[] a;

    public afjd(byte[] bArr) {
        this.a = bArr;
    }

    public final Object a(Object obj) {
        byte[] bArr = this.a;
        for (afhu afhu : (Collection) obj) {
            if (Arrays.equals(bArr, afhu.b)) {
                return amri.b(afhu);
            }
        }
        return ampu.a;
    }
}
