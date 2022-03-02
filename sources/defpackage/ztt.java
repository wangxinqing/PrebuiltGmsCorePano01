package defpackage;

import android.content.ContentValues;
import android.content.res.Resources;
import android.provider.ContactsContract;

/* renamed from: ztt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ztt extends ztn {
    public ztt(Resources resources) {
        super(resources, "data1", "data2", "data3");
    }

    /* access modifiers changed from: protected */
    public final String a(Resources resources, int i, String str) {
        return ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources, i, str).toString();
    }

    /* access modifiers changed from: protected */
    public final void a(zuv zuv, long j, String str, int i, String str2, int i2) {
        boolean z;
        if (zuv.f != -1) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z, (Object) "contactId must be set");
        zuq.a(zuv.a.c, str);
        zut zut = zuv.d;
        long j2 = zuv.f;
        ContentValues contentValues = new ContentValues();
        contentValues.put("contact_id", Long.valueOf(j2));
        Long valueOf = Long.valueOf(j);
        contentValues.put("data_id", valueOf);
        contentValues.put("phone", str);
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("label", str2);
        contentValues.put("score", Integer.valueOf(i2));
        zut.a.put(valueOf, contentValues);
    }
}
