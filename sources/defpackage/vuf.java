package defpackage;

import android.view.View;
import com.google.android.gms.nearby.sharing.Contact;

/* renamed from: vuf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vuf implements View.OnClickListener {
    private final vuk a;
    private final vuj b;
    private final Contact c;

    public vuf(vuk vuk, vuj vuj, Contact contact) {
        this.a = vuk;
        this.b = vuj;
        this.c = contact;
    }

    public void onClick(View view) {
        vuk vuk = this.a;
        vuj vuj = this.b;
        vuk.g.a(vuj.a, this.c);
    }
}
