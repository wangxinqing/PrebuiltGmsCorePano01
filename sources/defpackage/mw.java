package defpackage;

import android.util.Base64;
import java.util.List;

/* renamed from: mw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mw {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final String e = (this.a + "-" + this.b + "-" + this.c);

    public mw(String str, String str2, String str3, List list) {
        ot.a((Object) str);
        this.a = str;
        ot.a((Object) str2);
        this.b = str2;
        ot.a((Object) str3);
        this.c = str3;
        ot.a((Object) list);
        this.d = list;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.a + ", mProviderPackage: " + this.b + ", mQuery: " + this.c + ", mCertificates:");
        for (int i = 0; i < this.d.size(); i++) {
            sb.append(" [");
            List list = (List) this.d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: 0");
        return sb.toString();
    }
}
