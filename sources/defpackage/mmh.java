package defpackage;

import android.view.View;
import com.google.android.gms.family.v2.model.ContactPerson;

/* renamed from: mmh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mmh implements View.OnClickListener {
    private final mmj a;
    private final ContactPerson b;

    public mmh(mmj mmj, ContactPerson contactPerson) {
        this.a = mmj;
        this.b = contactPerson;
    }

    public void onClick(View view) {
        mmj mmj = this.a;
        ContactPerson contactPerson = this.b;
        mmr mmr = (mmr) mmj.v.a;
        mmq mmq = (mmq) mmr.b.get(contactPerson);
        mmq.b = !mmq.b;
        mmr.k.K(mmr.a(contactPerson));
    }
}
