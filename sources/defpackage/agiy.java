package defpackage;

import android.content.Context;

/* renamed from: agiy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agiy {
    private static final anhq a = anhq.a("agiy");
    private volatile boolean b;

    /* access modifiers changed from: package-private */
    public final boolean a(Context context, String str, boolean z) {
        if (!this.b) {
            try {
                return aeeg.a(context.getContentResolver(), str, z);
            } catch (SecurityException e) {
                this.b = true;
                anhn anhn = (anhn) a.c();
                anhn.a((Throwable) e);
                ((anhn) anhn.a("agiy", "a", 27, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to read GServices.");
            }
        }
        return z;
    }
}
