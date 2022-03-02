package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: afhq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afhq {
    private final List a = new ArrayList();

    public final afhr a() {
        return new afho(this.a);
    }

    public final void a(byte[] bArr, int i) {
        List list = this.a;
        if (bArr == null) {
            bArr = afhr.b;
        }
        list.add(new afhp(bArr, i));
    }
}
