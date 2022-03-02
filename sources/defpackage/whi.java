package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.ParcelFileDescriptor;
import java.util.concurrent.Callable;

/* renamed from: whi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class whi implements Callable {
    private final Account a;
    private final Context b;
    private final iby c;

    public whi(iby iby, Account account, Context context) {
        this.c = iby;
        this.a = account;
        this.b = context;
    }

    public final Object call() {
        ParcelFileDescriptor b2;
        iby iby = this.c;
        Account account = this.a;
        Context context = this.b;
        wlj wlj = (wlj) iby.a(account.name, 1, 0).a();
        if (wlj != null) {
            try {
                b2 = wlj.b();
                Bitmap a2 = wlu.a(b2);
                if (a2 != null) {
                    int a3 = wid.a(context, 36);
                    if (a2.getWidth() != a2.getHeight() || a2.getWidth() != a3) {
                        a2 = jmd.a(a2, a3);
                    }
                    Bitmap a4 = jmd.a(context, a2, new Paint());
                    jjt.a(b2);
                    wlj.c();
                    return a4;
                }
                throw new Exception("Failed to load image from People.Images API");
            } catch (Throwable th) {
                wlj.c();
                throw th;
            }
        } else {
            throw new Exception("Failed to load image from People.Images API");
        }
    }
}
