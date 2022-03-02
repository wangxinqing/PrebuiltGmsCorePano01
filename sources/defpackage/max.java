package defpackage;

import android.content.Context;
import android.media.MediaDrm;
import android.os.Build;
import java.util.HashMap;

/* renamed from: max  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class max {
    private final Context a;
    private final String b;

    public max(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public String a(byte[] bArr) {
        return new String(new lyx("", this.a, (Throwable) null).a(new HashMap(), bArr));
    }

    public String b() {
        return String.valueOf(jhg.a(this.a));
    }

    public String c() {
        return this.b;
    }

    public void d(Object obj, byte[] bArr) {
        int i = Build.VERSION.SDK_INT;
        synchronized (mbp.a) {
            ((MediaDrm) obj).closeSession(bArr);
        }
    }

    public void e(int i) {
        maz a2 = maz.a(this.a);
        if (i == 1) {
            a2.a(Integer.valueOf(a2.d() + 1));
        } else if (i == 0) {
            a2.a((Integer) null);
        }
        a2.a.a(((lym) a2.b.i()).k());
    }
}
