package defpackage;

import android.content.ActivityNotFoundException;
import android.net.Uri;
import com.google.android.chimera.Fragment;

/* renamed from: cyk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cyk extends cyi {
    private final aqqf c;
    private final dih d;
    private final Fragment e;
    private final iwd f;

    public cyk(aqqf aqqf, dih dih, Fragment fragment, iwd iwd, czc czc, czb czb) {
        super(czc, czb);
        this.c = aqqf;
        this.d = dih;
        this.e = fragment;
        this.f = iwd;
    }

    public final void a() {
        if ((this.c.a & 1) == 0) {
            this.b.a(new IllegalArgumentException("No URL"));
        } else if (!jkf.a(ihs.b())) {
            this.b.a(new babk(babj.f));
        } else {
            try {
                aqqf aqqf = this.c;
                Uri a = cyj.a(aqqf.b, aqqf.c, this.d);
                Fragment fragment = this.e;
                fragment.startActivityForResult(cyj.a(fragment.getContext(), a), 2);
                this.a.a(true);
            } catch (ActivityNotFoundException e2) {
                this.f.b("Error starting browser", e2, new Object[0]);
                this.b.a(e2);
            }
        }
    }
}
