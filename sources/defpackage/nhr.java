package defpackage;

import com.google.android.gms.fonts.FontMatchSpec;
import com.google.android.gms.fonts.service.FontsChimeraService;

/* renamed from: nhr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nhr extends ngv implements niz {
    private final FontsChimeraService a;
    private final nix b;
    private final String c;

    public nhr(FontsChimeraService fontsChimeraService, nix nix, String str) {
        ngz.c("FontsStub", "ctor; requestingPackage=%s", str);
        this.a = fontsChimeraService;
        this.b = nix;
        this.c = str;
    }

    public final void a(ngu ngu, FontMatchSpec fontMatchSpec) {
        ngz.c("FontsStub", "getFontFromSpec(%s)", fontMatchSpec);
        this.b.a(this.a, new nht(ngu, fontMatchSpec, nhz.a.a(), this.c));
    }
}
