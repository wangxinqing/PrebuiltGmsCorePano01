package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.appinvite.sms.SendSmsOperation;

/* renamed from: dxe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dxe {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    private final Intent f;

    public dxe(Context context) {
        this.f = IntentOperation.getStartIntent(context, SendSmsOperation.class, "com.google.android.gms.appinvite.intents.SEND_SMS");
    }

    public final Intent a() {
        if (TextUtils.isEmpty(this.a)) {
            throw new IllegalArgumentException("Phone number not set.");
        } else if (TextUtils.isEmpty(this.b)) {
            throw new IllegalArgumentException("Message not set.");
        } else if (!TextUtils.isEmpty(this.c)) {
            this.f.putExtra("phoneNumber", this.a);
            this.f.putExtra("message", this.b);
            this.f.putExtra("inviteId", this.c);
            this.f.putExtra("accountName", this.d);
            this.f.putExtra("opCode", this.e);
            return this.f;
        } else {
            throw new IllegalArgumentException("Invite id not set.");
        }
    }
}
