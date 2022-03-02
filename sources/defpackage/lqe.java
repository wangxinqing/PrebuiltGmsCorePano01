package defpackage;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ui.select.path.FolderPathElement;
import com.google.android.gms.drive.ui.select.path.PathElement;
import com.google.android.gms.drive.ui.select.path.PathStack;

/* renamed from: lqe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lqe implements icm {
    final /* synthetic */ PathStack a;
    private final DriveId b;
    private final boolean c;
    private final boolean d;

    public lqe(PathStack pathStack, DriveId driveId, boolean z, boolean z2) {
        this.a = pathStack;
        this.b = driveId;
        this.c = z;
        this.d = z2;
    }

    private final void a(PathElement pathElement) {
        this.a.c.set(0, pathElement);
        this.a.a();
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        kus kus = (kus) icl;
        if (kus.a.c()) {
            jzt jzt = kus.b;
            try {
                if (jzt.a() > 0) {
                    jzr b2 = jzt.a(0);
                    if (!b2.a().equals(this.b)) {
                        a((PathElement) new FolderPathElement(b2));
                    } else {
                        a((PathElement) lqj.a);
                    }
                } else if (this.c) {
                    a((PathElement) lqj.b);
                } else if (!this.d) {
                    a((PathElement) lqj.a);
                } else {
                    a((PathElement) lqj.c);
                }
            } finally {
                jzt.c();
            }
        } else {
            PathStack.a.b("Unable to list parents, status: %s", kus.a);
        }
    }
}
