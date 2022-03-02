package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.gms.romanesco.restoresettings.ContactsRestoreContactsChimeraActivity;
import com.google.android.gms.romanesco.restoresettings.FastScroller;

/* renamed from: zwp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zwp implements View.OnScrollChangeListener {
    final /* synthetic */ ContactsRestoreContactsChimeraActivity a;

    public zwp(ContactsRestoreContactsChimeraActivity contactsRestoreContactsChimeraActivity) {
        this.a = contactsRestoreContactsChimeraActivity;
    }

    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        ContactsRestoreContactsChimeraActivity contactsRestoreContactsChimeraActivity = this.a;
        FastScroller fastScroller = contactsRestoreContactsChimeraActivity.g;
        RecyclerView recyclerView = contactsRestoreContactsChimeraActivity.h;
        if (!fastScroller.d.isSelected()) {
            fastScroller.a(((float) fastScroller.getHeight()) * (((float) recyclerView.computeVerticalScrollOffset()) / (((float) recyclerView.computeVerticalScrollRange()) - ((float) fastScroller.getHeight()))));
        }
    }
}
