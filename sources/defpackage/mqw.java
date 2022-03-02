package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: mqw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mqw extends agyr {
    public static mqw a;
    private static final anax b = anax.a((Collection) axgp.b().a);
    private static final anax c;
    private static final anax d = anax.a((Collection) axgp.b().c);
    private static final anax e = anax.a((Collection) axgp.b().d);

    static {
        aucx aucx = axgp.b().b;
        ArrayList arrayList = new ArrayList();
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((axgt) aucx.get(i)).a);
        }
        c = anax.a((Collection) arrayList);
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str) {
        Uri parse = Uri.parse(str);
        if (!parse.isAbsolute() || !parse.isHierarchical()) {
            return false;
        }
        if (b.contains(parse.getHost())) {
            if (c.contains(parse.getPathSegments())) {
                return false;
            }
            return true;
        } else if (d.contains(parse.getHost())) {
            return true;
        } else {
            String uri = parse.toString();
            anhj a2 = e.iterator();
            while (a2.hasNext()) {
                if (uri.startsWith((String) a2.next())) {
                    return true;
                }
            }
            return false;
        }
    }
}
