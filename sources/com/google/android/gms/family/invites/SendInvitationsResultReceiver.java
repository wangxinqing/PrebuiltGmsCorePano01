package com.google.android.gms.family.invites;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SendInvitationsResultReceiver extends ResultReceiver {
    public static final /* synthetic */ int a = 0;
    private final WeakReference b;

    public SendInvitationsResultReceiver(Handler handler, WeakReference weakReference) {
        super(handler);
        this.b = weakReference;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        SendInvitationsChimeraActivity sendInvitationsChimeraActivity = (SendInvitationsChimeraActivity) this.b.get();
        if (sendInvitationsChimeraActivity != null && !sendInvitationsChimeraActivity.isFinishing()) {
            int i2 = bundle.getInt("result-code");
            Contact contact = (Contact) bundle.getParcelable("contact");
            if (i2 == 2) {
                sendInvitationsChimeraActivity.h();
            } else if (i2 == 3) {
                if (contact.b()) {
                    sendInvitationsChimeraActivity.a(contact.d, false);
                    if (sendInvitationsChimeraActivity.a(contact.d) < contact.h) {
                        return;
                    }
                }
                sendInvitationsChimeraActivity.b(contact);
            } else if (i2 == 4) {
                sendInvitationsChimeraActivity.a(contact);
            }
        }
    }
}
