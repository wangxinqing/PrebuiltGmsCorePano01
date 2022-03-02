package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.plus.internal.PlusSession;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import java.util.Set;

/* renamed from: ytv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ytv extends isy {
    private final PlusSession a;

    public static boolean b(Set set) {
        if (set == null || set.isEmpty()) {
            return false;
        }
        if (set.size() != 1 || !set.contains(new Scope("plus_one_placeholder_scope"))) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusService");
        if (queryLocalInterface instanceof ytu) {
            return (ytu) queryLocalInterface;
        }
        return new yts(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.plus.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.plus.internal.IPlusService";
    }

    public final int d() {
        return 12451000;
    }

    /* access modifiers changed from: protected */
    public final Bundle f() {
        Bundle a2 = this.a.a();
        a2.putStringArray("request_visible_actions", this.a.d);
        a2.putString("auth_package", this.a.f);
        return a2;
    }

    public final boolean g() {
        return b(this.s.a(ykq.a));
    }

    public ytv(Context context, Looper looper, ise ise, PlusSession plusSession, ica ica, icb icb) {
        super(context, looper, 2, ise, ica, icb);
        this.a = plusSession;
    }

    /* access modifiers changed from: protected */
    public final void a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0 && bundle != null && bundle.containsKey("loaded_person")) {
            PersonEntity.c(bundle.getByteArray("loaded_person"));
        }
        super.a(i, iBinder, bundle, i2);
    }
}
