package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: aang  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aang extends aanq {
    private static aang b;

    static {
        aang.class.getSimpleName();
    }

    private aang(Context context) {
        this.a = context;
    }

    public static synchronized aang a(Context context) {
        aang aang;
        synchronized (aang.class) {
            if (b == null) {
                b = new aang(context.getApplicationContext());
            }
            aang = b;
        }
        return aang;
    }

    static synchronized void a() {
        synchronized (aang.class) {
            b = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        aank.a(this.a).a(1);
        a();
    }

    /* access modifiers changed from: protected */
    public final void a(Status status, zzw zzw, int i) {
        try {
            zzw.a(status, i == 0);
        } catch (RemoteException e) {
        }
    }
}
