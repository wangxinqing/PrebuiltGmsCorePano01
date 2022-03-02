package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: lbo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lbo extends kyl implements kyu {
    public lbo(String str) {
        super(str, 4300000);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Bundle bundle, Object obj) {
        bundle.putLong(this.a, ((Long) obj).longValue());
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return Long.valueOf(bundle.getLong(this.a));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object c(DataHolder dataHolder, int i, int i2) {
        return Long.valueOf(dataHolder.a(this.a, i, i2));
    }
}
