package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsManager;
import com.google.android.cast.JGCastService;
import com.google.android.gms.family.invites.Contact;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mhe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mhe {
    private final mhd a;
    private final Context b;
    private int c = 0;

    public mhe(Context context, SmsManager smsManager) {
        this.b = context;
        this.a = new mhd(smsManager);
    }

    public final void a(List list, String str) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Contact contact = (Contact) list.get(i);
            mhd mhd = this.a;
            ArrayList<String> divideMessage = mhd.a.divideMessage(contact.e);
            ArrayList arrayList = new ArrayList();
            int size2 = divideMessage.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int size3 = divideMessage.size();
                Intent intent = new Intent("com.google.android.gms.family.invites");
                intent.setPackage(this.b.getPackageName());
                intent.putExtra("accountName", str);
                intent.putExtra("phone", contact.a);
                intent.putExtra("display-name", contact.b);
                intent.putExtra("invitation-id", contact.f);
                intent.putExtra("invitation-message", divideMessage.get(i2));
                intent.putExtra("contact-id", contact.d);
                intent.putExtra("num-messages", size3);
                Context context = this.b;
                int i3 = this.c;
                this.c = i3 + 1;
                arrayList.add(PendingIntent.getBroadcast(context, i3, intent, JGCastService.FLAG_PRIVATE_DISPLAY));
            }
            mhd mhd2 = this.a;
            String str2 = contact.a;
            SmsManager smsManager = mhd2.a;
            if (smsManager != null) {
                smsManager.sendMultipartTextMessage(str2, (String) null, divideMessage, arrayList, (ArrayList) null);
            } else {
                mfv.c("SmsSender", "SmsManager is null, can't send Text Messages", new Object[0]);
            }
        }
    }
}
