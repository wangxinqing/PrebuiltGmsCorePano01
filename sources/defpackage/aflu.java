package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.List;

/* renamed from: aflu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aflu implements aoqb {
    private final afme a;
    private final afkn b;
    private final aucd c;

    public aflu(afme afme, aucd aucd, afkn afkn) {
        this.a = afme;
        this.c = aucd;
        this.b = afkn;
    }

    public final aorr a(Object obj) {
        afme afme = this.a;
        aucd aucd = this.c;
        afkn afkn = this.b;
        Uri uri = (Uri) obj;
        if (uri == null) {
            afkd a2 = afkf.a();
            a2.a = afke.DOWNLOADED_FILE_NOT_FOUND_ERROR;
            a2.b = "getDataFileUri() resolved to null";
            return aorl.a((Throwable) a2.a());
        }
        try {
            if (!afme.d.d(uri)) {
                aucd.a(afme.a(afkn.b, afkn.d, afkn.i, uri.toString()));
            } else {
                String path = uri.getPath();
                if (path != null) {
                    List a3 = afme.a(uri, path);
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    afjh afjh = (afjh) aucd.b;
                    afjh afjh2 = afjh.h;
                    afjh.a();
                    auab.a((Iterable) a3, (List) afjh.g);
                }
            }
        } catch (IOException e) {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("Failed to list files under directory:");
            sb.append(valueOf);
            afsh.a((Throwable) e, sb.toString());
        }
        return aorl.a((Object) aucd);
    }
}
