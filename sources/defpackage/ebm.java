package defpackage;

import android.content.Context;
import android.util.Log;

/* renamed from: ebm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ebm implements ebi {
    private final String a;

    public ebm(String str) {
        this.a = str;
    }

    public final void a(Context context, eaw eaw) {
        try {
            String str = this.a;
            if (!awhx.c()) {
                eaw.a.lock();
                context.getContentResolver().delete(ebd.b, "package_name=?", new String[]{str});
                eaw.a.unlock();
            }
        } catch (ebg e) {
            throw null;
        } catch (RuntimeException e2) {
            Log.e("ClearPendingStateOp", "Runtime exception while performing operation", e2);
            Log.wtf("ClearPendingStateOp", "Killing (on development devices) due to RuntimeException", e2);
        } catch (Throwable th) {
            eaw.a.unlock();
            throw th;
        }
    }
}
