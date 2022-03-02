package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: rnp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rnp extends qvv {
    public final nz a = new nz(1);
    private final Context b;
    private final rnq c;

    public rnp(Context context, rnq rnq) {
        super("location", "SettingContentObserver", (Handler) null);
        this.b = context;
        this.c = rnq;
    }

    /* access modifiers changed from: package-private */
    public final void a(Uri uri, rnr rnr, Executor executor) {
        synchronized (this.a) {
            if (this.a.put(rnr, executor) == null && this.a.h == 1) {
                this.b.getContentResolver().registerContentObserver(uri, true, this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(rnr rnr) {
        synchronized (this.a) {
            if (this.a.remove(rnr) != null && this.a.isEmpty()) {
                this.b.getContentResolver().unregisterContentObserver(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z, Uri uri) {
        Object a2 = this.c.a(this.b);
        synchronized (this.a) {
            int i = 0;
            while (true) {
                nz nzVar = this.a;
                if (i < nzVar.h) {
                    Executor executor = (Executor) this.a.c(i);
                    executor.execute(new rno(this, (rnr) nzVar.b(i), executor, a2));
                    i++;
                }
            }
        }
    }
}
