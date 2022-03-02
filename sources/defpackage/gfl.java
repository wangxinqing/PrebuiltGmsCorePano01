package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.auth.frp.FrpUpdateIntentOperation;
import java.util.concurrent.CountDownLatch;

/* renamed from: gfl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gfl extends qvv {
    public final ContentResolver a;
    public final Uri b;
    public final CountDownLatch c;

    public gfl(Handler handler, ContentResolver contentResolver, Uri uri, CountDownLatch countDownLatch) {
        super("auth_account", "BlockingUriObserver", handler);
        this.a = contentResolver;
        this.b = uri;
        this.c = countDownLatch;
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z, Uri uri) {
        if (this.b.equals(uri)) {
            iwd iwd = FrpUpdateIntentOperation.a;
            String valueOf = String.valueOf(this.b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
            sb.append(valueOf);
            sb.append(" changed");
            iwd.c(sb.toString(), new Object[0]);
            this.c.countDown();
        }
    }
}
