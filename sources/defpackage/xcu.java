package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import java.util.List;

/* renamed from: xcu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xcu extends wlp {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ List m;
    final /* synthetic */ List n;
    final /* synthetic */ FavaDiagnosticsEntity o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xcu(icc icc, String str, String str2, String str3, List list, List list2, FavaDiagnosticsEntity favaDiagnosticsEntity) {
        super(icc);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.m = list;
        this.n = list2;
        this.o = favaDiagnosticsEntity;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        ((xbi) ibf).a((idg) this, this.a, this.b, this.c, this.m, this.n, this.o);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return new xct(status);
    }
}
