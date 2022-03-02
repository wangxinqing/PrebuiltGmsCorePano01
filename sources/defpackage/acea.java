package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.smartdevice.notification.SerializableNotification;
import java.util.Random;

/* renamed from: acea  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acea {
    private static final iwd a = acqa.a("Utils", "NotificationUtils");

    public static void a(Context context, int i, String str) {
        CharSequence charSequence;
        CharSequence charSequence2;
        if (!TextUtils.isEmpty(str)) {
            charSequence2 = TextUtils.expandTemplate(context.getString(R.string.smartdevice_d2d_source_notification_title), new CharSequence[]{str});
            charSequence = TextUtils.expandTemplate(context.getResources().getQuantityString(R.plurals.smartdevice_d2d_source_notification_text, i), new CharSequence[]{str});
        } else {
            charSequence2 = context.getString(R.string.smartdevice_d2d_source_notification_generic_title);
            charSequence = context.getResources().getQuantityString(R.plurals.smartdevice_d2d_source_notification_generic_text, i);
        }
        boolean r = azlf.a.a().r();
        long j = !r ? 1800000 : 0;
        long n = azlf.a.a().n();
        a.a("Showing notification with duration %d", Long.valueOf(j));
        a.a("Delaying notification by %d", Long.valueOf(n));
        SerializableNotification serializableNotification = new SerializableNotification();
        serializableNotification.b = j;
        serializableNotification.c = n;
        serializableNotification.d = charSequence;
        serializableNotification.f = charSequence;
        serializableNotification.g = charSequence2;
        serializableNotification.e = Uri.parse(azlf.a.a().o());
        serializableNotification.h = !r;
        serializableNotification.k = false;
        serializableNotification.i = hdg.a(context, R.drawable.quantum_ic_google_white_24);
        serializableNotification.l = true;
        serializableNotification.j = charSequence2;
        iwq a2 = iwq.a(context);
        if (a2 != null) {
            acgc acgc = new acgc(a2, new jbs(context));
            int nextInt = new Random().nextInt();
            if (serializableNotification.b <= 86400000) {
                SerializableNotification a3 = SerializableNotification.a(serializableNotification);
                a3.a = System.currentTimeMillis();
                acgc.a("d2d", nextInt, a3);
                return;
            }
            throw new IllegalArgumentException("Notification cannot have max duration exceeding 1 day.");
        }
        throw null;
    }

    public static boolean b() {
        return abnb.a() == 0;
    }

    public static boolean a() {
        int a2 = abnb.a();
        return a2 == 0 || a2 == 1;
    }
}
