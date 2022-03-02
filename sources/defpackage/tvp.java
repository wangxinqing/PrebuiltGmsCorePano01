package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.ParcelFileDescriptor;
import android.util.TypedValue;
import java.util.concurrent.Callable;

/* renamed from: tvp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tvp implements Callable {
    private final Account a;
    private final Context b;

    public tvp(Account account, Context context) {
        this.a = account;
        this.b = context;
    }

    public final Object call() {
        ParcelFileDescriptor b2;
        Account account = this.a;
        Context context = this.b;
        wlj wlj = (wlj) tvq.a.a(account.name, 1, 0).a();
        try {
            b2 = wlj.b();
            Bitmap a2 = wlu.a(b2);
            if (a2 != null) {
                int applyDimension = (int) TypedValue.applyDimension(1, 120.0f, context.getResources().getDisplayMetrics());
                if (a2.getWidth() != a2.getHeight() || a2.getWidth() != applyDimension) {
                    a2 = jmd.a(a2, applyDimension);
                }
                Bitmap a3 = jmd.a(context, a2, new Paint());
                jjt.a(b2);
                wlj.c();
                return a3;
            }
            throw new NullPointerException("Failed to load image from People.Images API");
        } catch (Throwable th) {
            wlj.c();
            throw th;
        }
    }
}
