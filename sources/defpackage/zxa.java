package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.romanesco.restoresettings.ContactsRestoreDialogChimeraActivity;
import java.util.HashSet;

/* renamed from: zxa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zxa implements View.OnClickListener {
    final /* synthetic */ ContactsRestoreDialogChimeraActivity a;

    public zxa(ContactsRestoreDialogChimeraActivity contactsRestoreDialogChimeraActivity) {
        this.a = contactsRestoreDialogChimeraActivity;
    }

    public void onClick(View view) {
        ContactsRestoreDialogChimeraActivity contactsRestoreDialogChimeraActivity = this.a;
        if (!zyk.a((Context) contactsRestoreDialogChimeraActivity)) {
            contactsRestoreDialogChimeraActivity.c.setEnabled(false);
            contactsRestoreDialogChimeraActivity.d.c();
            return;
        }
        if (contactsRestoreDialogChimeraActivity.d.e()) {
            contactsRestoreDialogChimeraActivity.d.d();
        }
        HashSet hashSet = new HashSet();
        if (!zsm.a("android.permission.READ_CONTACTS")) {
            hashSet.add("android.permission.READ_CONTACTS");
        }
        if (!zsm.a("android.permission.WRITE_CONTACTS")) {
            hashSet.add("android.permission.WRITE_CONTACTS");
        }
        if (hashSet.isEmpty()) {
            contactsRestoreDialogChimeraActivity.f();
            return;
        }
        zsi.a().a(11);
        if (azfh.a.a().g()) {
            Activity containerActivity = contactsRestoreDialogChimeraActivity.getContainerActivity();
            String[] strArr = (String[]) hashSet.toArray(new String[0]);
            if (Build.VERSION.SDK_INT >= 23) {
                if (containerActivity instanceof fp) {
                    ((fp) containerActivity).aq();
                }
                containerActivity.requestPermissions(strArr, 0);
            } else if (containerActivity instanceof fo) {
                new Handler(Looper.getMainLooper()).post(new fn(strArr, containerActivity));
            }
        } else {
            akax.a(contactsRestoreDialogChimeraActivity.findViewById(16908290), (int) R.string.common_something_went_wrong, 0).c();
        }
    }
}
