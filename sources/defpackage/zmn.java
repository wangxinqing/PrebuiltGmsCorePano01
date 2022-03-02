package defpackage;

import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ActionTargetEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity;

/* renamed from: zmn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zmn {
    public final FavaDiagnosticsEntity a;
    public final FavaDiagnosticsEntity b;
    public final FavaDiagnosticsEntity c;
    public final ClientActionDataEntity d;
    public final ActionTargetEntity e;

    public zmn(FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2, FavaDiagnosticsEntity favaDiagnosticsEntity3, ClientActionDataEntity clientActionDataEntity, ActionTargetEntity actionTargetEntity) {
        this.a = favaDiagnosticsEntity;
        this.b = favaDiagnosticsEntity2;
        this.c = favaDiagnosticsEntity3;
        this.d = clientActionDataEntity;
        this.e = actionTargetEntity;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.a != null;
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.b != null;
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        return this.c != null;
    }
}
