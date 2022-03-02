package defpackage;

import android.content.ContentValues;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;

/* renamed from: xez  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xez extends xex {
    /* access modifiers changed from: protected */
    public final int a() {
        return 2;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void b(ContentValues contentValues, Object obj) {
        Person.PhoneNumbers phoneNumbers = (Person.PhoneNumbers) obj;
    }

    /* access modifiers changed from: protected */
    public final void b(wmn wmn) {
    }

    public xez(xfb xfb) {
        super(xfb);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ String a(Object obj) {
        return ((Person.PhoneNumbers) obj).f;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ContentValues contentValues, Object obj) {
        Person.PhoneNumbers phoneNumbers = (Person.PhoneNumbers) obj;
        contentValues.put("value", phoneNumbers.f);
        contentValues.put("value2", phoneNumbers.b);
        contentValues.put("value_type", Integer.valueOf(xeg.a(phoneNumbers)));
        contentValues.put("custom_label", phoneNumbers.e);
        contentValues.putNull("affinity1");
        contentValues.putNull("affinity2");
        contentValues.putNull("affinity3");
        contentValues.putNull("affinity4");
        contentValues.putNull("affinity5");
        contentValues.putNull("logging_id");
        contentValues.putNull("logging_id2");
        contentValues.putNull("logging_id3");
        contentValues.putNull("logging_id4");
        contentValues.putNull("logging_id5");
    }

    /* access modifiers changed from: protected */
    public final void a(wmn wmn) {
        wmn.r++;
    }
}
