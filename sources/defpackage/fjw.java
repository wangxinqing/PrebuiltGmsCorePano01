package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: fjw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fjw {
    public static final iwd a = ehv.b("ChromeSyncApiHelper");
    public final Intent b;

    private fjw(Context context) {
        this.b = new Intent().setPackage(context.getPackageName()).putExtra("component_name", "auth_api_credentials");
    }

    public static fjw a(Context context) {
        return new fjw(context);
    }

    public final aorr b(pyv pyv) {
        hhy hhy = (hhy) hip.a().a(pyv.a());
        return hih.a(hhy, this.b, new fjs(hhy));
    }

    public final aorr a(pyv pyv) {
        hhy hhy = (hhy) hip.b().a(pyv.a());
        hhy hhy2 = (hhy) hip.a().a(pyv.a());
        if (((Boolean) fdf.a.c()).booleanValue()) {
            return aopr.a(aopr.a(aopr.a(a(pyv, (Set) anax.a("credentials_enable_sync", "credentials_enable_service", "credentials_need_first_time_welcome")), fji.a, (Executor) aoqm.a), fjn.a, (Executor) aoqm.a), (aoqb) new fjo(this, pyv, hhy2), (Executor) aoqm.a);
        }
        return aorl.c(qbc.a(hhy.b(this.b)), qbc.a(hhy2.b(this.b))).a(aoqf.a(), (Executor) aoqm.a);
    }

    public final aorr b(pyv pyv, hmj hmj) {
        hhy hhy = (hhy) hip.a().a(pyv.a());
        return qay.a(hih.a(hhy, this.b, new fjj(hhy, hmj)), (Object) hmj);
    }

    public final aorr a(pyv pyv, hmj hmj) {
        hhy hhy = (hhy) hip.a().a(pyv.a());
        return qay.a(hih.a(hhy, this.b, new fjv(hhy, hmj)), (Object) hmj);
    }

    public final aorr a(pyv pyv, hmk hmk) {
        hhy hhy = (hhy) hip.b().a(pyv.a());
        return qay.a(hih.a(hhy, this.b, new fjr(hhy, hmk)), (Object) hmk);
    }

    public final aorr a(pyv pyv, String str) {
        String a2 = hiq.a(str);
        iby a3 = ((hip) hip.a.b()).c.a(pyv.a());
        Bundle bundle = Bundle.EMPTY;
        iva.c(a2);
        amzy a4 = amzy.a((Object) a2);
        iva.a(a4.size());
        return aopr.a(aooz.a(qbc.a(a3.a((ihb) new hhs(a4, bundle))), ibr.class, fjt.a, (Executor) aoqm.a), (aoqb) new fju(this, a2, (hhy) hip.a().a(pyv.a())), (Executor) aoqm.a);
    }

    public final aorr a(pyv pyv, Set set) {
        hhy hhy = (hhy) hip.b().a(pyv.a());
        return aopr.a(hih.a(hhy, this.b, new fjp(hhy)), (amqy) new fjq(set), (Executor) aoqm.a);
    }
}
