package defpackage;

import android.net.Uri;
import com.google.android.gms.common.api.Status;

/* renamed from: xda  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xda extends wlp {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ Uri c;
    final /* synthetic */ boolean m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xda(icc icc, String str, String str2, Uri uri, boolean z) {
        super(icc);
        this.a = str;
        this.b = str2;
        this.c = uri;
        this.m = z;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        ((xbi) ibf).a((idg) this, this.a, this.b, this.c, this.m);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ icl b(Status status) {
        return new xcz(status);
    }
}
