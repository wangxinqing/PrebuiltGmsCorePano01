package defpackage;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: amt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amt extends acg implements amj {
    public List a;
    private final PreferenceGroup e;
    private List f;
    private final List g;
    private final Handler h;
    private final Runnable i = new amq(this);

    public amt(PreferenceGroup preferenceGroup) {
        this.e = preferenceGroup;
        this.h = new Handler();
        this.e.D = this;
        this.f = new ArrayList();
        this.a = new ArrayList();
        this.g = new ArrayList();
        PreferenceGroup preferenceGroup2 = this.e;
        if (preferenceGroup2 instanceof PreferenceScreen) {
            a(((PreferenceScreen) preferenceGroup2).d);
        } else {
            a(true);
        }
        c();
    }

    private final List a(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int g2 = preferenceGroup.g();
        int i2 = 0;
        for (int i3 = 0; i3 < g2; i3++) {
            Preference f2 = preferenceGroup.f(i3);
            if (f2.z) {
                if (!b(preferenceGroup) || i2 < preferenceGroup.c) {
                    arrayList.add(f2);
                } else {
                    arrayList2.add(f2);
                }
                if (f2 instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) f2;
                    if (!preferenceGroup2.r()) {
                        continue;
                    } else if (!b(preferenceGroup) || !b(preferenceGroup2)) {
                        List a2 = a(preferenceGroup2);
                        int size = a2.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            Preference preference = (Preference) a2.get(i4);
                            if (b(preferenceGroup) && i2 >= preferenceGroup.c) {
                                arrayList2.add(preference);
                            } else {
                                arrayList.add(preference);
                            }
                            i2++;
                        }
                    } else {
                        throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                    }
                } else {
                    i2++;
                }
            }
        }
        if (b(preferenceGroup) && i2 > preferenceGroup.c) {
            amd amd = new amd(preferenceGroup.k, arrayList2, preferenceGroup.e());
            amd.p = new amr(this, preferenceGroup);
            arrayList.add(amd);
        }
        return arrayList;
    }

    private static final boolean b(PreferenceGroup preferenceGroup) {
        return preferenceGroup.c != Integer.MAX_VALUE;
    }

    public final long J(int i2) {
        if (this.c) {
            return f(i2).e();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        List list = this.f;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Preference) list.get(i2)).D = null;
        }
        ArrayList arrayList = new ArrayList(this.f.size());
        this.f = arrayList;
        a((List) arrayList, this.e);
        this.a = a(this.e);
        as();
        List list2 = this.f;
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Preference preference = (Preference) list2.get(i3);
        }
    }

    public final Preference f(int i2) {
        if (i2 < 0 || i2 >= a()) {
            return null;
        }
        return (Preference) this.a.get(i2);
    }

    public final void b() {
        this.h.removeCallbacks(this.i);
        this.h.post(this.i);
    }

    private final void a(List list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.b);
        }
        int g2 = preferenceGroup.g();
        for (int i2 = 0; i2 < g2; i2++) {
            Preference f2 = preferenceGroup.f(i2);
            list.add(f2);
            ams ams = new ams(f2);
            if (!this.g.contains(ams)) {
                this.g.add(ams);
            }
            if (f2 instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) f2;
                if (preferenceGroup2.r()) {
                    a(list, preferenceGroup2);
                }
            }
            f2.D = this;
        }
    }

    public final int a() {
        return this.a.size();
    }

    public final int a(int i2) {
        ams ams = new ams(f(i2));
        int indexOf = this.g.indexOf(ams);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.g.size();
        this.g.add(ams);
        return size;
    }

    public final /* bridge */ /* synthetic */ adl a(ViewGroup viewGroup, int i2) {
        ams ams = (ams) this.g.get(i2);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, anc.a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = uj.b(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(ams.a, viewGroup, false);
        if (inflate.getBackground() == null) {
            qb.a(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i3 = ams.b;
            if (i3 != 0) {
                from.inflate(i3, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new anb(inflate);
    }

    public final /* bridge */ /* synthetic */ void a(adl adl, int i2) {
        anb anb = (anb) adl;
        Preference f2 = f(i2);
        Drawable background = anb.a.getBackground();
        Drawable drawable = anb.s;
        if (background != drawable) {
            qb.a(anb.a, drawable);
        }
        TextView textView = (TextView) anb.c(16908310);
        if (!(textView == null || anb.t == null || textView.getTextColors().equals(anb.t))) {
            textView.setTextColor(anb.t);
        }
        f2.a(anb);
    }
}
