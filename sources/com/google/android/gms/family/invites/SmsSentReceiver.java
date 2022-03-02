package com.google.android.gms.family.invites;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class SmsSentReceiver extends nla {
    private final ResultReceiver a;

    public SmsSentReceiver(ResultReceiver resultReceiver) {
        super("family");
        this.a = resultReceiver;
    }

    public final void a(Context context, Intent intent) {
        if (!"com.google.android.gms.family.invites".equals(intent.getAction())) {
            mfv.f("SmsSentReceiver", "Intent action didn't match, ignoring", new Object[0]);
            return;
        }
        int resultCode = getResultCode();
        Contact contact = new Contact();
        contact.b = intent.getStringExtra("display-name");
        contact.a = intent.getStringExtra("phone");
        contact.f = intent.getStringExtra("invitation-id");
        contact.e = intent.getStringExtra("invitation-message");
        contact.d = intent.getIntExtra("contact-id", -1);
        contact.h = intent.getIntExtra("num-messages", 1);
        String valueOf = String.valueOf(intent.getStringExtra("invitation-id"));
        mfv.c("SmsSentReceiver", valueOf.length() == 0 ? new String("invitation id from intent:") : "invitation id from intent:".concat(valueOf), new Object[0]);
        String valueOf2 = String.valueOf(contact);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 39);
        sb.append("Received callback for sending sms for: ");
        sb.append(valueOf2);
        sb.toString();
        Bundle bundle = new Bundle();
        if (resultCode == -1) {
            int i = SendInvitationsResultReceiver.a;
            bundle.putInt("result-code", 4);
            bundle.putParcelable("contact", contact);
        } else {
            int i2 = SendInvitationsResultReceiver.a;
            bundle.putInt("result-code", 3);
            bundle.putParcelable("contact", contact);
        }
        this.a.send(-1, bundle);
    }
}
