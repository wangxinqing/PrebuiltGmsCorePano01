package defpackage;

import android.view.View;
import com.google.android.gms.family.v2.model.ContactPerson;

/* renamed from: mmi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mmi implements View.OnClickListener {
    private final mmj a;
    private final ContactPerson b;
    private final ContactPerson.ContactMethod c;

    public mmi(mmj mmj, ContactPerson contactPerson, ContactPerson.ContactMethod contactMethod) {
        this.a = mmj;
        this.b = contactPerson;
        this.c = contactMethod;
    }

    public void onClick(View view) {
        mmj mmj = this.a;
        mmj.v.a.b(this.b, this.c);
    }
}
