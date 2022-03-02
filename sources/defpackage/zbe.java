package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.io.IOException;

/* renamed from: zbe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zbe extends zax {
    private final String a;
    private final String b;
    private final int c;
    private final String d;
    private final ytk e;
    private final String[] f;
    private final zav g;

    public zbe(String str, String str2, int i, String str3, ytk ytk, String[] strArr, zav zav) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = ytk;
        this.f = strArr;
        this.g = zav;
    }

    public final void a(Context context, yrr yrr) {
        try {
            this.g.a(context, this.b, this.c, this.d, this.a, this.f);
            this.e.a(0, (Bundle) null, (Bundle) null);
        } catch (UserRecoverableAuthException e2) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context, 0, e2.a(), 0));
            this.e.a(4, bundle, (Bundle) null);
        } catch (IOException e3) {
            if ("NetworkError".equals(e3.getMessage())) {
                this.e.a(7, (Bundle) null, (Bundle) null);
            } else {
                this.e.a(8, (Bundle) null, (Bundle) null);
            }
        } catch (eif e4) {
            this.e.a(4, (Bundle) null, (Bundle) null);
        }
    }
}
