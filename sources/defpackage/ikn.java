package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ikn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ikn {
    private boolean a;
    private final iby b;

    public ikn(Context context) {
        iby iby;
        if (adrz.a(context)) {
            this.a = true;
            iby = adrz.b(context);
        } else {
            this.a = false;
            iby = null;
        }
        this.b = iby;
    }

    public final boolean a() {
        if (this.a) {
            try {
                boolean p = ((ick) acws.a(this.b.o(), 5000, TimeUnit.MILLISECONDS)).p();
                this.a = p;
                return p;
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
            }
        }
        return false;
    }
}
