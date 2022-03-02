package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.udc.UdcSettingsListActivityRequest;
import java.io.IOException;

/* renamed from: adaa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adaa extends aczm {
    private final UdcSettingsListActivityRequest a;

    public adaa(Context context, adbx adbx, ClientContext clientContext, String str, UdcSettingsListActivityRequest udcSettingsListActivityRequest) {
        super(context, adbx, clientContext, str, "GetSettingsListActivityIntentOperation");
        this.a = udcSettingsListActivityRequest;
    }

    public final void a(Context context) {
        Intent intent;
        super.a(context);
        if (azrr.b()) {
            addd.a().a();
        }
        b();
        if (!TextUtils.isEmpty(this.f)) {
            try {
                if (this.a.a()) {
                    if (adhk.a(this.a.a, c())) {
                        intent = adhu.a(this.c, this.f, this.a.a);
                        PendingIntent a2 = jhg.a(this.c, intent, 134217728);
                        a(0);
                        this.d.a(Status.a, a2);
                    }
                }
                intent = adhu.a(this.f);
                PendingIntent a22 = jhg.a(this.c, intent, 134217728);
                a(0);
                this.d.a(Status.a, a22);
            } catch (eif e) {
                throw new nja(4504, (String) null);
            } catch (IOException e2) {
                throw new nja(4505, (String) null);
            }
        } else {
            throw new nja(5, (String) null);
        }
    }

    public final void a(Status status) {
        a(status.i);
        this.d.a(status, (PendingIntent) null);
    }
}
