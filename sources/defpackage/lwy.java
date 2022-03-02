package defpackage;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;

/* renamed from: lwy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lwy {
    private final sg a;
    private final Activity b;
    private final FragmentManager c;

    public lwy(Activity activity, sg sgVar) {
        this.b = activity;
        this.c = activity.getFragmentManager();
        this.a = sgVar;
        if (sgVar != null) {
            sgVar.b(true);
        }
    }

    private final void a(Fragment fragment, boolean z) {
        Bundle b2 = ((lwx) this.b).b();
        if (fragment.getArguments() != null) {
            b2.putAll(fragment.getArguments());
        }
        fragment.setArguments(b2);
        FragmentTransaction beginTransaction = this.c.beginTransaction();
        beginTransaction.replace(16908290, fragment);
        if (z) {
            beginTransaction.addToBackStack(fragment.toString());
        }
        beginTransaction.commit();
    }

    public final void b(Fragment fragment) {
        this.c.popBackStack((String) null, 1);
        a(fragment, false);
    }

    public final void c(Fragment fragment) {
        boolean z;
        if (this.c.findFragmentById(16908290) != null) {
            z = true;
        } else {
            z = false;
        }
        a(fragment, z);
    }

    public final void a(int i) {
        String string = this.b.getString(i);
        sg sgVar = this.a;
        if (sgVar != null) {
            sgVar.a((CharSequence) string);
            this.a.d();
        }
    }

    public final void a(Fragment fragment) {
        if (this.c.findFragmentById(16908290) == null) {
            b(fragment);
        }
    }
}
