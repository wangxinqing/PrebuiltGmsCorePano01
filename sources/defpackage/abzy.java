package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.UserHandle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.ManagedAccountSetupInfo;
import com.google.android.gms.smartdevice.d2d.data.WorkProfilePayload;

/* renamed from: abzy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abzy {
    public final SharedPreferences a;
    public final abzs b;
    public final Context c;
    private final abzz d;

    public abzy(Context context, Handler handler) {
        abzs abzs = new abzs(context, handler);
        this.d = abzz.a(context);
        this.a = context.getSharedPreferences("SmartDevice.WorkProfile", 0);
        this.b = abzs;
        this.c = context;
    }

    public final acwa a() {
        UserHandle a2;
        acwi acwi;
        int b2 = this.d.b();
        acwa a3 = acws.a((Object) "");
        if (b2 == 4 && (a2 = this.d.a()) != null) {
            abzs abzs = this.b;
            acwd acwd = abzs.f;
            if (acwd == null) {
                acwd acwd2 = new acwd();
                abzs.f = acwd2;
                abzo abzo = new abzo(abzs, "smartdevice", acwd2);
                Context context = abzs.b;
                Intent intent = new Intent("com.google.android.gms.smartdevice.setup.accounts.AccountsService.START");
                intent.setPackage("com.google.android.gms");
                if (!context.bindServiceAsUser(intent, abzo, 1, a2)) {
                    abzs.a.d("Failed to bind to %s", a2);
                    acwd2.a((Exception) new ibr(new Status(10553)));
                }
                acwi = acwd2.a;
            } else {
                acwi = acwd.a;
            }
            a3 = acwi.a((acvz) new abzu(this)).a((acvz) new abzw());
            if (!azkf.c() && azkf.d()) {
                a3 = a3.a((acvz) new abzx());
            }
        }
        return a3.a((acvf) new abzv(this, b2));
    }

    public final acwa b() {
        String string = this.a.getString("name", (String) null);
        int i = 0;
        int a2 = anvt.a(this.a.getInt("managementMode", 0));
        String string2 = this.a.getString("sourceId", (String) null);
        int i2 = a2 - 1;
        if (a2 != 0) {
            if (i2 == 1) {
                i = 1;
            } else if (i2 == 2) {
                i = 2;
            } else if (i2 == 3) {
                i = 3;
            } else if (i2 == 4) {
                i = 4;
            }
            return acws.a((Object) new ManagedAccountSetupInfo(string, i, string2));
        }
        throw null;
    }

    public final int c() {
        return this.d.b();
    }

    public final void a(WorkProfilePayload workProfilePayload) {
        this.a.edit().putString("name", workProfilePayload.b).putInt("managementMode", workProfilePayload.c).putString("sourceId", workProfilePayload.e).apply();
    }
}
