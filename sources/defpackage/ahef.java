package defpackage;

import android.net.Uri;

/* renamed from: ahef  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ahef {
    public static ahee g() {
        ahee ahee = new ahee();
        ahee.a((ahfm) ahez.a);
        ahee.c = ahga.a;
        aubs b = aubs.b();
        if (b != null) {
            ahee.b = b;
            return ahee;
        }
        throw new NullPointerException("Null extensionRegistry");
    }

    public abstract Uri a();

    public abstract audx b();

    public abstract amzy c();

    public abstract ahfm d();

    public abstract aubs e();

    public abstract ahga f();
}
