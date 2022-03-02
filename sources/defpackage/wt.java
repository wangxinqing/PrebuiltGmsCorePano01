package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: wt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class wt implements mh {
    private static final int[] k = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public wr b;
    public final ArrayList c;
    public final ArrayList d;
    CharSequence e;
    Drawable f;
    View g;
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public ww i;
    public boolean j;
    private final Resources l;
    private boolean m;
    private final boolean n;
    private final ArrayList o;
    private boolean p;
    private final ArrayList q;
    private boolean r;
    private int s = 0;
    private boolean t = false;
    private boolean u = false;
    private boolean v = false;
    private boolean w = false;
    private final ArrayList x = new ArrayList();
    private boolean y = false;

    public wt(Context context) {
        boolean z = false;
        this.a = context;
        this.l = context.getResources();
        this.c = new ArrayList();
        this.o = new ArrayList();
        this.p = true;
        this.d = new ArrayList();
        this.q = new ArrayList();
        this.r = true;
        if (this.l.getConfiguration().keyboard != 1 && qc.c(ViewConfiguration.get(this.a), this.a)) {
            z = true;
        }
        this.n = z;
    }

    private final void a(int i2, boolean z) {
        if (i2 >= 0 && i2 < this.c.size()) {
            this.c.remove(i2);
            if (z) {
                b(true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "android:menu:actionviewstates";
    }

    public void a(wr wrVar) {
        this.b = wrVar;
    }

    public final MenuItem add(int i2) {
        return a(0, 0, 0, this.l.getString(i2));
    }

    public final int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        Intent intent2;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i6 = queryIntentActivityOptions.size();
        } else {
            i6 = 0;
        }
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < i6; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            if (resolveInfo.specificIndex >= 0) {
                intent2 = intentArr[resolveInfo.specificIndex];
            } else {
                intent2 = intent;
            }
            Intent intent3 = new Intent(intent2);
            intent3.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent4 = a(i2, i3, i4, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent4;
            }
        }
        return i6;
    }

    public final SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, (CharSequence) this.l.getString(i2));
    }

    public final void b(Bundle bundle) {
        MenuItem findItem;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(a());
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((xp) item.getSubMenu()).b(bundle);
            }
        }
        int i3 = bundle.getInt("android:menu:expandedactionview");
        if (i3 > 0 && (findItem = findItem(i3)) != null) {
            findItem.expandActionView();
        }
    }

    public boolean b() {
        return this.y;
    }

    public boolean c() {
        return this.m;
    }

    public final void clear() {
        ww wwVar = this.i;
        if (wwVar != null) {
            b(wwVar);
        }
        this.c.clear();
        b(true);
    }

    public final void clearHeader() {
        this.f = null;
        this.e = null;
        this.g = null;
        b(false);
    }

    public final void close() {
        a(true);
    }

    public boolean d() {
        return this.n;
    }

    public final void e() {
        if (!this.t) {
            this.t = true;
            this.u = false;
            this.v = false;
        }
    }

    public final void f() {
        this.t = false;
        if (this.u) {
            this.u = false;
            b(this.v);
        }
    }

    public final MenuItem findItem(int i2) {
        MenuItem findItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            ww wwVar = (ww) this.c.get(i3);
            if (wwVar.a == i2) {
                return wwVar;
            }
            if (wwVar.hasSubMenu() && (findItem = wwVar.j.findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final ArrayList g() {
        if (this.p) {
            this.o.clear();
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                ww wwVar = (ww) this.c.get(i2);
                if (wwVar.isVisible()) {
                    this.o.add(wwVar);
                }
            }
            this.p = false;
            this.r = true;
        }
        return this.o;
    }

    public final MenuItem getItem(int i2) {
        return (MenuItem) this.c.get(i2);
    }

    public final void h() {
        ArrayList g2 = g();
        if (this.r) {
            Iterator it = this.h.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                xh xhVar = (xh) weakReference.get();
                if (xhVar == null) {
                    this.h.remove(weakReference);
                } else {
                    z |= xhVar.a();
                }
            }
            if (!z) {
                this.d.clear();
                this.q.clear();
                this.q.addAll(g());
            } else {
                this.d.clear();
                this.q.clear();
                int size = g2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ww wwVar = (ww) g2.get(i2);
                    if (wwVar.f()) {
                        this.d.add(wwVar);
                    } else {
                        this.q.add(wwVar);
                    }
                }
            }
            this.r = false;
        }
    }

    public final boolean hasVisibleItems() {
        if (this.j) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((ww) this.c.get(i2)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList i() {
        h();
        return this.q;
    }

    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return a(i2, keyEvent) != null;
    }

    public wt j() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void k() {
        this.r = true;
        b(true);
    }

    /* access modifiers changed from: package-private */
    public final void l() {
        this.p = true;
        b(true);
    }

    public final void m() {
        this.s = 1;
    }

    public final boolean performIdentifierAction(int i2, int i3) {
        return a(findItem(i2), i3);
    }

    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        boolean z;
        ww a2 = a(i2, keyEvent);
        if (a2 != null) {
            z = a((MenuItem) a2, i3);
        } else {
            z = false;
        }
        if ((i3 & 2) != 0) {
            a(true);
        }
        return z;
    }

    public final void setGroupCheckable(int i2, boolean z, boolean z2) {
        int size = this.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            ww wwVar = (ww) this.c.get(i3);
            if (wwVar.b == i2) {
                wwVar.a(z2);
                wwVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.y = z;
    }

    public final void setGroupEnabled(int i2, boolean z) {
        int size = this.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            ww wwVar = (ww) this.c.get(i3);
            if (wwVar.b == i2) {
                wwVar.setEnabled(z);
            }
        }
    }

    public final void setGroupVisible(int i2, boolean z) {
        int size = this.c.size();
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            ww wwVar = (ww) this.c.get(i3);
            if (wwVar.b == i2 && wwVar.c(z)) {
                z2 = true;
            }
        }
        if (z2) {
            b(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.m = z;
        b(false);
    }

    public final int size() {
        return this.c.size();
    }

    public final MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.l.getString(i5));
    }

    public final SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, (CharSequence) this.l.getString(i5));
    }

    public final void removeGroup(int i2) {
        int size = size();
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                if (((ww) this.c.get(i3)).b == i2) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 >= 0) {
            int size2 = this.c.size() - i3;
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                if (i4 >= size2 || ((ww) this.c.get(i3)).b != i2) {
                    b(true);
                } else {
                    a(i3, false);
                    i4 = i5;
                }
            }
            b(true);
        }
    }

    public final void removeItem(int i2) {
        int size = size();
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                if (((ww) this.c.get(i3)).a == i2) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        a(i3, true);
    }

    public final MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        ww wwVar = (ww) a(i2, i3, i4, charSequence);
        xp xpVar = new xp(this.a, this, wwVar);
        wwVar.a(xpVar);
        return xpVar;
    }

    public MenuItem a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = i4 >> 16;
        if (i6 >= 0) {
            int[] iArr = k;
            if (i6 < iArr.length) {
                char c2 = (iArr[i6] << 16) | ((char) i4);
                ww wwVar = new ww(this, i2, i3, i4, c2, charSequence, this.s);
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        if (((ww) arrayList.get(size)).c <= c2) {
                            i5 = size + 1;
                            break;
                        }
                    } else {
                        i5 = 0;
                        break;
                    }
                }
                arrayList.add(i5, wwVar);
                b(true);
                return wwVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(xh xhVar) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            xh xhVar2 = (xh) weakReference.get();
            if (xhVar2 == null || xhVar2 == xhVar) {
                this.h.remove(weakReference);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final ww a(int i2, KeyEvent keyEvent) {
        char c2;
        ArrayList arrayList = this.x;
        arrayList.clear();
        a((List) arrayList, i2, keyEvent);
        if (!arrayList.isEmpty()) {
            int metaState = keyEvent.getMetaState();
            KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
            keyEvent.getKeyData(keyData);
            int size = arrayList.size();
            if (size == 1) {
                return (ww) arrayList.get(0);
            }
            boolean c3 = c();
            for (int i3 = 0; i3 < size; i3++) {
                ww wwVar = (ww) arrayList.get(i3);
                if (!c3) {
                    c2 = wwVar.e;
                } else {
                    c2 = wwVar.g;
                }
                if ((c2 == keyData.meta[0] && (metaState & 2) == 0) || ((c2 == keyData.meta[2] && (metaState & 2) != 0) || (c3 && c2 == 8 && i2 == 67))) {
                    return wwVar;
                }
            }
        }
        return null;
    }

    public final void b(boolean z) {
        if (this.t) {
            this.u = true;
            if (z) {
                this.v = true;
                return;
            }
            return;
        }
        if (z) {
            this.p = true;
            this.r = true;
        }
        if (!this.h.isEmpty()) {
            e();
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                xh xhVar = (xh) weakReference.get();
                if (xhVar == null) {
                    this.h.remove(weakReference);
                } else {
                    xhVar.a(z);
                }
            }
            f();
        }
    }

    public boolean b(ww wwVar) {
        boolean z = false;
        if (!this.h.isEmpty() && this.i == wwVar) {
            e();
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                xh xhVar = (xh) weakReference.get();
                if (xhVar == null) {
                    this.h.remove(weakReference);
                } else {
                    z = xhVar.a(wwVar);
                    if (z) {
                        break;
                    }
                }
            }
            f();
            if (z) {
                this.i = null;
            }
        }
        return z;
    }

    public final void a(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources resources = this.l;
        if (view != null) {
            this.g = view;
            this.e = null;
            this.f = null;
        } else {
            if (i2 > 0) {
                this.e = resources.getText(i2);
            } else if (charSequence != null) {
                this.e = charSequence;
            }
            if (i3 > 0) {
                this.f = kf.a(this.a, i3);
            } else if (drawable != null) {
                this.f = drawable;
            }
            this.g = null;
        }
        b(false);
    }

    public final void a(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((xp) item.getSubMenu()).a(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(a(), sparseArray);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(List list, int i2, KeyEvent keyEvent) {
        char c2;
        int i3;
        boolean c3 = c();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.c.size();
            for (int i4 = 0; i4 < size; i4++) {
                ww wwVar = (ww) this.c.get(i4);
                if (wwVar.hasSubMenu()) {
                    wwVar.j.a(list, i2, keyEvent);
                }
                if (!c3) {
                    c2 = wwVar.e;
                } else {
                    c2 = wwVar.g;
                }
                if (!c3) {
                    i3 = wwVar.f;
                } else {
                    i3 = wwVar.h;
                }
                if ((modifiers & 69647) == (i3 & 69647) && c2 != 0 && ((c2 == keyData.meta[0] || c2 == keyData.meta[2] || (c3 && c2 == 8 && i2 == 67)) && wwVar.isEnabled())) {
                    list.add(wwVar);
                }
            }
        }
    }

    public final void a(xh xhVar) {
        a(xhVar, this.a);
    }

    public final void a(xh xhVar, Context context) {
        this.h.add(new WeakReference(xhVar));
        xhVar.a(context, this);
        this.r = true;
    }

    public final void a(boolean z) {
        if (!this.w) {
            this.w = true;
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                xh xhVar = (xh) weakReference.get();
                if (xhVar == null) {
                    this.h.remove(weakReference);
                } else {
                    xhVar.a(this, z);
                }
            }
            this.w = false;
        }
    }

    public final boolean a(MenuItem menuItem, int i2) {
        return a(menuItem, (xh) null, i2);
    }

    public final boolean a(MenuItem menuItem, xh xhVar, int i2) {
        boolean z;
        ww wwVar = (ww) menuItem;
        if (wwVar == null || !wwVar.isEnabled()) {
            return false;
        }
        boolean b2 = wwVar.b();
        pa paVar = wwVar.n;
        boolean z2 = paVar != null && paVar.e();
        if (wwVar.i()) {
            b2 |= wwVar.expandActionView();
            if (b2) {
                a(true);
                return true;
            }
        } else if (wwVar.hasSubMenu() || z2) {
            if ((i2 & 4) == 0) {
                a(false);
            }
            if (!wwVar.hasSubMenu()) {
                wwVar.a(new xp(this.a, this, wwVar));
            }
            xp xpVar = wwVar.j;
            if (z2) {
                paVar.a((SubMenu) xpVar);
            }
            if (this.h.isEmpty()) {
                z = false;
            } else {
                if (xhVar != null) {
                    z = xhVar.a(xpVar);
                } else {
                    z = false;
                }
                Iterator it = this.h.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    xh xhVar2 = (xh) weakReference.get();
                    if (xhVar2 == null) {
                        this.h.remove(weakReference);
                    } else if (!z) {
                        z = xhVar2.a(xpVar);
                    }
                }
            }
            b2 |= z;
            if (!b2) {
                a(true);
                return false;
            }
        } else if ((i2 & 1) == 0) {
            a(true);
            return b2;
        }
        return b2;
    }

    public boolean a(wt wtVar, MenuItem menuItem) {
        wr wrVar = this.b;
        return wrVar != null && wrVar.a(wtVar, menuItem);
    }

    public boolean a(ww wwVar) {
        boolean z = false;
        if (!this.h.isEmpty()) {
            e();
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                xh xhVar = (xh) weakReference.get();
                if (xhVar == null) {
                    this.h.remove(weakReference);
                } else {
                    z = xhVar.b(wwVar);
                    if (z) {
                        break;
                    }
                }
            }
            f();
            if (z) {
                this.i = wwVar;
            }
        }
        return z;
    }
}
