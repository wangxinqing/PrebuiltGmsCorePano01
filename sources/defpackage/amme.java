package defpackage;

import java.io.IOException;

/* renamed from: amme  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amme extends IOException {
    public amme(String str) {
        super(str);
    }

    public amme(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
