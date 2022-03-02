package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: ztg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ztg {
    public static final rbo a;
    private static qyp b;

    static {
        rbn rbn = new rbn(avew.SYNC_ID_UNKNOWN);
        rbn.a(avew.SYNC_ID_UPLOAD_CONTACTS_INCREMENTAL, rav.a("com.google.android.gms.romanesco.ContactsLoggerUploadService", "upload-contacts-incremental-periodic", "upload-contacts-incremental-oneoff", zte.a));
        rbn.a(avew.SYNC_ID_UPLOAD_CONTACTS_BATCH, rav.a("com.google.android.gms.romanesco.ContactsLoggerUploadService", "upload-contacts-batch-periodic", "upload-contacts-batch-oneoff", ztf.a));
        a = rbn.a();
    }

    public static synchronized qyp a(Context context) {
        qyp qyp;
        synchronized (ztg.class) {
            if (b == null) {
                Context applicationContext = context.getApplicationContext();
                aoru b2 = jfm.b(10);
                rbi a2 = rbi.a();
                a2.b(applicationContext);
                a2.b(new rbk());
                a2.a(a);
                a2.a((amsv) new ztd(applicationContext));
                a2.a((Executor) b2);
                a2.a(qve.a);
                a2.a("romanesco");
                afto afto = new afto(applicationContext, aftq.a);
                amrl.a((Object) afto);
                a2.h = afto;
                b = a2.a(avey.g);
            }
            qyp = b;
        }
        return qyp;
    }
}
