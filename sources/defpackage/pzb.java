package defpackage;

import android.accounts.Account;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.ParcelFileDescriptor;

/* renamed from: pzb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pzb implements aora {
    final /* synthetic */ Account a;
    final /* synthetic */ pze b;

    public pzb(pze pze, Account account) {
        this.b = pze;
        this.a = account;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        wlj wlj = (wlj) obj;
        ParcelFileDescriptor b2 = wlj.b();
        try {
            Bitmap a2 = wlu.a(b2);
            if (a2 != null) {
                if (a2.getWidth() != a2.getHeight() || a2.getWidth() != this.b.d) {
                    a2 = jmd.a(a2, this.b.d);
                }
                Bitmap a3 = jmd.a(this.b.b, a2, new Paint());
                pzh pzh = (pzh) this.b.c.get(this.a);
                amrl.a((Object) pzh);
                pzh.e = a3;
            }
        } finally {
            jjt.a(b2);
            wlj.c();
        }
    }

    public final void a(Throwable th) {
        pze.a.e("Failed to load image", th, new Object[0]);
    }
}
