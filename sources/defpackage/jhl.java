package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;

/* renamed from: jhl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class jhl {
    public final Object a = new Object();
    protected jhk b;
    private final Handler c;

    protected jhl(Handler handler) {
        this.c = handler;
    }

    public static jhl a(Context context, Handler handler) {
        Context applicationContext = context.getApplicationContext();
        if (!jkr.e()) {
            return new jhm(applicationContext, handler);
        }
        return new jho((ActivityManager) applicationContext.getSystemService("activity"), jni.b(applicationContext), handler);
    }

    public abstract boolean a(int i);

    /* access modifiers changed from: protected */
    public abstract void b();

    /* access modifiers changed from: protected */
    public abstract void c();

    public final void a() {
        synchronized (this.a) {
            if (this.b != null) {
                c();
                this.b = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i, boolean z) {
        this.c.post(new jhj(this, i, z));
    }

    public final void a(jhk jhk) {
        boolean z;
        synchronized (this.a) {
            iva.a((Object) jhk);
            if (this.b == null) {
                z = true;
            } else {
                z = false;
            }
            iva.a(z);
            this.b = jhk;
            b();
        }
    }
}
