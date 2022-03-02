package defpackage;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.gms.common.Feature;

/* renamed from: qxn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qxn extends qxm {
    private final aabf b;

    public qxn(Context context, int i, int i2, aabf aabf) {
        super(context, i, i2);
        this.b = aabf;
    }

    public final void a(nxn nxn) {
        aabf aabf = this.b;
        int i = nxn.p;
        iha b2 = ihb.b();
        b2.b = new Feature[]{aaao.b};
        b2.a = new aacw(i);
        ((iby) aabf).a(b2.a());
    }

    public final void b(ComponentName componentName) {
        this.b.a(a(componentName));
    }

    public final void b(ComponentName componentName, String str) {
        this.b.a(a(componentName, str));
    }

    public final boolean b(qxx qxx) {
        this.b.a(a(qxx));
        return true;
    }
}
