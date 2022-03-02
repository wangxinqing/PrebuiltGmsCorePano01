package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* renamed from: vt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vt extends ContextWrapper {
    public int a;
    private Resources.Theme b;
    private LayoutInflater c;
    private Configuration d;
    private Resources e;

    public vt() {
        super((Context) null);
    }

    private final void b() {
        if (this.b == null) {
            this.b = a().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        this.b.applyStyle(this.a, true);
    }

    public final Resources a() {
        if (this.e == null) {
            if (this.d != null) {
                int i = Build.VERSION.SDK_INT;
                this.e = createConfigurationContext(this.d).getResources();
            } else {
                this.e = super.getResources();
            }
        }
        return this.e;
    }

    public final Resources getResources() {
        return a();
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.c == null) {
            this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.c;
    }

    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = 2132018396;
        }
        b();
        return this.b;
    }

    public final void setTheme(int i) {
        if (this.a != i) {
            this.a = i;
            b();
        }
    }

    public vt(Context context, int i) {
        super(context);
        this.a = i;
    }

    public final AssetManager getAssets() {
        return a().getAssets();
    }

    public vt(Context context, Resources.Theme theme) {
        super(context);
        this.b = theme;
    }

    public final void a(Configuration configuration) {
        if (this.e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.d == null) {
            this.d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }
}
