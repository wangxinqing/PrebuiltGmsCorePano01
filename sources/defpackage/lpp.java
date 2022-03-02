package defpackage;

import com.google.android.gms.drive.ui.select.path.PathElement;
import com.google.android.gms.drive.ui.select.path.PathStack;
import com.google.android.gms.drive.ui.select.path.SearchPathElement;
import java.util.List;

/* renamed from: lpp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lpp implements aef {
    final /* synthetic */ lpq a;

    public lpp(lpq lpq) {
        this.a = lpq;
    }

    public final boolean a(String str) {
        PathElement b = this.a.h.b();
        if ((b instanceof SearchPathElement) && !str.equals(((SearchPathElement) b).a)) {
            PathStack pathStack = this.a.h;
            SearchPathElement searchPathElement = new SearchPathElement(str);
            iva.a(!pathStack.c.isEmpty(), (Object) "Not initialized yet");
            iva.a(pathStack.b() instanceof SearchPathElement, (Object) "A search query can only replace another search query");
            List list = pathStack.c;
            list.set(list.size() - 1, searchPathElement);
            pathStack.a();
        }
        return true;
    }

    public final void b(String str) {
        a(str);
    }
}
