package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: jhs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class jhs extends jht implements AppOpsManager.OnOpChangedListener {
    protected final AppOpsManager b;
    private final AtomicReference c = new AtomicReference();

    public jhs(Context context) {
        this.b = (AppOpsManager) context.getSystemService("appops");
    }

    public final int a(String str, int i, String str2) {
        return this.b.startOpNoThrow(str, i, str2);
    }

    public final void b(String str, int i, String str2) {
        try {
            this.b.finishOp(str, i, str2);
        } catch (IllegalStateException e) {
            Log.e("AppOpsCompat", String.format("Op %s finished but never started, %d:%s", new Object[]{str, Integer.valueOf(i), str2}), e);
        }
    }

    public final int c(String str, int i, String str2) {
        return this.b.noteOpNoThrow(str, i, str2);
    }

    public final int d(String str, int i, String str2) {
        return this.b.checkOpNoThrow(str, i, str2);
    }

    public final void onOpChanged(String str, String str2) {
        jhq jhq = (jhq) this.c.get();
        if (jhq != null) {
            jhq.s(str2);
        }
    }

    /* access modifiers changed from: protected */
    public void a(String str, int i, AppOpsManager.OnOpChangedListener onOpChangedListener) {
        this.b.startWatchingMode(str, (String) null, onOpChangedListener);
    }

    public final void a(String str, int i, jhq jhq) {
        if (this.c.compareAndSet((Object) null, jhq) || this.c.get() == jhq) {
            a(str, i, (AppOpsManager.OnOpChangedListener) this);
            return;
        }
        throw new IllegalStateException("Can't register more than one op listener at a time.");
    }

    public final void a(String str, jhq jhq) {
        a(str, 0, jhq);
    }

    public final void a(jhq jhq) {
        if (!this.c.compareAndSet(jhq, (Object) null)) {
            Log.e("AppOpsCompat", "Called stopWatchingMode without a balanced call to startWatchingMode");
        } else {
            this.b.stopWatchingMode(this);
        }
    }
}
