package defpackage;

import android.widget.SectionIndexer;
import com.google.android.gms.appinvite.model.ContactPerson;

/* renamed from: dyj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class dyj extends acg implements SectionIndexer {
    protected boolean a;
    protected int e;

    public abstract void a(ContactPerson contactPerson);

    public abstract void a(ContactPerson contactPerson, int i);

    public void a(CharSequence charSequence) {
    }

    public abstract void b(ContactPerson contactPerson);

    public void b(CharSequence charSequence) {
    }

    public void b(boolean z) {
    }

    /* access modifiers changed from: protected */
    public void c() {
    }

    public void c(CharSequence charSequence) {
    }

    public abstract void c(boolean z);

    public void d() {
    }

    public void d(boolean z) {
    }

    public CharSequence e() {
        return null;
    }

    public void e(boolean z) {
    }

    public abstract int f();

    public final void f(int i) {
        this.e = i;
        c();
    }

    public abstract int g(int i);

    /* access modifiers changed from: protected */
    public abstract void g(boolean z);

    public final void f(boolean z) {
        if (z != this.a) {
            this.a = z;
            g(z);
        }
    }
}
