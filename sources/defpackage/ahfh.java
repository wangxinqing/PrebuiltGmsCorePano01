package defpackage;

import android.net.Uri;
import java.io.IOException;

/* renamed from: ahfh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahfh implements aoqb {
    private final ahfj a;

    public ahfh(ahfj ahfj) {
        this.a = ahfj;
    }

    public final aorr a(Object obj) {
        ahfj ahfj = this.a;
        Uri uri = (Uri) obj;
        Uri a2 = ahfz.a(uri, ".bak");
        try {
            if (ahfj.e.c(a2)) {
                ahfj.e.a(a2, uri);
            }
            return aorl.a((Object) null);
        } catch (IOException e) {
            return aorl.a((Throwable) e);
        }
    }
}
