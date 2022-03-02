package defpackage;

import java.util.List;

/* renamed from: qov  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qov extends awem {
    private final awef b;
    private final awef c;
    private final awef d;

    private qov(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3) {
        super(bapu2, awey.a(qov.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
        this.d = aweu.a(awef3);
    }

    public static qov a(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3) {
        return new qov(bapu, bapu2, awef, awef2, awef3);
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        List list = (List) obj;
        boolean z = false;
        Boolean bool = (Boolean) list.get(1);
        Boolean bool2 = (Boolean) list.get(2);
        if (((Boolean) list.get(0)).booleanValue() && bool.booleanValue() && bool2.booleanValue()) {
            z = true;
        }
        return aorl.a((Object) Boolean.valueOf(z));
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b(), this.d.b());
    }
}
