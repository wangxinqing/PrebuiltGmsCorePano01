package defpackage;

import android.text.TextUtils;
import com.android.volley.toolbox.ImageLoader;

/* renamed from: fct  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fct implements agaf, agcm {
    private static volatile ImageLoader a;
    private final String b;

    public fct(String str) {
        this.b = str;
    }

    public final /* bridge */ /* synthetic */ String a(Object obj) {
        String str = this.b;
        int hashCode = ((fcp) obj).hashCode();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
        sb.append(str);
        sb.append(hashCode);
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ CharSequence b(Object obj) {
        return ((fcp) obj).c;
    }

    public final /* bridge */ /* synthetic */ CharSequence c(Object obj) {
        return ((fcp) obj).d;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, int i, agcl agcl) {
        ImageLoader imageLoader;
        fcp fcp = (fcp) obj;
        if (fcp.e != null || TextUtils.isEmpty(fcp.f)) {
            agcl.a(fcp.e);
            return;
        }
        if (a == null) {
            synchronized (fct.class) {
                if (a != null) {
                    imageLoader = a;
                } else {
                    a = new ImageLoader(ihs.b().getRequestQueue(), new iqj());
                }
            }
            a = imageLoader;
            a.get(fcp.f, new fcs(agcl));
        }
        imageLoader = a;
        a = imageLoader;
        a.get(fcp.f, new fcs(agcl));
    }
}
