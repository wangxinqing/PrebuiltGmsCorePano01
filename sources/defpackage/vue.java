package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: vue  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class vue extends acg implements Iterable {
    public final Context a;
    public final List e = new ArrayList();
    public final vuc f;

    public vue(Context context, vuc vuc) {
        this.a = context;
        this.f = vuc;
    }

    public final int a() {
        return this.e.size();
    }

    /* access modifiers changed from: protected */
    public void a(vud vud) {
    }

    public final int b(Object obj) {
        return this.e.indexOf(obj);
    }

    public final Object f(int i) {
        return this.e.get(i);
    }

    public final Iterator iterator() {
        return this.e.iterator();
    }

    /* access modifiers changed from: protected */
    public final void a(int i, Object obj) {
        this.e.set(i, obj);
        K(i);
    }

    public final /* bridge */ /* synthetic */ void b(adl adl) {
        vud vud = (vud) adl;
        vud.a.getViewTreeObserver().addOnPreDrawListener(new vub(this, vud));
    }

    public final void a(Object obj) {
        this.e.add(obj);
        L(this.e.size() - 1);
    }

    public void a(vud vud, int i) {
        Object f2 = f(i);
        vud.a(this.a, f2);
        vud.a.setOnClickListener(new vua(this, vud, f2));
    }
}
