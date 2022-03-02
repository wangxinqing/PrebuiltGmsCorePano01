package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: rjg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rjg extends ril {
    final /* synthetic */ String[] a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rjg(ibq ibq, icc icc, String[] strArr) {
        super(ibq, icc);
        this.a = strArr;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        rjn rjn = (rjn) ibf;
        List asList = Arrays.asList(this.a);
        rio rio = new rio((ril) this);
        iva.a((Object) rio, (Object) "callback == null");
        ((rju) rjn.x()).a(asList, rjn.a, (rka) rio);
    }
}
