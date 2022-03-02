package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: znj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class znj extends zni {
    private final List a;

    public final View a(int i, View view, ViewGroup viewGroup, boolean z) {
        return a(b(i), view, viewGroup, z);
    }

    /* access modifiers changed from: protected */
    public abstract View a(Object obj, View view, ViewGroup viewGroup, boolean z);

    public final Object b(int i) {
        return this.a.get(i);
    }

    public final int d() {
        return this.a.size();
    }

    public znj(Collection collection) {
        boolean z;
        if (collection == null) {
            this.a = Collections.emptyList();
            return;
        }
        boolean z2 = false;
        Integer num = 0;
        Integer valueOf = Integer.valueOf(collection.size());
        if (num.intValue() >= 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "rangeStart");
        iva.b(valueOf.intValue() <= collection.size() ? true : z2, "rangeEnd");
        int intValue = valueOf.intValue() - num.intValue();
        this.a = new ArrayList(intValue);
        for (Object next : collection) {
            if (num.intValue() > 0) {
                num = Integer.valueOf(num.intValue() - 1);
            } else {
                this.a.add(next);
                if (this.a.size() >= intValue) {
                    return;
                }
            }
        }
    }
}
