package defpackage;

import android.database.Cursor;
import android.net.Uri;

/* renamed from: qsc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class qsc {
    static final String[] c = {"_id", "date_modified"};
    protected qsf d;

    /* access modifiers changed from: protected */
    public abstract Uri a();

    /* access modifiers changed from: protected */
    public final qse a(boolean z, boolean z2, Long l, Long l2, String str) {
        int i;
        if (!axvz.h()) {
            i = z ? 4 : 2;
        } else {
            i = z ? 3 : 1;
        }
        qsd a = qse.a();
        a.f = i;
        a.c = a();
        a.d = !z2 ? b() : c();
        a.a = l;
        if (l2 != null) {
            a.b = l2;
        }
        if (str != null) {
            a.e = str;
        }
        return a.a();
    }

    public final qsl b(Long l, Long l2) {
        boolean z;
        if (l2 != null) {
            z = true;
        } else {
            z = false;
        }
        Cursor a = this.d.a(a(z, true, l, l2, (String) null));
        if (a != null) {
            return new qsl(a);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract String[] b();

    /* access modifiers changed from: protected */
    public String[] c() {
        return c;
    }
}
