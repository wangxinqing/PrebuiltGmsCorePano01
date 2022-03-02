package defpackage;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.GetServiceRequest;

/* renamed from: ivs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ivs implements iss {
    iwq a;
    private final Context b;
    private final jlm c;
    private final Object d = new Object();

    public ivs(Context context) {
        jlm jlm = new jlm(context);
        this.b = context;
        this.c = jlm;
    }

    public final ConnectionResult a(GetServiceRequest getServiceRequest, ConnectionInfo connectionInfo) {
        if (!jlm.b()) {
            return new ConnectionResult(0);
        }
        String c2 = axdg.a.a().c();
        if (TextUtils.isEmpty(c2)) {
            return new ConnectionResult(0);
        }
        for (String parseInt : amsk.a(',').a((CharSequence) c2)) {
            try {
                if (Integer.parseInt(parseInt) == getServiceRequest.b) {
                    return new ConnectionResult(0);
                }
            } catch (NumberFormatException e) {
                return new ConnectionResult(0);
            }
        }
        this.c.a(3);
        if (!axdg.a.a().b()) {
            return new ConnectionResult(6, this.c.a());
        }
        synchronized (this.d) {
            if (this.a == null) {
                iwq a2 = iwq.a(this.b);
                this.a = a2;
                if (a2 != null && jkr.e()) {
                    a2.a(new NotificationChannel("uncertified_device", "Play Protect", 4));
                }
            }
        }
        iwq iwq = this.a;
        String string = this.b.getResources().getString(R.string.play_protect_uncertified_device_notification_title);
        String string2 = this.b.getResources().getString(R.string.play_protect_uncertified_device_notification_content);
        if (iwq != null) {
            je jeVar = new je(this.b, "uncertified_device");
            jeVar.e(string);
            jeVar.b((CharSequence) string2);
            jeVar.b((int) R.drawable.quantum_ic_warning_googred_24);
            jeVar.u = this.b.getResources().getColor(R.color.play_protect_google_red500);
            jeVar.b(true);
            jd jdVar = new jd();
            jdVar.a((CharSequence) string2);
            jeVar.a((jh) jdVar);
            jeVar.j = 2;
            jeVar.f = this.c.a();
            iwq.a((int) R.id.play_protect_notification, jeVar.b());
        }
        return new ConnectionResult(9, (PendingIntent) null, string);
    }
}
