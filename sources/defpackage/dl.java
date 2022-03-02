package defpackage;

import android.content.Context;
import android.os.Build;

/* renamed from: dl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dl implements de {
    private final Context a;
    private final String b;
    private final db c;
    private final Object d = new Object();
    private dk e;
    private boolean f;

    public dl(Context context, String str, db dbVar) {
        this.a = context;
        this.b = str;
        this.c = dbVar;
    }

    private final dk b() {
        dk dkVar;
        synchronized (this.d) {
            if (this.e == null) {
                int i = Build.VERSION.SDK_INT;
                this.e = new dk(this.a, this.b, new di[1], this.c);
                int i2 = Build.VERSION.SDK_INT;
                this.e.setWriteAheadLoggingEnabled(this.f);
            }
            dkVar = this.e;
        }
        return dkVar;
    }

    public final di a() {
        return b().a();
    }

    public final void close() {
        b().close();
    }

    public final void a(boolean z) {
        synchronized (this.d) {
            dk dkVar = this.e;
            if (dkVar != null) {
                dkVar.setWriteAheadLoggingEnabled(z);
            }
            this.f = z;
        }
    }
}
