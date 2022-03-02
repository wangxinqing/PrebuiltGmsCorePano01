package defpackage;

import android.view.View;
import com.google.android.gms.family.v2.model.ContactPerson;

/* renamed from: mmm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mmm implements View.OnClickListener {
    private final mmr a;
    private final ContactPerson b;
    private final ContactPerson.ContactMethod c;

    public mmm(mmr mmr, ContactPerson contactPerson, ContactPerson.ContactMethod contactMethod) {
        this.a = mmr;
        this.b = contactPerson;
        this.c = contactMethod;
    }

    public void onClick(View view) {
        this.a.c(this.b, this.c);
    }
}
