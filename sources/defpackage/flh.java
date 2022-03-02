package defpackage;

import java.io.IOException;

/* renamed from: flh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class flh extends amqt {
    private final auef a;

    public flh(auef auef) {
        this.a = auef;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        amri amri = (amri) obj;
        return amri.a() ? jhy.b(((audx) amri.b()).k()) : "<<absent>>";
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        String str = (String) obj;
        try {
            return !"<<absent>>".equals(str) ? amri.b((audx) this.a.b(jhy.a(str), aubs.c())) : ampu.a;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
