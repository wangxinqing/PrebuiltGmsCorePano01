package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

/* renamed from: vy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vy {
    pa A;
    public CharSequence B;
    public CharSequence C;
    public ColorStateList D = null;
    public PorterDuff.Mode E = null;
    final /* synthetic */ vz F;
    public final Menu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public String z;

    public vy(vz vzVar, Menu menu) {
        this.F = vzVar;
        this.a = menu;
        a();
    }

    public static final char a(String str) {
        if (str != null) {
            return str.charAt(0);
        }
        return 0;
    }

    public final void a() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = true;
        this.g = true;
    }

    public final SubMenu b() {
        this.h = true;
        SubMenu addSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
        a(addSubMenu.getItem());
        return addSubMenu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.F.e.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void a(MenuItem menuItem) {
        boolean z2;
        MenuItem enabled = menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
        boolean z3 = false;
        if (this.r > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        enabled.setCheckable(z2).setTitleCondensed(this.l).setIcon(this.m);
        int i2 = this.v;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        if (this.z != null) {
            if (!this.F.e.isRestricted()) {
                vz vzVar = this.F;
                if (vzVar.f == null) {
                    vzVar.f = vzVar.a(vzVar.e);
                }
                menuItem.setOnMenuItemClickListener(new vx(vzVar.f, this.z));
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof ww) {
                ((ww) menuItem).a(true);
            } else if (menuItem instanceof xc) {
                xc xcVar = (xc) menuItem;
                try {
                    if (xcVar.e == null) {
                        xcVar.e = xcVar.d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                    }
                    xcVar.e.invoke(xcVar.d, new Object[]{true});
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str = this.x;
        if (str != null) {
            menuItem.setActionView((View) a(str, vz.a, this.F.c));
            z3 = true;
        }
        int i3 = this.w;
        if (i3 > 0) {
            if (z3) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i3);
            }
        }
        pa paVar = this.A;
        if (paVar != null) {
            if (menuItem instanceof mi) {
                ((mi) menuItem).a(paVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        pk.a(menuItem, this.B);
        CharSequence charSequence = this.C;
        boolean z4 = menuItem instanceof mi;
        if (z4) {
            ((mi) menuItem).b(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
        char c2 = this.n;
        int i4 = this.o;
        if (z4) {
            ((mi) menuItem).setAlphabeticShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c2, i4);
        }
        char c3 = this.p;
        int i5 = this.q;
        if (z4) {
            ((mi) menuItem).setNumericShortcut(c3, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c3, i5);
        }
        PorterDuff.Mode mode = this.E;
        if (mode != null) {
            if (z4) {
                ((mi) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.D;
        if (colorStateList == null) {
            return;
        }
        if (z4) {
            ((mi) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }
}
