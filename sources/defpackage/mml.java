package defpackage;

import android.view.View;
import com.google.android.gms.family.v2.invites.contactpicker.AutoCompleteTextView;
import com.google.android.gms.family.v2.model.ContactPerson;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: mml  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mml implements View.OnClickListener {
    private final mmr a;

    public mml(mmr mmr) {
        this.a = mmr;
    }

    public void onClick(View view) {
        mmr mmr = this.a;
        AutoCompleteTextView autoCompleteTextView = mmr.e;
        ContactPerson.ContactMethod a2 = AutoCompleteTextView.a(autoCompleteTextView.getText().toString().trim());
        if (a2 != null) {
            autoCompleteTextView.a(a2);
        }
        mmp mmp = mmr.j;
        amzt j = amzy.j();
        for (Map.Entry entry : mmr.b.entrySet()) {
            List list = ((mmq) entry.getValue()).a;
            if (!list.isEmpty()) {
                ContactPerson contactPerson = (ContactPerson) entry.getKey();
                ContactPerson contactPerson2 = new ContactPerson(contactPerson.a, contactPerson.b, contactPerson.c, contactPerson.e);
                contactPerson2.a(list);
                j.c(contactPerson2);
            }
        }
        Iterator it = mmr.c.iterator();
        while (it.hasNext()) {
            j.c(mmr.a((ContactPerson.ContactMethod) it.next()));
        }
        mmp.a(j.a());
    }
}
