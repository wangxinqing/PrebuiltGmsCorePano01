package defpackage;

import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: qiy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class qiy implements Callable {
    private final qiz a;
    private final String b;

    public qiy(qiz qiz, String str) {
        this.a = qiz;
        this.b = str;
    }

    public final Object call() {
        qiz qiz = this.a;
        String str = this.b;
        qev a2 = qiz.b.a();
        qiz.o(str);
        a2.a("MetadataDatastore.downloadIconToFile");
        File file = new File(qiz.d, str);
        synchronized (qiz.e) {
            qiz.e.remove(str);
            if (!file.isFile()) {
                file = null;
            }
        }
        return file;
    }
}
