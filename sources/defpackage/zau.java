package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import com.google.android.gms.plus.service.DefaultChimeraIntentService;
import com.google.android.gms.plus.service.PlusChimeraService;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: zau  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zau extends irg {
    final /* synthetic */ PlusChimeraService a;
    private final String b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zau(PlusChimeraService plusChimeraService, String str, Context context) {
        super(context, 2, 70);
        this.a = plusChimeraService;
        this.b = str;
    }

    private final void a(itv itv, ClientContext clientContext, ClientContext clientContext2) {
        try {
            itv.a(0, PlusChimeraService.a(this.b, this.a, clientContext2, clientContext, new zas()), (Bundle) null);
        } catch (RemoteException e) {
        }
    }

    /* access modifiers changed from: protected */
    public final Set a() {
        return Collections.singleton("android.permission-group.CONTACTS");
    }

    /* access modifiers changed from: protected */
    public final void a(int i, itv itv, int i2, String str, String str2, String[] strArr, Bundle bundle, IBinder iBinder, String str3, String str4) {
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        String str5 = str3;
        bundle2.putString("auth_package", str5);
        super.a(i, itv, i2, str, str2, strArr, bundle2, iBinder, str5, str4);
    }

    /* access modifiers changed from: protected */
    public final void a(isv isv, GetServiceRequest getServiceRequest) {
        int i;
        String str;
        String str2;
        String[] strArr;
        String[] strArr2;
        isv isv2 = isv;
        GetServiceRequest getServiceRequest2 = getServiceRequest;
        if (getServiceRequest2.c > 0) {
            Scope[] scopeArr = getServiceRequest2.f;
            String[] a2 = scopeArr != null ? jkx.a(scopeArr) : null;
            Account account = getServiceRequest2.h;
            Account a3 = getServiceRequest.a();
            String str3 = getServiceRequest2.d;
            Bundle bundle = getServiceRequest2.g;
            String string = bundle.getString("com.google.android.gms.plus.internal.CALLING_PACKAGE_NAME");
            String str4 = string == null ? str3 : string;
            String string2 = bundle.getString("auth_package");
            if (this.a.getPackageName().equals(string2)) {
                PlusChimeraService.a();
            } else if (!str4.equals(string2)) {
                throw new SecurityException("invalid authPackage");
            }
            int callingUid = Binder.getCallingUid();
            if (Process.myUid() != Binder.getCallingUid()) {
                i = callingUid;
            } else {
                PlusChimeraService plusChimeraService = this.a;
                if (string2 != null) {
                    try {
                        i = plusChimeraService.getPackageManager().getPackageInfo(string2, 128).applicationInfo.uid;
                    } catch (PackageManager.NameNotFoundException e) {
                        i = 0;
                    }
                } else {
                    i = 0;
                }
            }
            String string3 = hya.a((Context) this.a).b(str4) ? bundle.getString("application_name") : "100";
            if (account != null) {
                str = account.name;
            } else {
                str = null;
            }
            if (a3 != null) {
                str2 = a3.name;
            } else {
                str2 = null;
            }
            ClientContext clientContext = new ClientContext(i, str, str2, str4, string2);
            clientContext.a(a2);
            if (bundle != null) {
                bundle.setClassLoader(PlusCommonExtras.class.getClassLoader());
                strArr = bundle.getStringArray("request_visible_actions");
            } else {
                strArr = null;
            }
            clientContext.h.clear();
            if (strArr != null && strArr.length > 0) {
                clientContext.h.addAll(Arrays.asList(strArr));
            }
            clientContext.a("application_name", string3);
            PlusCommonExtras.b(bundle).a(clientContext.i);
            ClientContext clientContext2 = new ClientContext(Process.myUid(), clientContext.a(), clientContext.b(), clientContext.e, this.a.getPackageName());
            clientContext2.a(zav.b);
            clientContext2.a(clientContext);
            Bundle bundle2 = getServiceRequest2.g;
            if (bundle2 == null) {
                strArr2 = null;
            } else if (bundle2.getBoolean("skip_oob", false)) {
                PlusChimeraService.a();
                a(isv2, clientContext, (ClientContext) null);
                return;
            } else {
                strArr2 = null;
            }
            if (ytv.b(new HashSet(Arrays.asList(getServiceRequest2.f)))) {
                Bundle bundle3 = getServiceRequest2.g;
                if (Process.myUid() == Binder.getCallingUid()) {
                    strArr2 = bundle3.getStringArray("required_features");
                }
                if (strArr2 == null) {
                    if (!yue.a(a2)) {
                        strArr2 = PlusChimeraService.b;
                    } else {
                        strArr2 = irx.r;
                    }
                }
                DefaultChimeraIntentService.a(this.a, new zck(clientContext2, clientContext, strArr2, isv, this.b, zav.a, irg.a(getServiceRequest), getServiceRequest2.b == 70));
                return;
            }
            a(isv2, clientContext, clientContext2);
            return;
        }
        throw new IllegalArgumentException("clientVersion too old");
    }
}
