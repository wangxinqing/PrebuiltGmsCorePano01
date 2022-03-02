package defpackage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.gms.appinvite.model.ContactPerson;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dyq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dyq extends dyj {
    public final dyr f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public String j;
    public String k;
    public int l;
    public final List m = new ArrayList();
    public Object[] n;
    public int[] o;
    private final int p;
    private final int q;
    private final boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private final wli v;
    private final View.OnClickListener w;
    private final View.OnLongClickListener x;
    private final View.OnClickListener y;

    public dyq(dyr dyr, int i2, int i3, boolean z, int i4, boolean z2) {
        this.f = dyr;
        this.p = i2;
        this.q = i3;
        this.r = z;
        this.g = i4;
        this.h = z2;
        this.i = true;
        wlh wlh = new wlh();
        wlh.a = 1;
        wlh.b();
        this.v = wlh.a();
        this.w = new dyn(this);
        this.x = new dyo(this);
        this.y = new dyp(this);
    }

    private static final void a(dzt dzt, String str) {
        dzt.s.setText(str);
    }

    private final void c(ContactPerson contactPerson) {
        if (!this.a) {
            for (int i2 = 0; i2 < this.m.size(); i2++) {
                if (eap.d(contactPerson, (ContactPerson) this.m.get(i2))) {
                    K(this.l + i2);
                }
            }
        }
    }

    private final ContactPerson h(int i2) {
        return (ContactPerson) this.m.get(i2);
    }

    private final int i(int i2) {
        if (i2 >= this.l) {
            return 3;
        }
        if (i2 == 0) {
            if (!TextUtils.isEmpty(this.j)) {
                return 1;
            }
            if (TextUtils.isEmpty(this.k)) {
                return -1;
            }
            return 2;
        } else if (i2 != 1 || TextUtils.isEmpty(this.j) || TextUtils.isEmpty(this.k)) {
            return -1;
        } else {
            return 2;
        }
    }

    public final long J(int i2) {
        int i3 = this.l;
        if (i2 >= i3) {
            i2 = h(i2 - i3).hashCode();
        }
        return (long) i2;
    }

    public final void b(ContactPerson contactPerson) {
        c(contactPerson);
    }

    public final void d(boolean z) {
        this.s = z;
    }

    public final void e(boolean z) {
        this.t = z;
    }

    public final int f() {
        Object[] objArr = this.n;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    public final int g(int i2) {
        int i3 = i(i2);
        if (i3 == 1) {
            return this.q;
        }
        if (i3 == 2) {
            return this.q;
        }
        if (this.r) {
            return this.q;
        }
        return 1;
    }

    public final int getPositionForSection(int i2) {
        return this.o[i2];
    }

    public final int getSectionForPosition(int i2) {
        int i3 = 1;
        while (true) {
            int[] iArr = this.o;
            if (i3 >= iArr.length) {
                return this.n.length - 1;
            }
            if (i2 < iArr[i3]) {
                return i3 - 1;
            }
            i3++;
        }
    }

    public final Object[] getSections() {
        return this.n;
    }

    public final int a() {
        if (this.a || this.m.size() <= 0) {
            return 0;
        }
        return this.l + this.m.size();
    }

    /* access modifiers changed from: protected */
    public final void c() {
        as();
    }

    /* access modifiers changed from: protected */
    public final void g(boolean z) {
        if (!z) {
            c(0, this.l + this.m.size());
        } else {
            d(0, this.l + this.m.size());
        }
    }

    public final int a(int i2) {
        int i3 = i(i2);
        if (i3 != 1) {
            return i3 != 2 ? this.p : R.layout.appinvite_contextual_selection_sub_header_text;
        }
        return R.layout.appinvite_contextual_selection_header_text;
    }

    public final void c(boolean z) {
        this.u = z;
        as();
    }

    public final adl a(ViewGroup viewGroup, int i2) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false);
        if (i2 == R.layout.appinvite_contextual_selection_header_text || i2 == R.layout.appinvite_contextual_selection_sub_header_text) {
            return new dzt(inflate);
        }
        if (i2 == R.layout.appinvite_contextual_selection_grid_item) {
            return new dzp(inflate);
        }
        return null;
    }

    public final void a(adl adl, int i2) {
        boolean z;
        View.OnClickListener onClickListener;
        int i3 = i2;
        int i4 = i(i3);
        boolean z2 = true;
        if (i4 == 1) {
            a((dzt) adl, this.j);
        } else if (i4 != 2) {
            dzp dzp = (dzp) adl;
            ContactPerson h2 = h(i3 - this.l);
            boolean a = this.f.a(h2);
            boolean b = this.f.b(h2);
            dxx dxx = (dxx) this.f;
            dym.a(dxx.b, this.v, dzp, h2, a, b, this.u, this.s, this.t, dxx.i, dxx.j, this.e);
            View view = dzp.a;
            if (h2.e.size() > 0) {
                z = true;
            } else {
                z = false;
            }
            view.setEnabled(z);
            dzp.a.setSelected(a);
            dzp.a.setOnClickListener(this.w);
            dzp.a.setOnLongClickListener(this.x);
            dzp.a.setTag(R.id.appinvite_chip_view_holder_tag_person, h2);
            View view2 = dzp.B;
            if (view2 != null) {
                if (!this.s) {
                    z2 = false;
                } else if (b || h2.e.size() <= 1) {
                    z2 = false;
                }
                if (z2) {
                    onClickListener = this.y;
                } else {
                    onClickListener = null;
                }
                view2.setOnClickListener(onClickListener);
                view2.setClickable(z2);
            }
        } else {
            a((dzt) adl, this.k);
        }
    }

    public final void a(ContactPerson contactPerson) {
        c(contactPerson);
    }

    public final void a(ContactPerson contactPerson, int i2) {
        c(contactPerson);
    }

    public final void a(String str, String str2) {
        this.j = str;
        this.k = str2;
        this.l = 0;
        if (!TextUtils.isEmpty(str)) {
            this.l++;
        }
        if (!TextUtils.isEmpty(this.k)) {
            this.l++;
        }
        as();
    }
}
