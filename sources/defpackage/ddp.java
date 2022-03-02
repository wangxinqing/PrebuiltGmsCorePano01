package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.accountsettings.widget.PagerTabLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ddp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ddp extends der {
    public dhr a;
    public dhj b;
    public aqsr c;
    public PagerTabLayout d;
    public ImageView e;
    public List f;
    boolean g;
    public ViewTreeObserver.OnScrollChangedListener h;
    private ddo i;
    private ViewPager j;
    private float k;
    private float n;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ddp() {
        this((byte[]) null);
        dip dip = dip.a;
        new ddq();
    }

    public static dhp a(aqsr aqsr) {
        return dhp.a("", (aqrk) null, aqsr);
    }

    private final void b(aqsr aqsr) {
        int e2 = anbs.e(this.f, new ddj(aqsr));
        if (e2 != -1) {
            ViewPager viewPager = this.j;
            if (e2 != viewPager.c) {
                this.g = true;
                viewPager.b(e2);
                this.g = false;
            }
        }
    }

    public final aqsr aC() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public final View aD() {
        return getView();
    }

    public final dhh c() {
        return new dhh(getClass().getName(), (Fragment.SavedState) null);
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        dhq a2 = dhq.a(csm.d(getArguments().getByteArray("topNavKey")));
        did c2 = ((die) activity).c();
        dhr dhr = new dhr(a2, c2.a, c2.b);
        this.a = dhr;
        bk.a(dhr.c, dho.a).a(this, new ddg(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.as_pager_frame_fragment, viewGroup, false);
        this.i = new ddo(this, getChildFragmentManager());
        ViewPager viewPager = (ViewPager) inflate.findViewById(R.id.pager);
        this.j = viewPager;
        viewPager.a((atr) this.i);
        this.j.a((aua) new ddk(this));
        this.d = (PagerTabLayout) inflate.findViewById(R.id.tab_layout);
        if (awgy.k()) {
            PagerTabLayout pagerTabLayout = this.d;
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.colorOnSurfaceVariant, R.attr.colorPrimaryGoogle});
            int color = obtainStyledAttributes.getColor(0, 0);
            int color2 = obtainStyledAttributes.getColor(1, 0);
            obtainStyledAttributes.recycle();
            ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{16842913}, new int[0]}, new int[]{color2, color});
            if (pagerTabLayout.k != colorStateList) {
                pagerTabLayout.k = colorStateList;
                int size = pagerTabLayout.b.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((akbk) pagerTabLayout.b.get(i2)).b();
                }
            }
            this.d.a = new ddh(this);
        }
        que.a((View) this.d, 3);
        this.e = (ImageView) inflate.findViewById(R.id.overlay_end);
        this.n = (float) getContext().getResources().getDimensionPixelSize(R.dimen.as_tabs_overlay_fade_distance);
        float dimensionPixelSize = (float) getContext().getResources().getDimensionPixelSize(R.dimen.as_tabs_horizontal_padding);
        this.k = dimensionPixelSize + dimensionPixelSize;
        this.d.a(this.j);
        if (cyd.a(getContext())) {
            qb.d(this.d, 0);
        }
        if (bundle == null) {
            aqsr aqsr = this.b.a.a.d;
            if (aqsr == null) {
                aqsr = aqsr.d;
            }
            this.c = aqsr;
            a(amzy.a((Object) a(aqsr)));
        }
        this.d.addOnLayoutChangeListener(new ddl(this));
        if (this.d.b() > 0) {
            this.e.setVisibility(0);
            this.d.addOnLayoutChangeListener(new ddn(this));
        } else {
            this.e.setVisibility(8);
        }
        return inflate;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        if (this.h != null) {
            this.d.getViewTreeObserver().removeOnScrollChangedListener(this.h);
            this.h = null;
        }
    }

    public ddp(byte[] bArr) {
        this.f = amzy.h();
    }

    public final void a(int i2, int i3) {
        if (getView() != null) {
            float f2 = this.k + this.n;
            if (cyd.a(getContext())) {
                float f3 = (float) i2;
                float f4 = (float) i3;
                if (f3 < f4 - this.k) {
                    float f5 = f4 - f2;
                    if (f3 < f5) {
                        this.e.setAlpha(0.0f);
                        this.d.getViewTreeObserver().removeOnScrollChangedListener(this.h);
                        this.h = null;
                        return;
                    }
                    this.e.setAlpha((f3 - f5) / this.n);
                    return;
                }
                this.e.setAlpha(1.0f);
                return;
            }
            float f6 = (float) i2;
            if (f6 <= this.k) {
                this.e.setAlpha(1.0f);
            } else if (f6 > f2) {
                this.e.setAlpha(0.0f);
                this.d.getViewTreeObserver().removeOnScrollChangedListener(this.h);
                this.h = null;
            } else {
                this.e.setAlpha((f2 - f6) / this.n);
            }
        }
    }

    public final void a(long j2) {
        int i2;
        int i3;
        int i4;
        int i5;
        PagerTabLayout pagerTabLayout = this.d;
        if (pagerTabLayout.v == 0) {
            boolean a2 = cyd.a(pagerTabLayout.getContext());
            int i6 = -1;
            char c2 = 1;
            if (!a2) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            boolean isSmoothScrollingEnabled = this.d.isSmoothScrollingEnabled();
            if (!a2) {
                i3 = 66;
            } else {
                i3 = 17;
            }
            this.d.setSmoothScrollingEnabled(false);
            this.d.fullScroll(i3);
            this.d.setSmoothScrollingEnabled(isSmoothScrollingEnabled);
            int b2 = a2 ? this.d.b() - 1 : this.d.b();
            for (int i7 = !a2; i7 < b2; i7++) {
                akbk a3 = this.d.a(i7);
                if (a3 == null) {
                    break;
                }
                a3.h.setTranslationX(((float) i2) * this.d.getResources().getDimension(R.dimen.as_tabs_startup_animation_shift));
            }
            PagerTabLayout pagerTabLayout2 = this.d;
            Resources resources = pagerTabLayout2.getResources();
            int integer = resources.getInteger(R.integer.as_tabs_startup_animation_duration);
            int integer2 = resources.getInteger(R.integer.as_tab_startup_animation_delay);
            int integer3 = resources.getInteger(R.integer.as_tab_startup_animation_diff);
            boolean a4 = cyd.a(pagerTabLayout2.getContext());
            ArrayList arrayList = new ArrayList(pagerTabLayout2.b() + 1);
            aiq aiq = new aiq();
            int[] iArr = new int[2];
            iArr[0] = pagerTabLayout2.getScrollX();
            if (a4) {
                i4 = pagerTabLayout2.getChildAt(0).getWidth() - pagerTabLayout2.getWidth();
            } else {
                i4 = 0;
            }
            iArr[1] = i4;
            ObjectAnimator ofInt = ObjectAnimator.ofInt(pagerTabLayout2, "scrollX", iArr);
            long j3 = (long) integer;
            ofInt.setDuration(j3);
            ofInt.setInterpolator(aiq);
            arrayList.add(ofInt);
            long j4 = (long) integer2;
            int i8 = 1;
            while (i8 < pagerTabLayout2.b()) {
                if (a4) {
                    i5 = (pagerTabLayout2.b() - i8) + i6;
                } else {
                    i5 = i8;
                }
                akbk a5 = pagerTabLayout2.a(i5);
                if (a5 != null) {
                    akbn akbn = a5.h;
                    float[] fArr = new float[2];
                    fArr[0] = akbn.getTranslationX();
                    fArr[c2] = 0.0f;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(akbn, "translationX", fArr);
                    ofFloat.setDuration(j3);
                    ofFloat.setInterpolator(aiq);
                    ofFloat.setStartDelay(j4);
                    arrayList.add(ofFloat);
                    j4 += (long) integer3;
                }
                i8++;
                i6 = -1;
                c2 = 1;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setStartDelay(j2);
            animatorSet.start();
        }
    }

    public final void a(amzy amzy) {
        this.f = amzy;
        this.g = true;
        this.i.c();
        this.g = false;
        b(this.c);
    }

    public final void a(dhj dhj) {
        csl csl = dhj.a;
        if (a(csl)) {
            aqsr aqsr = csl.a.d;
            if (aqsr == null) {
                aqsr = aqsr.d;
            }
            if (!ius.a(aqsr, this.c)) {
                this.c = aqsr;
                b(aqsr);
            }
        }
    }

    public final boolean a(csl csl) {
        return ius.a(csm.g(csl.b()), ((dfj) this.a.a).a);
    }
}
