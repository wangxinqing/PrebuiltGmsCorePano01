package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.RemoveHarmfulAppData;

/* renamed from: aauk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aauk extends aanq {
    private static aauk d;
    protected String b;
    protected byte[] c;

    static {
        aauk.class.getSimpleName();
    }

    private aauk(Context context) {
        this.a = context;
    }

    public static synchronized aauk a(Context context) {
        aauk aauk;
        synchronized (aauk.class) {
            if (d == null) {
                d = new aauk(context.getApplicationContext());
            }
            aauk = d;
        }
        return aauk;
    }

    static synchronized void a() {
        synchronized (aauk.class) {
            d = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        aank.a(this.a).a(3);
        a();
    }

    /* access modifiers changed from: protected */
    public final void a(Status status, zzw zzw, int i) {
        int i2;
        boolean z;
        synchronized (this) {
            if (i == 3) {
                i2 = 2;
            } else {
                i2 = i;
            }
            if (i == 3) {
                z = true;
            } else {
                z = false;
            }
            try {
                zzw.a(status, new RemoveHarmfulAppData(i2, z));
            } catch (RemoteException e) {
            }
        }
    }
}
