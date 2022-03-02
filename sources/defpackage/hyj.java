package defpackage;

import android.accounts.Account;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.ParcelFileDescriptor;
import android.util.Log;

/* renamed from: hyj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hyj implements aora {
    final /* synthetic */ Account a;
    final /* synthetic */ hyo b;

    public hyj(hyo hyo, Account account) {
        this.b = hyo;
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
                Bitmap a3 = jmd.a(this.b.getContext(), a2, new Paint());
                hyo hyo = this.b;
                String str = this.a.name;
                if (a3 != null) {
                    hyk hyk = (hyk) hyo.b.get(str);
                    if (hyk == null) {
                        hyk = new hyk();
                    }
                    hyk.b = a3;
                    hyo.b.put(str, hyk);
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
