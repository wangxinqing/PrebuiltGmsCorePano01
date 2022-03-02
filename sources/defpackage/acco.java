package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;

/* renamed from: acco  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class acco implements accj {
    public final FragmentManager a;

    protected acco(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    public abstract int a();

    public abstract void a(Bundle bundle);

    /* access modifiers changed from: protected */
    public final void a(Fragment fragment) {
        this.a.beginTransaction().add(R.id.fragment_container, fragment, "instruction").commit();
    }

    public abstract boolean a(int i);

    public void b() {
        this.a.popBackStack();
    }

    public boolean c() {
        return this.a.getBackStackEntryCount() > 0;
    }

    /* access modifiers changed from: protected */
    public final void b(Fragment fragment) {
        FragmentTransaction beginTransaction = this.a.beginTransaction();
        beginTransaction.setCustomAnimations(R.anim.slide_next_in, R.anim.slide_next_out, R.anim.slide_back_in, R.anim.slide_back_out);
        beginTransaction.replace(R.id.fragment_container, fragment).addToBackStack("instruction").commit();
    }
}
