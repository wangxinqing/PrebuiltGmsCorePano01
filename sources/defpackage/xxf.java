package defpackage;

import android.app.Notification;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.R;
import java.util.HashSet;

/* renamed from: xxf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xxf {
    public static Notification a(Context context) {
        String string = context.getString(R.string.people_fsa_permission_denied_notification_title);
        String string2 = context.getString(R.string.people_fsa_permission_denied_notification_text);
        HashSet hashSet = new HashSet();
        hashSet.add("android.permission-group.CONTACTS");
        je jeVar = new je(context);
        jeVar.e(string);
        jeVar.b((CharSequence) string2);
        jeVar.b(17301642);
        jeVar.d(TextUtils.concat(new CharSequence[]{string, " ", string2}));
        jeVar.f = ixm.b.a(context, hashSet);
        jeVar.a(true);
        return jeVar.b();
    }
}
