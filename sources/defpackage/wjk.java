package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* renamed from: wjk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wjk {
    private static final jjg a = jjg.a(iyc.GUNS);

    public static boolean a(Context context, amek amek) {
        Intent intent;
        if (!wjp.a(amek)) {
            ((anih) a.b()).a("IntentPayload is not valid. %s", (Object) amek);
            intent = null;
        } else {
            intent = new Intent().setClassName(context.getApplicationContext(), amek.b).setAction(amek.c);
            aucx aucx = amek.e;
            int size = aucx.size();
            for (int i = 0; i < size; i++) {
                amem amem = (amem) aucx.get(i);
                if (!TextUtils.isEmpty(amem.a)) {
                    intent.putExtra(amem.a, amem.b);
                }
            }
            if ((amek.a & 8) != 0) {
                intent.setFlags(amek.f);
            }
        }
        if (intent != null) {
            try {
                int a2 = amep.a(amek.d);
                if (a2 == 0) {
                    a2 = 1;
                }
                int i2 = a2 - 1;
                if (i2 == 1) {
                    context.startActivity(intent);
                    return true;
                } else if (i2 == 2) {
                    context.startService(intent);
                    return true;
                } else if (i2 != 3) {
                    ((anih) a.b()).a("Unexpected intent type.");
                    return false;
                } else {
                    context.sendBroadcast(intent);
                    return true;
                }
            } catch (ActivityNotFoundException | IllegalStateException | SecurityException e) {
                anih anih = (anih) a.b();
                anih.a(e);
                anih.a("Failed to launch intent target.");
                return false;
            }
        } else {
            ((anih) a.b()).a("Failed to create intent target from payload.");
            return false;
        }
    }
}
