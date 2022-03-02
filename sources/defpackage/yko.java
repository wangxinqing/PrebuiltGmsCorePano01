package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;

/* renamed from: yko  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yko extends idf {
    final /* synthetic */ String a;
    final /* synthetic */ FavaDiagnosticsEntity b;
    final /* synthetic */ FavaDiagnosticsEntity c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yko(icc icc, String str, FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2) {
        super(ykq.d, icc);
        this.a = str;
        this.b = favaDiagnosticsEntity;
        this.c = favaDiagnosticsEntity2;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        ytv ytv = (ytv) ibf;
        String str = this.a;
        FavaDiagnosticsEntity favaDiagnosticsEntity = this.b;
        FavaDiagnosticsEntity favaDiagnosticsEntity2 = this.c;
        ytv.w();
        ((ytu) ytv.x()).a(str, favaDiagnosticsEntity, favaDiagnosticsEntity2);
    }

    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return status;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        super.a((icl) obj);
    }
}
