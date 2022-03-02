package defpackage;

import android.view.View;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.googlehelp.contact.ContactOptionsContainer;

/* renamed from: obc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class obc implements View.OnClickListener {
    private final ContactOptionsContainer a;

    public obc(ContactOptionsContainer contactOptionsContainer) {
        this.a = contactOptionsContainer;
    }

    public void onClick(View view) {
        ContactOptionsContainer contactOptionsContainer = this.a;
        FragmentManager fragmentManager = contactOptionsContainer.e.getFragmentManager();
        new oco().show(fragmentManager, ContactOptionsContainer.a);
        fragmentManager.executePendingTransactions();
        okg.b(contactOptionsContainer.e);
    }
}
