package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Preference implements Comparable {
    public boolean A;
    public int B;
    public int C;
    public amj D;
    public PreferenceGroup E;
    public amn F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private List K;
    private boolean L;
    private amm M;
    private final View.OnClickListener N;
    private CharSequence a;
    private Drawable b;
    private boolean c;
    private boolean d;
    private String e;
    private Object f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    public Context k;
    public amy l;
    public long m;
    public boolean n;
    public amk o;
    public aml p;
    public int q;
    public CharSequence r;
    public int s;
    public String t;
    public Intent u;
    public String v;
    public Bundle w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new ami();

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Preference(Context context) {
        this(context, (AttributeSet) null);
    }

    private final void a(View view, boolean z2) {
        view.setEnabled(z2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                a(viewGroup.getChildAt(childCount), z2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Object a(TypedArray typedArray, int i2) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    /* access modifiers changed from: protected */
    public void a(Object obj) {
    }

    public final Set b(Set set) {
        return j() ? this.l.b().getStringSet(this.t, set) : set;
    }

    /* access modifiers changed from: protected */
    public final Preference c(String str) {
        amy amy = this.l;
        if (amy != null) {
            return amy.a((CharSequence) str);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i2 = this.q;
        int i3 = preference.q;
        if (i2 != i3) {
            return i2 - i3;
        }
        CharSequence charSequence = this.r;
        CharSequence charSequence2 = preference.r;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.r.toString());
    }

    /* access modifiers changed from: protected */
    public final int d(int i2) {
        return j() ? this.l.b().getInt(this.t, i2) : i2;
    }

    public long e() {
        return this.m;
    }

    public CharSequence f() {
        amn amn = this.F;
        return amn != null ? amn.a(this) : this.a;
    }

    public final void g(boolean z2) {
        if (j() && z2 != d(!z2)) {
            SharedPreferences.Editor c2 = this.l.c();
            c2.putBoolean(this.t, z2);
            a(c2);
        }
    }

    public boolean h() {
        return this.c && this.g && this.h;
    }

    public final boolean i() {
        return !TextUtils.isEmpty(this.t);
    }

    /* access modifiers changed from: protected */
    public final boolean j() {
        return this.l != null && this.y && i();
    }

    public final void k() {
        Intent intent;
        amx amx;
        if (h() && this.d) {
            a();
            aml aml = this.p;
            if (aml == null || !aml.a(this)) {
                amy amy = this.l;
                if ((amy == null || (amx = amy.d) == null || !amx.b(this)) && (intent = this.u) != null) {
                    this.k.startActivity(intent);
                }
            }
        }
    }

    public final void l() {
        amj amj = this.D;
        if (amj != null) {
            amj.b();
        }
    }

    public void m() {
        o();
    }

    public void n() {
        p();
    }

    public final void o() {
        if (!TextUtils.isEmpty(this.e)) {
            Preference c2 = c(this.e);
            if (c2 != null) {
                if (c2.K == null) {
                    c2.K = new ArrayList();
                }
                c2.K.add(this);
                e(c2.c());
                return;
            }
            throw new IllegalStateException("Dependency \"" + this.e + "\" not found for preference \"" + this.t + "\" (title: \"" + this.r + "\"");
        }
    }

    public final void p() {
        Preference c2;
        List list;
        String str = this.e;
        if (str != null && (c2 = c(str)) != null && (list = c2.K) != null) {
            list.remove(this);
        }
    }

    public final void q() {
        if (!this.I) {
            this.I = true;
            b();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.r;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence f2 = f();
        if (!TextUtils.isEmpty(f2)) {
            sb.append(f2);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, lj.a(context, (int) R.attr.preferenceStyle, 16842894));
    }

    public final void c(int i2) {
        a((CharSequence) this.k.getString(i2));
    }

    /* access modifiers changed from: protected */
    public final void e(String str) {
        if (j() && !TextUtils.equals(str, d((String) null))) {
            SharedPreferences.Editor c2 = this.l.c();
            c2.putString(this.t, str);
            a(c2);
        }
    }

    public final void f(boolean z2) {
        if (this.h == z2) {
            this.h = !z2;
            c(c());
            b();
        }
    }

    public Preference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    /* access modifiers changed from: protected */
    public void b() {
        int indexOf;
        amj amj = this.D;
        if (amj != null && (indexOf = ((amt) amj).a.indexOf(this)) != -1) {
            ((acg) amj).b.a(indexOf, 1, this);
        }
    }

    public void c(boolean z2) {
        List list = this.K;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((Preference) list.get(i2)).e(z2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable d() {
        this.L = true;
        return BaseSavedState.EMPTY_STATE;
    }

    public Preference(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.q = Integer.MAX_VALUE;
        this.c = true;
        this.d = true;
        this.y = true;
        this.g = true;
        this.h = true;
        this.z = true;
        this.i = true;
        this.j = true;
        this.H = true;
        this.J = true;
        this.B = R.layout.preference;
        this.N = new amh(this);
        this.k = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, anc.g, i2, i3);
        this.s = lj.a(obtainStyledAttributes, 23, 0, 0);
        this.t = lj.a(obtainStyledAttributes, 26, 6);
        this.r = lj.b(obtainStyledAttributes, 34, 4);
        this.a = lj.b(obtainStyledAttributes, 33, 7);
        this.q = lj.d(obtainStyledAttributes, 28, 8);
        this.v = lj.a(obtainStyledAttributes, 22, 13);
        this.B = lj.a(obtainStyledAttributes, 27, 3, (int) R.layout.preference);
        this.C = lj.a(obtainStyledAttributes, 35, 9, 0);
        this.c = lj.a(obtainStyledAttributes, 21, 2, true);
        this.d = lj.a(obtainStyledAttributes, 30, 5, true);
        this.y = lj.a(obtainStyledAttributes, 29, 1, true);
        this.e = lj.a(obtainStyledAttributes, 19, 10);
        this.i = lj.a(obtainStyledAttributes, 16, 16, this.d);
        this.j = lj.a(obtainStyledAttributes, 17, 17, this.d);
        if (obtainStyledAttributes.hasValue(18)) {
            this.f = a(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.f = a(obtainStyledAttributes, 11);
        }
        this.J = lj.a(obtainStyledAttributes, 31, 12, true);
        boolean hasValue = obtainStyledAttributes.hasValue(32);
        this.G = hasValue;
        if (hasValue) {
            this.H = lj.a(obtainStyledAttributes, 32, 14, true);
        }
        this.I = lj.a(obtainStyledAttributes, 24, 15, false);
        this.z = lj.a(obtainStyledAttributes, 25, 25, true);
        this.A = lj.a(obtainStyledAttributes, 20, 20, false);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public final String d(String str) {
        return j() ? this.l.b().getString(this.t, str) : str;
    }

    public final void a(int i2) {
        if (i2 != this.q) {
            this.q = i2;
            l();
        }
    }

    public boolean c() {
        return !h();
    }

    public final void e(boolean z2) {
        if (this.g == z2) {
            this.g = !z2;
            c(c());
            b();
        }
    }

    public final void a(amn amn) {
        this.F = amn;
        b();
    }

    public final void b(int i2) {
        b((CharSequence) this.k.getString(i2));
    }

    /* access modifiers changed from: protected */
    public final boolean d(boolean z2) {
        return j() ? this.l.b().getBoolean(this.t, z2) : z2;
    }

    public final void a(amy amy) {
        SharedPreferences sharedPreferences;
        this.l = amy;
        if (!this.n) {
            this.m = amy.a();
        }
        if (j()) {
            amy amy2 = this.l;
            if (amy2 != null) {
                sharedPreferences = amy2.b();
            } else {
                sharedPreferences = null;
            }
            if (sharedPreferences.contains(this.t)) {
                a((Object) null);
                return;
            }
        }
        Object obj = this.f;
        if (obj != null) {
            a(obj);
        }
    }

    public void b(Bundle bundle) {
        Parcelable parcelable;
        if (i() && (parcelable = bundle.getParcelable(this.t)) != null) {
            this.L = false;
            a(parcelable);
            if (!this.L) {
                throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
            }
        }
    }

    public final void b(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.r)) {
            this.r = charSequence;
            b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.anb r9) {
        /*
            r8 = this;
            android.view.View r0 = r9.a
            android.view.View$OnClickListener r1 = r8.N
            r0.setOnClickListener(r1)
            r1 = 0
            r0.setId(r1)
            r2 = 16908304(0x1020010, float:2.3877274E-38)
            android.view.View r2 = r9.c(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 8
            r4 = 0
            if (r2 == 0) goto L_0x0037
            java.lang.CharSequence r5 = r8.f()
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0032
            r2.setText(r5)
            r2.setVisibility(r1)
            int r2 = r2.getCurrentTextColor()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0039
        L_0x0032:
            r2.setVisibility(r3)
            goto L_0x0038
        L_0x0037:
        L_0x0038:
            r2 = r4
        L_0x0039:
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r9.c(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x0074
            java.lang.CharSequence r6 = r8.r
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x0070
            r5.setText(r6)
            r5.setVisibility(r1)
            boolean r6 = r8.G
            if (r6 == 0) goto L_0x005b
            boolean r6 = r8.H
            r5.setSingleLine(r6)
        L_0x005b:
            boolean r6 = r8.d
            if (r6 == 0) goto L_0x0060
            goto L_0x0074
        L_0x0060:
            boolean r6 = r8.h()
            if (r6 == 0) goto L_0x0074
            if (r2 == 0) goto L_0x0074
            int r2 = r2.intValue()
            r5.setTextColor(r2)
            goto L_0x0074
        L_0x0070:
            r5.setVisibility(r3)
        L_0x0074:
            r2 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r2 = r9.c(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r5 = 4
            if (r2 != 0) goto L_0x0081
            goto L_0x00b1
        L_0x0081:
            int r6 = r8.s
            if (r6 != 0) goto L_0x0089
            android.graphics.drawable.Drawable r7 = r8.b
            if (r7 == 0) goto L_0x009d
        L_0x0089:
            android.graphics.drawable.Drawable r7 = r8.b
            if (r7 != 0) goto L_0x0095
            android.content.Context r7 = r8.k
            android.graphics.drawable.Drawable r6 = defpackage.uj.b(r7, r6)
            r8.b = r6
        L_0x0095:
            android.graphics.drawable.Drawable r6 = r8.b
            if (r6 != 0) goto L_0x009a
            goto L_0x009d
        L_0x009a:
            r2.setImageDrawable(r6)
        L_0x009d:
            android.graphics.drawable.Drawable r6 = r8.b
            if (r6 != 0) goto L_0x00ad
            boolean r6 = r8.I
            if (r6 != 0) goto L_0x00a8
            r6 = 8
            goto L_0x00a9
        L_0x00a8:
            r6 = 4
        L_0x00a9:
            r2.setVisibility(r6)
            goto L_0x00b1
        L_0x00ad:
            r2.setVisibility(r1)
        L_0x00b1:
            r2 = 2131428661(0x7f0b0535, float:1.8478973E38)
            android.view.View r2 = r9.c(r2)
            if (r2 != 0) goto L_0x00c1
            r2 = 16908350(0x102003e, float:2.3877403E-38)
            android.view.View r2 = r9.c(r2)
        L_0x00c1:
            if (r2 == 0) goto L_0x00d5
            android.graphics.drawable.Drawable r6 = r8.b
            if (r6 != 0) goto L_0x00d1
            boolean r1 = r8.I
            if (r1 != 0) goto L_0x00cc
            goto L_0x00cd
        L_0x00cc:
            r3 = 4
        L_0x00cd:
            r2.setVisibility(r3)
            goto L_0x00d5
        L_0x00d1:
            r2.setVisibility(r1)
        L_0x00d5:
            boolean r1 = r8.J
            if (r1 == 0) goto L_0x00e1
            boolean r1 = r8.h()
            r8.a((android.view.View) r0, (boolean) r1)
            goto L_0x00e5
        L_0x00e1:
            r1 = 1
            r8.a((android.view.View) r0, (boolean) r1)
        L_0x00e5:
            boolean r1 = r8.d
            r0.setFocusable(r1)
            r0.setClickable(r1)
            boolean r2 = r8.i
            r9.u = r2
            boolean r2 = r8.j
            r9.v = r2
            boolean r9 = r8.A
            if (r9 == 0) goto L_0x0104
            amm r2 = r8.M
            if (r2 != 0) goto L_0x0104
            amm r2 = new amm
            r2.<init>(r8)
            r8.M = r2
        L_0x0104:
            if (r9 == 0) goto L_0x0109
            amm r2 = r8.M
            goto L_0x010a
        L_0x0109:
            r2 = r4
        L_0x010a:
            r0.setOnCreateContextMenuListener(r2)
            r0.setLongClickable(r9)
            if (r9 == 0) goto L_0x0117
            if (r1 != 0) goto L_0x0117
            defpackage.qb.a((android.view.View) r0, (android.graphics.drawable.Drawable) r4)
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.a(anb):void");
    }

    public final void b(boolean z2) {
        if (this.z != z2) {
            this.z = z2;
            amj amj = this.D;
            if (amj != null) {
                ((amt) amj).b();
            }
        }
    }

    public final boolean b(Object obj) {
        amk amk = this.o;
        return amk == null || amk.a(this, obj);
    }

    public final void a(SharedPreferences.Editor editor) {
        if (!this.l.b) {
            editor.apply();
        }
    }

    public final void a(Drawable drawable) {
        if (this.b != drawable) {
            this.b = drawable;
            this.s = 0;
            b();
        }
    }

    public void a(Bundle bundle) {
        if (i()) {
            this.L = false;
            Parcelable d2 = d();
            if (!this.L) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            } else if (d2 != null) {
                bundle.putParcelable(this.t, d2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(Parcelable parcelable) {
        this.L = true;
        if (parcelable != BaseSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public void a(View view) {
        k();
    }

    /* access modifiers changed from: package-private */
    public final void a(PreferenceGroup preferenceGroup) {
        if (preferenceGroup == null || this.E == null) {
            this.E = preferenceGroup;
            return;
        }
        throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
    }

    public void a(CharSequence charSequence) {
        if (this.F != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        } else if (!TextUtils.equals(this.a, charSequence)) {
            this.a = charSequence;
            b();
        }
    }

    public final void a(boolean z2) {
        if (this.c != z2) {
            this.c = z2;
            c(c());
            b();
        }
    }
}
