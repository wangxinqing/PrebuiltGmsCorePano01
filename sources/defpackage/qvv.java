package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: qvv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class qvv extends ContentObserver {
    private final qvs a;

    public qvv(String str, String str2, Handler handler) {
        super(handler);
        this.a = qvu.d.a(getClass(), 20, str, str2);
    }

    /* access modifiers changed from: protected */
    public abstract void a(boolean z, Uri uri);

    public final void onChange(boolean z) {
        onChange(z, (Uri) null);
    }

    public final void onChange(boolean z, Uri uri) {
        String str;
        qvs qvs;
        if (!z) {
            qvs = this.a;
            str = "onChange";
        } else {
            qvs = this.a;
            str = "onSelfChange";
        }
        amky b = qvs.b(str);
        try {
            a(z, uri);
            if (b != null) {
                b.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
