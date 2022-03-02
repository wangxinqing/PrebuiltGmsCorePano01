package defpackage;

import android.content.Context;

/* renamed from: kez  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class kez extends key {
    protected kez(String str, kec kec, kwg kwg) {
        super(str, kec, kwg);
    }

    public final void b(Context context) {
        if (this.a.f()) {
            d(context);
            return;
        }
        throw new nja(10, "App is not authorized to make this request.");
    }

    public abstract void d(Context context);

    protected kez(String str, kec kec, kwg kwg, int i) {
        super(str, kec, kwg, i);
    }

    protected kez(String str, kec kec, kwg kwg, int i, byte[] bArr) {
        super(str, kec, kwg, i, false);
    }
}
