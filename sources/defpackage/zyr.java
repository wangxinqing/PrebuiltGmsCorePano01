package defpackage;

import com.google.android.gms.romanesco.service.RomanescoApiChimeraService;

/* renamed from: zyr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zyr extends zvo implements niz {
    private final RomanescoApiChimeraService a;
    private final nix b;

    public zyr(RomanescoApiChimeraService romanescoApiChimeraService, nix nix) {
        this.a = romanescoApiChimeraService;
        this.b = nix;
    }

    public final void a(zvm zvm, String str) {
        if (azfa.a.a().t()) {
            this.b.a(this.a, new zyv(zvm, str));
        }
    }

    public final void b(zvm zvm, String str, String str2, String str3, String str4, String[] strArr) {
        this.b.a(this.a, new zzg(zvm, str, str2, str3, str4, strArr));
    }

    public final void b(zvm zvm, String str, String str2, String[] strArr) {
        this.b.a(this.a, new zyx(zvm, str, str2, strArr));
    }

    public final void a(zvm zvm, String str, long j) {
        this.b.a(this.a, new zyu(zvm, str, j));
    }

    public final void a(zvm zvm, String str, String str2) {
        this.b.a(this.a, new zyt(zvm, str, str2));
    }

    public final void a(zvm zvm, String str, String str2, String str3, String str4, String[] strArr) {
        this.b.a(this.a, new zze(zvm, str, str2, str3, str4, strArr));
    }

    public final void a(zvm zvm, String str, String str2, String str3, String[] strArr) {
        this.b.a(this.a, new zzd(zvm, str, str2, str3, strArr));
    }

    public final void a(zvm zvm, String str, String str2, String[] strArr) {
        this.b.a(this.a, new zyw(zvm, str, str2, strArr));
    }
}
