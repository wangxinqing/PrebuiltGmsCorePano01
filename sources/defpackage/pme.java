package defpackage;

import android.content.res.Resources;
import android.provider.ContactsContract;

/* renamed from: pme  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pme extends pmc {
    public pme(Resources resources) {
        super(resources, "data1", "data2", "data3");
    }

    /* access modifiers changed from: protected */
    public final String a(Resources resources, int i, String str) {
        return ContactsContract.CommonDataKinds.Email.getTypeLabel(resources, i, str).toString();
    }

    /* access modifiers changed from: protected */
    public final void a(pnd pnd, long j, String str, int i, String str2, int i2) {
        boolean z;
        pnd pnd2 = pnd;
        if (pnd2.f != -1) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z, (Object) "contactId must be set");
        pmy.a(pnd2.a.b, str);
        pmz pmz = pnd2.c;
        pmz.a.put(Long.valueOf(j), pmw.a(pnd2.f, j, str, i, str2, i2));
    }
}
