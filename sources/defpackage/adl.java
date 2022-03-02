package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: adl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class adl {
    private static final List s = Collections.emptyList();
    public final View a;
    public WeakReference b;
    public int c;
    public int d;
    public long e;
    public int f;
    int g;
    public adl h;
    public adl i;
    int j;
    List k;
    List l;
    adb m;
    boolean n;
    public int o;
    public int p;
    RecyclerView q;
    acg r;
    private int t;

    public adl(View view) {
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = null;
        this.i = null;
        this.k = null;
        this.l = null;
        this.t = 0;
        this.m = null;
        this.n = false;
        this.o = 0;
        this.p = -1;
        if (view != null) {
            this.a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i2, int i3) {
        this.j = (i2 & i3) | (this.j & (i3 ^ -1));
    }

    /* access modifiers changed from: package-private */
    public final void a(adb adb, boolean z) {
        this.m = adb;
        this.n = z;
    }

    public final boolean a(int i2) {
        return (i2 & this.j) != 0;
    }

    public final void aw() {
        this.d = -1;
        this.g = -1;
    }

    public final boolean ax() {
        return (this.j & 128) != 0;
    }

    public final void b(int i2) {
        this.j = i2 | this.j;
    }

    public final int c() {
        int i2 = this.g;
        return i2 == -1 ? this.c : i2;
    }

    public final int d() {
        RecyclerView recyclerView;
        acg adapter;
        int adapterPositionInRecyclerView;
        if (this.r == null || (recyclerView = this.q) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.q.getAdapterPositionInRecyclerView(this)) == -1 || this.r != adapter) {
            return -1;
        }
        return adapterPositionInRecyclerView;
    }

    public final int e() {
        RecyclerView recyclerView = this.q;
        if (recyclerView != null) {
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final boolean f() {
        return this.m != null;
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        this.m.b(this);
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        return (this.j & 32) != 0;
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        this.j &= -33;
    }

    public final void j() {
        this.j &= -257;
    }

    public final boolean k() {
        return (this.j & 4) != 0;
    }

    public final boolean l() {
        return (this.j & 2) != 0;
    }

    public final boolean m() {
        return (this.j & 1) != 0;
    }

    public final boolean n() {
        return (this.j & 8) != 0;
    }

    public final boolean o() {
        return (this.j & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean p() {
        return (this.a.getParent() == null || this.a.getParent() == this.q) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final void q() {
        List list = this.k;
        if (list != null) {
            list.clear();
        }
        this.j &= -1025;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List r() {
        /*
            r1 = this;
            int r0 = r1.j
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 != 0) goto L_0x0013
            java.util.List r0 = r1.k
            if (r0 == 0) goto L_0x0013
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0013
            java.util.List r0 = r1.l
            return r0
        L_0x0013:
            java.util.List r0 = s
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adl.r():java.util.List");
    }

    /* access modifiers changed from: package-private */
    public final void s() {
        this.j = 0;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.g = -1;
        this.t = 0;
        this.h = null;
        this.i = null;
        q();
        this.o = 0;
        this.p = -1;
        RecyclerView.clearNestedRecyclerViewIfNotNested(this);
    }

    public final boolean t() {
        return (this.j & 16) == 0 && !qb.d(this.a);
    }

    public final String toString() {
        String str;
        String str2;
        if (!getClass().isAnonymousClass()) {
            str = getClass().getSimpleName();
        } else {
            str = "ViewHolder";
        }
        StringBuilder sb = new StringBuilder(str + "{" + Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
        if (f()) {
            sb.append(" scrap ");
            if (!this.n) {
                str2 = "[attachedScrap]";
            } else {
                str2 = "[changeScrap]";
            }
            sb.append(str2);
        }
        if (k()) {
            sb.append(" invalid");
        }
        if (!m()) {
            sb.append(" unbound");
        }
        if (l()) {
            sb.append(" update");
        }
        if (n()) {
            sb.append(" removed");
        }
        if (ax()) {
            sb.append(" ignored");
        }
        if (o()) {
            sb.append(" tmpDetached");
        }
        if (!t()) {
            sb.append(" not recyclable(" + this.t + ")");
        }
        if ((this.j & 512) != 0 || k()) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public final boolean u() {
        return (this.j & 2) != 0;
    }

    public final void a(int i2, boolean z) {
        if (this.d == -1) {
            this.d = this.c;
        }
        int i3 = this.g;
        if (i3 == -1) {
            i3 = this.c;
            this.g = i3;
        }
        if (z) {
            this.g = i3 + i2;
        }
        this.c += i2;
        if (this.a.getLayoutParams() != null) {
            ((acu) this.a.getLayoutParams()).e = true;
        }
    }

    public adl(View view, byte[] bArr) {
        this(view);
        TextView textView = (TextView) view.findViewById(R.id.subtitle);
    }

    public final void a(Object obj) {
        if (obj == null) {
            b(1024);
        } else if ((1024 & this.j) == 0) {
            if (this.k == null) {
                ArrayList arrayList = new ArrayList();
                this.k = arrayList;
                this.l = Collections.unmodifiableList(arrayList);
            }
            this.k.add(obj);
        }
    }

    public final void a(boolean z) {
        int i2 = z ? this.t - 1 : this.t + 1;
        this.t = i2;
        if (i2 < 0) {
            this.t = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z && i2 == 1) {
            this.j |= 16;
        } else if (z && i2 == 0) {
            this.j &= -17;
        }
    }
}
