package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: lbn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lbn extends kyl {
    public lbn(String str) {
        super(str, 4300000);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Bundle bundle, Object obj) {
        bundle.putInt(this.a, ((Integer) obj).intValue());
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return Integer.valueOf(bundle.getInt(this.a));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object c(DataHolder dataHolder, int i, int i2) {
        return Integer.valueOf(dataHolder.b(this.a, i, i2));
    }
}
