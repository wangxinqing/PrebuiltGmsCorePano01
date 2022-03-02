package defpackage;

import android.content.Context;

/* renamed from: zza  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zza {
    private static zza b;
    private final iwr a;

    private zza(Context context) {
        this.a = iwr.a(context.getApplicationContext());
    }

    static synchronized zza a(Context context) {
        zza zza;
        synchronized (zza.class) {
            if (b == null) {
                b = new zza(context);
            }
            zza = b;
        }
        return zza;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.a.a();
    }
}
