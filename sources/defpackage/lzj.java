package defpackage;

import com.google.android.gms.droidguard.DroidGuardResultsRequest;

/* renamed from: lzj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lzj extends lzl {
    final /* synthetic */ lzm a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lzj(lzm lzm, String str, DroidGuardResultsRequest droidGuardResultsRequest) {
        super(lzm, str, droidGuardResultsRequest);
        this.a = lzm;
    }

    public final /* bridge */ /* synthetic */ Object a(String str) {
        lzt lzt = this.a.a;
        lzt.getClass();
        String valueOf = String.valueOf(str);
        return new lzs(lzt, valueOf.length() == 0 ? new String("init ") : "init ".concat(valueOf), this.e);
    }

    public final /* bridge */ /* synthetic */ Object a(lya lya) {
        return lya;
    }
}
