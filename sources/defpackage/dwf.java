package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dwf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dwf {
    public final dwg a;
    public final ClientContext b;
    public final List c = new ArrayList();
    public List d;

    public dwf(dwg dwg, ClientContext clientContext) {
        this.a = dwg;
        this.b = clientContext;
    }

    public final boolean a() {
        int b2 = b();
        return b2 >= 0 && (((amdx) this.d.get(b2)).a & 2) != 0;
    }

    public final int b() {
        if (this.d != null) {
            for (int i = 0; i < this.d.size(); i++) {
                amdw amdw = ((amdx) this.d.get(i)).b;
                if (amdw == null) {
                    amdw = amdw.b;
                }
                if (amdw.a == 0) {
                    return i;
                }
            }
        }
        return -1;
    }
}
