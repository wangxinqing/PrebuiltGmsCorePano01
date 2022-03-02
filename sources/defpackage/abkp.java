package defpackage;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.R;

/* renamed from: abkp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class abkp implements afb {
    protected final Menu a;
    protected final Context b;
    public boolean c;

    public abkp(Context context, Toolbar toolbar) {
        this.b = context;
        toolbar.s = this;
        this.a = toolbar.h();
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public final boolean a(MenuItem menuItem) {
        int i = ((ww) menuItem).a;
        if (i == R.id.menu_star_contact) {
            if (this.c) {
                b();
                return false;
            }
            a();
            return false;
        } else if (i == R.id.menu_add_contact) {
            c();
            return false;
        } else if (i == R.id.edit_contact) {
            d();
            return false;
        } else if (i == R.id.edit_profile) {
            e();
            return false;
        } else if (i != R.id.send_feedback) {
            return false;
        } else {
            f();
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    /* access modifiers changed from: protected */
    public abstract void c();

    /* access modifiers changed from: protected */
    public abstract void d();

    /* access modifiers changed from: protected */
    public abstract void e();

    /* access modifiers changed from: protected */
    public abstract void f();

    /* access modifiers changed from: protected */
    public final void g() {
        this.a.findItem(R.id.menu_star_contact).setVisible(false);
    }

    /* access modifiers changed from: protected */
    public final void h() {
        this.a.findItem(R.id.menu_add_contact).setVisible(true);
    }

    /* access modifiers changed from: protected */
    public final void i() {
        this.a.findItem(R.id.menu_add_contact).setVisible(false);
    }

    /* access modifiers changed from: protected */
    public final void j() {
        this.a.findItem(R.id.edit_contact).setVisible(true);
    }

    /* access modifiers changed from: protected */
    public final void k() {
        this.a.findItem(R.id.edit_contact).setVisible(false);
    }
}
