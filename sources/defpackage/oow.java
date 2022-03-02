package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: oow  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oow {
    private static final Object b = new Object();
    private static final Object c = new Object();
    private static final Object d = new Object();
    private static WebResourceResponse e;
    private static int f;
    private static List g = new ArrayList();
    private static int h;
    private static List i = new ArrayList();
    private static int j;
    private static List k = new ArrayList();
    private static int l;
    private static String m;
    private static int n;
    private static List o = new ArrayList();
    public nzv a;
    private final nzu p;

    public oow(nzu nzu) {
        this.p = nzu;
    }

    private static List a(String str) {
        return Arrays.asList(ofx.a(str));
    }

    public static boolean b(Uri uri) {
        return uri != null && !TextUtils.isEmpty(uri.toString()) && "https".equals(uri.getScheme()) && !TextUtils.isEmpty(uri.getHost());
    }

    public oow(nzu nzu, nzv nzv) {
        this(nzu);
        this.a = nzv;
    }

    private static void a(List list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            String valueOf = String.valueOf((String) list.get(i2));
            list.set(i2, valueOf.length() == 0 ? new String("https://") : "https://".concat(valueOf));
        }
    }

    public static final void a(nzu nzu, Uri uri, nzv nzv) {
        oab oab;
        String uri2 = uri.toString();
        String str = null;
        if (!(nzv == null || (oab = nzv.a) == null)) {
            str = oab.e;
        }
        okg.a(nzu, uri2, str);
    }

    public static boolean a(Uri uri, boolean z) {
        List list;
        if (!b(uri)) {
            return false;
        }
        String host = uri.getHost();
        synchronized (b) {
            String aT = axmj.a.a().aT();
            if (j != aT.hashCode()) {
                j = aT.hashCode();
                list = a(aT);
                o = list;
            } else {
                list = o;
            }
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (host.endsWith((String) list.get(i2))) {
                return true;
            }
        }
        if (!a(uri.toString(), z)) {
            return false;
        }
        return true;
    }

    public static boolean a(String str, boolean z) {
        List list;
        if (z) {
            String b2 = axoc.a.a().b();
            if (f != b2.hashCode()) {
                iva.a("Should only be run on the UI/Main thread.");
                f = b2.hashCode();
                list = a(b2);
                a(list);
                g = list;
            } else {
                list = g;
            }
        } else {
            synchronized (c) {
                String a2 = axoc.a.a().a();
                if (h != a2.hashCode()) {
                    h = a2.hashCode();
                    List a3 = a(a2);
                    a(a3);
                    i = a3;
                    list = a3;
                } else {
                    List list2 = i;
                    list = list2;
                }
            }
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (str.startsWith((String) list.get(i2))) {
                return true;
            }
        }
        return false;
    }

    public final WebResourceResponse a(Uri uri) {
        String str;
        List list;
        synchronized (d) {
            String z = axmj.z();
            if (n != z.hashCode()) {
                m = Uri.parse(z).getAuthority().toLowerCase(Locale.US);
                n = z.hashCode();
            }
            str = m;
        }
        if (str.equalsIgnoreCase(uri.getAuthority())) {
            synchronized (d) {
                String aJ = axmj.a.a().aJ();
                if (l != aJ.hashCode()) {
                    k = a(aJ);
                    l = aJ.hashCode();
                }
                list = k;
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (uri.getPath().contains((CharSequence) list.get(i2))) {
                    return omq.a(this.p.k(), this.p.f(), uri.toString(), this.p.h());
                }
            }
        }
        if (uri != null) {
            String host = uri.getHost();
            if (!TextUtils.isEmpty(host)) {
                host = host.toLowerCase(Locale.US);
            }
            String scheme = uri.getScheme();
            if (!TextUtils.isEmpty(scheme)) {
                scheme = scheme.toLowerCase(Locale.US);
            }
            if (ofq.b(axno.a.a().a())) {
                if ("data".equals(scheme) && TextUtils.isEmpty(host) && uri.getSchemeSpecificPart().startsWith("image/") && uri.getSchemeSpecificPart().contains(";base64")) {
                    return null;
                }
            } else if ("data".equals(scheme) && TextUtils.isEmpty(host) && uri.getSchemeSpecificPart().contains(";base64")) {
                return null;
            }
            if (a(uri, false)) {
                return null;
            }
            a(this.p, uri, this.a);
        }
        if (e == null) {
            e = new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
        }
        return e;
    }
}
