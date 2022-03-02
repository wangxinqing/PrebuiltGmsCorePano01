package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ActionTargetEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity;

/* renamed from: izq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class izq {
    public final Intent a;

    public izq(Context context) {
        this(new Intent("com.google.android.gms.plus.service.default.INTENT").putExtra("isLoggingIntent", true).setClassName(context, "com.google.android.gms.plus.service.DefaultIntentService"));
    }

    public final String a() {
        return this.a.getStringExtra("accountName");
    }

    public final FavaDiagnosticsEntity b() {
        return (FavaDiagnosticsEntity) this.a.getParcelableExtra("startView");
    }

    public final FavaDiagnosticsEntity c() {
        return (FavaDiagnosticsEntity) this.a.getParcelableExtra("endView");
    }

    public final FavaDiagnosticsEntity d() {
        return (FavaDiagnosticsEntity) this.a.getParcelableExtra("action");
    }

    public final Intent e() {
        iva.a((Object) a());
        iva.a((Object) b());
        if (d() == null) {
            iva.a((Object) c());
        } else if (c() == null) {
            iva.a((Object) d());
        }
        return this.a;
    }

    public final void a(FavaDiagnosticsEntity favaDiagnosticsEntity) {
        this.a.putExtra("action", favaDiagnosticsEntity);
    }

    public final void b(FavaDiagnosticsEntity favaDiagnosticsEntity) {
        this.a.putExtra("endView", favaDiagnosticsEntity);
    }

    public final void c(FavaDiagnosticsEntity favaDiagnosticsEntity) {
        this.a.putExtra("startView", favaDiagnosticsEntity);
    }

    public izq(Intent intent) {
        this.a = intent;
    }

    public final void a(ActionTargetEntity actionTargetEntity) {
        this.a.putExtra("actionTarget", actionTargetEntity);
    }

    public final void b(String str) {
        this.a.putExtra("callingPackage", str);
    }

    public final void c(String str) {
        if (str != null) {
            this.a.putExtra("plusPageId", str);
        }
    }

    public final void a(ClientActionDataEntity clientActionDataEntity) {
        this.a.putExtra("clientActionData", clientActionDataEntity);
    }

    public final void a(String str) {
        this.a.putExtra("accountName", str);
    }
}
