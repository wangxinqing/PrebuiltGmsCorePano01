package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: ygt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ygt implements njb {
    public static final ygt a = new ygt();
    private static final Object b = new Object();
    private static volatile boolean c = false;

    private ygt() {
    }

    public final void a() {
    }

    public final void a(nis nis, Status status) {
        if (!c) {
            synchronized (b) {
                if (!c) {
                    yij.d(ihs.b());
                    c = true;
                }
            }
        }
    }
}
