package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.gms.R;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupcompat.logging.CustomEvent;
import com.google.android.setupcompat.logging.MetricKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: algc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class algc extends TemplateLayout {
    private boolean a;
    private Activity b;

    public algc(Context context) {
        this(context, 0, 0);
    }

    private static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        throw new IllegalArgumentException("Cannot find instance of Activity in parent tree");
    }

    private void b(AttributeSet attributeSet, int i) {
        Window window;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, algd.c, i, 0);
        boolean z = true;
        boolean z2 = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        int i2 = Build.VERSION.SDK_INT;
        if (z2) {
            setSystemUiVisibility(1024);
        }
        a(alhj.class, (alhi) new alhj(this, this.b.getWindow(), attributeSet, i));
        a(alhk.class, (alhi) new alhk(this, this.b.getWindow()));
        a(alhe.class, (alhi) new alhe(this, attributeSet, i));
        alhk alhk = (alhk) a(alhk.class);
        if (Build.VERSION.SDK_INT >= 27) {
            TypedArray obtainStyledAttributes2 = alhk.a.getContext().obtainStyledAttributes(attributeSet, algd.e, i, 0);
            int color = obtainStyledAttributes2.getColor(1, 0);
            alhk.d = color;
            int i3 = Build.VERSION.SDK_INT;
            if (alhk.b != null) {
                if (alhk.c) {
                    Context context = alhk.a.getContext();
                    color = alhb.a(context).a(context, alha.CONFIG_NAVIGATION_BAR_BG_COLOR);
                }
                alhk.b.setNavigationBarColor(color);
            }
            if (!(Build.VERSION.SDK_INT < 26 || (window = alhk.b) == null || (window.getDecorView().getSystemUiVisibility() & 16) == 16)) {
                z = false;
            }
            boolean z3 = obtainStyledAttributes2.getBoolean(0, z);
            if (Build.VERSION.SDK_INT >= 26 && alhk.b != null) {
                if (alhk.c) {
                    Context context2 = alhk.a.getContext();
                    z3 = alhb.a(context2).d(context2, alha.CONFIG_LIGHT_NAVIGATION_BAR);
                }
                if (!z3) {
                    alhk.b.getDecorView().setSystemUiVisibility(alhk.b.getDecorView().getSystemUiVisibility() & -17);
                } else {
                    alhk.b.getDecorView().setSystemUiVisibility(alhk.b.getDecorView().getSystemUiVisibility() | 16);
                }
            }
            obtainStyledAttributes2.recycle();
        }
        int i4 = Build.VERSION.SDK_INT;
        this.b.getWindow().addFlags(Integer.MIN_VALUE);
        this.b.getWindow().clearFlags(67108864);
        this.b.getWindow().clearFlags(134217728);
    }

    public final boolean c() {
        Bundle bundle;
        if (!this.a || Build.VERSION.SDK_INT < 29 || (bundle = alhb.a(getContext()).a) == null || bundle.isEmpty()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        algk.a(this.b);
        alhe alhe = (alhe) a(alhe.class);
        alhe.j.a(alhe.b(), false);
        alhe.j.b(alhe.f(), false);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT >= 29 && alht.a(this.b.getIntent())) {
            alhe alhe = (alhe) a(alhe.class);
            algz algz = alhe.j;
            boolean b2 = alhe.b();
            boolean f = alhe.f();
            algz.a = algz.a(algz.a, b2);
            algz.b = algz.a(algz.b, f);
            alhg alhg = alhe.c;
            alhg alhg2 = alhe.d;
            PersistableBundle a2 = alhg != null ? alhg.a("PrimaryFooterButton") : PersistableBundle.EMPTY;
            PersistableBundle a3 = alhg2 != null ? alhg2.a("SecondaryFooterButton") : PersistableBundle.EMPTY;
            algz algz2 = alhe.j;
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("PrimaryButtonVisibility", algz2.a);
            persistableBundle.putString("SecondaryButtonVisibility", algz2.b);
            PersistableBundle[] persistableBundleArr = {a3};
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(Arrays.asList(new PersistableBundle[]{persistableBundle, a2}));
            Collections.addAll(arrayList, persistableBundleArr);
            PersistableBundle persistableBundle2 = new PersistableBundle();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                PersistableBundle persistableBundle3 = (PersistableBundle) arrayList.get(i2);
                for (String str : persistableBundle3.keySet()) {
                    algm.a(!persistableBundle2.containsKey(str), String.format("Found duplicate key [%s] while attempting to merge bundles.", new Object[]{str}));
                }
                persistableBundle2.putAll(persistableBundle3);
            }
            algy.a(getContext(), CustomEvent.a(MetricKey.a("SetupCompatMetrics", this.b), persistableBundle2));
        }
    }

    public algc(Context context, int i) {
        this(context, i, 0);
    }

    public algc(Context context, int i, int i2) {
        super(context, i, i2);
        b((AttributeSet) null, R.attr.sucLayoutTheme);
    }

    public algc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(attributeSet, R.attr.sucLayoutTheme);
    }

    /* access modifiers changed from: protected */
    public View a(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            i = R.layout.partner_customization_layout;
        }
        return a(layoutInflater, 0, i);
    }

    public algc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public ViewGroup a(int i) {
        if (i == 0) {
            i = R.id.suc_layout_content;
        }
        return super.a(i);
    }

    /* access modifiers changed from: protected */
    public final void a(AttributeSet attributeSet, int i) {
        boolean z = true;
        this.a = true;
        Activity a2 = a(getContext());
        this.b = a2;
        boolean a3 = alht.a(a2.getIntent());
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, algd.c, i, 0);
        if (!obtainStyledAttributes.hasValue(1)) {
            String valueOf = String.valueOf(this.b.getComponentName());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
            sb.append("Attribute sucUsePartnerResource not found in ");
            sb.append(valueOf);
            Log.e("PartnerCustomizedLayout", sb.toString());
        }
        if (!a3 && !obtainStyledAttributes.getBoolean(1, true)) {
            z = false;
        }
        this.a = z;
        obtainStyledAttributes.recycle();
    }
}
