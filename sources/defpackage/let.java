package defpackage;

import android.content.ComponentName;
import android.content.SyncResult;
import android.os.IBinder;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: let  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class let extends qvy {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ List c;
    final /* synthetic */ ley d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public let(ley ley, String str, String str2, int i, List list) {
        super(str);
        this.d = ley;
        this.a = str2;
        this.b = i;
        this.c = list;
    }

    public final void a(ComponentName componentName) {
        this.d.a(this.a, 2, (SyncResult) null);
    }

    public final void a(ComponentName componentName, IBinder iBinder) {
        try {
            ((jfz) this.d.c).submit((Runnable) new les(this, (lee) iBinder, this));
        } catch (RejectedExecutionException e) {
            this.d.a(this.a, 0, 2, (SyncResult) null);
        } catch (RuntimeException e2) {
            throw new AssertionError(e2);
        }
    }
}
