package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: sv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class sv {
    public static int a = -100;
    public static final ob b = new ob();
    public static final Object c = new Object();

    public static sv a(Activity activity, su suVar) {
        return new tn(activity, (Window) null, suVar, activity);
    }

    public static void n() {
        afl.a = true;
    }

    public static void o() {
        if (a != -1) {
            a = -1;
            synchronized (c) {
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    sv svVar = (sv) ((WeakReference) it.next()).get();
                    if (svVar != null) {
                        svVar.j();
                    }
                }
            }
        }
    }

    public Context a(Context context) {
        throw null;
    }

    public abstract sg a();

    public void a(int i) {
        throw null;
    }

    public abstract void a(Toolbar toolbar);

    public abstract void a(View view);

    public abstract void a(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void a(CharSequence charSequence);

    public abstract MenuInflater b();

    public abstract View b(int i);

    public abstract void b(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void c();

    public abstract void c(int i);

    public abstract void d();

    public abstract void d(int i);

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public int i() {
        throw null;
    }

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void p();

    public static sv a(Dialog dialog, su suVar) {
        return new tn(dialog.getContext(), dialog.getWindow(), suVar, dialog);
    }

    public static sv a(Context context, Activity activity, su suVar) {
        return new tn(context, (Window) null, suVar, activity);
    }

    public static void a(sv svVar) {
        synchronized (c) {
            Iterator it = b.iterator();
            while (it.hasNext()) {
                sv svVar2 = (sv) ((WeakReference) it.next()).get();
                if (svVar2 != svVar) {
                    if (svVar2 != null) {
                    }
                }
                it.remove();
            }
        }
    }
}
