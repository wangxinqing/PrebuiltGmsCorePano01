package defpackage;

import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.KeyFilterImpl;
import com.google.android.gms.contextmanager.internal.QueryFilterParameters;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: jtm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jtm {
    public HashSet a;
    public HashSet b;
    private final jxp c = new jxp();

    public final jtn a() {
        ArrayList arrayList;
        HashSet hashSet = this.a;
        HashSet hashSet2 = this.b;
        QueryFilterParameters a2 = this.c.a();
        ArrayList arrayList2 = null;
        if (hashSet != null) {
            arrayList = new ArrayList(hashSet);
        } else {
            arrayList = null;
        }
        if (hashSet2 != null) {
            arrayList2 = new ArrayList(hashSet2);
        }
        iva.a((Object) a2);
        return new ContextDataFilterImpl(arrayList, arrayList2, a2);
    }

    public final void b(int i) {
        iva.b(i > 0);
        this.c.b();
        this.c.a(i);
    }

    public final void a(int i) {
        if (this.a == null) {
            this.a = new HashSet();
        }
        HashSet hashSet = this.a;
        juu juu = new juu();
        juu.b();
        hashSet.add(new ContextDataFilterImpl.Inclusion(-1, i, juu.a(), (KeyFilterImpl) null));
    }

    public final void a(int i, TimeFilterImpl timeFilterImpl) {
        if (this.a == null) {
            this.a = new HashSet();
        }
        this.a.add(new ContextDataFilterImpl.Inclusion(-1, i, timeFilterImpl, (KeyFilterImpl) null));
    }

    public final void a(int[] iArr) {
        jxp jxp = this.c;
        for (int i : iArr) {
            boolean a2 = ContextData.a(i);
            StringBuilder sb = new StringBuilder(30);
            sb.append("Unknown sync state=");
            sb.append(i);
            iva.b(a2, sb.toString());
        }
        jxp.a = iArr;
    }
}
