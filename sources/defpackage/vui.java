package defpackage;

import android.view.View;
import com.google.android.gms.nearby.sharing.Contact;

/* renamed from: vui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vui implements View.OnClickListener {
    private final vuj a;
    private final Contact b;

    public vui(vuj vuj, Contact contact) {
        this.a = vuj;
        this.b = contact;
    }

    public void onClick(View view) {
        vuj vuj = this.a;
        Contact contact = this.b;
        if (vuj.t.a(contact)) {
            vuj.t.g.b(contact);
            vuj.t.f.remove(Long.valueOf(contact.a));
            return;
        }
        vuj.t.g.a(contact);
        vuj.t.f.add(Long.valueOf(contact.a));
    }
}
