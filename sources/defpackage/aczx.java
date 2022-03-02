package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.udc.DeviceDataUploadOptInFlags;
import com.google.android.gms.udc.DeviceDataUploadOptedInAccountsParcelable;
import java.util.ArrayList;

/* renamed from: aczx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aczx extends aczm {
    public aczx(Context context, adbx adbx, ClientContext clientContext, String str) {
        super(context, adbx, clientContext, str, "GetDeviceDataUploadOptedInAccountsOperation");
        this.i = true;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        DeviceDataUploadOptInFlags deviceDataUploadOptInFlags;
        super.a(context);
        b();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        adaq.a(this.c);
        for (Account account : jgu.d(context, "com.google.android.gms")) {
            if (!azrk.f()) {
                adan a = new adao(this.c, account).a();
                if (a.a.c()) {
                    deviceDataUploadOptInFlags = aczw.a(this.c, account, a, this.j);
                } else {
                    Status status = a.a;
                    throw new nja(status.i, status.j);
                }
            } else {
                deviceDataUploadOptInFlags = adhm.a(adho.a.a(account));
            }
            if (deviceDataUploadOptInFlags.b) {
                arrayList2.add(account.name);
            }
            if (deviceDataUploadOptInFlags.a) {
                arrayList.add(account.name);
            }
        }
        a(0);
        this.d.a(Status.a, new DeviceDataUploadOptedInAccountsParcelable(arrayList, arrayList2));
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
        a(status.i);
        this.d.a(status, (DeviceDataUploadOptedInAccountsParcelable) null);
    }
}
