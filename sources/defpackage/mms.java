package defpackage;

import com.google.android.gms.family.v2.model.ContactPerson;
import java.util.List;

/* renamed from: mms  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface mms {
    void b(ContactPerson contactPerson, ContactPerson.ContactMethod contactMethod);

    boolean b(ContactPerson contactPerson);

    List c(ContactPerson contactPerson);

    boolean e(ContactPerson contactPerson, ContactPerson.ContactMethod contactMethod);
}
