package defpackage;

import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity;

/* renamed from: viv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class viv implements acvv {
    private final ContactSelectChimeraActivity a;

    public viv(ContactSelectChimeraActivity contactSelectChimeraActivity) {
        this.a = contactSelectChimeraActivity;
    }

    public final void a(Object obj) {
        ContactSelectChimeraActivity contactSelectChimeraActivity = this.a;
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            contactSelectChimeraActivity.f.findViewById(R.id.divider).setVisibility(8);
            contactSelectChimeraActivity.f.findViewById(R.id.reachable_contacts_explain_footer).setVisibility(8);
            contactSelectChimeraActivity.h.findViewById(R.id.reachable_contacts_description).setVisibility(8);
        } else {
            contactSelectChimeraActivity.f.findViewById(R.id.divider).setVisibility(0);
            contactSelectChimeraActivity.f.findViewById(R.id.reachable_contacts_explain_footer).setVisibility(0);
            contactSelectChimeraActivity.h.findViewById(R.id.reachable_contacts_description).setVisibility(0);
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            String quantityString = contactSelectChimeraActivity.getResources().getQuantityString(R.plurals.sharing_contact_select_unreachable_description, intValue, new Object[]{Integer.valueOf(intValue)});
            ((TextView) contactSelectChimeraActivity.f.findViewById(R.id.reachable_contacts_explain_footer)).setText(quantityString);
            ((TextView) contactSelectChimeraActivity.h.findViewById(R.id.reachable_contacts_description)).setText(quantityString);
        }
    }
}
