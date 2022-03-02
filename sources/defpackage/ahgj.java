package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: ahgj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ahgj implements ahek {
    public static ahgj a(audx audx, aubs aubs) {
        return new ahgi(audx, aubs);
    }

    public abstract audx a();

    public abstract aubs b();

    public final audx a(InputStream inputStream) {
        return (audx) a().n().d(inputStream, b());
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, OutputStream outputStream) {
        ((audx) obj).a(outputStream);
    }
}
