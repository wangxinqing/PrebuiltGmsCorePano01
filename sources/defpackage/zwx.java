package defpackage;

import android.widget.CompoundButton;
import com.google.android.gms.romanesco.restoresettings.ContactsRestoreDialogChimeraActivity;

/* renamed from: zwx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zwx implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ ContactsRestoreDialogChimeraActivity a;

    public zwx(ContactsRestoreDialogChimeraActivity contactsRestoreDialogChimeraActivity) {
        this.a = contactsRestoreDialogChimeraActivity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.e();
    }
}
