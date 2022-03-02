package defpackage;

import android.net.Uri;
import com.google.android.gms.mdd.MddFile;
import java.util.List;

/* renamed from: sda  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class sda implements aoqb {
    private final sdd a;
    private final List b;
    private final afkn c;
    private final aucd d;

    public sda(sdd sdd, List list, afkn afkn, aucd aucd) {
        this.a = sdd;
        this.b = list;
        this.c = afkn;
        this.d = aucd;
    }

    public final aorr a(Object obj) {
        sdd sdd = this.a;
        List list = this.b;
        afkn afkn = this.c;
        aucd aucd = this.d;
        Uri uri = (Uri) obj;
        if (uri == null) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aoju aoju = (aoju) aucd.b;
            aoju aoju2 = aoju.g;
            aoju.d = aomg.a(9);
            aoju.a |= 8;
            String str = sdd.c.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41);
            sb.append("GetFileGroupOp : ");
            sb.append(str);
            sb.append(" Failed to get file uris");
            throw new nja(13, sb.toString());
        }
        list.add(new MddFile(afkn.b, uri.toString()));
        return aorl.a((Object) null);
    }
}
