package defpackage;

import android.content.Context;
import java.util.List;

/* renamed from: qpl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qpl extends awem {
    private final awef b;
    private final awef c;
    private final awef d;

    public qpl(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3) {
        super(bapu2, awey.a(qpl.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
        this.d = aweu.a(awef3);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.c.b(), this.d.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        List list = (List) obj;
        awef awef = this.b;
        qrd qrd = (qrd) list.get(1);
        if (qrc.a((Context) list.get(0))) {
            qrd.c();
            return awef.b();
        }
        if (axvz.i()) {
            qoi.c("Mediastore access denied");
        }
        return aorl.a((Object) true);
    }
}
