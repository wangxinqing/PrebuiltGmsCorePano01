package com.google.android.chimera;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ContextThemeWrapper extends ContextWrapper {
    private int CC;
    private Resources.Theme CD;
    private LayoutInflater CL;

    protected ContextThemeWrapper(Context context) {
        super(context);
    }

    private final void aM() {
        boolean z;
        if (this.CD == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.CD = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.CD.setTo(theme);
            }
        }
        onApplyThemeResource(this.CD, this.CC, z);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        if (this.CL == null) {
            this.CL = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.CL;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.CD;
        if (theme != null) {
            return theme;
        }
        int i = this.CC;
        int i2 = getApplicationInfo().targetSdkVersion;
        if (i == 0) {
            i = i2 >= 11 ? i2 >= 14 ? i2 < 24 ? 16974120 : 16974143 : 16973931 : 16973829;
        }
        this.CC = i;
        aM();
        return this.CD;
    }

    public int getThemeResId() {
        return this.CC;
    }

    /* access modifiers changed from: protected */
    public void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    public void setTheme(int i) {
        if (this.CC != i) {
            this.CC = i;
            aM();
        }
    }

    public ContextThemeWrapper(Context context, int i) {
        super(context);
        this.CC = i;
    }

    public ContextThemeWrapper(Context context, Resources.Theme theme) {
        super(context);
        this.CD = theme;
    }
}
