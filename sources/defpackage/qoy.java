package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: qoy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qoy extends awem {
    private final awef b;
    private final awef c;
    private final bapu d;
    private final bapu e;
    private final bapu f;
    private final bapu g;
    private final bapu h;
    private final awef i;

    public qoy(bapu bapu, bapu bapu2, awef awef, awef awef2, bapu bapu3, bapu bapu4, bapu bapu5, bapu bapu6, bapu bapu7, awef awef3) {
        super(bapu2, awey.a(qoy.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
        this.d = bapu3;
        this.e = bapu4;
        this.f = bapu5;
        this.g = bapu6;
        this.h = bapu7;
        this.i = aweu.a(awef3);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.i.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        List list = (List) obj;
        awef awef = this.c;
        bapu bapu = this.d;
        bapu bapu2 = this.e;
        bapu bapu3 = this.f;
        bapu bapu4 = this.g;
        bapu bapu5 = this.h;
        Executor executor = (Executor) list.get(1);
        if (!qrc.a((Context) list.get(0))) {
            if (axvz.i()) {
                qoi.c("Mediastore access denied");
            }
            ((qrh) bapu5).a().b();
            return qrc.a(((qqh) bapu).a(), ((qqf) bapu2).a(), ((qqj) bapu4).a(), ((qqg) bapu3).a(), executor);
        }
        qrc.a(((qqh) bapu).a(), ((qqf) bapu2).a(), ((qqg) bapu3).a(), ((qqj) bapu4).a());
        return awef.b();
    }
}
