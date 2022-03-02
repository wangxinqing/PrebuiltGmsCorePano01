package defpackage;

import com.google.android.gms.drive.DriveSpace;

/* renamed from: keb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class keb extends lsk {
    final /* synthetic */ khq a;
    final /* synthetic */ kec b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public keb(kec kec, khq khq) {
        super(false);
        this.b = kec;
        this.a = khq;
    }

    /* access modifiers changed from: protected */
    public final boolean a(kmp kmp) {
        return true;
    }

    /* access modifiers changed from: protected */
    public final kky b(kmp kmp) {
        kec kec = this.b;
        ith ith = kec.a;
        return kec.e.a(this.a, DriveSpace.d, lrr.a(kmp.h()));
    }
}
