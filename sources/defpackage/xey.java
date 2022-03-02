package defpackage;

import android.content.ContentValues;
import com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.List;

/* renamed from: xey  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xey extends xex {
    private static final void a(ContentValues contentValues, Person.Emails emails) {
        contentValues.put("affinity1", Double.valueOf(xeg.a(emails.d, "emailAutocomplete")));
        contentValues.put("logging_id", xeg.b(emails.d, "emailAutocomplete"));
        contentValues.putNull("affinity2");
        contentValues.putNull("affinity3");
        contentValues.putNull("affinity4");
        contentValues.putNull("affinity5");
        contentValues.putNull("logging_id2");
        contentValues.putNull("logging_id3");
        contentValues.putNull("logging_id4");
        contentValues.putNull("logging_id5");
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void b(ContentValues contentValues, Object obj) {
        a(contentValues, (Person.Emails) obj);
    }

    public xey(xfb xfb) {
        super(xfb);
    }

    /* access modifiers changed from: protected */
    public final void b(wmn wmn) {
        wmn.q++;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ String a(Object obj) {
        return ((Person.Emails) obj).f;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ContentValues contentValues, Object obj) {
        Person.Emails emails = (Person.Emails) obj;
        contentValues.put("value", emails.f);
        contentValues.put("value_type", Integer.valueOf(xeg.a(emails)));
        contentValues.put("custom_label", emails.e);
        a(contentValues, emails);
        List list = emails.b;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Person.Emails.Certificates certificates = (Person.Emails.Certificates) list.get(i);
                Mergedpeoplemetadata mergedpeoplemetadata = certificates.b;
                if (mergedpeoplemetadata != null && mergedpeoplemetadata.j) {
                    contentValues.put("certificate_expiration_millis", Long.valueOf(certificates.c.d * 1000));
                    contentValues.put("certificate_status", certificates.c.b);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(wmn wmn) {
        wmn.p++;
    }
}
