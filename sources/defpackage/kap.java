package defpackage;

import com.google.android.gms.drive.DriveSpace;

/* renamed from: kap  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class kap extends lsk {
    protected final kkf a;
    protected final khq b;
    public int c = 0;

    public kap(kkf kkf, kkz kkz, boolean z) {
        super(z);
        iva.a((Object) kkf);
        this.a = kkf;
        iva.a((Object) kkz);
        this.b = khq.a(kkz);
    }

    /* access modifiers changed from: protected */
    public boolean a(kmp kmp) {
        return true;
    }

    /* access modifiers changed from: protected */
    public final kky b(kmp kmp) {
        if (!kmp.w()) {
            return null;
        }
        this.c++;
        return this.a.a(this.b, DriveSpace.d, lrr.a(false, kmp.g()));
    }
}
