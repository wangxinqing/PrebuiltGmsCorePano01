package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.WorkSource;

/* renamed from: jgy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class jgy {
    public final Object a = new Object();
    protected final Context b;
    protected final jbs c;
    private final ou d;

    public static jgy a(Context context) {
        jbs jbs = new jbs(context.getApplicationContext());
        Context applicationContext = context.getApplicationContext();
        if (awyg.a.a().p() && jkr.h()) {
            return new jhb(applicationContext, jbs);
        }
        if (jkr.c()) {
            return new jhf(applicationContext, jbs);
        }
        int i = Build.VERSION.SDK_INT;
        return new jhb(applicationContext, jbs);
    }

    /* access modifiers changed from: protected */
    public abstract jgx a(jgw jgw, String str, int i);

    /* access modifiers changed from: protected */
    public abstract void a(String str, int i, long j, jgx jgx, Handler handler, WorkSource workSource);

    /* access modifiers changed from: protected */
    public abstract void a(jgx jgx);

    protected jgy(Context context, jbs jbs) {
        this.b = context;
        this.c = jbs;
        this.d = new ou(2);
        new acrz(this.b, "AlarmManagerCompat");
    }

    public final void a(String str, int i, long j, jgw jgw, Handler handler, WorkSource workSource) {
        boolean z;
        jgw jgw2 = jgw;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        synchronized (this.a) {
            a(jgw2);
            String str2 = str;
            int i2 = i;
            jgx a2 = a(jgw2, str, i);
            this.d.put(jgw2, a2);
            a2.a(handler);
            a(str, i, j, a2, handler, workSource);
        }
    }

    public final void a(jgw jgw) {
        synchronized (this.a) {
            a(jgw, true);
        }
    }

    public final void a(jgw jgw, boolean z) {
        jgx jgx = (jgx) this.d.remove(jgw);
        if (jgx != null) {
            if (z) {
                a(jgx);
            }
            jgx.a();
        }
    }
}
