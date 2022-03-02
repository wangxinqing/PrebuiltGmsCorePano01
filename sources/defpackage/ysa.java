package defpackage;

import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.plus.internal.model.people.PersonEntity;

/* renamed from: ysa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ysa extends jhi {
    final /* synthetic */ ilm b;

    public ysa(ilm ilm) {
        this.b = ilm;
    }

    /* renamed from: a */
    public final void onResponse(SafeParcelResponse safeParcelResponse) {
        ilk.a(this.b, (PersonEntity) safeParcelResponse.a(PersonEntity.CREATOR));
    }
}
