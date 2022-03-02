package defpackage;

import android.os.RemoteException;
import com.google.android.gms.fonts.FontFetchResult;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: nhs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class nhs implements Runnable {
    final /* synthetic */ aorr a;
    final /* synthetic */ nht b;

    public nhs(nht nht, aorr aorr) {
        this.b = nht;
        this.a = aorr;
    }

    public final void run() {
        FontFetchResult fontFetchResult = nht.a;
        if (this.a.isCancelled()) {
            ngz.c("GetFontOperation", "%s cancelled", this.b.c);
            fontFetchResult = nht.b;
        } else if (this.a.isDone()) {
            try {
                fontFetchResult = (FontFetchResult) this.a.get(0, TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                ngz.a("GetFontOperation", e, "Fetch %s failed get when marked done. Should not occur.", this.b.c);
            }
            ngz.c("GetFontOperation", "%s result %s", this.b.c, fontFetchResult);
        }
        try {
            this.b.d.a(fontFetchResult);
        } catch (RemoteException e2) {
            ngz.a("GetFontOperation", "Lost remote: %s", e2.getMessage());
        }
    }
}
