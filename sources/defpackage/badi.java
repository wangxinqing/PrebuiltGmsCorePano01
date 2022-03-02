package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* renamed from: badi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class badi {
    public static final Logger a = Logger.getLogger(badi.class.getName());
    public final String b;
    public final AtomicLong c = new AtomicLong();

    public badi(String str) {
        amrl.a(true, (Object) "value must be positive");
        this.b = str;
        this.c.set(Long.MAX_VALUE);
    }
}
