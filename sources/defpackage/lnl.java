package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.internal.model.File;
import com.google.android.gms.drive.internal.model.FileLocalId;
import com.google.android.gms.drive.internal.model.ParentReference;
import com.google.android.gms.drive.internal.model.Permission;
import com.google.android.gms.drive.internal.model.User;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: lnl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lnl implements lnj {
    public final File a;
    private final ClientContext b;
    private final Set c;
    private final String d;

    public lnl(File file, ClientContext clientContext, String str) {
        iva.a((Object) file);
        this.a = file;
        iva.a((Object) clientContext);
        this.b = clientContext;
        this.d = str;
        HashSet hashSet = new HashSet();
        List list = file.G;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ParentReference parentReference = (ParentReference) list.get(i);
                hashSet.add(!parentReference.c ? parentReference.b : "root");
            }
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }

    public final boolean A() {
        return this.a.v.e;
    }

    public final boolean B() {
        return this.a.v.b;
    }

    public final String C() {
        return this.a.D;
    }

    public final long D() {
        return this.a.J;
    }

    public final String E() {
        return this.a.W;
    }

    public final String F() {
        return this.a.X;
    }

    public final String G() {
        return this.a.S;
    }

    public final List H() {
        List list = this.a.I;
        return list == null ? Collections.emptyList() : list;
    }

    public final boolean I() {
        return this.a.c;
    }

    public final Permission J() {
        return this.a.U;
    }

    public final String K() {
        return this.a.s;
    }

    public final String L() {
        FileLocalId fileLocalId = this.a.y;
        if (fileLocalId != null) {
            return fileLocalId.c;
        }
        return null;
    }

    public final String M() {
        return this.a.g;
    }

    public final String N() {
        FileLocalId fileLocalId = this.a.y;
        if (fileLocalId != null) {
            return fileLocalId.d;
        }
        return null;
    }

    public final User O() {
        return this.a.O;
    }

    public final User P() {
        return this.a.w;
    }

    public final boolean Q() {
        return this.a.Y;
    }

    public final String R() {
        return this.d;
    }

    public final long S() {
        return this.a.V;
    }

    public final String T() {
        return this.a.p;
    }

    public final List U() {
        List list = this.a.q;
        return list == null ? amzy.h() : list;
    }

    public final Boolean V() {
        if (this.a.a.contains(69)) {
            return Boolean.valueOf(this.a.Q);
        }
        return null;
    }

    public final List W() {
        if (this.a.a.contains(68)) {
            return this.a.P;
        }
        return Collections.emptyList();
    }

    public final List X() {
        List list = this.a.H;
        return list == null ? amzy.h() : list;
    }

    public final boolean Y() {
        return this.a.r;
    }

    public final String Z() {
        return this.a.K;
    }

    public final boolean a() {
        return this.a.v.c;
    }

    public final String aa() {
        return this.a.L;
    }

    public final boolean b() {
        return this.a.M;
    }

    public final boolean c() {
        return false;
    }

    public final boolean d() {
        return lnn.a(this.b);
    }

    public final Set e() {
        return this.c;
    }

    public final Set f() {
        List list = this.a.d;
        if (list != null) {
            return Collections.unmodifiableSet(angm.a((Iterable) list));
        }
        return Collections.emptySet();
    }

    public final String g() {
        return this.a.t;
    }

    public final String h() {
        return this.a.N;
    }

    public final String i() {
        return this.a.B;
    }

    public final String j() {
        return this.a.x;
    }

    public final String k() {
        return this.a.z;
    }

    public final String l() {
        return this.a.T;
    }

    public final String m() {
        return this.a.i;
    }

    public final boolean n() {
        return this.a.v.d;
    }

    public final String o() {
        return this.a.C;
    }

    public final String p() {
        return this.a.f;
    }

    public final String q() {
        return this.a.A;
    }

    public final boolean r() {
        return this.a.m;
    }

    public final boolean s() {
        return this.a.j;
    }

    public final amzy t() {
        List list = this.a.E;
        return list == null ? amzy.h() : amzy.a((Collection) list);
    }

    public final String u() {
        return this.a.b;
    }

    public final String v() {
        return this.a.h;
    }

    public final boolean w() {
        return this.a.e;
    }

    public final String x() {
        return this.a.k;
    }

    public final String y() {
        return this.a.n;
    }

    public final long z() {
        return this.a.o;
    }
}
