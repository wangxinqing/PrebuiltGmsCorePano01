package defpackage;

import android.view.View;
import com.google.android.gms.drive.ui.select.path.PathStack;
import com.google.android.gms.drive.ui.select.path.ViewPathElement;

/* renamed from: lpy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class lpy implements View.OnClickListener {
    private final ViewPathElement a;
    private final lpi b;

    public lpy(lpi lpi, ViewPathElement viewPathElement) {
        this.b = lpi;
        this.a = viewPathElement;
    }

    public void onClick(View view) {
        lpi lpi = this.b;
        ViewPathElement viewPathElement = this.a;
        int i = lpz.t;
        if (lpi.a.h.b() == PathStack.b) {
            PathStack pathStack = lpi.a.h;
            boolean z = true;
            iva.a(!pathStack.c.isEmpty(), (Object) "Not initialized yet");
            if (pathStack.b() != PathStack.b) {
                z = false;
            }
            iva.a(z, (Object) "Can only push a view on top of the root path element");
            pathStack.c.add(viewPathElement);
            pathStack.a();
        }
    }
}
