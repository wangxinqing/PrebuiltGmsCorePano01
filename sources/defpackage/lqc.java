package defpackage;

import com.google.android.gms.drive.ui.select.path.FolderPathElement;
import com.google.android.gms.drive.ui.select.path.PathElement;
import com.google.android.gms.drive.ui.select.path.PathStack;

/* renamed from: lqc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class lqc implements icm {
    private final PathStack a;

    public lqc(PathStack pathStack) {
        this.a = pathStack;
    }

    public final void a(icl icl) {
        PathStack pathStack = this.a;
        kvn kvn = (kvn) icl;
        if (kvn.a.c()) {
            pathStack.c = PathStack.a((PathElement) new FolderPathElement(kvn.b));
            pathStack.a();
            return;
        }
        PathStack.a.b("Could not retrieve metadata, status: %s", kvn.a);
    }
}
