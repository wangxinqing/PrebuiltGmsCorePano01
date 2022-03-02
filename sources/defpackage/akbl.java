package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* renamed from: akbl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akbl implements aua {
    public int a;
    public int b;
    private final WeakReference c;

    public akbl(TabLayout tabLayout) {
        this.c = new WeakReference(tabLayout);
    }

    public final void a(int i) {
        TabLayout tabLayout = (TabLayout) this.c.get();
        if (tabLayout != null && tabLayout.c() != i && i < tabLayout.b()) {
            int i2 = this.b;
            boolean z = false;
            if (i2 == 0 || (i2 == 2 && this.a == 0)) {
                z = true;
            }
            tabLayout.b(tabLayout.a(i), z);
        }
    }

    public final void b(int i) {
        this.a = this.b;
        this.b = i;
    }

    public final void a(int i, float f) {
        boolean z;
        TabLayout tabLayout = (TabLayout) this.c.get();
        if (tabLayout != null) {
            int i2 = this.b;
            boolean z2 = false;
            if (i2 != 2 || this.a == 1) {
                z = true;
            } else {
                z = false;
            }
            if (!(i2 == 2 && this.a == 0)) {
                z2 = true;
            }
            tabLayout.a(i, f, z, z2);
        }
    }
}
