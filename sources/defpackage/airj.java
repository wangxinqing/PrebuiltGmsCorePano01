package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.io.PrintWriter;

/* renamed from: airj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class airj implements aiph {
    private final aiph a;
    private final Object b;

    public airj(aiph aiph, Object obj) {
        this.a = aiph;
        this.b = obj;
    }

    public final PendingIntent a(String str) {
        PendingIntent a2;
        synchronized (this.b) {
            a2 = this.a.a(str);
        }
        return a2;
    }

    public final Object i() {
        throw null;
    }

    public final void a(aicn aicn) {
        synchronized (this.b) {
            this.a.a(aicn);
        }
    }

    public final void a(aixc aixc) {
        synchronized (this.b) {
            this.a.a(aixc);
        }
    }

    public final void a(PendingIntent pendingIntent, aixc aixc) {
        synchronized (this.b) {
            this.a.a(pendingIntent, aixc);
        }
    }

    public final void a(Context context, ajbg ajbg, PendingIntent pendingIntent, Object obj, boolean z, ajrb ajrb, String str, ifu ifu, aixc aixc) {
        synchronized (this.b) {
            this.a.a(context, ajbg, pendingIntent, obj, z, ajrb, str, ifu, aixc);
        }
    }

    public final void a(Context context, Object obj, Bundle bundle, aixc aixc) {
        synchronized (this.b) {
            this.a.a(context, obj, bundle, aixc);
        }
    }

    public final void a(PrintWriter printWriter) {
        synchronized (this.b) {
            this.a.a(printWriter);
        }
    }
}
