package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import com.google.android.material.button.MaterialButton;

/* renamed from: ajty  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajty {
    public final MaterialButton a;
    public ajzl b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public Drawable m;
    public boolean n = false;
    public boolean o;
    public LayerDrawable p;

    static {
        int i2 = Build.VERSION.SDK_INT;
    }

    public ajty(MaterialButton materialButton, ajzl ajzl) {
        this.a = materialButton;
        this.b = ajzl;
    }

    private final ajzf a(boolean z) {
        LayerDrawable layerDrawable = this.p;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (ajzf) ((LayerDrawable) ((InsetDrawable) this.p.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
    }

    private final ajzf c() {
        return a(true);
    }

    public final ajzw b() {
        LayerDrawable layerDrawable = this.p;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.p.getNumberOfLayers() > 2) {
            return (ajzw) this.p.getDrawable(2);
        }
        return (ajzw) this.p.getDrawable(1);
    }

    public final ajzf a() {
        return a(false);
    }

    public final void a(ajzl ajzl) {
        this.b = ajzl;
        if (a() != null) {
            a().a(ajzl);
        }
        if (c() != null) {
            c().a(ajzl);
        }
        if (b() != null) {
            b().a(ajzl);
        }
    }
}
