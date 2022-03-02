package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ilg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ilg implements ilh {
    private final ArrayList a = new ArrayList();
    private final ArrayList b = new ArrayList();
    private int c;
    private Bundle d;

    public ilg() {
    }

    public static ilg a(ilg ilg, ilh ilh) {
        ilg ilg2 = new ilg();
        ArrayList arrayList = ilg.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ilg2.a((ilh) arrayList.get(i));
        }
        ilg2.a(ilh);
        return ilg2;
    }

    public final Bundle b() {
        Bundle bundle;
        synchronized (this) {
            bundle = this.d;
        }
        return bundle;
    }

    public final void c() {
        synchronized (this) {
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                ilh ilh = (ilh) this.a.get(i);
                if (ilh != null) {
                    ilh.c();
                }
            }
            this.a.clear();
            this.b.clear();
            this.d = null;
        }
    }

    @Deprecated
    public final void close() {
        c();
    }

    public final Iterator iterator() {
        return new ili(this);
    }

    public ilg(ilh ilh) {
        a(ilh);
    }

    public final int a() {
        int i;
        synchronized (this) {
            i = this.c;
        }
        return i;
    }

    public final Object a(int i) {
        synchronized (this) {
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                int intValue = ((Integer) this.b.get(i2)).intValue();
                if (i < intValue) {
                    ilh ilh = (ilh) this.a.get(i2);
                    if (ilh != null) {
                        Object a2 = ilh.a((i - intValue) + ilh.a());
                        return a2;
                    }
                }
            }
            return null;
        }
    }

    public final void a(ilh ilh) {
        if (ilh != null) {
            synchronized (this) {
                if (this.a.isEmpty()) {
                    this.d = new Bundle();
                    Bundle b2 = ilh.b();
                    if (b2 != null) {
                        this.d.putString("prev_page_token", b2.getString("prev_page_token"));
                    }
                }
                this.a.add(ilh);
                this.b.clear();
                int size = this.a.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    ilh ilh2 = (ilh) this.a.get(i2);
                    if (ilh2 != null) {
                        i += ilh2.a();
                    }
                    this.b.add(Integer.valueOf(i));
                }
                this.c = i;
                Bundle b3 = ilh.b();
                if (b3 != null) {
                    this.d.putString("next_page_token", b3.getString("next_page_token"));
                } else {
                    this.d.remove("next_page_token");
                }
            }
        }
    }
}
