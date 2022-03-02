package defpackage;

import com.google.android.gms.romanesco.restoresettings.ContactsRestoreContactsChimeraActivity;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: zws  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zws implements acvv {
    private final WeakReference a;

    public zws(ContactsRestoreContactsChimeraActivity contactsRestoreContactsChimeraActivity) {
        this.a = new WeakReference(contactsRestoreContactsChimeraActivity);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        List list = (List) obj;
        ContactsRestoreContactsChimeraActivity contactsRestoreContactsChimeraActivity = (ContactsRestoreContactsChimeraActivity) this.a.get();
        if (contactsRestoreContactsChimeraActivity != null) {
            if (contactsRestoreContactsChimeraActivity.p == 3) {
                zwl zwl = contactsRestoreContactsChimeraActivity.c;
                zwl.d = true;
                zwl.b = list;
            } else {
                zwl zwl2 = contactsRestoreContactsChimeraActivity.c;
                zwl2.c = true;
                zwl2.a = list;
            }
            contactsRestoreContactsChimeraActivity.e();
            contactsRestoreContactsChimeraActivity.a(list);
            contactsRestoreContactsChimeraActivity.a.a(false, list.size(), 2, contactsRestoreContactsChimeraActivity.p, false);
            contactsRestoreContactsChimeraActivity.a.a(true);
            if (contactsRestoreContactsChimeraActivity.o) {
                contactsRestoreContactsChimeraActivity.f.a(true);
            }
        }
    }
}
