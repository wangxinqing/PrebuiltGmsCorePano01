package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: xk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class xk extends wh implements Menu {
    private final mh d;

    public xk(Context context, mh mhVar) {
        super(context);
        if (mhVar != null) {
            this.d = mhVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final MenuItem add(int i) {
        return a(this.d.add(i));
    }

    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        MenuItem[] menuItemArr3 = menuItemArr;
        if (menuItemArr3 != null) {
            menuItemArr2 = new MenuItem[menuItemArr3.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = this.d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr3[i5] = a(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    public final SubMenu addSubMenu(int i) {
        return a(this.d.addSubMenu(i));
    }

    public final void clear() {
        ou ouVar = this.b;
        if (ouVar != null) {
            ouVar.clear();
        }
        ou ouVar2 = this.c;
        if (ouVar2 != null) {
            ouVar2.clear();
        }
        this.d.clear();
    }

    public final void close() {
        this.d.close();
    }

    public final MenuItem findItem(int i) {
        return a(this.d.findItem(i));
    }

    public final MenuItem getItem(int i) {
        return a(this.d.getItem(i));
    }

    public final boolean hasVisibleItems() {
        return this.d.hasVisibleItems();
    }

    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.d.isShortcutKey(i, keyEvent);
    }

    public final boolean performIdentifierAction(int i, int i2) {
        return this.d.performIdentifierAction(i, i2);
    }

    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.d.performShortcut(i, keyEvent, i2);
    }

    public final void removeGroup(int i) {
        if (this.b != null) {
            int i2 = 0;
            while (true) {
                ou ouVar = this.b;
                if (i2 >= ouVar.h) {
                    break;
                }
                if (((mi) ouVar.b(i2)).getGroupId() == i) {
                    this.b.d(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.d.removeGroup(i);
    }

    public final void removeItem(int i) {
        if (this.b != null) {
            int i2 = 0;
            while (true) {
                ou ouVar = this.b;
                if (i2 < ouVar.h) {
                    if (((mi) ouVar.b(i2)).getItemId() == i) {
                        this.b.d(i2);
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
        }
        this.d.removeItem(i);
    }

    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.d.setGroupCheckable(i, z, z2);
    }

    public final void setGroupEnabled(int i, boolean z) {
        this.d.setGroupEnabled(i, z);
    }

    public final void setGroupVisible(int i, boolean z) {
        this.d.setGroupVisible(i, z);
    }

    public final void setQwertyMode(boolean z) {
        this.d.setQwertyMode(z);
    }

    public final int size() {
        return this.d.size();
    }

    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(this.d.add(i, i2, i3, i4));
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return a(this.d.addSubMenu(i, i2, i3, i4));
    }

    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(this.d.add(i, i2, i3, charSequence));
    }

    public final MenuItem add(CharSequence charSequence) {
        return a(this.d.add(charSequence));
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return a(this.d.addSubMenu(i, i2, i3, charSequence));
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return a(this.d.addSubMenu(charSequence));
    }
}
