package defpackage;

import android.net.Uri;
import java.io.IOException;

/* renamed from: afsm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afsm implements amqy {
    private final afso a;

    public afsm(afso afso) {
        this.a = afso;
    }

    public final Object a(Object obj) {
        afso afso = this.a;
        Uri uri = (Uri) obj;
        if (uri != null) {
            try {
                return Long.valueOf(afso.c.e(uri));
            } catch (IOException e) {
                afsh.a((Throwable) e, "%s: Failed to call mobstore fileSize on uri %s!", "StorageLogger", uri);
            }
        }
        return 0L;
    }
}
