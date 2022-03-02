package defpackage;

import com.google.android.gms.mdh.internal.ByteArraySafeParcelable;

/* renamed from: rzn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rzn extends ihb {
    final /* synthetic */ byte[] a;
    final /* synthetic */ byte[] b;
    final /* synthetic */ sac c;

    public rzn(sac sac, byte[] bArr, byte[] bArr2) {
        this.c = sac;
        this.a = bArr;
        this.b = bArr2;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf, acwd acwd) {
        rzm rzm = new rzm(acwd);
        sac sac = this.c;
        ((sav) ((sbc) ibf).x()).a((ifu) rzm, sac.e, sac.f, sac.g, this.a, new ByteArraySafeParcelable(this.b));
    }
}
