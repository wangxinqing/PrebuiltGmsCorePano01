package defpackage;

import android.net.Uri;
import android.os.Build;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.Future;

/* renamed from: ahff  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahff implements aoqb {
    private final ahfj a;
    private final aorr b;

    public ahff(ahfj ahfj, aorr aorr) {
        this.a = ahfj;
        this.b = aorr;
    }

    public final aorr a(Object obj) {
        OutputStream outputStream;
        ahfj ahfj = this.a;
        aorr aorr = this.b;
        Uri uri = (Uri) aorl.a((Future) ahfj.b);
        Uri a2 = ahfz.a(uri, ".tmp");
        try {
            String valueOf = String.valueOf(ahfj.a);
            amkr a3 = amlv.a(valueOf.length() == 0 ? new String("Write ") : "Write ".concat(valueOf), amlw.a);
            try {
                ahap ahap = new ahap();
                try {
                    outputStream = (OutputStream) ahfj.e.a(a2, ahcm.a(), ahap);
                    ahfj.c.a(obj, outputStream);
                    ahap.a();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (a3 != null) {
                        a3.close();
                    }
                    ahfj.e.a(a2, uri);
                    synchronized (ahfj.f) {
                        ahfj.g = aorr;
                    }
                    return aorl.a((Object) null);
                } catch (IOException e) {
                    throw ahfy.b(ahfj.e, uri, e);
                } catch (Throwable th) {
                    apev.a(th, th);
                }
                throw th;
            } catch (Throwable th2) {
                if (a3 != null) {
                    a3.close();
                }
                throw th2;
            }
        } catch (IOException e2) {
            if (ahfj.e.c(a2)) {
                try {
                    ahfj.e.a(a2);
                } catch (IOException e3) {
                    int i = Build.VERSION.SDK_INT;
                    apev.a((Throwable) e2, (Throwable) e3);
                }
            }
            throw e2;
        } catch (Throwable th3) {
            apev.a(th2, th3);
        }
    }
}
