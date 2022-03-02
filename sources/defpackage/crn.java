package defpackage;

import android.accounts.Account;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.ParcelFileDescriptor;
import android.util.Log;

/* renamed from: crn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class crn implements aora {
    final /* synthetic */ Account a;
    final /* synthetic */ crq b;

    public crn(crq crq, Account account) {
        this.b = crq;
        this.a = account;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        wlj wlj = (wlj) obj;
        ParcelFileDescriptor b2 = wlj.b();
        try {
            Bitmap a2 = wlu.a(b2);
            if (a2 != null) {
                if (a2.getWidth() != a2.getHeight() || a2.getWidth() != this.b.c) {
                    a2 = jmd.a(a2, this.b.c);
                }
                Bitmap a3 = jmd.a(this.b.getContext(), a2, new Paint());
                crq crq = this.b;
                String str = this.a.name;
                if (a3 != null) {
                    cro cro = (cro) crq.b.get(str);
                    if (cro == null) {
                        cro = new cro();
                    }
                    cro.b = a3;
                    crq.b.put(str, cro);
                }
            }
        } finally {
            jjt.a(b2);
            wlj.c();
        }
    }

    public final void a(Throwable th) {
        Log.e("AccountChipArrayAdapter", "Failed to load image", th);
    }
}
